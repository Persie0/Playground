package com.lingq.feature.widget;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.widget.PlaylistWidget", m4291f = "PlaylistWidget.kt", m4292l = {94}, m4293m = "setupWidget", m4294v = 2)
final class PlaylistWidget$setupWidget$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2863a f33821b;

    /* JADX INFO: renamed from: c */
    public int f33822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistWidget$setupWidget$1(C2863a c2863a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33821b = c2863a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33820a = obj;
        this.f33822c |= Integer.MIN_VALUE;
        return this.f33821b.m9776i(null, this);
    }
}
