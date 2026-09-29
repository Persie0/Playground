package com.lingq.feature.imports;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$networkTags$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$networkTags$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$networkTags$1(C2108e c2108e, String str, Continuation continuation) {
        super(2, continuation);
        this.f26064b = c2108e;
        this.f26065c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportSelectionViewModel$networkTags$1(this.f26064b, this.f26065c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportSelectionViewModel$networkTags$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26063a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = this.f26064b.f26158f;
            this.f26063a = 1;
            if (((C1295k) d65Var).m7301u(this.f26065c, this) == coroutineSingletons) {
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
