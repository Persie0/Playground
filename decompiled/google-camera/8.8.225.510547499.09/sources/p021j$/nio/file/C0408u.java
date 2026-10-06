package p021j$.nio.file;

import java.nio.file.DirectoryStream;

/* JADX INFO: renamed from: j$.nio.file.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C0408u implements DirectoryStream.Filter {

    /* JADX INFO: renamed from: a */
    private final DirectoryStream.Filter f32894a;

    public C0408u(DirectoryStream.Filter filter) {
        this.f32894a = filter;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public final boolean accept(Object obj) {
        return this.f32894a.accept(AbstractC0335a.m12109h(obj));
    }
}
