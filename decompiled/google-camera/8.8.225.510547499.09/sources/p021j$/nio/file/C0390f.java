package p021j$.nio.file;

import java.nio.file.FileStore;
import p021j$.nio.file.attribute.C0336A;
import p021j$.nio.file.attribute.InterfaceC0338C;

/* JADX INFO: renamed from: j$.nio.file.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0390f extends AbstractC0392h {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ FileStore f32875e;

    private /* synthetic */ C0390f(FileStore fileStore) {
        this.f32875e = fileStore;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ AbstractC0392h m12190r(FileStore fileStore) {
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C0391g ? ((C0391g) fileStore).f32876a : new C0390f(fileStore);
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo12191b(String str) {
        return this.f32875e.getAttribute(str);
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long mo12192c() {
        return this.f32875e.getBlockSize();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0338C mo12193e(Class cls) {
        return C0336A.m12117c(this.f32875e.getFileStoreAttributeView(cls));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0390f) {
            obj = ((C0390f) obj).f32875e;
        }
        return this.f32875e.equals(obj);
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long mo12194f() {
        return this.f32875e.getTotalSpace();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long mo12195g() {
        return this.f32875e.getUnallocatedSpace();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long mo12196h() {
        return this.f32875e.getUsableSpace();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32875e.hashCode();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo12197i() {
        return this.f32875e.isReadOnly();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String mo12198n() {
        return this.f32875e.name();
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean mo12199o(Class cls) {
        return this.f32875e.supportsFileAttributeView(AbstractC0335a.m12110i(cls));
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean mo12200p(String str) {
        return this.f32875e.supportsFileAttributeView(str);
    }

    @Override // p021j$.nio.file.AbstractC0392h
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ String mo12201q() {
        return this.f32875e.type();
    }
}
