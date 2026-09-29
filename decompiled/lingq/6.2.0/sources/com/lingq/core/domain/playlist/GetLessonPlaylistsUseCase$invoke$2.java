package com.lingq.core.domain.playlist;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetLessonPlaylistsUseCase$invoke$2", m4291f = "GetLessonPlaylistsUseCase.kt", m4292l = {19}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLessonPlaylistsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f19912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1523f f19913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19914c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f19915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonPlaylistsUseCase$invoke$2(C1523f c1523f, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f19913b = c1523f;
        this.f19914c = str;
        this.f19915d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLessonPlaylistsUseCase$invoke$2(this.f19913b, this.f19914c, this.f19915d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLessonPlaylistsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19912a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xd7 xd7Var = this.f19913b.f19947a;
            this.f19912a = 1;
            if (((C1302r) xd7Var).m7342C(this.f19915d, this.f19914c, this) == coroutineSingletons) {
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
