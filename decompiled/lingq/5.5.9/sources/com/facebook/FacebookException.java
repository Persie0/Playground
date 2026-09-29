package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;
import kotlin.Metadata;
import p291o7.C8004n;
import p402u0.C9369l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11435a = 0;

    public FacebookException() {
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C8004n.m15878h() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.f11546a;
        FeatureManager.m6664a(new C9369l(3, str), FeatureManager.Feature.ErrorReport);
    }

    public FacebookException(String str, Exception exc) {
        super(str, exc);
    }

    public FacebookException(Throwable th2) {
        super(th2);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
