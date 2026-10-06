package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.aor;
import p000.aos;
import p000.aov;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: c */
    private final CharSequence f1623c;

    /* JADX INFO: renamed from: d */
    private final CharSequence f1624d;

    /* JADX INFO: renamed from: e */
    private final aov f1625e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.switchPreferenceCompatStyle, 0);
        this.f1625e = new aov(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1933m, C0100R.attr.switchPreferenceCompatStyle, 0);
        m1544o(aar.m44h(typedArrayObtainStyledAttributes, 7, 0));
        m1543l(aar.m44h(typedArrayObtainStyledAttributes, 6, 1));
        this.f1623c = aar.m44h(typedArrayObtainStyledAttributes, 9, 3);
        mo1469d();
        this.f1624d = aar.m44h(typedArrayObtainStyledAttributes, 8, 4);
        mo1469d();
        ((TwoStatePreference) this).f1627b = aar.m45i(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ai */
    private final void m1539ai(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1626a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.m1316e(this.f1623c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.m1313b();
            }
            switchCompat.m1315d(this.f1624d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.m1312a();
            }
            switchCompat.setOnCheckedChangeListener(this.f1625e);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        m1539ai(aorVar.m1781B(C0100R.id.switchWidget));
        m1540ah(aorVar);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ce */
    public final void mo1467ce(View view) {
        m1490H();
        if (((AccessibilityManager) this.f1582j.getSystemService("accessibility")).isEnabled()) {
            m1539ai(view.findViewById(C0100R.id.switchWidget));
            m1541cf(view.findViewById(R.id.summary));
        }
    }
}
