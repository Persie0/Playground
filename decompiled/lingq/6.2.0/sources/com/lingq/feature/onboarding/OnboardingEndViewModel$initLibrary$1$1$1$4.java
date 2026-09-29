package com.lingq.feature.onboarding;

import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cma;
import p000.fa4;
import p000.u91;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1$1$1$4", m4291f = "OnboardingEndViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$initLibrary$1$1$1$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$initLibrary$1$1$1$4(C2197b c2197b, Continuation continuation) {
        super(2, continuation);
        this.f26962b = c2197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$4 = new OnboardingEndViewModel$initLibrary$1$1$1$4(this.f26962b, continuation);
        onboardingEndViewModel$initLibrary$1$1$1$4.f26961a = obj;
        return onboardingEndViewModel$initLibrary$1$1$1$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$4 = (OnboardingEndViewModel$initLibrary$1$1$1$4) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        onboardingEndViewModel$initLibrary$1$1$1$4.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f26961a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2197b c2197b = this.f26962b;
        cma cmaVar = c2197b.f27161b;
        for (LibraryShelf libraryShelf : u91.m22615g1(list, 3)) {
            Iterator it = libraryShelf.f19495c.iterator();
            while (it.hasNext()) {
                String str = ((LibraryTab) it.next()).f19502b;
                if (fa4.m11650l(str, LibraryContentType.Lessons.getValue())) {
                    LibraryTab libraryTabM9127V2 = C2197b.m9127V2(c2197b, libraryShelf);
                    C2197b.m9128W2(c2197b, cmaVar.mo4589b2(), libraryTabM9127V2.f19506f, libraryShelf, libraryTabM9127V2);
                } else if (fa4.m11650l(str, LibraryContentType.Courses.getValue())) {
                    LibraryTab libraryTabM9127V3 = C2197b.m9127V2(c2197b, libraryShelf);
                    wfb.m23926u(c2197b.f27169j, null, null, new OnboardingEndViewModel$fetchCoursesNetwork$1(c2197b, cmaVar.mo4589b2(), libraryShelf, libraryTabM9127V3, libraryTabM9127V3.f19506f, null), 3);
                } else {
                    LibraryTab libraryTabM9127V4 = C2197b.m9127V2(c2197b, libraryShelf);
                    C2197b.m9128W2(c2197b, cmaVar.mo4589b2(), libraryTabM9127V4.f19506f, libraryShelf, libraryTabM9127V4);
                }
            }
        }
        return xfa.f68157a;
    }
}
