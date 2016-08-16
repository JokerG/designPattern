/*
 * Copyright (c) 2016 Allinpay Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.joker.observerpattern.base;

public class Enums {
  public enum YesOrNo {
    YES("Y", "是"), NO("N", "否");
    private final String code;
    private final String message;

    private YesOrNo(String code, String message) {
      this.code = code;
      this.message = message;
    }

    public String getCode() {
      return code;
    }

    public String getMessage() {
      return message;
    }

    @Override
    public String toString() {
      return String.valueOf(this.code + "-" + this.message);
    }
  }

  public enum WeekDay {
    ONE("星期一"), TWO("星期二"), THREE("星期三"), FOUR("星期四"), FIVE("星期五"), SIX("星期六"), SEVEN("星期日");
    private final String day;

    private WeekDay(String day) {
      this.day = day;
    }

    public String getDay() {
      return day;
    }

    @Override
    public String toString() {
      return String.valueOf(this.day);
    }
  }
}