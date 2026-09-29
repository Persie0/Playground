package com.lingq.core.data.repository;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {209, 212, 214, 216, 219, 223, 225}, m4293m = "migrateLocalVoicesToApi", m4294v = 2)
final class TtsRepositoryImpl$migrateLocalVoicesToApi$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Map f16265a;

    /* JADX INFO: renamed from: b */
    public boolean f16266b;

    /* JADX INFO: renamed from: c */
    public boolean f16267c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16268d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1307w f16269e;

    /* JADX INFO: renamed from: f */
    public int f16270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$migrateLocalVoicesToApi$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16269e = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16268d = obj;
        this.f16270f |= Integer.MIN_VALUE;
        return this.f16269e.m7397l(this);
    }
}
