package p000;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ie5 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f44018a;

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor f44019b;

    public ie5(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        serialDescriptor.getClass();
        serialDescriptor2.getClass();
        this.f44018a = serialDescriptor;
        this.f44019b = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        Integer numM4844a0 = cl9.m4844a0(str);
        if (numM4844a0 != null) {
            return numM4844a0.intValue();
        }
        C3386nv.m17626m(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie5)) {
            return false;
        }
        ie5 ie5Var = (ie5) obj;
        return fa4.m11650l(this.f44018a, ie5Var.f44018a) && fa4.m11650l(this.f44019b, ie5Var.f44019b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return hl9.f42583A;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        if (i >= 0) {
            return EmptyList.f47638a;
        }
        C3386nv.m17624j(ux5.m22989l("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.f44019b.hashCode() + ((this.f44018a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f44018a;
        }
        if (i2 == 1) {
            return this.f44019b;
        }
        C3386nv.m17633t("Unreached");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        if (i >= 0) {
            return false;
        }
        C3386nv.m17624j(ux5.m22989l("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f44018a + ", " + this.f44019b + ')';
    }
}
