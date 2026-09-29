package p067d8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookException;
import dm.C5207g;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import p291o7.C7993c0;
import p291o7.C8004n;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5055a {

    /* JADX INFO: renamed from: f */
    public static C5055a f32901f;

    /* JADX INFO: renamed from: a */
    public String f32902a;

    /* JADX INFO: renamed from: b */
    public long f32903b;

    /* JADX INFO: renamed from: c */
    public String f32904c;

    /* JADX INFO: renamed from: d */
    public String f32905d;

    /* JADX INFO: renamed from: e */
    public boolean f32906e;

    /* JADX INFO: renamed from: d8.a$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:115:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x007d  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0113 A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x011a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:57:0x011c A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x012b A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x013a  */
        /* JADX WARN: Code duplicated, block: B:65:0x013c A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0147 A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x014b A[Catch: all -> 0x0154, Exception -> 0x01c0, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0157 A[Catch: all -> 0x0154, Exception -> 0x01c0, TRY_LEAVE, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x016e  */
        /* JADX WARN: Code duplicated, block: B:78:0x016f A[Catch: Exception -> 0x01b6, all -> 0x01d8, TryCatch #5 {all -> 0x01d8, blocks: (B:75:0x0168, B:78:0x016f, B:81:0x0185, B:83:0x018b, B:86:0x01a7, B:97:0x01c2), top: B:114:0x00c9 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:93:0x01b8 A[Catch: all -> 0x0154, Exception -> 0x01c0, TRY_ENTER, TryCatch #8 {Exception -> 0x01c0, all -> 0x0154, blocks: (B:44:0x00c9, B:46:0x00d7, B:48:0x00db, B:51:0x00ea, B:53:0x0104, B:55:0x0113, B:62:0x0134, B:67:0x0147, B:69:0x014b, B:73:0x0157, B:65:0x013c, B:57:0x011c, B:59:0x012b, B:93:0x01b8, B:94:0x01bf), top: B:114:0x00c9 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX INFO: renamed from: a */
        public static C5055a m10738a(Context context) throws Throwable {
            C5055a c5055a;
            Cursor cursorQuery;
            C5055a c5055a2;
            String[] strArr;
            ProviderInfo providerInfoResolveContentProvider;
            ProviderInfo providerInfoResolveContentProvider2;
            Uri uri;
            String str;
            Uri uri2;
            PackageManager packageManager;
            String str2;
            int columnIndex;
            int columnIndex2;
            String str3;
            c cVar;
            Intent intent;
            Method methodM10834s;
            Object objM10837v;
            ?? r10 = 0;
            try {
                try {
                    try {
                        if (m10739b(context) && (methodM10834s = C5086z.m10834s("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) != null && (objM10837v = C5086z.m10837v(null, methodM10834s, context)) != null) {
                            Method methodM10833r = C5086z.m10833r(objM10837v.getClass(), "getId", new Class[0]);
                            Method methodM10833r2 = C5086z.m10833r(objM10837v.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                            if (methodM10833r != null && methodM10833r2 != null) {
                                c5055a = new C5055a();
                                c5055a.f32902a = (String) C5086z.m10837v(objM10837v, methodM10833r, new Object[0]);
                                Boolean bool = (Boolean) C5086z.m10837v(objM10837v, methodM10833r2, new Object[0]);
                                c5055a.f32906e = bool == null ? false : bool.booleanValue();
                            }
                            if (c5055a == null) {
                                if (m10739b(context)) {
                                    cVar = new c();
                                    intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                                    intent.setPackage("com.google.android.gms");
                                    try {
                                        try {
                                            if (context.bindService(intent, cVar, 1)) {
                                                try {
                                                    b bVar = new b(cVar.m10742a());
                                                    C5055a c5055a3 = new C5055a();
                                                    c5055a3.f32902a = bVar.m10740h();
                                                    c5055a3.f32906e = bVar.m10741j();
                                                    context.unbindService(cVar);
                                                    c5055a = c5055a3;
                                                } catch (Exception e10) {
                                                    C5086z.m10806E("android_id", e10);
                                                    context.unbindService(cVar);
                                                    c5055a = null;
                                                }
                                            } else {
                                                c5055a = null;
                                            }
                                        } catch (Throwable th2) {
                                            context.unbindService(cVar);
                                            throw th2;
                                        }
                                    } catch (SecurityException unused) {
                                    }
                                } else {
                                    c5055a = null;
                                }
                                if (c5055a == null) {
                                    c5055a = new C5055a();
                                }
                            }
                            if (!C5207g.m11106a(Looper.myLooper(), Looper.getMainLooper())) {
                                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                            }
                            c5055a2 = C5055a.f32901f;
                            if (c5055a2 == null && System.currentTimeMillis() - c5055a2.f32903b < 3600000) {
                                return c5055a2;
                            }
                            strArr = new String[]{"aid", "androidid", "limit_tracking"};
                            providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                            providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                            if (providerInfoResolveContentProvider != null) {
                                HashSet<String> hashSet = C5070j.f32956a;
                                str3 = providerInfoResolveContentProvider.packageName;
                                C5207g.m11110e(str3, "contentProviderInfo.packageName");
                                if (C5070j.m10766a(context, str3)) {
                                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                } else {
                                    if (providerInfoResolveContentProvider2 != null) {
                                        HashSet<String> hashSet2 = C5070j.f32956a;
                                        str = providerInfoResolveContentProvider2.packageName;
                                        C5207g.m11110e(str, "wakizashiProviderInfo.packageName");
                                        if (C5070j.m10766a(context, str)) {
                                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        }
                                    }
                                    uri = null;
                                }
                                uri = uri2;
                            } else {
                                if (providerInfoResolveContentProvider2 != null) {
                                    HashSet<String> hashSet3 = C5070j.f32956a;
                                    str = providerInfoResolveContentProvider2.packageName;
                                    C5207g.m11110e(str, "wakizashiProviderInfo.packageName");
                                    if (C5070j.m10766a(context, str)) {
                                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        uri = uri2;
                                    }
                                }
                                uri = null;
                            }
                            packageManager = context.getPackageManager();
                            if (packageManager == null) {
                                str2 = null;
                            } else {
                                packageManager.getInstallerPackageName(context.getPackageName());
                                str2 = "com.android.vending";
                            }
                            if (str2 != null) {
                                c5055a.f32905d = str2;
                            }
                            if (uri == null) {
                                c5055a.f32903b = System.currentTimeMillis();
                                C5055a.f32901f = c5055a;
                                return c5055a;
                            }
                            cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (!cursorQuery.moveToFirst()) {
                                        int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                        columnIndex = cursorQuery.getColumnIndex("androidid");
                                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                        c5055a.f32904c = cursorQuery.getString(columnIndex3);
                                        if (columnIndex > 0 && columnIndex2 > 0 && c5055a.m10737a() == null) {
                                            c5055a.f32902a = cursorQuery.getString(columnIndex);
                                            c5055a.f32906e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                        }
                                        cursorQuery.close();
                                        c5055a.f32903b = System.currentTimeMillis();
                                        C5055a.f32901f = c5055a;
                                        return c5055a;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    C5086z c5086z = C5086z.f33015a;
                                    C5055a c5055a4 = C5055a.f32901f;
                                    C5086z.m10807F("d8.a", C5207g.m11116k(e, "Caught unexpected exception in getAttributionId(): "));
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return null;
                                }
                            }
                            c5055a.f32903b = System.currentTimeMillis();
                            C5055a.f32901f = c5055a;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return c5055a;
                        }
                        if (!C5207g.m11106a(Looper.myLooper(), Looper.getMainLooper())) {
                            throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                        }
                        c5055a2 = C5055a.f32901f;
                        if (c5055a2 == null) {
                        }
                        strArr = new String[]{"aid", "androidid", "limit_tracking"};
                        providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                        providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                        if (providerInfoResolveContentProvider != null) {
                            HashSet<String> hashSet4 = C5070j.f32956a;
                            str3 = providerInfoResolveContentProvider.packageName;
                            C5207g.m11110e(str3, "contentProviderInfo.packageName");
                            if (C5070j.m10766a(context, str3)) {
                                uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                            } else {
                                if (providerInfoResolveContentProvider2 != null) {
                                    HashSet<String> hashSet5 = C5070j.f32956a;
                                    str = providerInfoResolveContentProvider2.packageName;
                                    C5207g.m11110e(str, "wakizashiProviderInfo.packageName");
                                    if (C5070j.m10766a(context, str)) {
                                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                    }
                                }
                                uri = null;
                            }
                            uri = uri2;
                        } else {
                            if (providerInfoResolveContentProvider2 != null) {
                                HashSet<String> hashSet6 = C5070j.f32956a;
                                str = providerInfoResolveContentProvider2.packageName;
                                C5207g.m11110e(str, "wakizashiProviderInfo.packageName");
                                if (C5070j.m10766a(context, str)) {
                                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                    uri = uri2;
                                }
                            }
                            uri = null;
                        }
                        packageManager = context.getPackageManager();
                        if (packageManager == null) {
                            str2 = null;
                        } else {
                            packageManager.getInstallerPackageName(context.getPackageName());
                            str2 = "com.android.vending";
                        }
                        if (str2 != null) {
                            c5055a.f32905d = str2;
                        }
                        if (uri == null) {
                            c5055a.f32903b = System.currentTimeMillis();
                            C5055a.f32901f = c5055a;
                            return c5055a;
                        }
                        cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                        if (cursorQuery != null) {
                            if (!cursorQuery.moveToFirst()) {
                                int columnIndex4 = cursorQuery.getColumnIndex("aid");
                                columnIndex = cursorQuery.getColumnIndex("androidid");
                                columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                c5055a.f32904c = cursorQuery.getString(columnIndex4);
                                if (columnIndex > 0) {
                                    c5055a.f32902a = cursorQuery.getString(columnIndex);
                                    c5055a.f32906e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                }
                                cursorQuery.close();
                                c5055a.f32903b = System.currentTimeMillis();
                                C5055a.f32901f = c5055a;
                                return c5055a;
                            }
                        }
                        c5055a.f32903b = System.currentTimeMillis();
                        C5055a.f32901f = c5055a;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return c5055a;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = context;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (Exception e13) {
                C5086z.m10806E("android_id", e13);
            }
            c5055a = null;
            if (c5055a == null) {
                if (m10739b(context)) {
                    c5055a = null;
                } else {
                    cVar = new c();
                    intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar2 = new b(cVar.m10742a());
                        C5055a c5055a5 = new C5055a();
                        c5055a5.f32902a = bVar2.m10740h();
                        c5055a5.f32906e = bVar2.m10741j();
                        context.unbindService(cVar);
                        c5055a = c5055a5;
                    } else {
                        c5055a = null;
                    }
                }
                if (c5055a == null) {
                    c5055a = new C5055a();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static boolean m10739b(Context context) {
            Method methodM10834s = C5086z.m10834s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM10834s == null) {
                return false;
            }
            Object objM10837v = C5086z.m10837v(null, methodM10834s, context);
            return (objM10837v instanceof Integer) && C5207g.m11106a(objM10837v, 0);
        }
    }

    /* JADX INFO: renamed from: d8.a$b */
    public static final class b implements IInterface {

        /* JADX INFO: renamed from: a */
        public final IBinder f32907a;

        public b(IBinder iBinder) {
            this.f32907a = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f32907a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: h */
        public final String m10740h() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            C5207g.m11110e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            C5207g.m11110e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f32907a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: j */
        public final boolean m10741j() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            C5207g.m11110e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            C5207g.m11110e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f32907a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z10;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d8.a$c */
    public static final class c implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f32908a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingDeque f32909b = new LinkedBlockingDeque();

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final IBinder m10742a() throws InterruptedException {
            if (!(!this.f32908a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            Object objTake = this.f32909b.take();
            C5207g.m11110e(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f32909b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m10737a() {
        if (C8004n.m15878h() && C7993c0.m15848a()) {
            return this.f32902a;
        }
        return null;
    }
}
