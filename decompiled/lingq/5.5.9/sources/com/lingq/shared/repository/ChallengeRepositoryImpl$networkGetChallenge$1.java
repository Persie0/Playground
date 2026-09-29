package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {346, 347, 348, 349}, m19208m = "networkGetChallenge")
public final class ChallengeRepositoryImpl$networkGetChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChallengeRepositoryImpl f19548d;

    /* JADX INFO: renamed from: e */
    public String f19549e;

    /* JADX INFO: renamed from: f */
    public Object f19550f;

    /* JADX INFO: renamed from: g */
    public boolean f19551g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19552h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ChallengeRepositoryImpl f19553i;

    /* JADX INFO: renamed from: j */
    public int f19554j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkGetChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$networkGetChallenge$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19553i = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19552h = obj;
        this.f19554j |= Integer.MIN_VALUE;
        return this.f19553i.mo5977d(null, null, false, this);
    }
}
