package com.lingq.feature.chat.domain;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.GetChatsUseCase$invoke$2", m4291f = "GetChatsUseCase.kt", m4292l = {22}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChatsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1999d f25179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25180c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatsUseCase$invoke$2(C1999d c1999d, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f25179b = c1999d;
        this.f25180c = str;
        this.f25181d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetChatsUseCase$invoke$2(this.f25179b, this.f25180c, this.f25181d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetChatsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25178a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        zw0 zw0Var = this.f25179b.f25215b;
        this.f25178a = 1;
        Object objM7160j = ((C1289e) zw0Var).m7160j(this.f25180c, this.f25181d, this);
        return objM7160j == coroutineSingletons ? coroutineSingletons : objM7160j;
    }
}
