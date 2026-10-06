package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0364e implements InterfaceC0366g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributeView f32856a;

    private /* synthetic */ C0364e(BasicFileAttributeView basicFileAttributeView) {
        this.f32856a = basicFileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0366g m12160c(BasicFileAttributeView basicFileAttributeView) {
        if (basicFileAttributeView == null) {
            return null;
        }
        if (basicFileAttributeView instanceof C0365f) {
            return ((C0365f) basicFileAttributeView).f32857a;
        }
        if (basicFileAttributeView instanceof DosFileAttributeView) {
            return C0369j.m12164c((DosFileAttributeView) basicFileAttributeView);
        }
        return basicFileAttributeView instanceof PosixFileAttributeView ? C0344I.m12130c((PosixFileAttributeView) basicFileAttributeView) : new C0364e(basicFileAttributeView);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo11974a(C0340E c0340e, C0340E c0340e2, C0340E c0340e3) throws IOException {
        this.f32856a.setTimes(AbstractC0379t.m12182d(c0340e), AbstractC0379t.m12182d(c0340e2), AbstractC0379t.m12182d(c0340e3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0364e) {
            obj = ((C0364e) obj).f32856a;
        }
        return this.f32856a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32856a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32856a.name();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0367h.m12162a(this.f32856a.readAttributes());
    }
}
