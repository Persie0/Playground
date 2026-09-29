package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.input.nestedscroll.C0320d;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.dpa;
import p000.fa2;
import p000.l70;
import p000.mp7;
import p000.pj6;
import p000.qc9;
import p000.te1;
import p000.uea;
import p000.ui3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0259b extends fa2 implements pj6 {

    /* JADX INFO: renamed from: L */
    public boolean f3602L;

    /* JADX INFO: renamed from: M */
    public ui3 f3603M;

    /* JADX INFO: renamed from: N */
    public boolean f3604N;

    /* JADX INFO: renamed from: O */
    public mp7 f3605O;

    /* JADX INFO: renamed from: P */
    public float f3606P;

    /* JADX INFO: renamed from: Q */
    public final C0320d f3607Q = new C0320d(this, null);

    /* JADX INFO: renamed from: R */
    public final qc9 f3608R = AbstractC0278f.m1256f(0.0f);

    /* JADX INFO: renamed from: S */
    public final qc9 f3609S = AbstractC0278f.m1256f(0.0f);

    public C0259b(boolean z, ui3 ui3Var, boolean z2, mp7 mp7Var, float f) {
        this.f3602L = z;
        this.f3603M = ui3Var;
        this.f3604N = z2;
        this.f3605O = mp7Var;
        this.f3606P = f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: c1 */
    public static final Object m1191c1(C0259b c0259b, ContinuationImpl continuationImpl) throws Throwable {
        PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$1;
        c0259b.getClass();
        if (continuationImpl instanceof PullToRefreshModifierNode$animateToThreshold$1) {
            pullToRefreshModifierNode$animateToThreshold$1 = (PullToRefreshModifierNode$animateToThreshold$1) continuationImpl;
            int i = pullToRefreshModifierNode$animateToThreshold$1.f3583c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$animateToThreshold$1.f3583c = i - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(c0259b, continuationImpl);
            }
        } else {
            pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(c0259b, continuationImpl);
        }
        PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$2 = pullToRefreshModifierNode$animateToThreshold$1;
        Object obj = pullToRefreshModifierNode$animateToThreshold$2.f3581a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pullToRefreshModifierNode$animateToThreshold$2.f3583c;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                mp7 mp7Var = c0259b.f3605O;
                pullToRefreshModifierNode$animateToThreshold$2.f3583c = 1;
                Object objM744c = C0059a.m744c(mp7Var.f51704a, new Float(1.0f), null, null, pullToRefreshModifierNode$animateToThreshold$2, 14);
                if (objM744c != coroutineSingletons) {
                    objM744c = xfaVar;
                }
                if (objM744c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            if (c0259b.f34836I) {
                c0259b.m1196h1(c0259b.m1194f1());
                c0259b.m1197i1(c0259b.m1194f1());
            }
            return xfaVar;
        } catch (Throwable th) {
            if (!c0259b.f34836I) {
                throw th;
            }
            c0259b.m1196h1(c0259b.m1194f1());
            c0259b.m1197i1(c0259b.m1194f1());
            throw th;
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: P */
    public final long mo1183P(int i, long j) {
        if (!this.f3605O.f51704a.m746e() && this.f3604N && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return m1193e1(j);
        }
        return 0L;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        m11624Z0(this.f3607Q);
        wfb.m23926u(m9971N0(), null, null, new PullToRefreshModifierNode$onAttach$1(this, null), 3);
        m1197i1(this.f3602L ? m1194f1() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d1 */
    public final Object m1192d1(ContinuationImpl continuationImpl) throws Throwable {
        PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$1;
        if (continuationImpl instanceof PullToRefreshModifierNode$animateToHidden$1) {
            pullToRefreshModifierNode$animateToHidden$1 = (PullToRefreshModifierNode$animateToHidden$1) continuationImpl;
            int i = pullToRefreshModifierNode$animateToHidden$1.f3580c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$animateToHidden$1.f3580c = i - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, continuationImpl);
            }
        } else {
            pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, continuationImpl);
        }
        PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$2 = pullToRefreshModifierNode$animateToHidden$1;
        Object obj = pullToRefreshModifierNode$animateToHidden$2.f3578a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pullToRefreshModifierNode$animateToHidden$2.f3580c;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                mp7 mp7Var = this.f3605O;
                pullToRefreshModifierNode$animateToHidden$2.f3580c = 1;
                Object objM744c = C0059a.m744c(mp7Var.f51704a, new Float(0.0f), null, null, pullToRefreshModifierNode$animateToHidden$2, 14);
                if (objM744c != coroutineSingletons) {
                    objM744c = xfaVar;
                }
                if (objM744c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            m1196h1(0.0f);
            m1197i1(0.0f);
            return xfaVar;
        } catch (Throwable th) {
            m1196h1(0.0f);
            m1197i1(0.0f);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final long m1193e1(long j) {
        float fM19861h;
        float fM1194f1;
        if (this.f3602L) {
            fM19861h = 0.0f;
        } else {
            qc9 qc9Var = this.f3609S;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + qc9Var.m19861h();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fM19861h = fIntBitsToFloat - qc9Var.m19861h();
            m1196h1(fIntBitsToFloat);
            if (qc9Var.m19861h() * 0.5f <= m1194f1()) {
                fM1194f1 = qc9Var.m19861h() * 0.5f;
            } else {
                float fM15944g = l70.m15944g(Math.abs((qc9Var.m19861h() * 0.5f) / m1194f1()) - 1.0f, 0.0f, 2.0f);
                fM1194f1 = m1194f1() + (m1194f1() * (fM15944g - (((float) Math.pow(fM15944g, 2.0d)) / 4.0f)));
            }
            m1197i1(fM1194f1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM19861h)) & 4294967295L);
    }

    /* JADX INFO: renamed from: f1 */
    public final int m1194f1() {
        return te1.m21979L(this).f4327T.mo916w0(this.f3606P);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g1 */
    public final Object m1195g1(float f, ContinuationImpl continuationImpl) throws Throwable {
        PullToRefreshModifierNode$onRelease$1 pullToRefreshModifierNode$onRelease$1;
        if (continuationImpl instanceof PullToRefreshModifierNode$onRelease$1) {
            pullToRefreshModifierNode$onRelease$1 = (PullToRefreshModifierNode$onRelease$1) continuationImpl;
            int i = pullToRefreshModifierNode$onRelease$1.f3594d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onRelease$1.f3594d = i - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, continuationImpl);
            }
        } else {
            pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, continuationImpl);
        }
        Object obj = pullToRefreshModifierNode$onRelease$1.f3592b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pullToRefreshModifierNode$onRelease$1.f3594d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f3602L) {
                return new Float(0.0f);
            }
            qc9 qc9Var = this.f3609S;
            if (qc9Var.m19861h() * 0.5f > m1194f1()) {
                this.f3603M.mo0a();
            }
            if (qc9Var.m19861h() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            pullToRefreshModifierNode$onRelease$1.f3591a = f;
            pullToRefreshModifierNode$onRelease$1.f3594d = 1;
            if (m1192d1(pullToRefreshModifierNode$onRelease$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = pullToRefreshModifierNode$onRelease$1.f3591a;
            AbstractC3193b.m15359b(obj);
        }
        m1196h1(0.0f);
        return new Float(f);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m1196h1(float f) {
        this.f3609S.m19862i(f);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m1197i1(float f) {
        this.f3608R.m19862i(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.pj6
    /* JADX INFO: renamed from: p0 */
    public final Object mo1198p0(long j, Continuation continuation) throws Throwable {
        PullToRefreshModifierNode$onPreFling$1 pullToRefreshModifierNode$onPreFling$1;
        if (continuation instanceof PullToRefreshModifierNode$onPreFling$1) {
            pullToRefreshModifierNode$onPreFling$1 = (PullToRefreshModifierNode$onPreFling$1) continuation;
            int i = pullToRefreshModifierNode$onPreFling$1.f3590c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onPreFling$1.f3590c = i - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, (ContinuationImpl) continuation);
            }
        } else {
            pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, (ContinuationImpl) continuation);
        }
        Object objM1195g1 = pullToRefreshModifierNode$onPreFling$1.f3588a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pullToRefreshModifierNode$onPreFling$1.f3590c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM1195g1);
            float fM10572c = dpa.m10572c(j);
            pullToRefreshModifierNode$onPreFling$1.f3590c = 1;
            objM1195g1 = m1195g1(fM10572c, pullToRefreshModifierNode$onPreFling$1);
            if (objM1195g1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM1195g1);
        }
        return new dpa(uea.m22716a(0.0f, ((Number) objM1195g1).floatValue()));
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        if (this.f3605O.f51704a.m746e() || !this.f3604N || i != 1) {
            return 0L;
        }
        long jM1193e1 = m1193e1(j2);
        wfb.m23926u(m9971N0(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return jM1193e1;
    }
}
