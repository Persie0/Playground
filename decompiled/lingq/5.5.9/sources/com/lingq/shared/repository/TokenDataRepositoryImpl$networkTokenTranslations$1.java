package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TokenDataRepositoryImpl", m19206f = "TokenDataRepository.kt", m19207l = {133, 143}, m19208m = "networkTokenTranslations")
public final class TokenDataRepositoryImpl$networkTokenTranslations$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenDataRepositoryImpl f20557d;

    /* JADX INFO: renamed from: e */
    public String f20558e;

    /* JADX INFO: renamed from: f */
    public String f20559f;

    /* JADX INFO: renamed from: g */
    public String f20560g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20561h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TokenDataRepositoryImpl f20562i;

    /* JADX INFO: renamed from: j */
    public int f20563j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$networkTokenTranslations$1(TokenDataRepositoryImpl tokenDataRepositoryImpl, InterfaceC9968c<? super TokenDataRepositoryImpl$networkTokenTranslations$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20562i = tokenDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20561h = obj;
        this.f20563j |= Integer.MIN_VALUE;
        return this.f20562i.mo6169g(null, null, null, this);
    }
}
