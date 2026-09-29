package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p176ib.C6268g;
import p176ib.C6272i;
import p320pb.BinderC8215b;
import p320pb.InterfaceC8214a;
import p336qb.C8509a;
import p336qb.C8510b;
import p336qb.C8512d;
import p336qb.C8513e;
import p336qb.C8514f;
import p336qb.C8515g;
import p336qb.C8516h;
import p336qb.C8517i;
import p455wb.C9897c;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: d */
    public static Boolean f14026d = null;

    /* JADX INFO: renamed from: e */
    public static String f14027e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f14028f = false;

    /* JADX INFO: renamed from: g */
    public static int f14029g = -1;

    /* JADX INFO: renamed from: h */
    public static Boolean f14030h;

    /* JADX INFO: renamed from: l */
    public static C8516h f14034l;

    /* JADX INFO: renamed from: m */
    public static C8517i f14035m;

    /* JADX INFO: renamed from: a */
    public final Context f14036a;

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal f14031i = new ThreadLocal();

    /* JADX INFO: renamed from: j */
    public static final C8514f f14032j = new C8514f();

    /* JADX INFO: renamed from: k */
    public static final C2575a f14033k = new C2575a();

    /* JADX INFO: renamed from: b */
    public static final C2576b f14024b = new C2576b();

    /* JADX INFO: renamed from: c */
    public static final C2577c f14025c = new C2577c();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface InterfaceC2574a {

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            int mo7633a(Context context, String str, boolean z10) throws LoadingException;

            /* JADX INFO: renamed from: b */
            int mo7634b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f14037a = 0;

            /* JADX INFO: renamed from: b */
            public int f14038b = 0;

            /* JADX INFO: renamed from: c */
            public int f14039c = 0;
        }

        /* JADX INFO: renamed from: a */
        b mo7632a(Context context, String str, a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        this.f14036a = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m7624a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C6268g.m12905a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0271 */
    /* JADX WARN: Code duplicated, block: B:106:0x021e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0222  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:177:0x0308 A[Catch: all -> 0x0349, TryCatch #6 {all -> 0x0349, blocks: (B:5:0x0031, B:9:0x007d, B:14:0x0086, B:17:0x008c, B:28:0x00ba, B:145:0x0279, B:150:0x0286, B:151:0x028d, B:149:0x027f, B:161:0x02a2, B:163:0x02c0, B:165:0x02ce, B:175:0x0300, B:176:0x0307, B:155:0x0292, B:157:0x0295, B:158:0x029c, B:177:0x0308, B:178:0x031b, B:179:0x031c, B:180:0x0348), top: B:201:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x008c A[Catch: all -> 0x0349, TRY_LEAVE, TryCatch #6 {all -> 0x0349, blocks: (B:5:0x0031, B:9:0x007d, B:14:0x0086, B:17:0x008c, B:28:0x00ba, B:145:0x0279, B:150:0x0286, B:151:0x028d, B:149:0x027f, B:161:0x02a2, B:163:0x02c0, B:165:0x02ce, B:175:0x0300, B:176:0x0307, B:155:0x0292, B:157:0x0295, B:158:0x029c, B:177:0x0308, B:178:0x031b, B:179:0x031c, B:180:0x0348), top: B:201:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: all -> 0x0264, TryCatch #4 {, blocks: (B:31:0x00bf, B:33:0x00c5, B:34:0x00c7), top: B:197:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0125 A[Catch: LoadingException -> 0x023c, RemoteException -> 0x0240, all -> 0x0273, TryCatch #17 {RemoteException -> 0x0240, LoadingException -> 0x023c, all -> 0x0273, blocks: (B:30:0x00be, B:36:0x00ca, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011f, B:57:0x0125, B:59:0x0150, B:61:0x0158, B:62:0x015f, B:63:0x0166, B:58:0x013b, B:66:0x0169, B:67:0x016a, B:68:0x0171, B:69:0x0172, B:70:0x0179, B:73:0x017c, B:74:0x017d, B:76:0x019c, B:78:0x01b1), top: B:208:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013b A[Catch: LoadingException -> 0x023c, RemoteException -> 0x0240, all -> 0x0273, TryCatch #17 {RemoteException -> 0x0240, LoadingException -> 0x023c, all -> 0x0273, blocks: (B:30:0x00be, B:36:0x00ca, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011f, B:57:0x0125, B:59:0x0150, B:61:0x0158, B:62:0x015f, B:63:0x0166, B:58:0x013b, B:66:0x0169, B:67:0x016a, B:68:0x0171, B:69:0x0172, B:70:0x0179, B:73:0x017c, B:74:0x017d, B:76:0x019c, B:78:0x01b1), top: B:208:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0158 A[Catch: LoadingException -> 0x023c, RemoteException -> 0x0240, all -> 0x0273, TryCatch #17 {RemoteException -> 0x0240, LoadingException -> 0x023c, all -> 0x0273, blocks: (B:30:0x00be, B:36:0x00ca, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011f, B:57:0x0125, B:59:0x0150, B:61:0x0158, B:62:0x015f, B:63:0x0166, B:58:0x013b, B:66:0x0169, B:67:0x016a, B:68:0x0171, B:69:0x0172, B:70:0x0179, B:73:0x017c, B:74:0x017d, B:76:0x019c, B:78:0x01b1), top: B:208:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015f A[Catch: LoadingException -> 0x023c, RemoteException -> 0x0240, all -> 0x0273, TryCatch #17 {RemoteException -> 0x0240, LoadingException -> 0x023c, all -> 0x0273, blocks: (B:30:0x00be, B:36:0x00ca, B:38:0x00d1, B:39:0x00ec, B:43:0x00f2, B:45:0x00fa, B:47:0x00fe, B:48:0x010c, B:55:0x011f, B:57:0x0125, B:59:0x0150, B:61:0x0158, B:62:0x015f, B:63:0x0166, B:58:0x013b, B:66:0x0169, B:67:0x016a, B:68:0x0171, B:69:0x0172, B:70:0x0179, B:73:0x017c, B:74:0x017d, B:76:0x019c, B:78:0x01b1), top: B:208:0x00be }] */
    /* JADX WARN: Instruction removed from duplicated block: B:177:0x0308, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.dynamite.DynamiteModule$a] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule m7625c(Context context, InterfaceC2574a interfaceC2574a, String str) throws LoadingException {
        int i10;
        ?? r10;
        int i11;
        InterfaceC8214a interfaceC8214aM16622h0;
        DynamiteModule dynamiteModule;
        Cursor cursor;
        C8517i c8517i;
        Context applicationContext;
        Cursor cursor2;
        Boolean boolValueOf;
        InterfaceC8214a interfaceC8214aM16624h0;
        Context context2;
        Cursor cursor3;
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f14031i;
        C8515g c8515g = (C8515g) threadLocal.get();
        C8515g c8515g2 = new C8515g(0);
        threadLocal.set(c8515g2);
        C8514f c8514f = f14032j;
        long jLongValue = ((Long) c8514f.get()).longValue();
        try {
            c8514f.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC2574a.b bVarMo7632a = interfaceC2574a.mo7632a(context, str, f14033k);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + bVarMo7632a.f14037a + " and remote module " + str + ":" + bVarMo7632a.f14038b);
            int i12 = bVarMo7632a.f14039c;
            if (i12 != 0) {
                if (i12 != -1) {
                    i10 = i12;
                    ?? r11 = 1;
                    context = 1;
                    if (i10 == 1 || bVarMo7632a.f14038b != 0) {
                        if (i10 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext2);
                            if (jLongValue == 0) {
                                c8514f.remove();
                            } else {
                                c8514f.set(Long.valueOf(jLongValue));
                            }
                            cursor3 = c8515g2.f45781a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(c8515g);
                            return dynamiteModule2;
                        }
                        if (i10 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i10);
                        }
                        try {
                            try {
                                int i13 = bVarMo7632a.f14038b;
                                try {
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (!m7629g(context)) {
                                                Boolean bool = f14026d;
                                            } else {
                                                try {
                                                    throw new LoadingException("Remote loading disabled");
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            while (true) {
                                            }
                                            throw th;
                                        }
                                        break;
                                        throw th;
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        throw new LoadingException("Failed to load remote module.", e);
                                    } catch (LoadingException e11) {
                                        throw e11;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable th4 = th;
                                        try {
                                            C6272i.m12915i(context);
                                        } catch (Exception e12) {
                                            Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
                                        }
                                        throw new LoadingException("Failed to load remote module.", th4);
                                    }
                                } catch (RemoteException e13) {
                                    e = e13;
                                } catch (LoadingException e14) {
                                    e = e14;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (LoadingException e15) {
                                e = e15;
                                r11 = context;
                                r10 = interfaceC2574a;
                                Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                                i11 = bVarMo7632a.f14037a;
                                if (i11 != 0 || r10.mo7632a(r11, str, new C2578d(i11)).f14039c != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                DynamiteModule dynamiteModule3 = new DynamiteModule(applicationContext2);
                                if (jLongValue == 0) {
                                    f14032j.remove();
                                } else {
                                    f14032j.set(Long.valueOf(jLongValue));
                                }
                                Cursor cursor4 = c8515g2.f45781a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f14031i.set(c8515g);
                                return dynamiteModule3;
                            }
                        } catch (LoadingException e16) {
                            e = e16;
                            r10 = i10;
                            Log.w("DynamiteModule", "Failed to load remote module: " + e.getMessage());
                            i11 = bVarMo7632a.f14037a;
                            if (i11 != 0) {
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (bVarMo7632a.f14037a != 0) {
                    i10 = i12;
                    i10 = -1;
                    i10 = i12;
                    ?? r12 = 1;
                    context = 1;
                    if (i10 == 1) {
                    }
                    if (i10 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        DynamiteModule dynamiteModule4 = new DynamiteModule(applicationContext2);
                        if (jLongValue == 0) {
                            c8514f.remove();
                        } else {
                            c8514f.set(Long.valueOf(jLongValue));
                        }
                        cursor3 = c8515g2.f45781a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        threadLocal.set(c8515g);
                        return dynamiteModule4;
                    }
                    if (i10 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i10);
                    }
                    int i14 = bVarMo7632a.f14038b;
                    synchronized (DynamiteModule.class) {
                        if (!m7629g(context)) {
                            throw new LoadingException("Remote loading disabled");
                        }
                        Boolean bool2 = f14026d;
                        try {
                            if (bool2 == null) {
                                throw new LoadingException("Failed to determine which loading route to use.");
                            }
                            if (bool2.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i14);
                                synchronized (DynamiteModule.class) {
                                    c8517i = f14035m;
                                }
                                if (boolValueOf.booleanValue()) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    interfaceC8214aM16624h0 = c8517i.m16623b1(new BinderC8215b(applicationContext), str, i14, new BinderC8215b(cursor2));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    interfaceC8214aM16624h0 = c8517i.m16624h0(new BinderC8215b(applicationContext), str, i14, new BinderC8215b(cursor2));
                                }
                                context2 = (Context) BinderC8215b.m16362h0(interfaceC8214aM16624h0);
                                if (context2 != null) {
                                    throw new LoadingException("Failed to get module context");
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i14);
                                C8516h c8516hM7630h = m7630h(context);
                                if (c8516hM7630h == null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelM18400h = c8516hM7630h.m18400h(c8516hM7630h.m18401j(), 6);
                                int i15 = parcelM18400h.readInt();
                                parcelM18400h.recycle();
                                if (i15 >= 3) {
                                    C8515g c8515g3 = (C8515g) threadLocal.get();
                                    if (c8515g3 == null) {
                                        throw new LoadingException("No cached result cursor holder");
                                    }
                                    try {
                                        interfaceC8214aM16622h0 = c8516hM7630h.m16619b1(new BinderC8215b(context), str, i14, new BinderC8215b(c8515g3.f45781a));
                                    } catch (RemoteException e17) {
                                        e = e17;
                                        throw new LoadingException("Failed to load remote module.", e);
                                    } catch (LoadingException e18) {
                                        e = e18;
                                        throw e;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        context = context;
                                        Throwable th7 = th;
                                        C6272i.m12915i(context);
                                        throw new LoadingException("Failed to load remote module.", th7);
                                    }
                                } else if (i15 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    interfaceC8214aM16622h0 = c8516hM7630h.m16620d1(new BinderC8215b(context), str, i14);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    interfaceC8214aM16622h0 = c8516hM7630h.m16622h0(new BinderC8215b(context), str, i14);
                                }
                                Object objM16362h0 = BinderC8215b.m16362h0(interfaceC8214aM16622h0);
                                if (objM16362h0 == null) {
                                    throw new LoadingException("Failed to load remote module.");
                                }
                                dynamiteModule = new DynamiteModule((Context) objM16362h0);
                            }
                            if (jLongValue == 0) {
                                c8514f.remove();
                            } else {
                                c8514f.set(Long.valueOf(jLongValue));
                            }
                            cursor = c8515g2.f45781a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(c8515g);
                            return dynamiteModule;
                        } catch (RemoteException e19) {
                            e = e19;
                            throw new LoadingException("Failed to load remote module.", e);
                        } catch (LoadingException e20) {
                            e = e20;
                            throw e;
                        } catch (Throwable th8) {
                            th = th8;
                            Throwable th9 = th;
                            C6272i.m12915i(context);
                            throw new LoadingException("Failed to load remote module.", th9);
                        }
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    if (c8517i == null) {
                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                    }
                    C8515g c8515g4 = (C8515g) threadLocal.get();
                    if (c8515g4 == null || c8515g4.f45781a == null) {
                        throw new LoadingException("No result cursor");
                    }
                    applicationContext = context.getApplicationContext();
                    cursor2 = c8515g4.f45781a;
                    new BinderC8215b(null);
                    synchronized (DynamiteModule.class) {
                        boolValueOf = Boolean.valueOf(f14029g >= 2);
                        if (boolValueOf.booleanValue()) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            interfaceC8214aM16624h0 = c8517i.m16623b1(new BinderC8215b(applicationContext), str, i14, new BinderC8215b(cursor2));
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            interfaceC8214aM16624h0 = c8517i.m16624h0(new BinderC8215b(applicationContext), str, i14, new BinderC8215b(cursor2));
                        }
                        context2 = (Context) BinderC8215b.m16362h0(interfaceC8214aM16624h0);
                        if (context2 != null) {
                            throw new LoadingException("Failed to get module context");
                        }
                        dynamiteModule = new DynamiteModule(context2);
                        if (jLongValue == 0) {
                            c8514f.remove();
                        } else {
                            c8514f.set(Long.valueOf(jLongValue));
                        }
                        cursor = c8515g2.f45781a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(c8515g);
                        return dynamiteModule;
                    }
                }
            }
            i10 = i12;
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + bVarMo7632a.f14037a + " and remote version is " + bVarMo7632a.f14038b + ".");
        } catch (Throwable th10) {
            if (jLongValue == 0) {
                f14032j.remove();
            } else {
                f14032j.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = c8515g2.f45781a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f14031i.set(c8515g);
            throw th10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[Catch: all -> 0x00dc, TryCatch #13 {all -> 0x00dc, blocks: (B:9:0x002f, B:11:0x003e, B:53:0x00da, B:16:0x0047, B:17:0x004b, B:18:0x004f, B:21:0x0058, B:24:0x005b, B:26:0x0060, B:30:0x006c, B:32:0x0076, B:48:0x00c3, B:35:0x0080, B:42:0x00b5, B:43:0x00be, B:38:0x0089, B:40:0x0090, B:41:0x00a4, B:51:0x00c6, B:52:0x00d1), top: B:157:0x002f, inners: #12 }] */
    /* JADX INFO: renamed from: d */
    public static int m7626d(Context context, String str, boolean z10) {
        Throwable th2;
        Cursor cursor;
        RemoteException e10;
        int i10;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                try {
                    Boolean bool = f14026d;
                    boolean z11 = true;
                    Cursor cursor3 = null;
                    if (bool == null) {
                        try {
                            Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                            synchronized (declaredField.getDeclaringClass()) {
                                try {
                                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                                        bool = Boolean.FALSE;
                                    } else if (classLoader != null) {
                                        try {
                                            m7628f(classLoader);
                                        } catch (LoadingException unused) {
                                        }
                                        bool = Boolean.TRUE;
                                    } else {
                                        if (!m7629g(context)) {
                                            return 0;
                                        }
                                        if (f14028f) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            Boolean bool2 = Boolean.TRUE;
                                            if (bool2.equals(null)) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            } else {
                                                try {
                                                    int iM7627e = m7627e(context, str, z10, true);
                                                    String str2 = f14027e;
                                                    if (str2 == null || str2.isEmpty()) {
                                                        return iM7627e;
                                                    }
                                                    ClassLoader classLoaderM16618a = C8512d.m16618a();
                                                    if (classLoaderM16618a == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            C8510b.m16617a();
                                                            String str3 = f14027e;
                                                            C6272i.m12915i(str3);
                                                            classLoaderM16618a = C8509a.m16616a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f14027e;
                                                            C6272i.m12915i(str4);
                                                            classLoaderM16618a = new C8513e(ClassLoader.getSystemClassLoader(), str4);
                                                        }
                                                    }
                                                    m7628f(classLoaderM16618a);
                                                    declaredField.set(null, classLoaderM16618a);
                                                    f14026d = bool2;
                                                    return iM7627e;
                                                } catch (LoadingException unused2) {
                                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    }
                                    f14026d = bool;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                            Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                            bool = Boolean.FALSE;
                        }
                    }
                    if (bool.booleanValue()) {
                        try {
                            return m7627e(context, str, z10, false);
                        } catch (LoadingException e12) {
                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                            return 0;
                        }
                    }
                    C8516h c8516hM7630h = m7630h(context);
                    try {
                        if (c8516hM7630h == null) {
                            return 0;
                        }
                        try {
                            Parcel parcelM18400h = c8516hM7630h.m18400h(c8516hM7630h.m18401j(), 6);
                            int i11 = parcelM18400h.readInt();
                            parcelM18400h.recycle();
                            if (i11 >= 3) {
                                ThreadLocal threadLocal = f14031i;
                                C8515g c8515g = (C8515g) threadLocal.get();
                                if (c8515g != null && (cursor2 = c8515g.f45781a) != null) {
                                    return cursor2.getInt(0);
                                }
                                cursor = (Cursor) BinderC8215b.m16362h0(c8516hM7630h.m16621e1(new BinderC8215b(context), str, z10, ((Long) f14032j.get()).longValue()));
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            i10 = cursor.getInt(0);
                                            if (i10 <= 0) {
                                                cursor3 = cursor;
                                            } else {
                                                C8515g c8515g2 = (C8515g) threadLocal.get();
                                                if (c8515g2 == null || c8515g2.f45781a != null) {
                                                    z11 = false;
                                                } else {
                                                    c8515g2.f45781a = cursor;
                                                }
                                                if (!z11) {
                                                    cursor3 = cursor;
                                                }
                                            }
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        }
                                    } catch (RemoteException e13) {
                                        e10 = e13;
                                        cursor3 = cursor;
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                        if (cursor3 == null) {
                                            return 0;
                                        }
                                        cursor3.close();
                                        return 0;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th2;
                                    }
                                }
                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                if (cursor == null) {
                                    return 0;
                                }
                                cursor.close();
                                return 0;
                            }
                            if (i11 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                BinderC8215b binderC8215b = new BinderC8215b(context);
                                Parcel parcelM18401j = c8516hM7630h.m18401j();
                                C9897c.m18404c(parcelM18401j, binderC8215b);
                                parcelM18401j.writeString(str);
                                parcelM18401j.writeInt(z10 ? 1 : 0);
                                Parcel parcelM18400h2 = c8516hM7630h.m18400h(parcelM18401j, 5);
                                i10 = parcelM18400h2.readInt();
                                parcelM18400h2.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                BinderC8215b binderC8215b2 = new BinderC8215b(context);
                                Parcel parcelM18401j2 = c8516hM7630h.m18401j();
                                C9897c.m18404c(parcelM18401j2, binderC8215b2);
                                parcelM18401j2.writeString(str);
                                parcelM18401j2.writeInt(z10 ? 1 : 0);
                                Parcel parcelM18400h3 = c8516hM7630h.m18400h(parcelM18401j2, 3);
                                i10 = parcelM18400h3.readInt();
                                parcelM18400h3.recycle();
                            }
                            return i10;
                        } catch (RemoteException e14) {
                            e10 = e14;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        cursor = null;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            try {
                C6272i.m12915i(context);
            } catch (Exception e15) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e15);
            }
            throw th7;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static int m7627e(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Exception e10;
        boolean z12;
        Cursor cursor = null;
        try {
            boolean z13 = true;
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f14032j.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z14 = false;
                        int i10 = cursorQuery.getInt(0);
                        if (i10 > 0) {
                            synchronized (DynamiteModule.class) {
                                try {
                                    f14027e = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f14029g = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        z12 = cursorQuery.getInt(columnIndex2) != 0;
                                        f14028f = z12;
                                    } else {
                                        z12 = false;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            C8515g c8515g = (C8515g) f14031i.get();
                            if (c8515g == null || c8515g.f45781a != null) {
                                z13 = false;
                            } else {
                                c8515g.f45781a = cursorQuery;
                            }
                            if (!z13) {
                                cursor = cursorQuery;
                            }
                            z14 = z12;
                        } else {
                            cursor = cursorQuery;
                        }
                        if (!z11 || !z14) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                        }
                        try {
                            try {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            } catch (Exception e11) {
                                e10 = e11;
                                if (e10 instanceof LoadingException) {
                                    throw e10;
                                }
                                throw new LoadingException("V2 version check failed: " + e10.getMessage(), e10);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e12) {
                    e10 = e12;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorQuery;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e13) {
            e10 = e13;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static void m7628f(ClassLoader classLoader) throws LoadingException {
        C8517i c8517i;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c8517i = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c8517i = iInterfaceQueryLocalInterface instanceof C8517i ? (C8517i) iInterfaceQueryLocalInterface : new C8517i(iBinder);
            }
            f14035m = c8517i;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7629g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(null) && !bool.equals(f14030h)) {
            boolean zBooleanValue = false;
            if (f14030h == null) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                if (C2549d.f13922b.mo7586c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    zBooleanValue = true;
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                f14030h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
                if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                    Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                    f14028f = true;
                }
            }
            if (!zBooleanValue) {
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
            }
            return zBooleanValue;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static C8516h m7630h(Context context) {
        C8516h c8516h;
        synchronized (DynamiteModule.class) {
            C8516h c8516h2 = f14034l;
            if (c8516h2 != null) {
                return c8516h2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c8516h = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c8516h = iInterfaceQueryLocalInterface instanceof C8516h ? (C8516h) iInterfaceQueryLocalInterface : new C8516h(iBinder);
                }
                if (c8516h != null) {
                    f14034l = c8516h;
                    return c8516h;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final IBinder m7631b(String str) throws LoadingException {
        try {
            return (IBinder) this.f14036a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
