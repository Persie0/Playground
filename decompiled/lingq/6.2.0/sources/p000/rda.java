package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class rda {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f59138d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f59139a;

    /* JADX INFO: renamed from: b */
    public final C3329mb f59140b;

    /* JADX INFO: renamed from: c */
    public volatile int f59141c = 0;

    public rda(C3329mb c3329mb, int i) {
        this.f59140b = c3329mb;
        this.f59139a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m20594a(int i) {
        ky5 ky5VarM20595b = m20595b();
        int iM22869a = ky5VarM20595b.m22869a(16);
        if (iM22869a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ky5VarM20595b.f64232d;
        int i2 = iM22869a + ky5VarM20595b.f64229a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final ky5 m20595b() {
        ThreadLocal threadLocal = f59138d;
        ky5 ky5Var = (ky5) threadLocal.get();
        if (ky5Var == null) {
            ky5Var = new ky5();
            threadLocal.set(ky5Var);
        }
        ly5 ly5Var = (ly5) this.f59140b.f50860b;
        int iM22869a = ly5Var.m22869a(6);
        if (iM22869a != 0) {
            int i = iM22869a + ly5Var.f64229a;
            int i2 = (this.f59139a * 4) + ((ByteBuffer) ly5Var.f64232d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ly5Var.f64232d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ly5Var.f64232d;
            ky5Var.f64232d = byteBuffer;
            if (byteBuffer != null) {
                ky5Var.f64229a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ky5Var.f64230b = i4;
                ky5Var.f64231c = ((ByteBuffer) ky5Var.f64232d).getShort(i4);
                return ky5Var;
            }
            ky5Var.f64229a = 0;
            ky5Var.f64230b = 0;
            ky5Var.f64231c = 0;
        }
        return ky5Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ky5 ky5VarM20595b = m20595b();
        int iM22869a = ky5VarM20595b.m22869a(4);
        sb.append(Integer.toHexString(iM22869a != 0 ? ((ByteBuffer) ky5VarM20595b.f64232d).getInt(iM22869a + ky5VarM20595b.f64229a) : 0));
        sb.append(", codepoints:");
        ky5 ky5VarM20595b2 = m20595b();
        int iM22869a2 = ky5VarM20595b2.m22869a(16);
        if (iM22869a2 != 0) {
            int i2 = iM22869a2 + ky5VarM20595b2.f64229a;
            i = ((ByteBuffer) ky5VarM20595b2.f64232d).getInt(((ByteBuffer) ky5VarM20595b2.f64232d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m20594a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
