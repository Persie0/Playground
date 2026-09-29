package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class fd5 {

    /* JADX INFO: renamed from: a */
    public int f38889a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f38890b;

    /* JADX INFO: renamed from: c */
    public y28 f38891c;

    /* JADX INFO: renamed from: d */
    public boolean f38892d;

    /* JADX INFO: renamed from: e */
    public boolean f38893e;

    /* JADX INFO: renamed from: f */
    public View f38894f;

    /* JADX INFO: renamed from: g */
    public final i38 f38895g;

    /* JADX INFO: renamed from: h */
    public boolean f38896h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f38897i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f38898j;

    /* JADX INFO: renamed from: k */
    public PointF f38899k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f38900l;

    /* JADX INFO: renamed from: m */
    public boolean f38901m;

    /* JADX INFO: renamed from: n */
    public float f38902n;

    /* JADX INFO: renamed from: o */
    public int f38903o;

    /* JADX INFO: renamed from: p */
    public int f38904p;

    public fd5(Context context) {
        i38 i38Var = new i38();
        i38Var.f43447d = -1;
        i38Var.f43449f = false;
        i38Var.f43450g = 0;
        i38Var.f43444a = 0;
        i38Var.f43445b = 0;
        i38Var.f43446c = Integer.MIN_VALUE;
        i38Var.f43448e = null;
        this.f38895g = i38Var;
        this.f38897i = new LinearInterpolator();
        this.f38898j = new DecelerateInterpolator();
        this.f38901m = false;
        this.f38903o = 0;
        this.f38904p = 0;
        this.f38900l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m11773a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            C3386nv.m17626m("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int mo11774b(View view, int i) {
        y28 y28Var = this.f38891c;
        if (y28Var == null || !y28Var.mo2679d()) {
            return 0;
        }
        z28 z28Var = (z28) view.getLayoutParams();
        return m11773a(y28.m24873A(view) - ((ViewGroup.MarginLayoutParams) z28Var).leftMargin, y28.m24876D(view) + ((ViewGroup.MarginLayoutParams) z28Var).rightMargin, y28Var.m24891H(), y28Var.f69184n - y28Var.m24893I(), i);
    }

    /* JADX INFO: renamed from: c */
    public int mo11775c(View view, int i) {
        y28 y28Var = this.f38891c;
        if (y28Var == null || !y28Var.mo2680e()) {
            return 0;
        }
        z28 z28Var = (z28) view.getLayoutParams();
        return m11773a(y28.m24877E(view) - ((ViewGroup.MarginLayoutParams) z28Var).topMargin, y28.m24884y(view) + ((ViewGroup.MarginLayoutParams) z28Var).bottomMargin, y28Var.m24894J(), y28Var.f69185o - y28Var.m24890G(), i);
    }

    /* JADX INFO: renamed from: d */
    public float mo11776d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: e */
    public int mo11777e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f38901m) {
            this.f38902n = mo11776d(this.f38900l);
            this.f38901m = true;
        }
        return (int) Math.ceil(fAbs * this.f38902n);
    }

    /* JADX INFO: renamed from: f */
    public PointF mo11778f(int i) {
        Object obj = this.f38891c;
        if (obj instanceof j38) {
            return ((j38) obj).mo2674a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + j38.class.getCanonicalName());
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m11779g() {
        return this.f38889a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11780h() {
        return this.f38892d;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11781i() {
        return this.f38893e;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX INFO: renamed from: j */
    public final void m11782j(int i, int i2) {
        PointF pointFMo11778f;
        RecyclerView recyclerView = this.f38890b;
        if (this.f38889a == -1 || recyclerView == null) {
            m11787o();
        }
        if (this.f38892d && this.f38894f == null && this.f38891c != null && (pointFMo11778f = mo11778f(this.f38889a)) != null) {
            float f = pointFMo11778f.x;
            if (f != 0.0f || pointFMo11778f.y != 0.0f) {
                recyclerView.m2740h0((int) Math.signum(f), (int) Math.signum(pointFMo11778f.y), null);
            }
        }
        this.f38892d = false;
        View view = this.f38894f;
        i38 i38Var = this.f38895g;
        if (view != null) {
            this.f38890b.getClass();
            o38 o38VarM2699N = RecyclerView.m2699N(view);
            if ((o38VarM2699N != null ? o38VarM2699N.m17784d() : -1) == this.f38889a) {
                View view2 = this.f38894f;
                k38 k38Var = recyclerView.f6606C0;
                mo11784l(view2, i38Var);
                i38Var.m13649a(recyclerView);
                m11787o();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f38894f = null;
            }
        }
        if (this.f38893e) {
            k38 k38Var2 = recyclerView.f6606C0;
            if (this.f38890b.f6613I.m24906v() == 0) {
                m11787o();
            } else {
                int i3 = this.f38903o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f38903o = i4;
                int i5 = this.f38904p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f38904p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFMo11778f2 = mo11778f(this.f38889a);
                    if (pointFMo11778f2 != null) {
                        float f2 = pointFMo11778f2.x;
                        if (f2 == 0.0f && pointFMo11778f2.y == 0.0f) {
                            i38Var.f43447d = this.f38889a;
                            m11787o();
                        } else {
                            float f3 = pointFMo11778f2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFMo11778f2.x / fSqrt;
                            pointFMo11778f2.x = f4;
                            float f5 = pointFMo11778f2.y / fSqrt;
                            pointFMo11778f2.y = f5;
                            this.f38899k = pointFMo11778f2;
                            this.f38903o = (int) (f4 * 10000.0f);
                            this.f38904p = (int) (f5 * 10000.0f);
                            int iMo11777e = mo11777e(10000);
                            int i7 = (int) (this.f38903o * 1.2f);
                            int i8 = (int) (this.f38904p * 1.2f);
                            i38Var.f43444a = i7;
                            i38Var.f43445b = i8;
                            i38Var.f43446c = (int) (iMo11777e * 1.2f);
                            i38Var.f43448e = this.f38897i;
                            i38Var.f43449f = true;
                        }
                    } else {
                        i38Var.f43447d = this.f38889a;
                        m11787o();
                    }
                }
            }
            boolean z = i38Var.f43447d >= 0;
            i38Var.m13649a(recyclerView);
            if (z && this.f38893e) {
                this.f38892d = true;
                recyclerView.f6680z0.m17200b();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11783k(View view) {
        this.f38890b.getClass();
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        if ((o38VarM2699N != null ? o38VarM2699N.m17784d() : -1) == this.f38889a) {
            this.f38894f = view;
            if (RecyclerView.f6596Y0) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX INFO: renamed from: l */
    public void mo11784l(View view, i38 i38Var) {
        int i;
        PointF pointF = this.f38899k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iMo11774b = mo11774b(view, i);
        PointF pointF2 = this.f38899k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iMo11775c = mo11775c(view, i2);
        int iCeil = (int) Math.ceil(((double) mo11777e((int) Math.sqrt((iMo11775c * iMo11775c) + (iMo11774b * iMo11774b)))) / 0.3356d);
        if (iCeil > 0) {
            i38Var.f43444a = -iMo11774b;
            i38Var.f43445b = -iMo11775c;
            i38Var.f43446c = iCeil;
            i38Var.f43448e = this.f38898j;
            i38Var.f43449f = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11785m(int i) {
        this.f38889a = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m11786n(RecyclerView recyclerView, y28 y28Var) {
        n38 n38Var = recyclerView.f6680z0;
        n38Var.f52295g.removeCallbacks(n38Var);
        n38Var.f52291c.abortAnimation();
        if (this.f38896h) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.f38890b = recyclerView;
        this.f38891c = y28Var;
        int i = this.f38889a;
        if (i == -1) {
            C3386nv.m17626m("Invalid target position");
            return;
        }
        recyclerView.f6606C0.f46627a = i;
        this.f38893e = true;
        this.f38892d = true;
        this.f38894f = recyclerView.f6613I.mo2696q(i);
        this.f38890b.f6680z0.m17200b();
        this.f38896h = true;
    }

    /* JADX INFO: renamed from: o */
    public final void m11787o() {
        if (this.f38893e) {
            this.f38893e = false;
            this.f38904p = 0;
            this.f38903o = 0;
            this.f38899k = null;
            this.f38890b.f6606C0.f46627a = -1;
            this.f38894f = null;
            this.f38889a = -1;
            this.f38892d = false;
            y28 y28Var = this.f38891c;
            if (y28Var.f69175e == this) {
                y28Var.f69175e = null;
            }
            this.f38891c = null;
            this.f38890b = null;
        }
    }
}
