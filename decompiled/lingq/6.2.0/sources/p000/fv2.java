package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class fv2 {

    /* JADX INFO: renamed from: a */
    public final int f39732a;

    /* JADX INFO: renamed from: b */
    public final int f39733b;

    /* JADX INFO: renamed from: c */
    public final long f39734c;

    /* JADX INFO: renamed from: d */
    public final byte[] f39735d;

    public fv2(long j, byte[] bArr, int i, int i2) {
        this.f39732a = i;
        this.f39733b = i2;
        this.f39734c = j;
        this.f39735d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static fv2 m12203a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[jv2.f46182E[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new fv2(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static fv2 m12204b(hv2 hv2Var, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[jv2.f46182E[5]]);
        byteBufferWrap.order(byteOrder);
        hv2 hv2Var2 = new hv2[]{hv2Var}[0];
        byteBufferWrap.putInt((int) hv2Var2.f42972a);
        byteBufferWrap.putInt((int) hv2Var2.f42973b);
        return new fv2(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static fv2 m12205c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[jv2.f46182E[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new fv2(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m12206d(ByteOrder byteOrder) throws Throwable {
        Object objM12209g = m12209g(byteOrder);
        if (objM12209g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM12209g instanceof String) {
            return Double.parseDouble((String) objM12209g);
        }
        if (objM12209g instanceof long[]) {
            long[] jArr = (long[]) objM12209g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12209g instanceof int[]) {
            int[] iArr = (int[]) objM12209g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM12209g instanceof double[]) {
            double[] dArr = (double[]) objM12209g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12209g instanceof hv2[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        hv2[] hv2VarArr = (hv2[]) objM12209g;
        if (hv2VarArr.length == 1) {
            return hv2VarArr[0].m13484a();
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: e */
    public final int m12207e(ByteOrder byteOrder) {
        Object objM12209g = m12209g(byteOrder);
        if (objM12209g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM12209g instanceof String) {
            return Integer.parseInt((String) objM12209g);
        }
        if (objM12209g instanceof long[]) {
            long[] jArr = (long[]) objM12209g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM12209g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM12209g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m12208f(ByteOrder byteOrder) throws Throwable {
        Object objM12209g = m12209g(byteOrder);
        if (objM12209g == null) {
            return null;
        }
        if (objM12209g instanceof String) {
            return (String) objM12209g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM12209g instanceof long[]) {
            long[] jArr = (long[]) objM12209g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12209g instanceof int[]) {
            int[] iArr = (int[]) objM12209g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM12209g instanceof double[]) {
            double[] dArr = (double[]) objM12209g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM12209g instanceof hv2[])) {
            return null;
        }
        hv2[] hv2VarArr = (hv2[]) objM12209g;
        while (i < hv2VarArr.length) {
            sb.append(hv2VarArr[i].f42972a);
            sb.append('/');
            sb.append(hv2VarArr[i].f42973b);
            i++;
            if (i != hv2VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [hv2[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [hv2[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: g */
    public final Serializable m12209g(ByteOrder byteOrder) throws Throwable {
        ev2 ev2Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f39735d;
        InputStream inputStream2 = null;
        try {
            try {
                ev2Var = new ev2(bArr);
                try {
                    ev2Var.f37930c = byteOrder;
                    int i = this.f39732a;
                    int length = 0;
                    int i2 = this.f39733b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, jv2.f46191N);
                                try {
                                    ev2Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                ev2Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= jv2.f46183F.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = jv2.f46183F;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    ev2Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            ev2Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ev2Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                ev2Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) ev2Var.readInt()) & 4294967295L;
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 5:
                            r13 = new hv2[i2];
                            while (length < i2) {
                                r13[length] = new hv2(((long) ev2Var.readInt()) & 4294967295L, ((long) ev2Var.readInt()) & 4294967295L);
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ev2Var.readShort();
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = ev2Var.readInt();
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 10:
                            r13 = new hv2[i2];
                            while (length < i2) {
                                r13[length] = new hv2(ev2Var.readInt(), ev2Var.readInt());
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = ev2Var.readFloat();
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = ev2Var.readDouble();
                                length++;
                            }
                            ev2Var.close();
                            return r13;
                        default:
                            try {
                                ev2Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (ev2Var != null) {
                        try {
                            ev2Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            ev2Var = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(jv2.f46181D[this.f39732a]);
        sb.append(", data length:");
        return wq1.m24123s(sb, this.f39735d.length, ")");
    }

    public fv2(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
