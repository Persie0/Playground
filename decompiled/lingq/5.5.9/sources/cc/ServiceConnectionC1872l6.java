package cc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import lb.C7297a;
import p115fb.RunnableC5493i;
import p115fb.RunnableC5494j;
import p176ib.AbstractC6251a;
import p176ib.C6272i;
import p289o5.RunnableC7933m;
import p289o5.RunnableC7943w;

/* JADX INFO: renamed from: cc.l6 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1872l6 implements ServiceConnection, AbstractC6251a.a, AbstractC6251a.b {

    /* JADX INFO: renamed from: a */
    public volatile boolean f9982a;

    /* JADX INFO: renamed from: b */
    public volatile C1824g3 f9983b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1881m6 f9984c;

    public ServiceConnectionC1872l6(C1881m6 c1881m6) {
        this.f9984c = c1881m6;
    }

    @Override // p176ib.AbstractC6251a.a
    /* JADX INFO: renamed from: a */
    public final void mo5741a() {
        C6272i.m12911e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C6272i.m12915i(this.f9983b);
                InterfaceC1779b3 interfaceC1779b3 = (InterfaceC1779b3) this.f9983b.m12871C();
                C1879m4 c1879m4 = ((C1897o4) this.f9984c.f10430a).f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.m5753p(new RunnableC7933m(this, interfaceC1779b3, 6));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f9983b = null;
                this.f9982a = false;
            }
        }
    }

    @Override // p176ib.AbstractC6251a.a
    /* JADX INFO: renamed from: h */
    public final void mo5742h(int i10) {
        C6272i.m12911e("MeasurementServiceConnection.onConnectionSuspended");
        C1881m6 c1881m6 = this.f9984c;
        C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5623a("Service connection suspended");
        C1879m4 c1879m4 = ((C1897o4) c1881m6.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC7943w(7, this));
    }

    @Override // p176ib.AbstractC6251a.b
    /* JADX INFO: renamed from: j */
    public final void mo5743j(ConnectionResult connectionResult) {
        C6272i.m12911e("MeasurementServiceConnection.onConnectionFailed");
        C1860k3 c1860k3 = ((C1897o4) this.f9984c.f10430a).f10086i;
        if (c1860k3 == null || !c1860k3.f9672b) {
            c1860k3 = null;
        }
        if (c1860k3 != null) {
            c1860k3.f9945i.m5624b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f9982a = false;
            this.f9983b = null;
        }
        C1879m4 c1879m4 = ((C1897o4) this.f9984c.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC5493i(3, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6272i.m12911e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f9982a = false;
                C1860k3 c1860k3 = ((C1897o4) this.f9984c.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5623a("Service connected with null binder");
                return;
            }
            Object c1993z2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c1993z2 = iInterfaceQueryLocalInterface instanceof InterfaceC1779b3 ? (InterfaceC1779b3) iInterfaceQueryLocalInterface : new C1993z2(iBinder);
                    C1860k3 c1860k4 = ((C1897o4) this.f9984c.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9938I.m5623a("Bound to IMeasurementService interface");
                } else {
                    C1860k3 c1860k5 = ((C1897o4) this.f9984c.f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9942f.m5624b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                C1860k3 c1860k6 = ((C1897o4) this.f9984c.f10430a).f10086i;
                C1897o4.m5776k(c1860k6);
                c1860k6.f9942f.m5623a("Service connect failed to get IMeasurementService");
            }
            if (c1993z2 == null) {
                this.f9982a = false;
                try {
                    C7297a c7297aM14688b = C7297a.m14688b();
                    C1881m6 c1881m6 = this.f9984c;
                    c7297aM14688b.m14690c(((C1897o4) c1881m6.f10430a).f10076a, c1881m6.f10006c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C1879m4 c1879m4 = ((C1897o4) this.f9984c.f10430a).f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.m5753p(new RunnableC1888n4(this, 5, c1993z2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C6272i.m12911e("MeasurementServiceConnection.onServiceDisconnected");
        C1881m6 c1881m6 = this.f9984c;
        C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5623a("Service disconnected");
        C1879m4 c1879m4 = ((C1897o4) c1881m6.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC5494j(this, componentName, 6));
    }
}
