package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: renamed from: wq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3731wq extends dg5 implements InterfaceC3768xq {

    /* JADX INFO: renamed from: V */
    public CharSequence f67163V;

    /* JADX INFO: renamed from: W */
    public C3620tq f67164W;

    /* JADX INFO: renamed from: X */
    public final Rect f67165X;

    /* JADX INFO: renamed from: Y */
    public int f67166Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AppCompatSpinner f67167Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731wq(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f67167Z = appCompatSpinner;
        this.f67165X = new Rect();
        this.f35596J = appCompatSpinner;
        this.f35606T = true;
        this.f35607U.setFocusable(true);
        this.f35597K = new C3657uq(this, 0);
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: e */
    public final CharSequence mo21538e() {
        return this.f67163V;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: h */
    public final void mo21540h(CharSequence charSequence) {
        this.f67163V = charSequence;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: l */
    public final void mo21543l(int i) {
        this.f67166Y = i;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: n */
    public final void mo21544n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C3120iq c3120iq = this.f35607U;
        boolean zIsShowing = c3120iq.isShowing();
        m24100s();
        c3120iq.setInputMethodMode(2);
        mo10360f();
        nm2 nm2Var = this.f35610c;
        nm2Var.setChoiceMode(1);
        nm2Var.setTextDirection(i);
        nm2Var.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.f67167Z;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        nm2 nm2Var2 = this.f35610c;
        if (c3120iq.isShowing() && nm2Var2 != null) {
            nm2Var2.setListSelectionHidden(false);
            nm2Var2.setSelection(selectedItemPosition);
            if (nm2Var2.getChoiceMode() != 0) {
                nm2Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC3507qq viewTreeObserverOnGlobalLayoutListenerC3507qq = new ViewTreeObserverOnGlobalLayoutListenerC3507qq(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3507qq);
        c3120iq.setOnDismissListener(new C3694vq(this, viewTreeObserverOnGlobalLayoutListenerC3507qq));
    }

    @Override // p000.dg5, p000.InterfaceC3768xq
    /* JADX INFO: renamed from: p */
    public final void mo10366p(ListAdapter listAdapter) {
        super.mo10366p(listAdapter);
        this.f67164W = (C3620tq) listAdapter;
    }

    /* JADX INFO: renamed from: s */
    public final void m24100s() {
        int i;
        C3120iq c3120iq = this.f35607U;
        Drawable background = c3120iq.getBackground();
        AppCompatSpinner appCompatSpinner = this.f67167Z;
        Rect rect = appCompatSpinner.f1136h;
        if (background != null) {
            background.getPadding(rect);
            i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i2 = appCompatSpinner.f1135g;
        if (i2 == -2) {
            int iM679a = appCompatSpinner.m679a(this.f67164W, c3120iq.getBackground());
            int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM679a > i3) {
                iM679a = i3;
            }
            m10367r(Math.max(iM679a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m10367r((width - paddingLeft) - paddingRight);
        } else {
            m10367r(i2);
        }
        this.f35613f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f35612e) - this.f67166Y) + i : paddingLeft + this.f67166Y + i;
    }
}
