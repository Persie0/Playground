package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {231, 235, 240}, m4293m = "flushDirtyVoiceLanguages", m4294v = 2)
final class TtsRepositoryImpl$flushDirtyVoiceLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Map f16252a;

    /* JADX INFO: renamed from: b */
    public Set f16253b;

    /* JADX INFO: renamed from: c */
    public Set f16254c;

    /* JADX INFO: renamed from: d */
    public Iterator f16255d;

    /* JADX INFO: renamed from: e */
    public String f16256e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16257f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1307w f16258g;

    /* JADX INFO: renamed from: h */
    public int f16259h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$flushDirtyVoiceLanguages$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16258g = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16257f = obj;
        this.f16259h |= Integer.MIN_VALUE;
        return this.f16258g.m7394i(null, this);
    }
}
