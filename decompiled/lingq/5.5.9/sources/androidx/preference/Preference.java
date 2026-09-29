package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.linguist.R;
import p145h4.C5886a;
import p286o2.C7911k;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: a */
    public final Context f6871a;

    /* JADX INFO: renamed from: b */
    public final int f6872b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f6873c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f6874d;

    /* JADX INFO: renamed from: e */
    public final String f6875e;

    /* JADX INFO: renamed from: f */
    public final Object f6876f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1087a f6877g;

    /* JADX INFO: renamed from: androidx.preference.Preference$a */
    public interface InterfaceC1087a<T extends Preference> {
        /* JADX INFO: renamed from: a */
        CharSequence mo4038a(T t10);
    }

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7911k.m15683a(R.attr.preferenceStyle, context, android.R.attr.preferenceStyle));
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6872b = Integer.MAX_VALUE;
        this.f6871a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5886a.f35210f, i10, i11);
        typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        this.f6875e = C7911k.m15691i(typedArrayObtainStyledAttributes, 26, 6);
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f6873c = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f6874d = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f6872b = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        C7911k.m15691i(typedArrayObtainStyledAttributes, 22, 13);
        typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        C7911k.m15691i(typedArrayObtainStyledAttributes, 19, 10);
        typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z10));
        typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z10));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f6876f = mo4037g(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f6876f = mo4037g(typedArrayObtainStyledAttributes, 11);
        }
        typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public CharSequence mo4039a() {
        InterfaceC1087a interfaceC1087a = this.f6877g;
        return interfaceC1087a != null ? interfaceC1087a.mo4038a(this) : this.f6874d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i10 = preference2.f6872b;
        int i11 = this.f6872b;
        if (i11 != i10) {
            return i11 - i10;
        }
        CharSequence charSequence = preference2.f6873c;
        CharSequence charSequence2 = this.f6873c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    /* JADX INFO: renamed from: f */
    public void mo4036f() {
    }

    /* JADX INFO: renamed from: g */
    public Object mo4037g(TypedArray typedArray, int i10) {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.f6873c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceMo4039a = mo4039a();
        if (!TextUtils.isEmpty(charSequenceMo4039a)) {
            sb2.append(charSequenceMo4039a);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }
}
