package com.google.android.apps.camera.p014ui.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import p000.aor;
import p000.iei;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialManagedPreference extends Preference {
    public MaterialManagedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        TextView textView = (TextView) aorVar.f41155a.findViewById(R.id.summary);
        if (textView != null) {
            textView.setAccessibilityDelegate(new iei());
        }
    }
}
