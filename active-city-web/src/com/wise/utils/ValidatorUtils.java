package com.wise.utils;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.validator.GenericTypeValidator;
import org.apache.commons.validator.GenericValidator;
import org.springframework.beans.BeanWrapper;
import jp.co.sng.activecity.acdms.domain.model.entity.enums.LocaleEnum;
import jp.co.sng.activecity.acdms.domain.utils.StringUtil;

public class ValidatorUtils {

    /**
     * 半角英数字チェック
     * @param str
     * @return
     */
    public static boolean checkAlphaNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!CharUtils.isAsciiAlphanumeric(str.charAt(i))) {
              return false;
            }
          }
          return true;	}

    /**
     * 数字チェック
     * @param str
     * @return
     */
    public static boolean checkNumeric(String str) {
           // 数値存在チェック
        boolean isNumeric = true;
        for (int i = 0; i < str.length(); i++) {
          if (!CharUtils.isAsciiNumeric(str.charAt(i))) {
              isNumeric = false;
            break;
          }
        }
        return isNumeric;
    }
}
