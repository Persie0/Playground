package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v4d extends i9c {

    /* JADX INFO: renamed from: c */
    public final e4d f64865c;

    /* JADX INFO: renamed from: d */
    public q9c f64866d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f64867e;

    /* JADX INFO: renamed from: f */
    public final a2d f64868f;

    /* JADX INFO: renamed from: g */
    public ScheduledExecutorService f64869g;

    /* JADX INFO: renamed from: h */
    public final s01 f64870h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f64871i;

    /* JADX INFO: renamed from: j */
    public final a2d f64872j;

    public v4d(kjc kjcVar) {
        super(kjcVar);
        this.f64871i = new ArrayList();
        this.f64870h = new s01(kjcVar.f47443k);
        this.f64865c = new e4d(this);
        this.f64868f = new a2d(this, kjcVar, 0);
        this.f64872j = new a2d(this, kjcVar, 1);
    }

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m23107H(AtomicReference atomicReference) {
        mo12359D();
        m13744E();
        m23117R(new wlc(this, atomicReference, m23119T(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX INFO: renamed from: I */
    public final void m23108I(Bundle bundle) {
        boolean z;
        boolean zM14378K;
        mo12359D();
        m13744E();
        zzbf zzbfVar = new zzbf(bundle);
        m23115P();
        kjc kjcVar = (kjc) this.f60774a;
        if (kjcVar.f47436d.m4869O(null, z8c.f71146W0)) {
            jbc jbcVarM15286n = kjcVar.m15286n();
            kjc kjcVar2 = (kjc) jbcVarM15286n.f60774a;
            rad radVar = kjcVar2.f47441i;
            xcc xccVar = kjcVar2.f47438f;
            kjc.m15278j(radVar);
            byte[] bArrM20511l0 = rad.m20511l0(zzbfVar);
            if (bArrM20511l0 == null) {
                kjc.m15280l(xccVar);
                xccVar.f68081g.m17923a("Null default event parameters; not writing to database");
            } else {
                if (bArrM20511l0.length > 131072) {
                    kjc.m15280l(xccVar);
                    xccVar.f68081g.m17923a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zM14378K = jbcVarM15286n.m14378K(4, bArrM20511l0);
                }
                if (zM14378K) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM14378K = false;
            if (zM14378K) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m23117R(new wrc(this, m23119T(false), z, zzbfVar, bundle));
    }

    /* JADX INFO: renamed from: J */
    public final void m23109J() {
        mo12359D();
        m13744E();
        if (m23120U()) {
            return;
        }
        if (m23110K()) {
            e4d e4dVar = this.f64865c;
            v4d v4dVar = e4dVar.f36710c;
            v4dVar.mo12359D();
            Context context = ((kjc) v4dVar.f60774a).f47433a;
            synchronized (e4dVar) {
                try {
                    if (e4dVar.f36708a) {
                        xcc xccVar = ((kjc) e4dVar.f36710c.f60774a).f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17923a("Connection attempt already in progress");
                        return;
                    } else {
                        if (e4dVar.f36709b != null && (e4dVar.f36709b.m11613q() || e4dVar.f36709b.m11612p())) {
                            xcc xccVar2 = ((kjc) e4dVar.f36710c.f60774a).f47438f;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68076I.m17923a("Already awaiting connection attempt");
                            return;
                        }
                        e4dVar.f36709b = new wbc(context, Looper.getMainLooper(), e4dVar, e4dVar);
                        xcc xccVar3 = ((kjc) e4dVar.f36710c.f60774a).f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68076I.m17923a("Connecting to remote service");
                        e4dVar.f36708a = true;
                        lda.m16130p(e4dVar.f36709b);
                        e4dVar.f36709b.m11607a();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kjc kjcVar = (kjc) this.f60774a;
        if (kjcVar.f47436d.m4861G()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = kjcVar.f47433a.getPackageManager().queryIntentServices(new Intent().setClassName(kjcVar.f47433a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            xcc xccVar4 = kjcVar.f47438f;
            kjc.m15280l(xccVar4);
            xccVar4.f68080f.m17923a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(kjcVar.f47433a, "com.google.android.gms.measurement.AppMeasurementService"));
        e4d e4dVar2 = this.f64865c;
        v4d v4dVar2 = e4dVar2.f36710c;
        v4dVar2.mo12359D();
        Context context2 = ((kjc) v4dVar2.f60774a).f47433a;
        li1 li1VarM16230b = li1.m16230b();
        synchronized (e4dVar2) {
            try {
                boolean z = e4dVar2.f36708a;
                v4d v4dVar3 = e4dVar2.f36710c;
                if (z) {
                    xcc xccVar5 = ((kjc) v4dVar3.f60774a).f47438f;
                    kjc.m15280l(xccVar5);
                    xccVar5.f68076I.m17923a("Connection attempt already in progress");
                } else {
                    xcc xccVar6 = ((kjc) v4dVar3.f60774a).f47438f;
                    kjc.m15280l(xccVar6);
                    xccVar6.f68076I.m17923a("Using local app measurement service");
                    e4dVar2.f36708a = true;
                    li1VarM16230b.m16231a(context2, intent, v4dVar3.f64865c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m23110K() {
        mo12359D();
        m13744E();
        if (this.f64867e == null) {
            mo12359D();
            m13744E();
            kjc kjcVar = (kjc) this.f60774a;
            qfc qfcVar = kjcVar.f47437e;
            kjc.m15278j(qfcVar);
            qfcVar.mo12359D();
            boolean z = false;
            Boolean boolValueOf = !qfcVar.m19930H().contains("use_service") ? null : Boolean.valueOf(qfcVar.m19930H().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                tac tacVarM15289q = ((kjc) this.f60774a).m15289q();
                tacVarM15289q.m13744E();
                if (tacVarM15289q.f62070I == 1) {
                    z = true;
                } else {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("Checking service availability");
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    int iM19432c = po3.f56584b.m19432c(((kjc) radVar.f60774a).f47433a, 12451000);
                    if (iM19432c == 0) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68076I.m17923a("Service available");
                    } else if (iM19432c == 1) {
                        xcc xccVar3 = kjcVar.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68076I.m17923a("Service missing");
                    } else if (iM19432c != 2) {
                        if (iM19432c != 3) {
                            xcc xccVar4 = kjcVar.f47438f;
                            if (iM19432c == 9) {
                                kjc.m15280l(xccVar4);
                                xccVar4.f68083i.m17923a("Service invalid");
                            } else if (iM19432c != 18) {
                                kjc.m15280l(xccVar4);
                                xccVar4.f68083i.m17924b(Integer.valueOf(iM19432c), "Unexpected service status");
                            } else {
                                kjc.m15280l(xccVar4);
                                xccVar4.f68083i.m17923a("Service updating");
                            }
                        } else {
                            xcc xccVar5 = kjcVar.f47438f;
                            kjc.m15280l(xccVar5);
                            xccVar5.f68083i.m17923a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        xcc xccVar6 = kjcVar.f47438f;
                        kjc.m15280l(xccVar6);
                        xccVar6.f68075H.m17923a("Service container out of date");
                        rad radVar2 = kjcVar.f47441i;
                        kjc.m15278j(radVar2);
                        if (radVar2.m20549n0() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && kjcVar.f47436d.m4861G()) {
                    xcc xccVar7 = kjcVar.f47438f;
                    kjc.m15280l(xccVar7);
                    xccVar7.f68080f.m17923a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    qfc qfcVar2 = kjcVar.f47437e;
                    kjc.m15278j(qfcVar2);
                    qfcVar2.mo12359D();
                    SharedPreferences.Editor editorEdit = qfcVar2.m19930H().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f64867e = Boolean.valueOf(z2);
        }
        return this.f64867e.booleanValue();
    }

    /* JADX INFO: renamed from: L */
    public final void m23111L() {
        mo12359D();
        m13744E();
        e4d e4dVar = this.f64865c;
        if (e4dVar.f36709b != null && (e4dVar.f36709b.m11612p() || e4dVar.f36709b.m11613q())) {
            e4dVar.f36709b.m11608c();
        }
        e4dVar.f36709b = null;
        try {
            li1.m16230b().m16232c(((kjc) this.f60774a).f47433a, e4dVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f64866d = null;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m23112M() {
        mo12359D();
        m13744E();
        if (!m23110K()) {
            return true;
        }
        rad radVar = ((kjc) this.f60774a).f47441i;
        kjc.m15278j(radVar);
        return radVar.m20549n0() >= ((Integer) z8c.f71120J0.m21901a(null)).intValue();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m23113N() {
        mo12359D();
        m13744E();
        if (!m23110K()) {
            return true;
        }
        rad radVar = ((kjc) this.f60774a).f47441i;
        kjc.m15278j(radVar);
        return radVar.m20549n0() >= 241200;
    }

    /* JADX INFO: renamed from: O */
    public final void m23114O(ComponentName componentName) {
        mo12359D();
        if (this.f64866d != null) {
            this.f64866d = null;
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(componentName, "Disconnected from device MeasurementService");
            mo12359D();
            m23109J();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m23115P() {
        ((kjc) this.f60774a).getClass();
    }

    /* JADX INFO: renamed from: Q */
    public final void m23116Q() {
        mo12359D();
        s01 s01Var = this.f64870h;
        ((gr7) s01Var.f60111c).getClass();
        s01Var.f60110b = SystemClock.elapsedRealtime();
        ((kjc) this.f60774a).getClass();
        this.f64868f.m25215b(((Long) z8c.f71149Y.m21901a(null)).longValue());
    }

    /* JADX INFO: renamed from: R */
    public final void m23117R(Runnable runnable) {
        mo12359D();
        if (m23120U()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f64871i;
        long size = arrayList.size();
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.getClass();
        if (size >= 1000) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f64872j.m25215b(60000L);
            m23109J();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m23118S() {
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        occ occVar = xccVar.f68076I;
        ArrayList arrayList = this.f64871i;
        occVar.m17924b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f64872j.m25216c();
    }

    /* JADX INFO: renamed from: T */
    public final zzr m23119T(boolean z) {
        long jAbs;
        Pair pair;
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.getClass();
        tac tacVarM15289q = kjcVar.m15289q();
        String strM17739n = null;
        if (z) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            kjc kjcVar2 = (kjc) xccVar.f60774a;
            qfc qfcVar = kjcVar2.f47437e;
            kjc.m15278j(qfcVar);
            if (qfcVar.f57727e != null) {
                qfc qfcVar2 = kjcVar2.f47437e;
                kjc.m15278j(qfcVar2);
                pz2 pz2Var = qfcVar2.f57727e;
                qfc qfcVar3 = (qfc) pz2Var.f57026e;
                qfcVar3.mo12359D();
                qfcVar3.mo12359D();
                long j = ((qfc) pz2Var.f57026e).m19930H().getLong((String) pz2Var.f57023b, 0L);
                if (j == 0) {
                    pz2Var.m19575f();
                    jAbs = 0;
                } else {
                    ((kjc) qfcVar3.f60774a).f47443k.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = pz2Var.f57022a;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    pz2Var.m19575f();
                    pair = null;
                } else {
                    String string = qfcVar3.m19930H().getString((String) pz2Var.f57025d, null);
                    long j3 = qfcVar3.m19930H().getLong((String) pz2Var.f57024c, 0L);
                    pz2Var.m19575f();
                    pair = (string == null || j3 <= 0) ? qfc.f57711U : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != qfc.f57711U) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM17739n = AbstractC3393o1.m17739n(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return tacVarM15289q.m21926H(strM17739n);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m23120U() {
        mo12359D();
        m13744E();
        return this.f64866d != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #50 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:395:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0452  */
    /* JADX WARN: Code duplicated, block: B:271:0x046d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0472 A[PHI: r4 r6 r23 r24 r26 r36 r37
      0x0472: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
      (r4v12 android.database.sqlite.SQLiteDatabase)
      (r4v13 android.database.sqlite.SQLiteDatabase)
      (r4v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0496  */
    /* JADX WARN: Code duplicated, block: B:285:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:287:0x04af  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:304:0x0505  */
    /* JADX WARN: Code duplicated, block: B:305:0x058f  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bc A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #42 {RemoteException -> 0x05ea, blocks: (B:314:0x05b1, B:316:0x05bc), top: B:389:0x05b1 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:337:0x0626  */
    /* JADX WARN: Code duplicated, block: B:339:0x062a  */
    /* JADX WARN: Code duplicated, block: B:341:0x064b  */
    /* JADX WARN: Code duplicated, block: B:347:0x066a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0682  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:383:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049c A[SYNTHETIC] */
    /* JADX INFO: renamed from: V */
    public final void m23121V(q9c q9cVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) throws Throwable {
        ArrayList arrayList;
        kjc kjcVar;
        Context context;
        xcc xccVar;
        int i;
        SQLiteDatabase sQLiteDatabaseM14377J;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        zzbf zzbfVarCreateFromParcel;
        int i5;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        int size;
        int size2;
        int i6;
        dbc dbcVar;
        AbstractSafeParcelable abstractSafeParcelable2;
        t8c t8cVar;
        kjc kjcVar2;
        Context context2;
        xcc xccVar2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        mo12359D();
        m13744E();
        m23115P();
        kjc kjcVar3 = (kjc) this.f60774a;
        kjcVar3.getClass();
        Context context3 = kjcVar3.f47433a;
        cmb cmbVar = kjcVar3.f47436d;
        xcc xccVar3 = kjcVar3.f47438f;
        gr7 gr7Var = kjcVar3.f47443k;
        int i7 = 100;
        zzr zzrVar2 = zzrVar;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            jbc jbcVarM15286n = kjcVar3.m15286n();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            gr7 gr7Var2 = gr7Var;
            kjc kjcVar4 = (kjc) jbcVarM15286n.f60774a;
            jbcVarM15286n.mo12359D();
            int i11 = i8;
            if (jbcVarM15286n.f45389d) {
                kjcVar = kjcVar3;
                context = context3;
                xccVar = xccVar3;
            } else {
                arrayList = new ArrayList();
                kjcVar = kjcVar3;
                if (((kjc) jbcVarM15286n.f60774a).f47433a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    xccVar = xccVar3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM14377J = jbcVarM15286n.m14377J();
                                if (sQLiteDatabaseM14377J == null) {
                                    try {
                                        try {
                                            jbcVarM15286n.f45389d = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM14377J != null) {
                                                sQLiteDatabaseM14377J.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM14377J != null) {
                                                sQLiteDatabaseM14377J.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM14377J != null) {
                                                sQLiteDatabaseM14377J.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        xcc xccVar4 = kjcVar4.f47438f;
                                        kjc.m15280l(xccVar4);
                                        xccVar4.f68080f.m17924b(e, "Error reading entries from local database");
                                        jbcVarM15286n.f45389d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.endTransaction();
                                        }
                                        xcc xccVar5 = kjcVar4.f47438f;
                                        kjc.m15280l(xccVar5);
                                        xccVar5.f68080f.m17924b(e, "Error reading entries from local database");
                                        jbcVarM15286n.f45389d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM14377J != null) {
                                            sQLiteDatabaseM14377J.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseM14377J.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM14377J.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM14377J != null) {
                                                            sQLiteDatabaseM14377J.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        xcc xccVar6 = kjcVar4.f47438f;
                                                        kjc.m15280l(xccVar6);
                                                        xccVar6.f68080f.m17924b(e, "Error reading entries from local database");
                                                        jbcVarM15286n.f45389d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM14377J != null) {
                                                            sQLiteDatabaseM14377J.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM14377J != null && sQLiteDatabaseM14377J.inTransaction()) {
                                                            sQLiteDatabaseM14377J.endTransaction();
                                                        }
                                                        xcc xccVar7 = kjcVar4.f47438f;
                                                        kjc.m15280l(xccVar7);
                                                        xccVar7.f68080f.m17924b(e, "Error reading entries from local database");
                                                        jbcVarM15286n.f45389d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM14377J != null) {
                                                            sQLiteDatabaseM14377J.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            xcc xccVar8 = kjcVar4.f47438f;
                                                            kjc.m15280l(xccVar8);
                                                            xccVar8.f68080f.m17924b(e, "Error reading entries from local database");
                                                            jbcVarM15286n.f45389d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.endTransaction();
                                                            }
                                                            xcc xccVar9 = kjcVar4.f47438f;
                                                            kjc.m15280l(xccVar9);
                                                            xccVar9.f68080f.m17924b(e, "Error reading entries from local database");
                                                            jbcVarM15286n.f45389d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                cmb cmbVar2 = kjcVar4.f47436d;
                                                t8c t8cVar2 = z8c.f71146W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (cmbVar2.m4869O(null, t8cVar2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                xcc xccVar10 = kjcVar4.f47438f;
                                                                kjc.m15280l(xccVar10);
                                                                xccVar10.f68080f.m17924b(e, "Error reading entries from local database");
                                                                jbcVarM15286n.f45389d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.endTransaction();
                                                                }
                                                                xcc xccVar11 = kjcVar4.f47438f;
                                                                kjc.m15280l(xccVar11);
                                                                xccVar11.f68080f.m17924b(e, "Error reading entries from local database");
                                                                jbcVarM15286n.f45389d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM14377J.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (kjcVar4.f47436d.m4869O(null, t8cVar2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                xcc xccVar12 = kjcVar4.f47438f;
                                                                                                kjc.m15280l(xccVar12);
                                                                                                xccVar12.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                jbcVarM15286n.f45389d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.endTransaction();
                                                                                                }
                                                                                                xcc xccVar13 = kjcVar4.f47438f;
                                                                                                kjc.m15280l(xccVar13);
                                                                                                xccVar13.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                jbcVarM15286n.f45389d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            zzbh zzbhVarCreateFromParcel = zzbh.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (zzbhVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new dbc(zzbhVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (SafeParcelReader$ParseException unused6) {
                                                                                                            xcc xccVar14 = kjcVar4.f47438f;
                                                                                                            kjc.m15280l(xccVar14);
                                                                                                            xccVar14.f68080f.m17923a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM14377J != null) {
                                                                                                        sQLiteDatabaseM14377J.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e11) {
                                                                                                e = e11;
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                xcc xccVar15 = kjcVar4.f47438f;
                                                                                                kjc.m15280l(xccVar15);
                                                                                                xccVar15.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                jbcVarM15286n.f45389d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.endTransaction();
                                                                                                }
                                                                                                xcc xccVar16 = kjcVar4.f47438f;
                                                                                                kjc.m15280l(xccVar16);
                                                                                                xccVar16.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                jbcVarM15286n.f45389d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM14377J != null) {
                                                                                                    sQLiteDatabaseM14377J.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused8) {
                                                                                                    xcc xccVar17 = kjcVar4.f47438f;
                                                                                                    kjc.m15280l(xccVar17);
                                                                                                    xccVar17.f68080f.m17923a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    zzplVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (zzplVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new dbc(zzplVarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (SafeParcelReader$ParseException unused9) {
                                                                                                            xcc xccVar18 = kjcVar4.f47438f;
                                                                                                            kjc.m15280l(xccVar18);
                                                                                                            xccVar18.f68080f.m17923a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            zzahVarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (zzahVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new dbc(zzahVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (zzbfVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new dbc(zzbfVarCreateFromParcel, string, j2));
                                                                                                                        }
                                                                                                                        i5 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                                        i3 = 5;
                                                                                                                        xcc xccVar19 = kjcVar4.f47438f;
                                                                                                                        kjc.m15280l(xccVar19);
                                                                                                                        xccVar19.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                                        jbcVarM15286n.f45389d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                                            sQLiteDatabaseM14377J.endTransaction();
                                                                                                                        }
                                                                                                                        xcc xccVar110 = kjcVar4.f47438f;
                                                                                                                        kjc.m15280l(xccVar110);
                                                                                                                        xccVar110.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                                        jbcVarM15286n.f45389d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (SafeParcelReader$ParseException unused11) {
                                                                                                                xcc xccVar20 = kjcVar4.f47438f;
                                                                                                                kjc.m15280l(xccVar20);
                                                                                                                xccVar20.f68080f.m17923a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                zzbfVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (SafeParcelReader$ParseException unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                        i3 = 5;
                                                                                                        xcc xccVar111 = kjcVar4.f47438f;
                                                                                                        kjc.m15280l(xccVar111);
                                                                                                        xccVar111.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                        jbcVarM15286n.f45389d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                            sQLiteDatabaseM14377J.endTransaction();
                                                                                                        }
                                                                                                        xcc xccVar112 = kjcVar4.f47438f;
                                                                                                        kjc.m15280l(xccVar112);
                                                                                                        xccVar112.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                                        jbcVarM15286n.f45389d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM14377J != null) {
                                                                                                            sQLiteDatabaseM14377J.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    xcc xccVar21 = kjcVar4.f47438f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        kjc.m15280l(xccVar21);
                                                                                                        xccVar21.f68076I.m17923a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        kjc.m15280l(xccVar21);
                                                                                                        xccVar21.f68080f.m17923a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                t8cVar2 = t8cVar2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        t8cVar2 = t8cVar2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM14377J != null) {
                                                                                        sQLiteDatabaseM14377J.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                    i3 = 5;
                                                                                    xcc xccVar113 = kjcVar4.f47438f;
                                                                                    kjc.m15280l(xccVar113);
                                                                                    xccVar113.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                    jbcVarM15286n.f45389d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM14377J != null) {
                                                                                        sQLiteDatabaseM14377J.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM14377J != null) {
                                                                                        sQLiteDatabaseM14377J.endTransaction();
                                                                                    }
                                                                                    xcc xccVar114 = kjcVar4.f47438f;
                                                                                    kjc.m15280l(xccVar114);
                                                                                    xccVar114.f68080f.m17924b(e, "Error reading entries from local database");
                                                                                    jbcVarM15286n.f45389d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM14377J != null) {
                                                                                        sQLiteDatabaseM14377J.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                            try {
                                                                if (sQLiteDatabaseM14377J.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    xcc xccVar22 = kjcVar4.f47438f;
                                                                    kjc.m15280l(xccVar22);
                                                                    xccVar22.f68080f.m17923a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM14377J.setTransactionSuccessful();
                                                                sQLiteDatabaseM14377J.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM14377J.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                xcc xccVar115 = kjcVar4.f47438f;
                                                                kjc.m15280l(xccVar115);
                                                                xccVar115.f68080f.m17924b(e, "Error reading entries from local database");
                                                                jbcVarM15286n.f45389d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.endTransaction();
                                                                }
                                                                xcc xccVar116 = kjcVar4.f47438f;
                                                                kjc.m15280l(xccVar116);
                                                                xccVar116.f68080f.m17924b(e, "Error reading entries from local database");
                                                                jbcVarM15286n.f45389d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM14377J != null) {
                                                                    sQLiteDatabaseM14377J.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM14377J != null) {
                                                                sQLiteDatabaseM14377J.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str3 = str3;
                                                        sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM14377J != null) {
                                                            sQLiteDatabaseM14377J.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    str3 = str3;
                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    xcc xccVar117 = kjcVar4.f47438f;
                                                    kjc.m15280l(xccVar117);
                                                    xccVar117.f68080f.m17924b(e, "Error reading entries from local database");
                                                    jbcVarM15286n.f45389d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM14377J != null) {
                                                        sQLiteDatabaseM14377J.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    str3 = str3;
                                                    sQLiteDatabaseM14377J = sQLiteDatabaseM14377J;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseM14377J != null) {
                                                        sQLiteDatabaseM14377J.endTransaction();
                                                    }
                                                    xcc xccVar118 = kjcVar4.f47438f;
                                                    kjc.m15280l(xccVar118);
                                                    xccVar118.f68080f.m17924b(e, "Error reading entries from local database");
                                                    jbcVarM15286n.f45389d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM14377J != null) {
                                                        sQLiteDatabaseM14377J.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM14377J = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM14377J = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM14377J = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseM14377J = null;
                            }
                        } else {
                            i = 0;
                            xcc xccVar23 = kjcVar4.f47438f;
                            kjc.m15280l(xccVar23);
                            xccVar23.f68083i.m17923a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    xccVar = xccVar3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractSafeParcelable != null && size < i10) {
                    arrayList2.add(new dbc(abstractSafeParcelable, zzrVar2.f12435c, zzrVar2.f12442j));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    dbcVar = (dbc) arrayList2.get(i6);
                    abstractSafeParcelable2 = dbcVar.f35366a;
                    t8cVar = z8c.f71146W0;
                    if (cmbVar.m4869O(null, t8cVar)) {
                        str2 = dbcVar.f35367b;
                        if (!TextUtils.isEmpty(str2)) {
                            zzrVar2 = new zzr(zzrVar2.f12432a, zzrVar2.f12434b, str2, dbcVar.f35368c, zzrVar2.f12436d, zzrVar2.f12437e, zzrVar2.f12438f, zzrVar2.f12439g, zzrVar2.f12440h, zzrVar2.f12441i, zzrVar2.f12443k, zzrVar2.f12444l, zzrVar2.f12413H, zzrVar2.f12414I, zzrVar2.f12415J, zzrVar2.f12416K, zzrVar2.f12417L, zzrVar2.f12418M, zzrVar2.f12419N, zzrVar2.f12420O, zzrVar2.f12421P, zzrVar2.f12422Q, zzrVar2.f12423R, zzrVar2.f12424S, zzrVar2.f12425T, zzrVar2.f12426U, zzrVar2.f12427V, zzrVar2.f12428W, zzrVar2.f12429X, zzrVar2.f12430Y, zzrVar2.f12431Z, zzrVar2.f12433a0);
                        }
                    }
                    if (abstractSafeParcelable2 instanceof zzbh) {
                        try {
                            gr7Var2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                gr7Var2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        q9cVar.mo11283A((zzbh) abstractSafeParcelable2, zzrVar2);
                                        kjc.m15280l(xccVar);
                                        xccVar2 = xccVar;
                                        try {
                                            xccVar2.f68076I.m17923a("Logging telemetry for logEvent from database");
                                            if (sq5.f61245e == null) {
                                                kjcVar2 = kjcVar;
                                                context2 = context;
                                                try {
                                                    sq5.f61245e = new sq5(context2, kjcVar2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    kjc.m15280l(xccVar2);
                                                    xccVar2.f68080f.m17924b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (sq5.f61245e == null) {
                                                            sq5.f61245e = new sq5(context2, kjcVar2);
                                                        }
                                                        sq5 sq5Var = sq5.f61245e;
                                                        gr7Var2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        gr7Var2.getClass();
                                                        sq5Var.m21560I(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                kjcVar2 = kjcVar;
                                                context2 = context;
                                            }
                                            sq5 sq5Var2 = sq5.f61245e;
                                            gr7Var2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            gr7Var2.getClass();
                                            sq5Var2.m21560I(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            kjcVar2 = kjcVar;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        kjcVar2 = kjcVar;
                                        context2 = context;
                                        xccVar2 = xccVar;
                                        j3 = jCurrentTimeMillis;
                                        kjc.m15280l(xccVar2);
                                        xccVar2.f68080f.m17924b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (sq5.f61245e == null) {
                                                sq5.f61245e = new sq5(context2, kjcVar2);
                                            }
                                            sq5 sq5Var3 = sq5.f61245e;
                                            gr7Var2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            gr7Var2.getClass();
                                            sq5Var3.m21560I(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        xccVar = xccVar2;
                                        kjcVar = kjcVar2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                kjcVar2 = kjcVar;
                                context2 = context;
                                xccVar2 = xccVar;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            kjcVar2 = kjcVar;
                            context2 = context;
                            xccVar2 = xccVar;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        kjcVar2 = kjcVar;
                        context2 = context;
                        xccVar2 = xccVar;
                        if (abstractSafeParcelable2 instanceof zzpl) {
                            try {
                                q9cVar.mo11303r((zzpl) abstractSafeParcelable2, zzrVar2);
                            } catch (RemoteException e41) {
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17924b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractSafeParcelable2 instanceof zzah) {
                                try {
                                    q9cVar.mo11292c((zzah) abstractSafeParcelable2, zzrVar2);
                                } catch (RemoteException e42) {
                                    kjc.m15280l(xccVar2);
                                    xccVar2.f68080f.m17924b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (cmbVar.m4869O(null, t8cVar) || !(abstractSafeParcelable2 instanceof zzbf)) {
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17923a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    q9cVar.mo11305t(((zzbf) abstractSafeParcelable2).m5952g0(), zzrVar2);
                                } catch (RemoteException e43) {
                                    kjc.m15280l(xccVar2);
                                    xccVar2.f68080f.m17924b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            xccVar = xccVar2;
                            kjcVar = kjcVar2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    xccVar = xccVar2;
                    kjcVar = kjcVar2;
                    context = context2;
                    size = size;
                }
                xccVar3 = xccVar;
                kjcVar3 = kjcVar;
                context3 = context;
                gr7Var = gr7Var2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractSafeParcelable != null) {
                arrayList2.add(new dbc(abstractSafeParcelable, zzrVar2.f12435c, zzrVar2.f12442j));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                dbcVar = (dbc) arrayList2.get(i6);
                abstractSafeParcelable2 = dbcVar.f35366a;
                t8cVar = z8c.f71146W0;
                if (cmbVar.m4869O(null, t8cVar)) {
                    str2 = dbcVar.f35367b;
                    if (!TextUtils.isEmpty(str2)) {
                        zzrVar2 = new zzr(zzrVar2.f12432a, zzrVar2.f12434b, str2, dbcVar.f35368c, zzrVar2.f12436d, zzrVar2.f12437e, zzrVar2.f12438f, zzrVar2.f12439g, zzrVar2.f12440h, zzrVar2.f12441i, zzrVar2.f12443k, zzrVar2.f12444l, zzrVar2.f12413H, zzrVar2.f12414I, zzrVar2.f12415J, zzrVar2.f12416K, zzrVar2.f12417L, zzrVar2.f12418M, zzrVar2.f12419N, zzrVar2.f12420O, zzrVar2.f12421P, zzrVar2.f12422Q, zzrVar2.f12423R, zzrVar2.f12424S, zzrVar2.f12425T, zzrVar2.f12426U, zzrVar2.f12427V, zzrVar2.f12428W, zzrVar2.f12429X, zzrVar2.f12430Y, zzrVar2.f12431Z, zzrVar2.f12433a0);
                    }
                }
                if (abstractSafeParcelable2 instanceof zzbh) {
                    gr7Var2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    gr7Var2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    q9cVar.mo11283A((zzbh) abstractSafeParcelable2, zzrVar2);
                    kjc.m15280l(xccVar);
                    xccVar2 = xccVar;
                    xccVar2.f68076I.m17923a("Logging telemetry for logEvent from database");
                    if (sq5.f61245e == null) {
                        kjcVar2 = kjcVar;
                        context2 = context;
                        sq5.f61245e = new sq5(context2, kjcVar2);
                    } else {
                        kjcVar2 = kjcVar;
                        context2 = context;
                    }
                    sq5 sq5Var4 = sq5.f61245e;
                    gr7Var2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    gr7Var2.getClass();
                    sq5Var4.m21560I(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    kjcVar2 = kjcVar;
                    context2 = context;
                    xccVar2 = xccVar;
                    if (abstractSafeParcelable2 instanceof zzpl) {
                        q9cVar.mo11303r((zzpl) abstractSafeParcelable2, zzrVar2);
                    } else {
                        if (abstractSafeParcelable2 instanceof zzah) {
                            q9cVar.mo11292c((zzah) abstractSafeParcelable2, zzrVar2);
                        } else if (cmbVar.m4869O(null, t8cVar)) {
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17923a("Discarding data. Unrecognized parcel type.");
                        } else {
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17923a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        xccVar = xccVar2;
                        kjcVar = kjcVar2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                xccVar = xccVar2;
                kjcVar = kjcVar2;
                context = context2;
                size = size;
            }
            xccVar3 = xccVar;
            kjcVar3 = kjcVar;
            context3 = context;
            gr7Var = gr7Var2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m23122W(zzah zzahVar) {
        boolean zM14378K;
        mo12359D();
        m13744E();
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.getClass();
        jbc jbcVarM15286n = kjcVar.m15286n();
        kjc kjcVar2 = (kjc) jbcVarM15286n.f60774a;
        kjc.m15278j(kjcVar2.f47441i);
        byte[] bArrM20511l0 = rad.m20511l0(zzahVar);
        if (bArrM20511l0.length > 131072) {
            xcc xccVar = kjcVar2.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68081g.m17923a("Conditional user property too long for local database. Sending directly to service");
            zM14378K = false;
        } else {
            zM14378K = jbcVarM15286n.m14378K(2, bArrM20511l0);
        }
        m23117R(new hec(this, m23119T(true), zM14378K, new zzah(zzahVar)));
    }
}
