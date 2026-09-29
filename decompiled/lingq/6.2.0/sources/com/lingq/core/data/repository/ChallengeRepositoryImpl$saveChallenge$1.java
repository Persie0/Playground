package com.lingq.core.data.repository;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lingq.core.network.api.result.ResultChallenge;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {ModuleDescriptor.MODULE_VERSION, 186, 187, 189, 190, 192}, m4293m = "saveChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$saveChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14861a;

    /* JADX INFO: renamed from: b */
    public String f14862b;

    /* JADX INFO: renamed from: c */
    public ResultChallenge f14863c;

    /* JADX INFO: renamed from: d */
    public int f14864d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14865e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1288d f14866f;

    /* JADX INFO: renamed from: g */
    public int f14867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$saveChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14866f = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14865e = obj;
        this.f14867g |= Integer.MIN_VALUE;
        return this.f14866f.m7148o(null, null, null, this);
    }
}
