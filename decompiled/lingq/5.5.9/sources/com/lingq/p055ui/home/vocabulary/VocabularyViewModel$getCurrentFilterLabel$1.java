package com.lingq.p055ui.home.vocabulary;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel", m19206f = "VocabularyViewModel.kt", m19207l = {434, 435, 437, 439}, m19208m = "getCurrentFilterLabel")
final class VocabularyViewModel$getCurrentFilterLabel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public VocabularyViewModel f26284d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f26285e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26286f;

    /* JADX INFO: renamed from: g */
    public int f26287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$getCurrentFilterLabel$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$getCurrentFilterLabel$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f26286f = vocabularyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f26285e = obj;
        this.f26287g |= Integer.MIN_VALUE;
        return VocabularyViewModel.m10024m2(this.f26286f, this);
    }
}
