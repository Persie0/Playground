package p152hb;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import java.util.concurrent.locks.Lock;
import p071dc.InterfaceC5147f;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5958c0 implements AbstractC2544c.a, AbstractC2544c.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5966e0 f35427a;

    public /* synthetic */ C5958c0(C5966e0 c5966e0) {
        this.f35427a = c5966e0;
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: b1 */
    public final void mo12397b1(Bundle bundle) {
        C5966e0 c5966e0 = this.f35427a;
        C6272i.m12915i(c5966e0.f35480r);
        InterfaceC5147f interfaceC5147f = c5966e0.f35473k;
        C6272i.m12915i(interfaceC5147f);
        interfaceC5147f.mo10920t(new BinderC5954b0(c5966e0));
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: h */
    public final void mo12398h(int i10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5980j
    /* JADX INFO: renamed from: j */
    public final void mo494j(ConnectionResult connectionResult) {
        C5966e0 c5966e0 = this.f35427a;
        Lock lock = c5966e0.f35464b;
        Lock lock2 = c5966e0.f35464b;
        lock.lock();
        try {
            if (c5966e0.f35474l && !connectionResult.m7530q()) {
                c5966e0.m12414h();
                c5966e0.m12419m();
            } else {
                c5966e0.m12417k(connectionResult);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }
}
