package p021j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;
import p021j$.nio.file.attribute.C0337B;

/* JADX INFO: renamed from: j$.nio.file.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0391g extends FileStore {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0392h f32876a;

    private /* synthetic */ C0391g(AbstractC0392h abstractC0392h) {
        this.f32876a = abstractC0392h;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FileStore m12202a(AbstractC0392h abstractC0392h) {
        if (abstractC0392h == null) {
            return null;
        }
        return abstractC0392h instanceof C0390f ? ((C0390f) abstractC0392h).f32875e : new C0391g(abstractC0392h);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0392h abstractC0392h = this.f32876a;
        if (obj instanceof C0391g) {
            obj = ((C0391g) obj).f32876a;
        }
        return abstractC0392h.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.f32876a.mo12191b(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.f32876a.mo12192c();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        return C0337B.m12118a(this.f32876a.mo12193e(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.f32876a.mo12194f();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.f32876a.mo12195g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.f32876a.mo12196h();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32876a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.f32876a.mo12197i();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.f32876a.mo12198n();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.f32876a.mo12199o(AbstractC0335a.m12110i(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.f32876a.mo12201q();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.f32876a.mo12200p(str);
    }
}
