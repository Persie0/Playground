package p000;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserverInterface;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aui extends C0167es {

    /* JADX INFO: renamed from: a */
    public int f2411a;

    /* JADX INFO: renamed from: b */
    public int f2412b;

    /* JADX INFO: renamed from: c */
    public final auh f2413c;

    /* JADX INFO: renamed from: d */
    public int f2414d;

    /* JADX INFO: renamed from: e */
    public boolean f2415e;

    /* JADX INFO: renamed from: f */
    public AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC f2416f;

    /* JADX INFO: renamed from: g */
    private final ViewPager2 f2417g;

    /* JADX INFO: renamed from: h */
    private final RecyclerView f2418h;

    /* JADX INFO: renamed from: i */
    private final LinearLayoutManager f2419i;

    /* JADX INFO: renamed from: j */
    private int f2420j;

    /* JADX INFO: renamed from: k */
    private boolean f2421k;

    /* JADX INFO: renamed from: l */
    private boolean f2422l;

    public aui(ViewPager2 viewPager2) {
        this.f2417g = viewPager2;
        RecyclerView recyclerView = viewPager2.f1670e;
        this.f2418h = recyclerView;
        this.f2419i = (LinearLayoutManager) recyclerView.f1124n;
        this.f2413c = new auh();
        m2032l();
    }

    /* JADX INFO: renamed from: k */
    private final void m2031k(int i, float f, int i2) {
        AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC cc = this.f2416f;
        if (cc != null) {
            cc.mo1626b(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m2032l() {
        this.f2411a = 0;
        this.f2412b = 0;
        this.f2413c.m2030a();
        this.f2420j = -1;
        this.f2414d = -1;
        this.f2421k = false;
        this.f2422l = false;
        this.f2415e = false;
    }

    /* JADX INFO: renamed from: m */
    private final boolean m2033m() {
        return this.f2411a == 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // p000.C0167es
    /* JADX INFO: renamed from: c */
    public final void mo2034c(RecyclerView recyclerView, int i, int i2) {
        auh auhVar;
        int i3;
        this.f2422l = true;
        m2038i();
        if (this.f2421k) {
            this.f2421k = false;
            if (i2 > 0) {
                auhVar = this.f2413c;
                if (auhVar.f2410c != 0) {
                    i3 = auhVar.f2408a + 1;
                } else {
                    i3 = this.f2413c.f2408a;
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f2417g.m1564g()) {
                        auhVar = this.f2413c;
                        if (auhVar.f2410c != 0) {
                            i3 = auhVar.f2408a + 1;
                        }
                    }
                }
                i3 = this.f2413c.f2408a;
            }
            this.f2414d = i3;
            if (this.f2420j != i3) {
                m2036g(i3);
            }
        } else if (this.f2411a == 0) {
            int i4 = this.f2413c.f2408a;
            if (i4 == -1) {
                i4 = 0;
            }
            m2036g(i4);
        }
        auh auhVar2 = this.f2413c;
        int i5 = auhVar2.f2408a;
        if (i5 == -1) {
            i5 = 0;
        }
        m2031k(i5, auhVar2.f2409b, auhVar2.f2410c);
        auh auhVar3 = this.f2413c;
        int i6 = auhVar3.f2408a;
        int i7 = this.f2414d;
        if ((i6 == i7 || i7 == -1) && auhVar3.f2410c == 0 && this.f2412b != 1) {
            m2037h(0);
            m2032l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2036g(int i) {
        AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC cc = this.f2416f;
        if (cc != null) {
            cc.mo1627c(i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2037h(int i) {
        if ((this.f2411a == 3 && this.f2412b == 0) || this.f2412b == i) {
            return;
        }
        this.f2412b = i;
        AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC cc = this.f2416f;
        if (cc != null) {
            cc.mo1625a(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[LOOP:2: B:56:0x0120->B:59:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x012f A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final void m2038i() {
        int i;
        int top;
        int iM16164aj;
        int i2;
        int bottom;
        int i3;
        auh auhVar = this.f2413c;
        int iM1148H = this.f2419i.m1148H();
        auhVar.f2408a = iM1148H;
        if (iM1148H == -1) {
            auhVar.m2030a();
            return;
        }
        View viewMo1153M = this.f2419i.mo1153M(iM1148H);
        if (viewMo1153M == null) {
            auhVar.m2030a();
            return;
        }
        int iBd = LinearLayoutManager.m16135bd(viewMo1153M);
        int iBf = LinearLayoutManager.m16137bf(viewMo1153M);
        int iBh = LinearLayoutManager.m16138bh(viewMo1153M);
        int iBa = LinearLayoutManager.m16132ba(viewMo1153M);
        ViewGroup.LayoutParams layoutParams = viewMo1153M.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iBd += marginLayoutParams.leftMargin;
            iBf += marginLayoutParams.rightMargin;
            iBh += marginLayoutParams.topMargin;
            iBa += marginLayoutParams.bottomMargin;
        }
        int height = viewMo1153M.getHeight() + iBh;
        int width = viewMo1153M.getWidth() + iBd;
        if (this.f2419i.f1048i == 0) {
            i = width + iBf;
            top = (viewMo1153M.getLeft() - iBd) - this.f2418h.getPaddingLeft();
            if (this.f2417g.m1564g()) {
                top = -top;
            }
        } else {
            i = height + iBa;
            top = (viewMo1153M.getTop() - iBh) - this.f2418h.getPaddingTop();
        }
        int i4 = -top;
        auhVar.f2410c = i4;
        if (i4 >= 0) {
            auhVar.f2409b = i == 0 ? 0.0f : i4 / i;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = aue.f2406a;
        LinearLayoutManager linearLayoutManager = this.f2419i;
        int iM16164aj2 = linearLayoutManager.m16164aj();
        if (iM16164aj2 != 0) {
            int i5 = linearLayoutManager.f1048i ^ 1;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM16164aj2, 2);
            for (int i6 = 0; i6 < iM16164aj2; i6++) {
                View viewM16174av = linearLayoutManager.m16174av(i6);
                if (viewM16174av == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewM16174av.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : aue.f2406a;
                iArr[i6][0] = i5 != 0 ? viewM16174av.getLeft() - marginLayoutParams3.leftMargin : viewM16174av.getTop() - marginLayoutParams3.topMargin;
                int[] iArr2 = iArr[i6];
                if (i5 != 0) {
                    bottom = viewM16174av.getRight();
                    i3 = marginLayoutParams3.rightMargin;
                } else {
                    bottom = viewM16174av.getBottom();
                    i3 = marginLayoutParams3.bottomMargin;
                }
                iArr2[1] = bottom + i3;
            }
            Arrays.sort(iArr, new C1143ye(3));
            int i7 = 1;
            while (true) {
                if (i7 >= iM16164aj2) {
                    int[] iArr3 = iArr[0];
                    int i8 = iArr3[1];
                    int i9 = iArr3[0];
                    int i10 = i8 - i9;
                    if (i9 <= 0 && iArr[iM16164aj2 - 1][1] >= i10) {
                        if (linearLayoutManager.m16164aj() <= 1) {
                        }
                    }
                } else if (iArr[i7 - 1][1] == iArr[i7][0]) {
                    i7++;
                }
                iM16164aj = linearLayoutManager.m16164aj();
                for (i2 = 0; i2 < iM16164aj; i2++) {
                    if (!aue.m2027a(linearLayoutManager.m16174av(i2))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.m16164aj() <= 1) {
            iM16164aj = linearLayoutManager.m16164aj();
            while (i2 < iM16164aj) {
                if (!aue.m2027a(linearLayoutManager.m16174av(i2))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(auhVar.f2410c)));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2039j() {
        return this.f2412b == 0;
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: d */
    public final void mo2035d(int i) {
        if (!(this.f2411a == 1 && this.f2412b == 1) && i == 1) {
            this.f2411a = 1;
            int i2 = this.f2414d;
            if (i2 != -1) {
                this.f2420j = i2;
                this.f2414d = -1;
            } else if (this.f2420j == -1) {
                this.f2420j = this.f2419i.m1148H();
            }
            m2037h(1);
            return;
        }
        if (m2033m() && i == 2) {
            if (this.f2422l) {
                m2037h(2);
                this.f2421k = true;
                return;
            }
            return;
        }
        if (m2033m() && i == 0) {
            m2038i();
            if (this.f2422l) {
                auh auhVar = this.f2413c;
                if (auhVar.f2410c == 0) {
                    int i3 = this.f2420j;
                    int i4 = auhVar.f2408a;
                    if (i3 != i4) {
                        m2036g(i4);
                    }
                }
            } else {
                int i5 = this.f2413c.f2408a;
                if (i5 != -1) {
                    m2031k(i5, 0.0f, 0);
                }
            }
            m2037h(0);
            m2032l();
        }
        if (this.f2411a == 2 && i == 0 && this.f2415e) {
            m2038i();
            auh auhVar2 = this.f2413c;
            if (auhVar2.f2410c == 0) {
                int i6 = this.f2414d;
                int i7 = auhVar2.f2408a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    m2036g(i7);
                }
                m2037h(0);
                m2032l();
            }
        }
    }
}
