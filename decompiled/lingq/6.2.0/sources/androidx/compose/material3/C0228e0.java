package androidx.compose.material3;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.br8;
import p000.h41;
import p000.hl2;
import p000.l70;
import p000.qc9;
import p000.sc9;
import p000.t66;
import p000.ui3;
import p000.vi3;
import p000.vz1;
import p000.xa9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0228e0 implements hl2 {

    /* JADX INFO: renamed from: a */
    public final int f3400a;

    /* JADX INFO: renamed from: b */
    public ui3 f3401b;

    /* JADX INFO: renamed from: c */
    public final h41 f3402c;

    /* JADX INFO: renamed from: d */
    public final qc9 f3403d;

    /* JADX INFO: renamed from: e */
    public vi3 f3404e;

    /* JADX INFO: renamed from: f */
    public final boolean f3405f = true;

    /* JADX INFO: renamed from: g */
    public final float[] f3406g;

    /* JADX INFO: renamed from: h */
    public final sc9 f3407h;

    /* JADX INFO: renamed from: i */
    public final sc9 f3408i;

    /* JADX INFO: renamed from: j */
    public boolean f3409j;

    /* JADX INFO: renamed from: k */
    public final sc9 f3410k;

    /* JADX INFO: renamed from: l */
    public final sc9 f3411l;

    /* JADX INFO: renamed from: m */
    public final Orientation f3412m;

    /* JADX INFO: renamed from: n */
    public final t66 f3413n;

    /* JADX INFO: renamed from: o */
    public final br8 f3414o;

    /* JADX INFO: renamed from: p */
    public final qc9 f3415p;

    /* JADX INFO: renamed from: q */
    public final qc9 f3416q;

    /* JADX INFO: renamed from: r */
    public final xa9 f3417r;

    /* JADX INFO: renamed from: s */
    public final C0145m f3418s;

    public C0228e0(float f, int i, ui3 ui3Var, h41 h41Var) {
        float[] fArr;
        this.f3400a = i;
        this.f3401b = ui3Var;
        this.f3402c = h41Var;
        this.f3403d = AbstractC0278f.m1256f(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.f3406g = fArr;
        this.f3407h = AbstractC0278f.m1257g(0);
        this.f3408i = AbstractC0278f.m1257g(0);
        this.f3410k = AbstractC0278f.m1257g(0);
        this.f3411l = AbstractC0278f.m1257g(0);
        this.f3412m = Orientation.Horizontal;
        this.f3413n = AbstractC0278f.m1260j(Boolean.FALSE);
        this.f3414o = new br8(this, 3);
        this.f3415p = AbstractC0278f.m1256f(AbstractC0226d0.m1140k(h41Var.f41765a, h41Var.f41766b, f, 0.0f, 0.0f));
        this.f3416q = AbstractC0278f.m1256f(0.0f);
        this.f3417r = new xa9(this);
        this.f3418s = new C0145m();
    }

    @Override // p000.hl2
    /* JADX INFO: renamed from: a */
    public final Object mo861a(MutatePriority mutatePriority, zi3 zi3Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new SliderState$drag$2(this, mutatePriority, zi3Var, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1141b(float f) {
        float fMax;
        float fMin;
        if (this.f3412m == Orientation.Vertical) {
            float fM21222h = this.f3408i.m21222h();
            sc9 sc9Var = this.f3411l;
            fMax = Math.max(fM21222h - (sc9Var.m21222h() / 2.0f), 0.0f);
            fMin = Math.min(sc9Var.m21222h() / 2.0f, fMax);
        } else {
            float fM21222h2 = this.f3407h.m21222h();
            sc9 sc9Var2 = this.f3410k;
            fMax = Math.max(fM21222h2 - (sc9Var2.m21222h() / 2.0f), 0.0f);
            fMin = Math.min(sc9Var2.m21222h() / 2.0f, fMax);
        }
        qc9 qc9Var = this.f3415p;
        float fM19861h = qc9Var.m19861h() + f;
        qc9 qc9Var2 = this.f3416q;
        qc9Var.m19862i(qc9Var2.m19861h() + fM19861h);
        qc9Var2.m19862i(0.0f);
        float fM1138i = AbstractC0226d0.m1138i(qc9Var.m19861h(), this.f3406g, fMin, fMax);
        h41 h41Var = this.f3402c;
        float fM1140k = AbstractC0226d0.m1140k(fMin, fMax, fM1138i, h41Var.f41765a, h41Var.f41766b);
        if (fM1140k == this.f3403d.m19861h()) {
            return;
        }
        vi3 vi3Var = this.f3404e;
        if (vi3Var != null) {
            vi3Var.invoke(Float.valueOf(fM1140k));
        } else {
            m1143d(fM1140k);
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m1142c() {
        h41 h41Var = this.f3402c;
        return AbstractC0226d0.m1139j(Float.valueOf(h41Var.f41765a).floatValue(), Float.valueOf(h41Var.f41766b).floatValue(), l70.m15944g(this.f3403d.m19861h(), Float.valueOf(h41Var.f41765a).floatValue(), Float.valueOf(h41Var.f41766b).floatValue()));
    }

    /* JADX INFO: renamed from: d */
    public final void m1143d(float f) {
        if (this.f3405f) {
            h41 h41Var = this.f3402c;
            float f2 = h41Var.f41765a;
            float f3 = h41Var.f41766b;
            f = AbstractC0226d0.m1138i(l70.m15944g(f, f2, f3), this.f3406g, h41Var.f41765a, f3);
        }
        this.f3403d.m19862i(f);
    }
}
