package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {241}, m19208m = "removeActiveDictionary")
public final class DictionaryRepositoryImpl$removeActiveDictionary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DictionaryRepositoryImpl f19661d;

    /* JADX INFO: renamed from: e */
    public String f19662e;

    /* JADX INFO: renamed from: f */
    public int f19663f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19664g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DictionaryRepositoryImpl f19665h;

    /* JADX INFO: renamed from: i */
    public int f19666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$removeActiveDictionary$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$removeActiveDictionary$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19665h = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19664g = obj;
        this.f19666i |= Integer.MIN_VALUE;
        return this.f19665h.mo6014n(0, null, this);
    }
}
