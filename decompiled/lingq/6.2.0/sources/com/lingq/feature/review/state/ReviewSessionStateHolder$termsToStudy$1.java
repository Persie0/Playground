package com.lingq.feature.review.state;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ec8;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.state.ReviewSessionStateHolder", m4291f = "ReviewSessionStateHolder.kt", m4292l = {179, 189, 191, 196}, m4293m = "termsToStudy", m4294v = 2)
final class ReviewSessionStateHolder$termsToStudy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ec8 f32695a;

    /* JADX INFO: renamed from: b */
    public List f32696b;

    /* JADX INFO: renamed from: c */
    public Iterator f32697c;

    /* JADX INFO: renamed from: d */
    public Collection f32698d;

    /* JADX INFO: renamed from: e */
    public boolean f32699e;

    /* JADX INFO: renamed from: f */
    public int f32700f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f32701g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2764d f32702h;

    /* JADX INFO: renamed from: i */
    public int f32703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionStateHolder$termsToStudy$1(C2764d c2764d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32702h = c2764d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32701g = obj;
        this.f32703i |= Integer.MIN_VALUE;
        return this.f32702h.m9653l(null, false, null, this);
    }
}
