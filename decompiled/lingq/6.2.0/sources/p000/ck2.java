package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ck2 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck2) && xj2.m24560b(10.0f, 10.0f) && xj2.m24560b(40.0f, 40.0f) && xj2.m24560b(10.0f, 10.0f) && xj2.m24560b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) xj2.m24561c(10.0f)) + ", top=" + ((Object) xj2.m24561c(40.0f)) + ", end=" + ((Object) xj2.m24561c(10.0f)) + ", bottom=" + ((Object) xj2.m24561c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
