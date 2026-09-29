package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {274, 276, 277}, m19208m = "networkUpdateTopics")
public final class LanguageRepositoryImpl$networkUpdateTopics$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19732d;

    /* JADX INFO: renamed from: e */
    public Set f19733e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19734f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LanguageRepositoryImpl f19735g;

    /* JADX INFO: renamed from: h */
    public int f19736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateTopics$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$networkUpdateTopics$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19735g = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19734f = obj;
        this.f19736h |= Integer.MIN_VALUE;
        return this.f19735g.mo6038x(null, null, this);
    }
}
