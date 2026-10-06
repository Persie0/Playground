package com.android.settingslib.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppPreference extends Preference {
    public AppPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559A = C0100R.layout.preference_app;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        ((ProgressBar) aorVar.m1781B(R.id.progress)).setVisibility(8);
    }
}
