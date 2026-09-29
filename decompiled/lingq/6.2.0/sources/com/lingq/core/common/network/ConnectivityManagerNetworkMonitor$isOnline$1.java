package com.lingq.core.common.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC3212b;
import p000.C3006fm;
import p000.C3386nv;
import p000.c32;
import p000.kl7;
import p000.ll7;
import p000.oi1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.common.network.ConnectivityManagerNetworkMonitor$isOnline$1", m4291f = "ConnectivityManagerNetworkMonitor.kt", m4292l = {77}, m4293m = "invokeSuspend", m4294v = 2)
final class ConnectivityManagerNetworkMonitor$isOnline$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14385a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14386b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1262a f14387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityManagerNetworkMonitor$isOnline$1(C1262a c1262a, Continuation continuation) {
        super(2, continuation);
        this.f14387c = c1262a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectivityManagerNetworkMonitor$isOnline$1 connectivityManagerNetworkMonitor$isOnline$1 = new ConnectivityManagerNetworkMonitor$isOnline$1(this.f14387c, continuation);
        connectivityManagerNetworkMonitor$isOnline$1.f14386b = obj;
        return connectivityManagerNetworkMonitor$isOnline$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectivityManagerNetworkMonitor$isOnline$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NetworkCapabilities networkCapabilities;
        ll7 ll7Var = (ll7) this.f14386b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14385a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f14387c.f14391a.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null) {
            kl7 kl7Var = (kl7) ll7Var;
            kl7Var.getClass();
            kl7Var.mo4677k(Boolean.FALSE);
            ((kl7) ll7Var).mo15331i(null);
            return xfaVar;
        }
        oi1 oi1Var = new oi1(ll7Var);
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), oi1Var);
        kl7 kl7Var2 = (kl7) ll7Var;
        kl7Var2.getClass();
        Network activeNetwork = connectivityManager.getActiveNetwork();
        Boolean boolValueOf = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? null : Boolean.valueOf(networkCapabilities.hasCapability(12));
        kl7Var2.mo4677k(Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false));
        C3006fm c3006fm = new C3006fm(6, connectivityManager, oi1Var);
        this.f14386b = null;
        this.f14385a = 1;
        return AbstractC3212b.m15484a(ll7Var, c3006fm, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
