package com.google.android.apps.camera.p014ui.preference;

import android.R;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p000.iea;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ManagedPreference extends Preference {
    public ManagedPreference(Context context) {
        super(context);
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(R.id.summary);
        if (textView != null) {
            textView.setAccessibilityDelegate(new iea());
        }
    }

    public ManagedPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ManagedPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
