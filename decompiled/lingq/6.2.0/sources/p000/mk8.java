package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mk8 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f51441a;

    /* JADX INFO: renamed from: b */
    public final Object f51442b;

    /* JADX INFO: renamed from: c */
    public mk8 f51443c;

    /* JADX INFO: renamed from: d */
    public mk8 f51444d;

    public mk8(Object obj, Object obj2) {
        this.f51441a = obj;
        this.f51442b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mk8)) {
            return false;
        }
        mk8 mk8Var = (mk8) obj;
        return this.f51441a.equals(mk8Var.f51441a) && this.f51442b.equals(mk8Var.f51442b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f51441a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f51442b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f51442b.hashCode() ^ this.f51441a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f51441a + "=" + this.f51442b;
    }
}
