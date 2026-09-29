package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1295k;
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
import p000.n23;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$2", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30667a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30668b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30669c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$2(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30670d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$2 lessonCompleteViewModel$special$$inlined$flatMapLatest$2 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$2(this.f30670d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$2.f30668b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$2.f30669c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30668b;
        Object obj2 = this.f30669c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30667a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) obj2).intValue();
            C2535j c2535j = this.f30670d;
            n23 n23Var = c2535j.f30857w;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            n23Var.getClass();
            strMo4589b2.getClass();
            c83 c83VarM7255M = ((C1295k) n23Var.f52215a).m7255M(iIntValue, strMo4589b2);
            this.f30668b = null;
            this.f30669c = null;
            this.f30667a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7255M, this) == coroutineSingletons) {
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
