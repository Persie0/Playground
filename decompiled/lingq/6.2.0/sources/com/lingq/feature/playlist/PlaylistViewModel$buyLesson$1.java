package com.lingq.feature.playlist;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$buyLesson$1", m4291f = "PlaylistViewModel.kt", m4292l = {892}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$buyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27653c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$buyLesson$1(C2255e c2255e, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f27652b = c2255e;
        this.f27653c = i;
        this.f27654d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$buyLesson$1(this.f27652b, this.f27653c, this.f27654d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$buyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27651a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27652b;
            C1525a c1525a = c2255e.f27832i;
            int iMo4584Q0 = c2255e.f27825b.mo4584Q0();
            this.f27651a = 1;
            if (c1525a.m8202a(iMo4584Q0, this.f27653c, this.f27654d, this) == coroutineSingletons) {
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
