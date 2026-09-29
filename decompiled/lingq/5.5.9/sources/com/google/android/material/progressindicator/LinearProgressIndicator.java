package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bd.AbstractC1358b;
import bd.AbstractC1359c;
import bd.C1365i;
import bd.C1370n;
import bd.C1371o;
import bd.C1373q;
import bd.C1376t;
import bd.C1377u;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicator extends AbstractC1358b<C1377u> {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f15430J = 0;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        C1377u c1377u = (C1377u) this.f8194a;
        setIndeterminateDrawable(new C1370n(context2, c1377u, new C1371o(c1377u), c1377u.f8286g == 0 ? new C1373q(c1377u) : new C1376t(context2, c1377u)));
        setProgressDrawable(new C1365i(getContext(), c1377u, new C1371o(c1377u)));
    }

    @Override // bd.AbstractC1358b
    /* JADX INFO: renamed from: a */
    public final AbstractC1359c mo4932a(Context context, AttributeSet attributeSet) {
        return new C1377u(context, attributeSet);
    }

    @Override // bd.AbstractC1358b
    /* JADX INFO: renamed from: c */
    public final void mo4934c(int i10, boolean z10) {
        S s10 = this.f8194a;
        if (s10 != 0 && ((C1377u) s10).f8286g == 0 && isIndeterminate()) {
            return;
        }
        super.mo4934c(i10, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((C1377u) this.f8194a).f8286g;
    }

    public int getIndicatorDirection() {
        return ((C1377u) this.f8194a).f8287h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f8194a;
        C1377u c1377u = (C1377u) s10;
        boolean z11 = true;
        if (((C1377u) s10).f8287h != 1) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if ((C10029b0.e.m18686d(this) != 1 || ((C1377u) s10).f8287h != 2) && (C10029b0.e.m18686d(this) != 0 || ((C1377u) s10).f8287h != 3)) {
                z11 = false;
            }
        }
        c1377u.f8288i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        C1370n<C1377u> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        C1365i<C1377u> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        S s10 = this.f8194a;
        if (((C1377u) s10).f8286g == i10) {
            return;
        }
        if (m4936e() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((C1377u) s10).f8286g = i10;
        ((C1377u) s10).mo4938a();
        if (i10 == 0) {
            C1370n<C1377u> indeterminateDrawable = getIndeterminateDrawable();
            C1373q c1373q = new C1373q((C1377u) s10);
            indeterminateDrawable.f8259H = c1373q;
            c1373q.f36836a = indeterminateDrawable;
        } else {
            C1370n<C1377u> indeterminateDrawable2 = getIndeterminateDrawable();
            C1376t c1376t = new C1376t(getContext(), (C1377u) s10);
            indeterminateDrawable2.f8259H = c1376t;
            c1376t.f36836a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // bd.AbstractC1358b
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((C1377u) this.f8194a).mo4938a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[PHI: r2
      0x0031: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v0 boolean) binds: [B:3:0x000e, B:14:0x002f, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void setIndicatorDirection(int i10) {
        S s10 = this.f8194a;
        ((C1377u) s10).f8287h = i10;
        C1377u c1377u = (C1377u) s10;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.e.m18686d(this) != 1 || ((C1377u) s10).f8287h != 2) {
                if (C10029b0.e.m18686d(this) != 0 || i10 != 3) {
                    z10 = false;
                }
            }
        }
        c1377u.f8288i = z10;
        invalidate();
    }

    @Override // bd.AbstractC1358b
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((C1377u) this.f8194a).mo4938a();
        invalidate();
    }
}
