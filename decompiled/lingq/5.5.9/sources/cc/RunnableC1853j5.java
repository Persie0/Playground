package cc;

import android.os.Bundle;

/* JADX INFO: renamed from: cc.j5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1853j5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f9921c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f9922d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f9923e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f9924f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f9925g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f9926h = null;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1934s5 f9927i;

    public RunnableC1853j5(C1934s5 c1934s5, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f9927i = c1934s5;
        this.f9919a = str;
        this.f9920b = str2;
        this.f9921c = j10;
        this.f9922d = bundle;
        this.f9923e = z10;
        this.f9924f = z11;
        this.f9925g = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9927i.m5873q(this.f9919a, this.f9920b, this.f9921c, this.f9922d, this.f9923e, this.f9924f, this.f9925g, this.f9926h);
    }
}
