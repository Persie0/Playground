package p198jc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: jc.h */
/* JADX INFO: loaded from: classes.dex */
public class C6453h<V extends View> extends CoordinatorLayout.AbstractC0768c<V> {

    /* JADX INFO: renamed from: a */
    public C6454i f37019a;

    /* JADX INFO: renamed from: b */
    public int f37020b;

    public C6453h() {
        this.f37020b = 0;
    }

    public C6453h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37020b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        mo13070u(coordinatorLayout, v10, i10);
        if (this.f37019a == null) {
            this.f37019a = new C6454i(v10);
        }
        C6454i c6454i = this.f37019a;
        View view = c6454i.f37021a;
        c6454i.f37022b = view.getTop();
        c6454i.f37023c = view.getLeft();
        this.f37019a.m13072a();
        int i11 = this.f37020b;
        if (i11 == 0) {
            return true;
        }
        C6454i c6454i2 = this.f37019a;
        if (c6454i2.f37024d != i11) {
            c6454i2.f37024d = i11;
            c6454i2.m13072a();
        }
        this.f37020b = 0;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final int m13071s() {
        C6454i c6454i = this.f37019a;
        if (c6454i != null) {
            return c6454i.f37024d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int mo8558t() {
        return m13071s();
    }

    /* JADX INFO: renamed from: u */
    public void mo13070u(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.m2928q(v10, i10);
    }
}
