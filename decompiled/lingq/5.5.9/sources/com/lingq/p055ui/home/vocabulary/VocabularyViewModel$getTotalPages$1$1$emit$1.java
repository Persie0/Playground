package com.lingq.p055ui.home.vocabulary;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$getTotalPages$1$1", m19206f = "VocabularyViewModel.kt", m19207l = {289}, m19208m = "emit")
public final class VocabularyViewModel$getTotalPages$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public VocabularyViewModel$getTotalPages$1.C40221 f26292d;

    /* JADX INFO: renamed from: e */
    public int f26293e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f26294f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyViewModel$getTotalPages$1.C40221 f26295g;

    /* JADX INFO: renamed from: h */
    public int f26296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$getTotalPages$1$1$emit$1(VocabularyViewModel$getTotalPages$1.C40221 c40221, InterfaceC9968c<? super VocabularyViewModel$getTotalPages$1$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f26295g = c40221;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f26294f = obj;
        this.f26296h |= Integer.MIN_VALUE;
        return this.f26295g.m10066a(0, this);
    }
}
