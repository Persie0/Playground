package com.lingq.feature.reader.reader;

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
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$4", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeLessonStudyTracking$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeLessonStudyTracking$4(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30011b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeLessonStudyTracking$4 readerComposeViewModel$observeLessonStudyTracking$4 = new ReaderComposeViewModel$observeLessonStudyTracking$4(this.f30011b, continuation);
        readerComposeViewModel$observeLessonStudyTracking$4.f30010a = obj;
        return readerComposeViewModel$observeLessonStudyTracking$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeLessonStudyTracking$4 readerComposeViewModel$observeLessonStudyTracking$4 = (ReaderComposeViewModel$observeLessonStudyTracking$4) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeLessonStudyTracking$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f30010a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = (List) pair.f47623a;
        String str = (String) pair.f47624b;
        rm5 rm5Var = sm5.Companion;
        int size = list.size();
        C2493a c2493a = this.f30011b;
        int i = ((yz4) ((C3244l) c2493a.f30212e.f27957w.f9311a).getValue()).f70680n;
        StringBuilder sbM22995r = ux5.m22995r(size, "[LessonTracking] ReaderComposeViewModel.observeLessonStudyTracking units=", " activeUnitKey=", str, " currentPage=");
        sbM22995r.append(i);
        String string = sbM22995r.toString();
        rm5Var.getClass();
        h0a.f41641a.mo11431b(string, new Object[0]);
        C2574a c2574a = c2493a.f30186H;
        c2574a.m9504o(list);
        c2574a.m9502k(str);
        return xfa.f68157a;
    }
}
