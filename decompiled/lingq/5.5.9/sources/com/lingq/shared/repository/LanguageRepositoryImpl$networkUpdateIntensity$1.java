package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {247, 249, 250}, m19208m = "networkUpdateIntensity")
public final class LanguageRepositoryImpl$networkUpdateIntensity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19711d;

    /* JADX INFO: renamed from: e */
    public String f19712e;

    /* JADX INFO: renamed from: f */
    public String f19713f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19714g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageRepositoryImpl f19715h;

    /* JADX INFO: renamed from: i */
    public int f19716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateIntensity$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$networkUpdateIntensity$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19715h = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19714g = obj;
        this.f19716i |= Integer.MIN_VALUE;
        return this.f19715h.mo6032r(null, null, this);
    }
}
