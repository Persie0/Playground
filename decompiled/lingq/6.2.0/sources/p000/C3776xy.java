package p000;

import java.util.Objects;

/* JADX INFO: renamed from: xy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3776xy {

    /* JADX INFO: renamed from: a */
    public final int f68936a;

    /* JADX INFO: renamed from: b */
    public final int f68937b;

    /* JADX INFO: renamed from: c */
    public final int f68938c;

    /* JADX INFO: renamed from: d */
    public final boolean f68939d;

    /* JADX INFO: renamed from: e */
    public final boolean f68940e;

    /* JADX INFO: renamed from: f */
    public final int f68941f;

    /* JADX INFO: renamed from: g */
    public final C3476px f68942g;

    /* JADX INFO: renamed from: h */
    public final int f68943h;

    /* JADX INFO: renamed from: i */
    public final int f68944i;

    /* JADX INFO: renamed from: j */
    public final boolean f68945j;

    /* JADX INFO: renamed from: k */
    public final boolean f68946k;

    public C3776xy(C3739wy c3739wy) {
        this.f68936a = c3739wy.f67492a;
        this.f68937b = c3739wy.f67493b;
        this.f68938c = c3739wy.f67494c;
        this.f68939d = c3739wy.f67495d;
        this.f68940e = c3739wy.f67496e;
        this.f68941f = c3739wy.f67497f;
        this.f68942g = c3739wy.f67498g;
        this.f68943h = c3739wy.f67499h;
        this.f68944i = c3739wy.f67500i;
        this.f68945j = c3739wy.f67501j;
        this.f68946k = c3739wy.f67502k;
    }

    /* JADX INFO: renamed from: a */
    public final C3739wy m24792a() {
        C3739wy c3739wy = new C3739wy();
        c3739wy.f67492a = this.f68936a;
        c3739wy.f67493b = this.f68937b;
        c3739wy.f67494c = this.f68938c;
        c3739wy.f67495d = this.f68939d;
        c3739wy.f67496e = this.f68940e;
        c3739wy.f67497f = this.f68941f;
        c3739wy.f67498g = this.f68942g;
        c3739wy.f67499h = this.f68943h;
        c3739wy.f67500i = this.f68944i;
        c3739wy.f67501j = this.f68945j;
        c3739wy.f67502k = this.f68946k;
        return c3739wy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3776xy.class != obj.getClass()) {
            return false;
        }
        C3776xy c3776xy = (C3776xy) obj;
        return this.f68936a == c3776xy.f68936a && this.f68937b == c3776xy.f68937b && this.f68938c == c3776xy.f68938c && this.f68939d == c3776xy.f68939d && this.f68940e == c3776xy.f68940e && this.f68941f == c3776xy.f68941f && this.f68943h == c3776xy.f68943h && this.f68944i == c3776xy.f68944i && this.f68945j == c3776xy.f68945j && this.f68946k == c3776xy.f68946k && this.f68942g.equals(c3776xy.f68942g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f68936a), Integer.valueOf(this.f68937b), Integer.valueOf(this.f68938c), Boolean.valueOf(this.f68939d), Boolean.valueOf(this.f68940e), Integer.valueOf(this.f68941f), this.f68942g, Integer.valueOf(this.f68943h), Integer.valueOf(this.f68944i), Boolean.valueOf(this.f68946k), Boolean.valueOf(this.f68945j));
    }
}
