package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LanguageContextNotification;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {359, 369}, m19208m = "updateSiteNotification")
public final class LanguageRepositoryImpl$updateSiteNotification$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19766d;

    /* JADX INFO: renamed from: e */
    public String f19767e;

    /* JADX INFO: renamed from: f */
    public LanguageContextNotification f19768f;

    /* JADX INFO: renamed from: g */
    public boolean f19769g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19770h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LanguageRepositoryImpl f19771i;

    /* JADX INFO: renamed from: j */
    public int f19772j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateSiteNotification$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$updateSiteNotification$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19771i = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19770h = obj;
        this.f19772j |= Integer.MIN_VALUE;
        return this.f19771i.mo6022h(null, false, this);
    }
}
