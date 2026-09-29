package com.lingq.feature.playlist;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fa4;
import p000.hbb;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.MiniPlayerKt$MiniPlayer$1$1", m4291f = "MiniPlayer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MiniPlayerKt$MiniPlayer$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f27584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f27585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f27586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerKt$MiniPlayer$1$1(String str, vi3 vi3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f27584a = str;
        this.f27585b = vi3Var;
        this.f27586c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniPlayerKt$MiniPlayer$1$1(this.f27584a, this.f27585b, this.f27586c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MiniPlayerKt$MiniPlayer$1$1 miniPlayerKt$MiniPlayer$1$1 = (MiniPlayerKt$MiniPlayer$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        miniPlayerKt$MiniPlayer$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = this.f27584a;
        if (str != null) {
            t66 t66Var = this.f27586c;
            if (!fa4.m11650l((String) t66Var.getValue(), str)) {
                t66Var.setValue(str);
                this.f27585b.invoke(new hbb(str));
            }
        }
        return xfa.f68157a;
    }
}
