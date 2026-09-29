package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {257, 262}, m19208m = "registerGoogle")
public final class ProfileRepositoryImpl$registerGoogle$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileRepositoryImpl f20413d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20414e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProfileRepositoryImpl f20415f;

    /* JADX INFO: renamed from: g */
    public int f20416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$registerGoogle$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$registerGoogle$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20415f = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20414e = obj;
        this.f20416g |= Integer.MIN_VALUE;
        return this.f20415f.mo6138g(null, null, null, this);
    }
}
