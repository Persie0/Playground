package p000;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjn {

    /* JADX INFO: renamed from: c */
    private static Boolean f34173c;

    /* JADX INFO: renamed from: d */
    private static String f34174d;

    /* JADX INFO: renamed from: e */
    private static boolean f34175e;

    /* JADX INFO: renamed from: l */
    private static jjo f34181l;

    /* JADX INFO: renamed from: m */
    private static jjp f34182m;

    /* JADX INFO: renamed from: k */
    private final Context f34183k;

    /* JADX INFO: renamed from: f */
    private static int f34176f = -1;

    /* JADX INFO: renamed from: g */
    private static Boolean f34177g = null;

    /* JADX INFO: renamed from: h */
    private static final ThreadLocal f34178h = new ThreadLocal();

    /* JADX INFO: renamed from: i */
    private static final ThreadLocal f34179i = new jjf();

    /* JADX INFO: renamed from: j */
    private static final jjk f34180j = new jjg();

    /* JADX INFO: renamed from: a */
    public static final jjm f34171a = new jjh(1);

    /* JADX INFO: renamed from: b */
    public static final jjm f34172b = new jjh(0);

    private jjn(Context context) {
        this.f34183k = context;
    }

    /* JADX INFO: renamed from: a */
    public static int m13310a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (jib.m13209n(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x020b A[Catch: all -> 0x0212, TryCatch #10 {all -> 0x0212, blocks: (B:3:0x0002, B:60:0x00c9, B:62:0x00cf, B:67:0x00f1, B:96:0x0176, B:100:0x0186, B:124:0x020b, B:125:0x020e, B:117:0x0201, B:65:0x00d5, B:128:0x0211, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:58:0x00c6, B:21:0x0046, B:39:0x0085, B:42:0x0088, B:51:0x00a3, B:59:0x00c8, B:57:0x00a9), top: B:138:0x0002, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:153:? A[Catch: all -> 0x0212, SYNTHETIC, TRY_LEAVE, TryCatch #10 {all -> 0x0212, blocks: (B:3:0x0002, B:60:0x00c9, B:62:0x00cf, B:67:0x00f1, B:96:0x0176, B:100:0x0186, B:124:0x020b, B:125:0x020e, B:117:0x0201, B:65:0x00d5, B:128:0x0211, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:58:0x00c6, B:21:0x0046, B:39:0x0085, B:42:0x0088, B:51:0x00a3, B:59:0x00c8, B:57:0x00a9), top: B:138:0x0002, inners: #9, #13 }] */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.database.Cursor, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public static int m13311b(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e;
        jjc jjaVar;
        ?? r1;
        try {
            synchronized (jjn.class) {
                Boolean bool = f34173c;
                Cursor cursor = null;
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
                                        m13314f(classLoader);
                                    } catch (jjj e2) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m13316h(context)) {
                                        return 0;
                                    }
                                    if (f34175e || Boolean.TRUE.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iM13313e = m13313e(context, str, z, true);
                                            String str2 = f34174d;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderM13306a = jje.m13306a();
                                                if (classLoaderM13306a == null) {
                                                    String str3 = f34174d;
                                                    jib.m13205j(str3);
                                                    classLoaderM13306a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                }
                                                m13314f(classLoaderM13306a);
                                                declaredField.set(null, classLoaderM13306a);
                                                f34173c = Boolean.TRUE;
                                                return iM13313e;
                                            }
                                            return iM13313e;
                                        } catch (jjj e3) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                                f34173c = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e4) {
                        Log.w("DynamiteModule", xPAWq.xoWyArBXxI + e4.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m13313e(context, str, z, false);
                    } catch (jjj e5) {
                        Log.w(gBCSQzBeB.EwtEzczo, "Failed to retrieve remote module version: " + e5.getMessage());
                        return 0;
                    }
                }
                jjo jjoVarM13318j = m13318j(context);
                if (jjoVarM13318j == null) {
                    return 0;
                }
                try {
                    int iM13320e = jjoVarM13318j.m13320e();
                    if (iM13320e < 3) {
                        if (iM13320e == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            jjc jjcVarM13304b = jjb.m13304b(context);
                            Parcel parcelM3398a = jjoVarM13318j.m3398a();
                            cbs.m3405d(parcelM3398a, jjcVarM13304b);
                            parcelM3398a.writeString(str);
                            parcelM3398a.writeInt(z ? 1 : 0);
                            Parcel parcelM3399y = jjoVarM13318j.m3399y(5, parcelM3398a);
                            int i = parcelM3399y.readInt();
                            parcelM3399y.recycle();
                            return i;
                        }
                        Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                        jjc jjcVarM13304b2 = jjb.m13304b(context);
                        Parcel parcelM3398a2 = jjoVarM13318j.m3398a();
                        cbs.m3405d(parcelM3398a2, jjcVarM13304b2);
                        parcelM3398a2.writeString(str);
                        parcelM3398a2.writeInt(z ? 1 : 0);
                        Parcel parcelM3399y2 = jjoVarM13318j.m3399y(3, parcelM3398a2);
                        int i2 = parcelM3399y2.readInt();
                        parcelM3399y2.recycle();
                        return i2;
                    }
                    nax naxVar = (nax) f34178h.get();
                    if (naxVar != null && (r1 = naxVar.f41919a) != 0) {
                        return r1.getInt(0);
                    }
                    jjc jjcVarM13304b3 = jjb.m13304b(context);
                    long jLongValue = ((Long) f34179i.get()).longValue();
                    Parcel parcelM3398a3 = jjoVarM13318j.m3398a();
                    cbs.m3405d(parcelM3398a3, jjcVarM13304b3);
                    parcelM3398a3.writeString(str);
                    parcelM3398a3.writeInt(z ? 1 : 0);
                    parcelM3398a3.writeLong(jLongValue);
                    Parcel parcelM3399y3 = jjoVarM13318j.m3399y(7, parcelM3398a3);
                    IBinder strongBinder = parcelM3399y3.readStrongBinder();
                    if (strongBinder == null) {
                        jjaVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        jjaVar = iInterfaceQueryLocalInterface instanceof jjc ? (jjc) iInterfaceQueryLocalInterface : new jja(strongBinder);
                    }
                    parcelM3399y3.recycle();
                    Cursor cursor2 = (Cursor) jjb.m13305c(jjaVar);
                    if (cursor2 != null) {
                        try {
                            if (cursor2.moveToFirst()) {
                                int i3 = cursor2.getInt(0);
                                cursor = (i3 <= 0 || !m13315g(cursor2)) ? cursor2 : null;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return i3;
                            }
                        } catch (RemoteException e6) {
                            e = e6;
                            cursor = cursor2;
                            try {
                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                if (cursor == null) {
                                    return 0;
                                }
                                cursor.close();
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = cursor2;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return 0;
                } catch (RemoteException e7) {
                    e = e7;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            jiy.m13279f(context);
            throw th6;
        }
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public static jjn m13312d(Context context, jjm jjmVar, String str) throws jjj {
        int i;
        jjn jjnVar;
        jjp jjpVar;
        Boolean boolValueOf;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new jjj("null application Context");
        }
        ThreadLocal threadLocal = f34178h;
        nax naxVar = (nax) threadLocal.get();
        nax naxVar2 = new nax();
        threadLocal.set(naxVar2);
        ThreadLocal threadLocal2 = f34179i;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            jjl jjlVarMo13309a = jjmVar.mo13309a(context, str, f34180j);
            int i2 = jjlVarMo13309a.f34170c;
            if (i2 == 0 || ((i2 == -1 && jjlVarMo13309a.f34168a == 0) || (i2 == 1 && jjlVarMo13309a.f34169b == 0))) {
                throw new jjj(DNTdN.xcpdSswNMnhA + str + " found. Local version is " + jjlVarMo13309a.f34168a + " and remote version is " + jjlVarMo13309a.f34169b + ".");
            }
            if (i2 == -1) {
                jjn jjnVarM13317i = m13317i(applicationContext);
                if (jLongValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(jLongValue));
                }
                ?? r2 = naxVar2.f41919a;
                if (r2 != 0) {
                    r2.close();
                }
                threadLocal.set(naxVar);
                return jjnVarM13317i;
            }
            if (i2 != 1) {
                throw new jjj("VersionPolicy returned invalid code:0");
            }
            try {
                try {
                    int i3 = jjlVarMo13309a.f34169b;
                    try {
                        try {
                            try {
                                synchronized (jjn.class) {
                                    try {
                                        if (!m13316h(context)) {
                                            throw new jjj("Remote loading disabled");
                                        }
                                        Boolean bool = f34173c;
                                        if (bool == null) {
                                            throw new jjj("Failed to determine which loading route to use.");
                                        }
                                        jjc jjaVar = null;
                                        if (bool.booleanValue()) {
                                            synchronized (jjn.class) {
                                                try {
                                                    jjpVar = f34182m;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    while (true) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                }
                                            }
                                            if (jjpVar == null) {
                                                throw new jjj("DynamiteLoaderV2 was not cached.");
                                            }
                                            nax naxVar3 = (nax) threadLocal.get();
                                            if (naxVar3 == null || naxVar3.f41919a == null) {
                                                throw new jjj("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Object obj = naxVar3.f41919a;
                                            jjb.m13304b(null);
                                            synchronized (jjn.class) {
                                                boolValueOf = Boolean.valueOf(f34176f >= 2);
                                            }
                                            if (boolValueOf.booleanValue()) {
                                                jjc jjcVarM13304b = jjb.m13304b(applicationContext2);
                                                jjc jjcVarM13304b2 = jjb.m13304b(obj);
                                                Parcel parcelM3398a = jjpVar.m3398a();
                                                cbs.m3405d(parcelM3398a, jjcVarM13304b);
                                                parcelM3398a.writeString(str);
                                                parcelM3398a.writeInt(i3);
                                                cbs.m3405d(parcelM3398a, jjcVarM13304b2);
                                                Parcel parcelM3399y = jjpVar.m3399y(3, parcelM3398a);
                                                IBinder strongBinder = parcelM3399y.readStrongBinder();
                                                if (strongBinder != null) {
                                                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    jjaVar = iInterfaceQueryLocalInterface instanceof jjc ? (jjc) iInterfaceQueryLocalInterface : new jja(strongBinder);
                                                }
                                                parcelM3399y.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                jjc jjcVarM13304b3 = jjb.m13304b(applicationContext2);
                                                jjc jjcVarM13304b4 = jjb.m13304b(obj);
                                                Parcel parcelM3398a2 = jjpVar.m3398a();
                                                cbs.m3405d(parcelM3398a2, jjcVarM13304b3);
                                                parcelM3398a2.writeString(str);
                                                parcelM3398a2.writeInt(i3);
                                                cbs.m3405d(parcelM3398a2, jjcVarM13304b4);
                                                Parcel parcelM3399y2 = jjpVar.m3399y(2, parcelM3398a2);
                                                IBinder strongBinder2 = parcelM3399y2.readStrongBinder();
                                                if (strongBinder2 != null) {
                                                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    jjaVar = iInterfaceQueryLocalInterface2 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface2 : new jja(strongBinder2);
                                                }
                                                parcelM3399y2.recycle();
                                            }
                                            Context context2 = (Context) jjb.m13305c(jjaVar);
                                            if (context2 == null) {
                                                throw new jjj("Failed to get module context");
                                            }
                                            jjnVar = new jjn(context2);
                                        } else {
                                            jjo jjoVarM13318j = m13318j(context);
                                            if (jjoVarM13318j == null) {
                                                throw new jjj("Failed to create IDynamiteLoader.");
                                            }
                                            int iM13320e = jjoVarM13318j.m13320e();
                                            if (iM13320e >= 3) {
                                                nax naxVar4 = (nax) threadLocal.get();
                                                if (naxVar4 == null) {
                                                    throw new jjj("No cached result cursor holder");
                                                }
                                                jjc jjcVarM13304b5 = jjb.m13304b(context);
                                                jjc jjcVarM13304b6 = jjb.m13304b(naxVar4.f41919a);
                                                Parcel parcelM3398a3 = jjoVarM13318j.m3398a();
                                                cbs.m3405d(parcelM3398a3, jjcVarM13304b5);
                                                parcelM3398a3.writeString(str);
                                                parcelM3398a3.writeInt(i3);
                                                cbs.m3405d(parcelM3398a3, jjcVarM13304b6);
                                                Parcel parcelM3399y3 = jjoVarM13318j.m3399y(8, parcelM3398a3);
                                                IBinder strongBinder3 = parcelM3399y3.readStrongBinder();
                                                if (strongBinder3 != null) {
                                                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    jjaVar = iInterfaceQueryLocalInterface3 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface3 : new jja(strongBinder3);
                                                }
                                                parcelM3399y3.recycle();
                                            } else if (iM13320e == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                jjc jjcVarM13304b7 = jjb.m13304b(context);
                                                Parcel parcelM3398a4 = jjoVarM13318j.m3398a();
                                                cbs.m3405d(parcelM3398a4, jjcVarM13304b7);
                                                parcelM3398a4.writeString(str);
                                                parcelM3398a4.writeInt(i3);
                                                Parcel parcelM3399y4 = jjoVarM13318j.m3399y(4, parcelM3398a4);
                                                IBinder strongBinder4 = parcelM3399y4.readStrongBinder();
                                                if (strongBinder4 != null) {
                                                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    jjaVar = iInterfaceQueryLocalInterface4 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface4 : new jja(strongBinder4);
                                                }
                                                parcelM3399y4.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                jjc jjcVarM13304b8 = jjb.m13304b(context);
                                                Parcel parcelM3398a5 = jjoVarM13318j.m3398a();
                                                cbs.m3405d(parcelM3398a5, jjcVarM13304b8);
                                                parcelM3398a5.writeString(str);
                                                parcelM3398a5.writeInt(i3);
                                                Parcel parcelM3399y5 = jjoVarM13318j.m3399y(2, parcelM3398a5);
                                                IBinder strongBinder5 = parcelM3399y5.readStrongBinder();
                                                if (strongBinder5 != null) {
                                                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    jjaVar = iInterfaceQueryLocalInterface5 instanceof jjc ? (jjc) iInterfaceQueryLocalInterface5 : new jja(strongBinder5);
                                                }
                                                parcelM3399y5.recycle();
                                            }
                                            Object objM13305c = jjb.m13305c(jjaVar);
                                            if (objM13305c == null) {
                                                throw new jjj("Failed to load remote module.");
                                            }
                                            jjnVar = new jjn((Context) objM13305c);
                                        }
                                        if (jLongValue == 0) {
                                            threadLocal2.remove();
                                        } else {
                                            threadLocal2.set(Long.valueOf(jLongValue));
                                        }
                                        ?? r1 = naxVar2.f41919a;
                                        if (r1 != 0) {
                                            r1.close();
                                        }
                                        threadLocal.set(naxVar);
                                        return jjnVar;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (RemoteException e) {
                            e = e;
                            throw new jjj("Failed to load remote module.", e);
                        } catch (jjj e2) {
                            e = e2;
                            throw e;
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = th;
                            jiy.m13279f(context);
                            throw new jjj("Failed to load remote module.", th6);
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        throw new jjj("Failed to load remote module.", e);
                    } catch (jjj e4) {
                        e = e4;
                        throw e;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        jiy.m13279f(context);
                        throw new jjj("Failed to load remote module.", th8);
                    }
                } catch (jjj e5) {
                    e = e5;
                    jjj jjjVar = e;
                    Log.w("DynamiteModule", "Failed to load remote module: " + jjjVar.getMessage());
                    i = jjlVarMo13309a.f34168a;
                    if (i != 0 || jjmVar.mo13309a(context, str, new jji(i)).f34170c != -1) {
                        throw new jjj("Remote load failed. No local fallback found.", jjjVar);
                    }
                    jjn jjnVarM13317i2 = m13317i(applicationContext);
                    if (jLongValue == 0) {
                        f34179i.remove();
                    } else {
                        f34179i.set(Long.valueOf(jLongValue));
                    }
                    ?? r3 = naxVar2.f41919a;
                    if (r3 != 0) {
                        r3.close();
                    }
                    f34178h.set(naxVar);
                    return jjnVarM13317i2;
                }
            } catch (jjj e6) {
                e = e6;
                jjj jjjVar2 = e;
                Log.w("DynamiteModule", "Failed to load remote module: " + jjjVar2.getMessage());
                i = jjlVarMo13309a.f34168a;
                if (i != 0) {
                }
                throw new jjj("Remote load failed. No local fallback found.", jjjVar2);
            }
        } catch (Throwable th9) {
            if (jLongValue == 0) {
                f34179i.remove();
            } else {
                f34179i.set(Long.valueOf(jLongValue));
            }
            ?? r4 = naxVar2.f41919a;
            if (r4 != 0) {
                r4.close();
            }
            f34178h.set(naxVar);
            throw th9;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m13313e(Context context, String str, boolean z, boolean z2) throws Throwable {
        Cursor cursor = null;
        try {
            boolean z3 = true;
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f34179i.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z4 = false;
                        int i = cursorQuery.getInt(0);
                        if (i > 0) {
                            synchronized (jjn.class) {
                                f34174d = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    f34176f = cursorQuery.getInt(columnIndex);
                                }
                                int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                if (columnIndex2 >= 0) {
                                    if (cursorQuery.getInt(columnIndex2) == 0) {
                                        z3 = false;
                                    }
                                    f34175e = z3;
                                    z4 = z3;
                                }
                            }
                            if (!m13315g(cursorQuery)) {
                                cursor = cursorQuery;
                            }
                        } else {
                            cursor = cursorQuery;
                        }
                        if (!z2 || !z4) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                        try {
                            try {
                                throw new jjj("forcing fallback to container DynamiteLoader impl");
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof jjj) {
                                    throw e;
                                }
                                throw new jjj("V2 version check failed: " + e.getMessage(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    cursor = cursorQuery;
                    th = th2;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new jjj("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m13314f(ClassLoader classLoader) throws jjj {
        jjp jjpVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jjpVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jjpVar = iInterfaceQueryLocalInterface instanceof jjp ? (jjp) iInterfaceQueryLocalInterface : new jjp(iBinder);
            }
            f34182m = jjpVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new jjj("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m13315g(Cursor cursor) {
        nax naxVar = (nax) f34178h.get();
        if (naxVar == null || naxVar.f41919a != null) {
            return false;
        }
        naxVar.f41919a = cursor;
        return true;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m13316h(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(f34177g)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f34177g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (jcz.f33770d.m12902f(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f34177g = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                f34175e = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: i */
    private static jjn m13317i(Context context) {
        return new jjn(context);
    }

    /* JADX INFO: renamed from: j */
    private static jjo m13318j(Context context) {
        jjo jjoVar;
        synchronized (jjn.class) {
            jjo jjoVar2 = f34181l;
            if (jjoVar2 != null) {
                return jjoVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext(gBCSQzBeB.oghunjerStTWcO, 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jjoVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jjoVar = iInterfaceQueryLocalInterface instanceof jjo ? (jjo) iInterfaceQueryLocalInterface : new jjo(iBinder);
                }
                if (jjoVar != null) {
                    f34181l = jjoVar;
                    return jjoVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final IBinder m13319c(String str) throws jjj {
        try {
            return (IBinder) this.f34183k.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new jjj("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
