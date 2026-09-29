package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ReferralRepositoryImpl", m19206f = "ReferralRepository.kt", m19207l = {33, 36}, m19208m = "networkGetReferrals")
public final class ReferralRepositoryImpl$networkGetReferrals$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ReferralRepositoryImpl f20474d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReferralRepositoryImpl f20476f;

    /* JADX INFO: renamed from: g */
    public int f20477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRepositoryImpl$networkGetReferrals$1(ReferralRepositoryImpl referralRepositoryImpl, InterfaceC9968c<? super ReferralRepositoryImpl$networkGetReferrals$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20476f = referralRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20475e = obj;
        this.f20477g |= Integer.MIN_VALUE;
        return this.f20476f.mo6153a(this);
    }
}
