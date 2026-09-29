package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl", m19206f = "ProfileRepository.kt", m19207l = {438, 443}, m19208m = "updateActiveLocales")
final class ProfileRepositoryImpl$updateActiveLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileRepositoryImpl f20435d;

    /* JADX INFO: renamed from: e */
    public List f20436e;

    /* JADX INFO: renamed from: f */
    public Profile f20437f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20438g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ProfileRepositoryImpl f20439h;

    /* JADX INFO: renamed from: i */
    public int f20440i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLocales$1(ProfileRepositoryImpl profileRepositoryImpl, InterfaceC9968c<? super ProfileRepositoryImpl$updateActiveLocales$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20439h = profileRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20438g = obj;
        this.f20440i |= Integer.MIN_VALUE;
        return this.f20439h.mo6140i(null, this);
    }
}
