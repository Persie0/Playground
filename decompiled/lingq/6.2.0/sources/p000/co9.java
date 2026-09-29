package p000;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class co9 extends do9 {

    /* JADX INFO: renamed from: d */
    public int[] f10367d;

    /* JADX INFO: renamed from: e */
    public long[] f10368e;

    /* JADX INFO: renamed from: f */
    public double[] f10369f;

    /* JADX INFO: renamed from: g */
    public String[] f10370g;

    /* JADX INFO: renamed from: h */
    public byte[][] f10371h;

    /* JADX INFO: renamed from: i */
    public Cursor f10372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(xg3 xg3Var, String str) {
        super(xg3Var, str);
        xg3Var.getClass();
        str.getClass();
        this.f10367d = new int[0];
        this.f10368e = new long[0];
        this.f10369f = new double[0];
        this.f10370g = new String[0];
        this.f10371h = new byte[0][];
    }

    /* JADX INFO: renamed from: e */
    public static void m4945e(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            AbstractC3695vr.m23485C(25, "column index out of range");
            throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: C */
    public final void mo2874C(int i, String str) {
        str.getClass();
        m10551a();
        m4946b(3, i);
        this.f10367d[i] = 3;
        this.f10370g[i] = str;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: L */
    public final String mo2875L(int i) {
        m10551a();
        Cursor cursorM4948n = m4948n();
        m4945e(cursorM4948n, i);
        String string = cursorM4948n.getString(i);
        string.getClass();
        return string;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: a0 */
    public final boolean mo2876a0() {
        m10551a();
        m4947c();
        Cursor cursor = this.f10372i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        C3386nv.m17633t("Required value was null.");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4946b(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f10367d;
        if (iArr.length < i3) {
            this.f10367d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f10368e;
            if (jArr.length < i3) {
                this.f10368e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f10369f;
            if (dArr.length < i3) {
                this.f10369f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f10370g;
            if (strArr.length < i3) {
                this.f10370g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f10371h;
        if (bArr.length < i3) {
            this.f10371h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4947c() {
        if (this.f10372i == null) {
            this.f10372i = this.f35967a.m24500q(new or3(this));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f35969c) {
            mo3998o();
            reset();
        }
        this.f35969c = true;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: g */
    public final void mo2877g(int i, double d) {
        m10551a();
        m4946b(2, i);
        this.f10367d[i] = 2;
        this.f10369f[i] = d;
    }

    @Override // p000.ik8
    public final byte[] getBlob(int i) {
        m10551a();
        Cursor cursorM4948n = m4948n();
        m4945e(cursorM4948n, i);
        byte[] blob = cursorM4948n.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // p000.ik8
    public final int getColumnCount() {
        m10551a();
        m4947c();
        Cursor cursor = this.f10372i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p000.ik8
    public final String getColumnName(int i) {
        m10551a();
        m4947c();
        Cursor cursor = this.f10372i;
        if (cursor == null) {
            C3386nv.m17633t("Required value was null.");
            return null;
        }
        m4945e(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // p000.ik8
    public final double getDouble(int i) {
        m10551a();
        Cursor cursorM4948n = m4948n();
        m4945e(cursorM4948n, i);
        return cursorM4948n.getDouble(i);
    }

    @Override // p000.ik8
    public final long getLong(int i) {
        m10551a();
        Cursor cursorM4948n = m4948n();
        m4945e(cursorM4948n, i);
        return cursorM4948n.getLong(i);
    }

    @Override // p000.ik8
    public final boolean isNull(int i) {
        m10551a();
        Cursor cursorM4948n = m4948n();
        m4945e(cursorM4948n, i);
        return cursorM4948n.isNull(i);
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: j */
    public final void mo2878j(int i, long j) {
        m10551a();
        m4946b(1, i);
        this.f10367d[i] = 1;
        this.f10368e[i] = j;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: k */
    public final void mo2879k(int i, byte[] bArr) {
        m10551a();
        m4946b(4, i);
        this.f10367d[i] = 4;
        this.f10371h[i] = bArr;
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: m */
    public final void mo2880m(int i) {
        m10551a();
        m4946b(5, i);
        this.f10367d[i] = 5;
    }

    /* JADX INFO: renamed from: n */
    public final Cursor m4948n() {
        Cursor cursor = this.f10372i;
        if (cursor != null) {
            return cursor;
        }
        AbstractC3695vr.m23485C(21, "no row");
        throw null;
    }

    @Override // p000.do9, p000.ik8
    /* JADX INFO: renamed from: o */
    public final void mo3998o() {
        m10551a();
        this.f10367d = new int[0];
        this.f10368e = new long[0];
        this.f10369f = new double[0];
        this.f10370g = new String[0];
        this.f10371h = new byte[0][];
    }

    @Override // p000.do9, p000.ik8
    public final void reset() {
        m10551a();
        Cursor cursor = this.f10372i;
        if (cursor != null) {
            cursor.close();
        }
        this.f10372i = null;
    }
}
