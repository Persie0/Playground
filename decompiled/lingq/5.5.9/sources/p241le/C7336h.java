package p241le;

import java.util.concurrent.Callable;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;

/* JADX INFO: renamed from: le.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7336h implements InterfaceC5745a<Void, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Callable f41061a;

    public C7336h(Callable callable) {
        this.f41061a = callable;
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g<Void> abstractC5751g) throws Exception {
        return this.f41061a.call();
    }
}
