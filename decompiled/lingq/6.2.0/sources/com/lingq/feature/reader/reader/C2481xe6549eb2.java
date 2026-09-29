package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.iv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$$inlined$map$3$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeLessonStudyTracking$$inlined$map$3$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2481xe6549eb2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30005a;

    /* JADX INFO: renamed from: b */
    public int f30006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iv7 f30007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2481xe6549eb2(iv7 iv7Var, Continuation continuation) {
        super(continuation);
        this.f30007c = iv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30005a = obj;
        this.f30006b |= Integer.MIN_VALUE;
        return this.f30007c.emit(null, this);
    }
}
