package p542zo;

import dm.C5207g;
import okio.ByteString;

/* JADX INFO: renamed from: zo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10559a {

    /* JADX INFO: renamed from: d */
    public static final ByteString f52629d;

    /* JADX INFO: renamed from: e */
    public static final ByteString f52630e;

    /* JADX INFO: renamed from: f */
    public static final ByteString f52631f;

    /* JADX INFO: renamed from: g */
    public static final ByteString f52632g;

    /* JADX INFO: renamed from: h */
    public static final ByteString f52633h;

    /* JADX INFO: renamed from: i */
    public static final ByteString f52634i;

    /* JADX INFO: renamed from: a */
    public final ByteString f52635a;

    /* JADX INFO: renamed from: b */
    public final ByteString f52636b;

    /* JADX INFO: renamed from: c */
    public final int f52637c;

    static {
        ByteString byteString = ByteString.f43897d;
        f52629d = ByteString.C8082a.m16001c(":");
        f52630e = ByteString.C8082a.m16001c(":status");
        f52631f = ByteString.C8082a.m16001c(":method");
        f52632g = ByteString.C8082a.m16001c(":path");
        f52633h = ByteString.C8082a.m16001c(":scheme");
        f52634i = ByteString.C8082a.m16001c(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10559a(String str, String str2) {
        this(ByteString.C8082a.m16001c(str), ByteString.C8082a.m16001c(str2));
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "value");
        ByteString byteString = ByteString.f43897d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10559a(ByteString byteString, String str) {
        this(byteString, ByteString.C8082a.m16001c(str));
        C5207g.m11111f(byteString, "name");
        C5207g.m11111f(str, "value");
        ByteString byteString2 = ByteString.f43897d;
    }

    public C10559a(ByteString byteString, ByteString byteString2) {
        C5207g.m11111f(byteString, "name");
        C5207g.m11111f(byteString2, "value");
        this.f52635a = byteString;
        this.f52636b = byteString2;
        this.f52637c = byteString2.mo15992q() + byteString.mo15992q() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10559a)) {
            return false;
        }
        C10559a c10559a = (C10559a) obj;
        if (C5207g.m11106a(this.f52635a, c10559a.f52635a) && C5207g.m11106a(this.f52636b, c10559a.f52636b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52636b.hashCode() + (this.f52635a.hashCode() * 31);
    }

    public final String toString() {
        return this.f52635a.m15988A() + ": " + this.f52636b.m15988A();
    }
}
