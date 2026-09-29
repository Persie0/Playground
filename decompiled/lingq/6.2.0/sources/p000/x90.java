package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x90 {

    /* JADX INFO: renamed from: a */
    public int f67944a;

    /* JADX INFO: renamed from: b */
    public int f67945b;

    /* JADX INFO: renamed from: c */
    public float f67946c;

    /* JADX INFO: renamed from: d */
    public boolean f67947d;

    /* JADX INFO: renamed from: e */
    public int[] f67948e;

    /* JADX INFO: renamed from: f */
    public int f67949f;

    /* JADX INFO: renamed from: g */
    public int f67950g;

    /* JADX INFO: renamed from: h */
    public int f67951h;

    /* JADX INFO: renamed from: i */
    public int f67952i;

    /* JADX INFO: renamed from: j */
    public int f67953j;

    /* JADX INFO: renamed from: k */
    public int f67954k;

    /* JADX INFO: renamed from: l */
    public int f67955l;

    /* JADX INFO: renamed from: m */
    public int f67956m;

    /* JADX INFO: renamed from: n */
    public float f67957n;

    /* JADX INFO: renamed from: o */
    public float f67958o;

    /* JADX INFO: renamed from: p */
    public float f67959p;

    public x90(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f67948e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_track_thickness);
        int[] iArr = R$styleable.BaseProgressIndicator;
        dy9.m10748a(context, attributeSet, i, i2);
        dy9.m10749b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f67944a = pb1.m19056z(context, typedArrayObtainStyledAttributes, R$styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.f67945b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f67944a / 2);
                this.f67947d = false;
            } else if (i3 == 6) {
                this.f67946c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f67947d = true;
            }
        }
        this.f67950g = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f67951h = typedArrayObtainStyledAttributes.getInt(R$styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f67952i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_wavelength, 0));
        this.f67953j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.f67954k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.f67955l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_waveAmplitude, 0));
        this.f67956m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BaseProgressIndicator_waveSpeed, 0);
        this.f67957n = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        this.f67958o = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseProgressIndicator_waveAmplitudeRampProgressMin, 0.1f);
        this.f67959p = typedArrayObtainStyledAttributes.getFloat(R$styleable.BaseProgressIndicator_waveAmplitudeRampProgressMax, 0.9f);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_indicatorColor)) {
            Integer numM18120H = omd.m18120H(context, R$attr.colorPrimary);
            this.f67948e = new int[]{numM18120H != null ? numM18120H.intValue() : -1};
        } else if (typedArrayObtainStyledAttributes.peekValue(R$styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.f67948e = new int[]{typedArrayObtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(R$styleable.BaseProgressIndicator_indicatorColor, -1));
            this.f67948e = intArray;
            if (intArray.length == 0) {
                C3386nv.m17626m("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.BaseProgressIndicator_trackColor)) {
            this.f67949f = typedArrayObtainStyledAttributes.getColor(R$styleable.BaseProgressIndicator_trackColor, -1);
        } else {
            this.f67949f = this.f67948e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f67949f = omd.m18163s(this.f67949f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m24411a() {
        return this.f67947d ? (int) (this.f67944a * this.f67946c) : this.f67945b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24412b(boolean z) {
        if (this.f67955l <= 0) {
            return false;
        }
        if (z || this.f67954k <= 0) {
            return z && this.f67953j > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo11062c() {
        return this.f67947d && this.f67946c == 0.5f;
    }

    /* JADX INFO: renamed from: d */
    public void mo11063d() {
        if (this.f67952i >= 0) {
            return;
        }
        C3386nv.m17626m("indicatorTrackGapSize must be >= 0.");
    }
}
