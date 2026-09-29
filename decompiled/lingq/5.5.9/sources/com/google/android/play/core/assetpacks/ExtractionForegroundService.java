package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p338qd.BinderC8549j0;

/* JADX INFO: loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: a */
    public final BinderC8549j0 f15887a = new BinderC8549j0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f15887a;
    }
}
