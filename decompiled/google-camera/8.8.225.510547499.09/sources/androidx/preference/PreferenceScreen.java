package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.aom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: e */
    public final boolean f1607e;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, aar.m39c(context, C0100R.attr.preferenceScreenStyle, R.attr.preferenceScreenStyle));
        this.f1607e = true;
    }

    @Override // androidx.preference.PreferenceGroup
    /* JADX INFO: renamed from: ai */
    public final boolean mo1529ai() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        aom aomVar;
        if (this.f1591s != null || this.f1592t != null || m1532k() == 0 || (aomVar = this.f1583k.f1906e) == null) {
            return;
        }
        aomVar.mo1755B();
    }
}
