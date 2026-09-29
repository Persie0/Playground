package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeRanking;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ChallengeRepositoryImpl", m19206f = "ChallengeRepository.kt", m19207l = {174, 179, 186, 187}, m19208m = "leaveChallenge")
final class ChallengeRepositoryImpl$leaveChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ChallengeRepositoryImpl f19534d;

    /* JADX INFO: renamed from: e */
    public String f19535e;

    /* JADX INFO: renamed from: f */
    public String f19536f;

    /* JADX INFO: renamed from: g */
    public Iterator f19537g;

    /* JADX INFO: renamed from: h */
    public ChallengeRanking f19538h;

    /* JADX INFO: renamed from: i */
    public int f19539i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19540j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ChallengeRepositoryImpl f19541k;

    /* JADX INFO: renamed from: l */
    public int f19542l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$leaveChallenge$1(ChallengeRepositoryImpl challengeRepositoryImpl, InterfaceC9968c<? super ChallengeRepositoryImpl$leaveChallenge$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19541k = challengeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19540j = obj;
        this.f19542l |= Integer.MIN_VALUE;
        return this.f19541k.mo5983j(0, null, null, this);
    }
}
