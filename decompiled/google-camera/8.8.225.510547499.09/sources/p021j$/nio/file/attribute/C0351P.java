package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* JADX INFO: renamed from: j$.nio.file.attribute.P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0351P implements InterfaceC0353S {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserDefinedFileAttributeView f32848a;

    private /* synthetic */ C0351P(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        this.f32848a = userDefinedFileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0353S m12141c(UserDefinedFileAttributeView userDefinedFileAttributeView) {
        if (userDefinedFileAttributeView == null) {
            return null;
        }
        return userDefinedFileAttributeView instanceof C0352Q ? ((C0352Q) userDefinedFileAttributeView).f32849a : new C0351P(userDefinedFileAttributeView);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m12142d(String str) throws IOException {
        this.f32848a.delete(str);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List m12143e() {
        return this.f32848a.list();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0351P) {
            obj = ((C0351P) obj).f32848a;
        }
        return this.f32848a.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int m12144f(String str, ByteBuffer byteBuffer) {
        return this.f32848a.read(str, byteBuffer);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int m12145g(String str) {
        return this.f32848a.size(str);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int m12146h(String str, ByteBuffer byteBuffer) {
        return this.f32848a.write(str, byteBuffer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32848a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32848a.name();
    }
}
