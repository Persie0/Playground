package com.lingq.core.domain.library;

import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.domain.library.UpdatePreferredTabForShelfUseCase", m4291f = "UpdatePreferredTabForShelf.kt", m4292l = {13, 14}, m4293m = "invoke", m4294v = 2)
final class UpdatePreferredTabForShelfUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LibraryShelf f18821a;

    /* JADX INFO: renamed from: b */
    public LibraryTab f18822b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1386a f18824d;

    /* JADX INFO: renamed from: e */
    public int f18825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePreferredTabForShelfUseCase$invoke$1(C1386a c1386a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18824d = c1386a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18823c = obj;
        this.f18825e |= Integer.MIN_VALUE;
        return this.f18824d.m7999c(null, null, this);
    }
}
