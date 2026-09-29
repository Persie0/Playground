package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7744c extends AbstractC7743b0.a {

    /* JADX INFO: renamed from: a */
    public final int f42523a;

    /* JADX INFO: renamed from: b */
    public final String f42524b;

    /* JADX INFO: renamed from: c */
    public final int f42525c;

    /* JADX INFO: renamed from: d */
    public final int f42526d;

    /* JADX INFO: renamed from: e */
    public final long f42527e;

    /* JADX INFO: renamed from: f */
    public final long f42528f;

    /* JADX INFO: renamed from: g */
    public final long f42529g;

    /* JADX INFO: renamed from: h */
    public final String f42530h;

    /* JADX INFO: renamed from: i */
    public final C7745c0<AbstractC7743b0.a.AbstractC10653a> f42531i;

    /* JADX INFO: renamed from: ne.c$a */
    public static final class a extends AbstractC7743b0.a.b {

        /* JADX INFO: renamed from: a */
        public Integer f42532a;

        /* JADX INFO: renamed from: b */
        public String f42533b;

        /* JADX INFO: renamed from: c */
        public Integer f42534c;

        /* JADX INFO: renamed from: d */
        public Integer f42535d;

        /* JADX INFO: renamed from: e */
        public Long f42536e;

        /* JADX INFO: renamed from: f */
        public Long f42537f;

        /* JADX INFO: renamed from: g */
        public Long f42538g;

        /* JADX INFO: renamed from: h */
        public String f42539h;

        /* JADX INFO: renamed from: i */
        public C7745c0<AbstractC7743b0.a.AbstractC10653a> f42540i;

        /* JADX INFO: renamed from: a */
        public final C7744c m15445a() {
            String strM765k = this.f42532a == null ? " pid" : "";
            if (this.f42533b == null) {
                strM765k = strM765k.concat(" processName");
            }
            if (this.f42534c == null) {
                strM765k = C0166e.m765k(strM765k, " reasonCode");
            }
            if (this.f42535d == null) {
                strM765k = C0166e.m765k(strM765k, " importance");
            }
            if (this.f42536e == null) {
                strM765k = C0166e.m765k(strM765k, " pss");
            }
            if (this.f42537f == null) {
                strM765k = C0166e.m765k(strM765k, " rss");
            }
            if (this.f42538g == null) {
                strM765k = C0166e.m765k(strM765k, " timestamp");
            }
            if (strM765k.isEmpty()) {
                return new C7744c(this.f42532a.intValue(), this.f42533b, this.f42534c.intValue(), this.f42535d.intValue(), this.f42536e.longValue(), this.f42537f.longValue(), this.f42538g.longValue(), this.f42539h, this.f42540i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7744c() {
        throw null;
    }

    public C7744c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, C7745c0 c7745c0) {
        this.f42523a = i10;
        this.f42524b = str;
        this.f42525c = i11;
        this.f42526d = i12;
        this.f42527e = j10;
        this.f42528f = j11;
        this.f42529g = j12;
        this.f42530h = str2;
        this.f42531i = c7745c0;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.a.AbstractC10653a> mo15350a() {
        return this.f42531i;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: b */
    public final int mo15351b() {
        return this.f42526d;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: c */
    public final int mo15352c() {
        return this.f42523a;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: d */
    public final String mo15353d() {
        return this.f42524b;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: e */
    public final long mo15354e() {
        return this.f42527e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        C7745c0<AbstractC7743b0.a.AbstractC10653a> c7745c0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.a)) {
            return false;
        }
        AbstractC7743b0.a aVar = (AbstractC7743b0.a) obj;
        if (this.f42523a == aVar.mo15352c() && this.f42524b.equals(aVar.mo15353d()) && this.f42525c == aVar.mo15355f() && this.f42526d == aVar.mo15351b() && this.f42527e == aVar.mo15354e() && this.f42528f == aVar.mo15356g() && this.f42529g == aVar.mo15357h()) {
            String str = this.f42530h;
            if (str == null) {
                if (aVar.mo15358i() == null) {
                    c7745c0 = this.f42531i;
                    if (c7745c0 == null) {
                        if (aVar.mo15350a() == null) {
                            return true;
                        }
                    } else if (c7745c0.equals(aVar.mo15350a())) {
                        return true;
                    }
                }
            } else if (str.equals(aVar.mo15358i())) {
                c7745c0 = this.f42531i;
                if (c7745c0 == null) {
                    if (aVar.mo15350a() == null) {
                        return true;
                    }
                } else if (c7745c0.equals(aVar.mo15350a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: f */
    public final int mo15355f() {
        return this.f42525c;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: g */
    public final long mo15356g() {
        return this.f42528f;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: h */
    public final long mo15357h() {
        return this.f42529g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f42523a ^ 1000003) * 1000003) ^ this.f42524b.hashCode()) * 1000003) ^ this.f42525c) * 1000003) ^ this.f42526d) * 1000003;
        long j10 = this.f42527e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f42528f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f42529g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int iHashCode2 = 0;
        String str = this.f42530h;
        int iHashCode3 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C7745c0<AbstractC7743b0.a.AbstractC10653a> c7745c0 = this.f42531i;
        if (c7745c0 != null) {
            iHashCode2 = c7745c0.hashCode();
        }
        return iHashCode3 ^ iHashCode2;
    }

    @Override // ne.AbstractC7743b0.a
    /* JADX INFO: renamed from: i */
    public final String mo15358i() {
        return this.f42530h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f42523a + ", processName=" + this.f42524b + ", reasonCode=" + this.f42525c + ", importance=" + this.f42526d + ", pss=" + this.f42527e + ", rss=" + this.f42528f + ", timestamp=" + this.f42529g + ", traceFile=" + this.f42530h + ", buildIdMappingForArch=" + this.f42531i + "}";
    }
}
