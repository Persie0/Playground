package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7763t extends AbstractC7743b0.e.d.c {

    /* JADX INFO: renamed from: a */
    public final Double f42652a;

    /* JADX INFO: renamed from: b */
    public final int f42653b;

    /* JADX INFO: renamed from: c */
    public final boolean f42654c;

    /* JADX INFO: renamed from: d */
    public final int f42655d;

    /* JADX INFO: renamed from: e */
    public final long f42656e;

    /* JADX INFO: renamed from: f */
    public final long f42657f;

    /* JADX INFO: renamed from: ne.t$a */
    public static final class a extends AbstractC7743b0.e.d.c.a {

        /* JADX INFO: renamed from: a */
        public Double f42658a;

        /* JADX INFO: renamed from: b */
        public Integer f42659b;

        /* JADX INFO: renamed from: c */
        public Boolean f42660c;

        /* JADX INFO: renamed from: d */
        public Integer f42661d;

        /* JADX INFO: renamed from: e */
        public Long f42662e;

        /* JADX INFO: renamed from: f */
        public Long f42663f;

        /* JADX INFO: renamed from: a */
        public final C7763t m15470a() {
            String strM765k = this.f42659b == null ? " batteryVelocity" : "";
            if (this.f42660c == null) {
                strM765k = strM765k.concat(" proximityOn");
            }
            if (this.f42661d == null) {
                strM765k = C0166e.m765k(strM765k, " orientation");
            }
            if (this.f42662e == null) {
                strM765k = C0166e.m765k(strM765k, " ramUsed");
            }
            if (this.f42663f == null) {
                strM765k = C0166e.m765k(strM765k, " diskUsed");
            }
            if (strM765k.isEmpty()) {
                return new C7763t(this.f42658a, this.f42659b.intValue(), this.f42660c.booleanValue(), this.f42661d.intValue(), this.f42662e.longValue(), this.f42663f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7763t(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f42652a = d10;
        this.f42653b = i10;
        this.f42654c = z10;
        this.f42655d = i11;
        this.f42656e = j10;
        this.f42657f = j11;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: a */
    public final Double mo15433a() {
        return this.f42652a;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: b */
    public final int mo15434b() {
        return this.f42653b;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: c */
    public final long mo15435c() {
        return this.f42657f;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: d */
    public final int mo15436d() {
        return this.f42655d;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: e */
    public final long mo15437e() {
        return this.f42656e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.c)) {
            return false;
        }
        AbstractC7743b0.e.d.c cVar = (AbstractC7743b0.e.d.c) obj;
        Double d10 = this.f42652a;
        if (d10 == null) {
            if (cVar.mo15433a() == null) {
                if (this.f42653b == cVar.mo15434b() && this.f42654c == cVar.mo15438f() && this.f42655d == cVar.mo15436d() && this.f42656e == cVar.mo15437e() && this.f42657f == cVar.mo15435c()) {
                    return true;
                }
            }
        } else if (d10.equals(cVar.mo15433a())) {
            if (this.f42653b == cVar.mo15434b()) {
                return true;
            }
        }
        return false;
    }

    @Override // ne.AbstractC7743b0.e.d.c
    /* JADX INFO: renamed from: f */
    public final boolean mo15438f() {
        return this.f42654c;
    }

    public final int hashCode() {
        Double d10 = this.f42652a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f42653b) * 1000003) ^ (this.f42654c ? 1231 : 1237)) * 1000003) ^ this.f42655d) * 1000003;
        long j10 = this.f42656e;
        long j11 = this.f42657f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f42652a + ", batteryVelocity=" + this.f42653b + ", proximityOn=" + this.f42654c + ", orientation=" + this.f42655d + ", ramUsed=" + this.f42656e + ", diskUsed=" + this.f42657f + "}";
    }
}
