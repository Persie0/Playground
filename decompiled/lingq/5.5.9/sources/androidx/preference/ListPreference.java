package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: h */
    public final CharSequence[] f6868h;

    /* JADX INFO: renamed from: i */
    public final String f6869i;

    /* JADX INFO: renamed from: androidx.preference.ListPreference$a */
    public static final class C1086a implements Preference.InterfaceC1087a<ListPreference> {

        /* JADX INFO: renamed from: a */
        public static C1086a f6870a;

        @Override // androidx.preference.Preference.InterfaceC1087a
        /* JADX INFO: renamed from: a */
        public final CharSequence mo4038a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            listPreference.getClass();
            String string = null;
            if (TextUtils.isEmpty(null)) {
                string = listPreference.f6871a.getString(R.string.not_set);
            }
            return string;
        }
    }

    public ListPreference(Context context) {
        this(context, null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7911k.m15683a(R.attr.dialogPreferenceStyle, context, android.R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35208d, i10, i11);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f6868h = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C1086a.f6870a == null) {
                C1086a.f6870a = new C1086a();
            }
            this.f6877g = C1086a.f6870a;
            mo4036f();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C5886a.f35210f, i10, i11);
        this.f6869i = C7911k.m15691i(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final CharSequence mo4039a() {
        Preference.InterfaceC1087a interfaceC1087a = this.f6877g;
        if (interfaceC1087a != null) {
            return interfaceC1087a.mo4038a(this);
        }
        CharSequence charSequenceM4040i = m4040i();
        CharSequence charSequenceMo4039a = super.mo4039a();
        String str = this.f6869i;
        if (str == null) {
            return charSequenceMo4039a;
        }
        Object[] objArr = new Object[1];
        if (charSequenceM4040i == null) {
            charSequenceM4040i = "";
        }
        objArr[0] = charSequenceM4040i;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceMo4039a)) {
            return charSequenceMo4039a;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    public final Object mo4037g(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m4040i() {
        return null;
    }
}
