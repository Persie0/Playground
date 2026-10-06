package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.aar;
import p000.anx;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: Z */
    public final boolean mo1508Z() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        anx.m1736a(aorVar.f41155a, true);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: j */
    public final boolean mo1475j() {
        return !super.mo1508Z();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, aar.m39c(context, C0100R.attr.preferenceCategoryStyle, R.attr.preferenceCategoryStyle), null);
    }
}
