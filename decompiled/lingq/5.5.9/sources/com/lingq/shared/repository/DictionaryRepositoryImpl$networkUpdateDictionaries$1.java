package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {246, 247}, m19208m = "networkUpdateDictionaries")
public final class DictionaryRepositoryImpl$networkUpdateDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DictionaryRepositoryImpl f19656d;

    /* JADX INFO: renamed from: e */
    public String f19657e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19658f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DictionaryRepositoryImpl f19659g;

    /* JADX INFO: renamed from: h */
    public int f19660h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$networkUpdateDictionaries$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$networkUpdateDictionaries$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19659g = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19658f = obj;
        this.f19660h |= Integer.MIN_VALUE;
        return this.f19659g.mo6008h(null, this);
    }
}
