package com.lingq.feature.library;

import com.lingq.core.domain.library.C1387b;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h68;
import p000.jp4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$observeAndHandleNotifications$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {864}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$observeAndHandleNotifications$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26511a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2146e f26513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$observeAndHandleNotifications$2(C2146e c2146e, Continuation continuation) {
        super(2, continuation);
        this.f26513c = c2146e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$observeAndHandleNotifications$2 libraryUpdateViewModel$observeAndHandleNotifications$2 = new LibraryUpdateViewModel$observeAndHandleNotifications$2(this.f26513c, continuation);
        libraryUpdateViewModel$observeAndHandleNotifications$2.f26512b = obj;
        return libraryUpdateViewModel$observeAndHandleNotifications$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$observeAndHandleNotifications$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f26512b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26511a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jp4 jp4Var = (jp4) pair.f47623a;
            LanguageStudyStats languageStudyStats = (LanguageStudyStats) pair.f47624b;
            if (jp4Var != null && languageStudyStats != null && jp4Var.f45958c) {
                h68 h68Var = new h68(jp4Var.f45957b, 88, jp4Var.f45960e, languageStudyStats.f19109d < 5000);
                C2146e c2146e = this.f26513c;
                if (((Boolean) c2146e.f26673V.getValue()).booleanValue()) {
                    c2146e.m9078j3(h68Var);
                } else {
                    c2146e.f26676Y = h68Var;
                }
                C1387b c1387b = c2146e.f26694s;
                String strMo4589b2 = c2146e.f26677b.mo4589b2();
                this.f26512b = null;
                this.f26511a = 1;
                if (c1387b.m8003c(strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
