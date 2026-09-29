package com.lingq.feature.reader.stats.p019ui.words;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$onIgnore$1", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {109}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueViewModel$onIgnore$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2573c f31100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonWord f31101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteDealBlueViewModel$onIgnore$1(C2573c c2573c, LessonWord lessonWord, Continuation continuation) {
        super(2, continuation);
        this.f31100b = c2573c;
        this.f31101c = lessonWord;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteDealBlueViewModel$onIgnore$1(this.f31100b, this.f31101c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteDealBlueViewModel$onIgnore$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31099a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2573c c2573c = this.f31100b;
            s7b s7bVar = c2573c.f31124g;
            String strMo4589b2 = c2573c.f31120c.mo4589b2();
            int i2 = c2573c.f31128k.f68959a;
            String str = this.f31101c.f19314a;
            String value = WordStatus.Ignored.getValue();
            this.f31099a = 1;
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
