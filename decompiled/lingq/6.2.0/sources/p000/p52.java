package p000;

import android.view.View;
import androidx.media3.common.C0713b;
import com.lingq.feature.review.views.unscrambler.FlowLayout$Gravity;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p52 {

    /* JADX INFO: renamed from: a */
    public int f55589a;

    /* JADX INFO: renamed from: b */
    public int f55590b;

    /* JADX INFO: renamed from: c */
    public final Object f55591c;

    /* JADX INFO: renamed from: d */
    public final Object f55592d;

    /* JADX INFO: renamed from: e */
    public final Object f55593e;

    /* JADX INFO: renamed from: f */
    public final Object f55594f;

    public p52(v83 v83Var) {
        this.f55594f = v83Var;
        this.f55591c = new ArrayList();
        this.f55592d = new ArrayList();
        this.f55593e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3813yy m18887a(p52 p52Var) {
        return (C3813yy) p52Var.f55594f;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3776xy m18888b(p52 p52Var) {
        return (C3776xy) p52Var.f55593e;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0713b m18889c(p52 p52Var) {
        return (C0713b) p52Var.f55591c;
    }

    /* JADX INFO: renamed from: d */
    public static C3279kz m18890d(p52 p52Var) {
        C3776xy c3776xy = (C3776xy) p52Var.f55593e;
        return new C3279kz(c3776xy.f68936a, c3776xy.f68937b, c3776xy.f68938c, c3776xy.f68941f, c3776xy.f68939d, c3776xy.f68940e);
    }

    /* JADX INFO: renamed from: e */
    public static p52 m18891e(p52 p52Var, C3776xy c3776xy) {
        return new p52((C0713b) p52Var.f55591c, (C0713b) p52Var.f55592d, p52Var.f55589a, p52Var.f55590b, c3776xy, (C3813yy) p52Var.f55594f);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0713b m18892f(p52 p52Var) {
        return (C0713b) p52Var.f55592d;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18893g(p52 p52Var) {
        return Objects.equals(((C0713b) p52Var.f55591c).f6406o, "audio/raw");
    }

    /* JADX INFO: renamed from: h */
    public static long m18894h(p52 p52Var, long j) {
        return uma.m22801F(((C0713b) p52Var.f55591c).f6382H, j);
    }

    /* JADX INFO: renamed from: k */
    public static long m18897k(p52 p52Var, long j) {
        return uma.m22801F(((C3776xy) p52Var.f55593e).f68937b, j);
    }

    /* JADX INFO: renamed from: l */
    public void m18898l() {
        ArrayList arrayList = (ArrayList) this.f55593e;
        ArrayList arrayList2 = (ArrayList) this.f55592d;
        ArrayList arrayList3 = (ArrayList) this.f55591c;
        v83 v83Var = (v83) this.f55594f;
        FlowLayout$Gravity gravity = v83Var.getGravity();
        int itemSpacing = v83Var.getItemSpacing();
        int i = u83.f63538a[gravity.ordinal()];
        int i2 = 0;
        if (i == 1) {
            int paddingLeft = v83Var.getPaddingLeft();
            while (i2 < arrayList3.size()) {
                ((View) arrayList3.get(i2)).layout(paddingLeft, this.f55589a, ((Number) arrayList2.get(i2)).intValue() + paddingLeft, ((Number) arrayList.get(i2)).intValue() + this.f55589a);
                paddingLeft += ((Number) arrayList2.get(i2)).intValue() + itemSpacing;
                i2++;
            }
        } else if (i == 2) {
            int paddingRight = this.f55590b - v83Var.getPaddingRight();
            if (v83Var.getLayoutDirection() == 1) {
                while (i2 < arrayList3.size()) {
                    int iIntValue = paddingRight - ((Number) arrayList2.get(i2)).intValue();
                    View view = (View) arrayList3.get(i2);
                    int i3 = this.f55589a;
                    view.layout(iIntValue, i3, paddingRight, ((Number) arrayList.get(i2)).intValue() + i3);
                    paddingRight = iIntValue - itemSpacing;
                    i2++;
                }
            } else {
                for (int size = arrayList3.size() - 1; size >= 0; size--) {
                    int iIntValue2 = paddingRight - ((Number) arrayList2.get(size)).intValue();
                    View view2 = (View) arrayList3.get(size);
                    int i4 = this.f55589a;
                    view2.layout(iIntValue2, i4, paddingRight, ((Number) arrayList.get(size)).intValue() + i4);
                    paddingRight = iIntValue2 - itemSpacing;
                }
            }
        } else {
            if (i != 3) {
                gm5.m12750e();
                return;
            }
            int size2 = arrayList2.size();
            int iIntValue3 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                iIntValue3 += ((Number) arrayList2.get(i5)).intValue();
            }
            int paddingLeft2 = (((((this.f55590b - v83Var.getPaddingLeft()) - v83Var.getPaddingRight()) - iIntValue3) - ((arrayList3.size() - 1) * itemSpacing)) / 2) + v83Var.getPaddingLeft();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                ((View) arrayList3.get(i2)).layout(paddingLeft2, this.f55589a, ((Number) arrayList2.get(i2)).intValue() + paddingLeft2, ((Number) arrayList.get(i2)).intValue() + this.f55589a);
                paddingLeft2 += ((Number) arrayList2.get(i2)).intValue() + itemSpacing;
                i2++;
            }
        }
        arrayList3.clear();
        arrayList2.clear();
        arrayList.clear();
    }

    public /* synthetic */ p52(C0713b c0713b, C0713b c0713b2, int i, int i2, C3776xy c3776xy, C3813yy c3813yy, int i3) {
        this(c0713b, c0713b2, i, i2, c3776xy, c3813yy);
    }

    public p52(C0713b c0713b, C0713b c0713b2, int i, int i2, C3776xy c3776xy, C3813yy c3813yy) {
        this.f55591c = c0713b;
        this.f55592d = c0713b2;
        this.f55589a = i;
        this.f55590b = i2;
        this.f55593e = c3776xy;
        this.f55594f = c3813yy;
    }
}
