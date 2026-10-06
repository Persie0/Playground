package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0337B implements FileStoreAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0338C f32835a;

    private /* synthetic */ C0337B(InterfaceC0338C interfaceC0338C) {
        this.f32835a = interfaceC0338C;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileStoreAttributeView m12118a(InterfaceC0338C interfaceC0338C) {
        if (interfaceC0338C == null) {
            return null;
        }
        return interfaceC0338C instanceof C0336A ? ((C0336A) interfaceC0338C).f32834a : new C0337B(interfaceC0338C);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0338C interfaceC0338C = this.f32835a;
        if (obj instanceof C0337B) {
            obj = ((C0337B) obj).f32835a;
        }
        return interfaceC0338C.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32835a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0336A) this.f32835a).name();
    }
}
