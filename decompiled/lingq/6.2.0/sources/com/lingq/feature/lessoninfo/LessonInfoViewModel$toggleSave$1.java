package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$toggleSave$1", m4291f = "LessonInfoViewModel.kt", m4292l = {418}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$toggleSave$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f26399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$toggleSave$1(C2132c c2132c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f26398b = c2132c;
        this.f26399c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$toggleSave$1(this.f26398b, this.f26399c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$toggleSave$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26397a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26398b;
            C3139j9 c3139j9 = c2132c.f26423n;
            cma cmaVar = c2132c.f26411b;
            Language language = (Language) cmaVar.mo4572B0().getValue();
            int i2 = language != null ? language.f19025b : 0;
            int i3 = c2132c.f26429t.f66282a;
            boolean z = !this.f26399c;
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f26397a = 1;
            if (c3139j9.m14347b(i2, i3, strMo4589b2, this, z) == coroutineSingletons) {
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
