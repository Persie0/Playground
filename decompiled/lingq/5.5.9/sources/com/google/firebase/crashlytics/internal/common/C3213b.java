package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.C0322j;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import dm.C5212l;
import ie.C6323d;
import ie.InterfaceC6320a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import je.InterfaceC6465a;
import me.C7545c;
import me.C7547e;
import me.C7550h;
import ne.AbstractC7743b0;
import ne.C7741a0;
import ne.C7742b;
import ne.C7744c;
import ne.C7745c0;
import ne.C7746d;
import ne.C7751h;
import ne.C7752i;
import ne.C7754k;
import ne.C7755l;
import ne.C7756m;
import ne.C7757n;
import ne.C7760q;
import ne.C7765v;
import ne.C7767x;
import ne.C7768y;
import ne.C7769z;
import p067d8.C5085y;
import p112f8.C5476a;
import p133g7.ExecutorC5712e;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.C5753i;
import p136gc.C5756l;
import p136gc.C5761q;
import p235l5.C7260g;
import p241le.C7322a;
import p241le.C7323a0;
import p241le.C7328d;
import p241le.C7331e0;
import p241le.C7332f;
import p241le.C7335g0;
import p241le.C7337h0;
import p241le.C7341l;
import p241le.C7344o;
import p241le.C7354y;
import p241le.CallableC7348s;
import p298oe.C8038a;
import p339qe.C8596a;
import p339qe.C8597b;
import p402u0.C9369l;
import p483xe.C10181d;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3213b {

    /* JADX INFO: renamed from: q */
    public static final C5085y f16204q = new C5085y(3);

    /* JADX INFO: renamed from: a */
    public final Context f16205a;

    /* JADX INFO: renamed from: b */
    public final C7323a0 f16206b;

    /* JADX INFO: renamed from: c */
    public final C0322j f16207c;

    /* JADX INFO: renamed from: d */
    public final C7550h f16208d;

    /* JADX INFO: renamed from: e */
    public final C7332f f16209e;

    /* JADX INFO: renamed from: f */
    public final C7331e0 f16210f;

    /* JADX INFO: renamed from: g */
    public final C8597b f16211g;

    /* JADX INFO: renamed from: h */
    public final C7322a f16212h;

    /* JADX INFO: renamed from: i */
    public final C7545c f16213i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6320a f16214j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6465a f16215k;

    /* JADX INFO: renamed from: l */
    public final C7335g0 f16216l;

    /* JADX INFO: renamed from: m */
    public C3214c f16217m;

    /* JADX INFO: renamed from: n */
    public final C5752h<Boolean> f16218n = new C5752h<>();

    /* JADX INFO: renamed from: o */
    public final C5752h<Boolean> f16219o = new C5752h<>();

    /* JADX INFO: renamed from: p */
    public final C5752h<Void> f16220p = new C5752h<>();

    public C3213b(Context context, C7332f c7332f, C7331e0 c7331e0, C7323a0 c7323a0, C8597b c8597b, C0322j c0322j, C7322a c7322a, C7550h c7550h, C7545c c7545c, C7335g0 c7335g0, InterfaceC6320a interfaceC6320a, InterfaceC6465a interfaceC6465a) {
        new AtomicBoolean(false);
        this.f16205a = context;
        this.f16209e = c7332f;
        this.f16210f = c7331e0;
        this.f16206b = c7323a0;
        this.f16211g = c8597b;
        this.f16207c = c0322j;
        this.f16212h = c7322a;
        this.f16208d = c7550h;
        this.f16213i = c7545c;
        this.f16214j = interfaceC6320a;
        this.f16215k = interfaceC6465a;
        this.f16216l = c7335g0;
    }

    /* JADX INFO: renamed from: a */
    public static void m9162a(C3213b c3213b, String str) {
        Integer num;
        c3213b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strM852k = C0204c.m852k("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM852k, null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.3.6");
        C7331e0 c7331e0 = c3213b.f16210f;
        String str3 = c7331e0.f41046c;
        C7322a c7322a = c3213b.f16212h;
        C7768y c7768y = new C7768y(str3, c7322a.f41018f, c7322a.f41019g, c7331e0.m14747c(), DeliveryMechanism.determineFrom(c7322a.f41016d).getId(), c7322a.f41020h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        C7741a0 c7741a0 = new C7741a0(str4, str5, CommonUtils.m9158j());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = CommonUtils.Architecture.getValue().ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM9155g = CommonUtils.m9155g();
        boolean zM9157i = CommonUtils.m9157i();
        int iM9152d = CommonUtils.m9152d();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        c3213b.f16214j.mo12948d(str, str2, jCurrentTimeMillis, new C7767x(c7768y, c7741a0, new C7769z(iOrdinal, str6, iAvailableProcessors, jM9155g, blockCount, zM9157i, iM9152d, str7, str8)));
        c3213b.f16213i.m15054a(str);
        C7335g0 c7335g0 = c3213b.f16216l;
        C7354y c7354y = c7335g0.f41056a;
        c7354y.getClass();
        Charset charset = AbstractC7743b0.f42522a;
        C7742b.a aVar = new C7742b.a();
        aVar.f42513a = "18.3.6";
        C7322a c7322a2 = c7354y.f41114c;
        String str9 = c7322a2.f41013a;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar.f42514b = str9;
        C7331e0 c7331e1 = c7354y.f41113b;
        String strM14747c = c7331e1.m14747c();
        if (strM14747c == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar.f42516d = strM14747c;
        String str10 = c7322a2.f41018f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar.f42517e = str10;
        String str11 = c7322a2.f41019g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar.f42518f = str11;
        aVar.f42515c = 4;
        C7751h.a aVar2 = new C7751h.a();
        aVar2.f42566e = Boolean.FALSE;
        aVar2.f42564c = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar2.f42563b = str;
        String str12 = C7354y.f41111g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar2.f42562a = str12;
        String str13 = c7331e1.f41046c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String strM14747c2 = c7331e1.m14747c();
        C6323d c6323d = c7322a2.f41020h;
        if (c6323d.f36551b == null) {
            c6323d.f36551b = new C6323d.a(c6323d);
        }
        C6323d.a aVar3 = c6323d.f36551b;
        String str14 = aVar3.f36552a;
        if (aVar3 == null) {
            c6323d.f36551b = new C6323d.a(c6323d);
        }
        aVar2.f42567f = new C7752i(str13, str10, str11, strM14747c2, str14, c6323d.f36551b.f36553b);
        C7765v.a aVar4 = new C7765v.a();
        aVar4.f42669a = 3;
        aVar4.f42670b = str4;
        aVar4.f42671c = str5;
        aVar4.f42672d = Boolean.valueOf(CommonUtils.m9158j());
        aVar2.f42569h = aVar4.m15471a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str15 = Build.CPU_ABI;
        int iIntValue = (TextUtils.isEmpty(str15) || (num = (Integer) C7354y.f41110f.get(str15.toLowerCase(locale))) == null) ? 7 : num.intValue();
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM9155g2 = CommonUtils.m9155g();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zM9157i2 = CommonUtils.m9157i();
        int iM9152d2 = CommonUtils.m9152d();
        C7754k.a aVar5 = new C7754k.a();
        aVar5.f42589a = Integer.valueOf(iIntValue);
        aVar5.f42590b = str6;
        aVar5.f42591c = Integer.valueOf(iAvailableProcessors2);
        aVar5.f42592d = Long.valueOf(jM9155g2);
        aVar5.f42593e = Long.valueOf(blockCount2);
        aVar5.f42594f = Boolean.valueOf(zM9157i2);
        aVar5.f42595g = Integer.valueOf(iM9152d2);
        aVar5.f42596h = str7;
        aVar5.f42597i = str8;
        aVar2.f42570i = aVar5.m15465a();
        aVar2.f42572k = 3;
        aVar.f42519g = aVar2.m15464a();
        C7742b c7742bM15348a = aVar.m15348a();
        C8597b c8597b = c7335g0.f41057b.f46073b;
        AbstractC7743b0.e eVar = c7742bM15348a.f42510h;
        if (eVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strMo15374g = eVar.mo15374g();
        try {
            C8596a.f46069f.getClass();
            C10181d c10181d = C8038a.f43690a;
            c10181d.getClass();
            StringWriter stringWriter = new StringWriter();
            try {
                c10181d.m19192a(c7742bM15348a, stringWriter);
            } catch (IOException unused) {
            }
            C8596a.m16812e(c8597b.m16819b(strMo15374g, "report"), stringWriter.toString());
            File fileM16819b = c8597b.m16819b(strMo15374g, "start-time");
            long jMo15376i = eVar.mo15376i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM16819b), C8596a.f46067d);
            try {
                outputStreamWriter.write("");
                fileM16819b.setLastModified(jMo15376i * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            String strM852k2 = C0204c.m852k("Could not persist report for session ", strMo15374g);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strM852k2, e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5761q m9163b(C3213b c3213b) {
        boolean z10;
        C5761q c5761qM8538b;
        c3213b.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C8597b.m16818e(c3213b.f16211g.f46076b.listFiles(f16204q))) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    c5761qM8538b = Tasks.m8539c(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    c5761qM8538b = Tasks.m8538b(new ScheduledThreadPoolExecutor(1), new CallableC7348s(c3213b, j10));
                }
                arrayList.add(c5761qM8538b);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.m8540d(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0370  */
    /* JADX WARN: Code duplicated, block: B:107:0x037f  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:120:0x040d  */
    /* JADX WARN: Code duplicated, block: B:124:0x041d A[LOOP:1: B:124:0x041d->B:129:0x043b, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:126:0x0423  */
    /* JADX WARN: Code duplicated, block: B:128:0x0436  */
    /* JADX WARN: Code duplicated, block: B:133:0x0451  */
    /* JADX WARN: Code duplicated, block: B:135:0x0466  */
    /* JADX WARN: Code duplicated, block: B:138:0x0483  */
    /* JADX WARN: Code duplicated, block: B:140:0x0493  */
    /* JADX WARN: Code duplicated, block: B:141:0x0499  */
    /* JADX WARN: Code duplicated, block: B:144:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d1 A[Catch: IOException -> 0x0504, TryCatch #4 {IOException -> 0x0504, blocks: (B:145:0x04b4, B:146:0x04bb, B:148:0x04c9, B:149:0x04cc, B:151:0x04d1, B:153:0x04dd, B:168:0x04fc, B:167:0x04f9, B:170:0x04fe, B:171:0x0503), top: B:212:0x04b4, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:176:0x051d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0532  */
    /* JADX WARN: Code duplicated, block: B:181:0x0559 A[Catch: IOException -> 0x05a9, TRY_ENTER, TryCatch #1 {IOException -> 0x05a9, blocks: (B:178:0x0541, B:181:0x0559, B:185:0x0575, B:187:0x058c, B:189:0x0599, B:186:0x0581, B:190:0x05a1, B:191:0x05a8), top: B:206:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0572  */
    /* JADX WARN: Code duplicated, block: B:184:0x0573 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0575 A[Catch: IOException -> 0x05a9, TryCatch #1 {IOException -> 0x05a9, blocks: (B:178:0x0541, B:181:0x0559, B:185:0x0575, B:187:0x058c, B:189:0x0599, B:186:0x0581, B:190:0x05a1, B:191:0x05a8), top: B:206:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0581 A[Catch: IOException -> 0x05a9, TryCatch #1 {IOException -> 0x05a9, blocks: (B:178:0x0541, B:181:0x0559, B:185:0x0575, B:187:0x058c, B:189:0x0599, B:186:0x0581, B:190:0x05a1, B:191:0x05a8), top: B:206:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x05a1 A[Catch: IOException -> 0x05a9, TryCatch #1 {IOException -> 0x05a9, blocks: (B:178:0x0541, B:181:0x0559, B:185:0x0575, B:187:0x058c, B:189:0x0599, B:186:0x0581, B:190:0x05a1, B:191:0x05a8), top: B:206:0x0541 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:201:0x05ee A[LOOP:4: B:199:0x05e8->B:201:0x05ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x05f8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:223:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Instruction removed from duplicated block: B:176:0x051d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m9164c(boolean z10, InterfaceC8996f interfaceC8996f) {
        ArrayList arrayList;
        C8596a c8596a;
        C3213b c3213b;
        boolean z11;
        InterfaceC6320a interfaceC6320a;
        boolean z12;
        Object obj;
        long jCurrentTimeMillis;
        C8597b c8597b;
        File file;
        NavigableSet<String> navigableSetDescendingSet;
        int size;
        File file2;
        ArrayList arrayListM16813b;
        int size2;
        Iterator it;
        String strM852k;
        List listM16818e;
        ArrayList arrayList2;
        Iterator it2;
        boolean zHasNext;
        C8038a c8038a;
        File fileM16819b;
        C7742b c7742bM15349j;
        C7745c0<AbstractC7743b0.e.d> c7745c0;
        AbstractC7743b0.e eVar;
        C7742b c7742bM15348a;
        AbstractC7743b0.e eVar2;
        File file3;
        File file4;
        JsonReader jsonReader;
        String name;
        boolean z13;
        String strM611g;
        String strM852k2;
        String strM852k3;
        ApplicationExitInfo applicationExitInfoM14624c;
        String string;
        String str;
        C8596a c8596a2;
        C7745c0<AbstractC7743b0.a.AbstractC10653a> c7745c1;
        C7335g0 c7335g0 = this.f16216l;
        C8596a c8596a3 = c7335g0.f41057b;
        c8596a3.getClass();
        ArrayList arrayList3 = new ArrayList(new TreeSet(C8597b.m16818e(c8596a3.f46073b.f46077c.list())).descendingSet());
        if (arrayList3.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList3.get(z10 ? 1 : 0);
        boolean z14 = ((C3215a) interfaceC8996f).m9171b().f47176b.f47182b;
        boolean z15 = true;
        C8596a c8596a4 = c7335g0.f41057b;
        if (z14) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f16205a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    C8597b c8597b2 = this.f16211g;
                    C7545c c7545c = new C7545c(c8597b2, str2);
                    C7547e c7547e = new C7547e(c8597b2);
                    C7550h c7550h = new C7550h(str2, c8597b2, this.f16209e);
                    c7550h.f41651d.f41654a.getReference().m15053b(c7547e.m15057b(str2, false));
                    c7550h.f41652e.f41654a.getReference().m15053b(c7547e.m15057b(str2, true));
                    c7550h.f41653f.set(c7547e.m15058c(str2), false);
                    long jLastModified = c8596a4.f46073b.m16819b(str2, "start-time").lastModified();
                    Iterator it3 = historicalProcessExitReasons.iterator();
                    do {
                        if (it3.hasNext()) {
                            applicationExitInfoM14624c = C7260g.m14624c(it3.next());
                            if (applicationExitInfoM14624c.getTimestamp() < jLastModified) {
                            }
                        }
                        applicationExitInfoM14624c = null;
                        break;
                    } while (applicationExitInfoM14624c.getReason() != 6);
                    if (applicationExitInfoM14624c == null) {
                        String strM852k4 = C0204c.m852k("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM852k4, null);
                        }
                        z11 = true;
                        c3213b = this;
                        arrayList = arrayList3;
                        c8596a = c8596a4;
                    } else {
                        try {
                            InputStream traceInputStream = applicationExitInfoM14624c.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i11 = traceInputStream.read(bArr);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i11);
                                    }
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e10) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoM14624c.toString() + " Error: " + e10, null);
                        }
                        C7744c.a aVar = new C7744c.a();
                        aVar.f42535d = Integer.valueOf(applicationExitInfoM14624c.getImportance());
                        String processName = applicationExitInfoM14624c.getProcessName();
                        String str3 = "Null processName";
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        aVar.f42533b = processName;
                        aVar.f42534c = Integer.valueOf(applicationExitInfoM14624c.getReason());
                        aVar.f42538g = Long.valueOf(applicationExitInfoM14624c.getTimestamp());
                        aVar.f42532a = Integer.valueOf(applicationExitInfoM14624c.getPid());
                        aVar.f42536e = Long.valueOf(applicationExitInfoM14624c.getPss());
                        aVar.f42537f = Long.valueOf(applicationExitInfoM14624c.getRss());
                        aVar.f42539h = string;
                        C7744c c7744cM15445a = aVar.m15445a();
                        C7354y c7354y = c7335g0.f41056a;
                        int i12 = c7354y.f41112a.getResources().getConfiguration().orientation;
                        C7755l.a aVar2 = new C7755l.a();
                        aVar2.f42604b = "anr";
                        long j10 = c7744cM15445a.f42529g;
                        aVar2.f42603a = Long.valueOf(j10);
                        arrayList = arrayList3;
                        if (((C3215a) c7354y.f41116e).m9171b().f47176b.f47183c) {
                            C7322a c7322a = c7354y.f41114c;
                            if (c7322a.f41015c.size() > 0) {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator<C7328d> it4 = c7322a.f41015c.iterator();
                                while (it4.hasNext()) {
                                    Iterator<C7328d> it5 = it4;
                                    C7328d next = it4.next();
                                    String str4 = next.f41037a;
                                    if (str4 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    String str5 = str3;
                                    String str6 = next.f41038b;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str7 = next.f41039c;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList4.add(new C7746d(str6, str4, str7));
                                    it4 = it5;
                                    str3 = str5;
                                    c8596a4 = c8596a4;
                                }
                                str = str3;
                                c8596a2 = c8596a4;
                                c7745c1 = new C7745c0<>(arrayList4);
                            } else {
                                str = "Null processName";
                                c8596a2 = c8596a4;
                                c7745c1 = null;
                            }
                        } else {
                            str = "Null processName";
                            c8596a2 = c8596a4;
                            c7745c1 = null;
                        }
                        C7744c.a aVar3 = new C7744c.a();
                        aVar3.f42535d = Integer.valueOf(c7744cM15445a.f42526d);
                        String str8 = c7744cM15445a.f42524b;
                        if (str8 == null) {
                            throw new NullPointerException(str);
                        }
                        aVar3.f42533b = str8;
                        aVar3.f42534c = Integer.valueOf(c7744cM15445a.f42525c);
                        aVar3.f42538g = Long.valueOf(j10);
                        aVar3.f42532a = Integer.valueOf(c7744cM15445a.f42523a);
                        aVar3.f42536e = Long.valueOf(c7744cM15445a.f42527e);
                        aVar3.f42537f = Long.valueOf(c7744cM15445a.f42528f);
                        aVar3.f42539h = c7744cM15445a.f42530h;
                        aVar3.f42540i = c7745c1;
                        C7744c c7744cM15445a2 = aVar3.m15445a();
                        Boolean boolValueOf = Boolean.valueOf(c7744cM15445a2.f42526d != 100);
                        Integer numValueOf = Integer.valueOf(i12);
                        Long l10 = 0L;
                        String str9 = l10 == null ? " address" : "";
                        if (!str9.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str9));
                        }
                        C7757n c7757n = new C7757n(null, null, c7744cM15445a2, new C7760q("0", "0", l10.longValue()), c7354y.m14762a());
                        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        aVar2.f42605c = new C7756m(c7757n, null, null, boolValueOf, numValueOf.intValue());
                        aVar2.f42606d = c7354y.m14763b(i12);
                        C7755l c7755lM15466a = aVar2.m15466a();
                        String strM852k5 = C0204c.m852k("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strM852k5, null);
                        }
                        z15 = true;
                        c8596a = c8596a2;
                        c8596a.m16814c(C7335g0.m14750a(c7755lM15466a, c7545c, c7550h), str2, true);
                    }
                    interfaceC6320a = c3213b.f16214j;
                    if (interfaceC6320a.mo12947c(str2)) {
                        strM852k3 = C0204c.m852k("Finalizing native report for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM852k3, null);
                        }
                        interfaceC6320a.mo12945a(str2).getClass();
                        Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, null);
                        Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, null);
                        Log.w("FirebaseCrashlytics", "No native core present", null);
                    }
                    if (z10 != 0) {
                        z12 = false;
                        obj = (String) arrayList.get(0);
                    } else {
                        z12 = false;
                        obj = null;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    c8597b = c8596a.f46073b;
                    c8597b.getClass();
                    file = c8597b.f46075a;
                    C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics"));
                    C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics-ndk"));
                    if (Build.VERSION.SDK_INT < 28) {
                        z11 = z12;
                    }
                    if (z11) {
                        C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
                    }
                    navigableSetDescendingSet = new TreeSet(C8597b.m16818e(c8596a.f46073b.f46077c.list())).descendingSet();
                    if (obj != null) {
                        navigableSetDescendingSet.remove(obj);
                    }
                    size = navigableSetDescendingSet.size();
                    file2 = c8597b.f46077c;
                    if (size > 8) {
                        while (navigableSetDescendingSet.size() > 8) {
                            String str10 = (String) navigableSetDescendingSet.last();
                            strM852k2 = C0204c.m852k("Removing session over cap: ", str10);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", strM852k2, null);
                            }
                            C8597b.m16817d(new File(file2, str10));
                            navigableSetDescendingSet.remove(str10);
                        }
                    }
                    for (String str11 : navigableSetDescendingSet) {
                        strM852k = C0204c.m852k("Finalizing report for session ", str11);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM852k, null);
                        }
                        C5476a c5476a = C8596a.f46071h;
                        File file5 = new File(file2, str11);
                        file5.mkdirs();
                        listM16818e = C8597b.m16818e(file5.listFiles(c5476a));
                        if (!listM16818e.isEmpty()) {
                            Collections.sort(listM16818e);
                            arrayList2 = new ArrayList();
                            it2 = listM16818e.iterator();
                            while (true) {
                                zHasNext = it2.hasNext();
                                c8038a = C8596a.f46069f;
                                if (zHasNext) {
                                    if (!arrayList2.isEmpty()) {
                                        String strM15058c = new C7547e(c8597b).m15058c(str11);
                                        fileM16819b = c8597b.m16819b(str11, "report");
                                        try {
                                            String strM16811d = C8596a.m16811d(fileM16819b);
                                            c8038a.getClass();
                                            c7742bM15349j = C8038a.m15921h(strM16811d).m15349j(jCurrentTimeMillis, strM15058c, z12);
                                            c7745c0 = new C7745c0<>(arrayList2);
                                            eVar = c7742bM15349j.f42510h;
                                            if (eVar != null) {
                                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                            }
                                            C7742b.a aVar4 = new C7742b.a(c7742bM15349j);
                                            C7751h.a aVarMo15379l = eVar.mo15379l();
                                            aVarMo15379l.f42571j = c7745c0;
                                            aVar4.f42519g = aVarMo15379l.m15464a();
                                            c7742bM15348a = aVar4.m15348a();
                                            eVar2 = c7742bM15348a.f42510h;
                                            if (eVar2 != null) {
                                                break;
                                            }
                                            if (z12) {
                                                file3 = new File(c8597b.f46079e, eVar2.mo15374g());
                                            } else {
                                                file3 = new File(c8597b.f46078d, eVar2.mo15374g());
                                            }
                                            C10181d c10181d = C8038a.f43690a;
                                            c10181d.getClass();
                                            StringWriter stringWriter = new StringWriter();
                                            try {
                                                c10181d.m19192a(c7742bM15348a, stringWriter);
                                            } catch (IOException unused) {
                                            }
                                            C8596a.m16812e(file3, stringWriter.toString());
                                            break;
                                        } catch (IOException e11) {
                                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM16819b, e11);
                                            break;
                                        }
                                    }
                                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                                    break;
                                }
                                file4 = (File) it2.next();
                                try {
                                    String strM16811d2 = C8596a.m16811d(file4);
                                    c8038a.getClass();
                                    try {
                                        jsonReader = new JsonReader(new StringReader(strM16811d2));
                                        try {
                                            C7755l c7755lM15918e = C8038a.m15918e(jsonReader);
                                            jsonReader.close();
                                            arrayList2.add(c7755lM15918e);
                                            if (!z12) {
                                                name = file4.getName();
                                                if (name.startsWith("event") || !name.endsWith("_")) {
                                                    z13 = false;
                                                } else {
                                                    z13 = true;
                                                }
                                                if (z13) {
                                                    z12 = false;
                                                }
                                            }
                                            z12 = true;
                                        } catch (Throwable th2) {
                                            try {
                                                jsonReader.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (IllegalStateException e12) {
                                        throw new IOException(e12);
                                    }
                                } catch (IOException e13) {
                                    Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e13);
                                }
                            }
                        } else {
                            strM611g = C0141b.m611g("Session ", str11, " has no events.");
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", strM611g, null);
                            }
                        }
                        C8597b.m16817d(new File(file2, str11));
                        z12 = false;
                    }
                    ((C3215a) c8596a.f46074c).m9171b().f47175a.getClass();
                    arrayListM16813b = c8596a.m16813b();
                    size2 = arrayListM16813b.size();
                    if (size2 <= 4) {
                        return;
                    }
                    it = arrayListM16813b.subList(4, size2).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
                arrayList = arrayList3;
                c8596a = c8596a4;
                String strM852k6 = C0204c.m852k("No ApplicationExitInfo available. Session: ", str2);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM852k6, null);
                }
            } else {
                arrayList = arrayList3;
                c8596a = c8596a4;
                String strM761g = C0166e.m761g("ANR feature enabled, but device is API ", i10);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM761g, null);
                }
            }
        } else {
            arrayList = arrayList3;
            c8596a = c8596a4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        c3213b = this;
        z11 = z15;
        interfaceC6320a = c3213b.f16214j;
        if (interfaceC6320a.mo12947c(str2)) {
            strM852k3 = C0204c.m852k("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM852k3, null);
            }
            interfaceC6320a.mo12945a(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, null);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, null);
            Log.w("FirebaseCrashlytics", "No native core present", null);
        }
        if (z10 != 0) {
            z12 = false;
            obj = (String) arrayList.get(0);
        } else {
            z12 = false;
            obj = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        c8597b = c8596a.f46073b;
        c8597b.getClass();
        file = c8597b.f46075a;
        C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics"));
        C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT < 28) {
            z11 = z12;
        }
        if (z11) {
            C8597b.m16815a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        navigableSetDescendingSet = new TreeSet(C8597b.m16818e(c8596a.f46073b.f46077c.list())).descendingSet();
        if (obj != null) {
            navigableSetDescendingSet.remove(obj);
        }
        size = navigableSetDescendingSet.size();
        file2 = c8597b.f46077c;
        if (size > 8) {
            while (navigableSetDescendingSet.size() > 8) {
                String str12 = (String) navigableSetDescendingSet.last();
                strM852k2 = C0204c.m852k("Removing session over cap: ", str12);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strM852k2, null);
                }
                C8597b.m16817d(new File(file2, str12));
                navigableSetDescendingSet.remove(str12);
            }
        }
        while (r4.hasNext()) {
            strM852k = C0204c.m852k("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM852k, null);
            }
            C5476a c5476a2 = C8596a.f46071h;
            File file6 = new File(file2, str11);
            file6.mkdirs();
            listM16818e = C8597b.m16818e(file6.listFiles(c5476a2));
            if (!listM16818e.isEmpty()) {
                strM611g = C0141b.m611g("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM611g, null);
                }
            } else {
                Collections.sort(listM16818e);
                arrayList2 = new ArrayList();
                it2 = listM16818e.iterator();
                while (true) {
                    zHasNext = it2.hasNext();
                    c8038a = C8596a.f46069f;
                    if (zHasNext) {
                        if (!arrayList2.isEmpty()) {
                            Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                            break;
                            break;
                        }
                        String strM15058c2 = new C7547e(c8597b).m15058c(str11);
                        fileM16819b = c8597b.m16819b(str11, "report");
                        String strM16811d3 = C8596a.m16811d(fileM16819b);
                        c8038a.getClass();
                        c7742bM15349j = C8038a.m15921h(strM16811d3).m15349j(jCurrentTimeMillis, strM15058c2, z12);
                        c7745c0 = new C7745c0<>(arrayList2);
                        eVar = c7742bM15349j.f42510h;
                        if (eVar != null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        C7742b.a aVar5 = new C7742b.a(c7742bM15349j);
                        C7751h.a aVarMo15379l2 = eVar.mo15379l();
                        aVarMo15379l2.f42571j = c7745c0;
                        aVar5.f42519g = aVarMo15379l2.m15464a();
                        c7742bM15348a = aVar5.m15348a();
                        eVar2 = c7742bM15348a.f42510h;
                        if (eVar2 != null) {
                            break;
                            break;
                        }
                        if (z12) {
                            file3 = new File(c8597b.f46079e, eVar2.mo15374g());
                        } else {
                            file3 = new File(c8597b.f46078d, eVar2.mo15374g());
                        }
                        C10181d c10181d2 = C8038a.f43690a;
                        c10181d2.getClass();
                        StringWriter stringWriter2 = new StringWriter();
                        c10181d2.m19192a(c7742bM15348a, stringWriter2);
                        C8596a.m16812e(file3, stringWriter2.toString());
                        break;
                        break;
                    }
                    file4 = (File) it2.next();
                    String strM16811d4 = C8596a.m16811d(file4);
                    c8038a.getClass();
                    jsonReader = new JsonReader(new StringReader(strM16811d4));
                    C7755l c7755lM15918e2 = C8038a.m15918e(jsonReader);
                    jsonReader.close();
                    arrayList2.add(c7755lM15918e2);
                    if (!z12) {
                        name = file4.getName();
                        if (name.startsWith("event")) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z12 = false;
                        }
                    }
                    z12 = true;
                }
            }
            C8597b.m16817d(new File(file2, str11));
            z12 = false;
        }
        ((C3215a) c8596a.f46074c).m9171b().f47175a.getClass();
        arrayListM16813b = c8596a.m16813b();
        size2 = arrayListM16813b.size();
        if (size2 <= 4) {
            return;
        }
        it = arrayListM16813b.subList(4, size2).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m9165d(InterfaceC8996f interfaceC8996f) {
        if (!Boolean.TRUE.equals(this.f16209e.f41053d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        C3214c c3214c = this.f16217m;
        if (c3214c != null && c3214c.f16225e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            m9164c(true, interfaceC8996f);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m9166e() {
        C8596a c8596a = this.f16216l.f41057b;
        c8596a.getClass();
        NavigableSet navigableSetDescendingSet = new TreeSet(C8597b.m16818e(c8596a.f46073b.f46077c.list())).descendingSet();
        if (navigableSetDescendingSet.isEmpty()) {
            return null;
        }
        return (String) navigableSetDescendingSet.first();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"TaskMainThread"})
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g m9167f(C5761q c5761q) {
        C5761q c5761q2;
        C5761q c5761qM8539c;
        C8597b c8597b = this.f16216l.f41057b.f46073b;
        boolean z10 = (C8597b.m16818e(c8597b.f46078d.listFiles()).isEmpty() && C8597b.m16818e(c8597b.f46079e.listFiles()).isEmpty() && C8597b.m16818e(c8597b.f46080f.listFiles()).isEmpty()) ? false : true;
        C5752h<Boolean> c5752h = this.f16218n;
        if (!z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c5752h.m12116d(Boolean.FALSE);
            return Tasks.m8539c(null);
        }
        C5212l c5212l = C5212l.f33289h;
        c5212l.m11193q0("Crash reports are available to be sent.");
        C7323a0 c7323a0 = this.f16206b;
        int i10 = 3;
        if (c7323a0.m14737a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c5752h.m12116d(Boolean.FALSE);
            c5761qM8539c = Tasks.m8539c(Boolean.TRUE);
        } else {
            c5212l.m11188H("Automatic data collection is disabled.");
            c5212l.m11193q0("Notifying that unsent reports are available.");
            c5752h.m12116d(Boolean.TRUE);
            synchronized (c7323a0.f41022b) {
                c5761q2 = c7323a0.f41023c.f34812a;
            }
            C7341l c7341l = new C7341l();
            c5761q2.getClass();
            ExecutorC5712e executorC5712e = C5753i.f34813a;
            C5761q c5761q3 = new C5761q();
            c5761q2.f34836b.m12119a(new C5756l(executorC5712e, c7341l, c5761q3, i10));
            c5761q2.m12126t();
            c5212l.m11188H("Waiting for send/deleteUnsentReports to be called.");
            C5761q c5761q4 = this.f16219o.f34812a;
            ExecutorService executorService = C7337h0.f41062a;
            C5752h c5752h2 = new C5752h();
            C9369l c9369l = new C9369l(17, c5752h2);
            c5761q3.m12121o(c9369l);
            c5761q4.m12121o(c9369l);
            c5761qM8539c = c5752h2.f34812a;
        }
        C7344o c7344o = new C7344o(this, c5761q);
        c5761qM8539c.getClass();
        ExecutorC5712e executorC5712e2 = C5753i.f34813a;
        C5761q c5761q5 = new C5761q();
        c5761qM8539c.f34836b.m12119a(new C5756l(executorC5712e2, c7344o, c5761q5, i10));
        c5761qM8539c.m12126t();
        return c5761q5;
    }
}
