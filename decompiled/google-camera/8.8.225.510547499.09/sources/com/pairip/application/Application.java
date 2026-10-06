package com.pairip.application;

import android.content.Context;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.pairip.SignatureCheck;

/* JADX INFO: loaded from: classes.dex */
public class Application extends CameraApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}
