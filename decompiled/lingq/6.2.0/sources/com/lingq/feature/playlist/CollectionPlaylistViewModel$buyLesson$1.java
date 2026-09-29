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
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$buyLesson$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {365}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$buyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27548c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$buyLesson$1(C2251a c2251a, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f27547b = c2251a;
        this.f27548c = i;
        this.f27549d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionPlaylistViewModel$buyLesson$1(this.f27547b, this.f27548c, this.f27549d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionPlaylistViewModel$buyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27546a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2251a c2251a = this.f27547b;
            C1525a c1525a = c2251a.f27777f;
            int iMo4584Q0 = c2251a.f27773b.mo4584Q0();
            this.f27546a = 1;
            if (c1525a.m8202a(iMo4584Q0, this.f27548c, this.f27549d, this) == coroutineSingletons) {
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
