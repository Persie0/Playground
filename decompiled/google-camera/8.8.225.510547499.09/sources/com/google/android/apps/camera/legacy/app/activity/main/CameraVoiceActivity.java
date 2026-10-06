package com.google.android.apps.camera.legacy.app.activity.main;

import p000.cds;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraVoiceActivity extends CameraActivity {
    @Override // p000.ero, p000.fbs, p000.ActivityC0080bz, android.app.Activity
    protected final void onPause() {
        cds.m3507f(getIntent());
        super.onPause();
    }

    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity
    /* JADX INFO: renamed from: q */
    protected final boolean mo4191q() {
        return true;
    }
}
