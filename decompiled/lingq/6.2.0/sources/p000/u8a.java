package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u8a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63592a;

    /* JADX INFO: renamed from: b */
    public int f63593b;

    /* JADX INFO: renamed from: c */
    public final Object f63594c;

    /* JADX INFO: renamed from: d */
    public Object f63595d;

    /* JADX INFO: renamed from: e */
    public Object f63596e;

    /* JADX INFO: renamed from: f */
    public Object f63597f;

    public u8a(b68[] b68VarArr, C3565s8[] c3565s8Arr, a9a a9aVar, Object obj) {
        this.f63592a = 0;
        bna.m3969q(b68VarArr.length == c3565s8Arr.length);
        this.f63594c = b68VarArr;
        this.f63595d = (C3565s8[]) c3565s8Arr.clone();
        this.f63596e = a9aVar;
        this.f63597f = obj;
        this.f63593b = b68VarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public void m22540a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((n28) this.f63594c).f52241a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m22545f(i);
        ((s01) this.f63595d).m20994f(childCount, z);
        if (z) {
            m22550k(view);
        }
        recyclerView.addView(view, childCount);
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        p28 p28Var = recyclerView.f6611H;
        if (p28Var != null && o38VarM2699N != null) {
            p28Var.mo13584i(o38VarM2699N);
        }
        ArrayList arrayList = recyclerView.f6644a0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a38) recyclerView.f6644a0.get(size)).mo75c(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22541b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((n28) this.f63594c).f52241a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m22545f(i);
        ((s01) this.f63595d).m20994f(childCount, z);
        if (z) {
            m22550k(view);
        }
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        if (o38VarM2699N != null) {
            if (!o38VarM2699N.m17792l() && !o38VarM2699N.m17797q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(o38VarM2699N);
                C3386nv.m17630q(sb, recyclerView.m2710C());
                return;
            } else {
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "reAttach " + o38VarM2699N);
                }
                o38VarM2699N.f53790j &= -257;
            }
        } else if (RecyclerView.f6595X0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strM2710C = recyclerView.m2710C();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strM2710C);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m22542c(int i) {
        int iM22545f = m22545f(i);
        ((s01) this.f63595d).m20996h(iM22545f);
        RecyclerView recyclerView = ((n28) this.f63594c).f52241a;
        View childAt = recyclerView.getChildAt(iM22545f);
        if (childAt != null) {
            o38 o38VarM2699N = RecyclerView.m2699N(childAt);
            if (o38VarM2699N != null) {
                if (o38VarM2699N.m17792l() && !o38VarM2699N.m17797q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(o38VarM2699N);
                    C3386nv.m17630q(sb, recyclerView.m2710C());
                    return;
                } else {
                    if (RecyclerView.f6596Y0) {
                        Log.d("RecyclerView", "tmpDetach " + o38VarM2699N);
                    }
                    o38VarM2699N.m17781a(256);
                }
            }
        } else if (RecyclerView.f6595X0) {
            C3386nv.m17627n("No view at offset ", iM22545f, recyclerView.m2710C());
            return;
        }
        recyclerView.detachViewFromParent(iM22545f);
    }

    /* JADX INFO: renamed from: d */
    public View m22543d(int i) {
        return ((n28) this.f63594c).f52241a.getChildAt(m22545f(i));
    }

    /* JADX INFO: renamed from: e */
    public int m22544e() {
        return ((n28) this.f63594c).f52241a.getChildCount() - ((ArrayList) this.f63596e).size();
    }

    /* JADX INFO: renamed from: f */
    public int m22545f(int i) {
        s01 s01Var = (s01) this.f63595d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((n28) this.f63594c).f52241a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM20991b = i - (i2 - s01Var.m20991b(i2));
            if (iM20991b == 0) {
                while (s01Var.m20993d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM20991b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m22546g() {
        Paint.Cap strokeCap = ((Paint) this.f63594c).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC3149jj.f45598a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public int m22547h() {
        Paint.Join strokeJoin = ((Paint) this.f63594c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC3149jj.f45599b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: i */
    public View m22548i(int i) {
        return ((n28) this.f63594c).f52241a.getChildAt(i);
    }

    /* JADX INFO: renamed from: j */
    public int m22549j() {
        return ((n28) this.f63594c).f52241a.getChildCount();
    }

    /* JADX INFO: renamed from: k */
    public void m22550k(View view) {
        ((ArrayList) this.f63596e).add(view);
        n28 n28Var = (n28) this.f63594c;
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        if (o38VarM2699N != null) {
            View view2 = o38VarM2699N.f53781a;
            RecyclerView recyclerView = n28Var.f52241a;
            int i = o38VarM2699N.f53797q;
            if (i != -1) {
                o38VarM2699N.f53796p = i;
            } else {
                o38VarM2699N.f53796p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.m2722Q()) {
                view2.setImportantForAccessibility(4);
            } else {
                o38VarM2699N.f53797q = 4;
                recyclerView.f6628P0.add(o38VarM2699N);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m22551l(u8a u8aVar, int i) {
        return u8aVar != null && Objects.equals(((b68[]) this.f63594c)[i], ((b68[]) u8aVar.f63594c)[i]) && Objects.equals(((C3565s8[]) this.f63595d)[i], ((C3565s8[]) u8aVar.f63595d)[i]);
    }

    /* JADX INFO: renamed from: m */
    public boolean m22552m(int i) {
        return ((b68[]) this.f63594c)[i] != null;
    }

    /* JADX INFO: renamed from: n */
    public void m22553n(float f) {
        ((Paint) this.f63594c).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: o */
    public void m22554o(int i) {
        if (this.f63593b == i) {
            return;
        }
        this.f63593b = i;
        ((Paint) this.f63594c).setBlendMode(pb1.m19030R(i));
    }

    /* JADX INFO: renamed from: p */
    public void m22555p(long j) {
        ((Paint) this.f63594c).setColor(d32.m10042h0(j));
    }

    /* JADX INFO: renamed from: q */
    public void m22556q(fa1 fa1Var) {
        this.f63596e = fa1Var;
        ((Paint) this.f63594c).setColorFilter(fa1Var != null ? fa1Var.f38699a : null);
    }

    /* JADX INFO: renamed from: r */
    public void m22557r(int i) {
        ((Paint) this.f63594c).setFilterBitmap(!(i == 0));
    }

    /* JADX INFO: renamed from: s */
    public void m22558s(C3538rj c3538rj) {
        ((Paint) this.f63594c).setPathEffect(c3538rj != null ? c3538rj.f59384a : null);
        this.f63597f = c3538rj;
    }

    /* JADX INFO: renamed from: t */
    public void m22559t(Shader shader) {
        this.f63595d = shader;
        ((Paint) this.f63594c).setShader(shader);
    }

    public String toString() {
        switch (this.f63592a) {
            case 2:
                return ((s01) this.f63595d).toString() + ", hidden list:" + ((ArrayList) this.f63596e).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m22560u(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f63594c;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: v */
    public void m22561v(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.f63594c;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: w */
    public void m22562w(float f) {
        ((Paint) this.f63594c).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: x */
    public void m22563x(int i) {
        ((Paint) this.f63594c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: y */
    public void m22564y(View view) {
        if (((ArrayList) this.f63596e).remove(view)) {
            n28 n28Var = (n28) this.f63594c;
            o38 o38VarM2699N = RecyclerView.m2699N(view);
            if (o38VarM2699N != null) {
                RecyclerView recyclerView = n28Var.f52241a;
                int i = o38VarM2699N.f53796p;
                if (recyclerView.m2722Q()) {
                    o38VarM2699N.f53797q = i;
                    recyclerView.f6628P0.add(o38VarM2699N);
                } else {
                    o38VarM2699N.f53781a.setImportantForAccessibility(i);
                }
                o38VarM2699N.f53796p = 0;
            }
        }
    }

    public u8a(n28 n28Var) {
        this.f63592a = 2;
        this.f63593b = 0;
        this.f63594c = n28Var;
        this.f63595d = new s01(0);
        this.f63596e = new ArrayList();
    }

    public u8a(Paint paint) {
        this.f63592a = 1;
        this.f63594c = paint;
        this.f63593b = 3;
    }
}
