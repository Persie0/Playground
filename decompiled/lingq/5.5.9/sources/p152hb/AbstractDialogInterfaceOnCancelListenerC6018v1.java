package p152hb;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.v1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC6018v1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    public volatile boolean f35614b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<C6009s1> f35615c;

    /* JADX INFO: renamed from: d */
    public final HandlerC9517f f35616d;

    /* JADX INFO: renamed from: e */
    public final C2548c f35617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogInterfaceOnCancelListenerC6018v1(InterfaceC5968f interfaceC5968f) {
        super(interfaceC5968f);
        C2548c c2548c = C2548c.f13920d;
        this.f35615c = new AtomicReference<>(null);
        this.f35616d = new HandlerC9517f(Looper.getMainLooper());
        this.f35617e = c2548c;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo7574d(int i10, int i11, Intent intent) {
        AtomicReference<C6009s1> atomicReference = this.f35615c;
        C6009s1 c6009s1 = atomicReference.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iM7588e = this.f35617e.m7588e(m7573b());
                if (iM7588e == 0) {
                    m12469l();
                    return;
                } else {
                    if (c6009s1 == null) {
                        return;
                    }
                    if (c6009s1.f35594b.f13857b == 18 && iM7588e == 18) {
                        return;
                    }
                }
            }
            if (c6009s1 != null) {
                atomicReference.set(null);
                mo12450j(c6009s1.f35594b, c6009s1.f35593a);
            }
        }
        if (i11 == -1) {
            m12469l();
            return;
        } else if (i11 == 0) {
            if (c6009s1 == null) {
                return;
            }
            ConnectionResult connectionResult = new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c6009s1.f35594b.toString());
            atomicReference.set(null);
            mo12450j(connectionResult, c6009s1.f35593a);
            return;
        }
        if (c6009s1 != null) {
            atomicReference.set(null);
            mo12450j(c6009s1.f35594b, c6009s1.f35593a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: e */
    public final void mo7575e(Bundle bundle) {
        if (bundle != null) {
            this.f35615c.set(bundle.getBoolean("resolving_error", false) ? new C6009s1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: g */
    public final void mo7577g(Bundle bundle) {
        C6009s1 c6009s1 = this.f35615c.get();
        if (c6009s1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c6009s1.f35593a);
        ConnectionResult connectionResult = c6009s1.f35594b;
        bundle.putInt("failed_status", connectionResult.f13857b);
        bundle.putParcelable("failed_resolution", connectionResult.f13858c);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo12450j(ConnectionResult connectionResult, int i10);

    /* JADX INFO: renamed from: k */
    public abstract void mo12451k();

    /* JADX INFO: renamed from: l */
    public final void m12469l() {
        this.f35615c.set(null);
        mo12451k();
    }

    /* JADX INFO: renamed from: m */
    public final void m12470m(ConnectionResult connectionResult, int i10) {
        boolean z10;
        C6009s1 c6009s1 = new C6009s1(connectionResult, i10);
        AtomicReference<C6009s1> atomicReference = this.f35615c;
        while (true) {
            if (atomicReference.compareAndSet(null, c6009s1)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            this.f35616d.post(new RunnableC6015u1(this, c6009s1));
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference<C6009s1> atomicReference = this.f35615c;
        C6009s1 c6009s1 = atomicReference.get();
        int i10 = c6009s1 == null ? -1 : c6009s1.f35593a;
        atomicReference.set(null);
        mo12450j(connectionResult, i10);
    }
}
