package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3713w8;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$removeLessonFromPlaylist$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {1005}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$removeLessonFromPlaylist$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f30640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30642c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$removeLessonFromPlaylist$1(C2535j c2535j, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f30641b = c2535j;
        this.f30642c = str;
        this.f30643d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonCompleteViewModel$removeLessonFromPlaylist$1(this.f30641b, this.f30642c, this.f30643d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonCompleteViewModel$removeLessonFromPlaylist$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30640a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2535j c2535j = this.f30641b;
            C3713w8 c3713w8 = c2535j.f30800J;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            this.f30640a = 1;
            Object objM7362v = ((C1302r) c3713w8.f66505a).m7362v(this.f30643d, strMo4589b2, this.f30642c, this);
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
