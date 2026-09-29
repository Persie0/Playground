package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import p000.C3386nv;
import p000.bna;
import p000.rx3;
import p000.tx3;

/* JADX INFO: renamed from: com.android.installreferrer.api.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0918b extends InstallReferrerClient {

    /* JADX INFO: renamed from: a */
    public int f11300a = 0;

    /* JADX INFO: renamed from: b */
    public final Context f11301b;

    /* JADX INFO: renamed from: c */
    public tx3 f11302c;

    /* JADX INFO: renamed from: d */
    public ServiceConnectionC0917a f11303d;

    public C0918b(Context context) {
        this.f11301b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.f11300a = 3;
        if (this.f11303d != null) {
            bna.m3959k0("Unbinding from service.");
            this.f11301b.unbindService(this.f11303d);
            this.f11303d = null;
        }
        this.f11302c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            C3386nv.m17633t("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f11301b.getPackageName());
        try {
            return new ReferrerDetails(((rx3) this.f11302c).m20982F(bundle));
        } catch (RemoteException e) {
            bna.m3960l0("RemoteException getting install referrer information");
            this.f11300a = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.f11300a != 2 || this.f11302c == null || this.f11303d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            bna.m3959k0("Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f11300a;
        if (i == 1) {
            bna.m3960l0("Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            bna.m3960l0("Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        bna.m3959k0("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f11301b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f11300a = 0;
            bna.m3959k0("Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    ServiceConnectionC0917a serviceConnectionC0917a = new ServiceConnectionC0917a(this, installReferrerStateListener);
                    this.f11303d = serviceConnectionC0917a;
                    try {
                        if (context.bindService(intent2, serviceConnectionC0917a, 1)) {
                            bna.m3959k0("Service was bonded successfully.");
                            return;
                        }
                        bna.m3960l0("Connection to service is blocked.");
                        this.f11300a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(1);
                        return;
                    } catch (SecurityException unused) {
                        bna.m3960l0("No permission to connect to service.");
                        this.f11300a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        bna.m3960l0("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f11300a = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
