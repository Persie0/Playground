package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biz {

    /* JADX INFO: renamed from: a */
    public Object f3469a;

    /* JADX INFO: renamed from: b */
    public Object f3470b;

    /* JADX INFO: renamed from: a */
    private static boolean m2523a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aecVar = (aec) obj;
        Object obj2 = aecVar.f247a;
        return m2523a(null, this.f3469a) && m2523a(aecVar.f248b, this.f3470b);
    }

    public final int hashCode() {
        Object obj = this.f3469a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3470b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f3469a) + " " + String.valueOf(this.f3470b) + HRLmc.yVhbULRzYeaX;
    }
}
