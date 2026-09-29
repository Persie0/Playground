package com.facebook.login;

import dm.C5207g;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m13365d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "", "toString", "targetApp", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "FACEBOOK", "INSTAGRAM", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String targetApp;

    /* JADX INFO: renamed from: com.facebook.login.LoginTargetApp$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        INSTANCE.getClass();
        LoginTargetApp[] loginTargetAppArrValuesCustom = valuesCustom();
        int length = loginTargetAppArrValuesCustom.length;
        int i10 = 0;
        while (i10 < length) {
            LoginTargetApp loginTargetApp = loginTargetAppArrValuesCustom[i10];
            i10++;
            if (C5207g.m11106a(loginTargetApp.toString(), str)) {
                return loginTargetApp;
            }
        }
        return FACEBOOK;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LoginTargetApp[] valuesCustom() {
        LoginTargetApp[] loginTargetAppArrValuesCustom = values();
        return (LoginTargetApp[]) Arrays.copyOf(loginTargetAppArrValuesCustom, loginTargetAppArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
