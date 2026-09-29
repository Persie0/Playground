package androidx.compose.foundation.relocation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e28;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m4291f = "BringIntoViewRequester.kt", m4292l = {102}, m4293m = "bringIntoView", m4294v = 1)
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public e28 f2699a;

    /* JADX INFO: renamed from: b */
    public Object[] f2700b;

    /* JADX INFO: renamed from: c */
    public int f2701c;

    /* JADX INFO: renamed from: d */
    public int f2702d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0154a f2704f;

    /* JADX INFO: renamed from: g */
    public int f2705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(C0154a c0154a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2704f = c0154a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2703e = obj;
        this.f2705g |= Integer.MIN_VALUE;
        return this.f2704f.m1046a(null, this);
    }
}
