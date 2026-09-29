package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeSentenceTranslationSetting$$inlined$filter$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeSentenceTranslationSetting$$inlined$filter$1$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2577x6d8ca77d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31234a;

    /* JADX INFO: renamed from: b */
    public int f31235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f31236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2577x6d8ca77d(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f31236c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31234a = obj;
        this.f31235b |= Integer.MIN_VALUE;
        return this.f31236c.emit(null, this);
    }
}
