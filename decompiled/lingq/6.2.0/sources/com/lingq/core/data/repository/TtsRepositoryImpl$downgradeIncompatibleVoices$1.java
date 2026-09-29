package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {490, 491, 494, 501, 502}, m4293m = "downgradeIncompatibleVoices", m4294v = 2)
final class TtsRepositoryImpl$downgradeIncompatibleVoices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16198a;

    /* JADX INFO: renamed from: b */
    public Map f16199b;

    /* JADX INFO: renamed from: c */
    public Map f16200c;

    /* JADX INFO: renamed from: d */
    public Iterator f16201d;

    /* JADX INFO: renamed from: e */
    public Object f16202e;

    /* JADX INFO: renamed from: f */
    public int f16203f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16204g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1307w f16205h;

    /* JADX INFO: renamed from: i */
    public int f16206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$downgradeIncompatibleVoices$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16205h = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16204g = obj;
        this.f16206i |= Integer.MIN_VALUE;
        return this.f16205h.m7386a(this);
    }
}
