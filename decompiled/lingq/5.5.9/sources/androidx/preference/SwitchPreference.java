package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public SwitchPreference(Context context) {
        this(context, null);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7911k.m15683a(R.attr.switchPreferenceStyle, context, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35214j, i10, i11);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 7, 0);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 6, 1);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 9, 3);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 8, 4);
        typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
