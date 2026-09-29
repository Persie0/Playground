package p452w8;

import android.support.v4.media.session.C0166e;
import java.util.Map;

/* JADX INFO: renamed from: w8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9827h extends AbstractC9833n {

    /* JADX INFO: renamed from: a */
    public final String f50008a;

    /* JADX INFO: renamed from: b */
    public final Integer f50009b;

    /* JADX INFO: renamed from: c */
    public final C9832m f50010c;

    /* JADX INFO: renamed from: d */
    public final long f50011d;

    /* JADX INFO: renamed from: e */
    public final long f50012e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f50013f;

    /* JADX INFO: renamed from: w8.h$a */
    public static final class a extends AbstractC9833n.a {

        /* JADX INFO: renamed from: a */
        public String f50014a;

        /* JADX INFO: renamed from: b */
        public Integer f50015b;

        /* JADX INFO: renamed from: c */
        public C9832m f50016c;

        /* JADX INFO: renamed from: d */
        public Long f50017d;

        /* JADX INFO: renamed from: e */
        public Long f50018e;

        /* JADX INFO: renamed from: f */
        public Map<String, String> f50019f;

        /* JADX INFO: renamed from: b */
        public final C9827h m18311b() {
            String strM765k = this.f50014a == null ? " transportName" : "";
            if (this.f50016c == null) {
                strM765k = strM765k.concat(" encodedPayload");
            }
            if (this.f50017d == null) {
                strM765k = C0166e.m765k(strM765k, " eventMillis");
            }
            if (this.f50018e == null) {
                strM765k = C0166e.m765k(strM765k, " uptimeMillis");
            }
            if (this.f50019f == null) {
                strM765k = C0166e.m765k(strM765k, " autoMetadata");
            }
            if (strM765k.isEmpty()) {
                return new C9827h(this.f50014a, this.f50015b, this.f50016c, this.f50017d.longValue(), this.f50018e.longValue(), this.f50019f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final a m18312c(C9832m c9832m) {
            if (c9832m == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f50016c = c9832m;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m18313d(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f50014a = str;
            return this;
        }
    }

    public C9827h(String str, Integer num, C9832m c9832m, long j10, long j11, Map map) {
        this.f50008a = str;
        this.f50009b = num;
        this.f50010c = c9832m;
        this.f50011d = j10;
        this.f50012e = j11;
        this.f50013f = map;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: b */
    public final Map<String, String> mo18305b() {
        return this.f50013f;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: c */
    public final Integer mo18306c() {
        return this.f50009b;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: d */
    public final C9832m mo18307d() {
        return this.f50010c;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: e */
    public final long mo18308e() {
        return this.f50011d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9833n)) {
            return false;
        }
        AbstractC9833n abstractC9833n = (AbstractC9833n) obj;
        if (this.f50008a.equals(abstractC9833n.mo18309g())) {
            Integer num = this.f50009b;
            if (num == null) {
                if (abstractC9833n.mo18306c() == null) {
                    if (this.f50010c.equals(abstractC9833n.mo18307d()) && this.f50011d == abstractC9833n.mo18308e() && this.f50012e == abstractC9833n.mo18310h() && this.f50013f.equals(abstractC9833n.mo18305b())) {
                        return true;
                    }
                }
            } else if (num.equals(abstractC9833n.mo18306c())) {
                if (this.f50010c.equals(abstractC9833n.mo18307d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: g */
    public final String mo18309g() {
        return this.f50008a;
    }

    @Override // p452w8.AbstractC9833n
    /* JADX INFO: renamed from: h */
    public final long mo18310h() {
        return this.f50012e;
    }

    public final int hashCode() {
        int iHashCode = (this.f50008a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f50009b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f50010c.hashCode()) * 1000003;
        long j10 = this.f50011d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f50012e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f50013f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f50008a + ", code=" + this.f50009b + ", encodedPayload=" + this.f50010c + ", eventMillis=" + this.f50011d + ", uptimeMillis=" + this.f50012e + ", autoMetadata=" + this.f50013f + "}";
    }
}
