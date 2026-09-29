package com.lingq.feature.library;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.f23;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$flatMapLatest$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class LibraryUpdateViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26595a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26596b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26597c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2146e f26598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$special$$inlined$flatMapLatest$1(C2146e c2146e, Continuation continuation) {
        super(3, continuation);
        this.f26598d = c2146e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LibraryUpdateViewModel$special$$inlined$flatMapLatest$1 libraryUpdateViewModel$special$$inlined$flatMapLatest$1 = new LibraryUpdateViewModel$special$$inlined$flatMapLatest$1(this.f26598d, (Continuation) obj3);
        libraryUpdateViewModel$special$$inlined$flatMapLatest$1.f26596b = (e83) obj;
        libraryUpdateViewModel$special$$inlined$flatMapLatest$1.f26597c = obj2;
        return libraryUpdateViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26596b;
        Object obj2 = this.f26597c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26595a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) obj2;
            f23 f23Var = this.f26598d.f26690o;
            f23Var.getClass();
            str.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1290f) f23Var.f38305a).m7183g(str));
            this.f26596b = null;
            this.f26597c = null;
            this.f26595a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
