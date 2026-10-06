package p021j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.k */
/* JADX INFO: loaded from: classes3.dex */
final class C0679k extends AbstractC0637W0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33439b;

    /* JADX INFO: renamed from: c */
    Object f33440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0679k(AbstractC0655c abstractC0655c, InterfaceC0646Z0 interfaceC0646Z0, int i) {
        super(interfaceC0646Z0);
        this.f33439b = i;
        this.f33440c = abstractC0655c;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33439b;
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33366a;
        switch (i) {
            case 0:
                if (!((Set) this.f33440c).contains(obj)) {
                    ((Set) this.f33440c).add(obj);
                    interfaceC0646Z0.accept(obj);
                }
                break;
            case 1:
                if (((Predicate) ((C0715w) this.f33440c).f33513n).test(obj)) {
                    interfaceC0646Z0.accept(obj);
                }
                break;
            case 2:
                interfaceC0646Z0.accept(((Function) ((C0715w) this.f33440c).f33513n).apply(obj));
                break;
            default:
                interfaceC0646Z0.accept(((C0620Q0) this.f33440c).f33345m.applyAsLong(obj));
                break;
        }
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        switch (this.f33439b) {
            case 0:
                this.f33440c = null;
                this.f33366a.mo12598f();
                break;
            default:
                super.mo12598f();
                break;
        }
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        int i = this.f33439b;
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33366a;
        switch (i) {
            case 0:
                this.f33440c = new HashSet();
                interfaceC0646Z0.mo12599h(-1L);
                break;
            case 1:
                interfaceC0646Z0.mo12599h(-1L);
                break;
            default:
                interfaceC0646Z0.mo12599h(j);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679k(InterfaceC0646Z0 interfaceC0646Z0) {
        super(interfaceC0646Z0);
        this.f33439b = 0;
    }
}
