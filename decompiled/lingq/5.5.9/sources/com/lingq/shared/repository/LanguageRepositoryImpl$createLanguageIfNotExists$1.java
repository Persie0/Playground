package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {209, 230}, m19208m = "createLanguageIfNotExists")
public final class LanguageRepositoryImpl$createLanguageIfNotExists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19690d;

    /* JADX INFO: renamed from: e */
    public String f19691e;

    /* JADX INFO: renamed from: f */
    public LanguageToLearn f19692f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19693g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageRepositoryImpl f19694h;

    /* JADX INFO: renamed from: i */
    public int f19695i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$createLanguageIfNotExists$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$createLanguageIfNotExists$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19694h = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19693g = obj;
        this.f19695i |= Integer.MIN_VALUE;
        return this.f19694h.mo6019e(null, null, this);
    }
}
