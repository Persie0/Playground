package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.kochava.tracker.BuildConfig;
import java.util.List;
import p012ab.InterfaceC0053a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.android.installreferrer.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2078a extends InstallReferrerClient {

    /* JADX INFO: renamed from: a */
    public int f10532a = 0;

    /* JADX INFO: renamed from: b */
    public final Context f10533b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0053a f10534c;

    /* JADX INFO: renamed from: d */
    public a f10535d;

    /* JADX INFO: renamed from: com.android.installreferrer.api.a$a */
    public final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final InstallReferrerStateListener f10536a;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f10536a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC0053a c10580a;
            C8573r0.m16672F0("Install Referrer service connected.");
            int i10 = InterfaceC0053a.a.f67a;
            if (iBinder == null) {
                c10580a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c10580a = iInterfaceQueryLocalInterface instanceof InterfaceC0053a ? (InterfaceC0053a) iInterfaceQueryLocalInterface : new InterfaceC0053a.a.C10580a(iBinder);
            }
            C2078a c2078a = C2078a.this;
            c2078a.f10534c = c10580a;
            c2078a.f10532a = 2;
            this.f10536a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C8573r0.m16674G0("Install Referrer service disconnected.");
            C2078a c2078a = C2078a.this;
            c2078a.f10534c = null;
            c2078a.f10532a = 0;
            this.f10536a.onInstallReferrerServiceDisconnected();
        }
    }

    public C2078a(Context context) {
        this.f10533b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.f10532a = 3;
        if (this.f10535d != null) {
            C8573r0.m16672F0("Unbinding from service.");
            this.f10533b.unbindService(this.f10535d);
            this.f10535d = null;
        }
        this.f10534c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f10533b.getPackageName());
        try {
            return new ReferrerDetails(this.f10534c.mo212W(bundle));
        } catch (RemoteException e10) {
            C8573r0.m16674G0("RemoteException getting install referrer information");
            this.f10532a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.f10532a != 2 || this.f10534c == null || this.f10535d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        boolean z10;
        if (isReady()) {
            C8573r0.m16672F0("Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i10 = this.f10532a;
        if (i10 == 1) {
            C8573r0.m16674G0("Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i10 == 3) {
            C8573r0.m16674G0("Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        C8573r0.m16672F0("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f10533b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f10532a = 0;
            C8573r0.m16672F0("Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                z10 = context.getPackageManager().getPackageInfo("com.android.vending", BuildConfig.SDK_TRUNCATE_LENGTH).versionCode >= 80837300;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z10) {
                Intent intent2 = new Intent(intent);
                a aVar = new a(installReferrerStateListener);
                this.f10535d = aVar;
                try {
                    if (context.bindService(intent2, aVar, 1)) {
                        C8573r0.m16672F0("Service was bonded successfully.");
                        return;
                    }
                    C8573r0.m16674G0("Connection to service is blocked.");
                    this.f10532a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(1);
                    return;
                } catch (SecurityException unused2) {
                    C8573r0.m16674G0("No permission to connect to service.");
                    this.f10532a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(4);
                    return;
                }
            }
        }
        C8573r0.m16674G0("Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f10532a = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
