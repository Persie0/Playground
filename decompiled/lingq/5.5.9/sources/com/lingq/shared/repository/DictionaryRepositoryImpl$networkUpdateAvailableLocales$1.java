package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {214, 224, 227}, m19208m = "networkUpdateAvailableLocales")
public final class DictionaryRepositoryImpl$networkUpdateAvailableLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DictionaryRepositoryImpl f19650d;

    /* JADX INFO: renamed from: e */
    public String f19651e;

    /* JADX INFO: renamed from: f */
    public Object f19652f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19653g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DictionaryRepositoryImpl f19654h;

    /* JADX INFO: renamed from: i */
    public int f19655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$networkUpdateAvailableLocales$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$networkUpdateAvailableLocales$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19654h = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19653g = obj;
        this.f19655i |= Integer.MIN_VALUE;
        return this.f19654h.mo6013m(null, this);
    }
}
