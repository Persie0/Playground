package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TopIntroPreference extends Preference {
    public TopIntroPreference(Context context) {
        super(context);
        this.f1559A = C0100R.layout.top_intro_preference;
        m1515af();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        aorVar.f1918u = false;
        aorVar.f1919v = false;
    }

    public TopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559A = C0100R.layout.top_intro_preference;
        m1515af();
    }
}
