package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageStatsRepositoryImpl", m19206f = "LanguageStatsRepository.kt", m19207l = {118, 120, 121, 122}, m19208m = "repairStreak")
final class LanguageStatsRepositoryImpl$repairStreak$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageStatsRepositoryImpl f19821d;

    /* JADX INFO: renamed from: e */
    public String f19822e;

    /* JADX INFO: renamed from: f */
    public int f19823f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19824g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageStatsRepositoryImpl f19825h;

    /* JADX INFO: renamed from: i */
    public int f19826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$repairStreak$1(LanguageStatsRepositoryImpl languageStatsRepositoryImpl, InterfaceC9968c<? super LanguageStatsRepositoryImpl$repairStreak$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19825h = languageStatsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19824g = obj;
        this.f19826i |= Integer.MIN_VALUE;
        return this.f19825h.mo6052m(0, null, this);
    }
}
