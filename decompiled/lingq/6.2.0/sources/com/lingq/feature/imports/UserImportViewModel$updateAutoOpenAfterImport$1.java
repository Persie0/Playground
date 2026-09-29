package com.lingq.feature.imports;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$updateAutoOpenAfterImport$1", m4291f = "UserImportViewModel.kt", m4292l = {463}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$updateAutoOpenAfterImport$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2109f f26140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f26141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$updateAutoOpenAfterImport$1(C2109f c2109f, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f26140b = c2109f;
        this.f26141c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$updateAutoOpenAfterImport$1(this.f26140b, this.f26141c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$updateAutoOpenAfterImport$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26139a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f26140b.f26176h;
            this.f26139a = 1;
            if (((C1368a) si7Var).m7879g(this.f26141c, this) == coroutineSingletons) {
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
