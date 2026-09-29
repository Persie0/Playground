package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import p000.d83;
import p000.dwa;
import p000.ewa;
import p000.nj1;
import p000.os3;
import p000.vj1;
import p000.zj1;

/* JADX INFO: loaded from: classes2.dex */
public class Flow extends dwa {

    /* JADX INFO: renamed from: j */
    public d83 f5360j;

    public Flow(Context context) {
        super(context);
    }

    @Override // p000.dwa, p000.ej1
    /* JADX INFO: renamed from: h */
    public final void mo1930h(AttributeSet attributeSet) {
        super.mo1930h(attributeSet);
        this.f5360j = new d83();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f5360j.f35136Y0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
                    d83 d83Var = this.f5360j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    d83Var.f38005v0 = dimensionPixelSize;
                    d83Var.f38006w0 = dimensionPixelSize;
                    d83Var.f38007x0 = dimensionPixelSize;
                    d83Var.f38008y0 = dimensionPixelSize;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
                    d83 d83Var2 = this.f5360j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    d83Var2.f38007x0 = dimensionPixelSize2;
                    d83Var2.f38009z0 = dimensionPixelSize2;
                    d83Var2.f37999A0 = dimensionPixelSize2;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f5360j.f38008y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f5360j.f38009z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f5360j.f38005v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f5360j.f37999A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f5360j.f38006w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f5360j.f35134W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f5360j.f35118G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f5360j.f35119H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f5360j.f35120I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f5360j.f35122K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f5360j.f35121J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f5360j.f35123L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f5360j.f35124M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f5360j.f35126O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f5360j.f35128Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f5360j.f35127P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f5360j.f35129R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f5360j.f35125N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f5360j.f35132U0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f5360j.f35133V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f5360j.f35130S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f5360j.f35131T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f5360j.f35135X0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f37321d = this.f5360j;
        m11172k();
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: i */
    public final void mo1931i(nj1 nj1Var, os3 os3Var, zj1 zj1Var, SparseArray sparseArray) {
        super.mo1931i(nj1Var, os3Var, zj1Var, sparseArray);
        if (os3Var instanceof d83) {
            d83 d83Var = (d83) os3Var;
            int i = zj1Var.f42437V;
            if (i != -1) {
                d83Var.f35136Y0 = i;
            }
        }
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: j */
    public final void mo1932j(vj1 vj1Var, boolean z) {
        d83 d83Var = this.f5360j;
        int i = d83Var.f38007x0;
        if (i > 0 || d83Var.f38008y0 > 0) {
            if (z) {
                d83Var.f38009z0 = d83Var.f38008y0;
                d83Var.f37999A0 = i;
            } else {
                d83Var.f38009z0 = i;
                d83Var.f37999A0 = d83Var.f38008y0;
            }
        }
    }

    @Override // p000.dwa
    /* JADX INFO: renamed from: l */
    public final void mo1933l(ewa ewaVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ewaVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            ewaVar.mo10146V(mode, size, mode2, size2);
            setMeasuredDimension(ewaVar.f38001C0, ewaVar.f38002D0);
        }
    }

    @Override // p000.ej1, android.view.View
    public final void onMeasure(int i, int i2) {
        mo1933l(this.f5360j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f5360j.f35126O0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f5360j.f35120I0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f5360j.f35127P0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f5360j.f35121J0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f5360j.f35132U0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f5360j.f35124M0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f5360j.f35130S0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f5360j.f35118G0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f5360j.f35128Q0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f5360j.f35122K0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f5360j.f35129R0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f5360j.f35123L0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f5360j.f35135X0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f5360j.f35136Y0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        d83 d83Var = this.f5360j;
        d83Var.f38005v0 = i;
        d83Var.f38006w0 = i;
        d83Var.f38007x0 = i;
        d83Var.f38008y0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f5360j.f38006w0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f5360j.f38009z0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f5360j.f37999A0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f5360j.f38005v0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f5360j.f35133V0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f5360j.f35125N0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f5360j.f35131T0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f5360j.f35119H0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f5360j.f35134W0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
