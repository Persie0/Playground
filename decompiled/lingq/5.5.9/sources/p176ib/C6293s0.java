package p176ib;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: ib.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6293s0 extends AbstractC6267f0 {

    /* JADX INFO: renamed from: g */
    public final IBinder f36495g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC6251a f36496h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6293s0(AbstractC6251a abstractC6251a, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC6251a, i10, bundle);
        this.f36496h = abstractC6251a;
        this.f36495g = iBinder;
    }

    @Override // p176ib.AbstractC6267f0
    /* JADX INFO: renamed from: c */
    public final void mo12903c(ConnectionResult connectionResult) {
        AbstractC6251a abstractC6251a = this.f36496h;
        AbstractC6251a.b bVar = abstractC6251a.f36408P;
        if (bVar != null) {
            bVar.mo5743j(connectionResult);
        }
        abstractC6251a.m12873G(connectionResult);
    }

    @Override // p176ib.AbstractC6267f0
    /* JADX INFO: renamed from: d */
    public final boolean mo12904d() {
        IBinder iBinder = this.f36495g;
        try {
            C6272i.m12915i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC6251a abstractC6251a = this.f36496h;
            if (!abstractC6251a.mo5606D().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC6251a.mo5606D() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceMo5609w = abstractC6251a.mo5609w(iBinder);
            if (iInterfaceMo5609w == null || (!AbstractC6251a.m12869H(abstractC6251a, 2, 4, iInterfaceMo5609w) && !AbstractC6251a.m12869H(abstractC6251a, 3, 4, iInterfaceMo5609w))) {
                return false;
            }
            abstractC6251a.f36412T = null;
            AbstractC6251a.a aVar = abstractC6251a.f36407O;
            if (aVar != null) {
                aVar.mo5741a();
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
