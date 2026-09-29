package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl", m19206f = "VocabularyRepository.kt", m19207l = {372, 376, 378, 386, 413, 418}, m19208m = "loadCardsForAnswers")
public final class VocabularyRepositoryImpl$loadCardsForAnswers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20633d;

    /* JADX INFO: renamed from: e */
    public String f20634e;

    /* JADX INFO: renamed from: f */
    public Ref$ObjectRef f20635f;

    /* JADX INFO: renamed from: g */
    public Ref$ObjectRef f20636g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20637h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ VocabularyRepositoryImpl f20638i;

    /* JADX INFO: renamed from: j */
    public int f20639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$loadCardsForAnswers$1(VocabularyRepositoryImpl vocabularyRepositoryImpl, InterfaceC9968c<? super VocabularyRepositoryImpl$loadCardsForAnswers$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20638i = vocabularyRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20637h = obj;
        this.f20639j |= Integer.MIN_VALUE;
        return this.f20638i.mo6187i(null, this);
    }
}
