package com.lingq.feature.playlist;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$showPlayer$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {118}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$showPlayer$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27575a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27576b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f27577c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CollectionPlaylistViewModel$showPlayer$1 collectionPlaylistViewModel$showPlayer$1 = new CollectionPlaylistViewModel$showPlayer$1(3, (Continuation) obj3);
        collectionPlaylistViewModel$showPlayer$1.f27576b = (e83) obj;
        collectionPlaylistViewModel$showPlayer$1.f27577c = (List) obj2;
        return collectionPlaylistViewModel$showPlayer$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f27576b;
        List list = this.f27577c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27575a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Boolean boolValueOf = Boolean.valueOf(!list.isEmpty());
            this.f27576b = null;
            this.f27577c = null;
            this.f27575a = 1;
            if (e83Var.emit(boolValueOf, this) == coroutineSingletons) {
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
