package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 {

    /* JADX INFO: renamed from: c */
    public static final p58 f7273c;

    /* JADX INFO: renamed from: e */
    public static final jj5 f7275e;

    /* JADX INFO: renamed from: f */
    public static final s46 f7276f;

    /* JADX INFO: renamed from: g */
    public static Boolean f7277g = null;

    /* JADX INFO: renamed from: h */
    public static String f7278h = null;

    /* JADX INFO: renamed from: i */
    public static boolean f7279i = false;

    /* JADX INFO: renamed from: j */
    public static int f7280j = -1;

    /* JADX INFO: renamed from: k */
    public static Boolean f7281k;

    /* JADX INFO: renamed from: o */
    public static z8d f7285o;

    /* JADX INFO: renamed from: p */
    public static pbd f7286p;

    /* JADX INFO: renamed from: a */
    public final Context f7287a;

    /* JADX INFO: renamed from: l */
    public static final ThreadLocal f7282l = new ThreadLocal();

    /* JADX INFO: renamed from: m */
    public static final C2932dl f7283m = new C2932dl(6);

    /* JADX INFO: renamed from: n */
    public static final nj0 f7284n = new nj0(27);

    /* JADX INFO: renamed from: b */
    public static final g9c f7272b = new g9c(28);

    /* JADX INFO: renamed from: d */
    public static final tr3 f7274d = new tr3(29);

    static {
        int i = 29;
        f7273c = new p58(i);
        f7275e = new jj5(i);
        f7276f = new s46(i);
    }

    public ao2(Context context) {
        this.f7287a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m2948a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (x74.m24360q(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0244 A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0255 A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:104:0x026b A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0274 A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:107:0x027c A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0286 A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0294  */
    /* JADX WARN: Code duplicated, block: B:135:0x030a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0310  */
    /* JADX WARN: Code duplicated, block: B:139:0x0319  */
    /* JADX WARN: Code duplicated, block: B:144:0x032a A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:31:0x00f8, B:119:0x02a1, B:120:0x02ab, B:128:0x02ba, B:130:0x02e2, B:132:0x02f2, B:142:0x0322, B:143:0x0329, B:123:0x02ae, B:124:0x02af, B:125:0x02b6, B:144:0x032a, B:145:0x034a, B:146:0x034b, B:147:0x039c), top: B:159:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:31:0x00f8, B:119:0x02a1, B:120:0x02ab, B:128:0x02ba, B:130:0x02e2, B:132:0x02f2, B:142:0x0322, B:143:0x0329, B:123:0x02ae, B:124:0x02af, B:125:0x02b6, B:144:0x032a, B:145:0x034a, B:146:0x034b, B:147:0x039c), top: B:159:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:36:0x0103 A[Catch: all -> 0x0290, TryCatch #4 {all -> 0x0290, blocks: (B:34:0x00fd, B:36:0x0103, B:37:0x0105), top: B:162:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0108 A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010f A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0148 A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9 A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4 A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:83:0x020b A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0212 A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:87:0x021a A[Catch: all -> 0x0183, DynamiteModule$LoadingException -> 0x0188, RemoteException -> 0x018d, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x018d, DynamiteModule$LoadingException -> 0x0188, all -> 0x0183, blocks: (B:33:0x00fc, B:39:0x0108, B:41:0x010f, B:42:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0154, B:51:0x0162, B:58:0x016d, B:66:0x01a7, B:68:0x01af, B:69:0x01b6, B:70:0x01bd, B:65:0x0192, B:73:0x01c0, B:74:0x01c1, B:75:0x01c8, B:76:0x01c9, B:77:0x01d0, B:80:0x01d3, B:81:0x01d4, B:83:0x020b, B:85:0x0212, B:87:0x021a), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0236 A[Catch: all -> 0x022d, DynamiteModule$LoadingException -> 0x0230, RemoteException -> 0x0233, TryCatch #11 {RemoteException -> 0x0233, DynamiteModule$LoadingException -> 0x0230, all -> 0x022d, blocks: (B:89:0x021e, B:102:0x0265, B:104:0x026b, B:105:0x0274, B:106:0x027b, B:96:0x0236, B:97:0x023f, B:100:0x0244, B:101:0x0255, B:107:0x027c, B:108:0x0285, B:109:0x0286, B:110:0x028f, B:118:0x02a0), top: B:166:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0240  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [zn2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.content.Context] */
    /* JADX INFO: renamed from: c */
    public static ao2 m2949c(Context context, zn2 zn2Var, String str) throws DynamiteModule$LoadingException {
        ?? r6;
        int i;
        ao2 ao2Var;
        Cursor cursor;
        int i2;
        ?? r7;
        Boolean bool;
        z8d z8dVarM2954h;
        int iM25502U;
        by3 by3VarM25498Q;
        Object objM16422I;
        o3d o3dVar;
        pbd pbdVar;
        o3d o3dVar2;
        boolean z;
        by3 by3VarM19058Q;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f7282l;
        o3d o3dVar3 = (o3d) threadLocal.get();
        o3d o3dVar4 = new o3d();
        threadLocal.set(o3dVar4);
        C2932dl c2932dl = f7283m;
        Long l = (Long) c2932dl.get();
        long jLongValue = l.longValue();
        try {
            c2932dl.set(Long.valueOf(SystemClock.uptimeMillis()));
            yn2 yn2VarMo12443h = zn2Var.mo12443h(context, str, f7284n);
            int i3 = yn2VarMo12443h.f70101a;
            int i4 = yn2VarMo12443h.f70102b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i3).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i4).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            Log.i("DynamiteModule", sb.toString());
            int i5 = yn2VarMo12443h.f70103c;
            if (i5 != 0) {
                if (i5 != -1) {
                    if (i5 == 1 || yn2VarMo12443h.f70102b != 0) {
                        if (i5 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            ao2 ao2Var2 = new ao2(applicationContext);
                            if (jLongValue == 0) {
                                c2932dl.remove();
                            } else {
                                c2932dl.set(l);
                            }
                            cursor2 = o3dVar4.f53812a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(o3dVar3);
                            return ao2Var2;
                        }
                        if (i5 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i5);
                            throw new DynamiteModule$LoadingException(sb2.toString());
                        }
                        try {
                            try {
                                i2 = yn2VarMo12443h.f70102b;
                                try {
                                    try {
                                        try {
                                            synchronized (ao2.class) {
                                                try {
                                                    if (m2951e(context)) {
                                                        throw new DynamiteModule$LoadingException("Remote loading disabled");
                                                    }
                                                    bool = f7277g;
                                                    if (bool != null) {
                                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i2);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (ao2.class) {
                                                            pbdVar = f7286p;
                                                        }
                                                        if (pbdVar != null) {
                                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        o3dVar2 = (o3d) threadLocal.get();
                                                        if (o3dVar2 != null || o3dVar2.f53812a == null) {
                                                            throw new DynamiteModule$LoadingException("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = o3dVar2.f53812a;
                                                        new lp6(null);
                                                        synchronized (ao2.class) {
                                                            z = f7280j >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            by3VarM19058Q = pbdVar.m19059R(new lp6(applicationContext2), str, i2, new lp6(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            by3VarM19058Q = pbdVar.m19058Q(new lp6(applicationContext2), str, i2, new lp6(cursor3));
                                                        }
                                                        Context context2 = (Context) lp6.m16422I(by3VarM19058Q);
                                                        if (context2 == null) {
                                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                                        }
                                                        ao2Var = new ao2(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i2);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        z8dVarM2954h = m2954h(context);
                                                        if (z8dVarM2954h != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                                        }
                                                        iM25502U = z8dVarM2954h.m25502U();
                                                        if (iM25502U >= 3) {
                                                            o3dVar = (o3d) threadLocal.get();
                                                            if (o3dVar != null) {
                                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                                            }
                                                            by3VarM25498Q = z8dVarM2954h.m25504W(new lp6(context), str, i2, new lp6(o3dVar.f53812a));
                                                        } else if (iM25502U == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            by3VarM25498Q = z8dVarM2954h.m25500S(new lp6(context), str, i2);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            by3VarM25498Q = z8dVarM2954h.m25498Q(new lp6(context), str, i2);
                                                        }
                                                        objM16422I = lp6.m16422I(by3VarM25498Q);
                                                        if (objM16422I != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                                        }
                                                        ao2Var = new ao2((Context) objM16422I);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f7283m.remove();
                                                    } else {
                                                        f7283m.set(l);
                                                    }
                                                    cursor = o3dVar4.f53812a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f7282l.set(o3dVar3);
                                                    return ao2Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (RemoteException e) {
                                        e = e;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                    } catch (DynamiteModule$LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r7 = i3;
                                        p9d.m18997c(r7, th);
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                } catch (DynamiteModule$LoadingException e4) {
                                    throw e4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r7 = context;
                                    p9d.m18997c(r7, th);
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                }
                            } catch (DynamiteModule$LoadingException e5) {
                                e = e5;
                                r6 = context;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i = yn2VarMo12443h.f70101a;
                                if (i != 0 || zn2Var.mo12443h(r6, str, new cp3(i, 5)).f70103c != -1) {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                ao2Var = new ao2(applicationContext);
                            }
                        } catch (DynamiteModule$LoadingException e6) {
                            e = e6;
                            r6 = i3;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i = yn2VarMo12443h.f70101a;
                            if (i != 0) {
                            }
                            throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (yn2VarMo12443h.f70101a != 0) {
                    i5 = -1;
                    if (i5 == 1) {
                    }
                    if (i5 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        ao2 ao2Var3 = new ao2(applicationContext);
                        if (jLongValue == 0) {
                            c2932dl.remove();
                        } else {
                            c2932dl.set(l);
                        }
                        cursor2 = o3dVar4.f53812a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(o3dVar3);
                        return ao2Var3;
                    }
                    if (i5 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i5).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i5);
                        throw new DynamiteModule$LoadingException(sb7.toString());
                    }
                    i2 = yn2VarMo12443h.f70102b;
                    synchronized (ao2.class) {
                        if (m2951e(context)) {
                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                        }
                        bool = f7277g;
                        if (bool != null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i2);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (ao2.class) {
                                pbdVar = f7286p;
                                if (pbdVar != null) {
                                    throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                o3dVar2 = (o3d) threadLocal.get();
                                if (o3dVar2 != null) {
                                }
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i2);
                        Log.i("DynamiteModule", sb9.toString());
                        z8dVarM2954h = m2954h(context);
                        if (z8dVarM2954h != null) {
                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                        }
                        iM25502U = z8dVarM2954h.m25502U();
                        if (iM25502U >= 3) {
                            o3dVar = (o3d) threadLocal.get();
                            if (o3dVar != null) {
                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                            }
                            by3VarM25498Q = z8dVarM2954h.m25504W(new lp6(context), str, i2, new lp6(o3dVar.f53812a));
                        } else if (iM25502U == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            by3VarM25498Q = z8dVarM2954h.m25500S(new lp6(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            by3VarM25498Q = z8dVarM2954h.m25498Q(new lp6(context), str, i2);
                        }
                        objM16422I = lp6.m16422I(by3VarM25498Q);
                        if (objM16422I != null) {
                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                        }
                        ao2Var = new ao2((Context) objM16422I);
                        if (jLongValue == 0) {
                            f7283m.remove();
                        } else {
                            f7283m.set(l);
                        }
                        cursor = o3dVar4.f53812a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f7282l.set(o3dVar3);
                        return ao2Var;
                    }
                }
            }
            int i6 = yn2VarMo12443h.f70101a;
            int i7 = yn2VarMo12443h.f70102b;
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i6).length() + 23 + String.valueOf(i7).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i6);
            sb10.append(" and remote version is ");
            sb10.append(i7);
            sb10.append(".");
            throw new DynamiteModule$LoadingException(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                f7283m.remove();
            } else {
                f7283m.set(l);
            }
            Cursor cursor4 = o3dVar4.f53812a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f7282l.set(o3dVar3);
            throw th5;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:143:0x01da */
    /* JADX WARN: Code duplicated, block: B:105:0x0181 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00d8, blocks: (B:4:0x0006, B:57:0x00cd, B:59:0x00d3, B:67:0x0101, B:97:0x016c, B:105:0x0181, B:123:0x01e0, B:124:0x01e3, B:118:0x01d7, B:65:0x00de, B:126:0x01e5, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:55:0x00ca, B:22:0x004d, B:42:0x008d, B:45:0x0090, B:52:0x00a8, B:56:0x00cc, B:54:0x00aa), top: B:134:0x0006, inners: #1, #10 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: all -> 0x003b, TryCatch #7 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:49:0x00a5, B:17:0x0040, B:19:0x0046, B:21:0x004c, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:40:0x0084, B:41:0x008c, B:39:0x0076, B:44:0x008f, B:47:0x0092, B:48:0x009c, B:18:0x0043), top: B:142:0x002b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX INFO: renamed from: d */
    public static int m2950d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (ao2.class) {
                Boolean bool = f7277g;
                boolean z2 = true;
                Cursor cursor2 = null;
                int iM25499R = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m2953g(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m2951e(context)) {
                                        return 0;
                                    }
                                    if (f7279i) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM2952f = m2952f(context, str, z, true);
                                                String str2 = f7278h;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM14058b = iob.m14058b();
                                                    if (classLoaderM14058b == null) {
                                                        String str3 = f7278h;
                                                        lda.m16130p(str3);
                                                        classLoaderM14058b = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    }
                                                    m2953g(classLoaderM14058b);
                                                    declaredField.set(null, classLoaderM14058b);
                                                    f7277g = bool2;
                                                    return iM2952f;
                                                }
                                                return iM2952f;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f7277g = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m2952f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                z8d z8dVarM2954h = m2954h(context);
                try {
                    if (z8dVarM2954h != null) {
                        try {
                            int iM25502U = z8dVarM2954h.m25502U();
                            if (iM25502U >= 3) {
                                ThreadLocal threadLocal = f7282l;
                                o3d o3dVar = (o3d) threadLocal.get();
                                if (o3dVar == null || (cursor = o3dVar.f53812a) == null) {
                                    Cursor cursor3 = (Cursor) lp6.m16422I(z8dVarM2954h.m25503V(new lp6(context), str, z, ((Long) f7283m.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                if (i > 0) {
                                                    o3d o3dVar2 = (o3d) threadLocal.get();
                                                    if (o3dVar2 == null || o3dVar2.f53812a != null) {
                                                        z2 = false;
                                                    } else {
                                                        o3dVar2.f53812a = cursor3;
                                                    }
                                                    cursor2 = z2 ? null : cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iM25499R = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e3) {
                                            remoteException = e3;
                                            cursor2 = cursor3;
                                            String message2 = remoteException.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb3.append("Failed to retrieve remote module version: ");
                                            sb3.append(message2);
                                            Log.w("DynamiteModule", sb3.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iM25499R = cursor.getInt(0);
                                }
                            } else if (iM25502U == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iM25499R = z8dVarM2954h.m25501T(new lp6(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iM25499R = z8dVarM2954h.m25499R(new lp6(context), str, z);
                            }
                        } catch (RemoteException e4) {
                            remoteException = e4;
                        }
                    }
                    return iM25499R;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            p9d.m18997c(context, th5);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2951e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7281k)) {
            return true;
        }
        boolean z = false;
        if (f7281k == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (po3.f56584b.m19432c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f7281k = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f7279i = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public static int m2952f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f7283m.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (ao2.class) {
                                    try {
                                        f7278h = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f7280j = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f7279i = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                o3d o3dVar = (o3d) f7282l.get();
                                if (o3dVar == null || o3dVar.f53812a != null) {
                                    z4 = false;
                                } else {
                                    o3dVar.f53812a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new DynamiteModule$LoadingException(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2953g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            pbd pbdVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pbdVar = iInterfaceQueryLocalInterface instanceof pbd ? (pbd) iInterfaceQueryLocalInterface : new pbd(iBinder);
            }
            f7286p = pbdVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static z8d m2954h(Context context) {
        z8d z8dVar;
        synchronized (ao2.class) {
            z8d z8dVar2 = f7285o;
            if (z8dVar2 != null) {
                return z8dVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    z8dVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    z8dVar = iInterfaceQueryLocalInterface instanceof z8d ? (z8d) iInterfaceQueryLocalInterface : new z8d(iBinder);
                }
                if (z8dVar != null) {
                    f7285o = z8dVar;
                    return z8dVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m2955b(String str) {
        try {
            return (IBinder) this.f7287a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
