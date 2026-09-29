package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.y95;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryStructureUseCase$invoke$2", m4291f = "GetLibraryStructureUseCase.kt", m4292l = {38}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLibraryStructureUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1389d f18770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Language f18771c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f18772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryStructureUseCase$invoke$2(C1389d c1389d, Language language, List list, Continuation continuation) {
        super(1, continuation);
        this.f18770b = c1389d;
        this.f18771c = language;
        this.f18772d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetLibraryStructureUseCase$invoke$2(this.f18770b, this.f18771c, this.f18772d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetLibraryStructureUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18769a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            y95 y95Var = this.f18770b.f18834a;
            String str = this.f18771c.f19024a;
            this.f18769a = 1;
            if (((C1296l) y95Var).m7325t(str, this.f18772d, this) == coroutineSingletons) {
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
