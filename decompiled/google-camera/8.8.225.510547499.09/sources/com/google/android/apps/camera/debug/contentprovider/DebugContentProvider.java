package com.google.android.apps.camera.debug.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.debug.contentprovider.DebugContentProvider;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import p000.dhv;
import p000.dja;
import p000.dkr;
import p000.dkx;
import p000.dky;
import p000.emv;
import p000.hkp;
import p000.hky;
import p000.msi;
import p000.nbe;
import p000.nbh;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DebugContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c */
    private static final nbh f6598c = nbh.m17259h("com/google/android/apps/camera/debug/contentprovider/DebugContentProvider");

    /* JADX INFO: renamed from: a */
    public dhv f6599a;

    /* JADX INFO: renamed from: b */
    public dja f6600b;

    /* JADX INFO: renamed from: d */
    private dky f6601d;

    /* JADX INFO: renamed from: a */
    public static final List m4089a(Class cls, Predicate predicate) {
        Instrumentation instrumentationInstance;
        try {
            instrumentationInstance = Instrumentation.instance();
        } catch (NullPointerException e) {
            instrumentationInstance = null;
        }
        if (instrumentationInstance != null) {
            return (List) Collection$EL.stream(instrumentationInstance.m4297b(cls)).filter(predicate).collect(Collectors.toList());
        }
        ((nbe) ((nbe) f6598c.m17251b()).mo17276G((char) 965)).mo17290o("Could not get an instance of the instrumentation.");
        return new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    private final synchronized dky m4090b() {
        if (this.f6601d == null) {
            Context context = getContext();
            context.getClass();
            dky dkyVar = new dky(String.valueOf(context.getPackageName()).concat(".DebugContentProvider"));
            final int i = 1;
            dkyVar.m6323b("startup_timing_latest", hkp.class, new dkx() { // from class: dkq
                @Override // p000.msi
                /* JADX INFO: renamed from: a */
                public final Object mo6051a() {
                    switch (i) {
                        case 0:
                            return DebugContentProvider.m4089a(hkz.class, cdy.f5382k);
                        default:
                            return DebugContentProvider.m4089a(CameraActivityTiming.class, cdy.f5383l);
                    }
                }
            });
            final int i2 = 0;
            dkyVar.m6323b("shutter_lag_latest", hky.class, new dkx() { // from class: dkq
                @Override // p000.msi
                /* JADX INFO: renamed from: a */
                public final Object mo6051a() {
                    switch (i2) {
                        case 0:
                            return DebugContentProvider.m4089a(hkz.class, cdy.f5382k);
                        default:
                            return DebugContentProvider.m4089a(CameraActivityTiming.class, cdy.f5383l);
                    }
                }
            });
            this.f6601d = dkyVar;
        }
        return this.f6601d;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        ((nbe) ((nbe) f6598c.m17251b()).mo17276G((char) 961)).mo17290o("Delete not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }

    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str = BEeWZPor.rAC;
        try {
            if (this.f6600b == null) {
                Context context = getContext();
                context.getClass();
                ((dkr) ((emv) context.getApplicationContext()).mo4193e(dkr.class)).mo6318f(this);
            }
            printWriter.printf("Build flavor: %s", this.f6600b.name());
            printWriter.println();
            printWriter.println();
            dky dkyVarM4090b = m4090b();
            int i = 5;
            printWriter.printf("%s,%s,%s,%s,%s", "path", str, "run", "name", "time_ns");
            printWriter.println();
            for (Map.Entry entry : dkyVarM4090b.f11912e.entrySet()) {
                Cursor cursorM6322a = dkyVarM4090b.m6322a((dkx) entry.getValue(), true, dky.f11909b);
                while (cursorM6322a.moveToNext()) {
                    try {
                        Object[] objArr = new Object[i];
                        objArr[0] = entry.getKey();
                        objArr[1] = Integer.valueOf(cursorM6322a.getInt(cursorM6322a.getColumnIndex(str)));
                        objArr[2] = Integer.valueOf(cursorM6322a.getInt(cursorM6322a.getColumnIndex("run")));
                        objArr[3] = cursorM6322a.getString(cursorM6322a.getColumnIndex("name"));
                        objArr[4] = Long.valueOf(cursorM6322a.getLong(cursorM6322a.getColumnIndex("time_ns")));
                        printWriter.printf("%s,%d,%d,%s,%d", objArr);
                        printWriter.println();
                        i = 5;
                    } catch (Throwable th) {
                        try {
                            cursorM6322a.close();
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                throw th;
                            } catch (Exception e) {
                                throw th;
                            }
                        }
                    }
                }
                cursorM6322a.close();
                i = 5;
            }
            if (this.f6599a != null) {
                printWriter.println();
                this.f6599a.mo6174b();
            }
        } catch (Exception e2) {
            ((nbe) ((nbe) ((nbe) f6598c.m17251b()).mo17283h(e2)).mo17276G((char) 966)).mo17290o("Dump exception");
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ((nbe) ((nbe) f6598c.m17251b()).mo17276G((char) 964)).mo17290o("Insert not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || !(gBCSQzBeB.rIxFUc.equals(callingPackage) || "root".equals(callingPackage))) {
            throw new IllegalArgumentException();
        }
        Cursor cursor = null;
        try {
            dky dkyVarM4090b = m4090b();
            msi msiVar = (msi) dkyVarM4090b.f11911d.get(Integer.valueOf(dkyVarM4090b.f11910c.match(uri)));
            if (msiVar == null) {
                ((nbe) ((nbe) dky.f11908a.m17251b()).mo17276G((char) 968)).mo17293r("bad uri %s", uri);
            } else {
                cursor = (Cursor) msiVar.mo6051a();
            }
        } catch (Exception e) {
            ((nbe) ((nbe) ((nbe) f6598c.m17251b()).mo17283h(e)).mo17276G((char) 963)).mo17290o("Query exception");
        }
        return cursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        ((nbe) ((nbe) f6598c.m17251b()).mo17276G((char) 962)).mo17290o("Update not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }
}
