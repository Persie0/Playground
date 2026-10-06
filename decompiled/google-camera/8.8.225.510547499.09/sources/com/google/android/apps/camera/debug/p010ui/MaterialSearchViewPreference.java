package com.google.android.apps.camera.debug.p010ui;

import android.content.Context;
import android.widget.SearchView;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import p000.aor;
import p000.dmx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialSearchViewPreference extends Preference {

    /* JADX INFO: renamed from: a */
    public SearchView f6607a;

    /* JADX INFO: renamed from: b */
    public SearchView.OnQueryTextListener f6608b;

    /* JADX INFO: renamed from: c */
    public CharSequence f6609c;

    public MaterialSearchViewPreference(Context context) {
        super(context);
        this.f6609c = qQLA.yIqjbDRFooVt;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        SearchView searchView = (SearchView) aorVar.f41155a.findViewById(C0100R.id.search_view);
        this.f6607a = searchView;
        searchView.setOnQueryTextListener(new dmx(this, 2));
        this.f6607a.setQuery(this.f6609c, true);
    }
}
