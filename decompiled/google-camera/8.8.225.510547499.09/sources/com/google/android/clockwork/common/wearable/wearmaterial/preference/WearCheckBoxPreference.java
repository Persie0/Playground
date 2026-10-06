package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import p000.aor;
import p000.jfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearCheckBoxPreference extends CheckBoxPreference {

    /* JADX INFO: renamed from: c */
    private final jfs f7512c;

    public WearCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7512c = new jfs(this);
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7512c.m13098d(aorVar);
    }
}
