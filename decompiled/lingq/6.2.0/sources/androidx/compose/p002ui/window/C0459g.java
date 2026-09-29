package androidx.compose.p002ui.window;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.runtime.AbstractC0278f;
import java.util.WeakHashMap;
import p000.C3151jl;
import p000.C3728wn;
import p000.C3802yn;
import p000.dta;
import p000.f6b;
import p000.gr6;
import p000.pk9;
import p000.t66;
import p000.tj3;
import p000.wsa;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.window.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0459g extends AbstractC0389a implements gr6 {

    /* JADX INFO: renamed from: H */
    public boolean f5295H;

    /* JADX INFO: renamed from: I */
    public boolean f5296I;

    /* JADX INFO: renamed from: J */
    public boolean f5297J;

    /* JADX INFO: renamed from: j */
    public final Window f5298j;

    /* JADX INFO: renamed from: k */
    public final t66 f5299k;

    /* JADX INFO: renamed from: l */
    public boolean f5300l;

    public C0459g(Context context, Window window) {
        super(context);
        this.f5298j = window;
        this.f5299k = AbstractC0278f.m1260j(AbstractC0457e.f5293a);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(this, this);
        dta.m10642m(this, new C3151jl(this, 1));
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: a */
    public final void mo1707a(ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1735448596);
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ((zi3) ((xc9) this.f5299k).getValue()).invoke(tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i) { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(1);
                    this.f5277b.mo1707a((ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: g */
    public final void mo1713g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5297J;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // androidx.compose.p002ui.platform.AbstractC0389a
    /* JADX INFO: renamed from: h */
    public final void mo1714h(int i, int i2) {
        int iM25207a;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo1714h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f5298j;
        if (mode != Integer.MIN_VALUE || this.f5300l || window.getAttributes().height != -2) {
            iM25207a = size2;
        } else if (this.f5295H) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iM25207a = C3728wn.f67079a.m24065a(window);
            } else if (i3 < 32) {
                iM25207a = C3802yn.f70089a.m25207a(window);
            } else {
                iM25207a = size2;
            }
        } else {
            iM25207a = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iM25207a - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f5295H || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f5300l) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public final f6b mo1889s(View view, f6b f6bVar) {
        if (!this.f5295H) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return f6bVar.f38536a.mo4371r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return f6bVar;
    }
}
