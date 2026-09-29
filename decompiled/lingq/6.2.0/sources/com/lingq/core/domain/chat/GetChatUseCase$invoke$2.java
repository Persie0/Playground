package com.lingq.core.domain.chat;

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
@c32(m4290c = "com.lingq.core.domain.chat.GetChatUseCase$invoke$2", m4291f = "GetChatUseCase.kt", m4292l = {22}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChatUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f18614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1374b f18615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18616d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f18617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatUseCase$invoke$2(int i, C1374b c1374b, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f18614b = i;
        this.f18615c = c1374b;
        this.f18616d = str;
        this.f18617e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetChatUseCase$invoke$2(this.f18614b, this.f18615c, this.f18616d, this.f18617e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetChatUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18613a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int i2 = this.f18614b;
            if (i2 != -1 && i2 != -2) {
                zw0 zw0Var = this.f18615c.f18622a;
                this.f18613a = 1;
                if (((C1289e) zw0Var).m7157g(i2, this.f18616d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
