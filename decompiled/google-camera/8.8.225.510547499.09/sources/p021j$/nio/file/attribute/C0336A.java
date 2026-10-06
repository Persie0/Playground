package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0336A implements InterfaceC0338C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileStoreAttributeView f32834a;

    private /* synthetic */ C0336A(FileStoreAttributeView fileStoreAttributeView) {
        this.f32834a = fileStoreAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0338C m12117c(FileStoreAttributeView fileStoreAttributeView) {
        if (fileStoreAttributeView == null) {
            return null;
        }
        return fileStoreAttributeView instanceof C0337B ? ((C0337B) fileStoreAttributeView).f32835a : new C0336A(fileStoreAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0336A) {
            obj = ((C0336A) obj).f32834a;
        }
        return this.f32834a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32834a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32834a.name();
    }
}
