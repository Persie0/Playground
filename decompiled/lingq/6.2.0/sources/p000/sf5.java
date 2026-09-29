package p000;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf5 implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f60792a;

    public sf5(SerialDescriptor serialDescriptor) {
        this.f60792a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo3696d(String str) {
        str.getClass();
        Integer numM4844a0 = cl9.m4844a0(str);
        if (numM4844a0 != null) {
            return numM4844a0.intValue();
        }
        C3386nv.m17626m(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo3697e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf5)) {
            return false;
        }
        sf5 sf5Var = (sf5) obj;
        return fa4.m11650l(this.f60792a, sf5Var.f60792a) && fa4.m11650l(mo3694a(), sf5Var.mo3694a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo3698f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return hl9.f42586z;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final List mo3699h(int i) {
        if (i >= 0) {
            return EmptyList.f47638a;
        }
        v63.m23139q(ux5.m22998u("Illegal index ", i, ", "), mo3694a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return mo3694a().hashCode() + (this.f60792a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        if (i >= 0) {
            return this.f60792a;
        }
        v63.m23139q(ux5.m22998u("Illegal index ", i, ", "), mo3694a(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: j */
    public final boolean mo3701j(int i) {
        if (i >= 0) {
            return false;
        }
        v63.m23139q(ux5.m22998u("Illegal index ", i, ", "), mo3694a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return mo3694a() + '(' + this.f60792a + ')';
    }
}
