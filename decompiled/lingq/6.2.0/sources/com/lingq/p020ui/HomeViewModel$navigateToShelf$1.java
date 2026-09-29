package com.lingq.p020ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel", m4291f = "HomeViewModel.kt", m4292l = {281}, m4293m = "navigateToShelf", m4294v = 2)
final class HomeViewModel$navigateToShelf$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33975b;

    /* JADX INFO: renamed from: c */
    public int f33976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$navigateToShelf$1(C2888d c2888d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33975b = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33974a = obj;
        this.f33976c |= Integer.MIN_VALUE;
        return this.f33975b.m9812a3(null, null, this);
    }
}
