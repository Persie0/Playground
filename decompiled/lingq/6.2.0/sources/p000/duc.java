package p000;

import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class duc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f36252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1043b f36253c;

    public duc(C1043b c1043b, AtomicReference atomicReference, int i) {
        this.f36251a = i;
        switch (i) {
            case 1:
                this.f36252b = atomicReference;
                Objects.requireNonNull(c1043b);
                this.f36253c = c1043b;
                break;
            case 2:
                this.f36253c = c1043b;
                this.f36252b = atomicReference;
                break;
            default:
                this.f36252b = atomicReference;
                Objects.requireNonNull(c1043b);
                this.f36253c = c1043b;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36251a) {
            case 0:
                AtomicReference atomicReference = this.f36252b;
                synchronized (atomicReference) {
                    try {
                        try {
                            kjc kjcVar = (kjc) this.f36253c.f60774a;
                            atomicReference.set(Long.valueOf(kjcVar.f47436d.m4866L(kjcVar.m15289q().m21928J(), z8c.f71160c0)));
                            this.f36252b.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f36252b.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f36252b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            kjc kjcVar2 = (kjc) this.f36253c.f60774a;
                            atomicReference2.set(Double.valueOf(kjcVar2.f47436d.m4868N(kjcVar2.m15289q().m21928J(), z8c.f71166e0)));
                            this.f36252b.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.f36252b.notify();
                        throw th4;
                    }
                }
                return;
            default:
                v4d v4dVarM15287o = ((kjc) this.f36253c.f60774a).m15287o();
                zzoo zzooVarM5954r = zzoo.m5954r(zzls.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f36252b;
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new jo0(v4dVarM15287o, atomicReference3, v4dVarM15287o.m23119T(false), zzooVarM5954r, 10, false));
                return;
        }
    }
}
