package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {255, 257, 258}, m19208m = "getTopics")
public final class LanguageRepositoryImpl$getTopics$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19696d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19697e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageRepositoryImpl f19698f;

    /* JADX INFO: renamed from: g */
    public int f19699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$getTopics$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$getTopics$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19698f = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19697e = obj;
        this.f19699g |= Integer.MIN_VALUE;
        return this.f19698f.mo6030p(null, this);
    }
}
