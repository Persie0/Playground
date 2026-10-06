package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axt {

    /* JADX INFO: renamed from: b */
    public Map f2691b;

    /* JADX INFO: renamed from: c */
    private static final String f2690c = ayc.m2100b("Data");

    /* JADX INFO: renamed from: a */
    public static final axt f2689a = C0138dq.m6569e(new HashMap());

    axt() {
    }

    /* JADX WARN: Code duplicated, block: B:57:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static axt m2090a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        Log.e(f2690c, "Error in Data#fromByteArray: ", e2);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    try {
                        Log.e(f2690c, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                Log.e(f2690c, "Error in Data#fromByteArray: ", e4);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e5) {
                                Log.e(f2690c, "Error in Data#fromByteArray: ", e5);
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            Log.e(f2690c, "Error in Data#fromByteArray: ", e6);
                            throw th;
                        }
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    Log.e(f2690c, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e8) {
                Log.e(f2690c, "Error in Data#fromByteArray: ", e8);
            }
        } catch (IOException e9) {
            e = e9;
            Throwable th3 = e;
            objectInputStream = null;
            e = th3;
            Log.e(f2690c, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return new axt(map);
        } catch (ClassNotFoundException e10) {
            e = e10;
            Throwable th4 = e;
            objectInputStream = null;
            e = th4;
            Log.e(f2690c, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            return new axt(map);
        } catch (Throwable th5) {
            th = th5;
        }
        return new axt(map);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static byte[] m2091c(axt axtVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeInt(axtVar.f2691b.size());
                for (Map.Entry entry : axtVar.f2691b.entrySet()) {
                    objectOutputStream2.writeUTF((String) entry.getKey());
                    objectOutputStream2.writeObject(entry.getValue());
                }
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                    Log.e(f2690c, "Error in Data#toByteArray: ", e);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    Log.e(f2690c, "Error in Data#toByteArray: ", e2);
                }
                if (byteArrayOutputStream.size() <= 10240) {
                    return byteArrayOutputStream.toByteArray();
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } catch (IOException e3) {
                e = e3;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.e(f2690c, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(f2690c, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(f2690c, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(f2690c, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(f2690c, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m2092b() {
        return Collections.unmodifiableMap(this.f2691b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axt axtVar = (axt) obj;
        Set<String> setKeySet = this.f2691b.keySet();
        if (!setKeySet.equals(axtVar.f2691b.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f2691b.get(str);
            Object obj3 = axtVar.f2691b.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2691b.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f2691b.isEmpty()) {
            for (String str : this.f2691b.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f2691b.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public axt(axt axtVar) {
        this.f2691b = new HashMap(axtVar.f2691b);
    }

    public axt(Map map) {
        this.f2691b = new HashMap(map);
    }
}
