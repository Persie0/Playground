package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {420, 422}, m19208m = "updateActiveLocale")
public final class ProfileRepositoryImpl$updateActiveLocale$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileRepositoryImpl f20429d;

    /* JADX INFO: renamed from: e */
    public String f20430e;

    /* JADX INFO: renamed from: f */
    public Profile f20431f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20432g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ProfileRepositoryImpl f20433h;

    /* JADX INFO: renamed from: i */
    public int f20434i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLocale$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$updateActiveLocale$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20433h = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20432g = obj;
        this.f20434i |= Integer.MIN_VALUE;
        return this.f20433h.mo6143l(null, this);
    }
}
