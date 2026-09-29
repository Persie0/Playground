package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {113, 115, 117}, m19208m = "login")
public final class ProfileRepositoryImpl$login$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20383d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20384e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProfileRepositoryImpl f20385f;

    /* JADX INFO: renamed from: g */
    public int f20386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$login$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$login$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20385f = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20384e = obj;
        this.f20386g |= Integer.MIN_VALUE;
        return this.f20385f.mo6134c(null, null, this);
    }
}
