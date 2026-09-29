package com.lingq.core.domain.token;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj3;
import p000.bq1;
import p000.c32;
import p000.e83;
import p000.v91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.token.GetWordsForTokensUseCase$invoke$1$invokeSuspend$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetWordsForTokensUseCase$invoke$1$invokeSuspend$$inlined$combine$1$3", m4291f = "GetWordsForTokensUseCase.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1532xa7874ee0 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f20082a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f20083b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f20084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Locale f20085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532xa7874ee0(Continuation continuation, Locale locale) {
        super(3, continuation);
        this.f20085d = locale;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1532xa7874ee0 c1532xa7874ee0 = new C1532xa7874ee0((Continuation) obj3, this.f20085d);
        c1532xa7874ee0.f20083b = (e83) obj;
        c1532xa7874ee0.f20084c = (Object[]) obj2;
        return c1532xa7874ee0.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f20083b;
        Object[] objArr = this.f20084c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20082a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM23190r0 = v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr));
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayListM23190r0, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj2 : arrayListM23190r0) {
                String str = ((LessonWord) obj2).f19314a;
                Locale locale = this.f20085d;
                locale.getClass();
                linkedHashMap.put(bq1.m4063n0(str, locale), obj2);
            }
            this.f20083b = null;
            this.f20084c = null;
            this.f20082a = 1;
            if (e83Var.emit(linkedHashMap, this) == coroutineSingletons) {
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
