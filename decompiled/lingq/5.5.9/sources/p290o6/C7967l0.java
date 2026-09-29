package p290o6;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.C2671g4;
import com.kochava.tracker.BuildConfig;
import com.tonyodev.fetch2.database.DownloadInfo;
import dm.C5207g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import p152hb.C5978i0;
import p152hb.C5992n;
import p152hb.InterfaceC5951a1;
import p152hb.InterfaceC6026y0;
import p176ib.InterfaceC6298v;
import p326q.C8446b;
import p356r5.C8735e;
import p356r5.InterfaceC8731a;
import p407u5.InterfaceC9451b;
import p489xk.C10221i;

/* JADX INFO: renamed from: o6.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7967l0 implements InterfaceC8731a, InterfaceC6298v, InterfaceC6026y0 {

    /* JADX INFO: renamed from: H */
    public static String f43365H;

    /* JADX INFO: renamed from: I */
    public static String f43366I;

    /* JADX INFO: renamed from: J */
    public static boolean f43367J;

    /* JADX INFO: renamed from: K */
    public static String f43368K;

    /* JADX INFO: renamed from: L */
    public static String f43369L;

    /* JADX INFO: renamed from: M */
    public static String f43370M;

    /* JADX INFO: renamed from: b */
    public static String f43371b;

    /* JADX INFO: renamed from: c */
    public static String f43372c;

    /* JADX INFO: renamed from: d */
    public static String f43373d;

    /* JADX INFO: renamed from: e */
    public static boolean f43374e;

    /* JADX INFO: renamed from: f */
    public static boolean f43375f;

    /* JADX INFO: renamed from: g */
    public static String f43376g;

    /* JADX INFO: renamed from: h */
    public static C7967l0 f43377h;

    /* JADX INFO: renamed from: i */
    public static String f43378i;

    /* JADX INFO: renamed from: j */
    public static boolean f43379j;

    /* JADX INFO: renamed from: k */
    public static boolean f43380k;

    /* JADX INFO: renamed from: l */
    public static boolean f43381l;

    /* JADX INFO: renamed from: a */
    public final Object f43382a;

    public C7967l0(int i10) {
        if (i10 == 2) {
            this.f43382a = new HashMap();
            return;
        }
        if (i10 == 5) {
            this.f43382a = new ConcurrentHashMap();
        } else if (i10 != 11) {
            this.f43382a = new HashMap();
        } else {
            this.f43382a = new LinkedHashSet();
        }
    }

    public C7967l0(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        if (f43371b == null) {
            f43371b = m15805d(bundle, "CLEVERTAP_ACCOUNT_ID");
        }
        if (f43372c == null) {
            f43372c = m15805d(bundle, "CLEVERTAP_TOKEN");
        }
        if (f43373d == null) {
            f43373d = m15805d(bundle, "CLEVERTAP_REGION");
        }
        f43376g = m15805d(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        f43374e = "1".equals(m15805d(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        f43375f = "1".equals(m15805d(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        f43378i = m15805d(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        f43379j = "1".equals(m15805d(bundle, "CLEVERTAP_SSL_PINNING"));
        f43380k = "1".equals(m15805d(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        f43381l = "1".equals(m15805d(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        String strM15805d = m15805d(bundle, "FCM_SENDER_ID");
        f43365H = strM15805d;
        if (strM15805d != null) {
            f43365H = strM15805d.replace("id:", "");
        }
        f43366I = m15805d(bundle, "CLEVERTAP_APP_PACKAGE");
        f43367J = "1".equals(m15805d(bundle, "CLEVERTAP_BETA"));
        if (f43368K == null) {
            f43368K = m15805d(bundle, "CLEVERTAP_INTENT_SERVICE");
        }
        if (f43369L == null) {
            f43369L = m15805d(bundle, "CLEVERTAP_XIAOMI_APP_KEY");
        }
        if (f43370M == null) {
            f43370M = m15805d(bundle, "CLEVERTAP_XIAOMI_APP_ID");
        }
        String strM15805d2 = m15805d(bundle, "CLEVERTAP_IDENTIFIER");
        this.f43382a = !TextUtils.isEmpty(strM15805d2) ? strM15805d2.split(",") : InterfaceC7984w.f43431d;
    }

    public C7967l0(WorkDatabase workDatabase) {
        C5207g.m11111f(workDatabase, "workDatabase");
        this.f43382a = workDatabase;
    }

    public /* synthetic */ C7967l0(C5992n c5992n) {
        this.f43382a = c5992n;
    }

    public /* synthetic */ C7967l0(Object obj) {
        this.f43382a = obj;
    }

    public C7967l0(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(iMyUid);
        sb2.append("]  PID: [");
        sb2.append(iMyPid);
        sb2.append("] ");
        String string = sb2.toString();
        this.f43382a = str.length() != 0 ? string.concat(str) : new String(string);
    }

    public C7967l0(C10221i c10221i) {
        C5207g.m11112g(c10221i, "fetchDatabaseManagerWrapper");
        this.f43382a = c10221i;
    }

    /* JADX INFO: renamed from: d */
    public static String m15805d(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C7967l0 m15806h(Context context) {
        try {
            if (f43377h == null) {
                f43377h = new C7967l0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43377h;
    }

    /* JADX INFO: renamed from: q */
    public static String m15807q(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                String strValueOf = String.valueOf(str2);
                Log.e("PlayCore", strValueOf.length() != 0 ? "Unable to format ".concat(strValueOf) : new String("Unable to format "), e10);
                String strJoin = TextUtils.join(", ", objArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(strJoin).length());
                sb2.append(str2);
                sb2.append(" [");
                sb2.append(strJoin);
                sb2.append("]");
                str2 = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb3.append(str);
        sb3.append(" : ");
        sb3.append(str2);
        return sb3.toString();
    }

    @Override // p176ib.InterfaceC6298v
    /* JADX INFO: renamed from: a */
    public final boolean mo12929a() {
        InterfaceC5951a1 interfaceC5951a1 = ((C5978i0) this.f43382a).f35510d;
        return interfaceC5951a1 != null && interfaceC5951a1.mo12388c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: b */
    public final void mo12424b(Bundle bundle) {
        Object obj = this.f43382a;
        ((C5992n) obj).f35559m.lock();
        try {
            ((C5992n) obj).f35557k = ConnectionResult.f13855e;
            C5992n.m12445k((C5992n) obj);
            C5992n c5992n = (C5992n) obj;
        } finally {
            ((C5992n) obj).f35559m.unlock();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: c */
    public final void mo12425c(int i10, boolean z10) {
        Lock lock;
        Object obj = this.f43382a;
        C5992n c5992n = (C5992n) obj;
        c5992n.f35559m.lock();
        try {
            C5992n c5992n2 = (C5992n) obj;
            if (c5992n2.f35558l) {
                c5992n2.f35558l = false;
                C5992n.m12444j((C5992n) obj, i10, z10);
                lock = c5992n.f35559m;
            } else {
                c5992n2.f35558l = true;
                ((C5992n) obj).f35550d.mo12398h(i10);
                lock = c5992n.f35559m;
            }
            lock.unlock();
        } catch (Throwable th2) {
            c5992n.f35559m.unlock();
            throw th2;
        }
    }

    @Override // p356r5.InterfaceC8731a
    /* JADX INFO: renamed from: e */
    public final boolean mo70e(Object obj, File file, C8735e c8735e) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        InterfaceC9451b interfaceC9451b = (InterfaceC9451b) this.f43382a;
        byte[] bArr = (byte[]) interfaceC9451b.mo17852d(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        interfaceC9451b.mo17851c(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        interfaceC9451b.mo17851c(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                interfaceC9451b.mo17851c(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m15808f(String str, Object obj) {
        float[] fArr;
        HashMap map = (HashMap) this.f43382a;
        if (!map.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap map2 = (HashMap) map.get(obj);
        if (map2 != null && map2.containsKey(str) && (fArr = (float[]) map2.get(str)) != null) {
            if (fArr.length > 0) {
                return fArr[0];
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: i */
    public final void mo12426i(ConnectionResult connectionResult) {
        Object obj = this.f43382a;
        ((C5992n) obj).f35559m.lock();
        try {
            ((C5992n) obj).f35557k = connectionResult;
            C5992n.m12445k((C5992n) obj);
            ((C5992n) obj).f35559m.unlock();
        } catch (Throwable th2) {
            ((C5992n) obj).f35559m.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15809j(DownloadInfo downloadInfo) {
        C5207g.m11112g(downloadInfo, "downloadInfo");
        ((C10221i) this.f43382a).mo10615T(downloadInfo);
    }

    /* JADX INFO: renamed from: k */
    public final Object m15810k() {
        C2671g4 c2671g4 = (C2671g4) this.f43382a;
        Cursor cursorQuery = c2671g4.f14208a.query(c2671g4.f14209b, C2671g4.f14207i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c8446b = count <= 256 ? new C8446b(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c8446b.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c8446b;
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15811l(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", m15807q((String) this.f43382a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15812m(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m15807q((String) this.f43382a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15813n(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m15807q((String) this.f43382a, str, objArr), exc);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m15814o(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m15807q((String) this.f43382a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15815p(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m15807q((String) this.f43382a, str, objArr));
        }
    }
}
