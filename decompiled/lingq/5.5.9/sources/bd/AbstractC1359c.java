package bd;

import ae.C0062b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.linguist.R;
import p072dd.C5150c;
import p153hc.C6031a;
import p507yc.C10344k;

/* JADX INFO: renamed from: bd.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1359c {

    /* JADX INFO: renamed from: a */
    public int f8210a;

    /* JADX INFO: renamed from: b */
    public int f8211b;

    /* JADX INFO: renamed from: c */
    public int[] f8212c;

    /* JADX INFO: renamed from: d */
    public int f8213d;

    /* JADX INFO: renamed from: e */
    public int f8214e;

    /* JADX INFO: renamed from: f */
    public int f8215f;

    public AbstractC1359c(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f8212c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayM19357d = C10344k.m19357d(context, attributeSet, C6031a.f35654d, i10, i11, new int[0]);
        this.f8210a = C5150c.m10927c(context, typedArrayM19357d, 8, dimensionPixelSize);
        this.f8211b = Math.min(C5150c.m10927c(context, typedArrayM19357d, 7, 0), this.f8210a / 2);
        this.f8214e = typedArrayM19357d.getInt(4, 0);
        this.f8215f = typedArrayM19357d.getInt(1, 0);
        if (!typedArrayM19357d.hasValue(2)) {
            this.f8212c = new int[]{C0062b.m334b1(R.attr.colorPrimary, context, -1)};
        } else if (typedArrayM19357d.peekValue(2).type != 1) {
            this.f8212c = new int[]{typedArrayM19357d.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayM19357d.getResourceId(2, -1));
            this.f8212c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayM19357d.hasValue(6)) {
            this.f8213d = typedArrayM19357d.getColor(6, -1);
        } else {
            this.f8213d = this.f8212c[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f3 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f8213d = C0062b.m413x0(this.f8213d, (int) (f3 * 255.0f));
        }
        typedArrayM19357d.recycle();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4938a();
}
