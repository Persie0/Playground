package com.lingq.feature.onboarding.p014v2.domain;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.domain.PrefetchLibraryDataUseCase$fetchShelfContent$1", m4291f = "PrefetchLibraryDataUseCase.kt", m4292l = {113}, m4293m = "invokeSuspend", m4294v = 2)
final class PrefetchLibraryDataUseCase$fetchShelfContent$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2224e f27430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27431c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LibraryShelf f27432d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LibraryTab f27433e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f27434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchLibraryDataUseCase$fetchShelfContent$1(C2224e c2224e, String str, LibraryShelf libraryShelf, LibraryTab libraryTab, String str2, Continuation continuation) {
        super(2, continuation);
        this.f27430b = c2224e;
        this.f27431c = str;
        this.f27432d = libraryShelf;
        this.f27433e = libraryTab;
        this.f27434f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrefetchLibraryDataUseCase$fetchShelfContent$1(this.f27430b, this.f27431c, this.f27432d, this.f27433e, this.f27434f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchLibraryDataUseCase$fetchShelfContent$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27429a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                y95 y95Var = this.f27430b.f27476d;
                String str = this.f27431c;
                String strM18220E = AbstractC3423or.m18220E(this.f27432d, this.f27433e);
                String str2 = this.f27434f;
                this.f27429a = 1;
                if (y95.m24995a(y95Var, str, strM18220E, "", true, str2, null, null, null, 0, this, 480) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
