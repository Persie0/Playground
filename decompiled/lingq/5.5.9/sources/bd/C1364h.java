package bd;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import p072dd.C5150c;
import p153hc.C6031a;
import p507yc.C10344k;

/* JADX INFO: renamed from: bd.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1364h extends AbstractC1359c {

    /* JADX INFO: renamed from: g */
    public int f8235g;

    /* JADX INFO: renamed from: h */
    public int f8236h;

    /* JADX INFO: renamed from: i */
    public int f8237i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i10 = CircularProgressIndicator.f15429J;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayM19357d = C10344k.m19357d(context, attributeSet, C6031a.f35659i, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.f8235g = Math.max(C5150c.m10927c(context, typedArrayM19357d, 2, dimensionPixelSize), this.f8210a * 2);
        this.f8236h = C5150c.m10927c(context, typedArrayM19357d, 1, dimensionPixelSize2);
        this.f8237i = typedArrayM19357d.getInt(0, 0);
        typedArrayM19357d.recycle();
    }

    @Override // bd.AbstractC1359c
    /* JADX INFO: renamed from: a */
    public final void mo4938a() {
    }
}
