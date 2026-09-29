package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {205}, m19208m = "register")
public final class ProfileRepositoryImpl$register$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20406d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ProfileRepositoryImpl f20407e;

    /* JADX INFO: renamed from: f */
    public int f20408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$register$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$register$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20407e = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20406d = obj;
        this.f20408f |= Integer.MIN_VALUE;
        return this.f20407e.mo6136e(null, null, null, null, null, null, null, null, null, null, this);
    }
}
