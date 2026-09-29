package com.lingq.core.download;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.download.FontDownloadManagerImpl$1", m4291f = "FontDownloadManager.kt", m4292l = {54}, m4293m = "invokeSuspend", m4294v = 2)
final class FontDownloadManagerImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1549d f20208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontDownloadManagerImpl$1(C1549d c1549d, Continuation continuation) {
        super(2, continuation);
        this.f20208b = c1549d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FontDownloadManagerImpl$1(this.f20208b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FontDownloadManagerImpl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20207a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1549d c1549d = this.f20208b;
            du0 du0Var = c1549d.f20229f;
            C1548c c1548c = new C1548c(c1549d);
            this.f20207a = 1;
            if (du0Var.collect(c1548c, this) == coroutineSingletons) {
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
