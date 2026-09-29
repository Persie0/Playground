package com.facebook.login;

import p000.ak5;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final ak5 Companion = new ak5();
    private final String targetApp;

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        Companion.getClass();
        for (LoginTargetApp loginTargetApp : values()) {
            if (fa4.m11650l(loginTargetApp.toString(), str)) {
                return loginTargetApp;
            }
        }
        return FACEBOOK;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
