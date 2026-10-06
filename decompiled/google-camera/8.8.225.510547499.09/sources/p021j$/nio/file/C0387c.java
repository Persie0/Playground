package p021j$.nio.file;

import java.nio.file.CopyOption;

/* JADX INFO: renamed from: j$.nio.file.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0387c implements InterfaceC0389e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CopyOption f32873a;

    private /* synthetic */ C0387c(CopyOption copyOption) {
        this.f32873a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.e, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.e, java.nio.file.LinkOption] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0389e m12188a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C0388d) {
            return ((C0388d) copyOption).f32874a;
        }
        if (copyOption instanceof LinkOption) {
            return AbstractC0335a.m12105d((LinkOption) copyOption);
        }
        return copyOption instanceof EnumC0314C ? AbstractC0335a.m12106e((EnumC0314C) copyOption) : new C0387c(copyOption);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0387c) {
            obj = ((C0387c) obj).f32873a;
        }
        return this.f32873a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32873a.hashCode();
    }
}
