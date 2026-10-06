package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class anf extends RelativeLayout.LayoutParams {

    /* JADX INFO: renamed from: a */
    private anc f1829a;

    public anf() {
        super(-1, -1);
    }

    /* JADX INFO: renamed from: a */
    public final anc m1722a() {
        if (this.f1829a == null) {
            this.f1829a = new anc();
        }
        return this.f1829a;
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
    }

    public anf(Context context, AttributeSet attributeSet) {
        anc ancVar;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anb.f839a);
        float fraction = typedArrayObtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            ancVar = new anc();
            ancVar.f840a = fraction;
        } else {
            ancVar = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f841b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f842c = fraction3;
            ancVar.f843d = fraction3;
            ancVar.f844e = fraction3;
            ancVar.f845f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f842c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f843d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f844e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f845f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f846g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f847h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            ancVar = ancVar == null ? new anc() : ancVar;
            ancVar.f848i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1829a = ancVar;
    }
}
