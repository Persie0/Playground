package com.lingq.feature.reader.video;

import com.lingq.feature.reader.tracking.C2574a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeLessonStudyTracking$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeLessonStudyTracking$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeLessonStudyTracking$2(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31228b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeLessonStudyTracking$2 readerVideoComposeViewModel$observeLessonStudyTracking$2 = new ReaderVideoComposeViewModel$observeLessonStudyTracking$2(this.f31228b, continuation);
        readerVideoComposeViewModel$observeLessonStudyTracking$2.f31227a = obj;
        return readerVideoComposeViewModel$observeLessonStudyTracking$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderVideoComposeViewModel$observeLessonStudyTracking$2 readerVideoComposeViewModel$observeLessonStudyTracking$2 = (ReaderVideoComposeViewModel$observeLessonStudyTracking$2) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeLessonStudyTracking$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f31227a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        String str = (String) pair.f47624b;
        rm5 rm5Var = sm5.Companion;
        int size = list.size();
        C2583a c2583a = this.f31228b;
        Object value = ((C3244l) c2583a.f31360S.f9311a).getValue();
        StringBuilder sbM22995r = ux5.m22995r(size, "[LessonTracking] ReaderVideoComposeViewModel.observeLessonStudyTracking units=", " activeUnitKey=", str, " activeScrollIndex=");
        sbM22995r.append(value);
        String string = sbM22995r.toString();
        rm5Var.getClass();
        h0a.f41641a.mo11431b(string, new Object[0]);
        C2574a c2574a = c2583a.f31391x;
        c2574a.m9504o(list);
        c2574a.m9502k(str);
        return xfa.f68157a;
    }
}
