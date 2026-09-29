package com.lingq.feature.reader.stats.p019ui.all;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bn3;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$_words$1$invokeSuspend$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$_words$1$invokeSuspend$$inlined$map$1$2", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2552x86e6a9fb extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30921a;

    /* JADX INFO: renamed from: b */
    public int f30922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bn3 f30923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2552x86e6a9fb(bn3 bn3Var, Continuation continuation) {
        super(continuation);
        this.f30923c = bn3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30921a = obj;
        this.f30922b |= Integer.MIN_VALUE;
        return this.f30923c.emit(null, this);
    }
}
