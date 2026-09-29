package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class yj1 {

    /* JADX INFO: renamed from: a */
    public final Uri f69902a;

    /* JADX INFO: renamed from: b */
    public final boolean f69903b;

    public yj1(boolean z, Uri uri) {
        this.f69902a = uri;
        this.f69903b = z;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m25159a() {
        return this.f69902a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25160b() {
        return this.f69903b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yj1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yj1 yj1Var = (yj1) obj;
        return this.f69902a.equals(yj1Var.f69902a) && this.f69903b == yj1Var.f69903b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69903b) + (this.f69902a.hashCode() * 31);
    }
}
