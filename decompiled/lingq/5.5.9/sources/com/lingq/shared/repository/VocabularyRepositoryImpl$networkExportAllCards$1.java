package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl", m19206f = "VocabularyRepository.kt", m19207l = {448}, m19208m = "networkExportAllCards")
public final class VocabularyRepositoryImpl$networkExportAllCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20646d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ VocabularyRepositoryImpl f20647e;

    /* JADX INFO: renamed from: f */
    public int f20648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$networkExportAllCards$1(VocabularyRepositoryImpl vocabularyRepositoryImpl, InterfaceC9968c<? super VocabularyRepositoryImpl$networkExportAllCards$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20647e = vocabularyRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20646d = obj;
        this.f20648f |= Integer.MIN_VALUE;
        return this.f20647e.mo6185g(null, null, this);
    }
}
