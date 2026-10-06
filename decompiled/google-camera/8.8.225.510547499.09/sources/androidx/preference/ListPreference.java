package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.anl;
import p000.anm;
import p000.anw;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: F */
    private String f1551F;

    /* JADX INFO: renamed from: G */
    private boolean f1552G;

    /* JADX INFO: renamed from: g */
    public CharSequence[] f1553g;

    /* JADX INFO: renamed from: h */
    public CharSequence[] f1554h;

    /* JADX INFO: renamed from: i */
    public String f1555i;

    public ListPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        Parcelable parcelableE = super.mo1470e();
        if (this.f1593u) {
            return parcelableE;
        }
        anl anlVar = new anl(parcelableE);
        anlVar.f1838a = this.f1555i;
        return anlVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(anl.class)) {
            super.mo1472g(parcelable);
            return;
        }
        anl anlVar = (anl) parcelable;
        super.mo1472g(anlVar.getSuperState());
        m1480o(anlVar.f1838a);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        m1480o(m1523w((String) obj));
    }

    /* JADX INFO: renamed from: k */
    public final int m1476k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.f1554h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.f1554h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public final CharSequence m1477l() {
        CharSequence[] charSequenceArr;
        int iM1476k = m1476k(this.f1555i);
        if (iM1476k < 0 || (charSequenceArr = this.f1553g) == null) {
            return null;
        }
        return charSequenceArr[iM1476k];
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    public final CharSequence mo1478m() {
        anw anwVar = this.f1563E;
        if (anwVar != null) {
            return anwVar.mo1729a(this);
        }
        CharSequence charSequenceM1477l = m1477l();
        CharSequence charSequenceM = super.mo1478m();
        String str = this.f1551F;
        if (str == null) {
            return charSequenceM;
        }
        Object[] objArr = new Object[1];
        if (charSequenceM1477l == null) {
            charSequenceM1477l = "";
        }
        objArr[0] = charSequenceM1477l;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceM)) {
            return charSequenceM;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: n */
    public final void mo1479n(CharSequence charSequence) {
        super.mo1479n(charSequence);
        if (charSequence == null) {
            this.f1551F = null;
        } else {
            this.f1551F = charSequence.toString();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1480o(String str) {
        boolean z = !TextUtils.equals(this.f1555i, str);
        if (z || !this.f1552G) {
            this.f1555i = str;
            this.f1552G = true;
            m1513ad(str);
            if (z) {
                mo1469d();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aar.m39c(context, C0100R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1925e, i, i2);
        this.f1553g = aar.m47k(typedArrayObtainStyledAttributes, 3, 0);
        this.f1554h = aar.m47k(typedArrayObtainStyledAttributes, 4, 1);
        if (aar.m45i(typedArrayObtainStyledAttributes, 7, 7, false)) {
            if (anm.f1839a == null) {
                anm.f1839a = new anm(0);
            }
            m1500R(anm.f1839a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aos.f1927g, i, i2);
        this.f1551F = aar.m44h(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
