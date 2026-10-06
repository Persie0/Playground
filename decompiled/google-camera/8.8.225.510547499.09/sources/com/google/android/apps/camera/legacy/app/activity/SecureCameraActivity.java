package com.google.android.apps.camera.legacy.app.activity;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import p000.cds;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SecureCameraActivity extends CameraActivity {
    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, p000.ero, p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVoiceInteractionRoot()) {
            return;
        }
        cds.m3507f(getIntent());
    }
}
