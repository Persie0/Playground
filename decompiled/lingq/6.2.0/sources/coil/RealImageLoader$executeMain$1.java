package coil;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c78;
import p000.e04;
import p000.wt2;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.RealImageLoader", m4291f = "RealImageLoader.kt", m4292l = {171, 183, 187}, m4293m = "executeMain")
final class RealImageLoader$executeMain$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0855a f10390a;

    /* JADX INFO: renamed from: b */
    public c78 f10391b;

    /* JADX INFO: renamed from: c */
    public e04 f10392c;

    /* JADX INFO: renamed from: d */
    public wt2 f10393d;

    /* JADX INFO: renamed from: e */
    public Bitmap f10394e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f10395f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0855a f10396g;

    /* JADX INFO: renamed from: h */
    public int f10397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$1(C0855a c0855a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10396g = c0855a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10395f = obj;
        this.f10397h |= Integer.MIN_VALUE;
        return C0855a.m4949a(this.f10396g, null, 0, this);
    }
}
