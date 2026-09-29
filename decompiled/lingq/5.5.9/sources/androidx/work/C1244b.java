package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1244b {

    /* JADX INFO: renamed from: b */
    public static final String f7822b = AbstractC1314g.m4868f("Data");

    /* JADX INFO: renamed from: c */
    public static final C1244b f7823c;

    /* JADX INFO: renamed from: a */
    public final HashMap f7824a;

    /* JADX INFO: renamed from: androidx.work.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final HashMap f7825a = new HashMap();

        /* JADX INFO: renamed from: a */
        public final C1244b m4708a() throws Throwable {
            C1244b c1244b = new C1244b(this.f7825a);
            C1244b.m4703f(c1244b);
            return c1244b;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final void m4709b(Object obj, String str) {
            HashMap map = this.f7825a;
            if (obj == null) {
                map.put(str, null);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                map.put(str, obj);
                return;
            }
            int i10 = 0;
            if (cls == boolean[].class) {
                boolean[] zArr = (boolean[]) obj;
                String str2 = C1244b.f7822b;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i10 < zArr.length) {
                    boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    i10++;
                }
                map.put(str, boolArr);
                return;
            }
            if (cls == byte[].class) {
                byte[] bArr = (byte[]) obj;
                String str3 = C1244b.f7822b;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i10 < bArr.length) {
                    bArr2[i10] = Byte.valueOf(bArr[i10]);
                    i10++;
                }
                map.put(str, bArr2);
                return;
            }
            if (cls == int[].class) {
                int[] iArr = (int[]) obj;
                String str4 = C1244b.f7822b;
                Integer[] numArr = new Integer[iArr.length];
                while (i10 < iArr.length) {
                    numArr[i10] = Integer.valueOf(iArr[i10]);
                    i10++;
                }
                map.put(str, numArr);
                return;
            }
            if (cls == long[].class) {
                long[] jArr = (long[]) obj;
                String str5 = C1244b.f7822b;
                Long[] lArr = new Long[jArr.length];
                while (i10 < jArr.length) {
                    lArr[i10] = Long.valueOf(jArr[i10]);
                    i10++;
                }
                map.put(str, lArr);
                return;
            }
            if (cls == float[].class) {
                float[] fArr = (float[]) obj;
                String str6 = C1244b.f7822b;
                Float[] fArr2 = new Float[fArr.length];
                while (i10 < fArr.length) {
                    fArr2[i10] = Float.valueOf(fArr[i10]);
                    i10++;
                }
                map.put(str, fArr2);
                return;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
            }
            double[] dArr = (double[]) obj;
            String str7 = C1244b.f7822b;
            Double[] dArr2 = new Double[dArr.length];
            while (i10 < dArr.length) {
                dArr2[i10] = Double.valueOf(dArr[i10]);
                i10++;
            }
            map.put(str, dArr2);
        }

        /* JADX INFO: renamed from: c */
        public final void m4710c(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                m4709b(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    static {
        C1244b c1244b = new C1244b(new HashMap());
        m4703f(c1244b);
        f7823c = c1244b;
    }

    public C1244b() {
    }

    public C1244b(C1244b c1244b) {
        this.f7824a = new HashMap(c1244b.f7824a);
    }

    public C1244b(HashMap map) {
        this.f7824a = new HashMap(map);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x006f: MOVE (r10 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:40:0x006e */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C1244b m4702a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e10;
        ObjectInputStream objectInputStream2;
        String str = f7822b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(str, "Error in Data#fromByteArray: ", e11);
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                Log.e(str, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream3 = objectInputStream2;
                    if (objectInputStream3 != null) {
                        try {
                            objectInputStream3.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#fromByteArray: ", e15);
                            byteArrayInputStream.close();
                            throw th;
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#fromByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th3 = e;
                objectInputStream = null;
                e10 = th3;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C1244b(map);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th4 = e;
                objectInputStream = null;
                e10 = th4;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C1244b(map);
            } catch (Throwable th5) {
                th = th5;
                if (objectInputStream3 != null) {
                    objectInputStream3.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
        } catch (IOException e19) {
            Log.e(str, "Error in Data#fromByteArray: ", e19);
        }
        return new C1244b(map);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static byte[] m4703f(C1244b c1244b) throws Throwable {
        ObjectOutputStream objectOutputStream;
        String str = f7822b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(c1244b.f7824a.size());
                    for (Map.Entry entry : c1244b.f7824a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e10) {
                        Log.e(str, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e13) {
                            Log.e(str, "Error in Data#toByteArray: ", e13);
                            byteArrayOutputStream.close();
                            return byteArray;
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(str, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = objectOutputStream2;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    /* JADX INFO: renamed from: b */
    public final double m4704b(String str) {
        Object obj = this.f7824a.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: c */
    public final int m4705c(String str, int i10) {
        Object obj = this.f7824a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    /* JADX INFO: renamed from: d */
    public final int[] m4706d(String str) {
        Object obj = this.f7824a.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int[] iArr = new int[numArr.length];
        for (int i10 = 0; i10 < numArr.length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public final String m4707e(String str) {
        Object obj = this.f7824a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1244b.class == obj.getClass()) {
            C1244b c1244b = (C1244b) obj;
            HashMap map = this.f7824a;
            Set<String> setKeySet = map.keySet();
            if (!setKeySet.equals(c1244b.f7824a.keySet())) {
                return false;
            }
            for (String str : setKeySet) {
                Object obj2 = map.get(str);
                Object obj3 = c1244b.f7824a.get(str);
                if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7824a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap map = this.f7824a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
