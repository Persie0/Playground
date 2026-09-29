package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl", m19206f = "VocabularyRepository.kt", m19207l = {163, 167, 169}, m19208m = "observableVocabulary")
public final class VocabularyRepositoryImpl$observableVocabulary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f20682H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ VocabularyRepositoryImpl f20683I;

    /* JADX INFO: renamed from: J */
    public int f20684J;

    /* JADX INFO: renamed from: d */
    public VocabularyRepositoryImpl f20685d;

    /* JADX INFO: renamed from: e */
    public String f20686e;

    /* JADX INFO: renamed from: f */
    public String f20687f;

    /* JADX INFO: renamed from: g */
    public String f20688g;

    /* JADX INFO: renamed from: h */
    public VocabularySearchQuery f20689h;

    /* JADX INFO: renamed from: i */
    public int f20690i;

    /* JADX INFO: renamed from: j */
    public int f20691j;

    /* JADX INFO: renamed from: k */
    public boolean f20692k;

    /* JADX INFO: renamed from: l */
    public boolean f20693l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$observableVocabulary$1(VocabularyRepositoryImpl vocabularyRepositoryImpl, InterfaceC9968c<? super VocabularyRepositoryImpl$observableVocabulary$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20683I = vocabularyRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20682H = obj;
        this.f20684J |= Integer.MIN_VALUE;
        return this.f20683I.mo6182d(null, 0, null, false, false, null, 0, this);
    }
}
