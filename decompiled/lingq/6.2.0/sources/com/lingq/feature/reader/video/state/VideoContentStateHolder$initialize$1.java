package com.lingq.feature.reader.video.state;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.qj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$initialize$1", m4291f = "VideoContentStateHolder.kt", m4292l = {169}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$initialize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2595a f31465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31466c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f31467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$initialize$1(C2595a c2595a, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f31465b = c2595a;
        this.f31466c = str;
        this.f31467d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoContentStateHolder$initialize$1(this.f31465b, this.f31466c, this.f31467d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoContentStateHolder$initialize$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31464a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            qj2 qj2Var = this.f31465b.f31528e;
            this.f31464a = 1;
            if (((C1295k) qj2Var.f57848a).m7265W(this.f31467d, this.f31466c, this) == coroutineSingletons) {
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
