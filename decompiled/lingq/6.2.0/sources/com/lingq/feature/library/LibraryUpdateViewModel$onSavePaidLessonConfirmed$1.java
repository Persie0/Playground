package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onSavePaidLessonConfirmed$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1209}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onSavePaidLessonConfirmed$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26554b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryItem f26555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onSavePaidLessonConfirmed$1(LibraryItem libraryItem, C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26554b = c2146e;
        this.f26555c = libraryItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onSavePaidLessonConfirmed$1(this.f26555c, this.f26554b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onSavePaidLessonConfirmed$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2146e c2146e = this.f26554b;
        cma cmaVar = c2146e.f26677b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26553a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            Language language = (Language) cmaVar.mo4572B0().getValue();
            int i2 = language != null ? language.f19025b : 0;
            int i3 = this.f26555c.f19426a;
            this.f26553a = 1;
            if (c2146e.f26686k.m9063b(i2, i3, strMo4589b2, this, false) == coroutineSingletons) {
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
