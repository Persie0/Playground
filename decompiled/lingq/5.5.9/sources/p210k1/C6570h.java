package p210k1;

import cm.InterfaceC2041a;

/* JADX INFO: renamed from: k1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6570h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<Float> f37369a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2041a<Float> f37370b;

    /* JADX INFO: renamed from: c */
    public final boolean f37371c;

    public C6570h(InterfaceC2041a<Float> interfaceC2041a, InterfaceC2041a<Float> interfaceC2041a2, boolean z10) {
        this.f37369a = interfaceC2041a;
        this.f37370b = interfaceC2041a2;
        this.f37371c = z10;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + this.f37369a.mo807E().floatValue() + ", maxValue=" + this.f37370b.mo807E().floatValue() + ", reverseScrolling=" + this.f37371c + ')';
    }
}
