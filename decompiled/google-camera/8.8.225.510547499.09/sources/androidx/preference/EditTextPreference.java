package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.ani;
import p000.anm;
import p000.aos;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: g */
    public String f1550g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM39c = aar.m39c(context, C0100R.attr.editTextPreferenceStyle, R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM39c, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1924d, iM39c, 0);
        if (aar.m45i(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (anm.f1840b == null) {
                anm.f1840b = new anm(1);
            }
            m1500R(anm.f1840b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: e */
    protected final Parcelable mo1470e() {
        Parcelable parcelableE = super.mo1470e();
        if (this.f1593u) {
            return parcelableE;
        }
        ani aniVar = new ani(parcelableE);
        aniVar.f1832a = this.f1550g;
        return aniVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: g */
    protected final void mo1472g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ani.class)) {
            super.mo1472g(parcelable);
            return;
        }
        ani aniVar = (ani) parcelable;
        super.mo1472g(aniVar.getSuperState());
        m1474i(aniVar.f1832a);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        m1474i(m1523w((String) obj));
    }

    /* JADX INFO: renamed from: i */
    public final void m1474i(String str) {
        boolean zMo1475j = mo1475j();
        this.f1550g = str;
        m1513ad(str);
        boolean zMo1475j2 = mo1475j();
        if (zMo1475j2 != zMo1475j) {
            mo1484B(zMo1475j2);
        }
        mo1469d();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: j */
    public final boolean mo1475j() {
        return TextUtils.isEmpty(this.f1550g) || super.mo1475j();
    }
}
