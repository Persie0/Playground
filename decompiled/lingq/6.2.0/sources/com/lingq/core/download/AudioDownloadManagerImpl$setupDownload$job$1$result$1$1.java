package com.lingq.core.download;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2907cy;
import p000.C3386nv;
import p000.c32;
import p000.lj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl$setupDownload$job$1$result$1$1", m4291f = "AudioDownloadManager.kt", m4292l = {90}, m4293m = "invokeSuspend", m4294v = 2)
final class AudioDownloadManagerImpl$setupDownload$job$1$result$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1547b f20204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DownloadItem f20205c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f20206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$setupDownload$job$1$result$1$1(C1547b c1547b, DownloadItem downloadItem, int i, Continuation continuation) {
        super(2, continuation);
        this.f20204b = c1547b;
        this.f20205c = downloadItem;
        this.f20206d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioDownloadManagerImpl$setupDownload$job$1$result$1$1(this.f20204b, this.f20205c, this.f20206d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioDownloadManagerImpl$setupDownload$job$1$result$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20203a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f20203a = 1;
            lj2 lj2Var = this.f20204b.f20220d;
            DownloadItem downloadItem = this.f20205c;
            lj2Var.m16254b(new C2907cy(downloadItem.f18843b, downloadItem.f18842a, this.f20206d));
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
