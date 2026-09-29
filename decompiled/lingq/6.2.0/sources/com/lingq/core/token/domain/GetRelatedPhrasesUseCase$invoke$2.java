package com.lingq.core.token.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.lesson.TokenType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.w3a;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetRelatedPhrasesUseCase$invoke$2", m4291f = "GetRelatedPhrasesUseCase.kt", m4292l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetRelatedPhrasesUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f23818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1907d f23819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23820c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23821d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TokenType f23822e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f23823f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRelatedPhrasesUseCase$invoke$2(C1907d c1907d, String str, String str2, TokenType tokenType, String str3, int i, Continuation continuation) {
        super(1, continuation);
        this.f23819b = c1907d;
        this.f23820c = str;
        this.f23821d = str2;
        this.f23822e = tokenType;
        this.f23823f = str3;
        this.f23824g = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetRelatedPhrasesUseCase$invoke$2(this.f23819b, this.f23820c, this.f23821d, this.f23822e, this.f23823f, this.f23824g, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetRelatedPhrasesUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23818a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = this.f23819b.f23861a;
            this.f23818a = 1;
            if (((C1306v) w3aVar).m7378d(this.f23824g, this.f23820c, this.f23821d, this.f23823f, this) == coroutineSingletons) {
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
