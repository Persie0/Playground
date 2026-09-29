package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p002ui.platform.AbstractC0402n;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3229i;
import p000.C3537ri;
import p000.b64;
import p000.bb0;
import p000.c28;
import p000.cx9;
import p000.e28;
import p000.fa4;
import p000.h97;
import p000.jm9;
import p000.l54;
import p000.ld9;
import p000.lda;
import p000.mq6;
import p000.pa2;
import p000.pb1;
import p000.pg9;
import p000.r66;
import p000.ri0;
import p000.rw9;
import p000.sm1;
import p000.ss5;
import p000.thb;
import p000.tw4;
import p000.vv9;
import p000.w04;
import p000.wfb;
import p000.zw4;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0187a implements h97 {

    /* JADX INFO: renamed from: a */
    public tw4 f2940a;

    /* JADX INFO: renamed from: b */
    public pg9 f2941b;

    /* JADX INFO: renamed from: c */
    public zw4 f2942c;

    /* JADX INFO: renamed from: d */
    public C3229i f2943d;

    @Override // p000.h97
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
        m1088j(null);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: b */
    public final void mo1080b() {
        ld9 ld9Var;
        tw4 tw4Var = this.f2940a;
        if (tw4Var == null || (ld9Var = (ld9) thb.m22050i(tw4Var, AbstractC0402n.f4826r)) == null) {
            return;
        }
        ((pa2) ld9Var).m19005b();
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: c */
    public final void mo1081c() {
        pg9 pg9Var = this.f2941b;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f2941b = null;
        r66 r66VarM1087i = m1087i();
        if (r66VarM1087i != null) {
            C3229i c3229i = (C3229i) r66VarM1087i;
            synchronized (c3229i) {
                c3229i.m15562t(c3229i.m15556n() + ((long) c3229i.f48066k), c3229i.f48065j, c3229i.m15556n() + ((long) c3229i.f48066k), c3229i.m15556n() + ((long) c3229i.f48066k) + ((long) c3229i.f48067l));
            }
        }
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: d */
    public final void mo1082d(vv9 vv9Var, mq6 mq6Var, rw9 rw9Var, ri0 ri0Var, e28 e28Var, e28 e28Var2) {
        zw4 zw4Var = this.f2942c;
        if (zw4Var != null) {
            C0189c c0189c = zw4Var.f72309m;
            synchronized (c0189c.f2949c) {
                try {
                    c0189c.f2956j = vv9Var;
                    c0189c.f2958l = mq6Var;
                    c0189c.f2957k = rw9Var;
                    c0189c.f2959m = e28Var;
                    c0189c.f2960n = e28Var2;
                    if (c0189c.f2951e || c0189c.f2950d) {
                        c0189c.m1091a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: e */
    public final void mo1083e(vv9 vv9Var, vv9 vv9Var2) {
        zw4 zw4Var = this.f2942c;
        if (zw4Var != null) {
            boolean z = (cx9.m9920b(zw4Var.f72304h.f65991b, vv9Var2.f65991b) && fa4.m11650l(zw4Var.f72304h.f65992c, vv9Var2.f65992c)) ? false : true;
            zw4Var.f72304h = vv9Var2;
            int size = zw4Var.f72306j.size();
            for (int i = 0; i < size; i++) {
                c28 c28Var = (c28) ((WeakReference) zw4Var.f72306j.get(i)).get();
                if (c28Var != null) {
                    c28Var.f9366g = vv9Var2;
                }
            }
            C0189c c0189c = zw4Var.f72309m;
            synchronized (c0189c.f2949c) {
                c0189c.f2956j = null;
                c0189c.f2958l = null;
                c0189c.f2957k = null;
                c0189c.f2959m = null;
                c0189c.f2960n = null;
            }
            if (fa4.m11650l(vv9Var, vv9Var2)) {
                if (z) {
                    b64 b64Var = zw4Var.f72298b;
                    int iM9924f = cx9.m9924f(vv9Var2.f65991b);
                    int iM9923e = cx9.m9923e(vv9Var2.f65991b);
                    cx9 cx9Var = zw4Var.f72304h.f65992c;
                    int iM9924f2 = cx9Var != null ? cx9.m9924f(cx9Var.f34694a) : -1;
                    cx9 cx9Var2 = zw4Var.f72304h.f65992c;
                    b64Var.m3362o().updateSelection((View) b64Var.f8006a, iM9924f, iM9923e, iM9924f2, cx9Var2 != null ? cx9.m9923e(cx9Var2.f34694a) : -1);
                    return;
                }
                return;
            }
            if (vv9Var != null && (!fa4.m11650l(vv9Var.f65990a.f54604b, vv9Var2.f65990a.f54604b) || (cx9.m9920b(vv9Var.f65991b, vv9Var2.f65991b) && !fa4.m11650l(vv9Var.f65992c, vv9Var2.f65992c)))) {
                b64 b64Var2 = zw4Var.f72298b;
                b64Var2.m3362o().restartInput((View) b64Var2.f8006a);
                return;
            }
            int size2 = zw4Var.f72306j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c28 c28Var2 = (c28) ((WeakReference) zw4Var.f72306j.get(i2)).get();
                if (c28Var2 != null) {
                    vv9 vv9Var3 = zw4Var.f72304h;
                    b64 b64Var3 = zw4Var.f72298b;
                    if (c28Var2.f9370k) {
                        c28Var2.f9366g = vv9Var3;
                        if (c28Var2.f9368i) {
                            b64Var3.m3362o().updateExtractedText((View) b64Var3.f8006a, c28Var2.f9367h, lda.m16116b(vv9Var3));
                        }
                        cx9 cx9Var3 = vv9Var3.f65992c;
                        long j = vv9Var3.f65991b;
                        int iM9924f3 = cx9Var3 != null ? cx9.m9924f(cx9Var3.f34694a) : -1;
                        cx9 cx9Var4 = vv9Var3.f65992c;
                        b64Var3.m3362o().updateSelection((View) b64Var3.f8006a, cx9.m9924f(j), cx9.m9923e(j), iM9924f3, cx9Var4 != null ? cx9.m9923e(cx9Var4.f34694a) : -1);
                    }
                }
            }
        }
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: f */
    public final void mo1084f() {
        ld9 ld9Var;
        tw4 tw4Var = this.f2940a;
        if (tw4Var == null || (ld9Var = (ld9) thb.m22050i(tw4Var, AbstractC0402n.f4826r)) == null) {
            return;
        }
        ((pa2) ld9Var).m19004a();
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: g */
    public final void mo1085g(vv9 vv9Var, w04 w04Var, bb0 bb0Var, sm1 sm1Var) {
        m1088j(new C3537ri(vv9Var, this, w04Var, bb0Var, sm1Var, 0));
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: h */
    public final void mo1086h(e28 e28Var) {
        Rect rect;
        zw4 zw4Var = this.f2942c;
        if (zw4Var != null) {
            zw4Var.f72308l = new Rect(ss5.m21693T(e28Var.f36620a), ss5.m21693T(e28Var.f36621b), ss5.m21693T(e28Var.f36622c), ss5.m21693T(e28Var.f36623d));
            if (!zw4Var.f72306j.isEmpty() || (rect = zw4Var.f72308l) == null) {
                return;
            }
            zw4Var.f72297a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    /* JADX INFO: renamed from: i */
    public final r66 m1087i() {
        C3229i c3229i = this.f2943d;
        if (c3229i != null) {
            return c3229i;
        }
        if (!jm9.f45838a) {
            return null;
        }
        C3229i c3229iM19034d = pb1.m19034d(2, BufferOverflow.DROP_LATEST);
        this.f2943d = c3229iM19034d;
        return c3229iM19034d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1088j(C3537ri c3537ri) {
        tw4 tw4Var = this.f2940a;
        if (tw4Var == null) {
            return;
        }
        this.f2941b = tw4Var.f34836I ? wfb.m23926u(tw4Var.m9971N0(), null, CoroutineStart.UNDISPATCHED, new C0185xbdb5d003(tw4Var, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(c3537ri, this, tw4Var, null), null), 1) : null;
    }

    /* JADX INFO: renamed from: k */
    public final void m1089k(tw4 tw4Var) {
        if (this.f2940a != tw4Var) {
            l54.m15816c("Expected textInputModifierNode to be " + tw4Var + " but was " + this.f2940a);
        }
        this.f2940a = null;
    }
}
