package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultReferralStats;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ReferralRepositoryImpl", m19206f = "ReferralRepository.kt", m19207l = {45, 46, 47}, m19208m = "networkGetReferralStats")
public final class ReferralRepositoryImpl$networkGetReferralStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ReferralRepositoryImpl f20469d;

    /* JADX INFO: renamed from: e */
    public ResultReferralStats f20470e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20471f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ReferralRepositoryImpl f20472g;

    /* JADX INFO: renamed from: h */
    public int f20473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRepositoryImpl$networkGetReferralStats$1(ReferralRepositoryImpl referralRepositoryImpl, InterfaceC9968c<? super ReferralRepositoryImpl$networkGetReferralStats$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20472g = referralRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20471f = obj;
        this.f20473h |= Integer.MIN_VALUE;
        return this.f20472g.mo6155c(this);
    }
}
