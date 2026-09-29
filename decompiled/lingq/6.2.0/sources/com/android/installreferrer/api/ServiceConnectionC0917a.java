package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import p000.bna;
import p000.ho2;
import p000.rx3;
import p000.sx3;
import p000.tx3;

/* JADX INFO: renamed from: com.android.installreferrer.api.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC0917a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final InstallReferrerStateListener f11298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0918b f11299b;

    public ServiceConnectionC0917a(C0918b c0918b, InstallReferrerStateListener installReferrerStateListener) {
        this.f11299b = c0918b;
        if (installReferrerStateListener != null) {
            this.f11298a = installReferrerStateListener;
        } else {
            ho2.m13385e("Please specify a listener to know when setup is done.");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tx3 rx3Var;
        bna.m3959k0("Install Referrer service connected.");
        int i = sx3.f61541f;
        if (iBinder == null) {
            rx3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            rx3Var = iInterfaceQueryLocalInterface instanceof tx3 ? (tx3) iInterfaceQueryLocalInterface : new rx3(iBinder);
        }
        C0918b c0918b = this.f11299b;
        c0918b.f11302c = rx3Var;
        c0918b.f11300a = 2;
        this.f11298a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bna.m3960l0("Install Referrer service disconnected.");
        C0918b c0918b = this.f11299b;
        c0918b.f11302c = null;
        c0918b.f11300a = 0;
        this.f11298a.onInstallReferrerServiceDisconnected();
    }
}
