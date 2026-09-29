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
@c32(m4290c = "com.lingq.core.settings.domain.UpdateReviewSettingUseCase$updateStore$3", m4291f = "UpdateReviewSettingUseCase.kt", m4292l = {72}, m4293m = "invokeSuspend", m4294v = 2)
final class UpdateReviewSettingUseCase$updateStore$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22911a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1872k f22913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateReviewSettingUseCase$updateStore$3(C1872k c1872k, Continuation continuation) {
        super(2, continuation);
        this.f22913c = c1872k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdateReviewSettingUseCase$updateStore$3 updateReviewSettingUseCase$updateStore$3 = new UpdateReviewSettingUseCase$updateStore$3(this.f22913c, continuation);
        updateReviewSettingUseCase$updateStore$3.f22912b = obj;
        return updateReviewSettingUseCase$updateStore$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateReviewSettingUseCase$updateStore$3) create((Map) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map map = (Map) this.f22912b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22911a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ig8 ig8Var = this.f22913c.f22959a;
            this.f22912b = null;
            this.f22911a = 1;
            if (((C1370c) ig8Var).m7936b(map, this) == coroutineSingletons) {
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
