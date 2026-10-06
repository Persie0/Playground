package com.android.settingslib.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreference;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppSwitchPreference extends SwitchPreference {
    public AppSwitchPreference(Context context) {
        super(context);
        this.f1559A = C0100R.layout.preference_app;
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        View viewM1781B = aorVar.m1781B(R.id.switch_widget);
        if (viewM1781B != null) {
            viewM1781B.getRootView().setFilterTouchesWhenObscured(true);
        }
    }

    public AppSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559A = C0100R.layout.preference_app;
    }
}
