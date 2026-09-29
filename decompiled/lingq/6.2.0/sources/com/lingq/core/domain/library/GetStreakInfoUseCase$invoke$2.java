package com.lingq.core.domain.library;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetStreakInfoUseCase$invoke$2", m4291f = "GetStreakInfoUseCase.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetStreakInfoUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1392g f18815b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStreakInfoUseCase$invoke$2(C1392g c1392g, String str, Continuation continuation) {
        super(1, continuation);
        this.f18815b = c1392g;
        this.f18816c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetStreakInfoUseCase$invoke$2(this.f18815b, this.f18816c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetStreakInfoUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18814a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            oo4 oo4Var = this.f18815b.f18839a;
            this.f18814a = 1;
            if (((C1294j) oo4Var).m7231e(this.f18816c, this) == coroutineSingletons) {
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
