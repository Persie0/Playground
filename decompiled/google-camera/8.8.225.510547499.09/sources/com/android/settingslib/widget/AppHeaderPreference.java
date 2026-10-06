package com.android.settingslib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppHeaderPreference extends Preference {
    public AppHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1559A = C0100R.layout.app_header_preference;
        m1515af();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        TextView textView = (TextView) aorVar.m1781B(C0100R.id.install_type);
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) aorVar.m1781B(C0100R.id.second_summary);
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText((CharSequence) null);
                textView2.setVisibility(0);
            }
        }
    }
}
