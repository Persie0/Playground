package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a */
    public static final class C1085a implements Preference.InterfaceC1087a<EditTextPreference> {

        /* JADX INFO: renamed from: a */
        public static C1085a f6867a;

        @Override // androidx.preference.Preference.InterfaceC1087a
        /* JADX INFO: renamed from: a */
        public final CharSequence mo4038a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            editTextPreference.getClass();
            String string = null;
            if (TextUtils.isEmpty(null)) {
                string = editTextPreference.f6871a.getString(R.string.not_set);
            }
            return string;
        }
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7911k.m15683a(R.attr.editTextPreferenceStyle, context, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35207c, i10, i11);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C1085a.f6867a == null) {
                C1085a.f6867a = new C1085a();
            }
            this.f6877g = C1085a.f6867a;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    public final Object mo4037g(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }
}
