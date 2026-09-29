package p241le;

import com.google.firebase.crashlytics.internal.common.C3213b;
import p136gc.AbstractC5751g;
import p136gc.C5761q;
import p136gc.InterfaceC5750f;

/* JADX INFO: renamed from: le.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7344o implements InterfaceC5750f<Boolean, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC5751g f41076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3213b f41077b;

    public C7344o(C3213b c3213b, C5761q c5761q) {
        this.f41077b = c3213b;
        this.f41076a = c5761q;
    }

    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g<Void> mo428f(Boolean bool) throws Exception {
        AbstractC5751g abstractC5751gMo12105g;
        C7332f c7332f = this.f41077b.f16209e;
        CallableC7343n callableC7343n = new CallableC7343n(this, bool);
        synchronized (c7332f.f41052c) {
            abstractC5751gMo12105g = c7332f.f41051b.mo12105g(c7332f.f41050a, new C7336h(callableC7343n));
            c7332f.f41051b = abstractC5751gMo12105g.mo12104f(c7332f.f41050a, new C7338i());
        }
        return abstractC5751gMo12105g;
    }
}
