package p000;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajj {

    /* JADX INFO: renamed from: a */
    public final int f496a;

    /* JADX INFO: renamed from: b */
    public final int f497b;

    /* JADX INFO: renamed from: c */
    public final long f498c;

    /* JADX INFO: renamed from: d */
    public final byte[] f499d;

    public ajj(int i, int i2, long j, byte[] bArr) {
        this.f496a = i;
        this.f497b = i2;
        this.f498c = j;
        this.f499d = bArr;
    }

    public ajj(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static ajj m807b(String str) {
        byte[] bytes = (str + (char) 0).getBytes(ajl.f522g);
        return new ajj(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: c */
    public static ajj m808c(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ajl.f520e[4]]);
        byteBufferWrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            byteBufferWrap.putInt((int) jArr[i]);
        }
        return new ajj(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: d */
    public static ajj m809d(ajk ajkVar, ByteOrder byteOrder) {
        ajk[] ajkVarArr = {ajkVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ajl.f520e[5]]);
        byteBufferWrap.order(byteOrder);
        for (int i = 0; i <= 0; i++) {
            ajk ajkVar2 = ajkVarArr[i];
            byteBufferWrap.putInt((int) ajkVar2.f500a);
            byteBufferWrap.putInt((int) ajkVar2.f501b);
        }
        return new ajj(5, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: e */
    public static ajj m810e(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ajl.f520e[3]]);
        byteBufferWrap.order(byteOrder);
        for (int i2 = 0; i2 <= 0; i2++) {
            byteBufferWrap.putShort((short) iArr[i2]);
        }
        return new ajj(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: a */
    public final int m811a(ByteOrder byteOrder) throws Throwable {
        Object objM812f = m812f(byteOrder);
        if (objM812f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM812f instanceof String) {
            return Integer.parseInt((String) objM812f);
        }
        if (objM812f instanceof long[]) {
            long[] jArr = (long[]) objM812f;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM812f instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM812f;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Code duplicated, block: B:182:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    final Object m812f(ByteOrder byteOrder) throws Throwable {
        aji ajiVar;
        byte b;
        byte b2;
        aji ajiVar2 = null;
        try {
            ajiVar = new aji(this.f499d);
            try {
                ajiVar.f494c = byteOrder;
                int i = 0;
                switch (this.f496a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.f499d;
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, ajl.f522g);
                            try {
                                ajiVar.close();
                                break;
                            } catch (IOException e) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                        }
                        return str2;
                    case 2:
                    case 7:
                        int i2 = this.f497b;
                        int length = ajl.f521f.length;
                        if (i2 >= 8) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = ajl.f521f;
                                int length2 = bArr2.length;
                                if (i3 >= 8) {
                                    i = 8;
                                } else if (this.f499d[i3] == bArr2[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i < this.f497b && (b2 = this.f499d[i]) != 0) {
                            if (b2 >= 32) {
                                sb.append((char) b2);
                            } else {
                                sb.append('?');
                            }
                            i++;
                        }
                        String string = sb.toString();
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e3) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        }
                        return string;
                    case 3:
                        int[] iArr = new int[this.f497b];
                        while (i < this.f497b) {
                            iArr[i] = ajiVar.readUnsignedShort();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e4) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.f497b];
                        while (i < this.f497b) {
                            jArr[i] = ajiVar.m804a();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                        return jArr;
                    case 5:
                        ajk[] ajkVarArr = new ajk[this.f497b];
                        while (i < this.f497b) {
                            ajkVarArr[i] = new ajk(ajiVar.m804a(), ajiVar.m804a());
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                        return ajkVarArr;
                    case 8:
                        int[] iArr2 = new int[this.f497b];
                        while (i < this.f497b) {
                            iArr2[i] = ajiVar.readShort();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.f497b];
                        while (i < this.f497b) {
                            iArr3[i] = ajiVar.readInt();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        }
                        return iArr3;
                    case 10:
                        ajk[] ajkVarArr2 = new ajk[this.f497b];
                        while (i < this.f497b) {
                            ajkVarArr2[i] = new ajk(ajiVar.readInt(), ajiVar.readInt());
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e9) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        }
                        return ajkVarArr2;
                    case 11:
                        double[] dArr = new double[this.f497b];
                        while (i < this.f497b) {
                            dArr[i] = ajiVar.readFloat();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.f497b];
                        while (i < this.f497b) {
                            dArr2[i] = ajiVar.readDouble();
                            i++;
                        }
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                        return dArr2;
                    default:
                        try {
                            ajiVar.close();
                            break;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        }
                        return null;
                }
            } catch (IOException e13) {
                e = e13;
                try {
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (ajiVar != null) {
                        try {
                            ajiVar.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    ajiVar2 = ajiVar;
                    if (ajiVar2 != null) {
                        try {
                            ajiVar2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ajiVar2 = ajiVar;
                if (ajiVar2 != null) {
                    ajiVar2.close();
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            ajiVar = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m813g(ByteOrder byteOrder) throws Throwable {
        Object objM812f = m812f(byteOrder);
        if (objM812f == null) {
            return null;
        }
        if (objM812f instanceof String) {
            return (String) objM812f;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM812f instanceof long[]) {
            long[] jArr = (long[]) objM812f;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    return sb.toString();
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (objM812f instanceof int[]) {
            int[] iArr = (int[]) objM812f;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (objM812f instanceof double[]) {
            double[] dArr = (double[]) objM812f;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    return sb.toString();
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(objM812f instanceof ajk[])) {
                return null;
            }
            ajk[] ajkVarArr = (ajk[]) objM812f;
            while (true) {
                int length4 = ajkVarArr.length;
                if (i >= length4) {
                    return sb.toString();
                }
                sb.append(ajkVarArr[i].f500a);
                sb.append('/');
                sb.append(ajkVarArr[i].f501b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
    }

    public final String toString() {
        return "(" + ajl.f519d[this.f496a] + ", data length:" + this.f499d.length + ")";
    }
}
