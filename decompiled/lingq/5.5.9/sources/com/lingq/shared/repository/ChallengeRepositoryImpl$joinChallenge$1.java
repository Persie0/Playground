package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {163, 168}, m19208m = "joinChallenge")
public final class ChallengeRepositoryImpl$joinChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChallengeRepositoryImpl f19528d;

    /* JADX INFO: renamed from: e */
    public String f19529e;

    /* JADX INFO: renamed from: f */
    public String f19530f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19531g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ChallengeRepositoryImpl f19532h;

    /* JADX INFO: renamed from: i */
    public int f19533i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$joinChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$joinChallenge$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19532h = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19531g = obj;
        this.f19533i |= Integer.MIN_VALUE;
        return this.f19532h.mo5978e(null, null, null, null, this);
    }
}
