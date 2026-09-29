package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public CheckBoxPreference() {
        throw null;
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7911k.m15683a(R.attr.checkBoxPreferenceStyle, context, android.R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35205a, i10, 0);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 5, 0);
        C7911k.m15691i(typedArrayObtainStyledAttributes, 4, 1);
        typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
