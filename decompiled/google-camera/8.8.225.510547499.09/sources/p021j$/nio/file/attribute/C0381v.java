package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0381v implements FileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0382w f32869a;

    private /* synthetic */ C0381v(InterfaceC0382w interfaceC0382w) {
        this.f32869a = interfaceC0382w;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileAttributeView m12185a(InterfaceC0382w interfaceC0382w) {
        if (interfaceC0382w == null) {
            return null;
        }
        if (interfaceC0382w instanceof C0380u) {
            return ((C0380u) interfaceC0382w).f32868a;
        }
        if (interfaceC0382w instanceof InterfaceC0366g) {
            return C0365f.m12161a((InterfaceC0366g) interfaceC0382w);
        }
        if (interfaceC0382w instanceof InterfaceC0385z) {
            return C0384y.m12187a((InterfaceC0385z) interfaceC0382w);
        }
        return interfaceC0382w instanceof InterfaceC0353S ? C0352Q.m12147a((InterfaceC0353S) interfaceC0382w) : new C0381v(interfaceC0382w);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0382w interfaceC0382w = this.f32869a;
        if (obj instanceof C0381v) {
            obj = ((C0381v) obj).f32869a;
        }
        return interfaceC0382w.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32869a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f32869a.name();
    }
}
