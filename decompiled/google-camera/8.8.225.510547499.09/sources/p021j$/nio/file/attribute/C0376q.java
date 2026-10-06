package p021j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: j$.nio.file.attribute.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0376q implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttribute f32865a;

    private /* synthetic */ C0376q(FileAttribute fileAttribute) {
        this.f32865a = fileAttribute;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileAttribute m12178a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return fileAttribute instanceof C0375p ? ((C0375p) fileAttribute).f32864a : new C0376q(fileAttribute);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f32865a;
        if (obj instanceof C0376q) {
            obj = ((C0376q) obj).f32865a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32865a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f32865a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f32865a.value();
    }
}
