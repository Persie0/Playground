package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b7b {

    /* JADX INFO: renamed from: c */
    public static final List f8070c;

    /* JADX INFO: renamed from: d */
    public static final List f8071d;

    /* JADX INFO: renamed from: e */
    public static final List f8072e;

    /* JADX INFO: renamed from: a */
    public final int f8073a;

    /* JADX INFO: renamed from: b */
    public final int f8074b;

    static {
        p58 p58Var = new p58(18);
        List listM23605K = vz1.m23605K(0, 600, 840);
        f8070c = listM23605K;
        ArrayList arrayListM22603U0 = u91.m22603U0(vz1.m23605K(1200, 1600), listM23605K);
        List listM23605K2 = vz1.m23605K(0, 480, Integer.valueOf(DescriptorProtos.Edition.EDITION_LEGACY_VALUE));
        f8071d = listM23605K2;
        f8072e = listM23605K2;
        p58.m18899c(p58Var, listM23605K, listM23605K2);
        p58.m18899c(p58Var, arrayListM22603U0, listM23605K2);
    }

    public b7b(int i, int i2) {
        this.f8073a = i;
        this.f8074b = i2;
        if (i < 0) {
            C3386nv.m17624j(wq1.m24114j("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        C3386nv.m17624j(wq1.m24114j("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b7b.class != obj.getClass()) {
            return false;
        }
        b7b b7bVar = (b7b) obj;
        return this.f8073a == b7bVar.f8073a && this.f8074b == b7bVar.f8074b;
    }

    public final int hashCode() {
        return (this.f8073a * 31) + this.f8074b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.f8073a);
        sb.append(", minHeightDp=");
        return wq1.m24122r(sb, this.f8074b, ')');
    }
}
