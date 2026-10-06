package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmn extends C0752js {
    public mmn(Context context, AttributeSet attributeSet) {
        super(mmp.m16632a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (m16631c(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, mmo.f41053b, R.attr.textViewStyle, 0);
            int iM16629a = m16629a(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM16629a != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, mmo.f41053b, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m16630b(theme, resourceId);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m16629a(Context context, TypedArray typedArray, int... iArr) {
        int iM16539c = -1;
        for (int i = 0; i < 2 && iM16539c < 0; i++) {
            iM16539c = mkv.m16539c(context, typedArray, iArr[i], -1);
        }
        return iM16539c;
    }

    /* JADX INFO: renamed from: b */
    private final void m16630b(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, mmo.f41052a);
        int iM16629a = m16629a(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iM16629a >= 0) {
            abm.m138e(this, iM16629a);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m16631c(Context context) {
        return lij.m15396D(context, C0100R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // p000.C0752js, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m16631c(context)) {
            m16630b(context.getTheme(), i);
        }
    }
}
