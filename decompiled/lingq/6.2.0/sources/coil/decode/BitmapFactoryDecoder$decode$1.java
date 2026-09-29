package coil.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.vv8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.decode.BitmapFactoryDecoder", m4291f = "BitmapFactoryDecoder.kt", m4292l = {231, 46}, m4293m = "decode")
final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f10440a;

    /* JADX INFO: renamed from: b */
    public vv8 f10441b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10442c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0859a f10443d;

    /* JADX INFO: renamed from: e */
    public int f10444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(C0859a c0859a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10443d = c0859a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10442c = obj;
        this.f10444e |= Integer.MIN_VALUE;
        return this.f10443d.m4955a(this);
    }
}
