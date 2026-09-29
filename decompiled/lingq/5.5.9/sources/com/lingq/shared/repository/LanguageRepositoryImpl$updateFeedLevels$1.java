package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {282, 285}, m19208m = "updateFeedLevels")
final class LanguageRepositoryImpl$updateFeedLevels$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19748d;

    /* JADX INFO: renamed from: e */
    public String f19749e;

    /* JADX INFO: renamed from: f */
    public Object f19750f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19751g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageRepositoryImpl f19752h;

    /* JADX INFO: renamed from: i */
    public int f19753i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateFeedLevels$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$updateFeedLevels$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19752h = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19751g = obj;
        this.f19753i |= Integer.MIN_VALUE;
        return this.f19752h.mo6039y(null, null, this);
    }
}
