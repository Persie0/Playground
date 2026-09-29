package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TokenDataRepositoryImpl", m19206f = "TokenDataRepository.kt", m19207l = {203, 204}, m19208m = "networkPopularMeanings")
public final class TokenDataRepositoryImpl$networkPopularMeanings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenDataRepositoryImpl f20543d;

    /* JADX INFO: renamed from: e */
    public String f20544e;

    /* JADX INFO: renamed from: f */
    public String f20545f;

    /* JADX INFO: renamed from: g */
    public String f20546g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20547h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TokenDataRepositoryImpl f20548i;

    /* JADX INFO: renamed from: j */
    public int f20549j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$networkPopularMeanings$1(TokenDataRepositoryImpl tokenDataRepositoryImpl, InterfaceC9968c<? super TokenDataRepositoryImpl$networkPopularMeanings$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20548i = tokenDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20547h = obj;
        this.f20549j |= Integer.MIN_VALUE;
        return this.f20548i.mo6163a(null, null, null, this);
    }
}
