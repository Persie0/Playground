package p000;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class h32 {

    /* JADX INFO: renamed from: a */
    public Parcel f41744a;

    /* JADX INFO: renamed from: a */
    public long m13017a() {
        int i = aa1.f413l;
        long j = this.f41744a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    /* JADX INFO: renamed from: b */
    public long m13018b() {
        long j;
        Parcel parcel = this.f41744a;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return ay9.m3127a(j, 0L) ? zx9.f72359c : d32.m10032c0(parcel.readFloat(), j);
    }

    /* JADX INFO: renamed from: c */
    public void m13019c(byte b) {
        this.f41744a.writeByte(b);
    }

    /* JADX INFO: renamed from: d */
    public void m13020d(float f) {
        this.f41744a.writeFloat(f);
    }

    /* JADX INFO: renamed from: e */
    public void m13021e(long j) {
        long jM25847b = zx9.m25847b(j);
        byte b = 0;
        if (!ay9.m3127a(jM25847b, 0L)) {
            if (ay9.m3127a(jM25847b, 4294967296L)) {
                b = 1;
            } else if (ay9.m3127a(jM25847b, 8589934592L)) {
                b = 2;
            }
        }
        m13019c(b);
        if (ay9.m3127a(zx9.m25847b(j), 0L)) {
            return;
        }
        m13020d(zx9.m25848c(j));
    }
}
