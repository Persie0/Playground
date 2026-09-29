package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public SwitchPreferenceCompat() {
        throw null;
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35215k, R.attr.switchPreferenceCompatStyle, 0);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 7, 0);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 6, 1);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 9, 3);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 8, 4);
        typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
