package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: j$.nio.file.attribute.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0375p implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttribute f32864a;

    private /* synthetic */ C0375p(FileAttribute fileAttribute) {
        this.f32864a = fileAttribute;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileAttribute m12177a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return fileAttribute instanceof C0376q ? ((C0376q) fileAttribute).f32865a : new C0375p(fileAttribute);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0375p) {
            obj = ((C0375p) obj).f32864a;
        }
        return this.f32864a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32864a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f32864a.name();
    }

    @Override // p021j$.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f32864a.value();
    }
}
