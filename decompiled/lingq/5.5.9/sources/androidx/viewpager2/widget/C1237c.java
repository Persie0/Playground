package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import p006a5.C0018a;
import p006a5.C0019b;

/* JADX INFO: renamed from: androidx.viewpager2.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1237c extends RecyclerView.AbstractC1125r {

    /* JADX INFO: renamed from: a */
    public ViewPager2.AbstractC1229e f7768a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f7769b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f7770c;

    /* JADX INFO: renamed from: d */
    public final LinearLayoutManager f7771d;

    /* JADX INFO: renamed from: e */
    public int f7772e;

    /* JADX INFO: renamed from: f */
    public int f7773f;

    /* JADX INFO: renamed from: g */
    public final a f7774g;

    /* JADX INFO: renamed from: h */
    public int f7775h;

    /* JADX INFO: renamed from: i */
    public int f7776i;

    /* JADX INFO: renamed from: j */
    public boolean f7777j;

    /* JADX INFO: renamed from: k */
    public boolean f7778k;

    /* JADX INFO: renamed from: l */
    public boolean f7779l;

    /* JADX INFO: renamed from: m */
    public boolean f7780m;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f7781a;

        /* JADX INFO: renamed from: b */
        public float f7782b;

        /* JADX INFO: renamed from: c */
        public int f7783c;
    }

    public C1237c(ViewPager2 viewPager2) {
        this.f7769b = viewPager2;
        ViewPager2.C1233i c1233i = viewPager2.f7749j;
        this.f7770c = c1233i;
        this.f7771d = (LinearLayoutManager) c1233i.getLayoutManager();
        this.f7774g = new a();
        m4692e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: a */
    public final void mo4339a(int i10, RecyclerView recyclerView) {
        ViewPager2.AbstractC1229e abstractC1229e;
        int i11 = this.f7772e;
        boolean z10 = true;
        if (!(i11 == 1 && this.f7773f == 1) && i10 == 1) {
            this.f7780m = false;
            this.f7772e = 1;
            int i12 = this.f7776i;
            if (i12 != -1) {
                this.f7775h = i12;
                this.f7776i = -1;
            } else if (this.f7775h == -1) {
                this.f7775h = this.f7771d.m4121R0();
            }
            m4691d(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f7778k) {
                m4691d(2);
                this.f7777j = true;
            }
            return;
        }
        boolean z11 = i11 == 1 || i11 == 4;
        a aVar = this.f7774g;
        if (z11 && i10 == 0) {
            m4693f();
            if (!this.f7778k) {
                int i13 = aVar.f7781a;
                if (i13 != -1 && (abstractC1229e = this.f7768a) != null) {
                    abstractC1229e.mo4686b(0.0f, i13, 0);
                }
            } else if (aVar.f7783c == 0) {
                int i14 = this.f7775h;
                int i15 = aVar.f7781a;
                if (i14 != i15) {
                    m4690c(i15);
                }
            } else {
                z10 = false;
            }
            if (z10) {
                m4691d(0);
                m4692e();
            }
        }
        if (this.f7772e == 2 && i10 == 0 && this.f7779l) {
            m4693f();
            if (aVar.f7783c == 0) {
                int i16 = this.f7776i;
                int i17 = aVar.f7781a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    m4690c(i17);
                }
                m4691d(0);
                m4692e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: b */
    public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        int i12;
        this.f7778k = true;
        m4693f();
        boolean z11 = this.f7777j;
        a aVar = this.f7774g;
        if (z11) {
            this.f7777j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                    if ((i10 < 0) == (this.f7769b.f7746g.m4299D() == 1)) {
                    }
                    if (z10 || aVar.f7783c == 0) {
                        i12 = aVar.f7781a;
                    } else {
                        i12 = aVar.f7781a + 1;
                    }
                    this.f7776i = i12;
                    if (this.f7775h != i12) {
                        m4690c(i12);
                    }
                }
                z10 = false;
                if (z10) {
                    i12 = aVar.f7781a;
                } else {
                    i12 = aVar.f7781a;
                }
                this.f7776i = i12;
                if (this.f7775h != i12) {
                    m4690c(i12);
                }
            }
            z10 = true;
            if (z10) {
                i12 = aVar.f7781a;
            } else {
                i12 = aVar.f7781a;
            }
            this.f7776i = i12;
            if (this.f7775h != i12) {
                m4690c(i12);
            }
        } else if (this.f7772e == 0) {
            int i13 = aVar.f7781a;
            if (i13 == -1) {
                i13 = 0;
            }
            m4690c(i13);
        }
        int i14 = aVar.f7781a;
        if (i14 == -1) {
            i14 = 0;
        }
        float f3 = aVar.f7782b;
        int i15 = aVar.f7783c;
        ViewPager2.AbstractC1229e abstractC1229e = this.f7768a;
        if (abstractC1229e != null) {
            abstractC1229e.mo4686b(f3, i14, i15);
        }
        int i16 = aVar.f7781a;
        int i17 = this.f7776i;
        if ((i16 == i17 || i17 == -1) && aVar.f7783c == 0 && this.f7773f != 1) {
            m4691d(0);
            m4692e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4690c(int i10) {
        ViewPager2.AbstractC1229e abstractC1229e = this.f7768a;
        if (abstractC1229e != null) {
            abstractC1229e.mo4681c(i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4691d(int i10) {
        if ((this.f7772e != 3 || this.f7773f != 0) && this.f7773f != i10) {
            this.f7773f = i10;
            ViewPager2.AbstractC1229e abstractC1229e = this.f7768a;
            if (abstractC1229e != null) {
                abstractC1229e.mo4680a(i10);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4692e() {
        this.f7772e = 0;
        this.f7773f = 0;
        a aVar = this.f7774g;
        aVar.f7781a = -1;
        aVar.f7782b = 0.0f;
        aVar.f7783c = 0;
        this.f7775h = -1;
        this.f7776i = -1;
        this.f7777j = false;
        this.f7778k = false;
        this.f7780m = false;
        this.f7779l = false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b A[LOOP:0: B:72:0x017a->B:76:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0188 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m4693f() {
        int top;
        boolean z10;
        int top2;
        int i10;
        int bottom;
        int i11;
        int iM4326y;
        int i12;
        boolean z11;
        boolean z12;
        LinearLayoutManager linearLayoutManager = this.f7771d;
        int iM4121R0 = linearLayoutManager.m4121R0();
        a aVar = this.f7774g;
        aVar.f7781a = iM4121R0;
        float f3 = 0.0f;
        if (iM4121R0 == -1) {
            aVar.f7781a = -1;
            aVar.f7782b = 0.0f;
            aVar.f7783c = 0;
            return;
        }
        View viewMo4152s = linearLayoutManager.mo4152s(iM4121R0);
        if (viewMo4152s == null) {
            aVar.f7781a = -1;
            aVar.f7782b = 0.0f;
            aVar.f7783c = 0;
            return;
        }
        int iM4285E = RecyclerView.AbstractC1120m.m4285E(viewMo4152s);
        int iM4288L = RecyclerView.AbstractC1120m.m4288L(viewMo4152s);
        int iM4289N = RecyclerView.AbstractC1120m.m4289N(viewMo4152s);
        int iM4293w = RecyclerView.AbstractC1120m.m4293w(viewMo4152s);
        ViewGroup.LayoutParams layoutParams = viewMo4152s.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iM4285E += marginLayoutParams.leftMargin;
            iM4288L += marginLayoutParams.rightMargin;
            iM4289N += marginLayoutParams.topMargin;
            iM4293w += marginLayoutParams.bottomMargin;
        }
        int height = viewMo4152s.getHeight() + iM4289N + iM4293w;
        int width = viewMo4152s.getWidth() + iM4285E + iM4288L;
        boolean z13 = linearLayoutManager.f6921p == 0;
        RecyclerView recyclerView = this.f7770c;
        if (z13) {
            top = (viewMo4152s.getLeft() - iM4285E) - recyclerView.getPaddingLeft();
            if (this.f7769b.f7746g.m4299D() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo4152s.getTop() - iM4289N) - recyclerView.getPaddingTop();
        }
        int i13 = -top;
        aVar.f7783c = i13;
        if (i13 >= 0) {
            if (height != 0) {
                f3 = i13 / height;
            }
            aVar.f7782b = f3;
            return;
        }
        int iM4326y2 = linearLayoutManager.m4326y();
        if (iM4326y2 != 0) {
            boolean z14 = linearLayoutManager.f6921p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM4326y2, 2);
            for (int i14 = 0; i14 < iM4326y2; i14++) {
                View viewM4324x = linearLayoutManager.m4324x(i14);
                if (viewM4324x == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewM4324x.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C0019b.f12a;
                int[] iArr2 = iArr[i14];
                if (z14) {
                    top2 = viewM4324x.getLeft();
                    i10 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewM4324x.getTop();
                    i10 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i10;
                int[] iArr3 = iArr[i14];
                if (z14) {
                    bottom = viewM4324x.getRight();
                    i11 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewM4324x.getBottom();
                    i11 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            }
            Arrays.sort(iArr, new C0018a());
            int i15 = 1;
            while (true) {
                if (i15 >= iM4326y2) {
                    int[] iArr4 = iArr[0];
                    int i16 = iArr4[1];
                    int i17 = iArr4[0];
                    int i18 = i16 - i17;
                    if (i17 > 0 || iArr[iM4326y2 - 1][1] < i18) {
                    }
                    if (z10 || linearLayoutManager.m4326y() <= 1) {
                        iM4326y = linearLayoutManager.m4326y();
                        i12 = 0;
                        while (true) {
                            if (i12 >= iM4326y) {
                                z11 = false;
                                break;
                            } else {
                                if (C0019b.m63a(linearLayoutManager.m4324x(i12))) {
                                    z11 = true;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f7783c)));
                    }
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
                if (iArr[i15 - 1][1] == iArr[i15][0]) {
                    i15++;
                }
                z10 = false;
                if (z10) {
                    iM4326y = linearLayoutManager.m4326y();
                    i12 = 0;
                    while (true) {
                        if (i12 >= iM4326y) {
                            z11 = false;
                            break;
                        } else {
                            if (C0019b.m63a(linearLayoutManager.m4324x(i12))) {
                                z11 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    iM4326y = linearLayoutManager.m4326y();
                    i12 = 0;
                    while (true) {
                        if (i12 >= iM4326y) {
                            z11 = false;
                            break;
                        } else {
                            if (C0019b.m63a(linearLayoutManager.m4324x(i12))) {
                                z11 = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (!z12) {
                    throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f7783c)));
                }
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
        }
        z10 = true;
        if (z10) {
            iM4326y = linearLayoutManager.m4326y();
            i12 = 0;
            while (true) {
                if (i12 >= iM4326y) {
                    z11 = false;
                    break;
                } else {
                    if (C0019b.m63a(linearLayoutManager.m4324x(i12))) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z11) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            iM4326y = linearLayoutManager.m4326y();
            i12 = 0;
            while (true) {
                if (i12 >= iM4326y) {
                    z11 = false;
                    break;
                } else {
                    if (C0019b.m63a(linearLayoutManager.m4324x(i12))) {
                        z11 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z11) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (!z12) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f7783c)));
        }
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
    }
}
