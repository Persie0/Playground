package com.lingq.feature.reader.progress.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.domain.MovePageWordsToKnownUseCase", m4291f = "MovePageWordsToKnownUseCase.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 50}, m4293m = "invoke", m4294v = 2)
final class MovePageWordsToKnownUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f29878a;

    /* JADX INFO: renamed from: b */
    public int f29879b;

    /* JADX INFO: renamed from: c */
    public int f29880c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29881d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2472b f29882e;

    /* JADX INFO: renamed from: f */
    public int f29883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovePageWordsToKnownUseCase$invoke$1(C2472b c2472b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29882e = c2472b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29881d = obj;
        this.f29883f |= Integer.MIN_VALUE;
        return this.f29882e.m9377a(null, 0, null, null, this);
    }
}
