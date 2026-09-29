package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$onIgnore$1", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {109}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsViewModel$onIgnore$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2457b f29535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f29536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$onIgnore$1(C2457b c2457b, LessonWord lessonWord, Continuation continuation) {
        super(2, continuation);
        this.f29535b = c2457b;
        this.f29536c = lessonWord;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsViewModel$onIgnore$1(this.f29535b, this.f29536c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsViewModel$onIgnore$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29534a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2457b c2457b = this.f29535b;
            s7b s7bVar = c2457b.f29650f;
            String strMo4589b2 = c2457b.f29647c.mo4589b2();
            int i2 = c2457b.f29654j;
            String str = this.f29536c.f19314a;
            String value = WordStatus.Ignored.getValue();
            this.f29534a = 1;
            if (((C1310z) s7bVar).m7429h(i2, strMo4589b2, str, value, "Deal with blue word pop up", this) == coroutineSingletons) {
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
