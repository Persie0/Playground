package kotlin.jvm.internal;

import dm.C5209i;
import km.InterfaceC6718a;
import km.InterfaceC6723f;
import km.InterfaceC6725h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC6723f {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: c */
    public final InterfaceC6718a mo13478c() {
        return C5209i.m11119b(this);
    }

    @Override // km.InterfaceC6725h
    /* JADX INFO: renamed from: h */
    public final InterfaceC6725h.a mo13338h() {
        return ((InterfaceC6723f) m13482k()).mo13338h();
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(Object obj) {
        return ((MutablePropertyReference1Impl) this).mo13338h().mo13337b(obj);
    }
}
