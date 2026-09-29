package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import com.lingq.feature.library.domain.C2144a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$flatMapLatest$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LibraryUpdateViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26599a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26600b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26601c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2146e f26602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$special$$inlined$flatMapLatest$2(C2146e c2146e, Continuation continuation) {
        super(3, continuation);
        this.f26602d = c2146e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LibraryUpdateViewModel$special$$inlined$flatMapLatest$2 libraryUpdateViewModel$special$$inlined$flatMapLatest$2 = new LibraryUpdateViewModel$special$$inlined$flatMapLatest$2(this.f26602d, (Continuation) obj3);
        libraryUpdateViewModel$special$$inlined$flatMapLatest$2.f26600b = (e83) obj;
        libraryUpdateViewModel$special$$inlined$flatMapLatest$2.f26601c = obj2;
        return libraryUpdateViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26600b;
        Object obj2 = this.f26601c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26599a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3228h c3228hM9061a = C2144a.m9061a(this.f26602d.f26699x, ((Language) obj2).f19024a);
            this.f26600b = null;
            this.f26601c = null;
            this.f26599a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3228hM9061a, this) == coroutineSingletons) {
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
