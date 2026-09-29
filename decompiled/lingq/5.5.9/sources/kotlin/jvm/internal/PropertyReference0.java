package kotlin.jvm.internal;

import dm.C5209i;
import km.InterfaceC6718a;
import km.InterfaceC6724g;
import no.C7814a0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC6724g {
    public PropertyReference0(Object obj) {
        super(obj, C7814a0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Object mo807E() {
        return get();
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: c */
    public final InterfaceC6718a mo13478c() {
        return C5209i.f33277a.mo11125e(this);
    }
}
