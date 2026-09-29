package p000;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class gk7 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f40913a;

    /* JADX INFO: renamed from: b */
    public final ak7 f40914b;

    public gk7(String str, ak7 ak7Var) {
        ak7Var.getClass();
        this.f40913a = str;
        this.f40914b = ak7Var;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f40913a;
    }

    /* JADX INFO: renamed from: b */
    public final void m12721b() {
        throw new IllegalStateException(AbstractC3393o1.m17738m(new StringBuilder("Primitive descriptor "), this.f40913a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        m12721b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk7)) {
            return false;
        }
        gk7 gk7Var = (gk7) obj;
        return this.f40913a.equals(gk7Var.f40913a) && fa4.m11650l(this.f40914b, gk7Var.f40914b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        m12721b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return this.f40914b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        m12721b();
        throw null;
    }

    public final int hashCode() {
        return (this.f40914b.hashCode() * 31) + this.f40913a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        m12721b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        m12721b();
        throw null;
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("PrimitiveDescriptor("), this.f40913a, ')');
    }
}
