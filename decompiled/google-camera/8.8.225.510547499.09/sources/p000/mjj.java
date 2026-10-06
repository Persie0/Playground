package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mjj {

    /* JADX INFO: renamed from: a */
    public final int f40741a;

    /* JADX INFO: renamed from: b */
    public final int f40742b;

    /* JADX INFO: renamed from: c */
    public int[] f40743c;

    /* JADX INFO: renamed from: d */
    public int f40744d;

    /* JADX INFO: renamed from: e */
    public final int f40745e;

    /* JADX INFO: renamed from: f */
    public final int f40746f;

    protected mjj(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f40743c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0100R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayM16438a = mjb.m16438a(context, attributeSet, mkj.f40839a, i, i2, new int[0]);
        int iM16539c = mkv.m16539c(context, typedArrayM16438a, 8, dimensionPixelSize);
        this.f40741a = iM16539c;
        this.f40742b = Math.min(mkv.m16539c(context, typedArrayM16438a, 7, 0), iM16539c / 2);
        this.f40745e = typedArrayM16438a.getInt(4, 0);
        this.f40746f = typedArrayM16438a.getInt(1, 0);
        if (!typedArrayM16438a.hasValue(2)) {
            this.f40743c = new int[]{kxk.m15025r(context, C0100R.attr.colorPrimary, -1)};
        } else if (typedArrayM16438a.peekValue(2).type != 1) {
            this.f40743c = new int[]{typedArrayM16438a.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayM16438a.getResourceId(2, -1));
            this.f40743c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayM16438a.hasValue(6)) {
            this.f40744d = typedArrayM16438a.getColor(6, -1);
        } else {
            this.f40744d = this.f40743c[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f40744d = kxk.m15023p(this.f40744d, (int) (f * 255.0f));
        }
        typedArrayM16438a.recycle();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16449a();

    /* JADX INFO: renamed from: b */
    public final boolean m16450b() {
        return this.f40746f != 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16451c() {
        return this.f40745e != 0;
    }
}
