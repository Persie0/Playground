package com.lingq.feature.collections;

import com.lingq.core.domain.model.language.Language;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeActiveLanguage$1$1", m4291f = "CollectionViewModel.kt", m4292l = {155}, m4293m = "emit", m4294v = 2)
final class CollectionViewModel$observeActiveLanguage$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Language f25401a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2032c f25403c;

    /* JADX INFO: renamed from: d */
    public int f25404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeActiveLanguage$1$1$emit$1(C2032c c2032c, Continuation continuation) {
        super(continuation);
        this.f25403c = c2032c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25402b = obj;
        this.f25404d |= Integer.MIN_VALUE;
        return this.f25403c.emit(null, this);
    }
}
