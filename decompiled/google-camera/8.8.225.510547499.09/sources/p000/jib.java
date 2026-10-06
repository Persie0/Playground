package p000;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jib {
    /* JADX INFO: renamed from: A */
    public static int m13192A(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m13193B(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                throw new mso("Unknown video aspect ratio " + i);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m13195D(gyi gyiVar, Bitmap bitmap) {
        gyiVar.mo3961n(bitmap);
    }

    /* JADX INFO: renamed from: a */
    public static void m13196a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m13197b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m13198c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m13199d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13200e(String str) {
        if (!jiy.m13277d()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m13201f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13202g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m13203h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m13204i(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m13205j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13206k(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static jpp m13207l(jeg jegVar, jia jiaVar) {
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        jegVar.mo4651k(new jhy(jegVar, khbVar, jiaVar, null, null));
        return (jpp) khbVar.f36008a;
    }

    /* JADX INFO: renamed from: m */
    public static jpp m13208m(jeg jegVar) {
        return m13207l(jegVar, new jhz(0));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m13209n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static final String m13210o(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static final void m13211p(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    /* JADX INFO: renamed from: r */
    public static jfx m13213r(Object obj, Looper looper, String str) {
        m13206k(looper, "Looper must not be null");
        m13206k(str, "Listener type must not be null");
        return new jfx(looper, obj, str);
    }

    /* JADX INFO: renamed from: s */
    public static void m13214s(Status status, khb khbVar) {
        m13215t(status, null, khbVar);
    }

    /* JADX INFO: renamed from: t */
    public static void m13215t(Status status, Object obj, khb khbVar) {
        if (status.m4645b()) {
            khbVar.m14243i(obj);
        } else {
            khbVar.m14242h(m13212q(status));
        }
    }

    /* JADX INFO: renamed from: u */
    public static final jxh m13216u() {
        return new jxh();
    }

    /* JADX INFO: renamed from: v */
    public static Integer m13217v(dhv dhvVar) {
        return (Integer) dhvVar.mo6173a(dix.f11732j).get();
    }

    /* JADX INFO: renamed from: w */
    public static hlw m13218w() {
        return new hlw(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
    }

    /* JADX INFO: renamed from: x */
    public static final jzn m13219x() {
        return new jzn();
    }

    /* JADX INFO: renamed from: y */
    public static List m13220y(List list, String str) {
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 0) {
            return list;
        }
        HashSet hashSet = new HashSet(mkv.m16501I(strArrSplit));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kbc kbcVar = (kbc) it.next();
            if (!m13221z(kbcVar, hashSet)) {
                arrayList.add(kbcVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m13221z(kbc kbcVar, Set set) {
        return set.contains(kbcVar.f35517a + "x" + kbcVar.f35518b);
    }

    /* JADX INFO: renamed from: q */
    public static jdv m13212q(Status status) {
        return status.f7609i != null ? new jek(status) : new jdv(status);
    }
}
