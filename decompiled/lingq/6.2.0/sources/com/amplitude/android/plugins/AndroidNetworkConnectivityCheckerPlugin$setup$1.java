package com.amplitude.android.plugins;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.amplitude.android.C0880b;
import com.amplitude.core.AbstractC0903a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.b64;
import p000.c32;
import p000.lda;
import p000.pj5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.plugins.AndroidNetworkConnectivityCheckerPlugin$setup$1", m4291f = "AndroidNetworkConnectivityCheckerPlugin.kt", m4292l = {}, m4293m = "invokeSuspend")
final class AndroidNetworkConnectivityCheckerPlugin$setup$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0903a f10949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b64 f10950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidNetworkConnectivityCheckerPlugin$setup$1(AbstractC0903a abstractC0903a, b64 b64Var, Continuation continuation) {
        super(2, continuation);
        this.f10949a = abstractC0903a;
        this.f10950b = b64Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidNetworkConnectivityCheckerPlugin$setup$1(this.f10949a, this.f10950b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        AndroidNetworkConnectivityCheckerPlugin$setup$1 androidNetworkConnectivityCheckerPlugin$setup$1 = (AndroidNetworkConnectivityCheckerPlugin$setup$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        androidNetworkConnectivityCheckerPlugin$setup$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r4.hasTransport(0) == false) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0880b c0880b = this.f10949a.f11016a;
        b64 b64Var = this.f10950b;
        pj5 pj5Var = (pj5) b64Var.f8007b;
        Context context = (Context) b64Var.f8006a;
        context.getClass();
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
                    z = false;
                    if (activeNetwork != null) {
                        NetworkCapabilities networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities != null) {
                            if (!networkCapabilities.hasTransport(1)) {
                            }
                        }
                    }
                } else {
                    pj5Var.mo16256b("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                }
            } catch (Throwable th) {
                pj5Var.mo16257c("Error checking network connectivity: " + th.getMessage());
                pj5Var.mo16257c(lda.m16112L(th));
            }
            z = true;
        } else {
            z = true;
        }
        c0880b.f10804q = Boolean.valueOf(!z);
        return xfa.f68157a;
    }
}
