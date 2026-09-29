package com.lingq.feature.library;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.feature.library.domain.C2145b;
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
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$onBuyLessonConfirmed$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1183, 1188}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$onBuyLessonConfirmed$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryItem f26525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$onBuyLessonConfirmed$1(LibraryItem libraryItem, C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26524b = c2146e;
        this.f26525c = libraryItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$onBuyLessonConfirmed$1(this.f26525c, this.f26524b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$onBuyLessonConfirmed$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2146e c2146e = this.f26524b;
        C2145b c2145b = c2146e.f26686k;
        cma cmaVar = c2146e.f26677b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26523a;
        xfa xfaVar = xfa.f68157a;
        LibraryItem libraryItem = this.f26525c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        AbstractC3193b.m15359b(obj);
        String strMo4589b2 = cmaVar.mo4589b2();
        Language language = (Language) cmaVar.mo4572B0().getValue();
        int i2 = language != null ? language.f19025b : 0;
        int i3 = libraryItem.f19426a;
        this.f26523a = 1;
        if (c2145b.m9062a(strMo4589b2, i2, i3, this) != coroutineSingletons) {
        }
        cmaVar.mo4589b2();
        int i4 = libraryItem.f19426a;
        this.f26523a = 2;
        Object objM7270b0 = ((C1295k) c2145b.f26649a).m7270b0(i4, true, this);
        if (objM7270b0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM7270b0 = xfaVar;
        }
        return objM7270b0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
