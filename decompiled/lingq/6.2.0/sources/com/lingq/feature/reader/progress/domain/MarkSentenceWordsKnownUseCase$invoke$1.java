package com.lingq.feature.reader.progress.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.MarkSentenceWordsKnownUseCase", m4291f = "MarkSentenceWordsKnownUseCase.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 38}, m4293m = "invoke", m4294v = 2)
final class MarkSentenceWordsKnownUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f29873a;

    /* JADX INFO: renamed from: b */
    public int f29874b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29875c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2472b f29876d;

    /* JADX INFO: renamed from: e */
    public int f29877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkSentenceWordsKnownUseCase$invoke$1(C2472b c2472b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29876d = c2472b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29875c = obj;
        this.f29877e |= Integer.MIN_VALUE;
        return this.f29876d.m9378b(null, 0, null, this);
    }
}
