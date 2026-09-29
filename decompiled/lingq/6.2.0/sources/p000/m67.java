package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.privacy.consent.internal.ConsentState;

/* JADX INFO: loaded from: classes.dex */
public final class m67 {

    /* JADX INFO: renamed from: d */
    public static final sq5 f50666d;

    /* JADX INFO: renamed from: a */
    public final boolean f50667a;

    /* JADX INFO: renamed from: b */
    public final ConsentState f50668b;

    /* JADX INFO: renamed from: c */
    public final long f50669c;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f50666d = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "PayloadConsent");
    }

    public m67(boolean z, ConsentState consentState, long j) {
        this.f50667a = z;
        this.f50668b = consentState;
        this.f50669c = j;
    }
}
