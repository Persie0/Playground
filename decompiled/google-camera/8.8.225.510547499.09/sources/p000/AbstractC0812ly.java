package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.util.ArrayList;

/* JADX INFO: renamed from: ly */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0812ly {

    /* JADX INFO: renamed from: A */
    public int f39543A;

    /* JADX INFO: renamed from: B */
    public int f39544B;

    /* JADX INFO: renamed from: C */
    public final aie f39545C;

    /* JADX INFO: renamed from: D */
    public final aie f39546D;

    /* JADX INFO: renamed from: L */
    private final InterfaceC0862nu f39547L;

    /* JADX INFO: renamed from: M */
    private final InterfaceC0862nu f39548M;

    /* JADX INFO: renamed from: p */
    C0756jw f39549p;

    /* JADX INFO: renamed from: q */
    public RecyclerView f39550q;

    /* JADX INFO: renamed from: r */
    public C0825mk f39551r;

    /* JADX INFO: renamed from: s */
    public boolean f39552s;

    /* JADX INFO: renamed from: t */
    public boolean f39553t;

    /* JADX INFO: renamed from: u */
    public final boolean f39554u;

    /* JADX INFO: renamed from: v */
    public final boolean f39555v;

    /* JADX INFO: renamed from: w */
    public int f39556w;

    /* JADX INFO: renamed from: x */
    public boolean f39557x;

    /* JADX INFO: renamed from: y */
    public int f39558y;

    /* JADX INFO: renamed from: z */
    public int f39559z;

    public AbstractC0812ly() {
        C0810lw c0810lw = new C0810lw(this, 1);
        this.f39547L = c0810lw;
        C0810lw c0810lw2 = new C0810lw(this, 0);
        this.f39548M = c0810lw2;
        this.f39545C = new aie(c0810lw);
        this.f39546D = new aie(c0810lw2);
        this.f39552s = false;
        this.f39553t = false;
        this.f39554u = true;
        this.f39555v = true;
    }

    /* JADX INFO: renamed from: aW */
    public static boolean m16127aW(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case 0:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ai */
    public static int m16128ai(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(i2, i3));
            case 1073741824:
                return size;
            default:
                return Math.max(i2, i3);
        }
    }

    /* JADX INFO: renamed from: ak */
    public static int m16129ak(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else {
                if (i4 == -1) {
                    switch (i2) {
                        case Integer.MIN_VALUE:
                        case 1073741824:
                            i4 = iMax;
                            break;
                    }
                }
                i2 = 0;
                i4 = 0;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else {
            if (i4 != -1) {
                if (i4 == -2) {
                    i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                } else {
                    i2 = 0;
                    i4 = 0;
                }
            }
            i4 = iMax;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    /* JADX INFO: renamed from: at */
    public static C0811lx m16130at(Context context, AttributeSet attributeSet, int i, int i2) {
        C0811lx c0811lx = new C0811lx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0196fu.f23572a, i, i2);
        c0811lx.f39493a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0811lx.f39494b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c0811lx.f39495c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c0811lx.f39496d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0811lx;
    }

    /* JADX INFO: renamed from: bJ */
    private final void m16131bJ(View view, int i, boolean z) {
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (z || c0829moM1197h.m16694u()) {
            this.f39550q.f1084V.m758c(c0829moM1197h);
        } else {
            this.f39550q.f1084V.m761f(c0829moM1197h);
        }
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        if (c0829moM1197h.m16673A() || c0829moM1197h.m16695v()) {
            if (c0829moM1197h.m16695v()) {
                c0829moM1197h.m16688o();
            } else {
                c0829moM1197h.m16681h();
            }
            this.f39549p.m13616h(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f39550q) {
            int iM13612d = this.f39549p.m13612d(view);
            if (i == -1) {
                i = this.f39549p.m13609a();
            }
            if (iM13612d == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f39550q.indexOfChild(view) + this.f39550q.m1257k());
            }
            if (iM13612d != i) {
                AbstractC0812ly abstractC0812ly = this.f39550q.f1124n;
                View viewM16174av = abstractC0812ly.m16174av(iM13612d);
                if (viewM16174av == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM13612d + abstractC0812ly.f39550q.toString());
                }
                abstractC0812ly.m16147aD(iM13612d);
                C0813lz c0813lz2 = (C0813lz) viewM16174av.getLayoutParams();
                C0829mo c0829moM1197h2 = RecyclerView.m1197h(viewM16174av);
                if (c0829moM1197h2.m16694u()) {
                    abstractC0812ly.f39550q.f1084V.m758c(c0829moM1197h2);
                } else {
                    abstractC0812ly.f39550q.f1084V.m761f(c0829moM1197h2);
                }
                abstractC0812ly.f39549p.m13616h(viewM16174av, i, c0813lz2, c0829moM1197h2.m16694u());
            }
        } else {
            this.f39549p.m13615g(view, i, false);
            c0813lz.f39587e = true;
            C0825mk c0825mk = this.f39551r;
            if (c0825mk != null && c0825mk.f40800f && C0825mk.m16478n(view) == c0825mk.f40796b) {
                c0825mk.f40801g = view;
            }
        }
        if (c0813lz.f39588f) {
            c0829moM1197h.f41155a.invalidate();
            c0813lz.f39588f = false;
        }
    }

    /* JADX INFO: renamed from: ba */
    public static final int m16132ba(View view) {
        return ((C0813lz) view.getLayoutParams()).f39586d.bottom;
    }

    /* JADX INFO: renamed from: bb */
    public static final int m16133bb(View view) {
        Rect rect = ((C0813lz) view.getLayoutParams()).f39586d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    /* JADX INFO: renamed from: bc */
    public static final int m16134bc(View view) {
        Rect rect = ((C0813lz) view.getLayoutParams()).f39586d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: bd */
    public static final int m16135bd(View view) {
        return ((C0813lz) view.getLayoutParams()).f39586d.left;
    }

    /* JADX INFO: renamed from: be */
    public static final int m16136be(View view) {
        return ((C0813lz) view.getLayoutParams()).m16218a();
    }

    /* JADX INFO: renamed from: bf */
    public static final int m16137bf(View view) {
        return ((C0813lz) view.getLayoutParams()).f39586d.right;
    }

    /* JADX INFO: renamed from: bh */
    public static final int m16138bh(View view) {
        return ((C0813lz) view.getLayoutParams()).f39586d.top;
    }

    /* JADX INFO: renamed from: bj */
    public static final void m16139bj(View view, int i, int i2, int i3, int i4) {
        C0813lz c0813lz = (C0813lz) view.getLayoutParams();
        Rect rect = c0813lz.f39586d;
        view.layout(i + rect.left + c0813lz.leftMargin, i2 + rect.top + c0813lz.topMargin, (i3 - rect.right) - c0813lz.rightMargin, (i4 - rect.bottom) - c0813lz.bottomMargin);
    }

    /* JADX INFO: renamed from: bo */
    public static final int m16140bo(View view) {
        return view.getBottom() + m16132ba(view);
    }

    /* JADX INFO: renamed from: bp */
    public static final int m16141bp(View view) {
        return view.getLeft() - m16135bd(view);
    }

    /* JADX INFO: renamed from: bq */
    public static final int m16142bq(View view) {
        return view.getRight() + m16137bf(view);
    }

    /* JADX INFO: renamed from: br */
    public static final int m16143br(View view) {
        return view.getTop() - m16138bh(view);
    }

    /* JADX INFO: renamed from: A */
    public int mo1141A(C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public int mo1142B(C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public int mo1143C(C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public int mo1144D(C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public int mo1145E(C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: K */
    public Parcelable mo1151K() {
        throw null;
    }

    /* JADX INFO: renamed from: M */
    public View mo1153M(int i) {
        int iM16164aj = m16164aj();
        for (int i2 = 0; i2 < iM16164aj; i2++) {
            View viewM16174av = m16174av(i2);
            C0829mo c0829moM1197h = RecyclerView.m1197h(viewM16174av);
            if (c0829moM1197h != null && c0829moM1197h.m16675b() == i && !c0829moM1197h.m16699z() && (this.f39550q.f1075M.f40922g || !c0829moM1197h.m16694u())) {
                return viewM16174av;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public void mo1154N(String str) {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            recyclerView.m1260q(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo1157Q(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f39550q;
        C0818md c0818md = recyclerView.f1116f;
        C0826ml c0826ml = recyclerView.f1075M;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f39550q.canScrollVertically(-1) && !this.f39550q.canScrollHorizontally(-1) && !this.f39550q.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC0806ls abstractC0806ls = this.f39550q.f1123m;
        if (abstractC0806ls != null) {
            accessibilityEvent.setItemCount(abstractC0806ls.mo1762a());
        }
    }

    /* JADX INFO: renamed from: R */
    public void mo1158R(Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: S */
    public void mo1159S(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: V */
    public boolean mo1162V() {
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public boolean mo1163W() {
        throw null;
    }

    /* JADX INFO: renamed from: X */
    public boolean mo1164X() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public int mo1093a(C0818md c0818md, C0826ml c0826ml) {
        return -1;
    }

    /* JADX INFO: renamed from: aA */
    public final void m16144aA(View view, int i) {
        m16131bJ(view, i, false);
    }

    /* JADX INFO: renamed from: aB */
    public final void m16145aB(View view, Rect rect) {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1253e(view));
        }
    }

    /* JADX INFO: renamed from: aC */
    public final void m16146aC(C0818md c0818md) {
        for (int iM16164aj = m16164aj() - 1; iM16164aj >= 0; iM16164aj--) {
            View viewM16174av = m16174av(iM16164aj);
            C0829mo c0829moM1197h = RecyclerView.m1197h(viewM16174av);
            if (!c0829moM1197h.m16699z()) {
                if (!c0829moM1197h.m16692s() || c0829moM1197h.m16694u() || this.f39550q.f1123m.f39115b) {
                    m16147aD(iM16164aj);
                    c0818md.m16323l(viewM16174av);
                    this.f39550q.f1084V.m761f(c0829moM1197h);
                } else {
                    m16154aO(iM16164aj);
                    c0818md.m16322k(c0829moM1197h);
                }
            }
        }
    }

    /* JADX INFO: renamed from: aD */
    public final void m16147aD(int i) {
        m16174av(i);
        this.f39549p.m13617i(i);
    }

    /* JADX INFO: renamed from: aE */
    public final void m16148aE(RecyclerView recyclerView) {
        this.f39553t = true;
        mo11868aH(recyclerView);
    }

    /* JADX INFO: renamed from: aF */
    public void mo1295aF(int i) {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            recyclerView.m1212K(i);
        }
    }

    /* JADX INFO: renamed from: aG */
    public void mo1296aG(int i) {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            recyclerView.m1213L(i);
        }
    }

    /* JADX INFO: renamed from: aH */
    public void mo11868aH(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: aI */
    public final void m16149aI(View view, agt agtVar) {
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (c0829moM1197h == null || c0829moM1197h.m16694u() || this.f39549p.m13619k(c0829moM1197h.f41155a)) {
            return;
        }
        RecyclerView recyclerView = this.f39550q;
        mo1106n(recyclerView.f1116f, recyclerView.f1075M, view, agtVar);
    }

    /* JADX INFO: renamed from: aJ */
    public void mo1297aJ(int i) {
    }

    /* JADX INFO: renamed from: aK */
    public final void m16150aK(C0818md c0818md) {
        for (int iM16164aj = m16164aj() - 1; iM16164aj >= 0; iM16164aj--) {
            if (!RecyclerView.m1197h(m16174av(iM16164aj)).m16699z()) {
                m16153aN(iM16164aj, c0818md);
            }
        }
    }

    /* JADX INFO: renamed from: aL */
    public final void m16151aL(C0818md c0818md) {
        int size = c0818md.f40021a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C0829mo) c0818md.f40021a.get(i)).f41155a;
            C0829mo c0829moM1197h = RecyclerView.m1197h(view);
            if (!c0829moM1197h.m16699z()) {
                c0829moM1197h.m16686m(false);
                if (c0829moM1197h.m16696w()) {
                    this.f39550q.removeDetachedView(view, false);
                }
                AbstractC0809lv abstractC0809lv = this.f39550q.f1068F;
                if (abstractC0809lv != null) {
                    abstractC0809lv.mo11859b(c0829moM1197h);
                }
                c0829moM1197h.m16686m(true);
                c0818md.m16318g(view);
            }
        }
        c0818md.f40021a.clear();
        ArrayList arrayList = c0818md.f40022b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f39550q.invalidate();
        }
    }

    /* JADX INFO: renamed from: aM */
    public final void m16152aM(View view, C0818md c0818md) {
        C0756jw c0756jw = this.f39549p;
        int iM1637j = c0756jw.f34934c.m1637j(view);
        if (iM1637j >= 0) {
            if (c0756jw.f34932a.m13535g(iM1637j)) {
                c0756jw.m13620l(view);
            }
            c0756jw.f34934c.m1640m(iM1637j);
        }
        c0818md.m16321j(view);
    }

    /* JADX INFO: renamed from: aN */
    public final void m16153aN(int i, C0818md c0818md) {
        View viewM16174av = m16174av(i);
        m16154aO(i);
        c0818md.m16321j(viewM16174av);
    }

    /* JADX INFO: renamed from: aO */
    public final void m16154aO(int i) {
        C0756jw c0756jw;
        int iM13610b;
        View viewM1638k;
        if (m16174av(i) == null || (viewM1638k = c0756jw.f34934c.m1638k((iM13610b = (c0756jw = this.f39549p).m13610b(i)))) == null) {
            return;
        }
        if (c0756jw.f34932a.m13535g(iM13610b)) {
            c0756jw.m13620l(viewM1638k);
        }
        c0756jw.f34934c.m1640m(iM13610b);
    }

    /* JADX INFO: renamed from: aP */
    public final void m16155aP() {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: renamed from: aQ */
    public final void m16156aQ(RecyclerView recyclerView) {
        m16157aR(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* JADX INFO: renamed from: aR */
    public final void m16157aR(int i, int i2) {
        this.f39543A = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f39558y = mode;
        if (mode == 0 && !RecyclerView.f1056a) {
            this.f39543A = 0;
        }
        this.f39544B = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f39559z = mode2;
        if (mode2 != 0 || RecyclerView.f1056a) {
            return;
        }
        this.f39544B = 0;
    }

    /* JADX INFO: renamed from: aS */
    public final void m16158aS(int i, int i2) {
        this.f39550q.setMeasuredDimension(i, i2);
    }

    /* JADX INFO: renamed from: aT */
    public final void m16159aT(int i, int i2) {
        int iM16164aj = m16164aj();
        if (iM16164aj == 0) {
            this.f39550q.m1264v(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iM16164aj; i7++) {
            View viewM16174av = m16174av(i7);
            Rect rect = this.f39550q.f1121k;
            RecyclerView.m1176F(viewM16174av, rect);
            if (rect.left < i5) {
                i5 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i6) {
                i6 = rect.top;
            }
            if (rect.bottom > i4) {
                i4 = rect.bottom;
            }
        }
        this.f39550q.f1121k.set(i5, i6, i3, i4);
        mo1109q(this.f39550q.f1121k, i, i2);
    }

    /* JADX INFO: renamed from: aU */
    public final void m16160aU(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f39550q = null;
            this.f39549p = null;
            this.f39543A = 0;
            this.f39544B = 0;
        } else {
            this.f39550q = recyclerView;
            this.f39549p = recyclerView.f1118h;
            this.f39543A = recyclerView.getWidth();
            this.f39544B = recyclerView.getHeight();
        }
        this.f39558y = 1073741824;
        this.f39559z = 1073741824;
    }

    /* JADX INFO: renamed from: aV */
    public final void m16161aV(C0825mk c0825mk) {
        C0825mk c0825mk2 = this.f39551r;
        if (c0825mk2 != null && c0825mk != c0825mk2 && c0825mk2.f40800f) {
            c0825mk2.m16483f();
        }
        this.f39551r = c0825mk;
        RecyclerView recyclerView = this.f39550q;
        recyclerView.f1072J.m16651d();
        if (c0825mk.f40802h) {
            Log.w("RecyclerView", "An instance of " + c0825mk.getClass().getSimpleName() + " was started more than once. Each instance of" + c0825mk.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0825mk.f40797c = recyclerView;
        c0825mk.f40798d = this;
        int i = c0825mk.f40796b;
        if (i == -1) {
            throw new IllegalArgumentException(xPAWq.pvnegaKTMuPiFNM);
        }
        RecyclerView recyclerView2 = c0825mk.f40797c;
        recyclerView2.f1075M.f40916a = i;
        c0825mk.f40800f = true;
        c0825mk.f40799e = true;
        c0825mk.f40801g = recyclerView2.f1124n.mo1153M(c0825mk.f40796b);
        c0825mk.f40797c.f1072J.m16649b();
        c0825mk.f40802h = true;
    }

    /* JADX INFO: renamed from: aX */
    public final boolean m16162aX() {
        C0825mk c0825mk = this.f39551r;
        return c0825mk != null && c0825mk.f40800f;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX INFO: renamed from: aY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2043aY(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] iArr = new int[2];
        int iM16170aq = m16170aq();
        int iM16172as = m16172as();
        int iM16171ar = this.f39543A - m16171ar();
        int iM16169ap = this.f39544B - m16169ap();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iM16170aq;
        int i2 = top - iM16172as;
        int i3 = iHeight - iM16169ap;
        int i4 = 0;
        int iMin = Math.min(0, i);
        int i5 = iWidth - iM16171ar;
        int iMin2 = Math.min(0, i2);
        int iMax = Math.max(0, i5);
        int iMax2 = Math.max(0, i3);
        if (m16166am() == 1) {
            iMin = iMax != 0 ? iMax : Math.max(iMin, i5);
        } else if (iMin == 0) {
            iMin = Math.min(i, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        iArr[0] = iMin;
        iArr[1] = iMin2;
        if (!z2) {
            if (iMin == 0) {
                i4 = iMin;
            }
            if (z) {
                recyclerView.scrollBy(i4, iMin2);
            } else {
                recyclerView.m1230ac(i4, iMin2);
            }
            return true;
        }
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild != null) {
            int iM16170aq2 = m16170aq();
            int iM16172as2 = m16172as();
            int iM16171ar2 = this.f39543A - m16171ar();
            int iM16169ap2 = this.f39544B - m16169ap();
            Rect rect2 = this.f39550q.f1121k;
            RecyclerView.m1176F(focusedChild, rect2);
            if (rect2.left - iMin < iM16171ar2 && rect2.right - iMin > iM16170aq2 && rect2.top - iMin2 < iM16169ap2 && rect2.bottom - iMin2 > iM16172as2) {
                if (iMin == 0) {
                    i4 = iMin;
                }
                if (z) {
                    recyclerView.scrollBy(i4, iMin2);
                } else {
                    recyclerView.m1230ac(i4, iMin2);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: aZ */
    public final boolean m16163aZ(View view, int i, int i2, C0813lz c0813lz) {
        return (!view.isLayoutRequested() && this.f39554u && m16127aW(view.getWidth(), i, c0813lz.width) && m16127aW(view.getHeight(), i2, c0813lz.height)) ? false : true;
    }

    /* JADX INFO: renamed from: aa */
    public boolean mo1167aa() {
        return false;
    }

    /* JADX INFO: renamed from: ab */
    public void mo1168ab(int i, int i2, C0826ml c0826ml, C0778kr c0778kr) {
    }

    /* JADX INFO: renamed from: ac */
    public void mo1169ac(int i, C0778kr c0778kr) {
    }

    /* JADX INFO: renamed from: ag */
    public void mo1173ag(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: ah */
    public void mo1174ah(RecyclerView recyclerView, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: aj */
    public final int m16164aj() {
        C0756jw c0756jw = this.f39549p;
        if (c0756jw != null) {
            return c0756jw.m13609a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: al */
    public final int m16165al() {
        RecyclerView recyclerView = this.f39550q;
        AbstractC0806ls abstractC0806ls = recyclerView != null ? recyclerView.f1123m : null;
        if (abstractC0806ls != null) {
            return abstractC0806ls.mo1762a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: am */
    public final int m16166am() {
        return afc.m442c(this.f39550q);
    }

    /* JADX INFO: renamed from: an */
    public final int m16167an() {
        return afb.m421b(this.f39550q);
    }

    /* JADX INFO: renamed from: ao */
    public final int m16168ao() {
        return afb.m422c(this.f39550q);
    }

    /* JADX INFO: renamed from: ap */
    public final int m16169ap() {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: renamed from: aq */
    public final int m16170aq() {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ar */
    public final int m16171ar() {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: as */
    public final int m16172as() {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* JADX INFO: renamed from: au */
    public final View m16173au(View view) {
        View viewM1256j;
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView == null || (viewM1256j = recyclerView.m1256j(view)) == null || this.f39549p.m13619k(viewM1256j)) {
            return null;
        }
        return viewM1256j;
    }

    /* JADX INFO: renamed from: av */
    public final View m16174av(int i) {
        C0756jw c0756jw = this.f39549p;
        if (c0756jw != null) {
            return c0756jw.m13613e(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: aw */
    public final View m16175aw() {
        View focusedChild;
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f39549p.m13619k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    /* JADX INFO: renamed from: ax */
    public final void m16176ax(View view) {
        m16177ay(view, -1);
    }

    /* JADX INFO: renamed from: ay */
    public final void m16177ay(View view, int i) {
        m16131bJ(view, i, true);
    }

    /* JADX INFO: renamed from: az */
    public final void m16178az(View view) {
        m16144aA(view, -1);
    }

    /* JADX INFO: renamed from: b */
    public int mo1094b(C0818md c0818md, C0826ml c0826ml) {
        return -1;
    }

    /* JADX INFO: renamed from: bg */
    public int mo11869bg() {
        return 0;
    }

    /* JADX INFO: renamed from: bi */
    public final void m16179bi(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0813lz) view.getLayoutParams()).f39586d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f39550q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f39550q.f1122l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* JADX INFO: renamed from: bk */
    public void mo1298bk() {
    }

    /* JADX INFO: renamed from: bl */
    public final void m16180bl(int i, int i2) {
        this.f39550q.m1264v(i, i2);
    }

    /* JADX INFO: renamed from: bm */
    public final void m16181bm(Runnable runnable) {
        RecyclerView recyclerView = this.f39550q;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: bn */
    public final void m16182bn(RecyclerView recyclerView) {
        this.f39553t = false;
        mo1173ag(recyclerView);
    }

    /* JADX INFO: renamed from: bs */
    public final boolean m16183bs(int i) {
        int iM16172as;
        int iM16170aq;
        int i2 = 0;
        if (this.f39550q == null) {
            return false;
        }
        int iHeight = this.f39544B;
        int iWidth = this.f39543A;
        Rect rect = new Rect();
        if (this.f39550q.getMatrix().isIdentity() && this.f39550q.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        switch (i) {
            case 4096:
                iM16172as = this.f39550q.canScrollVertically(1) ? (iHeight - m16172as()) - m16169ap() : 0;
                iM16170aq = !this.f39550q.canScrollHorizontally(1) ? 0 : (iWidth - m16170aq()) - m16171ar();
                break;
            case 8192:
                iM16172as = this.f39550q.canScrollVertically(-1) ? -((iHeight - m16172as()) - m16169ap()) : 0;
                iM16170aq = !this.f39550q.canScrollHorizontally(-1) ? 0 : -((iWidth - m16170aq()) - m16171ar());
                break;
            default:
                iM16172as = 0;
                iM16170aq = 0;
                break;
        }
        if (iM16172as != 0) {
            i2 = iM16172as;
        } else if (iM16170aq == 0) {
            return false;
        }
        this.f39550q.m1244at(iM16170aq, i2, true);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public int mo1096d(int i, C0818md c0818md, C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public int mo1097e(int i, C0818md c0818md, C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public abstract C0813lz mo1098f();

    /* JADX INFO: renamed from: g */
    public C0813lz mo1099g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0813lz) {
            return new C0813lz((C0813lz) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0813lz((ViewGroup.MarginLayoutParams) layoutParams) : new C0813lz(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public C0813lz mo1100h(Context context, AttributeSet attributeSet) {
        return new C0813lz(context, attributeSet);
    }

    /* JADX INFO: renamed from: j */
    public View mo1102j(View view, int i, C0818md c0818md, C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public void mo1105m(C0818md c0818md, C0826ml c0826ml, agt agtVar) {
        if (this.f39550q.canScrollVertically(-1) || this.f39550q.canScrollHorizontally(-1)) {
            agtVar.m627e(8192);
            agtVar.m636n(true);
        }
        if (this.f39550q.canScrollVertically(1) || this.f39550q.canScrollHorizontally(1)) {
            agtVar.m627e(4096);
            agtVar.m636n(true);
        }
        agtVar.m633k(bkn.m2549A(mo1094b(c0818md, c0826ml), mo1093a(c0818md, c0826ml), mo11869bg()));
    }

    /* JADX INFO: renamed from: n */
    public void mo1106n(C0818md c0818md, C0826ml c0826ml, View view, agt agtVar) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1107o(C0818md c0818md, C0826ml c0826ml) {
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public void mo1108p(C0826ml c0826ml) {
    }

    /* JADX INFO: renamed from: q */
    public void mo1109q(Rect rect, int i, int i2) {
        m16158aS(m16128ai(i, rect.width() + m16170aq() + m16171ar(), m16168ao()), m16128ai(i2, rect.height() + m16172as() + m16169ap(), m16167an()));
    }

    /* JADX INFO: renamed from: s */
    public boolean mo1111s(C0813lz c0813lz) {
        return c0813lz != null;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo1112t() {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public void mo1114v(int i, int i2) {
    }

    /* JADX INFO: renamed from: w */
    public void mo1115w() {
    }

    /* JADX INFO: renamed from: x */
    public void mo1116x(int i, int i2) {
    }

    /* JADX INFO: renamed from: y */
    public void mo1117y(int i, int i2) {
    }

    /* JADX INFO: renamed from: z */
    public int mo1175z(C0826ml c0826ml) {
        throw null;
    }
}
