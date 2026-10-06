package p021j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: j$.nio.file.attribute.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0365f implements BasicFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0366g f32857a;

    private /* synthetic */ C0365f(InterfaceC0366g interfaceC0366g) {
        this.f32857a = interfaceC0366g;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributeView m12161a(InterfaceC0366g interfaceC0366g) {
        if (interfaceC0366g == null) {
            return null;
        }
        if (interfaceC0366g instanceof C0364e) {
            return ((C0364e) interfaceC0366g).f32856a;
        }
        if (interfaceC0366g instanceof InterfaceC0371l) {
            return C0370k.m12170a((InterfaceC0371l) interfaceC0366g);
        }
        return interfaceC0366g instanceof InterfaceC0346K ? C0345J.m12135a((InterfaceC0346K) interfaceC0366g) : new C0365f(interfaceC0366g);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0366g interfaceC0366g = this.f32857a;
        if (obj instanceof C0365f) {
            obj = ((C0365f) obj).f32857a;
        }
        return interfaceC0366g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32857a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f32857a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0368i.m12163a(this.f32857a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.f32857a.mo11974a(AbstractC0379t.m12180b(fileTime), AbstractC0379t.m12180b(fileTime2), AbstractC0379t.m12180b(fileTime3));
    }
}
