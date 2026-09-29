package cd;

import ae.C0062b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0336q;
import md.C7542a;
import p024b3.C1296c;
import p072dd.C5150c;
import p153hc.C6031a;
import p507yc.C10344k;

/* JADX INFO: renamed from: cd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1998a extends C0336q {

    /* JADX INFO: renamed from: g */
    public static final int[][] f10437g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f10438e;

    /* JADX INFO: renamed from: f */
    public boolean f10439f;

    public C1998a(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.radioButtonStyle, com.linguist.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35674x, com.linguist.R.attr.radioButtonStyle, com.linguist.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM19357d.hasValue(0)) {
            C1296c.m4806c(this, C5150c.m10925a(context2, typedArrayM19357d, 0));
        }
        this.f10439f = typedArrayM19357d.getBoolean(1, false);
        typedArrayM19357d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10438e == null) {
            int iM340d1 = C0062b.m340d1(this, com.linguist.R.attr.colorControlActivated);
            int iM340d2 = C0062b.m340d1(this, com.linguist.R.attr.colorOnSurface);
            int iM340d3 = C0062b.m340d1(this, com.linguist.R.attr.colorSurface);
            this.f10438e = new ColorStateList(f10437g, new int[]{C0062b.m250B1(1.0f, iM340d3, iM340d1), C0062b.m250B1(0.54f, iM340d3, iM340d2), C0062b.m250B1(0.38f, iM340d3, iM340d2), C0062b.m250B1(0.38f, iM340d3, iM340d2)});
        }
        return this.f10438e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10439f && C1296c.m4804a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10439f = z10;
        if (z10) {
            C1296c.m4806c(this, getMaterialThemeColorsTintList());
        } else {
            C1296c.m4806c(this, null);
        }
    }
}
