package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0739e;
import androidx.constraintlayout.core.widgets.C0743i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.C0763c;
import p061d2.C5039b;
import p143h2.AbstractC5884g;
import p143h2.C5881d;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC5884g {

    /* JADX INFO: renamed from: k */
    public C0739e f5045k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p143h2.AbstractC5884g, androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: l */
    public final void mo2784l(AttributeSet attributeSet) {
        super.mo2784l(attributeSet);
        this.f5045k = new C0739e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35168b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f5045k.f5001b1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0739e c0739e = this.f5045k;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0739e.f5043y0 = dimensionPixelSize;
                    c0739e.f5044z0 = dimensionPixelSize;
                    c0739e.f5034A0 = dimensionPixelSize;
                    c0739e.f5035B0 = dimensionPixelSize;
                } else if (index == 18) {
                    C0739e c0739e2 = this.f5045k;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0739e2.f5034A0 = dimensionPixelSize2;
                    c0739e2.f5036C0 = dimensionPixelSize2;
                    c0739e2.f5037D0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f5045k.f5035B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f5045k.f5036C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f5045k.f5043y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f5045k.f5037D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f5045k.f5044z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f5045k.f4999Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f5045k.f4983J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f5045k.f4984K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f5045k.f4985L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f5045k.f4987N0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f5045k.f4986M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f5045k.f4988O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f5045k.f4989P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f5045k.f4991R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f5045k.f4993T0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f5045k.f4992S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f5045k.f4994U0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f5045k.f4990Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f5045k.f4997X0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f5045k.f4998Y0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f5045k.f4995V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f5045k.f4996W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f5045k.f5000a1 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5369d = this.f5045k;
        m2881o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: m */
    public final void mo2785m(C0762b.a aVar, C5039b c5039b, C0763c.a aVar2, SparseArray sparseArray) {
        super.mo2785m(aVar, c5039b, aVar2, sparseArray);
        if (c5039b instanceof C0739e) {
            C0739e c0739e = (C0739e) c5039b;
            int i10 = aVar2.f5308V;
            if (i10 != -1) {
                c0739e.f5001b1 = i10;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: n */
    public final void mo2786n(ConstraintWidget constraintWidget, boolean z10) {
        C0739e c0739e = this.f5045k;
        int i10 = c0739e.f5034A0;
        if (i10 <= 0 && c0739e.f5035B0 <= 0) {
            return;
        }
        if (z10) {
            c0739e.f5036C0 = c0739e.f5035B0;
            c0739e.f5037D0 = i10;
        } else {
            c0739e.f5036C0 = i10;
            c0739e.f5037D0 = c0739e.f5035B0;
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        mo2787p(this.f5045k, i10, i11);
    }

    @Override // p143h2.AbstractC5884g
    /* JADX INFO: renamed from: p */
    public final void mo2787p(C0743i c0743i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (c0743i == null) {
            setMeasuredDimension(0, 0);
        } else {
            c0743i.mo2769V(mode, size, mode2, size2);
            setMeasuredDimension(c0743i.f5039F0, c0743i.f5040G0);
        }
    }

    public void setFirstHorizontalBias(float f3) {
        this.f5045k.f4991R0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f5045k.f4985L0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f5045k.f4992S0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f5045k.f4986M0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f5045k.f4997X0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f5045k.f4989P0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f5045k.f4995V0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f5045k.f4983J0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f3) {
        this.f5045k.f4993T0 = f3;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f5045k.f4987N0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f3) {
        this.f5045k.f4994U0 = f3;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f5045k.f4988O0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f5045k.f5000a1 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f5045k.f5001b1 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        C0739e c0739e = this.f5045k;
        c0739e.f5043y0 = i10;
        c0739e.f5044z0 = i10;
        c0739e.f5034A0 = i10;
        c0739e.f5035B0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f5045k.f5044z0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f5045k.f5036C0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f5045k.f5037D0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f5045k.f5043y0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f5045k.f4998Y0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f5045k.f4990Q0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f5045k.f4996W0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f5045k.f4984K0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f5045k.f4999Z0 = i10;
        requestLayout();
    }
}
