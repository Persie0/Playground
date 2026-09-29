package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bc3 implements Comparable {

    /* JADX INFO: renamed from: H */
    public static final List f8315H;

    /* JADX INFO: renamed from: b */
    public static final bc3 f8316b;

    /* JADX INFO: renamed from: c */
    public static final bc3 f8317c;

    /* JADX INFO: renamed from: d */
    public static final bc3 f8318d;

    /* JADX INFO: renamed from: e */
    public static final bc3 f8319e;

    /* JADX INFO: renamed from: f */
    public static final bc3 f8320f;

    /* JADX INFO: renamed from: g */
    public static final bc3 f8321g;

    /* JADX INFO: renamed from: h */
    public static final bc3 f8322h;

    /* JADX INFO: renamed from: i */
    public static final bc3 f8323i;

    /* JADX INFO: renamed from: j */
    public static final bc3 f8324j;

    /* JADX INFO: renamed from: k */
    public static final bc3 f8325k;

    /* JADX INFO: renamed from: l */
    public static final bc3 f8326l;

    /* JADX INFO: renamed from: a */
    public final int f8327a;

    static {
        bc3 bc3Var = new bc3(100);
        bc3 bc3Var2 = new bc3(200);
        bc3 bc3Var3 = new bc3(300);
        bc3 bc3Var4 = new bc3(400);
        f8316b = bc3Var4;
        bc3 bc3Var5 = new bc3(500);
        f8317c = bc3Var5;
        bc3 bc3Var6 = new bc3(600);
        f8318d = bc3Var6;
        bc3 bc3Var7 = new bc3(700);
        bc3 bc3Var8 = new bc3(800);
        bc3 bc3Var9 = new bc3(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
        f8319e = bc3Var;
        f8320f = bc3Var3;
        f8321g = bc3Var4;
        f8322h = bc3Var5;
        f8323i = bc3Var6;
        f8324j = bc3Var7;
        f8325k = bc3Var8;
        f8326l = bc3Var9;
        f8315H = vz1.m23605K(bc3Var, bc3Var2, bc3Var3, bc3Var4, bc3Var5, bc3Var6, bc3Var7, bc3Var8, bc3Var9);
    }

    public bc3(int i) {
        this.f8327a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        j54.m14288a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(bc3 bc3Var) {
        return fa4.m11651m(this.f8327a, bc3Var.f8327a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bc3) {
            return this.f8327a == ((bc3) obj).f8327a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8327a;
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("FontWeight(weight="), this.f8327a, ')');
    }
}
