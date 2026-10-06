package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import p000.aor;
import p000.iyj;
import p000.jbx;
import p000.jfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearDialogPreference extends DialogPreference {

    /* JADX INFO: renamed from: g */
    private final jfs f7513g;

    /* JADX WARN: Illegal instructions before constructor call */
    public WearDialogPreference(Context context, AttributeSet attributeSet) {
        int iM12860e = jbx.m12860e(context);
        super(context, attributeSet, iM12860e, 0);
        this.f7513g = new jfs(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iyj.f32651a, iM12860e, 0);
        jbx.m12861f(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iyj.f32652b, iM12860e, 0);
        typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        this.f7513g.m13098d(aorVar);
    }
}
