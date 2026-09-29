package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7762s extends AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a {

    /* JADX INFO: renamed from: a */
    public final long f42642a;

    /* JADX INFO: renamed from: b */
    public final String f42643b;

    /* JADX INFO: renamed from: c */
    public final String f42644c;

    /* JADX INFO: renamed from: d */
    public final long f42645d;

    /* JADX INFO: renamed from: e */
    public final int f42646e;

    /* JADX INFO: renamed from: ne.s$a */
    public static final class a extends AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a.AbstractC10661a {

        /* JADX INFO: renamed from: a */
        public Long f42647a;

        /* JADX INFO: renamed from: b */
        public String f42648b;

        /* JADX INFO: renamed from: c */
        public String f42649c;

        /* JADX INFO: renamed from: d */
        public Long f42650d;

        /* JADX INFO: renamed from: e */
        public Integer f42651e;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C7762s m15469a() {
            String strM765k = this.f42647a == null ? " pc" : "";
            if (this.f42648b == null) {
                strM765k = strM765k.concat(" symbol");
            }
            if (this.f42650d == null) {
                strM765k = C0166e.m765k(strM765k, " offset");
            }
            if (this.f42651e == null) {
                strM765k = C0166e.m765k(strM765k, " importance");
            }
            if (strM765k.isEmpty()) {
                return new C7762s(this.f42647a.longValue(), this.f42648b, this.f42649c, this.f42650d.longValue(), this.f42651e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7762s(long j10, String str, String str2, long j11, int i10) {
        this.f42642a = j10;
        this.f42643b = str;
        this.f42644c = str2;
        this.f42645d = j11;
        this.f42646e = i10;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a
    /* JADX INFO: renamed from: a */
    public final String mo15428a() {
        return this.f42644c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a
    /* JADX INFO: renamed from: b */
    public final int mo15429b() {
        return this.f42646e;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a
    /* JADX INFO: renamed from: c */
    public final long mo15430c() {
        return this.f42645d;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a
    /* JADX INFO: renamed from: d */
    public final long mo15431d() {
        return this.f42642a;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a
    /* JADX INFO: renamed from: e */
    public final String mo15432e() {
        return this.f42643b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a abstractC10660a = (AbstractC7743b0.e.d.a.b.AbstractC10659d.AbstractC10660a) obj;
        return this.f42642a == abstractC10660a.mo15431d() && this.f42643b.equals(abstractC10660a.mo15432e()) && ((str = this.f42644c) != null ? str.equals(abstractC10660a.mo15428a()) : abstractC10660a.mo15428a() == null) && this.f42645d == abstractC10660a.mo15430c() && this.f42646e == abstractC10660a.mo15429b();
    }

    public final int hashCode() {
        long j10 = this.f42642a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f42643b.hashCode()) * 1000003;
        String str = this.f42644c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f42645d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42646e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f42642a);
        sb2.append(", symbol=");
        sb2.append(this.f42643b);
        sb2.append(", file=");
        sb2.append(this.f42644c);
        sb2.append(", offset=");
        sb2.append(this.f42645d);
        sb2.append(", importance=");
        return C0166e.m768o(sb2, this.f42646e, "}");
    }
}
