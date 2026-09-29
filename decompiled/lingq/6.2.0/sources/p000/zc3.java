package p000;

import java.util.List;
import kotlinx.datetime.format.AbstractC3253d;
import kotlinx.datetime.internal.format.AbstractC3256a;

/* JADX INFO: loaded from: classes3.dex */
public final class zc3 extends AbstractC3256a {

    /* JADX INFO: renamed from: e */
    public static final List f71356e = vz1.m23605K(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: f */
    public static final List f71357f = vz1.m23605K(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* JADX INFO: renamed from: c */
    public final int f71358c;

    /* JADX INFO: renamed from: d */
    public final int f71359d;

    /* JADX WARN: Illegal instructions before constructor call */
    public zc3() {
        List list = f71356e;
        list.getClass();
        super(AbstractC3253d.f48221d, list);
        this.f71358c = 1;
        this.f71359d = 9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zc3)) {
            return false;
        }
        zc3 zc3Var = (zc3) obj;
        return this.f71358c == zc3Var.f71358c && this.f71359d == zc3Var.f71359d;
    }

    public final int hashCode() {
        return (this.f71358c * 31) + this.f71359d;
    }
}
