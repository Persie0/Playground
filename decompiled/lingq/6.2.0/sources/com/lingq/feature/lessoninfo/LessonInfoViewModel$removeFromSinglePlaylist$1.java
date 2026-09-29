package com.lingq.feature.lessoninfo;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3713w8;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$removeFromSinglePlaylist$1", m4291f = "LessonInfoViewModel.kt", m4292l = {464}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$removeFromSinglePlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LessonInfo f26388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$removeFromSinglePlaylist$1(LessonInfo lessonInfo, C2132c c2132c, Continuation continuation) {
        super(2, continuation);
        this.f26387b = c2132c;
        this.f26388c = lessonInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$removeFromSinglePlaylist$1(this.f26388c, this.f26387b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$removeFromSinglePlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26386a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26387b;
            C3713w8 c3713w8 = c2132c.f26421l;
            String strMo4589b2 = c2132c.f26411b.mo4589b2();
            String str = this.f26388c.f19353I;
            if (str == null) {
                str = "";
            }
            int i2 = c2132c.f26429t.f66282a;
            this.f26386a = 1;
            Object objM7362v = ((C1302r) c3713w8.f66505a).m7362v(i2, strMo4589b2, str, this);
            if (objM7362v != coroutineSingletons) {
                objM7362v = xfaVar;
            }
            if (objM7362v == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
