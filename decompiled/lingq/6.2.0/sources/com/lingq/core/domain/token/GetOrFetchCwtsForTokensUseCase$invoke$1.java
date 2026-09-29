package com.lingq.core.domain.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.sm3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchCwtsForTokensUseCase", m4291f = "GetOrFetchCwtsForTokensUseCase.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 57}, m4293m = "invoke", m4294v = 2)
final class GetOrFetchCwtsForTokensUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20027a;

    /* JADX INFO: renamed from: b */
    public String f20028b;

    /* JADX INFO: renamed from: c */
    public ArrayList f20029c;

    /* JADX INFO: renamed from: d */
    public Map f20030d;

    /* JADX INFO: renamed from: e */
    public Iterator f20031e;

    /* JADX INFO: renamed from: f */
    public sm3 f20032f;

    /* JADX INFO: renamed from: g */
    public int f20033g;

    /* JADX INFO: renamed from: h */
    public int f20034h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20035i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1535c f20036j;

    /* JADX INFO: renamed from: k */
    public int f20037k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchCwtsForTokensUseCase$invoke$1(C1535c c1535c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20036j = c1535c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20035i = obj;
        this.f20037k |= Integer.MIN_VALUE;
        return this.f20036j.m8215b(null, null, 0, null, this);
    }
}
