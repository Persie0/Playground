package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class osc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f54954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1043b f54955c;

    public osc(C1043b c1043b, AtomicReference atomicReference, int i) {
        this.f54953a = i;
        switch (i) {
            case 1:
                this.f54954b = atomicReference;
                Objects.requireNonNull(c1043b);
                this.f54955c = c1043b;
                break;
            case 2:
                this.f54954b = atomicReference;
                Objects.requireNonNull(c1043b);
                this.f54955c = c1043b;
                break;
            case 3:
                this.f54955c = c1043b;
                this.f54954b = atomicReference;
                break;
            default:
                this.f54954b = atomicReference;
                Objects.requireNonNull(c1043b);
                this.f54955c = c1043b;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54953a) {
            case 0:
                AtomicReference atomicReference = this.f54954b;
                synchronized (atomicReference) {
                    try {
                        try {
                            kjc kjcVar = (kjc) this.f54955c.f60774a;
                            atomicReference.set(Boolean.valueOf(kjcVar.f47436d.m4869O(kjcVar.m15289q().m21928J(), z8c.f71154a0)));
                            this.f54954b.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f54954b.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f54954b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            kjc kjcVar2 = (kjc) this.f54955c.f60774a;
                            atomicReference2.set(kjcVar2.f47436d.m4865K(kjcVar2.m15289q().m21928J(), z8c.f71157b0));
                            this.f54954b.notify();
                        } catch (Throwable th3) {
                            this.f54954b.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f54954b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            kjc kjcVar3 = (kjc) this.f54955c.f60774a;
                            atomicReference3.set(Integer.valueOf(kjcVar3.f47436d.m4867M(kjcVar3.m15289q().m21928J(), z8c.f71163d0)));
                            this.f54954b.notify();
                        } catch (Throwable th5) {
                            this.f54954b.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            default:
                C1043b c1043b = this.f54955c;
                qfc qfcVar = ((kjc) c1043b.f60774a).f47437e;
                kjc.m15278j(qfcVar);
                Bundle bundleM17688P = qfcVar.f57713I.m17688P();
                v4d v4dVarM15287o = ((kjc) c1043b.f60774a).m15287o();
                AtomicReference atomicReference4 = this.f54954b;
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new jo0(v4dVarM15287o, atomicReference4, v4dVarM15287o.m23119T(false), bundleM17688P, 9, false));
                return;
        }
    }
}
