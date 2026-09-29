package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class e4d implements ServiceConnection, c90, d90 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f36708a;

    /* JADX INFO: renamed from: b */
    public volatile wbc f36709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v4d f36710c;

    public e4d(v4d v4dVar) {
        this.f36710c = v4dVar;
    }

    @Override // p000.c90
    /* JADX INFO: renamed from: h */
    public final void mo4404h() {
        tic ticVar = ((kjc) this.f36710c.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22072I();
        synchronized (this) {
            boolean z = false;
            try {
                lda.m16130p(this.f36709b);
                q9c q9cVar = (q9c) this.f36709b.m11611l();
                tic ticVar2 = ((kjc) this.f36710c.f60774a).f47439g;
                kjc.m15280l(ticVar2);
                ticVar2.m22076M(new kj3(this, q9cVar, z, 20));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f36709b = null;
                this.f36708a = false;
            }
        }
    }

    @Override // p000.d90
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        boolean z;
        v4d v4dVar = this.f36710c;
        tic ticVar = ((kjc) v4dVar.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22072I();
        xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
        if (xccVar == null || !xccVar.f54663b) {
            xccVar = null;
        }
        if (xccVar != null) {
            xccVar.f68076I.m17924b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            z = false;
            this.f36708a = false;
            this.f36709b = null;
        }
        tic ticVar2 = ((kjc) this.f36710c.f60774a).f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.m22076M(new gvb(this, connectionResult, z, 26));
    }

    @Override // p000.c90
    public final void onConnectionSuspended(int i) {
        kjc kjcVar = (kjc) this.f36710c.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22072I();
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68075H.m17923a("Service connection suspended");
        tic ticVar2 = kjcVar.f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.m22076M(new s3d(this, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tic ticVar = ((kjc) this.f36710c.f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22072I();
        synchronized (this) {
            if (iBinder == null) {
                this.f36708a = false;
                xcc xccVar = ((kjc) this.f36710c.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17923a("Service connected with null binder");
                return;
            }
            Object f9cVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    f9cVar = iInterfaceQueryLocalInterface instanceof q9c ? (q9c) iInterfaceQueryLocalInterface : new f9c(iBinder);
                    xcc xccVar2 = ((kjc) this.f36710c.f60774a).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68076I.m17923a("Bound to IMeasurementService interface");
                } else {
                    xcc xccVar3 = ((kjc) this.f36710c.f60774a).f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68080f.m17924b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                xcc xccVar4 = ((kjc) this.f36710c.f60774a).f47438f;
                kjc.m15280l(xccVar4);
                xccVar4.f68080f.m17923a("Service connect failed to get IMeasurementService");
            }
            if (f9cVar == null) {
                this.f36708a = false;
                try {
                    li1 li1VarM16230b = li1.m16230b();
                    v4d v4dVar = this.f36710c;
                    li1VarM16230b.m16232c(((kjc) v4dVar.f60774a).f47433a, v4dVar.f64865c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                tic ticVar2 = ((kjc) this.f36710c.f60774a).f47439g;
                kjc.m15280l(ticVar2);
                ticVar2.m22076M(new u62(12, this, f9cVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kjc kjcVar = (kjc) this.f36710c.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22072I();
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68075H.m17923a("Service disconnected");
        tic ticVar2 = kjcVar.f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.m22076M(new gvb(this, componentName, false, 24));
    }
}
