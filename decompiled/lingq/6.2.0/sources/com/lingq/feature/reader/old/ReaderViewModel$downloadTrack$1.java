package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$downloadTrack$1", m4291f = "ReaderViewModel.kt", m4292l = {2209}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$downloadTrack$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$downloadTrack$1(C2412n c2412n, String str, Continuation continuation) {
        super(1, continuation);
        this.f28930b = c2412n;
        this.f28931c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderViewModel$downloadTrack$1(this.f28930b, this.f28931c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderViewModel$downloadTrack$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28929a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28930b;
            DownloadItem downloadItem = new DownloadItem(c2412n.f29340b.mo4589b2(), c2412n.m9332l3(), this.f28931c);
            this.f28929a = 1;
            if (c2412n.f29352e.mo8234r(downloadItem, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
