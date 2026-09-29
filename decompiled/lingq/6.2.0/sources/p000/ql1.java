package p000;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final zx8 f57893a;

    /* JADX INFO: renamed from: b */
    public final z21 f57894b;

    /* JADX INFO: renamed from: c */
    public final String f57895c;

    public ql1(zx8 zx8Var, z21 z21Var) {
        this.f57893a = zx8Var;
        this.f57894b = z21Var;
        this.f57895c = zx8Var.f72346a + '<' + z21Var.m25414c() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f57895c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo11826c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        return this.f57893a.mo3696d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return this.f57893a.f72348c;
    }

    public final boolean equals(Object obj) {
        ql1 ql1Var = obj instanceof ql1 ? (ql1) obj : null;
        return ql1Var != null && this.f57893a.equals(ql1Var.f57893a) && ql1Var.f57894b.equals(this.f57894b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return this.f57893a.f72351f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final boolean mo10855g() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f57893a.f72349d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return this.f57893a.f72347b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        return this.f57893a.f72353h[i];
    }

    public final int hashCode() {
        return this.f57895c.hashCode() + (this.f57894b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return this.f57893a.f72352g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        return this.f57893a.f72354i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f57894b + ", original: " + this.f57893a + ')';
    }
}
