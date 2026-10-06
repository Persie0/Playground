package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import p000.aor;
import p000.iyj;
import p000.jbx;
import p000.jfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearListPreference extends ListPreference {

    /* JADX INFO: renamed from: F */
    private final jfs f7523F;

    /* JADX WARN: Illegal instructions before constructor call */
    public WearListPreference(Context context, AttributeSet attributeSet) {
        int iM12860e = jbx.m12860e(context);
        super(context, attributeSet, iM12860e, 0);
        this.f7523F = new jfs(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iyj.f32651a, iM12860e, 0);
        jbx.m12861f(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7523F.m13098d(aorVar);
    }
}
