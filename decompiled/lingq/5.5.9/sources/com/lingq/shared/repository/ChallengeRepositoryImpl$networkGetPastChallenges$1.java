package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {211, 224}, m19208m = "networkGetPastChallenges")
public final class ChallengeRepositoryImpl$networkGetPastChallenges$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChallengeRepositoryImpl f19575d;

    /* JADX INFO: renamed from: e */
    public String f19576e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19577f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ChallengeRepositoryImpl f19578g;

    /* JADX INFO: renamed from: h */
    public int f19579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkGetPastChallenges$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$networkGetPastChallenges$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19578g = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19577f = obj;
        this.f19579h |= Integer.MIN_VALUE;
        return this.f19578g.mo5986m(null, this);
    }
}
