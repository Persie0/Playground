package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xna {

    /* JADX INFO: renamed from: a */
    public final String f68405a;

    /* JADX INFO: renamed from: b */
    public final Object f68406b;

    public xna(Object obj, String str) {
        this.f68405a = str;
        this.f68406b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xna)) {
            return false;
        }
        xna xnaVar = (xna) obj;
        return this.f68405a.equals(xnaVar.f68405a) && fa4.m11650l(this.f68406b, xnaVar.f68406b);
    }

    public final int hashCode() {
        int iHashCode = this.f68405a.hashCode() * 31;
        Object obj = this.f68406b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f68405a + ", value=" + this.f68406b + ')';
    }
}
