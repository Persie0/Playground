package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.MilestoneRepositoryImpl", m19206f = "MilestoneRepository.kt", m19207l = {68}, m19208m = "meetMilestone")
public final class MilestoneRepositoryImpl$meetMilestone$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public MilestoneRepositoryImpl f20151d;

    /* JADX INFO: renamed from: e */
    public String f20152e;

    /* JADX INFO: renamed from: f */
    public String f20153f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20154g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MilestoneRepositoryImpl f20155h;

    /* JADX INFO: renamed from: i */
    public int f20156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneRepositoryImpl$meetMilestone$1(MilestoneRepositoryImpl milestoneRepositoryImpl, InterfaceC9968c<? super MilestoneRepositoryImpl$meetMilestone$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20155h = milestoneRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20154g = obj;
        this.f20156i |= Integer.MIN_VALUE;
        return this.f20155h.mo6081b(null, null, null, this);
    }
}
