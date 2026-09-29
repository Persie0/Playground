package p000;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;

/* JADX INFO: loaded from: classes2.dex */
public final class fj5 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f39194c = 0;

    /* JADX INFO: renamed from: a */
    public final long f39195a;

    /* JADX INFO: renamed from: b */
    public final LogEventDropped$Reason f39196b;

    static {
        LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.REASON_UNKNOWN;
    }

    public fj5(long j, LogEventDropped$Reason logEventDropped$Reason) {
        this.f39195a = j;
        this.f39196b = logEventDropped$Reason;
    }

    /* JADX INFO: renamed from: a */
    public final long m11890a() {
        return this.f39195a;
    }

    /* JADX INFO: renamed from: b */
    public final LogEventDropped$Reason m11891b() {
        return this.f39196b;
    }
}
