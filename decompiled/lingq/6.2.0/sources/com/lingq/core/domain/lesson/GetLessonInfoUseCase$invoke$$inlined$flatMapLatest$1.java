package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.l85;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "GetLessonInfoUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f18679a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f18680b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18681c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1383e f18682d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f18683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, C1383e c1383e, int i) {
        super(3, continuation);
        this.f18682d = c1383e;
        this.f18683e = i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1 getLessonInfoUseCase$invoke$$inlined$flatMapLatest$1 = new GetLessonInfoUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f18682d, this.f18683e);
        getLessonInfoUseCase$invoke$$inlined$flatMapLatest$1.f18680b = (e83) obj;
        getLessonInfoUseCase$invoke$$inlined$flatMapLatest$1.f18681c = obj2;
        return getLessonInfoUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 c83VarM15536o;
        e83 e83Var = this.f18680b;
        Object obj2 = this.f18681c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18679a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LessonInfo lessonInfo = (LessonInfo) obj2;
            if (lessonInfo != null) {
                c83VarM15536o = new i83(lessonInfo, 1);
            } else {
                C1321i c1321i = ((C1296l) this.f18682d.f18730b).f16514d;
                c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1321i.f17034K, false, new String[]{"LibraryDataEntity"}, new l85(this.f18683e, c1321i, 2)), 17));
            }
            this.f18680b = null;
            this.f18681c = null;
            this.f18679a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
