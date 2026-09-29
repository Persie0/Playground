package cc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaw;
import p176ib.C6272i;
import p260m8.C7499b;

/* JADX INFO: renamed from: cc.f7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1819f7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f9806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1801d7 f9807c;

    public RunnableC1819f7(C1801d7 c1801d7, String str, Bundle bundle) {
        this.f9807c = c1801d7;
        this.f9805a = str;
        this.f9806b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1801d7 c1801d7 = this.f9807c;
        C1900o7 c1900o7M5645P = c1801d7.f9762a.m5645P();
        Bundle bundle = this.f9806b;
        C1846i7 c1846i7 = c1801d7.f9762a;
        ((C7499b) c1846i7.mo5514b()).getClass();
        zzaw zzawVarM5840p0 = c1900o7M5645P.m5840p0("_err", bundle, "auto", System.currentTimeMillis(), false);
        C6272i.m12915i(zzawVarM5840p0);
        c1846i7.m5651j(zzawVarM5840p0, this.f9805a);
    }
}
