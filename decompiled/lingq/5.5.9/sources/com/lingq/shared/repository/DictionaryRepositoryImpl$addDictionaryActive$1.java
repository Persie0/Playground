package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {198, 204, 205}, m19208m = "addDictionaryActive")
final class DictionaryRepositoryImpl$addDictionaryActive$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DictionaryRepositoryImpl f19636d;

    /* JADX INFO: renamed from: e */
    public String f19637e;

    /* JADX INFO: renamed from: f */
    public int f19638f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19639g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DictionaryRepositoryImpl f19640h;

    /* JADX INFO: renamed from: i */
    public int f19641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$addDictionaryActive$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$addDictionaryActive$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19640h = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19639g = obj;
        this.f19641i |= Integer.MIN_VALUE;
        return this.f19640h.mo6012l(0, null, this);
    }
}
