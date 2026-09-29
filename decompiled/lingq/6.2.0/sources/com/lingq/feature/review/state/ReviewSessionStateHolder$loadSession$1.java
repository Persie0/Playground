package com.lingq.feature.review.state;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {69, 71, 74, 76, 84, 86, 87, 93, 99, 101}, m4293m = "loadSession", m4294v = 2)
final class ReviewSessionStateHolder$loadSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ec8 f32682a;

    /* JADX INFO: renamed from: b */
    public Set f32683b;

    /* JADX INFO: renamed from: c */
    public C2764d f32684c;

    /* JADX INFO: renamed from: d */
    public C2764d f32685d;

    /* JADX INFO: renamed from: e */
    public boolean f32686e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f32687f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2764d f32688g;

    /* JADX INFO: renamed from: h */
    public int f32689h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$loadSession$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32688g = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32687f = obj;
        this.f32689h |= Integer.MIN_VALUE;
        return this.f32688g.m9650i(null, null, this);
    }
}
