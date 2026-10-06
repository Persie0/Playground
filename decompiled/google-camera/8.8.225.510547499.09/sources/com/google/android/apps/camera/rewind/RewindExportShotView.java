package com.google.android.apps.camera.rewind;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextSwitcher;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class RewindExportShotView extends TextSwitcher {

    /* JADX INFO: renamed from: a */
    public final String f6908a;

    /* JADX INFO: renamed from: b */
    public final String f6909b;

    public RewindExportShotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6908a = getResources().getString(C0100R.string.mcfly_export_hdr_shot_button_text);
        this.f6909b = getResources().getString(C0100R.string.mcfly_export_shot_button_text);
    }
}
