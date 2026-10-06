package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.attribute.Q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0352Q implements UserDefinedFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0353S f32849a;

    private /* synthetic */ C0352Q(InterfaceC0353S interfaceC0353S) {
        this.f32849a = interfaceC0353S;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserDefinedFileAttributeView m12147a(InterfaceC0353S interfaceC0353S) {
        if (interfaceC0353S == null) {
            return null;
        }
        return interfaceC0353S instanceof C0351P ? ((C0351P) interfaceC0353S).f32848a : new C0352Q(interfaceC0353S);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(String str) throws IOException {
        ((C0351P) this.f32849a).m12142d(str);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0353S interfaceC0353S = this.f32849a;
        if (obj instanceof C0352Q) {
            obj = ((C0352Q) obj).f32849a;
        }
        return interfaceC0353S.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32849a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ List list() {
        return ((C0351P) this.f32849a).m12143e();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0351P) this.f32849a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(String str, ByteBuffer byteBuffer) {
        return ((C0351P) this.f32849a).m12144f(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(String str) {
        return ((C0351P) this.f32849a).m12145g(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(String str, ByteBuffer byteBuffer) {
        return ((C0351P) this.f32849a).m12146h(str, byteBuffer);
    }
}
