package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {187, 189, 192}, m19208m = "networkUpdateLanguageTags")
public final class LanguageRepositoryImpl$networkUpdateLanguageTags$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19717d;

    /* JADX INFO: renamed from: e */
    public Object f19718e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19719f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LanguageRepositoryImpl f19720g;

    /* JADX INFO: renamed from: h */
    public int f19721h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateLanguageTags$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$networkUpdateLanguageTags$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19720g = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19719f = obj;
        this.f19721h |= Integer.MIN_VALUE;
        return this.f19720g.mo6026l(null, this);
    }
}
