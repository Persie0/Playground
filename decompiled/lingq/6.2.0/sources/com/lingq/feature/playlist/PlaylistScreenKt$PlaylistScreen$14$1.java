package com.lingq.feature.playlist;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.cn2;
import p000.iy5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistScreenKt$PlaylistScreen$14$1", m4291f = "PlaylistScreen.kt", m4292l = {617}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistScreenKt$PlaylistScreen$14$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f27606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScreenKt$PlaylistScreen$14$1(t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f27606b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistScreenKt$PlaylistScreen$14$1(this.f27606b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistScreenKt$PlaylistScreen$14$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27605a;
        t66 t66Var = this.f27606b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                iy5 iy5Var = cn2.f10315b;
                long jM17117e0 = AbstractC3352my.m17117e0(1, DurationUnit.SECONDS);
                this.f27605a = 1;
                if (AbstractC3208a.m15438e(jM17117e0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        t66Var.setValue(Boolean.FALSE);
        return xfa.f68157a;
    }
}
