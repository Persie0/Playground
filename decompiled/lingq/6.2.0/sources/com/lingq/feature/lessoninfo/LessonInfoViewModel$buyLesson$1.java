package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$buyLesson$1", m4291f = "LessonInfoViewModel.kt", m4292l = {510}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$buyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26347c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f26348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$buyLesson$1(C2132c c2132c, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f26346b = c2132c;
        this.f26347c = i;
        this.f26348d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$buyLesson$1(this.f26346b, this.f26347c, this.f26348d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$buyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26345a;
        C2132c c2132c = this.f26346b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1525a c1525a = c2132c.f26424o;
            Language language = (Language) c2132c.f26411b.mo4572B0().getValue();
            int i2 = language != null ? language.f19025b : 0;
            this.f26345a = 1;
            if (c1525a.m8202a(i2, this.f26347c, this.f26348d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c2132c.m9049V2();
        return xfa.f68157a;
    }
}
