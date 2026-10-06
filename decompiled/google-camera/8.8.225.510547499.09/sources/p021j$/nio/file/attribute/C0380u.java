package p021j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.u */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0380u implements InterfaceC0382w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttributeView f32868a;

    private /* synthetic */ C0380u(FileAttributeView fileAttributeView) {
        this.f32868a = fileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0382w m12184c(FileAttributeView fileAttributeView) {
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C0381v) {
            return ((C0381v) fileAttributeView).f32869a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            return C0364e.m12160c((BasicFileAttributeView) fileAttributeView);
        }
        if (fileAttributeView instanceof FileOwnerAttributeView) {
            return C0383x.m12186c((FileOwnerAttributeView) fileAttributeView);
        }
        return fileAttributeView instanceof UserDefinedFileAttributeView ? C0351P.m12141c((UserDefinedFileAttributeView) fileAttributeView) : new C0380u(fileAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0380u) {
            obj = ((C0380u) obj).f32868a;
        }
        return this.f32868a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32868a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32868a.name();
    }
}
