package ne;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: ne.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7754k extends AbstractC7743b0.e.c {

    /* JADX INFO: renamed from: a */
    public final int f42580a;

    /* JADX INFO: renamed from: b */
    public final String f42581b;

    /* JADX INFO: renamed from: c */
    public final int f42582c;

    /* JADX INFO: renamed from: d */
    public final long f42583d;

    /* JADX INFO: renamed from: e */
    public final long f42584e;

    /* JADX INFO: renamed from: f */
    public final boolean f42585f;

    /* JADX INFO: renamed from: g */
    public final int f42586g;

    /* JADX INFO: renamed from: h */
    public final String f42587h;

    /* JADX INFO: renamed from: i */
    public final String f42588i;

    /* JADX INFO: renamed from: ne.k$a */
    public static final class a extends AbstractC7743b0.e.c.a {

        /* JADX INFO: renamed from: a */
        public Integer f42589a;

        /* JADX INFO: renamed from: b */
        public String f42590b;

        /* JADX INFO: renamed from: c */
        public Integer f42591c;

        /* JADX INFO: renamed from: d */
        public Long f42592d;

        /* JADX INFO: renamed from: e */
        public Long f42593e;

        /* JADX INFO: renamed from: f */
        public Boolean f42594f;

        /* JADX INFO: renamed from: g */
        public Integer f42595g;

        /* JADX INFO: renamed from: h */
        public String f42596h;

        /* JADX INFO: renamed from: i */
        public String f42597i;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C7754k m15465a() {
            String strM765k = this.f42589a == null ? " arch" : "";
            if (this.f42590b == null) {
                strM765k = strM765k.concat(" model");
            }
            if (this.f42591c == null) {
                strM765k = C0166e.m765k(strM765k, " cores");
            }
            if (this.f42592d == null) {
                strM765k = C0166e.m765k(strM765k, " ram");
            }
            if (this.f42593e == null) {
                strM765k = C0166e.m765k(strM765k, " diskSpace");
            }
            if (this.f42594f == null) {
                strM765k = C0166e.m765k(strM765k, " simulator");
            }
            if (this.f42595g == null) {
                strM765k = C0166e.m765k(strM765k, " state");
            }
            if (this.f42596h == null) {
                strM765k = C0166e.m765k(strM765k, " manufacturer");
            }
            if (this.f42597i == null) {
                strM765k = C0166e.m765k(strM765k, " modelClass");
            }
            if (strM765k.isEmpty()) {
                return new C7754k(this.f42589a.intValue(), this.f42590b, this.f42591c.intValue(), this.f42592d.longValue(), this.f42593e.longValue(), this.f42594f.booleanValue(), this.f42595g.intValue(), this.f42596h, this.f42597i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7754k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f42580a = i10;
        this.f42581b = str;
        this.f42582c = i11;
        this.f42583d = j10;
        this.f42584e = j11;
        this.f42585f = z10;
        this.f42586g = i12;
        this.f42587h = str2;
        this.f42588i = str3;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: a */
    public final int mo15388a() {
        return this.f42580a;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: b */
    public final int mo15389b() {
        return this.f42582c;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: c */
    public final long mo15390c() {
        return this.f42584e;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: d */
    public final String mo15391d() {
        return this.f42587h;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: e */
    public final String mo15392e() {
        return this.f42581b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.c)) {
            return false;
        }
        AbstractC7743b0.e.c cVar = (AbstractC7743b0.e.c) obj;
        return this.f42580a == cVar.mo15388a() && this.f42581b.equals(cVar.mo15392e()) && this.f42582c == cVar.mo15389b() && this.f42583d == cVar.mo15394g() && this.f42584e == cVar.mo15390c() && this.f42585f == cVar.mo15396i() && this.f42586g == cVar.mo15395h() && this.f42587h.equals(cVar.mo15391d()) && this.f42588i.equals(cVar.mo15393f());
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: f */
    public final String mo15393f() {
        return this.f42588i;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: g */
    public final long mo15394g() {
        return this.f42583d;
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: h */
    public final int mo15395h() {
        return this.f42586g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f42580a ^ 1000003) * 1000003) ^ this.f42581b.hashCode()) * 1000003) ^ this.f42582c) * 1000003;
        long j10 = this.f42583d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f42584e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f42585f ? 1231 : 1237)) * 1000003) ^ this.f42586g) * 1000003) ^ this.f42587h.hashCode()) * 1000003) ^ this.f42588i.hashCode();
    }

    @Override // ne.AbstractC7743b0.e.c
    /* JADX INFO: renamed from: i */
    public final boolean mo15396i() {
        return this.f42585f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f42580a);
        sb2.append(", model=");
        sb2.append(this.f42581b);
        sb2.append(", cores=");
        sb2.append(this.f42582c);
        sb2.append(", ram=");
        sb2.append(this.f42583d);
        sb2.append(", diskSpace=");
        sb2.append(this.f42584e);
        sb2.append(", simulator=");
        sb2.append(this.f42585f);
        sb2.append(", state=");
        sb2.append(this.f42586g);
        sb2.append(", manufacturer=");
        sb2.append(this.f42587h);
        sb2.append(", modelClass=");
        return C0009a.m23l(sb2, this.f42588i, "}");
    }
}
