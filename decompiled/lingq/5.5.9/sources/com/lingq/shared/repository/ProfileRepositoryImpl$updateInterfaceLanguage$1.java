package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {459}, m19208m = "updateInterfaceLanguage")
public final class ProfileRepositoryImpl$updateInterfaceLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileRepositoryImpl f20441d;

    /* JADX INFO: renamed from: e */
    public String f20442e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20443f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileRepositoryImpl f20444g;

    /* JADX INFO: renamed from: h */
    public int f20445h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateInterfaceLanguage$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$updateInterfaceLanguage$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20444g = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20443f = obj;
        this.f20445h |= Integer.MIN_VALUE;
        return this.f20444g.mo6139h(null, this);
    }
}
