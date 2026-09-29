package ua;

import java.util.Arrays;

/* JADX INFO: renamed from: ua.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9506o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9505n[] f48923a;

    /* JADX INFO: renamed from: b */
    public int f48924b;

    public C9506o(InterfaceC9505n... interfaceC9505nArr) {
        this.f48923a = interfaceC9505nArr;
        int length = interfaceC9505nArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9506o.class == obj.getClass()) {
            return Arrays.equals(this.f48923a, ((C9506o) obj).f48923a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f48924b == 0) {
            this.f48924b = 527 + Arrays.hashCode(this.f48923a);
        }
        return this.f48924b;
    }
}
