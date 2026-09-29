package com.lingq.feature.imports;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.fa4;
import p000.ika;
import p000.jka;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$openLesson$1", m4291f = "UserImportViewModel.kt", m4292l = {444}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$openLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2109f f26133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lesson f26134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$openLesson$1(C2109f c2109f, Lesson lesson, Continuation continuation) {
        super(2, continuation);
        this.f26133b = c2109f;
        this.f26134c = lesson;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$openLesson$1(this.f26133b, this.f26134c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$openLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C2109f c2109f = this.f26133b;
        jka jkaVar = c2109f.f26170b;
        cma cmaVar = c2109f.f26171c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26132a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!fa4.m11650l(cmaVar.mo4589b2(), ((ika) jkaVar.mo9014u2().getValue()).f44237a)) {
                String str = ((ika) jkaVar.mo9014u2().getValue()).f44237a;
                this.f26132a = 1;
                if (cmaVar.mo4576F1(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c2109f.clear();
        C3244l c3244l = c2109f.f26182n;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, null));
        c2109f.f26190v.mo4677k(this.f26134c);
        return xfa.f68157a;
    }
}
