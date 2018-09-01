package com.publiccms.logic.component.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.publiccms.common.api.Config;
import com.publiccms.common.constants.CommonConstants;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.views.pojo.entities.ExtendField;

/**
 *
 * LoginConfigComponent 登录配置组件
 *
 */
@Component
public class LoginConfigComponent implements Config {
    /**
     * 
     */
    public static final String CONFIG_LOGIN_PATH = "login_path";
    /**
     * 
     */
    public static final String CONFIG_REGISTER_URL = "register_url";
    /**
     * 
     */
    public static final String CONFIG_EXPIRY_MINUTES_WEB = "expiry_minutes.web";
    /**
     * 
     */
    public static final String CONFIG_EXPIRY_MINUTES_MANAGER = "expiry_minutes.manager";
    /**
     * default expiry minutes
     */
    public static final int DEFAULT_EXPIRY_MINUTES = 30 * 24 * 60;

    @Override
    public List<ExtendField> getExtendFieldList(SysSite site, Locale locale) {
        List<ExtendField> extendFieldList = new ArrayList<>();
        extendFieldList.add(new ExtendField(CONFIG_REGISTER_URL, INPUTTYPE_TEXT, false, CONFIG_REGISTER_URL,
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_REGISTER_URL), null));
        extendFieldList.add(new ExtendField(CONFIG_LOGIN_PATH, INPUTTYPE_TEXT, false, CONFIG_LOGIN_PATH,
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_LOGIN_PATH), null));
        extendFieldList.add(new ExtendField(CONFIG_EXPIRY_MINUTES_WEB, INPUTTYPE_NUMBER, false, CONFIG_EXPIRY_MINUTES_WEB,
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_EXPIRY_MINUTES_WEB),
                String.valueOf(DEFAULT_EXPIRY_MINUTES)));
        extendFieldList.add(new ExtendField(CONFIG_EXPIRY_MINUTES_MANAGER, INPUTTYPE_NUMBER, false, CONFIG_EXPIRY_MINUTES_MANAGER,
                getMessage(locale, CONFIG_CODE_DESCRIPTION + CommonConstants.DOT + CONFIG_EXPIRY_MINUTES_MANAGER),
                String.valueOf(DEFAULT_EXPIRY_MINUTES)));
        return extendFieldList;
    }
}
