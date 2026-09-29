package com.amplitude.android.plugins;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.Plugin$Type;
import p000.C3077hj;
import p000.b64;
import p000.m58;
import p000.pj5;
import p000.qn3;
import p000.wfb;
import p000.zf7;

/* JADX INFO: renamed from: com.amplitude.android.plugins.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0896c implements zf7 {

    /* JADX INFO: renamed from: a */
    public final Plugin$Type f10968a = Plugin$Type.Before;

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        abstractC0903a.m5113g().mo16256b("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        Context context = abstractC0903a.f11016a.f10789b;
        pj5 pj5VarM5113g = abstractC0903a.m5113g();
        context.getClass();
        pj5VarM5113g.getClass();
        b64 b64Var = new b64();
        b64Var.f8006a = context;
        b64Var.f8007b = pj5VarM5113g;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            pj5VarM5113g.mo16257c("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
        }
        wfb.m23926u(abstractC0903a.f11018c, abstractC0903a.f11021f, null, new AndroidNetworkConnectivityCheckerPlugin$setup$1(abstractC0903a, b64Var, null), 2);
        m58 m58Var = new m58(abstractC0903a, 7);
        pj5 pj5VarM5113g2 = abstractC0903a.m5113g();
        context.getClass();
        pj5VarM5113g2.getClass();
        qn3 qn3Var = new qn3();
        qn3Var.f57974a = m58Var;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            pj5VarM5113g2.mo16256b("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new C3077hj(connectivityManager, qn3Var));
        } catch (Throwable th) {
            pj5VarM5113g2.mo16257c("Error starting network listener: " + th.getMessage());
        }
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        return this.f10968a;
    }
}
