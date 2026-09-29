package com.lingq.core.domain.playlist;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.pk6;
import p000.si7;
import p000.vi7;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1519b {

    /* JADX INFO: renamed from: a */
    public final si7 f19936a;

    /* JADX INFO: renamed from: b */
    public final pk6 f19937b;

    public C1519b(si7 si7Var, pk6 pk6Var) {
        si7Var.getClass();
        pk6Var.getClass();
        this.f19936a = si7Var;
        this.f19937b = pk6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8195a(ContinuationImpl continuationImpl) throws Throwable {
        CanDownloadOnCurrentNetworkUseCase$invoke$1 canDownloadOnCurrentNetworkUseCase$invoke$1;
        NetworkCapabilities networkCapabilities;
        if (continuationImpl instanceof CanDownloadOnCurrentNetworkUseCase$invoke$1) {
            canDownloadOnCurrentNetworkUseCase$invoke$1 = (CanDownloadOnCurrentNetworkUseCase$invoke$1) continuationImpl;
            int i = canDownloadOnCurrentNetworkUseCase$invoke$1.f19891c;
            if ((i & Integer.MIN_VALUE) != 0) {
                canDownloadOnCurrentNetworkUseCase$invoke$1.f19891c = i - Integer.MIN_VALUE;
            } else {
                canDownloadOnCurrentNetworkUseCase$invoke$1 = new CanDownloadOnCurrentNetworkUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            canDownloadOnCurrentNetworkUseCase$invoke$1 = new CanDownloadOnCurrentNetworkUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = canDownloadOnCurrentNetworkUseCase$invoke$1.f19889a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = canDownloadOnCurrentNetworkUseCase$invoke$1.f19891c;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            vi7 vi7Var = ((C1368a) this.f19936a).f18359M0;
            canDownloadOnCurrentNetworkUseCase$invoke$1.f19891c = 1;
            objM15541t = AbstractC3224d.m15541t(vi7Var, canDownloadOnCurrentNetworkUseCase$invoke$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        boolean zBooleanValue = ((Boolean) objM15541t).booleanValue();
        Object systemService = this.f19937b.f56347a.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean zHasTransport = (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasTransport(0);
        if (!zBooleanValue && zHasTransport) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
