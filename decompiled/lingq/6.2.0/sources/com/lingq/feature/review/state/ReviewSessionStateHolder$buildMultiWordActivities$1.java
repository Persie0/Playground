package com.lingq.feature.review.state;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {431, 432, 433, 441}, m4293m = "buildMultiWordActivities", m4294v = 2)
final class ReviewSessionStateHolder$buildMultiWordActivities$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f32647H;

    /* JADX INFO: renamed from: a */
    public List f32648a;

    /* JADX INFO: renamed from: b */
    public ec8 f32649b;

    /* JADX INFO: renamed from: c */
    public List f32650c;

    /* JADX INFO: renamed from: d */
    public List f32651d;

    /* JADX INFO: renamed from: e */
    public Set f32652e;

    /* JADX INFO: renamed from: f */
    public int f32653f;

    /* JADX INFO: renamed from: g */
    public int f32654g;

    /* JADX INFO: renamed from: h */
    public boolean f32655h;

    /* JADX INFO: renamed from: i */
    public boolean f32656i;

    /* JADX INFO: renamed from: j */
    public boolean f32657j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f32658k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2764d f32659l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$buildMultiWordActivities$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32659l = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32658k = obj;
        this.f32647H |= Integer.MIN_VALUE;
        return this.f32659l.m9643a(null, null, this);
    }
}
