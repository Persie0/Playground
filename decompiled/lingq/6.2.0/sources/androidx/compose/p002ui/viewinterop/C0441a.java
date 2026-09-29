package androidx.compose.p002ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.node.C0357g;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.aa4;
import p000.bk1;
import p000.ea4;
import p000.ht5;
import p000.it5;
import p000.jt5;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0441a implements ht5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0442b f5175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0357g f5176b;

    public C0441a(AbstractC0442b abstractC0442b, C0357g c0357g) {
        this.f5175a = abstractC0442b;
        this.f5176b = c0357g;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: a */
    public final int mo737a(aa4 aa4Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC0442b abstractC0442b = this.f5175a;
        ViewGroup.LayoutParams layoutParams = abstractC0442b.getLayoutParams();
        layoutParams.getClass();
        abstractC0442b.measure(iMakeMeasureSpec, AbstractC0442b.m1886k(abstractC0442b, 0, i, layoutParams.height));
        return abstractC0442b.getMeasuredWidth();
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        final AbstractC0442b abstractC0442b = this.f5175a;
        if (abstractC0442b.getChildCount() == 0) {
            return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), AndroidViewHolder$layoutNode$1$5$measure$1.f5111b);
        }
        if (bk1.m3803k(j) != 0) {
            abstractC0442b.getChildAt(0).setMinimumWidth(bk1.m3803k(j));
        }
        if (bk1.m3802j(j) != 0) {
            abstractC0442b.getChildAt(0).setMinimumHeight(bk1.m3802j(j));
        }
        int iM3803k = bk1.m3803k(j);
        int iM3801i = bk1.m3801i(j);
        ViewGroup.LayoutParams layoutParams = abstractC0442b.getLayoutParams();
        layoutParams.getClass();
        int iM1886k = AbstractC0442b.m1886k(abstractC0442b, iM3803k, iM3801i, layoutParams.width);
        int iM3802j = bk1.m3802j(j);
        int iM3800h = bk1.m3800h(j);
        ViewGroup.LayoutParams layoutParams2 = abstractC0442b.getLayoutParams();
        layoutParams2.getClass();
        abstractC0442b.measure(iM1886k, AbstractC0442b.m1886k(abstractC0442b, iM3802j, iM3800h, layoutParams2.height));
        int measuredWidth = abstractC0442b.getMeasuredWidth();
        int measuredHeight = abstractC0442b.getMeasuredHeight();
        final C0357g c0357g = this.f5176b;
        return jt5Var.mo9895M0(measuredWidth, measuredHeight, AbstractC3194a.m15360M(), new vi3() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ea4.m10996b(abstractC0442b, c0357g);
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: c */
    public final int mo739c(aa4 aa4Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC0442b abstractC0442b = this.f5175a;
        ViewGroup.LayoutParams layoutParams = abstractC0442b.getLayoutParams();
        layoutParams.getClass();
        abstractC0442b.measure(iMakeMeasureSpec, AbstractC0442b.m1886k(abstractC0442b, 0, i, layoutParams.height));
        return abstractC0442b.getMeasuredWidth();
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: d */
    public final int mo740d(aa4 aa4Var, List list, int i) {
        AbstractC0442b abstractC0442b = this.f5175a;
        ViewGroup.LayoutParams layoutParams = abstractC0442b.getLayoutParams();
        layoutParams.getClass();
        abstractC0442b.measure(AbstractC0442b.m1886k(abstractC0442b, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC0442b.getMeasuredHeight();
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: e */
    public final int mo741e(aa4 aa4Var, List list, int i) {
        AbstractC0442b abstractC0442b = this.f5175a;
        ViewGroup.LayoutParams layoutParams = abstractC0442b.getLayoutParams();
        layoutParams.getClass();
        abstractC0442b.measure(AbstractC0442b.m1886k(abstractC0442b, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC0442b.getMeasuredHeight();
    }
}
