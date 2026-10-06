package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axq {

    /* JADX INFO: renamed from: a */
    public final Uri f2676a;

    /* JADX INFO: renamed from: b */
    public final boolean f2677b;

    public axq(Uri uri, boolean z) {
        this.f2676a = uri;
        this.f2677b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ooc.m18737c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        axq axqVar = (axq) obj;
        return ooc.m18737c(this.f2676a, axqVar.f2676a) && this.f2677b == axqVar.f2677b;
    }

    public final int hashCode() {
        return (this.f2676a.hashCode() * 31) + (true != this.f2677b ? 1237 : 1231);
    }
}
