package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.settings.C1170b;
import p000.kn1;
import p000.nz8;
import p000.q43;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: com.google.firebase.sessions.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1164a {

    /* JADX INFO: renamed from: a */
    public final q43 f13839a;

    /* JADX INFO: renamed from: b */
    public final C1170b f13840b;

    public C1164a(q43 q43Var, C1170b c1170b, kn1 kn1Var, nz8 nz8Var) {
        q43Var.getClass();
        c1170b.getClass();
        kn1Var.getClass();
        nz8Var.getClass();
        this.f13839a = q43Var;
        this.f13840b = c1170b;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.6.");
        q43Var.m19644a();
        Context applicationContext = q43Var.f57252a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(nz8Var);
            wfb.m23926u(vz1.m23619a(kn1Var), null, null, new FirebaseSessions$1(this, nz8Var, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
