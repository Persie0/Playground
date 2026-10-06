package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import p000.joo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            return new joo(this, 1);
        }
        Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction())));
        return null;
    }
}
