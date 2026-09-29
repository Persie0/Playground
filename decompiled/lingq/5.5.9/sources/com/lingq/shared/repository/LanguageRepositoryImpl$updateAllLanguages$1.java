package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {167, 168}, m19208m = "updateAllLanguages")
public final class LanguageRepositoryImpl$updateAllLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19737d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19738e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageRepositoryImpl f19739f;

    /* JADX INFO: renamed from: g */
    public int f19740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateAllLanguages$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$updateAllLanguages$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19739f = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19738e = obj;
        this.f19740g |= Integer.MIN_VALUE;
        return this.f19739f.mo6040z(this);
    }
}
