package com.lingq.core.token.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAsianScriptUseCase", m4291f = "GetAsianScriptUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28, 42, 43, 46}, m4293m = "invoke", m4294v = 2)
final class GetAsianScriptUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23772a;

    /* JADX INFO: renamed from: b */
    public String f23773b;

    /* JADX INFO: renamed from: c */
    public List f23774c;

    /* JADX INFO: renamed from: d */
    public TokenTransliteration f23775d;

    /* JADX INFO: renamed from: e */
    public String f23776e;

    /* JADX INFO: renamed from: f */
    public Pair f23777f;

    /* JADX INFO: renamed from: g */
    public boolean f23778g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f23779h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1905b f23780i;

    /* JADX INFO: renamed from: j */
    public int f23781j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAsianScriptUseCase$invoke$1(C1905b c1905b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23780i = c1905b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23779h = obj;
        this.f23781j |= Integer.MIN_VALUE;
        return this.f23780i.m8717c(null, null, false, null, null, this);
    }
}
