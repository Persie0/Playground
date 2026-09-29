package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LocaleRepositoryImpl", m19206f = "LocaleRepository.kt", m19207l = {48, 49}, m19208m = "availableLocales")
public final class LocaleRepositoryImpl$availableLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LocaleRepositoryImpl f20140d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20141e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LocaleRepositoryImpl f20142f;

    /* JADX INFO: renamed from: g */
    public int f20143g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleRepositoryImpl$availableLocales$1(LocaleRepositoryImpl localeRepositoryImpl, InterfaceC9968c<? super LocaleRepositoryImpl$availableLocales$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20142f = localeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20141e = obj;
        this.f20143g |= Integer.MIN_VALUE;
        return this.f20142f.mo6078b(this);
    }
}
