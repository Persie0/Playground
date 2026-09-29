package p152hb;

import com.google.android.gms.common.api.C2542a;

/* JADX INFO: renamed from: hb.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6002q0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6005r0 f35577a;

    public RunnableC6002q0(C6005r0 c6005r0) {
        this.f35577a = c6005r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2542a.e eVar = this.f35577a.f35579a.f35582b;
        eVar.mo7542f(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
