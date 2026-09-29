package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: renamed from: cl */
/* JADX INFO: loaded from: classes.dex */
public final class C0851cl extends TextPaint {

    /* JADX INFO: renamed from: a */
    public u8a f10209a;

    /* JADX INFO: renamed from: b */
    public rt9 f10210b;

    /* JADX INFO: renamed from: c */
    public int f10211c;

    /* JADX INFO: renamed from: d */
    public l39 f10212d;

    /* JADX INFO: renamed from: e */
    public aa1 f10213e;

    /* JADX INFO: renamed from: f */
    public vi0 f10214f;

    /* JADX INFO: renamed from: g */
    public gc2 f10215g;

    /* JADX INFO: renamed from: h */
    public x89 f10216h;

    /* JADX INFO: renamed from: i */
    public ml2 f10217i;

    /* JADX INFO: renamed from: a */
    public final u8a m4826a() {
        u8a u8aVar = this.f10209a;
        if (u8aVar != null) {
            return u8aVar;
        }
        u8a u8aVar2 = new u8a(this);
        this.f10209a = u8aVar2;
        return u8aVar2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4827b(int i) {
        if (i == this.f10211c) {
            return;
        }
        m4826a().m22554o(i);
        this.f10211c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: c */
    public final void m4828c(final vi0 vi0Var, final long j, float f) {
        if (vi0Var == null) {
            this.f10215g = null;
            this.f10214f = null;
            this.f10216h = null;
            setShader(null);
            return;
        }
        if (vi0Var instanceof pd9) {
            m4829d(omd.m18135Y(f, ((pd9) vi0Var).f55989a));
            return;
        }
        if (!(vi0Var instanceof i39)) {
            gm5.m12750e();
            return;
        }
        if (fa4.m11650l(this.f10214f, vi0Var)) {
            x89 x89Var = this.f10216h;
            if (!(x89Var == null ? false : x89.m24404a(x89Var.f67935a, j))) {
                if (j != 9205357640488583168L) {
                    this.f10214f = vi0Var;
                    this.f10216h = new x89(j);
                    this.f10215g = AbstractC0278f.m1254d(new ui3() { // from class: bl
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            return ((i39) vi0Var).mo11320c(j);
                        }
                    });
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f10214f = vi0Var;
            this.f10216h = new x89(j);
            this.f10215g = AbstractC0278f.m1254d(new ui3() { // from class: bl
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return ((i39) vi0Var).mo11320c(j);
                }
            });
        }
        u8a u8aVarM4826a = m4826a();
        gc2 gc2Var = this.f10215g;
        u8aVarM4826a.m22559t(gc2Var != null ? (Shader) gc2Var.getValue() : null);
        this.f10213e = null;
        b34.m3221Q(this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4829d(long j) {
        aa1 aa1Var = this.f10213e;
        if ((aa1Var == null ? false : aa1.m199c(aa1Var.f414a, j)) || j == 16) {
            return;
        }
        this.f10213e = new aa1(j);
        setColor(d32.m10042h0(j));
        this.f10215g = null;
        this.f10214f = null;
        this.f10216h = null;
        setShader(null);
    }

    /* JADX INFO: renamed from: e */
    public final void m4830e(ml2 ml2Var) {
        if (ml2Var == null || fa4.m11650l(this.f10217i, ml2Var)) {
            return;
        }
        this.f10217i = ml2Var;
        if (ml2Var.equals(w33.f66328a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(ml2Var instanceof el9)) {
            gm5.m12750e();
            return;
        }
        m4826a().m22563x(1);
        el9 el9Var = (el9) ml2Var;
        m4826a().m22562w(el9Var.f37448a);
        u8a u8aVarM4826a = m4826a();
        ((Paint) u8aVarM4826a.f63594c).setStrokeMiter(el9Var.f37449b);
        m4826a().m22561v(el9Var.f37451d);
        m4826a().m22560u(el9Var.f37450c);
        m4826a().m22558s(null);
    }

    /* JADX INFO: renamed from: f */
    public final void m4831f(l39 l39Var) {
        if (l39Var == null || fa4.m11650l(this.f10212d, l39Var)) {
            return;
        }
        this.f10212d = l39Var;
        if (l39Var.equals(l39.f48992d)) {
            clearShadowLayer();
            return;
        }
        l39 l39Var2 = this.f10212d;
        float f = l39Var2.f48995c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (l39Var2.f48994b >> 32)), Float.intBitsToFloat((int) (this.f10212d.f48994b & 4294967295L)), d32.m10042h0(this.f10212d.f48993a));
    }

    /* JADX INFO: renamed from: g */
    public final void m4832g(rt9 rt9Var) {
        if (rt9Var == null || fa4.m11650l(this.f10210b, rt9Var)) {
            return;
        }
        this.f10210b = rt9Var;
        int i = rt9Var.f59804a;
        setUnderlineText((i | 1) == i);
        int i2 = this.f10210b.f59804a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
