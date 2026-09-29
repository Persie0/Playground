package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zb3 {

    /* JADX INFO: renamed from: a */
    public final List f71299a;

    public zb3(yb3... yb3VarArr) {
        if (yb3VarArr.length <= 0) {
            this.f71299a = AbstractC3550rv.m20852t0(yb3VarArr);
        } else {
            yb3 yb3Var = yb3VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zb3) {
            return fa4.m11650l(this.f71299a, ((zb3) obj).f71299a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f71299a.hashCode();
    }

    public final String toString() {
        return "Settings(settings=" + this.f71299a + ')';
    }
}
