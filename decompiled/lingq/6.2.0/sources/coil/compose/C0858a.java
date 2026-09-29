package coil.compose;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.AbstractC0278f;
import coil.C0855a;
import com.google.accompanist.drawablepainter.C0941a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC2983f;
import p000.AbstractC3352my;
import p000.AbstractC3387nw;
import p000.C2951e4;
import p000.C3162jw;
import p000.C3185ki;
import p000.C3276kw;
import p000.C3313lw;
import p000.C3350mw;
import p000.an0;
import p000.d04;
import p000.dp5;
import p000.e04;
import p000.eh0;
import p000.f04;
import p000.fa1;
import p000.hd0;
import p000.hl1;
import p000.hn9;
import p000.jl1;
import p000.nn9;
import p000.ph2;
import p000.qc9;
import p000.r46;
import p000.t66;
import p000.ur1;
import p000.v72;
import p000.vi3;
import p000.vl1;
import p000.vr1;
import p000.vz1;
import p000.wfb;
import p000.x48;
import p000.x89;
import p000.xc9;
import p000.y27;

/* JADX INFO: renamed from: coil.compose.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0858a extends y27 implements x48 {

    /* JADX INFO: renamed from: O */
    public static final C2951e4 f10424O = new C2951e4(8);

    /* JADX INFO: renamed from: H */
    public vi3 f10425H;

    /* JADX INFO: renamed from: I */
    public jl1 f10426I;

    /* JADX INFO: renamed from: J */
    public int f10427J;

    /* JADX INFO: renamed from: K */
    public boolean f10428K;

    /* JADX INFO: renamed from: L */
    public final t66 f10429L;

    /* JADX INFO: renamed from: M */
    public final t66 f10430M;

    /* JADX INFO: renamed from: N */
    public final t66 f10431N;

    /* JADX INFO: renamed from: e */
    public vl1 f10432e;

    /* JADX INFO: renamed from: f */
    public final C3244l f10433f = AbstractC3352my.m17114d(new x89(0));

    /* JADX INFO: renamed from: g */
    public final t66 f10434g = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: h */
    public final qc9 f10435h = AbstractC0278f.m1256f(1.0f);

    /* JADX INFO: renamed from: i */
    public final t66 f10436i = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: j */
    public AbstractC3387nw f10437j;

    /* JADX INFO: renamed from: k */
    public y27 f10438k;

    /* JADX INFO: renamed from: l */
    public vi3 f10439l;

    public C0858a(e04 e04Var, C0855a c0855a) {
        C3162jw c3162jw = C3162jw.f46239a;
        this.f10437j = c3162jw;
        this.f10439l = f10424O;
        this.f10426I = hl1.f42565b;
        this.f10427J = 1;
        this.f10429L = AbstractC0278f.m1260j(c3162jw);
        this.f10430M = AbstractC0278f.m1260j(e04Var);
        this.f10431N = AbstractC0278f.m1260j(c0855a);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f10435h.m19862i(f);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
        ((xc9) this.f10436i).setValue(fa1Var);
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
        vl1 vl1Var = this.f10432e;
        if (vl1Var != null) {
            vz1.m23637j(vl1Var, null);
        }
        this.f10432e = null;
        Object obj = this.f10438k;
        x48 x48Var = obj instanceof x48 ? (x48) obj : null;
        if (x48Var != null) {
            x48Var.mo1245d();
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        vl1 vl1Var = this.f10432e;
        if (vl1Var != null) {
            vz1.m23637j(vl1Var, null);
        }
        this.f10432e = null;
        Object obj = this.f10438k;
        x48 x48Var = obj instanceof x48 ? (x48) obj : null;
        if (x48Var != null) {
            x48Var.mo1246f();
        }
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f10432e == null) {
                nn9 nn9VarM20384i = r46.m20384i();
                v72 v72Var = ph2.f56212a;
                vl1 vl1VarM23619a = vz1.m23619a(eh0.m11113J(nn9VarM20384i, dp5.f36000a.f68538f));
                this.f10432e = vl1VarM23619a;
                Object obj = this.f10438k;
                x48 x48Var = obj instanceof x48 ? (x48) obj : null;
                if (x48Var != null) {
                    x48Var.mo1247g();
                }
                if (this.f10428K) {
                    d04 d04VarM10778a = e04.m10778a((e04) ((xc9) this.f10430M).getValue());
                    d04VarM10778a.f34777b = ((C0855a) ((xc9) this.f10431N).getValue()).f10405b;
                    d04VarM10778a.f34795t = null;
                    e04 e04VarM9960a = d04VarM10778a.m9960a();
                    Integer num = e04VarM9960a.f36526y;
                    e04VarM9960a.f36501A.getClass();
                    Drawable drawableM11407b = AbstractC2983f.m11407b(e04VarM9960a, num);
                    m4954l(new C3313lw(drawableM11407b != null ? m4953k(drawableM11407b) : null));
                } else {
                    wfb.m23926u(vl1VarM23619a, null, null, new AsyncImagePainter$onRemembered$1$1(this, null), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        y27 y27Var = (y27) ((xc9) this.f10434g).getValue();
        if (y27Var != null) {
            return y27Var.mo1445i();
        }
        return 9205357640488583168L;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        an0 an0Var = c0358h.f4358a;
        x89 x89Var = new x89(an0Var.mo1422h());
        C3244l c3244l = this.f10433f;
        c3244l.getClass();
        c3244l.m15572j(null, x89Var);
        y27 y27Var = (y27) ((xc9) this.f10434g).getValue();
        if (y27Var != null) {
            y27Var.m24872e(c0358h, an0Var.mo1422h(), this.f10435h.m19861h(), (fa1) ((xc9) this.f10436i).getValue());
        }
    }

    /* JADX INFO: renamed from: k */
    public final y27 m4953k(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new C0941a(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C3185ki c3185ki = new C3185ki(bitmap);
        int i = this.f10427J;
        hd0 hd0Var = new hd0(c3185ki, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        hd0Var.f42197g = i;
        return hd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m4954l(AbstractC3387nw abstractC3387nw) {
        f04 f04Var;
        y27 y27VarMo14691a;
        vi3 vi3Var;
        Object objMo14691a;
        x48 x48Var;
        x48 x48Var2;
        AbstractC3387nw abstractC3387nw2 = this.f10437j;
        AbstractC3387nw abstractC3387nw3 = (AbstractC3387nw) this.f10439l.invoke(abstractC3387nw);
        this.f10437j = abstractC3387nw3;
        ((xc9) this.f10429L).setValue(abstractC3387nw3);
        if (!(abstractC3387nw3 instanceof C3350mw)) {
            if (abstractC3387nw3 instanceof C3276kw) {
                f04Var = ((C3276kw) abstractC3387nw3).f48489b;
            } else {
                y27VarMo14691a = null;
            }
            if (y27VarMo14691a == null) {
                y27VarMo14691a = abstractC3387nw3.mo14691a();
            }
            this.f10438k = y27VarMo14691a;
            ((xc9) this.f10434g).setValue(y27VarMo14691a);
            if (this.f10432e != null && abstractC3387nw2.mo14691a() != abstractC3387nw3.mo14691a()) {
                objMo14691a = abstractC3387nw2.mo14691a();
                if (objMo14691a instanceof x48) {
                    x48Var = (x48) objMo14691a;
                } else {
                    x48Var = null;
                }
                if (x48Var != null) {
                    x48Var.mo1246f();
                }
                Object objMo14691a2 = abstractC3387nw3.mo14691a();
                x48Var2 = objMo14691a2 instanceof x48 ? (x48) objMo14691a2 : null;
                if (x48Var2 != null) {
                    x48Var2.mo1247g();
                }
            }
            vi3Var = this.f10425H;
            if (vi3Var != null) {
                vi3Var.invoke(abstractC3387nw3);
            }
        }
        f04Var = ((C3350mw) abstractC3387nw3).f51905b;
        if (f04Var.mo11419b().f36508g.m25690a(vz1.f66107a, f04Var) instanceof vr1) {
            y27VarMo14691a = new ur1(abstractC3387nw2 instanceof C3313lw ? abstractC3387nw2.mo14691a() : null, abstractC3387nw3.mo14691a(), this.f10426I, 0, ((f04Var instanceof hn9) && ((hn9) f04Var).f42669g) ? false : true);
        } else {
            y27VarMo14691a = null;
        }
        if (y27VarMo14691a == null) {
            y27VarMo14691a = abstractC3387nw3.mo14691a();
        }
        this.f10438k = y27VarMo14691a;
        ((xc9) this.f10434g).setValue(y27VarMo14691a);
        if (this.f10432e != null) {
            objMo14691a = abstractC3387nw2.mo14691a();
            if (objMo14691a instanceof x48) {
                x48Var = (x48) objMo14691a;
            } else {
                x48Var = null;
            }
            if (x48Var != null) {
                x48Var.mo1246f();
            }
            Object objMo14691a3 = abstractC3387nw3.mo14691a();
            if (objMo14691a3 instanceof x48) {
            }
            if (x48Var2 != null) {
                x48Var2.mo1247g();
            }
        }
        vi3Var = this.f10425H;
        if (vi3Var != null) {
            vi3Var.invoke(abstractC3387nw3);
        }
    }
}
