package com.lingq.core.common.network;

import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;

/* JADX INFO: renamed from: com.lingq.core.common.network.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1262a {

    /* JADX INFO: renamed from: a */
    public final Context f14391a;

    /* JADX INFO: renamed from: b */
    public final c83 f14392b = AbstractC3224d.m15525d(AbstractC3224d.m15526e(new ConnectivityManagerNetworkMonitor$isOnline$1(this, null)), -1);

    public C1262a(Context context) {
        this.f14391a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7045a(ContinuationImpl continuationImpl) throws Throwable {
        ConnectivityManagerNetworkMonitor$isOnline$2 connectivityManagerNetworkMonitor$isOnline$2;
        if (continuationImpl instanceof ConnectivityManagerNetworkMonitor$isOnline$2) {
            connectivityManagerNetworkMonitor$isOnline$2 = (ConnectivityManagerNetworkMonitor$isOnline$2) continuationImpl;
            int i = connectivityManagerNetworkMonitor$isOnline$2.f14390c;
            if ((i & Integer.MIN_VALUE) != 0) {
                connectivityManagerNetworkMonitor$isOnline$2.f14390c = i - Integer.MIN_VALUE;
            } else {
                connectivityManagerNetworkMonitor$isOnline$2 = new ConnectivityManagerNetworkMonitor$isOnline$2(this, continuationImpl);
            }
        } else {
            connectivityManagerNetworkMonitor$isOnline$2 = new ConnectivityManagerNetworkMonitor$isOnline$2(this, continuationImpl);
        }
        Object objM15542u = connectivityManagerNetworkMonitor$isOnline$2.f14388a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = connectivityManagerNetworkMonitor$isOnline$2.f14390c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15542u);
            connectivityManagerNetworkMonitor$isOnline$2.f14390c = 1;
            objM15542u = AbstractC3224d.m15542u(this.f14392b, connectivityManagerNetworkMonitor$isOnline$2);
            if (objM15542u == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15542u);
        }
        Boolean bool = (Boolean) objM15542u;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
