package com.lingq.core.domain.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.CreateCardOrUpdateMeaningUseCase", m4291f = "AddOrUpdateMeaningUseCase.kt", m4292l = {21, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m4293m = "invoke", m4294v = 2)
final class CreateCardOrUpdateMeaningUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f19997a;

    /* JADX INFO: renamed from: b */
    public int f19998b;

    /* JADX INFO: renamed from: c */
    public String f19999c;

    /* JADX INFO: renamed from: d */
    public String f20000d;

    /* JADX INFO: renamed from: e */
    public TokenMeaning f20001e;

    /* JADX INFO: renamed from: f */
    public String f20002f;

    /* JADX INFO: renamed from: g */
    public String f20003g;

    /* JADX INFO: renamed from: h */
    public boolean f20004h;

    /* JADX INFO: renamed from: i */
    public boolean f20005i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f20006j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1533a f20007k;

    /* JADX INFO: renamed from: l */
    public int f20008l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCardOrUpdateMeaningUseCase$invoke$1(C1533a c1533a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20007k = c1533a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20006j = obj;
        this.f20008l |= Integer.MIN_VALUE;
        return this.f20007k.m8211b(0, null, null, null, 0, null, false, false, null, this);
    }
}
