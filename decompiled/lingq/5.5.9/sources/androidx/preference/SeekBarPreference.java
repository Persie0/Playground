package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: h */
    public int f6878h;

    /* JADX INFO: renamed from: i */
    public int f6879i;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public SeekBarPreference() {
        throw null;
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35213i, R.attr.seekBarPreferenceStyle, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i12 = i12 < i11 ? i11 : i12;
        if (i12 != this.f6878h) {
            this.f6878h = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i13 != this.f6879i) {
            this.f6879i = Math.min(this.f6878h - i11, Math.abs(i13));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    public final Object mo4037g(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }
}
