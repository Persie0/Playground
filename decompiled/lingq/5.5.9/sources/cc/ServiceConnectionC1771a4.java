package cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractBinderC2681h0;
import com.google.android.gms.internal.measurement.C2667g0;
import com.google.android.gms.internal.measurement.InterfaceC2695i0;

/* JADX INFO: renamed from: cc.a4 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1771a4 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final String f9670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1780b4 f9671b;

    public ServiceConnectionC1771a4(C1780b4 c1780b4, String str) {
        this.f9671b = c1780b4;
        this.f9670a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1780b4 c1780b4 = this.f9671b;
        if (iBinder == null) {
            C1860k3 c1860k3 = c1780b4.f9684a.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = AbstractBinderC2681h0.f14222a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Object c2667g0 = iInterfaceQueryLocalInterface instanceof InterfaceC2695i0 ? (InterfaceC2695i0) iInterfaceQueryLocalInterface : new C2667g0(iBinder);
            if (c2667g0 == null) {
                C1860k3 c1860k4 = c1780b4.f9684a.f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9945i.m5623a("Install Referrer Service implementation was not found");
            } else {
                C1860k3 c1860k5 = c1780b4.f9684a.f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9938I.m5623a("Install Referrer Service connected");
                C1879m4 c1879m4 = c1780b4.f9684a.f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.m5753p(new RunnableC1994z3(0, this, c2667g0, this));
            }
        } catch (RuntimeException e10) {
            C1860k3 c1860k6 = c1780b4.f9684a.f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9945i.m5624b(e10, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1860k3 c1860k3 = this.f9671b.f9684a.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5623a("Install Referrer Service disconnected");
    }
}
