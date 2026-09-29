package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.util.concurrent.AbstractC1118h;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class kr3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48359a;

    /* JADX INFO: renamed from: b */
    public Object f48360b;

    /* JADX INFO: renamed from: c */
    public Object f48361c;

    /* JADX INFO: renamed from: d */
    public Object f48362d;

    public /* synthetic */ kr3(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f48359a = i;
        this.f48360b = obj;
        this.f48361c = obj2;
        this.f48362d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:112:0x0344  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x020c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:0x0224  */
    /* JADX WARN: Code duplicated, block: B:87:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0234  */
    /* JADX WARN: Code duplicated, block: B:92:0x0254  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b4 A[Catch: SQLiteException -> 0x02bf, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x02bf, blocks: (B:93:0x028f, B:95:0x02b4), top: B:163:0x028f }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OverScroller overScroller;
        Object objCall;
        tld tldVarM12744i;
        Cursor cursor;
        Cursor cursorQuery;
        int i;
        long j;
        aad aadVar;
        String str;
        o9d o9dVar;
        nnb nnbVar;
        Long lValueOf;
        ContentValues contentValues;
        xcc xccVar;
        rad radVar;
        int i2 = 8;
        int i3 = 3;
        String strMo11284B = null;
        switch (this.f48359a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f48360b;
                lr3 lr3Var = (lr3) this.f48362d;
                View view = (View) this.f48361c;
                if (view == null || (overScroller = lr3Var.f50035d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    lr3Var.m16469A(coordinatorLayout, view, lr3Var.f50035d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) lr3Var).m5993G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f12589l) {
                    appBarLayout.m5984f(appBarLayout.m5985g(AppBarLayout.BaseBehavior.m5988D(coordinatorLayout)));
                    return;
                }
                return;
            case 1:
                v68 v68Var = (v68) this.f48362d;
                y20 y20Var = (y20) this.f48360b;
                v68Var.m23153b(y20Var, (wr9) this.f48361c);
                ((AtomicInteger) v68Var.f64947i.f8656b).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(v68Var.f64940b, v68Var.m23152a()) * (60000.0d / v68Var.f64939a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + y20Var.f69116b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 2:
                try {
                    objCall = ((kb3) this.f48360b).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.f48362d).post(new gvb(i2, (lb3) this.f48361c, objCall));
                return;
            case 3:
                super/*kc0*/.mo13516d((cc4) this.f48361c, (C3440oy) this.f48362d);
                return;
            case 4:
                super/*kc0*/.mo13513a((gp0) this.f48361c, (C3440oy) this.f48362d);
                return;
            case 5:
                CloudMessage cloudMessage = (CloudMessage) this.f48361c;
                if (TextUtils.isEmpty(cloudMessage.m5276r())) {
                    tldVarM12744i = Tasks.m5975c(null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", cloudMessage.m5276r());
                    Integer numM5275J = cloudMessage.m5275J();
                    if (numM5275J != null) {
                        bundle.putInt("google.product_id", numM5275J.intValue());
                    }
                    Context context = (Context) this.f48360b;
                    bundle.putBoolean("supports_message_handled", true);
                    tldVarM12744i = gld.m12739h(context).m12744i(2, bundle);
                }
                tldVarM12744i.mo5960b(n0c.f52150a, new sua((CountDownLatch) this.f48362d, i3));
                return;
            case 6:
                C1045d c1045d = ((eoc) this.f48362d).f37647f;
                c1045d.m5902V();
                zzah zzahVar = (zzah) this.f48360b;
                Object objZza = zzahVar.f12378c.zza();
                zzr zzrVar = (zzr) this.f48361c;
                if (objZza == null) {
                    c1045d.m5908a0(zzahVar, zzrVar);
                    return;
                } else {
                    c1045d.m5906Z(zzahVar, zzrVar);
                    return;
                }
            case 7:
                eoc eocVar = (eoc) this.f48362d;
                eocVar.f37647f.m5902V();
                eocVar.f37647f.m5921h((zzbh) this.f48360b, (String) this.f48361c);
                return;
            case 8:
                eoc eocVar2 = (eoc) this.f48360b;
                zzr zzrVar2 = (zzr) this.f48361c;
                zzaf zzafVar = (zzaf) this.f48362d;
                C1045d c1045d2 = eocVar2.f37647f;
                c1045d2.m5902V();
                String str3 = zzrVar2.f12432a;
                lda.m16130p(str3);
                HashMap map = c1045d2.f12355Z;
                c1045d2.mo5913d().mo12359D();
                c1045d2.m5930l0();
                nnb nnbVar2 = c1045d2.f12360c;
                C1045d.m5885T(nnbVar2);
                long j2 = zzafVar.f12373a;
                long j3 = zzafVar.f12375c;
                int i4 = zzafVar.f12374b;
                nnbVar2.mo12359D();
                nnbVar2.m13144E();
                try {
                    cursor = null;
                    try {
                        cursorQuery = nnbVar2.m17559u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    try {
                                        String string = cursorQuery.getString(1);
                                        lda.m16130p(string);
                                        try {
                                            try {
                                                j = j3;
                                                i = i4;
                                                try {
                                                    aad aadVarM17547g0 = nnbVar2.m17547g0(string, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                    cursorQuery.close();
                                                    aadVar = aadVarM17547g0;
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    xcc xccVar2 = ((kjc) nnbVar2.f60774a).f47438f;
                                                    kjc.m15280l(xccVar2);
                                                    xccVar2.f68080f.m17925c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    aadVar = cursor;
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                i = i4;
                                                j = j3;
                                                xcc xccVar3 = ((kjc) nnbVar2.f60774a).f47438f;
                                                kjc.m15280l(xccVar3);
                                                xccVar3.f68080f.m17925c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                aadVar = cursor;
                                                if (aadVar == null) {
                                                    c1045d2.mo5909b().f68083i.m17925c("[sgtm] Queued batch doesn't exist. appId, rowId", str3, Long.valueOf(j2));
                                                    return;
                                                }
                                                str = aadVar.f433c;
                                                if (i != zzlr.SUCCESS.zza()) {
                                                    if (i == zzlr.BACKOFF.zza()) {
                                                        o9dVar = (o9d) map.get(str);
                                                        if (o9dVar == null) {
                                                            o9dVar = new o9d(c1045d2);
                                                            map.put(str, o9dVar);
                                                        } else {
                                                            o9dVar.f54094b++;
                                                            o9dVar.f54095c = o9dVar.m17882b();
                                                        }
                                                        c1045d2.mo5911c().getClass();
                                                        c1045d2.mo5909b().f68076I.m17926d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str, Long.valueOf((o9dVar.f54095c - System.currentTimeMillis()) / 1000));
                                                    }
                                                    nnb nnbVar3 = c1045d2.f12360c;
                                                    C1045d.m5885T(nnbVar3);
                                                    Long lValueOf2 = Long.valueOf(zzafVar.f12373a);
                                                    nnbVar3.m17530P(lValueOf2);
                                                    c1045d2.mo5909b().f68076I.m17925c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str3, lValueOf2);
                                                    return;
                                                }
                                                if (map.containsKey(str)) {
                                                    map.remove(str);
                                                }
                                                nnb nnbVar4 = c1045d2.f12360c;
                                                C1045d.m5885T(nnbVar4);
                                                Long lValueOf3 = Long.valueOf(j2);
                                                nnbVar4.m17522K(lValueOf3);
                                                c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str3, lValueOf3);
                                                if (j > 0) {
                                                    nnbVar = c1045d2.f12360c;
                                                    C1045d.m5885T(nnbVar);
                                                    kjc kjcVar = (kjc) nnbVar.f60774a;
                                                    nnbVar.mo12359D();
                                                    nnbVar.m13144E();
                                                    lValueOf = Long.valueOf(j);
                                                    contentValues = new ContentValues();
                                                    contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
                                                    gr7 gr7Var = kjcVar.f47443k;
                                                    xccVar = kjcVar.f47438f;
                                                    gr7Var.getClass();
                                                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                    try {
                                                        if (nnbVar.m17559u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str3, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                                                            kjc.m15280l(xccVar);
                                                            xccVar.f68083i.m17925c("Google Signal pending batch not updated. appId, rowId", str3, lValueOf);
                                                            break;
                                                        }
                                                        c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str3, Long.valueOf(j));
                                                        c1045d2.m5943t(str3);
                                                        return;
                                                    } catch (SQLiteException e3) {
                                                        kjc.m15280l(xccVar);
                                                        xccVar.f68080f.m17926d("Failed to update google Signal pending batch. appid, rowId", str3, Long.valueOf(j), e3);
                                                        throw e3;
                                                    }
                                                }
                                                return;
                                            }
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        j = j3;
                                        i = i4;
                                    }
                                } else {
                                    i = i4;
                                    j = j3;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    aadVar = cursor;
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                i = i4;
                                j = j3;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        i = i4;
                        j = j3;
                        cursorQuery = cursor;
                        xcc xccVar4 = ((kjc) nnbVar2.f60774a).f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68080f.m17925c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        aadVar = cursor;
                        if (aadVar == null) {
                            c1045d2.mo5909b().f68083i.m17925c("[sgtm] Queued batch doesn't exist. appId, rowId", str3, Long.valueOf(j2));
                            return;
                        }
                        str = aadVar.f433c;
                        if (i != zzlr.SUCCESS.zza()) {
                            if (i == zzlr.BACKOFF.zza()) {
                                o9dVar = (o9d) map.get(str);
                                if (o9dVar == null) {
                                    o9dVar = new o9d(c1045d2);
                                    map.put(str, o9dVar);
                                } else {
                                    o9dVar.f54094b++;
                                    o9dVar.f54095c = o9dVar.m17882b();
                                }
                                c1045d2.mo5911c().getClass();
                                c1045d2.mo5909b().f68076I.m17926d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str, Long.valueOf((o9dVar.f54095c - System.currentTimeMillis()) / 1000));
                            }
                            nnb nnbVar5 = c1045d2.f12360c;
                            C1045d.m5885T(nnbVar5);
                            Long lValueOf4 = Long.valueOf(zzafVar.f12373a);
                            nnbVar5.m17530P(lValueOf4);
                            c1045d2.mo5909b().f68076I.m17925c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str3, lValueOf4);
                            return;
                        }
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                        nnb nnbVar6 = c1045d2.f12360c;
                        C1045d.m5885T(nnbVar6);
                        Long lValueOf5 = Long.valueOf(j2);
                        nnbVar6.m17522K(lValueOf5);
                        c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str3, lValueOf5);
                        if (j > 0) {
                            nnbVar = c1045d2.f12360c;
                            C1045d.m5885T(nnbVar);
                            kjc kjcVar2 = (kjc) nnbVar.f60774a;
                            nnbVar.mo12359D();
                            nnbVar.m13144E();
                            lValueOf = Long.valueOf(j);
                            contentValues = new ContentValues();
                            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
                            gr7 gr7Var2 = kjcVar2.f47443k;
                            xccVar = kjcVar2.f47438f;
                            gr7Var2.getClass();
                            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                            if (nnbVar.m17559u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str3, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                                kjc.m15280l(xccVar);
                                xccVar.f68083i.m17925c("Google Signal pending batch not updated. appId, rowId", str3, lValueOf);
                                break;
                            }
                            c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str3, Long.valueOf(j));
                            c1045d2.m5943t(str3);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorQuery = cursor;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
                if (aadVar == null) {
                    c1045d2.mo5909b().f68083i.m17925c("[sgtm] Queued batch doesn't exist. appId, rowId", str3, Long.valueOf(j2));
                    return;
                }
                str = aadVar.f433c;
                if (i != zzlr.SUCCESS.zza()) {
                    if (i == zzlr.BACKOFF.zza()) {
                        o9dVar = (o9d) map.get(str);
                        if (o9dVar == null) {
                            o9dVar = new o9d(c1045d2);
                            map.put(str, o9dVar);
                        } else {
                            o9dVar.f54094b++;
                            o9dVar.f54095c = o9dVar.m17882b();
                        }
                        c1045d2.mo5911c().getClass();
                        c1045d2.mo5909b().f68076I.m17926d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str3, str, Long.valueOf((o9dVar.f54095c - System.currentTimeMillis()) / 1000));
                    }
                    nnb nnbVar7 = c1045d2.f12360c;
                    C1045d.m5885T(nnbVar7);
                    Long lValueOf6 = Long.valueOf(zzafVar.f12373a);
                    nnbVar7.m17530P(lValueOf6);
                    c1045d2.mo5909b().f68076I.m17925c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str3, lValueOf6);
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                nnb nnbVar8 = c1045d2.f12360c;
                C1045d.m5885T(nnbVar8);
                Long lValueOf7 = Long.valueOf(j2);
                nnbVar8.m17522K(lValueOf7);
                c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str3, lValueOf7);
                if (j > 0) {
                    nnbVar = c1045d2.f12360c;
                    C1045d.m5885T(nnbVar);
                    kjc kjcVar3 = (kjc) nnbVar.f60774a;
                    nnbVar.mo12359D();
                    nnbVar.m13144E();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
                    gr7 gr7Var3 = kjcVar3.f47443k;
                    xccVar = kjcVar3.f47438f;
                    gr7Var3.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (nnbVar.m17559u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str3, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                        kjc.m15280l(xccVar);
                        xccVar.f68083i.m17925c("Google Signal pending batch not updated. appId, rowId", str3, lValueOf);
                        break;
                    }
                    c1045d2.mo5909b().f68076I.m17925c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str3, Long.valueOf(j));
                    c1045d2.m5943t(str3);
                    return;
                }
                return;
            case 9:
                oub oubVar = (oub) this.f48361c;
                v4d v4dVar = (v4d) this.f48362d;
                try {
                    try {
                        kjc kjcVar4 = (kjc) v4dVar.f60774a;
                        qfc qfcVar = kjcVar4.f47437e;
                        xcc xccVar5 = kjcVar4.f47438f;
                        kjc.m15278j(qfcVar);
                        if (qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                            q9c q9cVar = v4dVar.f64866d;
                            if (q9cVar != null) {
                                strMo11284B = q9cVar.mo11284B((zzr) this.f48360b);
                                if (strMo11284B != null) {
                                    C1043b c1043b = kjcVar4.f47414H;
                                    kjc.m15279k(c1043b);
                                    c1043b.f12329g.set(strMo11284B);
                                    kjc.m15278j(qfcVar);
                                    qfcVar.f57729g.m20981p(strMo11284B);
                                }
                                v4dVar.m23116Q();
                                radVar = ((kjc) v4dVar.f60774a).f47441i;
                                kjc.m15278j(radVar);
                                radVar.m20551p0(strMo11284B, oubVar);
                                return;
                            }
                            kjc.m15280l(xccVar5);
                            xccVar5.f68080f.m17923a("Failed to get app instance id");
                        } else {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68085k.m17923a("Analytics storage consent denied; will not get app instance id");
                            C1043b c1043b2 = kjcVar4.f47414H;
                            kjc.m15279k(c1043b2);
                            c1043b2.f12329g.set(null);
                            kjc.m15278j(qfcVar);
                            qfcVar.f57729g.m20981p(null);
                        }
                        radVar = kjcVar4.f47441i;
                    } catch (Throwable th4) {
                        rad radVar2 = ((kjc) v4dVar.f60774a).f47441i;
                        kjc.m15278j(radVar2);
                        radVar2.m20551p0(null, oubVar);
                        throw th4;
                    }
                } catch (RemoteException e9) {
                    xcc xccVar6 = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar6);
                    xccVar6.f68080f.m17924b(e9, "Failed to get app instance id");
                }
                kjc.m15278j(radVar);
                radVar.m20551p0(strMo11284B, oubVar);
                return;
            case 10:
                v4d v4dVar2 = (v4d) this.f48360b;
                zzr zzrVar3 = (zzr) this.f48361c;
                zzaf zzafVar2 = (zzaf) this.f48362d;
                kjc kjcVar5 = (kjc) v4dVar2.f60774a;
                q9c q9cVar2 = v4dVar2.f64866d;
                if (q9cVar2 == null) {
                    xcc xccVar7 = kjcVar5.f47438f;
                    kjc.m15280l(xccVar7);
                    xccVar7.f68080f.m17923a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    q9cVar2.mo11302q(zzrVar3, zzafVar2);
                    v4dVar2.m23116Q();
                    return;
                } catch (RemoteException e10) {
                    xcc xccVar8 = kjcVar5.f47438f;
                    kjc.m15280l(xccVar8);
                    xccVar8.f68080f.m17925c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar2.f12373a), e10);
                    return;
                }
            default:
                a34 a34Var = (a34) this.f48360b;
                f09 f09Var = (f09) this.f48361c;
                kld kldVar = (kld) this.f48362d;
                try {
                    Object objM6398b = AbstractC1118h.m6398b(f09Var);
                    f09 f09Var2 = (f09) a34Var.f178f;
                    f09Var2.m6385m(objM6398b);
                    kldVar.m6387o(f09Var2);
                    return;
                } catch (Throwable unused3) {
                    kldVar.m6387o(f09Var);
                    return;
                }
        }
    }

    public /* synthetic */ kr3() {
        this.f48359a = 2;
    }

    public /* synthetic */ kr3(Object obj, Object obj2, Object obj3, int i) {
        this.f48359a = i;
        this.f48362d = obj;
        this.f48360b = obj2;
        this.f48361c = obj3;
    }
}
