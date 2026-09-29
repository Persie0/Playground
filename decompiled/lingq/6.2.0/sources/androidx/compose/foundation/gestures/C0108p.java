package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.fb2;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0108p implements fb2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fb2 f2301a;

    /* JADX INFO: renamed from: b */
    public boolean f2302b;

    /* JADX INFO: renamed from: c */
    public boolean f2303c;

    /* JADX INFO: renamed from: d */
    public final C3248a f2304d = new C3248a();

    public C0108p(fb2 fb2Var) {
        this.f2301a = fb2Var;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f2301a.mo901B(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f2301a.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f2301a.mo903F0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f2301a.mo904N(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f2301a.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return this.f2301a.mo906W(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f2301a.mo594a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m907b(ContinuationImpl continuationImpl) throws Throwable {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        if (continuationImpl instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) continuationImpl;
            int i = pressGestureScopeImpl$awaitRelease$1.f2029c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.f2029c = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuationImpl);
            }
        } else {
            pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuationImpl);
        }
        Object objM911f = pressGestureScopeImpl$awaitRelease$1.f2027a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pressGestureScopeImpl$awaitRelease$1.f2029c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM911f);
            pressGestureScopeImpl$awaitRelease$1.f2029c = 1;
            objM911f = m911f(pressGestureScopeImpl$awaitRelease$1);
            if (objM911f == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM911f);
        }
        if (((Boolean) objM911f).booleanValue()) {
            return xfa.f68157a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    /* JADX INFO: renamed from: c */
    public final void m908c() {
        this.f2303c = true;
        C3248a c3248a = this.f2304d;
        if (c3248a.m15596i()) {
            c3248a.mo4387b(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m909d() {
        this.f2302b = true;
        C3248a c3248a = this.f2304d;
        if (c3248a.m15596i()) {
            c3248a.mo4387b(null);
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f2301a.mo597d0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m910e(ContinuationImpl continuationImpl) throws Throwable {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i = pressGestureScopeImpl$reset$1.f2032c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.f2032c = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
            }
        } else {
            pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
        }
        Object obj = pressGestureScopeImpl$reset$1.f2030a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pressGestureScopeImpl$reset$1.f2032c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            pressGestureScopeImpl$reset$1.f2032c = 1;
            if (this.f2304d.mo4388c(pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f2302b = false;
        this.f2303c = false;
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m911f(ContinuationImpl continuationImpl) throws Throwable {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i = pressGestureScopeImpl$tryAwaitRelease$1.f2035c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.f2035c = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
            }
        } else {
            pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f2033a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pressGestureScopeImpl$tryAwaitRelease$1.f2035c;
        C3248a c3248a = this.f2304d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (!this.f2302b && !this.f2303c) {
                pressGestureScopeImpl$tryAwaitRelease$1.f2035c = 1;
                if (c3248a.mo4388c(pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(this.f2302b);
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        c3248a.mo4387b(null);
        return Boolean.valueOf(this.f2302b);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f2301a.mo912g0(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f2301a.mo913q0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f2301a.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f2301a.mo915v(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f2301a.mo916w0(f);
    }
}
