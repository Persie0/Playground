package p152hb;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.internal.InterfaceC2556b;

/* JADX INFO: renamed from: hb.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6014u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectionResult f35601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6017v0 f35602b;

    public RunnableC6014u0(C6017v0 c6017v0, ConnectionResult connectionResult) {
        this.f35602b = c6017v0;
        this.f35601a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2556b interfaceC2556b;
        C6017v0 c6017v0 = this.f35602b;
        C6008s0 c6008s0 = (C6008s0) c6017v0.f35613f.f35451j.get(c6017v0.f35609b);
        if (c6008s0 == null) {
            return;
        }
        ConnectionResult connectionResult = this.f35601a;
        if (!connectionResult.m7529C()) {
            c6008s0.m12465o(connectionResult, null);
            return;
        }
        c6017v0.f35612e = true;
        C2542a.e eVar = c6017v0.f35608a;
        if (eVar.mo7553s()) {
            if (c6017v0.f35612e && (interfaceC2556b = c6017v0.f35610c) != null) {
                eVar.mo7541e(interfaceC2556b, c6017v0.f35611d);
            }
        } else {
            try {
                eVar.mo7541e(null, eVar.mo7540d());
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                eVar.mo7542f("Failed to get service from broker.");
                c6008s0.m12465o(new ConnectionResult(10), null);
            }
        }
    }
}
