package p000;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.sqlite.driver.C0763a;
import coil.memory.MemoryCache$Key;
import com.google.firebase.encoders.proto.Protobuf$IntEncoding;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ix */
/* JADX INFO: loaded from: classes.dex */
public final class C3126ix {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44719a;

    /* JADX INFO: renamed from: b */
    public int f44720b;

    /* JADX INFO: renamed from: c */
    public Object f44721c;

    public C3126ix() {
        this.f44719a = 11;
        this.f44721c = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static C3126ix m14165c() {
        C3126ix c3126ix = new C3126ix(0, (byte) 0);
        c3126ix.f44721c = Protobuf$IntEncoding.DEFAULT;
        return c3126ix;
    }

    /* JADX INFO: renamed from: f */
    public static void m14166f(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = fa4.m11651m(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14167a(long j) {
        if (m14170e(j)) {
            return;
        }
        int i = this.f44720b;
        long[] jArrCopyOf = (long[]) this.f44721c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f44721c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f44720b) {
            this.f44720b = i + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public C3091hx m14168b() {
        return new C3091hx(this.f44720b, (Protobuf$IntEncoding) this.f44721c);
    }

    /* JADX INFO: renamed from: d */
    public void m14169d() {
        this.f44720b = 0;
        Iterator it = ((LinkedHashMap) this.f44721c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                u18 u18Var = (u18) u91.m22591I0(arrayList);
                if ((u18Var != null ? (Bitmap) u18Var.f63249b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((u18) arrayList.get(i3)).f63249b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m14170e(long j) {
        int i = this.f44720b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f44721c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m14171g(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f44721c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f44721c = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m14172h(int i, C3774xw c3774xw) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C3774xw c3774xw2 = ((C3774xw[]) this.f44721c)[i2];
            c3774xw2.getClass();
            if (fa4.m11652n(0L, c3774xw.f68879g - c3774xw2.f68879g) <= 0) {
                break;
            }
            c3774xw2.f68878f = i;
            ((C3774xw[]) this.f44721c)[i] = c3774xw2;
            i = i2;
        }
        ((C3774xw[]) this.f44721c)[i] = c3774xw;
        c3774xw.f68878f = i;
    }

    /* JADX INFO: renamed from: i */
    public void m14173i(xg3 xg3Var, int i, int i2) {
        ((sb2) this.f44721c).m21202k(new C0763a(xg3Var), i, i2);
    }

    /* JADX INFO: renamed from: j */
    public void m14174j() {
        ou0 ou0Var = ou0.f54988c;
        char[] cArr = (char[]) this.f44721c;
        ou0Var.getClass();
        cArr.getClass();
        synchronized (ou0Var) {
            int i = ou0Var.f54990b;
            if (cArr.length + i < AbstractC3312lv.f50166a) {
                ou0Var.f54990b = i + cArr.length;
                ou0Var.f54989a.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14175k(long j) {
        int i = this.f44720b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f44721c)[i2]) {
                int i3 = this.f44720b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f44721c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f44720b--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m14176l(C3774xw c3774xw) {
        C3774xw c3774xw2;
        int i = c3774xw.f68878f;
        if (i == -1) {
            C3386nv.m17626m("Failed requirement.");
            return;
        }
        int i2 = this.f44720b;
        C3774xw c3774xw3 = ((C3774xw[]) this.f44721c)[i2];
        c3774xw3.getClass();
        c3774xw.f68878f = -1;
        ((C3774xw[]) this.f44721c)[i2] = null;
        this.f44720b = i2 - 1;
        if (c3774xw == c3774xw3) {
            return;
        }
        int iM11652n = fa4.m11652n(0L, c3774xw3.f68879g - c3774xw.f68879g);
        if (iM11652n == 0) {
            ((C3774xw[]) this.f44721c)[i] = c3774xw3;
            c3774xw3.f68878f = i;
            return;
        }
        if (iM11652n >= 0) {
            m14172h(i, c3774xw3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f44720b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                c3774xw2 = ((C3774xw[]) this.f44721c)[i3];
                c3774xw2.getClass();
            } else {
                c3774xw2 = ((C3774xw[]) this.f44721c)[i3];
                c3774xw2.getClass();
                C3774xw c3774xw4 = ((C3774xw[]) this.f44721c)[i4];
                c3774xw4.getClass();
                if (fa4.m11652n(0L, c3774xw4.f68879g - c3774xw2.f68879g) >= 0) {
                    c3774xw2 = c3774xw4;
                }
            }
            if (fa4.m11652n(0L, c3774xw2.f68879g - c3774xw3.f68879g) <= 0) {
                break;
            }
            int i6 = c3774xw2.f68878f;
            c3774xw2.f68878f = i;
            ((C3774xw[]) this.f44721c)[i] = c3774xw2;
            i = i6;
        }
        ((C3774xw[]) this.f44721c)[i] = c3774xw3;
        c3774xw3.f68878f = i;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m14177m(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f44721c;
            Object arrayList = linkedHashMap.get(memoryCache$Key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(memoryCache$Key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            u18 u18Var = new u18(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(u18Var);
                    break;
                }
                u18 u18Var2 = (u18) arrayList2.get(i2);
                if (i >= u18Var2.f63251d) {
                    if (u18Var2.f63248a != iIdentityHashCode || u18Var2.f63249b.get() != bitmap) {
                        arrayList2.add(i2, u18Var);
                        break;
                    } else {
                        arrayList2.set(i2, u18Var);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.f44720b;
            this.f44720b = i3 + 1;
            if (i3 >= 10) {
                m14169d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14178n(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m14171g(this.f44720b, length);
        str.getChars(0, str.length(), (char[]) this.f44721c, this.f44720b);
        this.f44720b += length;
    }

    public String toString() {
        switch (this.f44719a) {
            case 5:
                return new String((char[]) this.f44721c, 0, this.f44720b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3126ix(int i, Object obj, int i2) {
        this.f44719a = i2;
        this.f44720b = i;
        this.f44721c = obj;
    }

    public /* synthetic */ C3126ix(Object obj, int i, int i2) {
        this.f44719a = i2;
        this.f44721c = obj;
        this.f44720b = i;
    }

    public /* synthetic */ C3126ix(int i, byte b) {
        this.f44719a = i;
    }

    public C3126ix(sb2 sb2Var, int i) {
        this.f44719a = 12;
        this.f44721c = sb2Var;
        this.f44719a = 12;
        this.f44720b = i;
    }
}
