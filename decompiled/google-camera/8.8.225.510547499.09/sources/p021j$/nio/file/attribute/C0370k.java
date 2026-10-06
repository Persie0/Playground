package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: j$.nio.file.attribute.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0370k implements DosFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0371l f32861a;

    private /* synthetic */ C0370k(InterfaceC0371l interfaceC0371l) {
        this.f32861a = interfaceC0371l;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DosFileAttributeView m12170a(InterfaceC0371l interfaceC0371l) {
        if (interfaceC0371l == null) {
            return null;
        }
        return interfaceC0371l instanceof C0369j ? ((C0369j) interfaceC0371l).f32860a : new C0370k(interfaceC0371l);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0371l interfaceC0371l = this.f32861a;
        if (obj instanceof C0370k) {
            obj = ((C0370k) obj).f32861a;
        }
        return interfaceC0371l.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32861a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0369j) this.f32861a).name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0368i.m12163a(((C0369j) this.f32861a).readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        ((C0369j) this.f32861a).m12166e(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        ((C0369j) this.f32861a).m12167f(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        ((C0369j) this.f32861a).m12168g(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        ((C0369j) this.f32861a).m12169h(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((C0369j) this.f32861a).mo11974a(AbstractC0379t.m12180b(fileTime), AbstractC0379t.m12180b(fileTime2), AbstractC0379t.m12180b(fileTime3));
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() {
        return C0373n.m12176a(((C0369j) this.f32861a).m12165d());
    }
}
