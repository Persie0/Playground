package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nyb extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: a */
    public boolean f44994a;

    public nyb(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* JADX INFO: renamed from: a */
    public static nya m18159a() {
        return new nya();
    }

    /* JADX INFO: renamed from: b */
    public static nyb m18160b() {
        return new nyb("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static nyb m18161c() {
        return new nyb("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static nyb m18162d() {
        return new nyb("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    static nyb m18163e() {
        return new nyb("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: f */
    public static nyb m18164f() {
        return new nyb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: g */
    public static nyb m18165g() {
        return new nyb("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: h */
    static nyb m18166h() {
        return new nyb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: i */
    public static nyb m18167i() {
        return new nyb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: j */
    final void m18168j() {
        this.f44994a = true;
    }

    public nyb(String str) {
        super(str);
    }
}
