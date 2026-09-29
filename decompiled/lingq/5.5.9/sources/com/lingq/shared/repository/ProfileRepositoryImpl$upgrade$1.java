package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestPurchase;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {380, 382, 384}, m19208m = "upgrade")
public final class ProfileRepositoryImpl$upgrade$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20446d;

    /* JADX INFO: renamed from: e */
    public RequestPurchase f20447e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20448f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileRepositoryImpl f20449g;

    /* JADX INFO: renamed from: h */
    public int f20450h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$upgrade$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$upgrade$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20449g = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20448f = obj;
        this.f20450h |= Integer.MIN_VALUE;
        return this.f20449g.mo6141j(null, this);
    }
}
