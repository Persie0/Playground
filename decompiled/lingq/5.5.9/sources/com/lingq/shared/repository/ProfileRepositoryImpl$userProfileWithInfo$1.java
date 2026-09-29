package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {318, 321, 326}, m19208m = "userProfileWithInfo")
public final class ProfileRepositoryImpl$userProfileWithInfo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20461d;

    /* JADX INFO: renamed from: e */
    public boolean f20462e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20463f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileRepositoryImpl f20464g;

    /* JADX INFO: renamed from: h */
    public int f20465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$userProfileWithInfo$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$userProfileWithInfo$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20464g = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20463f = obj;
        this.f20465h |= Integer.MIN_VALUE;
        return this.f20464g.mo6144m(false, this);
    }
}
