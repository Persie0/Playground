package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {259, 260, 261, 262}, m19208m = "networkSignupForChallenge")
public final class ChallengeRepositoryImpl$networkSignupForChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChallengeRepositoryImpl f19583d;

    /* JADX INFO: renamed from: e */
    public String f19584e;

    /* JADX INFO: renamed from: f */
    public String f19585f;

    /* JADX INFO: renamed from: g */
    public String f19586g;

    /* JADX INFO: renamed from: h */
    public String f19587h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f19588i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ChallengeRepositoryImpl f19589j;

    /* JADX INFO: renamed from: k */
    public int f19590k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkSignupForChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$networkSignupForChallenge$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19589j = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19588i = obj;
        this.f19590k |= Integer.MIN_VALUE;
        return this.f19589j.mo5987n(null, null, null, null, this);
    }
}
