package com.lingq.core.domain.library;

import com.lingq.core.domain.model.language.Language;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetBetaWarningUseCase$invoke$1", m4291f = "GetBetaWarningUseCase.kt", m4292l = {15}, m4293m = "invokeSuspend", m4294v = 2)
final class GetBetaWarningUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f18736a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f18737b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f18738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Language f18739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBetaWarningUseCase$invoke$1(Language language, Continuation continuation) {
        super(3, continuation);
        this.f18739d = language;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetBetaWarningUseCase$invoke$1 getBetaWarningUseCase$invoke$1 = new GetBetaWarningUseCase$invoke$1(this.f18739d, (Continuation) obj3);
        getBetaWarningUseCase$invoke$1.f18737b = (e83) obj;
        getBetaWarningUseCase$invoke$1.f18738c = (Map) obj2;
        return getBetaWarningUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f18737b;
        Map map = this.f18738c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18736a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Language language = this.f18739d;
            Boolean boolValueOf = Boolean.valueOf(language.f19028e || fa4.m11650l(map.get(language.f19024a), Boolean.FALSE));
            this.f18737b = null;
            this.f18738c = null;
            this.f18736a = 1;
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
