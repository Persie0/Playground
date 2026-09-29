package kotlin.jvm.internal;

import com.lingq.shared.p054di.SharedModule;
import dm.C5209i;
import km.InterfaceC6718a;
import km.InterfaceC6726i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements InterfaceC6726i {
    public PropertyReference2(int i10) {
        super(CallableReference.f38110g, SharedModule.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: c */
    public final InterfaceC6718a mo13478c() {
        return C5209i.f33277a.mo11127g(this);
    }

    @Override // km.InterfaceC6726i
    /* JADX INFO: renamed from: h */
    public final InterfaceC6726i.a mo13339h() {
        return ((InterfaceC6726i) m13482k()).mo13339h();
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Object obj, Object obj2) {
        return ((PropertyReference2Impl) this).mo13339h().mo13337b(obj, obj2);
    }
}
