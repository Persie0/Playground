package p000;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.lens.sdk.LensApi;

/* JADX INFO: renamed from: mk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0825mk {

    /* JADX INFO: renamed from: a */
    private final C0823mi f40795a;

    /* JADX INFO: renamed from: b */
    public int f40796b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f40797c;

    /* JADX INFO: renamed from: d */
    public AbstractC0812ly f40798d;

    /* JADX INFO: renamed from: e */
    public boolean f40799e;

    /* JADX INFO: renamed from: f */
    public boolean f40800f;

    /* JADX INFO: renamed from: g */
    public View f40801g;

    /* JADX INFO: renamed from: h */
    public boolean f40802h;

    /* JADX INFO: renamed from: i */
    protected final LinearInterpolator f40803i;

    /* JADX INFO: renamed from: j */
    protected final DecelerateInterpolator f40804j;

    /* JADX INFO: renamed from: k */
    protected PointF f40805k;

    /* JADX INFO: renamed from: l */
    protected int f40806l;

    /* JADX INFO: renamed from: m */
    protected int f40807m;

    /* JADX INFO: renamed from: n */
    private final DisplayMetrics f40808n;

    /* JADX INFO: renamed from: o */
    private boolean f40809o;

    /* JADX INFO: renamed from: p */
    private float f40810p;

    public C0825mk(Context context) {
        this.f40796b = -1;
        this.f40795a = new C0823mi();
        this.f40803i = new LinearInterpolator();
        this.f40804j = new DecelerateInterpolator();
        this.f40809o = false;
        this.f40806l = 0;
        this.f40807m = 0;
        this.f40808n = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: n */
    public static final int m16478n(View view) {
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (c0829moM1197h != null) {
            return c0829moM1197h.m16675b();
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    protected static final void m16479o(PointF pointF) {
        float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    /* JADX INFO: renamed from: p */
    private static int m16480p(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    protected float mo11878a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: b */
    protected int mo15850b(int i) {
        float fAbs = Math.abs(i);
        if (!this.f40809o) {
            this.f40810p = mo11878a(this.f40808n);
            this.f40809o = true;
        }
        return (int) Math.ceil(fAbs * this.f40810p);
    }

    /* JADX INFO: renamed from: c */
    protected void mo11885c(View view, C0823mi c0823mi) {
        int iMo11880h = mo11880h(view, mo11882k());
        int iMo11881i = mo11881i(view, mo11883l());
        int iMo11886j = mo11886j((int) Math.sqrt((iMo11880h * iMo11880h) + (iMo11881i * iMo11881i)));
        if (iMo11886j > 0) {
            c0823mi.m16399b(-iMo11880h, -iMo11881i, iMo11886j, this.f40804j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final PointF m16481d(int i) {
        Object obj = this.f40798d;
        if (obj instanceof InterfaceC0824mj) {
            return ((InterfaceC0824mj) obj).mo1150J(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(InterfaceC0824mj.class.getCanonicalName())));
        return null;
    }

    /* JADX INFO: renamed from: e */
    final void m16482e(int i, int i2) {
        PointF pointFM16481d;
        RecyclerView recyclerView = this.f40797c;
        if (this.f40796b == -1 || recyclerView == null) {
            m16483f();
        }
        if (this.f40799e && this.f40801g == null && this.f40798d != null && (pointFM16481d = m16481d(this.f40796b)) != null && (pointFM16481d.x != 0.0f || pointFM16481d.y != 0.0f)) {
            recyclerView.m1223V((int) Math.signum(pointFM16481d.x), (int) Math.signum(pointFM16481d.y), null);
        }
        this.f40799e = false;
        View view = this.f40801g;
        if (view != null) {
            if (m16478n(view) == this.f40796b) {
                View view2 = this.f40801g;
                C0826ml c0826ml = recyclerView.f1075M;
                mo11885c(view2, this.f40795a);
                this.f40795a.m16398a(recyclerView);
                m16483f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f40801g = null;
            }
        }
        if (this.f40800f) {
            C0826ml c0826ml2 = recyclerView.f1075M;
            C0823mi c0823mi = this.f40795a;
            if (this.f40797c.f1124n.m16164aj() == 0) {
                m16483f();
            } else {
                int iM16480p = m16480p(this.f40806l, i);
                this.f40806l = iM16480p;
                int iM16480p2 = m16480p(this.f40807m, i2);
                this.f40807m = iM16480p2;
                if (iM16480p == 0 && iM16480p2 == 0) {
                    mo11887m(c0823mi);
                }
            }
            C0823mi c0823mi2 = this.f40795a;
            int i3 = c0823mi2.f40571a;
            c0823mi2.m16398a(recyclerView);
            if (i3 < 0 || !this.f40800f) {
                return;
            }
            this.f40799e = true;
            recyclerView.f1072J.m16649b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16483f() {
        if (this.f40800f) {
            this.f40800f = false;
            this.f40807m = 0;
            this.f40806l = 0;
            this.f40805k = null;
            this.f40797c.f1075M.f40916a = -1;
            this.f40801g = null;
            this.f40796b = -1;
            this.f40799e = false;
            AbstractC0812ly abstractC0812ly = this.f40798d;
            if (abstractC0812ly.f39551r == this) {
                abstractC0812ly.f39551r = null;
            }
            this.f40798d = null;
            this.f40797c = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public int mo11879g(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            default:
                return i4 - i2;
        }
    }

    /* JADX INFO: renamed from: h */
    public int mo11880h(View view, int i) {
        AbstractC0812ly abstractC0812ly = this.f40798d;
        if (abstractC0812ly == null || !abstractC0812ly.mo1162V()) {
            return 0;
        }
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return mo11879g(AbstractC0812ly.m16141bp(view) - c0813lz.leftMargin, AbstractC0812ly.m16142bq(view) + c0813lz.rightMargin, abstractC0812ly.m16170aq(), abstractC0812ly.f39543A - abstractC0812ly.m16171ar(), i);
    }

    /* JADX INFO: renamed from: i */
    public int mo11881i(View view, int i) {
        AbstractC0812ly abstractC0812ly = this.f40798d;
        if (abstractC0812ly == null || !abstractC0812ly.mo1163W()) {
            return 0;
        }
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        return mo11879g(AbstractC0812ly.m16143br(view) - c0813lz.topMargin, AbstractC0812ly.m16140bo(view) + c0813lz.bottomMargin, abstractC0812ly.m16172as(), abstractC0812ly.f39544B - abstractC0812ly.m16169ap(), i);
    }

    /* JADX INFO: renamed from: j */
    protected int mo11886j(int i) {
        double dMo15850b = mo15850b(i);
        Double.isNaN(dMo15850b);
        return (int) Math.ceil(dMo15850b / 0.3356d);
    }

    /* JADX INFO: renamed from: k */
    protected int mo11882k() {
        PointF pointF = this.f40805k;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.f40805k.x <= 0.0f ? -1 : 1;
    }

    /* JADX INFO: renamed from: l */
    protected int mo11883l() {
        PointF pointF = this.f40805k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.f40805k.y <= 0.0f ? -1 : 1;
    }

    /* JADX INFO: renamed from: m */
    protected void mo11887m(C0823mi c0823mi) {
        PointF pointFM16481d = m16481d(this.f40796b);
        if (pointFM16481d == null || (pointFM16481d.x == 0.0f && pointFM16481d.y == 0.0f)) {
            c0823mi.f40571a = this.f40796b;
            m16483f();
            return;
        }
        m16479o(pointFM16481d);
        this.f40805k = pointFM16481d;
        this.f40806l = (int) (pointFM16481d.x * 10000.0f);
        this.f40807m = (int) (pointFM16481d.y * 10000.0f);
        int iMo15850b = mo15850b(10000);
        c0823mi.m16399b((int) (this.f40806l * 1.2f), (int) (this.f40807m * 1.2f), (int) (iMo15850b * 1.2f), this.f40803i);
    }

    public C0825mk() {
        this.f40796b = -1;
        this.f40795a = new C0823mi();
    }
}
