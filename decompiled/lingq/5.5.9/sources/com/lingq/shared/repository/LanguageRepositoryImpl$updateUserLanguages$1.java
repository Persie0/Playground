package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {149, 155}, m19208m = "updateUserLanguages")
public final class LanguageRepositoryImpl$updateUserLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19779d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19780e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageRepositoryImpl f19781f;

    /* JADX INFO: renamed from: g */
    public int f19782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateUserLanguages$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$updateUserLanguages$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19781f = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19780e = obj;
        this.f19782g |= Integer.MIN_VALUE;
        return this.f19781f.mo6018d(this);
    }
}
