package p000;

import java.util.Map;

/* JADX INFO: renamed from: qq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0939qq implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f47499a;

    /* JADX INFO: renamed from: b */
    public final Object f47500b;

    /* JADX INFO: renamed from: c */
    C0939qq f47501c;

    /* JADX INFO: renamed from: d */
    public C0939qq f47502d;

    public C0939qq(Object obj, Object obj2) {
        this.f47499a = obj;
        this.f47500b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0939qq)) {
            return false;
        }
        C0939qq c0939qq = (C0939qq) obj;
        return this.f47499a.equals(c0939qq.f47499a) && this.f47500b.equals(c0939qq.f47500b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f47499a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f47500b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f47499a.hashCode() ^ this.f47500b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f47499a + "=" + this.f47500b;
    }
}
