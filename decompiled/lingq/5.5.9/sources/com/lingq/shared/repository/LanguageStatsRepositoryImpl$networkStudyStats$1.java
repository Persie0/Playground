package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageStatsRepositoryImpl", m19206f = "LanguageStatsRepository.kt", m19207l = {157, 159}, m19208m = "networkStudyStats")
public final class LanguageStatsRepositoryImpl$networkStudyStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageStatsRepositoryImpl f19816d;

    /* JADX INFO: renamed from: e */
    public String f19817e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19818f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LanguageStatsRepositoryImpl f19819g;

    /* JADX INFO: renamed from: h */
    public int f19820h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$networkStudyStats$1(LanguageStatsRepositoryImpl languageStatsRepositoryImpl, InterfaceC9968c<? super LanguageStatsRepositoryImpl$networkStudyStats$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19819g = languageStatsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19818f = obj;
        this.f19820h |= Integer.MIN_VALUE;
        return this.f19819g.mo6054o(null, this);
    }
}
