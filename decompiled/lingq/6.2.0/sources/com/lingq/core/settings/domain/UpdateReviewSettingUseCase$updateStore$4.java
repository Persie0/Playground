package com.lingq.core.settings.domain;

import com.lingq.core.datastore.C1370c;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ig8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.UpdateReviewSettingUseCase$updateStore$4", m4291f = "UpdateReviewSettingUseCase.kt", m4292l = {78}, m4293m = "invokeSuspend", m4294v = 2)
final class UpdateReviewSettingUseCase$updateStore$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22914a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1872k f22916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateReviewSettingUseCase$updateStore$4(C1872k c1872k, Continuation continuation) {
        super(2, continuation);
        this.f22916c = c1872k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateReviewSettingUseCase$updateStore$4 updateReviewSettingUseCase$updateStore$4 = new UpdateReviewSettingUseCase$updateStore$4(this.f22916c, continuation);
        updateReviewSettingUseCase$updateStore$4.f22915b = obj;
        return updateReviewSettingUseCase$updateStore$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateReviewSettingUseCase$updateStore$4) create((Map) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = (Map) this.f22915b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22914a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ig8 ig8Var = this.f22916c.f22959a;
            this.f22915b = null;
            this.f22914a = 1;
            if (((C1370c) ig8Var).m7937c(map, this) == coroutineSingletons) {
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
