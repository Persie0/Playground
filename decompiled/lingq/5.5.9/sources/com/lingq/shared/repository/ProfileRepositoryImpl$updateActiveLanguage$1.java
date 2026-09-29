package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {394, 396, 401}, m19208m = "updateActiveLanguage")
final class ProfileRepositoryImpl$updateActiveLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileRepositoryImpl f20423d;

    /* JADX INFO: renamed from: e */
    public Object f20424e;

    /* JADX INFO: renamed from: f */
    public Object f20425f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20426g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ProfileRepositoryImpl f20427h;

    /* JADX INFO: renamed from: i */
    public int f20428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLanguage$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$updateActiveLanguage$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20427h = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20426g = obj;
        this.f20428i |= Integer.MIN_VALUE;
        return this.f20427h.mo6135d(null, this);
    }
}
