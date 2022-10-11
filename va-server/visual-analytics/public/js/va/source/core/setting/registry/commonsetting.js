/* global _ */
(function () {
    'use strict';

    const root = this;
    const Brightics = root.Brightics;

    function CommonSetting(parentId, options) {
        Brightics.VA.Setting.BaseSetting.call(this, parentId, options);
    }

    CommonSetting.prototype = Object.create(Brightics.VA.Setting.BaseSetting.prototype);
    CommonSetting.prototype.constructor = CommonSetting;

    CommonSetting.prototype.initSettingId = function () {
        const currentLang = Brightics.VA.SettingStorage.getCurrentLanguage();

        this.SettingId = {
            scrollBar: 'common.scroll.indicate.mouseover',
            tmpLocale: currentLang
        }
    };

    CommonSetting.prototype.createContents = function ($parent) {
        Brightics.VA.Setting.BaseSetting.prototype.createContents.call(this, $parent);
        this.createScrollbarControl();
        this.createLocaleControl();
    };

    CommonSetting.prototype.createScrollbarControl = function () {
        this.$scrollbarControl = this._createCheckBox(this.$mainControl, {
            settingId: this.getSettingId('scrollBar'),
            label: 'Show scroll bar only when the mouse is over on scrollable area. (Show always when unchecked)'
        });
    };


    CommonSetting.prototype.createLocaleControl = function () {
        this.$localeControl = this._createDropDownList(this.$mainControl, {
            settingId: 'tmpLocale',
            label: 'Language : ',
            width: 100,
            list: ['한국어', 'English'],
            dropDownHeight: 100
        });
    };

    CommonSetting.prototype.render = function () {
        this.renderScrollbarControl();
        this.renderLocaleControl();
    };

    CommonSetting.prototype.renderScrollbarControl = function () {
        const _this = this;
        this.$scrollbarControl.find('.brtc-va-setting-checkbox-content').jqxCheckBox({
            checked: _this.getValue(_this.getSettingId('scrollBar')) == 'true'
        });
    };

    CommonSetting.prototype.renderLocaleControl = function () {
        const currentLang = Brightics.VA.SettingStorage.getCurrentLanguage();
        this.$localeControl.find('.brtc-va-setting-dropdownlist-content').jqxDropDownList('selectItem', currentLang === 'ko' ? '한국어' : 'English');
    };

    CommonSetting.prototype.getIndex = function () {
        return 1;
    };

    CommonSetting.Key = 'setting-common';
    CommonSetting.Label = 'Common';
    CommonSetting.index = 1;

    Brightics.VA.Setting.Registry[CommonSetting.Key] = CommonSetting;

}).call(this);