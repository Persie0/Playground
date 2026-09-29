package com.lingq.feature.library;

import com.lingq.core.analytics.C1240a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateFragment$onResume$1", m4291f = "LibraryUpdateFragment.kt", m4292l = {258}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateFragment$onResume$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LibraryUpdateFragment f26440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateFragment$onResume$1(LibraryUpdateFragment libraryUpdateFragment, Continuation continuation) {
        super(2, continuation);
        this.f26440b = libraryUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateFragment$onResume$1(this.f26440b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateFragment$onResume$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26439a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f26439a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ((C1240a) this.f26440b.m9052g0()).m7028i(true);
        return xfa.f68157a;
    }
}
