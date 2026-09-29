package p143h2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0743i;
import androidx.constraintlayout.widget.AbstractC0761a;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: h2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5884g extends AbstractC0761a {

    /* JADX INFO: renamed from: i */
    public boolean f35203i;

    /* JADX INFO: renamed from: j */
    public boolean f35204j;

    public AbstractC5884g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: i */
    public final void mo2878i(ConstraintLayout constraintLayout) {
        m2877h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: l */
    public void mo2784l(AttributeSet attributeSet) {
        super.mo2784l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35168b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f35203i = true;
                } else if (index == 22) {
                    this.f35204j = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35203i || this.f35204j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f5367b; i10++) {
                    View viewM2863d = constraintLayout.m2863d(this.f5366a[i10]);
                    if (viewM2863d != null) {
                        if (this.f35203i) {
                            viewM2863d.setVisibility(visibility);
                        }
                        if (this.f35204j && elevation > 0.0f) {
                            viewM2863d.setTranslationZ(viewM2863d.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo2787p(C0743i c0743i, int i10, int i11) {
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m2877h((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m2877h((ConstraintLayout) parent);
    }
}
