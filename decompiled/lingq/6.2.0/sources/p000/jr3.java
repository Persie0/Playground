package p000;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class jr3 {

    /* JADX INFO: renamed from: d */
    public static final ByteString f46031d;

    /* JADX INFO: renamed from: e */
    public static final ByteString f46032e;

    /* JADX INFO: renamed from: f */
    public static final ByteString f46033f;

    /* JADX INFO: renamed from: g */
    public static final ByteString f46034g;

    /* JADX INFO: renamed from: h */
    public static final ByteString f46035h;

    /* JADX INFO: renamed from: i */
    public static final ByteString f46036i;

    /* JADX INFO: renamed from: a */
    public final ByteString f46037a;

    /* JADX INFO: renamed from: b */
    public final ByteString f46038b;

    /* JADX INFO: renamed from: c */
    public final int f46039c;

    static {
        ByteString byteString = ByteString.f54513d;
        f46031d = iy5.m14193h(":");
        f46032e = iy5.m14193h(":status");
        f46033f = iy5.m14193h(":method");
        f46034g = iy5.m14193h(":path");
        f46035h = iy5.m14193h(":scheme");
        f46036i = iy5.m14193h(":authority");
    }

    public jr3(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.f46037a = byteString;
        this.f46038b = byteString2;
        this.f46039c = byteString2.mo18078d() + byteString.mo18078d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr3)) {
            return false;
        }
        jr3 jr3Var = (jr3) obj;
        return fa4.m11650l(this.f46037a, jr3Var.f46037a) && fa4.m11650l(this.f46038b, jr3Var.f46038b);
    }

    public final int hashCode() {
        return this.f46038b.hashCode() + (this.f46037a.hashCode() * 31);
    }

    public final String toString() {
        return this.f46037a.m18089r() + ": " + this.f46038b.m18089r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jr3(String str, String str2) {
        this(iy5.m14193h(str), iy5.m14193h(str2));
        ByteString byteString = ByteString.f54513d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jr3(ByteString byteString, String str) {
        this(byteString, iy5.m14193h(str));
        byteString.getClass();
        str.getClass();
        ByteString byteString2 = ByteString.f54513d;
    }
}
