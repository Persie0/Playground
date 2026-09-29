package com.lingq.feature.library;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.c7a;
import p000.e28;
import p000.e7a;
import p000.ja5;
import p000.s45;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$2(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26476b = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$2 libraryUpdateViewModel$2 = new LibraryUpdateViewModel$2(this.f26476b, continuation);
        libraryUpdateViewModel$2.f26475a = obj;
        return libraryUpdateViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$2 libraryUpdateViewModel$2 = (LibraryUpdateViewModel$2) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Pair pair = (Pair) this.f26475a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        e28 e28Var = (e28) pair.f47623a;
        s45 s45Var = (s45) pair.f47624b;
        C2146e c2146e = this.f26476b;
        e7a e7aVar = c2146e.f26656E;
        C3244l c3244l = c2146e.f26658G;
        if (!((ja5) c3244l.getValue()).f45344i) {
            TooltipStep tooltipStep = TooltipStep.ChooseFirstLesson;
            if (e7aVar.mo8753Z0(tooltipStep) && !e7aVar.mo8744P0(tooltipStep)) {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, ja5.m14361a((ja5) value, null, null, false, null, false, null, new c7a(TooltipStep.ChooseFirstLesson, e28Var, true, false, 0.0f, 88), s45Var, true, false, false, 1599)));
            }
        }
        return xfa.f68157a;
    }
}
