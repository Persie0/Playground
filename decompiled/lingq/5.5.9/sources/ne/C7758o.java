package ne;

import android.support.v4.media.session.C0166e;
import p003a2.C0009a;

/* JADX INFO: renamed from: ne.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7758o extends AbstractC7743b0.e.d.a.b.AbstractC10656a {

    /* JADX INFO: renamed from: a */
    public final long f42623a;

    /* JADX INFO: renamed from: b */
    public final long f42624b;

    /* JADX INFO: renamed from: c */
    public final String f42625c;

    /* JADX INFO: renamed from: d */
    public final String f42626d;

    /* JADX INFO: renamed from: ne.o$a */
    public static final class a extends AbstractC7743b0.e.d.a.b.AbstractC10656a.AbstractC10657a {

        /* JADX INFO: renamed from: a */
        public Long f42627a;

        /* JADX INFO: renamed from: b */
        public Long f42628b;

        /* JADX INFO: renamed from: c */
        public String f42629c;

        /* JADX INFO: renamed from: d */
        public String f42630d;

        /* JADX INFO: renamed from: a */
        public final C7758o m15468a() {
            String strM765k = this.f42627a == null ? " baseAddress" : "";
            if (this.f42628b == null) {
                strM765k = strM765k.concat(" size");
            }
            if (this.f42629c == null) {
                strM765k = C0166e.m765k(strM765k, " name");
            }
            if (strM765k.isEmpty()) {
                return new C7758o(this.f42627a.longValue(), this.f42628b.longValue(), this.f42629c, this.f42630d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7758o(long j10, long j11, String str, String str2) {
        this.f42623a = j10;
        this.f42624b = j11;
        this.f42625c = str;
        this.f42626d = str2;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10656a
    /* JADX INFO: renamed from: a */
    public final long mo15413a() {
        return this.f42623a;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10656a
    /* JADX INFO: renamed from: b */
    public final String mo15414b() {
        return this.f42625c;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10656a
    /* JADX INFO: renamed from: c */
    public final long mo15415c() {
        return this.f42624b;
    }

    @Override // ne.AbstractC7743b0.e.d.a.b.AbstractC10656a
    /* JADX INFO: renamed from: d */
    public final String mo15416d() {
        return this.f42626d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.d.a.b.AbstractC10656a)) {
            return false;
        }
        AbstractC7743b0.e.d.a.b.AbstractC10656a abstractC10656a = (AbstractC7743b0.e.d.a.b.AbstractC10656a) obj;
        if (this.f42623a == abstractC10656a.mo15413a() && this.f42624b == abstractC10656a.mo15415c() && this.f42625c.equals(abstractC10656a.mo15414b())) {
            String str = this.f42626d;
            if (str == null) {
                if (abstractC10656a.mo15416d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC10656a.mo15416d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f42623a;
        long j11 = this.f42624b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42625c.hashCode()) * 1000003;
        String str = this.f42626d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f42623a);
        sb2.append(", size=");
        sb2.append(this.f42624b);
        sb2.append(", name=");
        sb2.append(this.f42625c);
        sb2.append(", uuid=");
        return C0009a.m23l(sb2, this.f42626d, "}");
    }
}
