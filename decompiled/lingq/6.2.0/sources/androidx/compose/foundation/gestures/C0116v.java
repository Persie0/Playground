package androidx.compose.foundation.gestures;

import android.view.ViewTreeObserver;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p002ui.input.nestedscroll.C0317a;
import androidx.compose.p002ui.input.nestedscroll.C0320d;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.lang.reflect.Method;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p000.C3386nv;
import p000.co8;
import p000.do8;
import p000.dpa;
import p000.gq6;
import p000.ho8;
import p000.kv4;
import p000.te1;
import p000.wn8;
import p000.x63;
import p000.xfa;
import p000.zi3;
import p000.zl8;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0116v {

    /* JADX INFO: renamed from: a */
    public do8 f2360a;

    /* JADX INFO: renamed from: b */
    public C0077c f2361b;

    /* JADX INFO: renamed from: c */
    public x63 f2362c;

    /* JADX INFO: renamed from: d */
    public Orientation f2363d;

    /* JADX INFO: renamed from: e */
    public boolean f2364e;

    /* JADX INFO: renamed from: f */
    public C0317a f2365f;

    /* JADX INFO: renamed from: g */
    public final C0115u f2366g;

    /* JADX INFO: renamed from: h */
    public final co8 f2367h;

    /* JADX INFO: renamed from: i */
    public boolean f2368i;

    /* JADX INFO: renamed from: j */
    public int f2369j = 1;

    /* JADX INFO: renamed from: k */
    public wn8 f2370k = AbstractC0110r.f2311b;

    /* JADX INFO: renamed from: l */
    public final ho8 f2371l = new ho8(this);

    /* JADX INFO: renamed from: m */
    public final kv4 f2372m = new kv4(this, 22);

    public C0116v(do8 do8Var, C0077c c0077c, x63 x63Var, Orientation orientation, boolean z, C0317a c0317a, C0115u c0115u, co8 co8Var) {
        this.f2360a = do8Var;
        this.f2361b = c0077c;
        this.f2362c = x63Var;
        this.f2363d = orientation;
        this.f2364e = z;
        this.f2365f = c0317a;
        this.f2366g = c0115u;
        this.f2367h = co8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m929a(long j, ContinuationImpl continuationImpl) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        C0116v c0116v;
        Throwable th;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuationImpl;
            int i = scrollingLogic$doFlingAnimation$1.f2091d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.f2091d = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
        }
        Object obj = scrollingLogic$doFlingAnimation$1.f2089b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollingLogic$doFlingAnimation$1.f2091d;
        if (i2 != 0) {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = scrollingLogic$doFlingAnimation$1.f2088a;
            try {
                AbstractC3193b.m15359b(obj);
                c0116v = this;
                c0116v.f2368i = false;
                return new dpa(ref$LongRef.f47717a);
            } catch (Throwable th2) {
                th = th2;
                c0116v = this;
                c0116v.f2368i = false;
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.f47717a = j;
        this.f2368i = true;
        try {
            MutatePriority mutatePriority = MutatePriority.Default;
            c0116v = this;
            try {
                ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(c0116v, ref$LongRef2, j, null);
                scrollingLogic$doFlingAnimation$1.f2088a = ref$LongRef2;
                scrollingLogic$doFlingAnimation$1.f2091d = 1;
                if (c0116v.m934f(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$LongRef = ref$LongRef2;
                c0116v.f2368i = false;
                return new dpa(ref$LongRef.f47717a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                c0116v.f2368i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c0116v = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m930b(long j, boolean z, SuspendLambda suspendLambda) {
        int i;
        long jM10570a;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1;
        C0077c c0077c;
        Object objInvokeSuspend;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            x63 x63Var = this.f2362c;
            zl8 zl8Var = AbstractC0110r.f2310a;
            if (!(x63Var instanceof C0100h)) {
                if (this.f2363d == Orientation.Horizontal) {
                    i = 1;
                } else {
                    i = 2;
                }
                jM10570a = dpa.m10570a(j, 0.0f, 0.0f, i);
                scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
                c0077c = this.f2361b;
                if (c0077c == null && (this.f2360a.mo975d() || this.f2360a.mo974b())) {
                    Object objM806b = c0077c.m806b(jM10570a, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
                    if (objM806b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM806b;
                    }
                } else {
                    ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$2 = new ScrollingLogic$onScrollStopped$performFling$1(scrollingLogic$onScrollStopped$performFling$1.f2103d, suspendLambda);
                    scrollingLogic$onScrollStopped$performFling$2.f2102c = jM10570a;
                    objInvokeSuspend = scrollingLogic$onScrollStopped$performFling$2.invokeSuspend(xfaVar);
                    if (objInvokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.f2363d == Orientation.Horizontal) {
                i = 1;
            } else {
                i = 2;
            }
            jM10570a = dpa.m10570a(j, 0.0f, 0.0f, i);
            scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
            c0077c = this.f2361b;
            if (c0077c == null) {
                ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$3 = new ScrollingLogic$onScrollStopped$performFling$1(scrollingLogic$onScrollStopped$performFling$1.f2103d, suspendLambda);
                scrollingLogic$onScrollStopped$performFling$3.f2102c = jM10570a;
                objInvokeSuspend = scrollingLogic$onScrollStopped$performFling$3.invokeSuspend(xfaVar);
                if (objInvokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objInvokeSuspend;
                }
            } else {
                ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$4 = new ScrollingLogic$onScrollStopped$performFling$1(scrollingLogic$onScrollStopped$performFling$1.f2103d, suspendLambda);
                scrollingLogic$onScrollStopped$performFling$4.f2102c = jM10570a;
                objInvokeSuspend = scrollingLogic$onScrollStopped$performFling$4.invokeSuspend(xfaVar);
                if (objInvokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objInvokeSuspend;
                }
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: c */
    public final long m931c(wn8 wn8Var, long j, int i) {
        C0320d c0320d = this.f2365f.f4083a;
        C0320d c0320dM1452a1 = c0320d != null ? c0320d.m1452a1() : null;
        long jMo1183P = c0320dM1452a1 != null ? c0320dM1452a1.mo1183P(i, j) : 0L;
        long jM12824e = gq6.m12824e(j, jMo1183P);
        long jM933e = m933e(m936h(wn8Var.mo3997a(m935g(m933e(this.f2363d == Orientation.Horizontal ? gq6.m12820a(jM12824e, 0.0f, 1) : gq6.m12820a(jM12824e, 0.0f, 2))))));
        C0115u c0115u = this.f2366g;
        if (c0115u.f34836I) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(c0115u)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4640g1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0391c.f4640g1 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4640g1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jM12824e2 = gq6.m12824e(jM12824e, jM933e);
        C0320d c0320d2 = this.f2365f.f4083a;
        C0320d c0320dM1452a2 = c0320d2 != null ? c0320d2.m1452a1() : null;
        return gq6.m12825f(gq6.m12825f(jMo1183P, jM933e), c0320dM1452a2 != null ? c0320dM1452a2.mo920u0(i, jM933e, jM12824e2) : 0L);
    }

    /* JADX INFO: renamed from: d */
    public final float m932d(float f) {
        return this.f2364e ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: e */
    public final long m933e(long j) {
        return this.f2364e ? gq6.m12826g(-1.0f, j) : j;
    }

    /* JADX INFO: renamed from: f */
    public final Object m934f(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) {
        Object objMo864c = this.f2360a.mo864c(mutatePriority, new ScrollingLogic$scroll$2(zi3Var, this, null), continuationImpl);
        return objMo864c == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo864c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final float m935g(long j) {
        return Float.intBitsToFloat((int) (this.f2363d == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m936h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f2363d == Orientation.Horizontal) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: i */
    public final float m937i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.f2363d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
