package com.lingq.p020ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel", m4291f = "HomeViewModel.kt", m4292l = {294, 299}, m4293m = "navigateToPlaylist", m4294v = 2)
final class HomeViewModel$navigateToPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f33969a;

    /* JADX INFO: renamed from: b */
    public int f33970b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2888d f33972d;

    /* JADX INFO: renamed from: e */
    public int f33973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$navigateToPlaylist$1(C2888d c2888d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33972d = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33971c = obj;
        this.f33973e |= Integer.MIN_VALUE;
        return this.f33972d.m9811Z2(0, null, this);
    }
}
