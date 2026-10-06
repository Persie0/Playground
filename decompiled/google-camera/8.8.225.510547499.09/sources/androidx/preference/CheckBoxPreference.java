package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.aor;
import p000.aos;
import p000.aov;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: c */
    private final aov f1539c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM39c = aar.m39c(context, C0100R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iM39c, 0);
        this.f1539c = new aov(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1922b, iM39c, 0);
        m1544o(aar.m44h(typedArrayObtainStyledAttributes, 5, 0));
        m1543l(aar.m44h(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).f1627b = aar.m45i(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ai */
    private final void m1465ai(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1626a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1539c);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        m1465ai(aorVar.m1781B(R.id.checkbox));
        m1540ah(aorVar);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ce */
    public final void mo1467ce(View view) {
        m1490H();
        if (((AccessibilityManager) this.f1582j.getSystemService("accessibility")).isEnabled()) {
            m1465ai(view.findViewById(R.id.checkbox));
            m1541cf(view.findViewById(R.id.summary));
        }
    }
}
