package com.lingq.core.download;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1", m4291f = "AudioDownloadManager.kt", m4292l = {119}, m4293m = "invokeSuspend", m4294v = 2)
final class AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1547b f20178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f20179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1(C1547b c1547b, int i, Continuation continuation) {
        super(2, continuation);
        this.f20178b = c1547b;
        this.f20179c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1(this.f20178b, this.f20179c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioDownloadManagerImpl$cancelAllDownloadsFor$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20177a;
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
        lj2 lj2Var = this.f20178b.f20220d;
        this.f20177a = 1;
        lj2Var.m16253a(this.f20179c);
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
