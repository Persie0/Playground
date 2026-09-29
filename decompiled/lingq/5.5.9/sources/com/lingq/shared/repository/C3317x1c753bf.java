package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: renamed from: com.lingq.shared.repository.LanguageStatsRepositoryImpl$networkLanguageProgressChartEntries$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageStatsRepositoryImpl", m19206f = "LanguageStatsRepository.kt", m19207l = {250, 255}, m19208m = "networkLanguageProgressChartEntries")
public final class C3317x1c753bf extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageStatsRepositoryImpl f19802d;

    /* JADX INFO: renamed from: e */
    public String f19803e;

    /* JADX INFO: renamed from: f */
    public String f19804f;

    /* JADX INFO: renamed from: g */
    public String f19805g;

    /* JADX INFO: renamed from: h */
    public List f19806h;

    /* JADX INFO: renamed from: i */
    public ArrayList f19807i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19808j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LanguageStatsRepositoryImpl f19809k;

    /* JADX INFO: renamed from: l */
    public int f19810l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3317x1c753bf(LanguageStatsRepositoryImpl languageStatsRepositoryImpl, InterfaceC9968c<? super C3317x1c753bf> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19809k = languageStatsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19808j = obj;
        this.f19810l |= Integer.MIN_VALUE;
        return this.f19809k.mo6042c(null, null, null, this);
    }
}
