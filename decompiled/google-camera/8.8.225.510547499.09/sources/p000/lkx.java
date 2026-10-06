package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkx {

    /* JADX INFO: renamed from: a */
    private final lgp f38521a;

    public lkx() {
    }

    public lkx(lgp lgpVar) {
        this.f38521a = lgpVar;
    }

    /* JADX INFO: renamed from: a */
    public static lkx m15676a(Activity activity) {
        return new lkx(new lgp(activity.getClass().getName()));
    }

    /* JADX INFO: renamed from: b */
    public final String m15677b() {
        return this.f38521a.f38223a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lkx) && m15677b().equals(((lkx) obj).m15677b());
    }

    public final int hashCode() {
        return (m15677b().hashCode() * 31) ^ 1231;
    }

    public final String toString() {
        return "MeasurementKey{rawStringEventName=null, noPiiEventName=" + this.f38521a.f38223a + ", isActivity=true}";
    }
}
