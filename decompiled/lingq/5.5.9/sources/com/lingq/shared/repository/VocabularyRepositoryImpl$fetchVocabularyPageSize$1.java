package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl", m19206f = "VocabularyRepository.kt", m19207l = {129, 133, 135}, m19208m = "fetchVocabularyPageSize")
public final class VocabularyRepositoryImpl$fetchVocabularyPageSize$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f20623H;

    /* JADX INFO: renamed from: d */
    public VocabularyRepositoryImpl f20624d;

    /* JADX INFO: renamed from: e */
    public String f20625e;

    /* JADX INFO: renamed from: f */
    public String f20626f;

    /* JADX INFO: renamed from: g */
    public String f20627g;

    /* JADX INFO: renamed from: h */
    public VocabularySearchQuery f20628h;

    /* JADX INFO: renamed from: i */
    public boolean f20629i;

    /* JADX INFO: renamed from: j */
    public boolean f20630j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f20631k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ VocabularyRepositoryImpl f20632l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$fetchVocabularyPageSize$1(VocabularyRepositoryImpl vocabularyRepositoryImpl, InterfaceC9968c<? super VocabularyRepositoryImpl$fetchVocabularyPageSize$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20632l = vocabularyRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20631k = obj;
        this.f20623H |= Integer.MIN_VALUE;
        return this.f20632l.mo6186h(null, null, false, false, null, this);
    }
}
