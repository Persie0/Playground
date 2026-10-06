package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import java.util.function.Function;
import p000.iee;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialBlockableListPreference extends ListPreference implements iee {

    /* JADX INFO: renamed from: F */
    private Function f7127F;

    public MaterialBlockableListPreference(Context context) {
        super(context);
    }

    @Override // p000.iee
    /* JADX INFO: renamed from: ag */
    public final void mo4417ag(Function function) {
        this.f7127F = function;
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        Function function = this.f7127F;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.mo1468c();
        }
    }

    public MaterialBlockableListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaterialBlockableListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
