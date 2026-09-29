package com.lingq.feature.reader.buylesson;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.buylesson.ReaderBuyLessonManager$special$$inlined$map$1$2", m4291f = "ReaderBuyLessonManager.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderBuyLessonManager$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27855a;

    /* JADX INFO: renamed from: b */
    public int f27856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f27857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderBuyLessonManager$special$$inlined$map$1$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f27857c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27855a = obj;
        this.f27856b |= Integer.MIN_VALUE;
        return this.f27857c.emit(null, this);
    }
}
