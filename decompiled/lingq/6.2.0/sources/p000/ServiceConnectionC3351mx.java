package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: mx */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC3351mx implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51984a;

    /* JADX INFO: renamed from: b */
    public final Serializable f51985b;

    /* JADX INFO: renamed from: c */
    public final Object f51986c;

    public ServiceConnectionC3351mx() {
        this.f51984a = 0;
        this.f51985b = new AtomicBoolean(false);
        this.f51986c = new LinkedBlockingDeque();
    }

    /* JADX INFO: renamed from: b */
    private final void m17079b(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: a */
    public IBinder m17080a() throws InterruptedException {
        if (!((AtomicBoolean) this.f51985b).compareAndSet(false, true)) {
            C3386nv.m17633t("Binder already consumed");
            return null;
        }
        Object objTake = ((LinkedBlockingDeque) this.f51986c).take();
        objTake.getClass();
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f51984a) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.f51986c).put(iBinder);
                    } catch (InterruptedException unused) {
                        sy2 sy2Var = sy2.f61585a;
                        return;
                    }
                }
                break;
            default:
                ggc ggcVar = (ggc) this.f51986c;
                if (iBinder == null) {
                    xcc xccVar = ggcVar.f40788b.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17923a("Install Referrer connection returned with null binder");
                } else {
                    try {
                        int i = nqb.f53154f;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        oqb kqbVar = iInterfaceQueryLocalInterface instanceof oqb ? (oqb) iInterfaceQueryLocalInterface : new kqb(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 6);
                        kjc kjcVar = ggcVar.f40788b;
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68076I.m17923a("Install Referrer Service connected");
                        tic ticVar = kjcVar.f47439g;
                        kjc.m15280l(ticVar);
                        ticVar.m22076M(new gvb(this, kqbVar, this));
                    } catch (RuntimeException e) {
                        xcc xccVar3 = ggcVar.f40788b.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68083i.m17924b(e, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f51984a) {
            case 0:
                break;
            default:
                xcc xccVar = ((ggc) this.f51986c).f40788b.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17923a("Install Referrer Service disconnected");
                break;
        }
    }

    public ServiceConnectionC3351mx(ggc ggcVar, String str) {
        this.f51984a = 1;
        Objects.requireNonNull(ggcVar);
        this.f51986c = ggcVar;
        this.f51985b = str;
    }
}
