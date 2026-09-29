package p000;

import android.content.Context;

/* JADX INFO: renamed from: zh */
/* JADX INFO: loaded from: classes.dex */
public final class C3833zh {

    /* JADX INFO: renamed from: a */
    public final Context f71564a;

    /* JADX INFO: renamed from: b */
    public final fb2 f71565b;

    /* JADX INFO: renamed from: c */
    public final long f71566c;

    /* JADX INFO: renamed from: d */
    public final t17 f71567d;

    public C3833zh(Context context, fb2 fb2Var, long j, t17 t17Var) {
        this.f71564a = context;
        this.f71565b = fb2Var;
        this.f71566c = j;
        this.f71567d = t17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3833zh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C3833zh c3833zh = (C3833zh) obj;
        return fa4.m11650l(this.f71564a, c3833zh.f71564a) && fa4.m11650l(this.f71565b, c3833zh.f71565b) && aa1.m199c(this.f71566c, c3833zh.f71566c) && fa4.m11650l(this.f71567d, c3833zh.f71567d);
    }

    public final int hashCode() {
        int iHashCode = (this.f71565b.hashCode() + (this.f71564a.hashCode() * 31)) * 31;
        int i = aa1.f413l;
        return this.f71567d.hashCode() + ux5.m22981d(this.f71566c, iHashCode, 31);
    }
}
