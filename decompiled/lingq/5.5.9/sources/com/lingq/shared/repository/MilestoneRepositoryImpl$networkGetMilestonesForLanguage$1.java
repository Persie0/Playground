package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultMilestones;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.MilestoneRepositoryImpl", m19206f = "MilestoneRepository.kt", m19207l = {82, 84, 86}, m19208m = "networkGetMilestonesForLanguage")
public final class MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20157d;

    /* JADX INFO: renamed from: e */
    public String f20158e;

    /* JADX INFO: renamed from: f */
    public ResultMilestones f20159f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20160g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MilestoneRepositoryImpl f20161h;

    /* JADX INFO: renamed from: i */
    public int f20162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(MilestoneRepositoryImpl milestoneRepositoryImpl, InterfaceC9968c<? super MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20161h = milestoneRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20160g = obj;
        this.f20162i |= Integer.MIN_VALUE;
        return this.f20161h.mo6083d(null, this);
    }
}
