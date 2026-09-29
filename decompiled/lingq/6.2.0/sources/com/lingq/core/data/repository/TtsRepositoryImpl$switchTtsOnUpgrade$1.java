package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {464, 467, 473, 474}, m4293m = "switchTtsOnUpgrade", m4294v = 2)
final class TtsRepositoryImpl$switchTtsOnUpgrade$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Map f16310a;

    /* JADX INFO: renamed from: b */
    public Map f16311b;

    /* JADX INFO: renamed from: c */
    public Iterator f16312c;

    /* JADX INFO: renamed from: d */
    public Object f16313d;

    /* JADX INFO: renamed from: e */
    public int f16314e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16315f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1307w f16316g;

    /* JADX INFO: renamed from: h */
    public int f16317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$switchTtsOnUpgrade$1(C1307w c1307w, Continuation continuation) {
        super(continuation);
        this.f16316g = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16315f = obj;
        this.f16317h |= Integer.MIN_VALUE;
        return this.f16316g.m7405t(this);
    }
}
