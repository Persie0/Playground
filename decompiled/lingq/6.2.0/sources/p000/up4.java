package p000;

/* JADX INFO: loaded from: classes.dex */
public final class up4 {

    /* JADX INFO: renamed from: a */
    public static final up4 f64170a;

    static {
        up4 up4Var = new up4();
        if (xj2.m24559a(0.0f, 0.0f) < 0 || xj2.m24559a(0.0f, 0.0f) < 0 || xj2.m24559a(0.0f, 0.0f) < 0 || xj2.m24559a(0.0f, 0.0f) < 0) {
            h54.m13056a("Layer outsets must be non-negative");
        }
        f64170a = up4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up4) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f) && xj2.m24560b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + wq1.m24105a(wq1.m24105a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    public final String toString() {
        return "LayerOutsets(left=" + ((Object) xj2.m24561c(0.0f)) + ", top=" + ((Object) xj2.m24561c(0.0f)) + ", right=" + ((Object) xj2.m24561c(0.0f)) + ", bottom=" + ((Object) xj2.m24561c(0.0f)) + ')';
    }
}
