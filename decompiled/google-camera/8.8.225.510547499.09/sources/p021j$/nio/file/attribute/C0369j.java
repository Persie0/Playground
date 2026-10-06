package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;

/* JADX INFO: renamed from: j$.nio.file.attribute.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0369j implements InterfaceC0371l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributeView f32860a;

    private /* synthetic */ C0369j(DosFileAttributeView dosFileAttributeView) {
        this.f32860a = dosFileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0371l m12164c(DosFileAttributeView dosFileAttributeView) {
        if (dosFileAttributeView == null) {
            return null;
        }
        return dosFileAttributeView instanceof C0370k ? ((C0370k) dosFileAttributeView).f32861a : new C0369j(dosFileAttributeView);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo11974a(C0340E c0340e, C0340E c0340e2, C0340E c0340e3) throws IOException {
        this.f32860a.setTimes(AbstractC0379t.m12182d(c0340e), AbstractC0379t.m12182d(c0340e2), AbstractC0379t.m12182d(c0340e3));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0374o m12165d() {
        return C0372m.m12171a(this.f32860a.readAttributes());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m12166e(boolean z) throws IOException {
        this.f32860a.setArchive(z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0369j) {
            obj = ((C0369j) obj).f32860a;
        }
        return this.f32860a.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m12167f(boolean z) throws IOException {
        this.f32860a.setHidden(z);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m12168g(boolean z) throws IOException {
        this.f32860a.setReadOnly(z);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m12169h(boolean z) throws IOException {
        this.f32860a.setSystem(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32860a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32860a.name();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0367h.m12162a(this.f32860a.readAttributes());
    }
}
