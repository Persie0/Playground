package com.lingq.core.domain.library;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1286b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetBlacklistsUseCase$invoke$2", m4291f = "GetBlacklistsUseCase.kt", m4292l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetBlacklistsUseCase$invoke$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f18742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1387b f18743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f18744c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBlacklistsUseCase$invoke$2(C1387b c1387b, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f18743b = c1387b;
        this.f18744c = i;
        this.f18745d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetBlacklistsUseCase$invoke$2(this.f18743b, this.f18744c, this.f18745d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetBlacklistsUseCase$invoke$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18742a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1286b c1286b = (C1286b) this.f18743b.f18831a;
            this.f18742a = 1;
            if (c1286b.m7104f(this.f18744c, this.f18745d, this) == coroutineSingletons) {
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
