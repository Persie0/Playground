package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.aor;
import p000.aos;
import p000.aov;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: c */
    private final aov f1620c;

    /* JADX INFO: renamed from: d */
    private CharSequence f1621d;

    /* JADX INFO: renamed from: e */
    private CharSequence f1622e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ai */
    private final void m1538ai(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1626a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f1621d);
            r4.setTextOff(this.f1622e);
            r4.setOnCheckedChangeListener(this.f1620c);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        m1538ai(aorVar.m1781B(R.id.switch_widget));
        m1540ah(aorVar);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ce */
    public final void mo1467ce(View view) {
        m1490H();
        if (((AccessibilityManager) this.f1582j.getSystemService("accessibility")).isEnabled()) {
            m1538ai(view.findViewById(R.id.switch_widget));
            m1541cf(view.findViewById(R.id.summary));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, aar.m39c(context, C0100R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1620c = new aov(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1932l, i, i2);
        m1544o(aar.m44h(typedArrayObtainStyledAttributes, 7, 0));
        m1543l(aar.m44h(typedArrayObtainStyledAttributes, 6, 1));
        this.f1621d = aar.m44h(typedArrayObtainStyledAttributes, 9, 3);
        mo1469d();
        this.f1622e = aar.m44h(typedArrayObtainStyledAttributes, 8, 4);
        mo1469d();
        ((TwoStatePreference) this).f1627b = aar.m45i(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
