package p021j$.util.stream;

import p021j$.util.Optional;

/* JADX INFO: renamed from: j$.util.stream.n */
/* JADX INFO: loaded from: classes3.dex */
final class C0688n extends AbstractC0691o {

    /* JADX INFO: renamed from: c */
    static final C0685m f33448c;

    static {
        EnumC0714v1 enumC0714v1 = EnumC0714v1.REFERENCE;
        f33448c = new C0685m(true, enumC0714v1, Optional.empty(), new C0652b(28), new C0652b(7));
        new C0685m(false, enumC0714v1, Optional.empty(), new C0652b(28), new C0652b(7));
    }

    C0688n() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33450a) {
            return Optional.m12505of(this.f33451b);
        }
        return null;
    }
}
