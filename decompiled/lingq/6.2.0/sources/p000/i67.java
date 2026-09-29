package p000;

import android.os.Trace;
import androidx.collection.AbstractC0042e;
import androidx.compose.runtime.C0283j;
import androidx.compose.runtime.PausedCompositionState;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class i67 {

    /* JADX INFO: renamed from: a */
    public final pf1 f43594a;

    /* JADX INFO: renamed from: b */
    public final kf1 f43595b;

    /* JADX INFO: renamed from: c */
    public final tj3 f43596c;

    /* JADX INFO: renamed from: d */
    public final zi3 f43597d;

    /* JADX INFO: renamed from: e */
    public final boolean f43598e;

    /* JADX INFO: renamed from: f */
    public final AbstractC3517r f43599f;

    /* JADX INFO: renamed from: g */
    public final Object f43600g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f43601h = new AtomicReference(PausedCompositionState.InitialPending);

    /* JADX INFO: renamed from: i */
    public long f43602i = r46.m20393t();

    /* JADX INFO: renamed from: j */
    public AbstractC0042e f43603j;

    /* JADX INFO: renamed from: k */
    public final v48 f43604k;

    /* JADX INFO: renamed from: l */
    public final C0283j f43605l;

    public i67(pf1 pf1Var, kf1 kf1Var, tj3 tj3Var, q66 q66Var, zi3 zi3Var, boolean z, AbstractC3517r abstractC3517r, Object obj) {
        this.f43594a = pf1Var;
        this.f43595b = kf1Var;
        this.f43596c = tj3Var;
        this.f43597d = zi3Var;
        this.f43598e = z;
        this.f43599f = abstractC3517r;
        this.f43600g = obj;
        o66 o66Var = pm8.f56484a;
        o66Var.getClass();
        this.f43603j = o66Var;
        v48 v48Var = new v48();
        v48Var.m23105i(q66Var, tj3Var.m22085C());
        this.f43604k = v48Var;
        this.f43605l = new C0283j(abstractC3517r.f58433b);
    }

    /* JADX INFO: renamed from: a */
    public final void m13697a() throws Exception {
        AtomicReference atomicReference = this.f43601h;
        try {
            switch (h67.f41839a[((PausedCompositionState) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    m13698b();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            hi7.m13279b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13698b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f43600g) {
                try {
                    this.f43605l.m1299b(this.f43599f, this.f43604k);
                    this.f43604k.m23102e();
                    this.f43604k.m23103f();
                    this.f43604k.m23101d();
                    this.f43594a.f56031L = null;
                } catch (Throwable th) {
                    this.f43604k.m23101d();
                    this.f43594a.f56031L = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13699c() {
        return ((PausedCompositionState) this.f43601h.get()).compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m13700d() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f43601h;
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        hi7.m13279b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x00ff, B:54:0x010e, B:55:0x0111, B:56:0x0115, B:62:0x013d, B:64:0x0145, B:59:0x011c, B:61:0x0122, B:69:0x0150, B:70:0x0153, B:28:0x007f, B:52:0x0104), top: B:77:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[Catch: Exception -> 0x0023, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x00ff, B:54:0x010e, B:55:0x0111, B:56:0x0115, B:62:0x013d, B:64:0x0145, B:59:0x011c, B:61:0x0122, B:69:0x0150, B:70:0x0153, B:28:0x007f, B:52:0x0104), top: B:77:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #2 {Exception -> 0x0023, blocks: (B:3:0x0002, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x003d, B:16:0x003e, B:17:0x0045, B:18:0x0046, B:19:0x0050, B:20:0x0051, B:21:0x0055, B:27:0x007d, B:29:0x008d, B:30:0x0093, B:36:0x00bb, B:38:0x00c3, B:33:0x009a, B:35:0x00a0, B:40:0x00c9, B:41:0x00cf, B:43:0x00d5, B:46:0x00dc, B:47:0x00f7, B:24:0x005c, B:26:0x0062, B:51:0x00ff, B:54:0x010e, B:55:0x0111, B:56:0x0115, B:62:0x013d, B:64:0x0145, B:59:0x011c, B:61:0x0122, B:69:0x0150, B:70:0x0153, B:28:0x007f, B:52:0x0104), top: B:77:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:30:0x0093->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final boolean m13701e(j69 j69Var) throws Exception {
        long j;
        PausedCompositionState pausedCompositionState;
        PausedCompositionState pausedCompositionState2;
        AtomicReference atomicReference = this.f43601h;
        try {
            int i = h67.f41839a[((PausedCompositionState) atomicReference.get()).ordinal()];
            pf1 pf1Var = this.f43594a;
            kf1 kf1Var = this.f43595b;
            switch (i) {
                case 1:
                    tj3 tj3Var = this.f43596c;
                    boolean z = this.f43598e;
                    if (z) {
                        tj3Var.f62412z = 0;
                        tj3Var.f62411y = true;
                    }
                    try {
                        this.f43603j = kf1Var.mo1223b(pf1Var, j69Var, this.f43597d);
                        if (z) {
                            tj3Var.m22144v();
                        }
                        PausedCompositionState pausedCompositionState3 = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState4 = PausedCompositionState.RecomposePending;
                        while (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                hi7.m13279b("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                                if (this.f43603j.m724b()) {
                                    m13700d();
                                }
                                return m13699c();
                            }
                        }
                        if (this.f43603j.m724b()) {
                            m13700d();
                        }
                        return m13699c();
                    } catch (Throwable th) {
                        if (z) {
                            tj3Var.m22144v();
                        }
                        throw th;
                    }
                case 2:
                    PausedCompositionState pausedCompositionState5 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState6 = PausedCompositionState.Recomposing;
                    try {
                        while (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                            if (atomicReference.get() != pausedCompositionState5) {
                                hi7.m13279b("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                                j = this.f43602i;
                                this.f43602i = r46.m20393t();
                                this.f43603j = kf1Var.mo1235n(pf1Var, j69Var, this.f43603j);
                                this.f43602i = j;
                                pausedCompositionState = PausedCompositionState.Recomposing;
                                pausedCompositionState2 = PausedCompositionState.RecomposePending;
                                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                    if (atomicReference.get() != pausedCompositionState) {
                                        hi7.m13279b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                                        if (this.f43603j.m724b()) {
                                            m13700d();
                                        }
                                        return m13699c();
                                    }
                                }
                                if (this.f43603j.m724b()) {
                                    m13700d();
                                }
                                return m13699c();
                            }
                        }
                        this.f43602i = r46.m20393t();
                        this.f43603j = kf1Var.mo1235n(pf1Var, j69Var, this.f43603j);
                        this.f43602i = j;
                        pausedCompositionState = PausedCompositionState.Recomposing;
                        pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                            if (atomicReference.get() != pausedCompositionState) {
                                hi7.m13279b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                                if (this.f43603j.m724b()) {
                                    m13700d();
                                }
                                return m13699c();
                            }
                        }
                        if (this.f43603j.m724b()) {
                            m13700d();
                        }
                        return m13699c();
                    } catch (Throwable th2) {
                        this.f43602i = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                            if (atomicReference.get() != pausedCompositionState7) {
                                hi7.m13279b("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.f43602i;
                case 3:
                    cf1.m4606b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }
}
