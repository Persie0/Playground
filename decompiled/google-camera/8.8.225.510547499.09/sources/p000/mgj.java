package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mgj extends mgl {

    /* JADX INFO: renamed from: a */
    public final Rect f40433a;

    /* JADX INFO: renamed from: b */
    final Rect f40434b;

    /* JADX INFO: renamed from: c */
    public int f40435c;

    /* JADX INFO: renamed from: d */
    public int f40436d;

    public mgj() {
        this.f40433a = new Rect();
        this.f40434b = new Rect();
        this.f40435c = 0;
    }

    @Override // p000.mgl
    /* JADX INFO: renamed from: U */
    protected final void mo16353U(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewMo4772w = mo4772w(coordinatorLayout.m1422a(view));
        if (viewMo4772w == null) {
            coordinatorLayout.m1426j(view, i);
            this.f40435c = 0;
            return;
        }
        aal aalVar = (aal) view.getLayoutParams();
        Rect rect = this.f40433a;
        rect.set(coordinatorLayout.getPaddingLeft() + aalVar.leftMargin, viewMo4772w.getBottom() + aalVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aalVar.rightMargin, ((coordinatorLayout.getHeight() + viewMo4772w.getBottom()) - coordinatorLayout.getPaddingBottom()) - aalVar.bottomMargin);
        ago agoVar = coordinatorLayout.f1450e;
        if (agoVar != null && afb.m435p(coordinatorLayout) && !afb.m435p(view)) {
            rect.left += agoVar.m604b();
            rect.right -= agoVar.m605c();
        }
        Rect rect2 = this.f40434b;
        int i2 = aalVar.f16c;
        aem.m350a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM16354y = m16354y(viewMo4772w);
        view.layout(rect2.left, rect2.top - iM16354y, rect2.right, rect2.bottom - iM16354y);
        this.f40435c = rect2.top - viewMo4772w.getBottom();
    }

    /* JADX INFO: renamed from: u */
    public float mo4770u(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public int mo4771v(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public abstract View mo4772w(List list);

    /* JADX INFO: renamed from: y */
    public final int m16354y(View view) {
        if (this.f40436d == 0) {
            return 0;
        }
        float fMo4770u = mo4770u(view);
        int i = this.f40436d;
        return aax.m69d((int) (fMo4770u * i), 0, i);
    }

    public mgj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40433a = new Rect();
        this.f40434b = new Rect();
        this.f40435c = 0;
    }
}
