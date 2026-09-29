package com.lingq.shared.persistent.dao;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.persistent.dao.LanguageStatsDao", m19206f = "LanguageStatsDao.kt", m19207l = {83, 84}, m19208m = "repairStreak$suspendImpl")
public final class LanguageStatsDao$repairStreak$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageStatsDao f19375d;

    /* JADX INFO: renamed from: e */
    public String f19376e;

    /* JADX INFO: renamed from: f */
    public int f19377f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19378g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageStatsDao f19379h;

    /* JADX INFO: renamed from: i */
    public int f19380i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsDao$repairStreak$1(LanguageStatsDao languageStatsDao, InterfaceC9968c<? super LanguageStatsDao$repairStreak$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19379h = languageStatsDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19378g = obj;
        this.f19380i |= Integer.MIN_VALUE;
        return LanguageStatsDao.m9473u0(this.f19379h, null, 0, this);
    }
}
