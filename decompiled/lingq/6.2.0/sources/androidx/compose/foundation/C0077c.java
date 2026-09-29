package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC0818bo;
import p000.C3386nv;
import p000.bo3;
import p000.d32;
import p000.do7;
import p000.dpa;
import p000.eh0;
import p000.fa2;
import p000.fb2;
import p000.fg7;
import p000.lo2;
import p000.mo9;
import p000.s46;
import p000.ss5;
import p000.t17;
import p000.t66;
import p000.uea;
import p000.x89;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0077c {

    /* JADX INFO: renamed from: a */
    public final fb2 f1738a;

    /* JADX INFO: renamed from: b */
    public long f1739b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final lo2 f1740c;

    /* JADX INFO: renamed from: d */
    public final t66 f1741d;

    /* JADX INFO: renamed from: e */
    public final boolean f1742e;

    /* JADX INFO: renamed from: f */
    public boolean f1743f;

    /* JADX INFO: renamed from: g */
    public long f1744g;

    /* JADX INFO: renamed from: h */
    public long f1745h;

    /* JADX INFO: renamed from: i */
    public final fa2 f1746i;

    public C0077c(Context context, fb2 fb2Var, long j, t17 t17Var) {
        this.f1738a = fb2Var;
        lo2 lo2Var = new lo2(context, d32.m10042h0(j));
        this.f1740c = lo2Var;
        this.f1741d = AbstractC0278f.m1259i(xfa.f68157a, s46.f60289d);
        this.f1742e = true;
        this.f1744g = 0L;
        this.f1745h = -1L;
        C0076b c0076b = new C0076b(this);
        fg7 fg7Var = mo9.f51649a;
        C0333g c0333g = new C0333g(null, null, null, c0076b);
        this.f1746i = Build.VERSION.SDK_INT >= 31 ? new bo3(c0333g, this, lo2Var) : new bo3(c0333g, this, lo2Var, t17Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m805a() {
        boolean z;
        lo2 lo2Var = this.f1740c;
        EdgeEffect edgeEffect = lo2Var.f49924d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = lo2Var.f49925e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = lo2Var.f49926f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = lo2Var.f49927g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m808d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m806b(long j, zi3 zi3Var, ContinuationImpl continuationImpl) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        float fM11128h;
        float fM11128h2;
        long jM10573d;
        if (continuationImpl instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuationImpl;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.f1647d;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.f1647d = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
            }
        } else {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.f1645b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.f1647d;
        xfa xfaVar = xfa.f68157a;
        lo2 lo2Var = this.f1740c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objInvoke);
            if (x89.m24408e(this.f1744g)) {
                Object dpaVar = new dpa(j);
                androidEdgeEffectOverscrollEffect$applyToFling$1.f1647d = 1;
                if (zi3Var.invoke(dpaVar, androidEdgeEffectOverscrollEffect$applyToFling$1) != obj) {
                    return xfaVar;
                }
            } else {
                boolean zM16409g = lo2.m16409g(lo2Var.f49926f);
                fb2 fb2Var = this.f1738a;
                if (!zM16409g || dpa.m10571b(j) >= 0.0f) {
                    fM11128h = (!lo2.m16409g(lo2Var.f49927g) || dpa.m10571b(j) <= 0.0f) ? 0.0f : -eh0.m11128h(lo2Var.m16413d(), -dpa.m10571b(j), Float.intBitsToFloat((int) (this.f1744g >> 32)), fb2Var);
                } else {
                    fM11128h = eh0.m11128h(lo2Var.m16412c(), dpa.m10571b(j), Float.intBitsToFloat((int) (this.f1744g >> 32)), fb2Var);
                }
                if (!lo2.m16409g(lo2Var.f49924d) || dpa.m10572c(j) >= 0.0f) {
                    fM11128h2 = (!lo2.m16409g(lo2Var.f49925e) || dpa.m10572c(j) <= 0.0f) ? 0.0f : -eh0.m11128h(lo2Var.m16411b(), -dpa.m10572c(j), Float.intBitsToFloat((int) (this.f1744g & 4294967295L)), fb2Var);
                } else {
                    fM11128h2 = eh0.m11128h(lo2Var.m16414e(), dpa.m10572c(j), Float.intBitsToFloat((int) (this.f1744g & 4294967295L)), fb2Var);
                }
                long jM22716a = uea.m22716a(fM11128h, fM11128h2);
                if (jM22716a != 0) {
                    m808d();
                }
                jM10573d = dpa.m10573d(j, jM22716a);
                Object dpaVar2 = new dpa(jM10573d);
                androidEdgeEffectOverscrollEffect$applyToFling$1.f1644a = jM10573d;
                androidEdgeEffectOverscrollEffect$applyToFling$1.f1647d = 2;
                objInvoke = zi3Var.invoke(dpaVar2, androidEdgeEffectOverscrollEffect$applyToFling$1);
            }
            return obj;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objInvoke);
            return xfaVar;
        }
        if (i2 != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jM10573d = androidEdgeEffectOverscrollEffect$applyToFling$1.f1644a;
        AbstractC3193b.m15359b(objInvoke);
        long jM10573d2 = dpa.m10573d(jM10573d, ((dpa) objInvoke).f36010a);
        this.f1743f = false;
        if (dpa.m10571b(jM10573d2) > 0.0f) {
            EdgeEffect edgeEffectM16412c = lo2Var.m16412c();
            int iM21693T = ss5.m21693T(dpa.m10571b(jM10573d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM16412c.isFinished()) {
                edgeEffectM16412c.onAbsorb(iM21693T);
            }
        } else if (dpa.m10571b(jM10573d2) < 0.0f) {
            EdgeEffect edgeEffectM16413d = lo2Var.m16413d();
            int i3 = -ss5.m21693T(dpa.m10571b(jM10573d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM16413d.isFinished()) {
                edgeEffectM16413d.onAbsorb(i3);
            }
        }
        if (dpa.m10572c(jM10573d2) > 0.0f) {
            EdgeEffect edgeEffectM16414e = lo2Var.m16414e();
            int iM21693T2 = ss5.m21693T(dpa.m10572c(jM10573d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM16414e.isFinished()) {
                edgeEffectM16414e.onAbsorb(iM21693T2);
            }
        } else if (dpa.m10572c(jM10573d2) < 0.0f) {
            EdgeEffect edgeEffectM16411b = lo2Var.m16411b();
            int i4 = -ss5.m21693T(dpa.m10572c(jM10573d2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectM16411b.isFinished()) {
                edgeEffectM16411b.onAbsorb(i4);
            }
        }
        m805a();
        return xfaVar;
    }

    /* JADX INFO: renamed from: c */
    public final long m807c() {
        long jM10538n = this.f1739b;
        if ((9223372034707292159L & jM10538n) == 9205357640488583168L) {
            jM10538n = do7.m10538n(this.f1744g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM10538n >> 32)) / Float.intBitsToFloat((int) (this.f1744g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM10538n & 4294967295L)) / Float.intBitsToFloat((int) (this.f1744g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m808d() {
        if (this.f1742e) {
            ((xc9) this.f1741d).setValue(xfa.f68157a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m809e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m807c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f1744g & 4294967295L));
        EdgeEffect edgeEffectM16411b = this.f1740c.m16411b();
        float fM3992c = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM3992c = AbstractC0818bo.m3992c(edgeEffectM16411b, fM3992c, f);
        } else {
            edgeEffectM16411b.onPull(fM3992c, f);
        }
        return (i2 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16411b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f1744g)) * (-fM3992c) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: f */
    public final float m810f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m807c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f1744g >> 32));
        EdgeEffect edgeEffectM16412c = this.f1740c.m16412c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0818bo.m3992c(edgeEffectM16412c, fIntBitsToFloat2, f);
        } else {
            edgeEffectM16412c.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16412c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f1744g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: g */
    public final float m811g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m807c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f1744g >> 32));
        EdgeEffect edgeEffectM16413d = this.f1740c.m16413d();
        float fM3992c = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM3992c = AbstractC0818bo.m3992c(edgeEffectM16413d, fM3992c, fIntBitsToFloat);
        } else {
            edgeEffectM16413d.onPull(fM3992c, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16413d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f1744g >> 32)) * (-fM3992c) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: h */
    public final float m812h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m807c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f1744g & 4294967295L));
        EdgeEffect edgeEffectM16414e = this.f1740c.m16414e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0818bo.m3992c(edgeEffectM16414e, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM16414e.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16414e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f1744g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m813i(long j) {
        boolean zM24404a = x89.m24404a(this.f1744g, 0L);
        boolean zM24404a2 = x89.m24404a(j, this.f1744g);
        this.f1744g = j;
        if (!zM24404a2) {
            int iM21693T = ss5.m21693T(Float.intBitsToFloat((int) (j >> 32)));
            long jM21693T = (((long) ss5.m21693T(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM21693T) << 32);
            lo2 lo2Var = this.f1740c;
            lo2Var.f49923c = jM21693T;
            EdgeEffect edgeEffect = lo2Var.f49924d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM21693T >> 32), (int) (jM21693T & 4294967295L));
            }
            EdgeEffect edgeEffect2 = lo2Var.f49925e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM21693T >> 32), (int) (jM21693T & 4294967295L));
            }
            EdgeEffect edgeEffect3 = lo2Var.f49926f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM21693T & 4294967295L), (int) (jM21693T >> 32));
            }
            EdgeEffect edgeEffect4 = lo2Var.f49927g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM21693T & 4294967295L), (int) (jM21693T >> 32));
            }
            EdgeEffect edgeEffect5 = lo2Var.f49928h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM21693T >> 32), (int) (jM21693T & 4294967295L));
            }
            EdgeEffect edgeEffect6 = lo2Var.f49929i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM21693T >> 32), (int) (jM21693T & 4294967295L));
            }
            EdgeEffect edgeEffect7 = lo2Var.f49930j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM21693T & 4294967295L), (int) (jM21693T >> 32));
            }
            EdgeEffect edgeEffect8 = lo2Var.f49931k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM21693T), (int) (jM21693T >> 32));
            }
        }
        if (zM24404a || zM24404a2) {
            return;
        }
        m805a();
    }
}
