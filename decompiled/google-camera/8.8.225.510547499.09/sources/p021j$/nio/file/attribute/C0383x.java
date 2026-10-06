package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.x */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0383x implements InterfaceC0385z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileOwnerAttributeView f32870a;

    private /* synthetic */ C0383x(FileOwnerAttributeView fileOwnerAttributeView) {
        this.f32870a = fileOwnerAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0385z m12186c(FileOwnerAttributeView fileOwnerAttributeView) {
        if (fileOwnerAttributeView == null) {
            return null;
        }
        if (fileOwnerAttributeView instanceof C0384y) {
            return ((C0384y) fileOwnerAttributeView).f32871a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            return C0360a.m12156c((AclFileAttributeView) fileOwnerAttributeView);
        }
        return fileOwnerAttributeView instanceof PosixFileAttributeView ? C0344I.m12130c((PosixFileAttributeView) fileOwnerAttributeView) : new C0383x(fileOwnerAttributeView);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo12131b(InterfaceC0356V interfaceC0356V) throws IOException {
        this.f32870a.setOwner(C0355U.m12149a(interfaceC0356V));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0383x) {
            obj = ((C0383x) obj).f32870a;
        }
        return this.f32870a.equals(obj);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    public final /* synthetic */ InterfaceC0356V getOwner() {
        return C0354T.m12148a(this.f32870a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32870a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32870a.name();
    }
}
