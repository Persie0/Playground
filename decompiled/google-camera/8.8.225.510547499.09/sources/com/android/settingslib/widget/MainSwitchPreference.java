package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.ViewOnClickListenerC0250hu;
import p000.aor;
import p000.aos;
import p000.bov;
import p000.bzq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MainSwitchPreference extends TwoStatePreference implements bov {

    /* JADX INFO: renamed from: c */
    private final List f6481c;

    /* JADX INFO: renamed from: d */
    private MainSwitchBar f6482d;

    public MainSwitchPreference(Context context) {
        super(context);
        this.f6481c = new ArrayList();
        m4030aj(context, null);
    }

    /* JADX INFO: renamed from: aj */
    private final void m4030aj(Context context, AttributeSet attributeSet) {
        this.f1559A = C0100R.layout.settingslib_main_switch_layout;
        this.f6481c.add(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aos.f1927g, 0, 0);
            mo1502T(typedArrayObtainStyledAttributes.getText(4));
            m4031ai(typedArrayObtainStyledAttributes.getBoolean(15, true));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: T */
    public final void mo1502T(CharSequence charSequence) {
        super.mo1502T(charSequence);
        MainSwitchBar mainSwitchBar = this.f6482d;
        if (mainSwitchBar != null) {
            mainSwitchBar.m4028c(charSequence);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        aorVar.f1918u = false;
        aorVar.f1919v = false;
        MainSwitchBar mainSwitchBar = (MainSwitchBar) aorVar.m1781B(C0100R.id.settingslib_main_switch_bar);
        this.f6482d = mainSwitchBar;
        mainSwitchBar.setOnClickListener(new ViewOnClickListenerC0250hu(this, 4));
        m4031ai(this.f1597y);
        mo1542k(((TwoStatePreference) this).f1626a);
        MainSwitchBar mainSwitchBar2 = this.f6482d;
        if (mainSwitchBar2 != null) {
            mainSwitchBar2.m4028c(this.f1589q);
            MainSwitchBar mainSwitchBar3 = this.f6482d;
            mainSwitchBar3.setVisibility(0);
            mainSwitchBar3.f6473b.setOnCheckedChangeListener(mainSwitchBar3);
        }
        Iterator it = this.f6481c.iterator();
        while (it.hasNext()) {
            this.f6482d.m4026a((bov) it.next());
        }
    }

    @Override // p000.bov
    /* JADX INFO: renamed from: aX */
    public final void mo2825aX(boolean z) {
        super.mo1542k(z);
    }

    /* JADX INFO: renamed from: ai */
    public final void m4031ai(boolean z) {
        if (this.f1597y != z) {
            this.f1597y = z;
            mo1469d();
        }
        MainSwitchBar mainSwitchBar = this.f6482d;
        if (mainSwitchBar == null || mainSwitchBar.f6472a == null || bzq.m3232E()) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mainSwitchBar.f6472a.getLayoutParams();
        int dimensionPixelSize = mainSwitchBar.getContext().getResources().getDimensionPixelSize(C0100R.dimen.settingslib_switchbar_subsettings_margin_start);
        if (true != z) {
            dimensionPixelSize = 0;
        }
        layoutParams.setMarginStart(dimensionPixelSize);
        mainSwitchBar.f6472a.setLayoutParams(layoutParams);
    }

    @Override // androidx.preference.TwoStatePreference
    /* JADX INFO: renamed from: k */
    public final void mo1542k(boolean z) {
        super.mo1542k(z);
        MainSwitchBar mainSwitchBar = this.f6482d;
        if (mainSwitchBar == null || mainSwitchBar.m4029d() == z) {
            return;
        }
        this.f6482d.m4027b(z);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6481c = new ArrayList();
        m4030aj(context, attributeSet);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6481c = new ArrayList();
        m4030aj(context, attributeSet);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6481c = new ArrayList();
        m4030aj(context, attributeSet);
    }
}
