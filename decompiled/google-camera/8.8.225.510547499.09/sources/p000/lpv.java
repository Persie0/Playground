package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lpv {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f38914c = 0;

    /* JADX INFO: renamed from: d */
    private static final Object f38915d = new Object();

    /* JADX INFO: renamed from: e */
    private static volatile lpu f38916e = null;

    /* JADX INFO: renamed from: f */
    private static volatile boolean f38917f = false;

    /* JADX INFO: renamed from: g */
    private static final lqc f38918g;

    /* JADX INFO: renamed from: h */
    private static final AtomicInteger f38919h;

    /* JADX INFO: renamed from: a */
    final lpt f38920a;

    /* JADX INFO: renamed from: b */
    final String f38921b;

    /* JADX INFO: renamed from: i */
    private final Object f38922i;

    /* JADX INFO: renamed from: j */
    private volatile int f38923j = -1;

    /* JADX INFO: renamed from: k */
    private volatile Object f38924k;

    /* JADX INFO: renamed from: l */
    private final boolean f38925l;

    static {
        new AtomicReference();
        f38918g = new lqc(lqw.f39020b);
        f38919h = new AtomicInteger();
    }

    public lpv(lpt lptVar, String str, Object obj, boolean z) {
        if (lptVar.f38906a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f38920a = lptVar;
        this.f38921b = str;
        this.f38922i = obj;
        this.f38925l = z;
    }

    /* JADX INFO: renamed from: b */
    public static lpv m15839b(lpt lptVar, String str, Boolean bool, boolean z) {
        return new lpp(lptVar, str, bool, z);
    }

    /* JADX INFO: renamed from: c */
    public static lpv m15840c(lpt lptVar, String str, Long l, boolean z) {
        return new lpn(lptVar, str, l, z);
    }

    /* JADX INFO: renamed from: d */
    public static lpv m15841d(lpt lptVar, String str, String str2, boolean z) {
        return new lpr(lptVar, str, str2, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m15842g() {
        f38919h.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    public static void m15843h(Context context) {
        if (f38916e != null || context == null) {
            return;
        }
        Object obj = f38915d;
        synchronized (obj) {
            if (f38916e == null) {
                synchronized (obj) {
                    lpu lpuVar = f38916e;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (lpuVar == null || lpuVar.f38912a != context) {
                        loz.m15793a();
                        lpx.m15849a();
                        lpe.m15801a();
                        f38916e = new lpu(context, lku.m15663q(new lpm(context, 0)));
                        m15842g();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private final String m15844i(String str) {
        return str.isEmpty() ? this.f38921b : str.concat(this.f38921b);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo15831a(Object obj);

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r3
      0x0045: PHI (r3v1 mrm) = (r3v0 mrm), (r3v5 mrm) binds: [B:11:0x0022, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: e */
    public final Object m15845e() {
        String strM15481d;
        boolean zBooleanValue;
        ProviderInfo providerInfoResolveContentProvider;
        final loz lozVarM15794c;
        Object objMo15831a;
        final lpe lpeVar;
        String str;
        ?? EmptyMap;
        Map map;
        ?? r8;
        boolean z = true;
        if (!this.f38925l) {
            boolean z2 = f38918g.f38949a;
            lku.m15614I(true, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f38919h.get();
        if (this.f38923j < i) {
            synchronized (this) {
                if (this.f38923j < i) {
                    lpu lpuVar = f38916e;
                    mrm mrmVar = mqu.f41450a;
                    Object objMo15831a2 = null;
                    if (lpuVar != null) {
                        mrmVar = (mrm) lpuVar.f38913b.mo6051a();
                        if (mrmVar.mo16813g()) {
                            liv livVar = (liv) mrmVar.mo16809c();
                            lpt lptVar = this.f38920a;
                            strM15481d = livVar.m15481d(lptVar.f38906a, lptVar.f38908c, this.f38921b);
                        } else {
                            strM15481d = null;
                        }
                    } else {
                        strM15481d = null;
                    }
                    lku.m15614I(lpuVar != null, "Must call PhenotypeFlag.init() first");
                    Uri uri = this.f38920a.f38906a;
                    if (uri == null) {
                        Context context = lpuVar.f38912a;
                        int i2 = lpx.f38927a;
                        int i3 = kuh.f37221a;
                        throw null;
                    }
                    Context context2 = lpuVar.f38912a;
                    Object obj = lpg.f38887b;
                    String authority = uri.getAuthority();
                    if ("com.google.android.gms.phenotype".equals(authority)) {
                        if (lpg.f38886a.mo16813g()) {
                            zBooleanValue = ((Boolean) lpg.f38886a.mo16809c()).booleanValue();
                        } else {
                            synchronized (lpg.f38887b) {
                                if (lpg.f38886a.mo16813g()) {
                                    zBooleanValue = ((Boolean) lpg.f38886a.mo16809c()).booleanValue();
                                } else {
                                    if ("com.google.android.gms".equals(context2.getPackageName()) || ((providerInfoResolveContentProvider = context2.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                                        try {
                                            if ((context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) {
                                                z = false;
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    lpg.f38886a = mrm.m16829i(Boolean.valueOf(z));
                                    zBooleanValue = ((Boolean) lpg.f38886a.mo16809c()).booleanValue();
                                }
                            }
                        }
                        if (zBooleanValue) {
                            lozVarM15794c = this.f38920a.f38911f ? loz.m15794c(lpuVar.f38912a.getContentResolver(), lph.m15821a(lph.m15822b(lpuVar.f38912a, this.f38920a.f38906a.getLastPathSegment()))) : loz.m15794c(lpuVar.f38912a.getContentResolver(), this.f38920a.f38906a);
                        } else {
                            lozVarM15794c = null;
                        }
                    } else {
                        Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(rgoX.URKhmuMXnVfhKUi));
                        lozVarM15794c = null;
                    }
                    if (lozVarM15794c != null) {
                        String strM15846f = m15846f();
                        Map map2 = lozVarM15794c.f38874f;
                        if (map2 == null) {
                            EmptyMap = map2;
                            synchronized (lozVarM15794c.f38873e) {
                                Map map3 = lozVarM15794c.f38874f;
                                if (map3 != null) {
                                    r8 = map3;
                                } else {
                                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        try {
                                            map = (Map) lle.m15686f(new lpb() { // from class: lox
                                                @Override // p000.lpb
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo15792a() {
                                                    loz lozVar = lozVarM15794c;
                                                    Cursor cursorQuery = lozVar.f38871c.query(lozVar.f38872d, loz.f38870b, null, null, null);
                                                    if (cursorQuery == null) {
                                                        return Collections.emptyMap();
                                                    }
                                                    try {
                                                        int count = cursorQuery.getCount();
                                                        if (count == 0) {
                                                            return Collections.emptyMap();
                                                        }
                                                        Map c1109wy = count <= 256 ? new C1109wy(count) : new HashMap(count, 1.0f);
                                                        while (cursorQuery.moveToNext()) {
                                                            c1109wy.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                        }
                                                        return c1109wy;
                                                    } finally {
                                                        cursorQuery.close();
                                                    }
                                                }
                                            });
                                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                        } catch (Throwable th) {
                                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                            throw th;
                                        }
                                    } catch (SQLiteException | IllegalStateException | SecurityException e2) {
                                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                                        map = null;
                                    }
                                    lozVarM15794c.f38874f = map;
                                    AllowThreadDiskReads = map;
                                    r8 = AllowThreadDiskReads;
                                }
                            }
                            EmptyMap = r8;
                        }
                        if (EmptyMap == 0) {
                            EmptyMap = Collections.emptyMap();
                        }
                        String str2 = (String) EmptyMap.get(strM15846f);
                        objMo15831a = str2 != null ? mo15831a(str2) : null;
                    } else {
                        objMo15831a = null;
                    }
                    if (objMo15831a == null) {
                        if (!this.f38920a.f38909d) {
                            Context context3 = lpuVar.f38912a;
                            synchronized (lpe.class) {
                                if (lpe.f38882a == null) {
                                    lpe.f38882a = aae.m0a(context3, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new lpe(context3) : new lpe();
                                }
                                lpeVar = lpe.f38882a;
                            }
                            lpt lptVar2 = this.f38920a;
                            final String strM15844i = lptVar2.f38909d ? null : m15844i(lptVar2.f38907b);
                            Object obj2 = lpeVar.f38884c;
                            if (obj2 == null || kuh.m14888c((Context) obj2)) {
                                str = null;
                            } else {
                                try {
                                    str = (String) lle.m15686f(new lpb() { // from class: lpc
                                        @Override // p000.lpb
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo15792a() {
                                            lpe lpeVar2 = lpeVar;
                                            return jum.m13517f(((Context) lpeVar2.f38884c).getContentResolver(), strM15844i);
                                        }
                                    });
                                } catch (IllegalStateException | NullPointerException | SecurityException e3) {
                                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(strM15844i)), e3);
                                    str = null;
                                }
                            }
                            if (str != null) {
                                objMo15831a2 = mo15831a(str);
                            }
                        }
                        objMo15831a = objMo15831a2 == null ? this.f38922i : objMo15831a2;
                    }
                    if (mrmVar.mo16813g()) {
                        objMo15831a = strM15481d == null ? this.f38922i : mo15831a(strM15481d);
                    }
                    this.f38924k = objMo15831a;
                    this.f38923j = i;
                }
            }
        }
        return this.f38924k;
    }

    /* JADX INFO: renamed from: f */
    public final String m15846f() {
        return m15844i(this.f38920a.f38908c);
    }
}
