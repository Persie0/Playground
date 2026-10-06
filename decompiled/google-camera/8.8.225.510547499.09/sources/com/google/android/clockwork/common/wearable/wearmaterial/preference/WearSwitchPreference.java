package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import p000.aor;
import p000.jfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearSwitchPreference extends SwitchPreference {

    /* JADX INFO: renamed from: c */
    private final jfs f7526c;

    public WearSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7526c = new jfs(this);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7526c.m13098d(aorVar);
    }
}
