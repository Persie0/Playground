package p021j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.util.Set;
import p021j$.nio.file.AbstractC0335a;

/* JADX INFO: renamed from: j$.nio.file.attribute.I */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0344I implements InterfaceC0346K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributeView f32843a;

    private /* synthetic */ C0344I(PosixFileAttributeView posixFileAttributeView) {
        this.f32843a = posixFileAttributeView;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0346K m12130c(PosixFileAttributeView posixFileAttributeView) {
        if (posixFileAttributeView == null) {
            return null;
        }
        return posixFileAttributeView instanceof C0345J ? ((C0345J) posixFileAttributeView).f32844a : new C0344I(posixFileAttributeView);
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo11974a(C0340E c0340e, C0340E c0340e2, C0340E c0340e3) throws IOException {
        this.f32843a.setTimes(AbstractC0379t.m12182d(c0340e), AbstractC0379t.m12182d(c0340e2), AbstractC0379t.m12182d(c0340e3));
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo12131b(InterfaceC0356V interfaceC0356V) throws IOException {
        this.f32843a.setOwner(C0355U.m12149a(interfaceC0356V));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0349N m12132d() {
        return C0347L.m12136a(this.f32843a.readAttributes());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m12133e(InterfaceC0343H interfaceC0343H) throws IOException {
        this.f32843a.setGroup(C0342G.m12129a(interfaceC0343H));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0344I) {
            obj = ((C0344I) obj).f32843a;
        }
        return this.f32843a.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m12134f(Set set) throws IOException {
        this.f32843a.setPermissions(AbstractC0335a.m12115n(set));
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0385z
    public final /* synthetic */ InterfaceC0356V getOwner() {
        return C0354T.m12148a(this.f32843a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f32843a.hashCode();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0363d
    public final /* synthetic */ String name() {
        return this.f32843a.name();
    }

    @Override // p021j$.nio.file.attribute.InterfaceC0366g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0367h.m12162a(this.f32843a.readAttributes());
    }
}
