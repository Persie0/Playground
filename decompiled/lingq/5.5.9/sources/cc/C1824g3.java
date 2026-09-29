package cc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2549d;
import p176ib.AbstractC6251a;
import p176ib.AbstractC6260d;

/* JADX INFO: renamed from: cc.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1824g3 extends AbstractC6251a {
    public C1824g3(Context context, Looper looper, ServiceConnectionC1872l6 serviceConnectionC1872l6, ServiceConnectionC1872l6 serviceConnectionC1872l7) {
        super(context, looper, AbstractC6260d.m12896a(context), C2549d.f13922b, 93, serviceConnectionC1872l6, serviceConnectionC1872l7, null);
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 12451000;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1779b3 ? (InterfaceC1779b3) iInterfaceQueryLocalInterface : new C1993z2(iBinder);
    }
}
