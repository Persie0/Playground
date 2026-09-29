package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.C0730a;
import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p061d2.C5039b;
import p143h2.C5881d;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends AbstractC0761a {

    /* JADX INFO: renamed from: i */
    public int f5258i;

    /* JADX INFO: renamed from: j */
    public int f5259j;

    /* JADX INFO: renamed from: k */
    public C0730a f5260k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f5260k.f4915z0;
    }

    public int getMargin() {
        return this.f5260k.f4912A0;
    }

    public int getType() {
        return this.f5258i;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: l */
    public final void mo2784l(AttributeSet attributeSet) {
        super.mo2784l(attributeSet);
        this.f5260k = new C0730a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35168b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f5260k.f4915z0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f5260k.f4912A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5369d = this.f5260k;
        m2881o();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: m */
    public final void mo2785m(C0762b.a aVar, C5039b c5039b, C0763c.a aVar2, SparseArray sparseArray) {
        super.mo2785m(aVar, c5039b, aVar2, sparseArray);
        if (c5039b instanceof C0730a) {
            C0730a c0730a = (C0730a) c5039b;
            boolean z10 = ((C0738d) c5039b.f4858W).f4963B0;
            C0762b.b bVar = aVar.f5387e;
            m2855p(c0730a, bVar.f5443g0, z10);
            c0730a.f4915z0 = bVar.f5459o0;
            c0730a.f4912A0 = bVar.f5445h0;
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0761a
    /* JADX INFO: renamed from: n */
    public final void mo2786n(ConstraintWidget constraintWidget, boolean z10) {
        m2855p(constraintWidget, this.f5258i, z10);
    }

    /* JADX INFO: renamed from: p */
    public final void m2855p(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f5259j = i10;
        if (z10) {
            int i11 = this.f5258i;
            if (i11 == 5) {
                this.f5259j = 1;
            } else if (i11 == 6) {
                this.f5259j = 0;
            }
        } else {
            int i12 = this.f5258i;
            if (i12 == 5) {
                this.f5259j = 0;
            } else if (i12 == 6) {
                this.f5259j = 1;
            }
        }
        if (constraintWidget instanceof C0730a) {
            ((C0730a) constraintWidget).f4914y0 = this.f5259j;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f5260k.f4915z0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f5260k.f4912A0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f5260k.f4912A0 = i10;
    }

    public void setType(int i10) {
        this.f5258i = i10;
    }
}
