package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class pn8 extends d38 {

    /* JADX INFO: renamed from: a */
    public hf1 f56518a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f56519b;

    /* JADX INFO: renamed from: c */
    public final vua f56520c;

    /* JADX INFO: renamed from: d */
    public final LinearLayoutManager f56521d;

    /* JADX INFO: renamed from: e */
    public int f56522e;

    /* JADX INFO: renamed from: f */
    public int f56523f;

    /* JADX INFO: renamed from: g */
    public final on8 f56524g;

    /* JADX INFO: renamed from: h */
    public int f56525h;

    /* JADX INFO: renamed from: i */
    public int f56526i;

    /* JADX INFO: renamed from: j */
    public boolean f56527j;

    /* JADX INFO: renamed from: k */
    public boolean f56528k;

    /* JADX INFO: renamed from: l */
    public boolean f56529l;

    public pn8(ViewPager2 viewPager2) {
        this.f56519b = viewPager2;
        vua vuaVar = viewPager2.f7127j;
        this.f56520c = vuaVar;
        this.f56521d = (LinearLayoutManager) vuaVar.getLayoutManager();
        this.f56524g = new on8();
        m19412d();
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: a */
    public final void mo6122a(RecyclerView recyclerView, int i) {
        hf1 hf1Var;
        hf1 hf1Var2;
        int i2 = this.f56522e;
        if (!(i2 == 1 && this.f56523f == 1) && i == 1) {
            this.f56522e = 1;
            int i3 = this.f56526i;
            if (i3 != -1) {
                this.f56525h = i3;
                this.f56526i = -1;
            } else if (this.f56525h == -1) {
                this.f56525h = this.f56521d.m2666T0();
            }
            m19411c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f56528k) {
                m19411c(2);
                this.f56527j = true;
                return;
            }
            return;
        }
        on8 on8Var = this.f56524g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m19413e();
            if (!this.f56528k) {
                int i4 = on8Var.f54622b;
                if (i4 != -1 && (hf1Var2 = this.f56518a) != null) {
                    hf1Var2.mo10798b(i4, 0.0f, 0);
                }
            } else if (on8Var.f54623c == 0) {
                int i5 = this.f56525h;
                int i6 = on8Var.f54622b;
                if (i5 != i6 && (hf1Var = this.f56518a) != null) {
                    hf1Var.mo10799c(i6);
                }
            }
            m19411c(0);
            m19412d();
        }
        if (this.f56522e == 2 && i == 0 && this.f56529l) {
            m19413e();
            if (on8Var.f54623c == 0) {
                int i7 = this.f56526i;
                int i8 = on8Var.f54622b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    hf1 hf1Var3 = this.f56518a;
                    if (hf1Var3 != null) {
                        hf1Var3.mo10799c(i8);
                    }
                }
                m19411c(0);
                m19412d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // p000.d38
    /* JADX INFO: renamed from: b */
    public final void mo6123b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        hf1 hf1Var;
        this.f56528k = true;
        m19413e();
        boolean z = this.f56527j;
        on8 on8Var = this.f56524g;
        if (z) {
            this.f56527j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.f56519b.f7124g.f69172b.getLayoutDirection() == 1)) {
                        if (on8Var.f54623c != 0) {
                            i3 = on8Var.f54622b + 1;
                        }
                    }
                }
                i3 = on8Var.f54622b;
            } else if (on8Var.f54623c != 0) {
                i3 = on8Var.f54622b + 1;
            } else {
                i3 = on8Var.f54622b;
            }
            this.f56526i = i3;
            if (this.f56525h != i3 && (hf1Var = this.f56518a) != null) {
                hf1Var.mo10799c(i3);
            }
        } else if (this.f56522e == 0) {
            int i4 = on8Var.f54622b;
            if (i4 == -1) {
                i4 = 0;
            }
            hf1 hf1Var2 = this.f56518a;
            if (hf1Var2 != null) {
                hf1Var2.mo10799c(i4);
            }
        }
        int i5 = on8Var.f54622b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = on8Var.f54621a;
        int i6 = on8Var.f54623c;
        hf1 hf1Var3 = this.f56518a;
        if (hf1Var3 != null) {
            hf1Var3.mo10798b(i5, f, i6);
        }
        int i7 = on8Var.f54622b;
        int i8 = this.f56526i;
        if ((i7 == i8 || i8 == -1) && on8Var.f54623c == 0 && this.f56523f != 1) {
            m19411c(0);
            m19412d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19411c(int i) {
        if ((this.f56522e == 3 && this.f56523f == 0) || this.f56523f == i) {
            return;
        }
        this.f56523f = i;
        hf1 hf1Var = this.f56518a;
        if (hf1Var != null) {
            hf1Var.mo10797a(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19412d() {
        this.f56522e = 0;
        this.f56523f = 0;
        on8 on8Var = this.f56524g;
        on8Var.f54622b = -1;
        on8Var.f54621a = 0.0f;
        on8Var.f54623c = 0;
        this.f56525h = -1;
        this.f56526i = -1;
        this.f56527j = false;
        this.f56528k = false;
        this.f56529l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[LOOP:2: B:64:0x013d->B:67:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m19413e() {
        int top;
        int iM24906v;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.f56521d;
        int iM2666T0 = linearLayoutManager.m2666T0();
        on8 on8Var = this.f56524g;
        on8Var.f54622b = iM2666T0;
        if (iM2666T0 == -1) {
            on8Var.f54622b = -1;
            on8Var.f54621a = 0.0f;
            on8Var.f54623c = 0;
            return;
        }
        View viewMo2696q = linearLayoutManager.mo2696q(iM2666T0);
        if (viewMo2696q == null) {
            on8Var.f54622b = -1;
            on8Var.f54621a = 0.0f;
            on8Var.f54623c = 0;
            return;
        }
        int i3 = ((z28) viewMo2696q.getLayoutParams()).f70800b.left;
        int i4 = ((z28) viewMo2696q.getLayoutParams()).f70800b.right;
        int i5 = ((z28) viewMo2696q.getLayoutParams()).f70800b.top;
        int i6 = ((z28) viewMo2696q.getLayoutParams()).f70800b.bottom;
        ViewGroup.LayoutParams layoutParams = viewMo2696q.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewMo2696q.getHeight() + i5 + i6;
        int width = viewMo2696q.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.f6581p;
        vua vuaVar = this.f56520c;
        if (i7 == 0) {
            top = (viewMo2696q.getLeft() - i3) - vuaVar.getPaddingLeft();
            if (this.f56519b.f7124g.f69172b.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo2696q.getTop() - i5) - vuaVar.getPaddingTop();
        }
        int i8 = -top;
        on8Var.f54623c = i8;
        if (i8 >= 0) {
            on8Var.f54621a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iM24906v2 = linearLayoutManager.m24906v();
        if (iM24906v2 != 0) {
            boolean z = linearLayoutManager.f6581p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM24906v2, 2);
            for (int i9 = 0; i9 < iM24906v2; i9++) {
                View viewM24904u = linearLayoutManager.m24904u(i9);
                if (viewM24904u == null) {
                    C3386nv.m17633t("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewM24904u.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C3043gm.f40988a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewM24904u.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewM24904u.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewM24904u.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewM24904u.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ma3(4));
            int i10 = 1;
            while (true) {
                if (i10 >= iM24906v2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iM24906v2 - 1][1] >= i13) {
                        if (linearLayoutManager.m24906v() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iM24906v = linearLayoutManager.m24906v();
                for (int i14 = 0; i14 < iM24906v; i14++) {
                    if (!C3043gm.m12747a(linearLayoutManager.m24904u(i14))) {
                        C3386nv.m17633t("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.m24906v() <= 1) {
            iM24906v = linearLayoutManager.m24906v();
            while (i14 < iM24906v) {
                if (!C3043gm.m12747a(linearLayoutManager.m24904u(i14))) {
                    C3386nv.m17633t("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        C3386nv.m17633t(ux5.m22988k(on8Var.f54623c, "Page can only be offset by a positive amount, not by "));
    }
}
