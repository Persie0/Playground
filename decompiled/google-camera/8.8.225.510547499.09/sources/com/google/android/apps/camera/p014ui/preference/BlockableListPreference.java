package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import java.util.function.Function;
import p000.idx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BlockableListPreference extends ListPreference implements idx {

    /* JADX INFO: renamed from: a */
    private Function f7104a;

    public BlockableListPreference(Context context) {
        super(context);
    }

    @Override // p000.idx
    /* JADX INFO: renamed from: a */
    public final void mo4410a(Function function) {
        this.f7104a = function;
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        Function function = this.f7104a;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.onClick();
        }
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BlockableListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
