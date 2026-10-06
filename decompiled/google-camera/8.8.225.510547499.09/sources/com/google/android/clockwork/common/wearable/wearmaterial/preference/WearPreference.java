package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p000.aor;
import p000.jfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearPreference extends Preference {

    /* JADX INFO: renamed from: a */
    private final jfs f7524a;

    public WearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7524a = new jfs(this);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7524a.m13098d(aorVar);
    }
}
