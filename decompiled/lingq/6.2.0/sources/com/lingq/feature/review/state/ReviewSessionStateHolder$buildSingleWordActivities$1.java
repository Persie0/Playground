package com.lingq.feature.review.state;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;
import p000.ob8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {271, 277}, m4293m = "buildSingleWordActivities", m4294v = 2)
final class ReviewSessionStateHolder$buildSingleWordActivities$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f32660a;

    /* JADX INFO: renamed from: b */
    public ec8 f32661b;

    /* JADX INFO: renamed from: c */
    public ob8 f32662c;

    /* JADX INFO: renamed from: d */
    public boolean f32663d;

    /* JADX INFO: renamed from: e */
    public boolean f32664e;

    /* JADX INFO: renamed from: f */
    public boolean f32665f;

    /* JADX INFO: renamed from: g */
    public boolean f32666g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f32667h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2764d f32668i;

    /* JADX INFO: renamed from: j */
    public int f32669j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$buildSingleWordActivities$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32668i = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32667h = obj;
        this.f32669j |= Integer.MIN_VALUE;
        return this.f32668i.m9644b(null, null, this);
    }
}
