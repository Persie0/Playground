package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class e4c extends ifb {

    /* JADX INFO: renamed from: g */
    public final IBinder f36706g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ f90 f36707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4c(f90 f90Var, int i, IBinder iBinder, Bundle bundle) {
        super(f90Var, i, bundle);
        this.f36707h = f90Var;
        this.f36706g = iBinder;
    }

    @Override // p000.ifb
    /* JADX INFO: renamed from: a */
    public final boolean mo10847a() {
        IBinder iBinder = this.f36706g;
        try {
            lda.m16130p(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f90 f90Var = this.f36707h;
            if (!f90Var.mo3405m().equals(interfaceDescriptor)) {
                String strMo3405m = f90Var.mo3405m();
                Log.w("GmsClient", wq1.m24125u(new StringBuilder(strMo3405m.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strMo3405m, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceMo3402b = f90Var.mo3402b(iBinder);
            if (iInterfaceMo3402b == null || !(f90Var.m11615t(2, 4, iInterfaceMo3402b) || f90Var.m11615t(3, 4, iInterfaceMo3402b))) {
                return false;
            }
            f90Var.f38660u = null;
            c90 c90Var = f90Var.f38654o;
            if (c90Var == null) {
                return true;
            }
            c90Var.mo4404h();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p000.ifb
    /* JADX INFO: renamed from: b */
    public final void mo10848b(ConnectionResult connectionResult) {
        d90 d90Var = this.f36707h.f38655p;
        if (d90Var != null) {
            d90Var.onConnectionFailed(connectionResult);
        }
        System.currentTimeMillis();
    }
}
