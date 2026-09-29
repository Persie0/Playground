package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c23;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$buildLibraryAdapterItems$1$1", m4291f = "SearchViewModel.kt", m4292l = {796}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$buildLibraryAdapterItems$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f32999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryItem f33000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$buildLibraryAdapterItems$1$1(C2779e c2779e, LibraryItem libraryItem, Continuation continuation) {
        super(2, continuation);
        this.f32999b = c2779e;
        this.f33000c = libraryItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchViewModel$buildLibraryAdapterItems$1$1(this.f32999b, this.f33000c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$buildLibraryAdapterItems$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32998a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2779e c2779e = this.f32999b;
            c23 c23Var = c2779e.f33105m;
            String strMo4589b2 = c2779e.f33094b.mo4589b2();
            int i2 = this.f33000c.f19426a;
            String value = LibraryItemType.Collection.getValue();
            this.f32998a = 1;
            Object objM7322q = ((C1296l) c23Var.f9349a).m7322q(i2, strMo4589b2, value, this, true);
            if (objM7322q != coroutineSingletons) {
                objM7322q = xfaVar;
            }
            if (objM7322q == coroutineSingletons) {
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
