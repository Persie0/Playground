package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {356}, m19208m = "networkMonthlyChallenge")
final class ChallengeRepositoryImpl$networkMonthlyChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19580d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ChallengeRepositoryImpl f19581e;

    /* JADX INFO: renamed from: f */
    public int f19582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkMonthlyChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$networkMonthlyChallenge$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19581e = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19580d = obj;
        this.f19582f |= Integer.MIN_VALUE;
        return this.f19581e.mo5988o(null, null, this);
    }
}
