package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkk extends C0278iv {

    /* JADX INFO: renamed from: a */
    private static final int[][] f40842a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: b */
    private ColorStateList f40843b;

    /* JADX INFO: renamed from: c */
    private boolean f40844c;

    public mkk(Context context, AttributeSet attributeSet) {
        super(mmp.m16632a(context, attributeSet, C0100R.attr.radioButtonStyle, C0100R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mkl.f40845a, C0100R.attr.radioButtonStyle, C0100R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM16438a.hasValue(0)) {
            ahg.m667c(this, mkv.m16540d(context2, typedArrayM16438a, 0));
        }
        this.f40844c = typedArrayM16438a.getBoolean(1, false);
        typedArrayM16438a.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40844c && ahg.m665a(this) == null) {
            this.f40844c = true;
            if (this.f40843b == null) {
                int iM15024q = kxk.m15024q(this, C0100R.attr.colorControlActivated);
                int iM15024q2 = kxk.m15024q(this, C0100R.attr.colorOnSurface);
                int iM15024q3 = kxk.m15024q(this, C0100R.attr.colorSurface);
                int[][] iArr = f40842a;
                int length = iArr.length;
                this.f40843b = new ColorStateList(iArr, new int[]{kxk.m15026s(iM15024q3, iM15024q, 1.0f), kxk.m15026s(iM15024q3, iM15024q2, 0.54f), kxk.m15026s(iM15024q3, iM15024q2, 0.38f), kxk.m15026s(iM15024q3, iM15024q2, 0.38f)});
            }
            ahg.m667c(this, this.f40843b);
        }
    }
}
