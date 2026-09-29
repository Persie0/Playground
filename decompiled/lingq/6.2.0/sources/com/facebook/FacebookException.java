package com.facebook;

import com.facebook.internal.FeatureManager$Feature;
import java.security.SecureRandom;
import p000.C3440oy;
import p000.p13;
import p000.sy2;

/* JADX INFO: loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public static final SecureRandom f11354a = new SecureRandom();

    public FacebookException(String str) {
        super(str);
        if (str == null || !sy2.f61601q.get() || f11354a.nextInt(100) <= 50) {
            return;
        }
        p13.m18851a(new C3440oy(str, 14), FeatureManager$Feature.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
