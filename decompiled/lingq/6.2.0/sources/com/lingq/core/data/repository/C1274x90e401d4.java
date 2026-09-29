package com.lingq.core.data.repository;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.ma3;
import p000.u91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.data.repository.LessonRepositoryImpl$observableLessonSentencesForPages$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$observableLessonSentencesForPages$$inlined$combine$1$3", m4291f = "LessonRepositoryImpl.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1274x90e401d4 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f15466a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f15467b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f15468c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1274x90e401d4 c1274x90e401d4 = new C1274x90e401d4(3, (Continuation) obj3);
        c1274x90e401d4.f15467b = (e83) obj;
        c1274x90e401d4.f15468c = (Object[]) obj2;
        return c1274x90e401d4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15466a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83 e83Var = this.f15467b;
            List[] listArr = (List[]) this.f15468c;
            ArrayList arrayList = new ArrayList();
            for (List list : listArr) {
                u91.m22630w0(list, arrayList);
            }
            List listM22614f1 = u91.m22614f1(arrayList, new ma3(25));
            this.f15467b = null;
            this.f15468c = null;
            this.f15466a = 1;
            if (e83Var.emit(listM22614f1, this) == coroutineSingletons) {
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
