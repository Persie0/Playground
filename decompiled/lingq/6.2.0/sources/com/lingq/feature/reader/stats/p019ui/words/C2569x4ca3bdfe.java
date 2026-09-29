package com.lingq.feature.reader.stats.p019ui.words;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$hasCards$1$invokeSuspend$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$hasCards$1$invokeSuspend$$inlined$map$1$2", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2569x4ca3bdfe extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31092a;

    /* JADX INFO: renamed from: b */
    public int f31093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f31094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2569x4ca3bdfe(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f31094c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31092a = obj;
        this.f31093b |= Integer.MIN_VALUE;
        return this.f31094c.emit(null, this);
    }
}
