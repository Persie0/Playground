package p128g2;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC0761a;
import androidx.constraintlayout.widget.ConstraintLayout;
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5677o extends AbstractC0761a implements MotionLayout.InterfaceC0752i {

    /* JADX INFO: renamed from: i */
    public boolean f34641i;

    /* JADX INFO: renamed from: j */
    public boolean f34642j;

    /* JADX INFO: renamed from: k */
    public float f34643k;

    /* JADX INFO: renamed from: l */
    public View[] f34644l;

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: a */
    public final void mo2825a(int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: b */
    public final void mo2826b() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: c */
    public final void mo2827c(int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0752i
    /* JADX INFO: renamed from: d */
    public final void mo2828d(int i10, int i11, float f3) {
    }

    public float getProgress() {
        return this.f34643k;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: l */
    public final void mo2784l(AttributeSet attributeSet) {
        super.mo2784l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35179m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f34641i = typedArrayObtainStyledAttributes.getBoolean(index, this.f34641i);
                } else if (index == 0) {
                    this.f34642j = typedArrayObtainStyledAttributes.getBoolean(index, this.f34642j);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f3) {
        this.f34643k = f3;
        int i10 = 0;
        if (this.f5367b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f5372g;
            if (viewArr == null || viewArr.length != this.f5367b) {
                this.f5372g = new View[this.f5367b];
            }
            for (int i11 = 0; i11 < this.f5367b; i11++) {
                this.f5372g[i11] = constraintLayout.m2863d(this.f5366a[i11]);
            }
            this.f34644l = this.f5372g;
            while (i10 < this.f5367b) {
                View view = this.f34644l[i10];
                i10++;
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                boolean z10 = viewGroup.getChildAt(i10) instanceof C5677o;
                i10++;
            }
        }
    }
}
