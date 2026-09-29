package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p000.ej1;
import p000.l80;
import p000.nj1;
import p000.oj1;
import p000.os3;
import p000.vj1;
import p000.wj1;
import p000.zj1;

/* JADX INFO: loaded from: classes2.dex */
public class Barrier extends ej1 {

    /* JADX INFO: renamed from: h */
    public int f5442h;

    /* JADX INFO: renamed from: i */
    public int f5443i;

    /* JADX INFO: renamed from: j */
    public l80 f5444j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f5444j.f49286w0;
    }

    public int getMargin() {
        return this.f5444j.f49287x0;
    }

    public int getType() {
        return this.f5442h;
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: h */
    public final void mo1930h(AttributeSet attributeSet) {
        super.mo1930h(attributeSet);
        this.f5444j = new l80();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f5444j.f49286w0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f5444j.f49287x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f37321d = this.f5444j;
        m11172k();
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: i */
    public final void mo1931i(nj1 nj1Var, os3 os3Var, zj1 zj1Var, SparseArray sparseArray) {
        super.mo1931i(nj1Var, os3Var, zj1Var, sparseArray);
        oj1 oj1Var = nj1Var.f52823e;
        if (os3Var instanceof l80) {
            l80 l80Var = (l80) os3Var;
            m1964l(l80Var, oj1Var.f54429g0, ((wj1) os3Var.f65452U).f66922y0);
            l80Var.f49286w0 = oj1Var.f54445o0;
            l80Var.f49287x0 = oj1Var.f54431h0;
        }
    }

    @Override // p000.ej1
    /* JADX INFO: renamed from: j */
    public final void mo1932j(vj1 vj1Var, boolean z) {
        m1964l(vj1Var, this.f5442h, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m1964l(vj1 vj1Var, int i, boolean z) {
        this.f5443i = i;
        int i2 = this.f5442h;
        if (z) {
            if (i2 == 5) {
                this.f5443i = 1;
            } else if (i2 == 6) {
                this.f5443i = 0;
            }
        } else if (i2 == 5) {
            this.f5443i = 0;
        } else if (i2 == 6) {
            this.f5443i = 1;
        }
        if (vj1Var instanceof l80) {
            ((l80) vj1Var).f49285v0 = this.f5443i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f5444j.f49286w0 = z;
    }

    public void setDpMargin(int i) {
        this.f5444j.f49287x0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f5444j.f49287x0 = i;
    }

    public void setType(int i) {
        this.f5442h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
