package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Set;
import p000.aar;
import p000.ano;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: g */
    public final CharSequence[] f1556g;

    /* JADX INFO: renamed from: h */
    public final CharSequence[] f1557h;

    /* JADX INFO: renamed from: i */
    public final Set f1558i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM39c = aar.m39c(context, C0100R.attr.dialogPreferenceStyle, R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iM39c, 0);
        this.f1558i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1926f, iM39c, 0);
        this.f1556g = aar.m47k(typedArrayObtainStyledAttributes, 2, 0);
        this.f1557h = aar.m47k(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        Parcelable parcelableE = super.mo1470e();
        if (this.f1593u) {
            return parcelableE;
        }
        ano anoVar = new ano(parcelableE);
        anoVar.f1845a = this.f1558i;
        return anoVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ano.class)) {
            super.mo1472g(parcelable);
            return;
        }
        ano anoVar = (ano) parcelable;
        super.mo1472g(anoVar.getSuperState());
        m1481k(anoVar.f1845a);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        m1481k(m1524x((Set) obj));
    }

    /* JADX INFO: renamed from: k */
    public final void m1481k(Set set) {
        this.f1558i.clear();
        this.f1558i.addAll(set);
        if (m1510aa() && !set.equals(m1524x(null))) {
            SharedPreferences.Editor editorM1776b = this.f1583k.m1776b();
            editorM1776b.putStringSet(this.f1590r, set);
            super.m1503U(editorM1776b);
        }
        mo1469d();
    }
}
