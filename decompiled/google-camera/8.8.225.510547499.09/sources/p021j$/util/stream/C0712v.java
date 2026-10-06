package p021j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.v */
/* JADX INFO: loaded from: classes3.dex */
final class C0712v extends AbstractC0634V0 {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0715w f33510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0712v(C0715w c0715w, InterfaceC0646Z0 interfaceC0646Z0) {
        super(interfaceC0646Z0);
        this.f33510b = c0715w;
    }

    @Override // p021j$.util.stream.InterfaceC0640X0, p021j$.util.stream.InterfaceC0646Z0
    public final void accept(int i) {
        this.f33362a.accept(((IntFunction) this.f33510b.f33513n).apply(i));
    }
}
