package androidx.compose.p002ui.input.pointer;

import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.fb2;
import p000.hta;
import p000.kn1;
import p000.pg9;
import p000.sm0;
import p000.te1;
import p000.wfb;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0332f implements fb2, Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0333g f4131a;

    /* JADX INFO: renamed from: b */
    public final sm0 f4132b;

    /* JADX INFO: renamed from: c */
    public sm0 f4133c;

    /* JADX INFO: renamed from: d */
    public PointerEventPass f4134d = PointerEventPass.Main;

    /* JADX INFO: renamed from: e */
    public final EmptyCoroutineContext f4135e = EmptyCoroutineContext.f47685a;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0333g f4136f;

    public C0332f(C0333g c0333g, sm0 sm0Var) {
        this.f4136f = c0333g;
        this.f4131a = c0333g;
        this.f4132b = sm0Var;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f4131a.mo901B(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f4131a.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f4131a.mo903F0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f4131a.mo904N(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f4131a.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return f / this.f4131a.mo594a();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f4131a.mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final Object m1473b(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(baseContinuationImpl));
        sm0Var.m21468u();
        this.f4134d = pointerEventPass;
        this.f4133c = sm0Var;
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f4131a.mo597d0();
    }

    /* JADX INFO: renamed from: e */
    public final long m1474e() {
        C0333g c0333g = this.f4136f;
        long jMo902D0 = c0333g.mo902D0(te1.m21979L(c0333g).f4329V.mo13458d());
        long j = c0333g.f4147T;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo902D0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo902D0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: f */
    public final hta m1475f() {
        return te1.m21979L(this.f4136f).f4329V;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m1476g(long j, zi3 zi3Var, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        C0323x647a7347 c0323x647a7347;
        Throwable th;
        pg9 pg9Var;
        sm0 sm0Var;
        if (baseContinuationImpl instanceof C0323x647a7347) {
            c0323x647a7347 = (C0323x647a7347) baseContinuationImpl;
            int i = c0323x647a7347.f4106d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0323x647a7347.f4106d = i - Integer.MIN_VALUE;
            } else {
                c0323x647a7347 = new C0323x647a7347(this, baseContinuationImpl);
            }
        } else {
            c0323x647a7347 = new C0323x647a7347(this, baseContinuationImpl);
        }
        Object objInvoke = c0323x647a7347.f4104b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0323x647a7347.f4106d;
        if (i2 != 0) {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pg9Var = c0323x647a7347.f4103a;
            try {
                AbstractC3193b.m15359b(objInvoke);
                pg9Var.mo4537a(CancelTimeoutCancellationException.f4093a);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                pg9Var.mo4537a(CancelTimeoutCancellationException.f4093a);
                throw th;
            }
        }
        AbstractC3193b.m15359b(objInvoke);
        if (j <= 0 && (sm0Var = this.f4133c) != null) {
            sm0Var.resumeWith(new Result.Failure(new PointerEventTimeoutCancellationException(j)));
        }
        pg9 pg9VarM23926u = wfb.m23926u(this.f4136f.m9971N0(), null, null, new C0324xf3489d20(j, this, null), 3);
        try {
            c0323x647a7347.f4103a = pg9VarM23926u;
            c0323x647a7347.f4106d = 1;
            objInvoke = zi3Var.invoke(this, c0323x647a7347);
            if (objInvoke == obj) {
                return obj;
            }
            pg9Var = pg9VarM23926u;
            pg9Var.mo4537a(CancelTimeoutCancellationException.f4093a);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            pg9Var = pg9VarM23926u;
            pg9Var.mo4537a(CancelTimeoutCancellationException.f4093a);
            throw th;
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f4131a.mo594a() * f;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f4135e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m1477i(long j, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        C0325x2677a771 c0325x2677a771;
        if (continuationImpl instanceof C0325x2677a771) {
            c0325x2677a771 = (C0325x2677a771) continuationImpl;
            int i = c0325x2677a771.f4112c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0325x2677a771.f4112c = i - Integer.MIN_VALUE;
            } else {
                c0325x2677a771 = new C0325x2677a771(this, continuationImpl);
            }
        } else {
            c0325x2677a771 = new C0325x2677a771(this, continuationImpl);
        }
        Object obj = c0325x2677a771.f4110a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0325x2677a771.f4112c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                c0325x2677a771.f4112c = 1;
                Object objM1476g = m1476g(j, zi3Var, c0325x2677a771);
                return objM1476g == obj2 ? obj2 : objM1476g;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f4131a.mo913q0(j);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        C0333g c0333g = this.f4136f;
        synchronized (c0333g.f4144Q) {
            c0333g.f4143P.m24313k(this);
        }
        this.f4132b.resumeWith(obj);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f4131a.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f4131a.mo915v(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f4131a.mo916w0(f);
    }
}
