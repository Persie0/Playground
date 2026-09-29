package p411u9;

import android.support.v4.media.C0141b;
import java.nio.ByteBuffer;
import java.util.UUID;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: u9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9485h {

    /* JADX INFO: renamed from: u9.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final UUID f48718a;

        /* JADX INFO: renamed from: b */
        public final int f48719b;

        /* JADX INFO: renamed from: c */
        public final byte[] f48720c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f48718a = uuid;
            this.f48719b = i10;
            this.f48720c = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m17927a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    public static a m17928b(byte[] bArr) {
        C10151t c10151t = new C10151t(bArr);
        if (c10151t.f51440c < 32) {
            return null;
        }
        c10151t.m19124E(0);
        if (c10151t.m19129d() == (c10151t.f51440c - c10151t.f51439b) + 4 && c10151t.m19129d() == 1886614376) {
            int iM19129d = (c10151t.m19129d() >> 24) & 255;
            if (iM19129d > 1) {
                C0141b.m620p("Unsupported pssh version: ", iM19129d, "PsshAtomUtil");
                return null;
            }
            UUID uuid = new UUID(c10151t.m19138m(), c10151t.m19138m());
            if (iM19129d == 1) {
                c10151t.m19125F(c10151t.m19148w() * 16);
            }
            int iM19148w = c10151t.m19148w();
            if (iM19148w != c10151t.f51440c - c10151t.f51439b) {
                return null;
            }
            byte[] bArr2 = new byte[iM19148w];
            c10151t.m19127b(bArr2, 0, iM19148w);
            return new a(uuid, iM19129d, bArr2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m17929c(UUID uuid, byte[] bArr) {
        a aVarM17928b = m17928b(bArr);
        if (aVarM17928b == null) {
            return null;
        }
        UUID uuid2 = aVarM17928b.f48718a;
        if (uuid.equals(uuid2)) {
            return aVarM17928b.f48720c;
        }
        C10145n.m19099g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
