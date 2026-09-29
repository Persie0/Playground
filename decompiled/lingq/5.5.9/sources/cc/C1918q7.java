package cc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2882w0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: cc.q7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1918q7 implements InterfaceC1799d5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2882w0 f10158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f10159b;

    public C1918q7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2882w0 interfaceC2882w0) {
        this.f10159b = appMeasurementDynamiteService;
        this.f10158a = interfaceC2882w0;
    }

    @Override // cc.InterfaceC1799d5
    /* JADX INFO: renamed from: a */
    public final void mo5571a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f10158a.mo8157L(j10, bundle, str, str2);
        } catch (RemoteException e10) {
            C1897o4 c1897o4 = this.f10159b.f14599a;
            if (c1897o4 != null) {
                C1860k3 c1860k3 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5624b(e10, "Event listener threw exception");
            }
        }
    }
}
