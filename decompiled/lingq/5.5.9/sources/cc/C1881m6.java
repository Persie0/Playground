package cc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C2734kb;
import com.google.android.gms.internal.measurement.C2788oa;
import com.google.android.gms.internal.measurement.C2932zb;
import com.google.android.gms.internal.measurement.InterfaceC2595ac;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lb.C7297a;
import p003a2.C0009a;
import p115fb.RunnableC5491g;
import p176ib.C6272i;
import p260m8.C7499b;
import p295ob.C8032b;

/* JADX INFO: renamed from: cc.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1881m6 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: c */
    public final ServiceConnectionC1872l6 f10006c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1779b3 f10007d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f10008e;

    /* JADX INFO: renamed from: f */
    public final C1809e6 f10009f;

    /* JADX INFO: renamed from: g */
    public final C1980x6 f10010g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10011h;

    /* JADX INFO: renamed from: i */
    public final C1827g6 f10012i;

    public C1881m6(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10011h = new ArrayList();
        this.f10010g = new C1980x6(c1897o4.f10058I);
        this.f10006c = new ServiceConnectionC1872l6(this);
        this.f10009f = new C1809e6(this, c1897o4, 0);
        this.f10012i = new C1827g6(this, c1897o4);
    }

    /* JADX INFO: renamed from: u */
    public static void m5757u(C1881m6 c1881m6, ComponentName componentName) {
        c1881m6.mo5748g();
        if (c1881m6.f10007d != null) {
            c1881m6.f10007d = null;
            C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5624b(componentName, "Disconnected from device MeasurementService");
            c1881m6.mo5748g();
            c1881m6.m5767v();
        }
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02bc A[Catch: all -> 0x0335, TRY_ENTER, TryCatch #15 {all -> 0x0335, blocks: (B:34:0x010f, B:36:0x0115, B:38:0x0124, B:40:0x012a, B:44:0x0141, B:46:0x0146, B:156:0x02ee, B:145:0x02bc, B:147:0x02c2, B:148:0x02c5, B:164:0x0309, B:55:0x0167, B:56:0x016a, B:54:0x0162, B:59:0x0171, B:61:0x0185, B:68:0x01a1, B:69:0x01a5, B:70:0x01a8, B:66:0x019a, B:72:0x01ab, B:74:0x01c0, B:81:0x01dc, B:82:0x01e0, B:83:0x01e3, B:79:0x01d5, B:86:0x01e8, B:87:0x01f8, B:97:0x0224, B:99:0x0236, B:101:0x0242, B:102:0x0251), top: B:230:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02de  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:166:0x031b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0320  */
    /* JADX WARN: Code duplicated, block: B:169:0x0322 A[PHI: r7 r16 r17 r18
      0x0322: PHI (r7v13 android.database.sqlite.SQLiteDatabase) = 
      (r7v11 android.database.sqlite.SQLiteDatabase)
      (r7v12 android.database.sqlite.SQLiteDatabase)
      (r7v14 android.database.sqlite.SQLiteDatabase)
     binds: [B:151:0x02db, B:168:0x0320, B:160:0x02f8] A[DONT_GENERATE, DONT_INLINE]
      0x0322: PHI (r16v5 int) = (r16v1 int), (r16v3 int), (r16v6 int) binds: [B:151:0x02db, B:168:0x0320, B:160:0x02f8] A[DONT_GENERATE, DONT_INLINE]
      0x0322: PHI (r17v7 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v8 java.lang.String) binds: [B:151:0x02db, B:168:0x0320, B:160:0x02f8] A[DONT_GENERATE, DONT_INLINE]
      0x0322: PHI (r18v12 int) = (r18v8 int), (r18v10 int), (r18v13 int) binds: [B:151:0x02db, B:168:0x0320, B:160:0x02f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x0326 A[PHI: r13 r17 r18
      0x0326: PHI (r13v15 int) = (r13v14 int), (r16v1 int) binds: [B:153:0x02de, B:167:0x031e] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String) binds: [B:153:0x02de, B:167:0x031e] A[DONT_GENERATE, DONT_INLINE]
      0x0326: PHI (r18v9 int) = (r18v8 int), (r18v10 int) binds: [B:153:0x02de, B:167:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:262:0x0328 A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m5758l(InterfaceC1779b3 interfaceC1779b3, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) throws Throwable {
        ArrayList arrayList;
        int i10;
        int size;
        SQLiteDatabase sQLiteDatabaseM5587l;
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursorQuery2;
        long j10;
        String str;
        String[] strArr;
        zzac zzacVarCreateFromParcel;
        zzli zzliVarCreateFromParcel;
        mo5748g();
        m5851h();
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        ((C1897o4) interfaceC1781b5).getClass();
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        c1897o4.getClass();
        int i11 = 100;
        int i12 = 0;
        for (int i13 = 100; i12 < 1001 && i13 == i11; i13 = size) {
            ArrayList arrayList2 = new ArrayList();
            C1806e3 c1806e3M5786q = c1897o4.m5786q();
            String str2 = "rowid";
            c1806e3M5786q.mo5748g();
            if (c1806e3M5786q.f9770d) {
                i12 = i12;
                arrayList = null;
                i10 = 0;
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            InterfaceC1781b5 interfaceC1781b6 = c1806e3M5786q.f10430a;
            C1897o4 c1897o5 = (C1897o4) interfaceC1781b6;
            Context context = c1897o5.f10076a;
            c1897o5.getClass();
            if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i14 = 5;
                int i15 = 5;
                int i16 = 0;
                while (true) {
                    if (i16 >= i14) {
                        i12 = i12;
                        i10 = 0;
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b6).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9945i.m5623a("Failed to read events from database in reasonable time");
                        arrayList = null;
                        break;
                    }
                    try {
                        sQLiteDatabaseM5587l = c1806e3M5786q.m5587l();
                        if (sQLiteDatabaseM5587l == null) {
                            try {
                                try {
                                    c1806e3M5786q.f9770d = true;
                                    i12 = i12;
                                    arrayList = null;
                                    i10 = 0;
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
                                i12 = i12;
                                str2 = str2;
                                cursorQuery = null;
                                SystemClock.sleep(i15);
                                i15 += 20;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.close();
                                }
                                i16++;
                                str2 = str2;
                                i12 = i12;
                                i14 = 5;
                            } catch (SQLiteFullException e10) {
                                e = e10;
                                i12 = i12;
                                str2 = str2;
                                cursorQuery = null;
                                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b6).f10086i;
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9942f.m5624b(e, "Error reading entries from local database");
                                c1806e3M5786q.f9770d = true;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    i15 = i15;
                                    sQLiteDatabaseM5587l.close();
                                } else {
                                    i15 = i15;
                                }
                                i16++;
                                str2 = str2;
                                i12 = i12;
                                i14 = 5;
                            } catch (SQLiteException e11) {
                                e = e11;
                                i12 = i12;
                                str2 = str2;
                                cursorQuery = null;
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.endTransaction();
                                }
                                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b6).f10086i;
                                C1897o4.m5776k(c1860k5);
                                c1860k5.f9942f.m5624b(e, "Error reading entries from local database");
                                c1806e3M5786q.f9770d = true;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (sQLiteDatabaseM5587l != null) {
                                    sQLiteDatabaseM5587l.close();
                                } else {
                                    i15 = i15;
                                    i15 = i15;
                                }
                                i16++;
                                str2 = str2;
                                i12 = i12;
                                i14 = 5;
                            }
                        } else {
                            sQLiteDatabaseM5587l.beginTransaction();
                            try {
                                cursorQuery2 = sQLiteDatabaseM5587l.query("messages", new String[]{str2}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                try {
                                    long j11 = -1;
                                    if (cursorQuery2.moveToFirst()) {
                                        j10 = cursorQuery2.getLong(0);
                                        cursorQuery2.close();
                                    } else {
                                        cursorQuery2.close();
                                        j10 = -1;
                                    }
                                    if (j10 != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j10)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursorQuery = sQLiteDatabaseM5587l.query("messages", new String[]{str2, "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursorQuery.moveToNext()) {
                                        try {
                                            try {
                                                j11 = cursorQuery.getLong(0);
                                                int i17 = cursorQuery.getInt(1);
                                                str2 = str2;
                                                try {
                                                    byte[] blob = cursorQuery.getBlob(2);
                                                    if (i17 == 0) {
                                                        Parcel parcelObtain = Parcel.obtain();
                                                        try {
                                                            i12 = i12;
                                                            try {
                                                                try {
                                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain.setDataPosition(0);
                                                                    zzaw zzawVarCreateFromParcel = zzaw.CREATOR.createFromParcel(parcelObtain);
                                                                    try {
                                                                        parcelObtain.recycle();
                                                                        if (zzawVarCreateFromParcel != null) {
                                                                            arrayList3.add(zzawVarCreateFromParcel);
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                                        SystemClock.sleep(i15);
                                                                        i15 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseM5587l != null) {
                                                                            sQLiteDatabaseM5587l.close();
                                                                        }
                                                                        i16++;
                                                                        str2 = str2;
                                                                        i12 = i12;
                                                                        i14 = 5;
                                                                    } catch (SQLiteFullException e12) {
                                                                        e = e12;
                                                                        C1860k3 c1860k6 = ((C1897o4) interfaceC1781b6).f10086i;
                                                                        C1897o4.m5776k(c1860k6);
                                                                        c1860k6.f9942f.m5624b(e, "Error reading entries from local database");
                                                                        c1806e3M5786q.f9770d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseM5587l != null) {
                                                                            i15 = i15;
                                                                            sQLiteDatabaseM5587l.close();
                                                                        } else {
                                                                            i15 = i15;
                                                                        }
                                                                        i16++;
                                                                        str2 = str2;
                                                                        i12 = i12;
                                                                        i14 = 5;
                                                                    } catch (SQLiteException e13) {
                                                                        e = e13;
                                                                        if (sQLiteDatabaseM5587l != null) {
                                                                            sQLiteDatabaseM5587l.endTransaction();
                                                                        }
                                                                        C1860k3 c1860k7 = ((C1897o4) interfaceC1781b6).f10086i;
                                                                        C1897o4.m5776k(c1860k7);
                                                                        c1860k7.f9942f.m5624b(e, "Error reading entries from local database");
                                                                        c1806e3M5786q.f9770d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseM5587l != null) {
                                                                            sQLiteDatabaseM5587l.close();
                                                                        } else {
                                                                            i15 = i15;
                                                                            i15 = i15;
                                                                        }
                                                                        i16++;
                                                                        str2 = str2;
                                                                        i12 = i12;
                                                                        i14 = 5;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused3) {
                                                                    C1860k3 c1860k8 = ((C1897o4) interfaceC1781b6).f10086i;
                                                                    C1897o4.m5776k(c1860k8);
                                                                    c1860k8.f9942f.m5623a("Failed to load event from local database");
                                                                    parcelObtain.recycle();
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused4) {
                                                            i12 = i12;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    } else {
                                                        i12 = i12;
                                                        if (i17 == 1) {
                                                            Parcel parcelObtain2 = Parcel.obtain();
                                                            try {
                                                                try {
                                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain2.setDataPosition(0);
                                                                    zzliVarCreateFromParcel = zzli.CREATOR.createFromParcel(parcelObtain2);
                                                                    parcelObtain2.recycle();
                                                                } catch (SafeParcelReader.ParseException unused5) {
                                                                    C1860k3 c1860k9 = ((C1897o4) interfaceC1781b6).f10086i;
                                                                    C1897o4.m5776k(c1860k9);
                                                                    c1860k9.f9942f.m5623a("Failed to load user property from local database");
                                                                    parcelObtain2.recycle();
                                                                    zzliVarCreateFromParcel = null;
                                                                }
                                                                if (zzliVarCreateFromParcel != null) {
                                                                    arrayList3.add(zzliVarCreateFromParcel);
                                                                }
                                                            } catch (Throwable th5) {
                                                                parcelObtain2.recycle();
                                                                throw th5;
                                                            }
                                                        } else if (i17 == 2) {
                                                            Parcel parcelObtain3 = Parcel.obtain();
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzacVarCreateFromParcel = zzac.CREATOR.createFromParcel(parcelObtain3);
                                                                    parcelObtain3.recycle();
                                                                } catch (SafeParcelReader.ParseException unused6) {
                                                                    C1860k3 c1860k10 = ((C1897o4) interfaceC1781b6).f10086i;
                                                                    C1897o4.m5776k(c1860k10);
                                                                    c1860k10.f9942f.m5623a("Failed to load conditional user property from local database");
                                                                    parcelObtain3.recycle();
                                                                    zzacVarCreateFromParcel = null;
                                                                }
                                                                if (zzacVarCreateFromParcel != null) {
                                                                    arrayList3.add(zzacVarCreateFromParcel);
                                                                }
                                                            } catch (Throwable th6) {
                                                                parcelObtain3.recycle();
                                                                throw th6;
                                                            }
                                                        } else if (i17 == 3) {
                                                            C1860k3 c1860k11 = ((C1897o4) interfaceC1781b6).f10086i;
                                                            C1897o4.m5776k(c1860k11);
                                                            c1860k11.f9945i.m5623a("Skipping app launch break");
                                                        } else {
                                                            C1860k3 c1860k12 = ((C1897o4) interfaceC1781b6).f10086i;
                                                            C1897o4.m5776k(c1860k12);
                                                            c1860k12.f9942f.m5623a("Unknown record type in local database");
                                                        }
                                                    }
                                                    str2 = str2;
                                                    i12 = i12;
                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                    i12 = i12;
                                                } catch (SQLiteFullException e14) {
                                                    e = e14;
                                                    i12 = i12;
                                                } catch (SQLiteException e15) {
                                                    e = e15;
                                                    i12 = i12;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor = cursorQuery;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused8) {
                                            i12 = i12;
                                            str2 = str2;
                                        } catch (SQLiteFullException e16) {
                                            e = e16;
                                            i12 = i12;
                                            str2 = str2;
                                        } catch (SQLiteException e17) {
                                            e = e17;
                                            i12 = i12;
                                            str2 = str2;
                                        }
                                    }
                                    i12 = i12;
                                    str2 = str2;
                                    String[] strArr2 = new String[1];
                                    i10 = 0;
                                    try {
                                        strArr2[0] = Long.toString(j11);
                                        if (sQLiteDatabaseM5587l.delete("messages", "rowid <= ?", strArr2) < arrayList3.size()) {
                                            C1860k3 c1860k13 = ((C1897o4) interfaceC1781b6).f10086i;
                                            C1897o4.m5776k(c1860k13);
                                            c1860k13.f9942f.m5623a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabaseM5587l.setTransactionSuccessful();
                                        sQLiteDatabaseM5587l.endTransaction();
                                        cursorQuery.close();
                                        sQLiteDatabaseM5587l.close();
                                    } catch (SQLiteDatabaseLockedException unused9) {
                                        SystemClock.sleep(i15);
                                        i15 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM5587l != null) {
                                            sQLiteDatabaseM5587l.close();
                                        }
                                        i16++;
                                        str2 = str2;
                                        i12 = i12;
                                        i14 = 5;
                                    } catch (SQLiteFullException e18) {
                                        e = e18;
                                        C1860k3 c1860k14 = ((C1897o4) interfaceC1781b6).f10086i;
                                        C1897o4.m5776k(c1860k14);
                                        c1860k14.f9942f.m5624b(e, "Error reading entries from local database");
                                        c1806e3M5786q.f9770d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM5587l != null) {
                                            i15 = i15;
                                            sQLiteDatabaseM5587l.close();
                                        } else {
                                            i15 = i15;
                                        }
                                        i16++;
                                        str2 = str2;
                                        i12 = i12;
                                        i14 = 5;
                                    } catch (SQLiteException e19) {
                                        e = e19;
                                        if (sQLiteDatabaseM5587l != null) {
                                            sQLiteDatabaseM5587l.endTransaction();
                                        }
                                        C1860k3 c1860k15 = ((C1897o4) interfaceC1781b6).f10086i;
                                        C1897o4.m5776k(c1860k15);
                                        c1860k15.f9942f.m5624b(e, "Error reading entries from local database");
                                        c1806e3M5786q.f9770d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM5587l != null) {
                                            sQLiteDatabaseM5587l.close();
                                        } else {
                                            i15 = i15;
                                            i15 = i15;
                                        }
                                        i16++;
                                        str2 = str2;
                                        i12 = i12;
                                        i14 = 5;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (cursorQuery2 != null) {
                                        try {
                                            cursorQuery2.close();
                                        } catch (SQLiteDatabaseLockedException unused10) {
                                            cursorQuery = null;
                                            SystemClock.sleep(i15);
                                            i15 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM5587l != null) {
                                                sQLiteDatabaseM5587l.close();
                                            }
                                            i16++;
                                            str2 = str2;
                                            i12 = i12;
                                            i14 = 5;
                                        } catch (SQLiteFullException e20) {
                                            e = e20;
                                            cursorQuery = null;
                                            C1860k3 c1860k16 = ((C1897o4) interfaceC1781b6).f10086i;
                                            C1897o4.m5776k(c1860k16);
                                            c1860k16.f9942f.m5624b(e, "Error reading entries from local database");
                                            c1806e3M5786q.f9770d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM5587l != null) {
                                                i15 = i15;
                                                sQLiteDatabaseM5587l.close();
                                            } else {
                                                i15 = i15;
                                            }
                                            i16++;
                                            str2 = str2;
                                            i12 = i12;
                                            i14 = 5;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseM5587l != null && sQLiteDatabaseM5587l.inTransaction()) {
                                                sQLiteDatabaseM5587l.endTransaction();
                                            }
                                            C1860k3 c1860k17 = ((C1897o4) interfaceC1781b6).f10086i;
                                            C1897o4.m5776k(c1860k17);
                                            c1860k17.f9942f.m5624b(e, "Error reading entries from local database");
                                            c1806e3M5786q.f9770d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM5587l != null) {
                                                sQLiteDatabaseM5587l.close();
                                            } else {
                                                i15 = i15;
                                                i15 = i15;
                                            }
                                            i16++;
                                            str2 = str2;
                                            i12 = i12;
                                            i14 = 5;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                cursorQuery2 = null;
                            }
                        }
                        th = th2;
                    } catch (SQLiteDatabaseLockedException unused11) {
                        i12 = i12;
                        str2 = str2;
                        cursorQuery = null;
                        sQLiteDatabaseM5587l = null;
                    } catch (SQLiteFullException e22) {
                        e = e22;
                        i12 = i12;
                        str2 = str2;
                        cursorQuery = null;
                        sQLiteDatabaseM5587l = null;
                    } catch (SQLiteException e23) {
                        e = e23;
                        i12 = i12;
                        str2 = str2;
                        cursorQuery = null;
                        sQLiteDatabaseM5587l = null;
                    } catch (Throwable th10) {
                        th = th10;
                        sQLiteDatabaseM5587l = null;
                    }
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseM5587l != null) {
                        sQLiteDatabaseM5587l.close();
                    }
                    throw th;
                    i16++;
                    str2 = str2;
                    i12 = i12;
                    i14 = 5;
                }
            } else {
                i12 = i12;
                i10 = 0;
            }
            arrayList = arrayList3;
            break;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i10;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList2.add(abstractSafeParcelable);
            }
            int size2 = arrayList2.size();
            for (int i18 = i10; i18 < size2; i18++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList2.get(i18);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        try {
                            interfaceC1779b3.mo5505f0((zzaw) abstractSafeParcelable2, zzqVar);
                        } catch (RemoteException e24) {
                            e = e24;
                            C1860k3 c1860k18 = c1897o4.f10086i;
                            C1897o4.m5776k(c1860k18);
                            c1860k18.f9942f.m5624b(e, "Failed to send event to the service");
                        }
                    } catch (RemoteException e25) {
                        e = e25;
                    }
                } else if (abstractSafeParcelable2 instanceof zzli) {
                    try {
                        interfaceC1779b3.mo5499C0((zzli) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e26) {
                        C1860k3 c1860k19 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k19);
                        c1860k19.f9942f.m5624b(e26, "Failed to send user property to the service");
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        interfaceC1779b3.mo5502J0((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e27) {
                        C1860k3 c1860k20 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k20);
                        c1860k20.f9942f.m5624b(e27, "Failed to send conditional user property to the service");
                    }
                } else {
                    C1860k3 c1860k21 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k21);
                    c1860k21.f9942f.m5623a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11 = 100;
            i12++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5759m(zzac zzacVar) {
        boolean zM5590o;
        mo5748g();
        m5851h();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        c1897o4.getClass();
        C1806e3 c1806e3M5786q = c1897o4.m5786q();
        C1897o4 c1897o5 = (C1897o4) c1806e3M5786q.f10430a;
        C1900o7 c1900o7 = c1897o5.f10089l;
        C1897o4.m5774i(c1900o7);
        c1900o7.getClass();
        byte[] bArrM5796Z = C1900o7.m5796Z(zzacVar);
        if (bArrM5796Z.length > 131072) {
            C1860k3 c1860k3 = c1897o5.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9943g.m5623a("Conditional user property too long for local database. Sending directly to service");
            zM5590o = false;
        } else {
            zM5590o = c1806e3M5786q.m5590o(bArrM5796Z, 2);
        }
        m5766t(new RunnableC5491g(this, m5763q(true), zM5590o, new zzac(zzacVar), zzacVar));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5760n() {
        mo5748g();
        m5851h();
        return this.f10007d != null;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5761o() {
        mo5748g();
        m5851h();
        if (!m5762p()) {
            return true;
        }
        C1900o7 c1900o7 = ((C1897o4) this.f10430a).f10089l;
        C1897o4.m5774i(c1900o7);
        return c1900o7.m5832j0() >= ((Integer) C1985y2.f10352g0.m5912a(null)).intValue();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5762p() {
        mo5748g();
        m5851h();
        if (this.f10008e == null) {
            mo5748g();
            m5851h();
            C1986y3 c1986y3 = ((C1897o4) this.f10430a).f10085h;
            C1897o4.m5774i(c1986y3);
            c1986y3.mo5748g();
            boolean z10 = false;
            Boolean boolValueOf = !c1986y3.m5917l().contains("use_service") ? null : Boolean.valueOf(c1986y3.m5917l().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                ((C1897o4) this.f10430a).getClass();
                C1788c3 c1788c3M5785p = ((C1897o4) this.f10430a).m5785p();
                c1788c3M5785p.m5851h();
                if (c1788c3M5785p.f9712k == 1) {
                    z10 = true;
                } else {
                    C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9938I.m5623a("Checking service availability");
                    C1900o7 c1900o7 = ((C1897o4) this.f10430a).f10089l;
                    C1897o4.m5774i(c1900o7);
                    c1900o7.getClass();
                    int iMo7586c = C2549d.f13922b.mo7586c(((C1897o4) c1900o7.f10430a).f10076a, 12451000);
                    if (iMo7586c == 0) {
                        C1860k3 c1860k4 = ((C1897o4) this.f10430a).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9938I.m5623a("Service available");
                    } else if (iMo7586c == 1) {
                        C1860k3 c1860k5 = ((C1897o4) this.f10430a).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9938I.m5623a("Service missing");
                    } else if (iMo7586c != 2) {
                        if (iMo7586c == 3) {
                            C1860k3 c1860k6 = ((C1897o4) this.f10430a).f10086i;
                            C1897o4.m5776k(c1860k6);
                            c1860k6.f9945i.m5623a("Service disabled");
                        } else if (iMo7586c == 9) {
                            C1860k3 c1860k7 = ((C1897o4) this.f10430a).f10086i;
                            C1897o4.m5776k(c1860k7);
                            c1860k7.f9945i.m5623a("Service invalid");
                        } else if (iMo7586c != 18) {
                            C1860k3 c1860k8 = ((C1897o4) this.f10430a).f10086i;
                            C1897o4.m5776k(c1860k8);
                            c1860k8.f9945i.m5624b(Integer.valueOf(iMo7586c), "Unexpected service status");
                        } else {
                            C1860k3 c1860k9 = ((C1897o4) this.f10430a).f10086i;
                            C1897o4.m5776k(c1860k9);
                            c1860k9.f9945i.m5623a("Service updating");
                        }
                        z11 = false;
                    } else {
                        C1860k3 c1860k10 = ((C1897o4) this.f10430a).f10086i;
                        C1897o4.m5776k(c1860k10);
                        c1860k10.f9937H.m5623a("Service container out of date");
                        C1900o7 c1900o8 = ((C1897o4) this.f10430a).f10089l;
                        C1897o4.m5774i(c1900o8);
                        if (c1900o8.m5832j0() >= 17443) {
                            if (boolValueOf != null) {
                                z11 = false;
                            }
                            z10 = z11;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && ((C1897o4) this.f10430a).f10084g.m5586u()) {
                    C1860k3 c1860k11 = ((C1897o4) this.f10430a).f10086i;
                    C1897o4.m5776k(c1860k11);
                    c1860k11.f9942f.m5623a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    C1986y3 c1986y4 = ((C1897o4) this.f10430a).f10085h;
                    C1897o4.m5774i(c1986y4);
                    c1986y4.mo5748g();
                    SharedPreferences.Editor editorEdit = c1986y4.m5917l().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f10008e = Boolean.valueOf(z11);
        }
        return this.f10008e.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x016b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: q */
    public final zzq m5763q(boolean z10) {
        long j10;
        long j11;
        String str;
        String str2;
        long j12;
        String str3;
        long j13;
        int i10;
        long jM5799k0;
        long jAbs;
        Pair pair;
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        c1897o4.getClass();
        C1788c3 c1788c3M5785p = c1897o4.m5785p();
        String strM21i = null;
        if (z10) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            InterfaceC1781b5 interfaceC1781b5 = c1860k3.f10430a;
            C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
            C1897o4.m5774i(c1986y3);
            if (c1986y3.f10402d != null) {
                C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
                C1897o4.m5774i(c1986y4);
                C1968w3 c1968w3 = c1986y4.f10402d;
                C1986y3 c1986y5 = c1968w3.f10273e;
                c1986y5.mo5748g();
                c1986y5.mo5748g();
                long j14 = c1968w3.f10273e.m5917l().getLong(c1968w3.f10269a, 0L);
                if (j14 == 0) {
                    c1968w3.m5907a();
                    jAbs = 0;
                } else {
                    ((C1897o4) c1986y5.f10430a).f10058I.getClass();
                    jAbs = Math.abs(j14 - System.currentTimeMillis());
                }
                long j15 = c1968w3.f10272d;
                if (jAbs < j15) {
                    pair = null;
                } else if (jAbs > j15 + j15) {
                    c1968w3.m5907a();
                    pair = null;
                } else {
                    String string = c1986y5.m5917l().getString(c1968w3.f10271c, null);
                    long j16 = c1986y5.m5917l().getLong(c1968w3.f10270b, 0L);
                    c1968w3.m5907a();
                    pair = (string == null || j16 <= 0) ? C1986y3.f10389S : new Pair(string, Long.valueOf(j16));
                }
                if (pair != null && pair != C1986y3.f10389S) {
                    strM21i = C0009a.m21i(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        }
        String str4 = strM21i;
        c1788c3M5785p.mo5748g();
        String strM5530m = c1788c3M5785p.m5530m();
        String strM5531n = c1788c3M5785p.m5531n();
        c1788c3M5785p.m5851h();
        String str5 = c1788c3M5785p.f9705d;
        c1788c3M5785p.m5851h();
        long j17 = c1788c3M5785p.f9706e;
        c1788c3M5785p.m5851h();
        C6272i.m12915i(c1788c3M5785p.f9707f);
        String str6 = c1788c3M5785p.f9707f;
        InterfaceC1781b5 interfaceC1781b6 = c1788c3M5785p.f10430a;
        C1897o4 c1897o5 = (C1897o4) interfaceC1781b6;
        c1897o5.f10084g.m5578m();
        c1788c3M5785p.m5851h();
        c1788c3M5785p.mo5748g();
        long j18 = c1788c3M5785p.f9708g;
        C1900o7 c1900o7 = c1897o5.f10089l;
        if (j18 == 0) {
            C1897o4.m5774i(c1900o7);
            Context context = c1897o5.f10076a;
            String packageName = context.getPackageName();
            c1900o7.mo5748g();
            C6272i.m12912f(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestM5801p = C1900o7.m5801p();
            InterfaceC1781b5 interfaceC1781b7 = c1900o7.f10430a;
            if (messageDigestM5801p == null) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b7).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5623a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (c1900o7.m5823T(context, packageName)) {
                            jM5799k0 = 0;
                        } else {
                            Signature[] signatureArr = C8032b.m15902a(context).m15900b(((C1897o4) interfaceC1781b7).f10076a.getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b7).f10086i;
                                C1897o4.m5776k(c1860k5);
                                c1860k5.f9945i.m5623a("Could not get signatures");
                            } else {
                                jM5799k0 = C1900o7.m5799k0(messageDigestM5801p.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        C1860k3 c1860k6 = ((C1897o4) interfaceC1781b7).f10086i;
                        C1897o4.m5776k(c1860k6);
                        c1860k6.f9942f.m5624b(e10, "Package name not found");
                    }
                } else {
                    jM5799k0 = 0;
                }
                c1788c3M5785p.f9708g = jM5799k0;
                j10 = jM5799k0;
            }
            jM5799k0 = -1;
            c1788c3M5785p.f9708g = jM5799k0;
            j10 = jM5799k0;
        } else {
            j10 = j18;
        }
        boolean zM5779g = c1897o5.m5779g();
        C1986y3 c1986y6 = c1897o5.f10085h;
        C1897o4.m5774i(c1986y6);
        boolean z11 = !c1986y6.f10393K;
        c1788c3M5785p.mo5748g();
        boolean zM5779g2 = c1897o5.m5779g();
        C1802e c1802e = c1897o5.f10084g;
        if (zM5779g2) {
            ((InterfaceC2595ac) C2932zb.f14527b.f14528a.zza()).zza();
            boolean zM5582q = c1802e.m5582q(null, C1985y2.f10344c0);
            C1860k3 c1860k7 = c1897o5.f10086i;
            if (zM5582q) {
                C1897o4.m5776k(c1860k7);
                c1860k7.f9938I.m5623a("Disabled IID for tests.");
            } else {
                try {
                    j11 = j10;
                    try {
                        Class<?> clsLoadClass = ((C1897o4) interfaceC1781b6).f10076a.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                        if (clsLoadClass == null) {
                            str = str6;
                            str2 = null;
                        } else {
                            str = str6;
                            j17 = j17;
                            try {
                                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, ((C1897o4) interfaceC1781b6).f10076a);
                                if (objInvoke == null) {
                                    str2 = null;
                                } else {
                                    try {
                                        str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                    } catch (Exception unused) {
                                        C1897o4.m5776k(c1860k7);
                                        c1860k7.f9947k.m5623a("Failed to retrieve Firebase Instance Id");
                                        str2 = null;
                                    }
                                }
                            } catch (Exception unused2) {
                                C1897o4.m5776k(c1860k7);
                                c1860k7.f9946j.m5623a("Failed to obtain Firebase Analytics instance");
                            }
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                } catch (ClassNotFoundException unused4) {
                    j11 = j10;
                }
            }
            j11 = j10;
            str = str6;
            str2 = null;
        } else {
            j11 = j10;
            str = str6;
            str2 = null;
        }
        C1897o4.m5774i(c1986y6);
        long jM5897a = c1986y6.f10403e.m5897a();
        long j19 = c1897o5.f10079b0;
        long jMin = jM5897a == 0 ? j19 : Math.min(j19, jM5897a);
        c1788c3M5785p.m5851h();
        int i11 = c1788c3M5785p.f9712k;
        Boolean boolM5581p = c1802e.m5581p("google_analytics_adid_collection_enabled");
        boolean z12 = boolM5581p == null || boolM5581p.booleanValue();
        C1897o4.m5774i(c1986y6);
        c1986y6.mo5748g();
        boolean z13 = c1986y6.m5917l().getBoolean("deferred_analytics_collection", false);
        c1788c3M5785p.m5851h();
        String str7 = c1788c3M5785p.f9700H;
        Boolean boolM5581p2 = c1802e.m5581p("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolM5581p2 == null ? null : Boolean.valueOf(!boolM5581p2.booleanValue());
        long j20 = c1788c3M5785p.f9709h;
        List list = c1788c3M5785p.f9710i;
        C1897o4.m5774i(c1986y6);
        String strM5596e = c1986y6.m5919n().m5596e();
        if (c1788c3M5785p.f9711j == null) {
            C1897o4.m5774i(c1900o7);
            c1788c3M5785p.f9711j = c1900o7.m5837n();
        }
        String str8 = c1788c3M5785p.f9711j;
        C2734kb.m7924a();
        if (c1802e.m5582q(null, C1985y2.f10360k0)) {
            c1788c3M5785p.mo5748g();
            j12 = 0;
            if (c1788c3M5785p.f9702J != 0) {
                c1897o5.f10058I.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c1788c3M5785p.f9702J;
                if (c1788c3M5785p.f9701I != null && jCurrentTimeMillis > 86400000 && c1788c3M5785p.f9703K == null) {
                    c1788c3M5785p.m5532o();
                }
            }
            if (c1788c3M5785p.f9701I == null) {
                c1788c3M5785p.m5532o();
            }
            str3 = c1788c3M5785p.f9701I;
        } else {
            j12 = 0;
            str3 = null;
        }
        long j21 = j12;
        String str9 = str3;
        InterfaceC1781b5 interfaceC1781b8 = c1802e.f10430a;
        Boolean boolM5581p3 = c1802e.m5581p("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolM5581p3 == null ? false : boolM5581p3.booleanValue();
        C2788oa.m8149a();
        if (c1802e.m5582q(null, C1985y2.f10382v0)) {
            C1897o4.m5774i(c1900o7);
            InterfaceC1781b5 interfaceC1781b9 = c1900o7.f10430a;
            String strM5530m2 = c1788c3M5785p.m5530m();
            try {
                i10 = 0;
                try {
                    ApplicationInfo applicationInfoM15899a = C8032b.m15902a(((C1897o4) interfaceC1781b9).f10076a).m15899a(strM5530m2, 0);
                    if (applicationInfoM15899a != null) {
                        i10 = applicationInfoM15899a.targetSdkVersion;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    C1897o4 c1897o6 = (C1897o4) interfaceC1781b9;
                    c1897o6.getClass();
                    C1860k3 c1860k8 = c1897o6.f10086i;
                    C1897o4.m5776k(c1860k8);
                    c1860k8.f9942f.m5624b(strM5530m2, "PackageManager failed to find running app: app_id");
                }
            } catch (PackageManager.NameNotFoundException unused6) {
                i10 = 0;
            }
            j13 = i10;
        } else {
            j13 = j21;
        }
        return new zzq(strM5530m, strM5531n, str5, j17, str, 76003L, j11, str4, zM5779g, z11, str2, jMin, i11, z12, z13, str7, boolValueOf, j20, list, strM5596e, str8, str9, zBooleanValue, j13);
    }

    /* JADX INFO: renamed from: r */
    public final void m5764r() {
        mo5748g();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        ArrayList arrayList = this.f10011h;
        c1860k3.f9938I.m5624b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                C1860k3 c1860k4 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f10012i.m5745a();
    }

    /* JADX INFO: renamed from: s */
    public final void m5765s() {
        mo5748g();
        C1980x6 c1980x6 = this.f10010g;
        ((C7499b) c1980x6.f10306a).getClass();
        c1980x6.f10307b = SystemClock.elapsedRealtime();
        ((C1897o4) this.f10430a).getClass();
        this.f10009f.m5746c(((Long) C1985y2.f10323K.m5912a(null)).longValue());
    }

    /* JADX INFO: renamed from: t */
    public final void m5766t(Runnable runnable) throws IllegalStateException {
        mo5748g();
        if (m5760n()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f10011h;
        long size = arrayList.size();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        c1897o4.getClass();
        if (size >= 1000) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f10012i.m5746c(60000L);
            m5767v();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: v */
    public final void m5767v() {
        mo5748g();
        m5851h();
        if (m5760n()) {
            return;
        }
        if (m5762p()) {
            ServiceConnectionC1872l6 serviceConnectionC1872l6 = this.f10006c;
            serviceConnectionC1872l6.f9984c.mo5748g();
            Context context = ((C1897o4) serviceConnectionC1872l6.f9984c.f10430a).f10076a;
            synchronized (serviceConnectionC1872l6) {
                if (serviceConnectionC1872l6.f9982a) {
                    C1860k3 c1860k3 = ((C1897o4) serviceConnectionC1872l6.f9984c.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9938I.m5623a("Connection attempt already in progress");
                    return;
                } else {
                    if (serviceConnectionC1872l6.f9983b != null && (serviceConnectionC1872l6.f9983b.m12880g() || serviceConnectionC1872l6.f9983b.m12875a())) {
                        C1860k3 c1860k4 = ((C1897o4) serviceConnectionC1872l6.f9984c.f10430a).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9938I.m5623a("Already awaiting connection attempt");
                        return;
                    }
                    serviceConnectionC1872l6.f9983b = new C1824g3(context, Looper.getMainLooper(), serviceConnectionC1872l6, serviceConnectionC1872l6);
                    C1860k3 c1860k5 = ((C1897o4) serviceConnectionC1872l6.f9984c.f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9938I.m5623a("Connecting to remote service");
                    serviceConnectionC1872l6.f9982a = true;
                    C6272i.m12915i(serviceConnectionC1872l6.f9983b);
                    serviceConnectionC1872l6.f9983b.m12888v();
                    return;
                }
            }
        }
        if (!((C1897o4) this.f10430a).f10084g.m5586u()) {
            ((C1897o4) this.f10430a).getClass();
            List<ResolveInfo> listQueryIntentServices = ((C1897o4) this.f10430a).f10076a.getPackageManager().queryIntentServices(new Intent().setClassName(((C1897o4) this.f10430a).f10076a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                C1897o4 c1897o4 = (C1897o4) this.f10430a;
                Context context2 = c1897o4.f10076a;
                c1897o4.getClass();
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                ServiceConnectionC1872l6 serviceConnectionC1872l7 = this.f10006c;
                serviceConnectionC1872l7.f9984c.mo5748g();
                Context context3 = ((C1897o4) serviceConnectionC1872l7.f9984c.f10430a).f10076a;
                C7297a c7297aM14688b = C7297a.m14688b();
                synchronized (serviceConnectionC1872l7) {
                    if (serviceConnectionC1872l7.f9982a) {
                        C1860k3 c1860k6 = ((C1897o4) serviceConnectionC1872l7.f9984c.f10430a).f10086i;
                        C1897o4.m5776k(c1860k6);
                        c1860k6.f9938I.m5623a("Connection attempt already in progress");
                        return;
                    } else {
                        C1860k3 c1860k7 = ((C1897o4) serviceConnectionC1872l7.f9984c.f10430a).f10086i;
                        C1897o4.m5776k(c1860k7);
                        c1860k7.f9938I.m5623a("Using local app measurement service");
                        serviceConnectionC1872l7.f9982a = true;
                        c7297aM14688b.m14689a(context3, intent, serviceConnectionC1872l7.f9984c.f10006c, 129);
                        return;
                    }
                }
            }
            C1860k3 c1860k8 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k8);
            c1860k8.f9942f.m5623a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5768w() {
        mo5748g();
        m5851h();
        ServiceConnectionC1872l6 serviceConnectionC1872l6 = this.f10006c;
        if (serviceConnectionC1872l6.f9983b != null && (serviceConnectionC1872l6.f9983b.m12875a() || serviceConnectionC1872l6.f9983b.m12880g())) {
            serviceConnectionC1872l6.f9983b.m12882i();
        }
        serviceConnectionC1872l6.f9983b = null;
        try {
            C7297a.m14688b().m14690c(((C1897o4) this.f10430a).f10076a, this.f10006c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10007d = null;
    }

    /* JADX INFO: renamed from: x */
    public final void m5769x(AtomicReference atomicReference) {
        mo5748g();
        m5851h();
        m5766t(new RunnableC1994z3(2, this, atomicReference, m5763q(false)));
    }
}
