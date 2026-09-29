package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl", m19206f = "VocabularyRepository.kt", m19207l = {200, 204, 206, 215, 233, 235, 240}, m19208m = "networkVocabularyCards")
final class VocabularyRepositoryImpl$networkVocabularyCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public boolean f20653H;

    /* JADX INFO: renamed from: I */
    public boolean f20654I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f20655J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ VocabularyRepositoryImpl f20656K;

    /* JADX INFO: renamed from: L */
    public int f20657L;

    /* JADX INFO: renamed from: d */
    public Object f20658d;

    /* JADX INFO: renamed from: e */
    public String f20659e;

    /* JADX INFO: renamed from: f */
    public String f20660f;

    /* JADX INFO: renamed from: g */
    public String f20661g;

    /* JADX INFO: renamed from: h */
    public Ref$ObjectRef f20662h;

    /* JADX INFO: renamed from: i */
    public Object f20663i;

    /* JADX INFO: renamed from: j */
    public List f20664j;

    /* JADX INFO: renamed from: k */
    public int f20665k;

    /* JADX INFO: renamed from: l */
    public int f20666l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$networkVocabularyCards$1(VocabularyRepositoryImpl vocabularyRepositoryImpl, InterfaceC9968c<? super VocabularyRepositoryImpl$networkVocabularyCards$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20656K = vocabularyRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20655J = obj;
        this.f20657L |= Integer.MIN_VALUE;
        return this.f20656K.mo6188j(null, 0, null, false, false, null, 0, this);
    }
}
