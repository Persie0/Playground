package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {103, 110, 115}, m19208m = "userLanguages")
public final class LanguageRepositoryImpl$userLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19786d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19787e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageRepositoryImpl f19788f;

    /* JADX INFO: renamed from: g */
    public int f19789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$userLanguages$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$userLanguages$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19788f = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19787e = obj;
        this.f19789g |= Integer.MIN_VALUE;
        return this.f19788f.mo6015a(this);
    }
}
