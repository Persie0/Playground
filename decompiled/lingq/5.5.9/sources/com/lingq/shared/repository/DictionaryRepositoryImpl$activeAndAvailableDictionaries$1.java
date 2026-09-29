package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {101, 102, 104, 106}, m19208m = "activeAndAvailableDictionaries")
public final class DictionaryRepositoryImpl$activeAndAvailableDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19631d;

    /* JADX INFO: renamed from: e */
    public String f19632e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19633f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DictionaryRepositoryImpl f19634g;

    /* JADX INFO: renamed from: h */
    public int f19635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$activeAndAvailableDictionaries$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19634g = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19633f = obj;
        this.f19635h |= Integer.MIN_VALUE;
        return this.f19634g.mo6003c(null, this);
    }
}
