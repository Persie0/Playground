package p000;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdx {

    /* JADX INFO: renamed from: a */
    public Object f33815a;

    /* JADX INFO: renamed from: b */
    public Object f33816b;

    /* JADX INFO: renamed from: a */
    public final jdy m12952a() {
        if (this.f33816b == null) {
            this.f33816b = new jeu();
        }
        if (this.f33815a == null) {
            this.f33815a = Looper.getMainLooper();
        }
        return new jdy((jeu) this.f33816b, (Looper) this.f33815a);
    }

    /* JADX INFO: renamed from: b */
    public final hnx m12953b() {
        Object obj;
        Object obj2 = this.f33815a;
        if (obj2 != null && (obj = this.f33816b) != null) {
            return new hnx((hnv) obj2, (hnv) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f33815a == null) {
            sb.append(" early");
        }
        if (this.f33816b == null) {
            sb.append(" late");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: c */
    public final void m12954c(hnv hnvVar) {
        if (hnvVar == null) {
            throw new NullPointerException("Null early");
        }
        this.f33815a = hnvVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m12955d(hnv hnvVar) {
        if (hnvVar == null) {
            throw new NullPointerException("Null late");
        }
        this.f33816b = hnvVar;
    }
}
