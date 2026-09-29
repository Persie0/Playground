package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aaa implements z9a {

    /* JADX INFO: renamed from: a */
    public final Object f427a;

    /* JADX INFO: renamed from: b */
    public final Object f428b;

    public aaa(Object obj, Object obj2) {
        this.f427a = obj;
        this.f428b = obj2;
    }

    @Override // p000.z9a
    /* JADX INFO: renamed from: a */
    public final Object mo217a() {
        return this.f427a;
    }

    @Override // p000.z9a
    /* JADX INFO: renamed from: c */
    public final Object mo218c() {
        return this.f428b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z9a)) {
            return false;
        }
        z9a z9aVar = (z9a) obj;
        return fa4.m11650l(this.f427a, z9aVar.mo217a()) && fa4.m11650l(this.f428b, z9aVar.mo218c());
    }

    public final int hashCode() {
        Object obj = this.f427a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f428b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
