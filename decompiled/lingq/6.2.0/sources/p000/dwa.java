package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public abstract class dwa extends ej1 {

    /* JADX INFO: renamed from: h */
    public boolean f36336h;

    /* JADX INFO: renamed from: i */
    public boolean f36337i;

    @Override // p000.ej1
    /* JADX INFO: renamed from: e */
    public final void mo10705e(ConstraintLayout constraintLayout) {
        m11169d(constraintLayout);
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: h */
    public void mo1930h(AttributeSet attributeSet) {
        super.mo1930h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f36336h = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f36337i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1933l(ewa ewaVar, int i, int i2);

    @Override // p000.ej1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36336h || this.f36337i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f37319b; i++) {
                    View view = (View) constraintLayout.f5449a.get(this.f37318a[i]);
                    if (view != null) {
                        if (this.f36336h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f36337i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m11169d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m11169d((ConstraintLayout) parent);
    }
}
