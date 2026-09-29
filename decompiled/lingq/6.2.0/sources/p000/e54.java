package p000;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class e54 extends bg7 {

    /* JADX INFO: renamed from: l */
    public final boolean f36724l;

    public e54(String str, f54 f54Var) {
        super(str, f54Var, 1);
        this.f36724l = true;
    }

    @Override // p000.bg7
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e54) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f8502a.equals(serialDescriptor.mo3694a())) {
                e54 e54Var = (e54) obj;
                if (e54Var.f36724l && Arrays.equals((SerialDescriptor[]) this.f8511j.getValue(), (SerialDescriptor[]) e54Var.f8511j.getValue())) {
                    int iMo3697e = serialDescriptor.mo3697e();
                    int i = this.f8504c;
                    if (i == iMo3697e) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (fa4.m11650l(mo3700i(i2).mo3694a(), serialDescriptor.mo3700i(i2).mo3694a()) && fa4.m11650l(mo3700i(i2).getKind(), serialDescriptor.mo3700i(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final boolean mo10855g() {
        return this.f36724l;
    }

    @Override // p000.bg7
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
