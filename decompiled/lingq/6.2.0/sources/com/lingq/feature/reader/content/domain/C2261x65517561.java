package com.lingq.feature.reader.content.domain;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.domain.LessonTextProvider$observeLessonTextData$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.domain.LessonTextProvider$observeLessonTextData$$inlined$flatMapLatest$1", m4291f = "LessonTextProvider.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2261x65517561 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27964a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27965b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27966c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2262a f27967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261x65517561(Continuation continuation, C2262a c2262a) {
        super(3, continuation);
        this.f27967d = c2262a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2261x65517561 c2261x65517561 = new C2261x65517561((Continuation) obj3, this.f27967d);
        c2261x65517561.f27965b = (e83) obj;
        c2261x65517561.f27966c = obj2;
        return c2261x65517561.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f27965b;
        Object obj2 = this.f27966c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27964a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM17484a = this.f27967d.f27981b.m17484a((String) obj2);
            this.f27965b = null;
            this.f27966c = null;
            this.f27964a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM17484a, this) == coroutineSingletons) {
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
