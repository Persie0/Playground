package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$special$$inlined$flatMapLatest$8", m4291f = "LessonCompleteViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonCompleteViewModel$special$$inlined$flatMapLatest$8 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30691a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30692b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30693c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$special$$inlined$flatMapLatest$8(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30694d = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$special$$inlined$flatMapLatest$8 lessonCompleteViewModel$special$$inlined$flatMapLatest$8 = new LessonCompleteViewModel$special$$inlined$flatMapLatest$8(this.f30694d, (Continuation) obj3);
        lessonCompleteViewModel$special$$inlined$flatMapLatest$8.f30692b = (e83) obj;
        lessonCompleteViewModel$special$$inlined$flatMapLatest$8.f30693c = obj2;
        return lessonCompleteViewModel$special$$inlined$flatMapLatest$8.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30692b;
        Object obj2 = this.f30693c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30691a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3228h c3228hM8207a = this.f30694d.f30838l.m8207a(((Language) obj2).f19024a);
            this.f30692b = null;
            this.f30693c = null;
            this.f30691a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3228hM8207a, this) == coroutineSingletons) {
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
