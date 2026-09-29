package com.lingq.feature.review.state;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {243}, m4293m = "readySessionCards", m4294v = 2)
final class ReviewSessionStateHolder$readySessionCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f32690a;

    /* JADX INFO: renamed from: b */
    public boolean f32691b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2764d f32693d;

    /* JADX INFO: renamed from: e */
    public int f32694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$readySessionCards$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32693d = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32692c = obj;
        this.f32694e |= Integer.MIN_VALUE;
        return this.f32693d.m9651j(null, false, null, this);
    }
}
