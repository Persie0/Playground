package bd;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.linguist.R;
import p153hc.C6031a;
import p507yc.C10344k;

/* JADX INFO: renamed from: bd.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1377u extends AbstractC1359c {

    /* JADX INFO: renamed from: g */
    public int f8286g;

    /* JADX INFO: renamed from: h */
    public int f8287h;

    /* JADX INFO: renamed from: i */
    public boolean f8288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i10 = LinearProgressIndicator.f15430J;
        boolean z10 = false;
        TypedArray typedArrayM19357d = C10344k.m19357d(context, attributeSet, C6031a.f35665o, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.f8286g = typedArrayM19357d.getInt(0, 1);
        this.f8287h = typedArrayM19357d.getInt(1, 0);
        typedArrayM19357d.recycle();
        mo4938a();
        this.f8288i = this.f8287h == 1 ? true : z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // bd.AbstractC1359c
    /* JADX INFO: renamed from: a */
    public final void mo4938a() {
        if (this.f8286g == 0) {
            if (this.f8211b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f8212c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
