package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.mlkit_vision_common.C0968a;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45899c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f45900d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f45901e;

    public jo0(C1043b c1043b, AtomicReference atomicReference, String str, String str2) {
        this.f45897a = 4;
        this.f45898b = atomicReference;
        this.f45899c = str;
        this.f45900d = str2;
        Objects.requireNonNull(c1043b);
        this.f45901e = c1043b;
    }

    /* JADX INFO: renamed from: a */
    private final void m14566a() {
        String str;
        zzx zzxVarM5469j;
        int i;
        C0969a c0969a = (C0969a) this.f45898b;
        cdb cdbVar = (cdb) this.f45899c;
        zznu zznuVar = (zznu) this.f45900d;
        String str2 = (String) this.f45901e;
        ca1 ca1Var = (ca1) cdbVar.f9945b;
        ca1Var.f9782b = zznuVar;
        lhd lhdVar = (lhd) ca1Var.f9781a;
        if (lhdVar == null || (str = lhdVar.f49682d) == null || str.isEmpty()) {
            str = "NA";
        }
        p29 p29Var = new p29();
        p29Var.f55489a = c0969a.f11986a;
        p29Var.f55490b = c0969a.f11987b;
        synchronized (C0969a.class) {
            try {
                zzxVarM5469j = C0969a.f11984i;
                if (zzxVarM5469j == null) {
                    yi5 yi5Var = new yi5(new zi5(Resources.getSystem().getConfiguration().getLocales()));
                    Object[] objArrCopyOf = new Object[4];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < yi5Var.m25156c()) {
                        Locale localeM25155b = yi5Var.m25155b(i2);
                        mp2 mp2Var = nb1.f52560a;
                        String languageTag = localeM25155b.toLanguageTag();
                        languageTag.getClass();
                        int length = objArrCopyOf.length;
                        int i4 = i3 + 1;
                        if (i4 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i4 <= length) {
                            i = length;
                        } else {
                            i = (length >> 1) + length + 1;
                            if (i < i4) {
                                int iHighestOneBit = Integer.highestOneBit(i3);
                                i = iHighestOneBit + iHighestOneBit;
                            }
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                        if (i > length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                        }
                        objArrCopyOf[i3] = languageTag;
                        i2++;
                        i3 = i4;
                    }
                    zzxVarM5469j = zzx.m5469j(objArrCopyOf, i3);
                    C0969a.f11984i = zzxVarM5469j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p29Var.f55493e = zzxVarM5469j;
        p29Var.f55496h = Boolean.TRUE;
        p29Var.f55492d = str;
        p29Var.f55491c = str2;
        tld tldVar = c0969a.f11991f;
        p29Var.f55494f = tldVar.mo5971m() ? (String) tldVar.mo5967i() : c0969a.f11989d.m10856a();
        p29Var.f55498j = 10;
        p29Var.f55499k = Integer.valueOf(c0969a.f11993h);
        cdbVar.f9946c = p29Var;
        c0969a.f11988c.mo13321a(cdbVar);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0255  */
    /* JADX WARN: Code duplicated, block: B:169:0x0487  */
    /* JADX WARN: Code duplicated, block: B:172:0x049c A[LOOP:3: B:170:0x0496->B:172:0x049c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x04ec A[Catch: zzaeh -> 0x0554, LOOP:4: B:175:0x04e2->B:177:0x04ec, LOOP_END, TryCatch #6 {zzaeh -> 0x0554, blocks: (B:174:0x04d5, B:175:0x04e2, B:177:0x04ec, B:178:0x0522, B:180:0x053d), top: B:209:0x04d5 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x053d A[Catch: zzaeh -> 0x0554, TRY_LEAVE, TryCatch #6 {zzaeh -> 0x0554, blocks: (B:174:0x04d5, B:175:0x04e2, B:177:0x04ec, B:178:0x0522, B:180:0x053d), top: B:209:0x04d5 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzom zzomVar;
        uic uicVar;
        int i;
        String str;
        zzp zzpVarM5461j;
        long jElapsedRealtime;
        String str2;
        zzbk zzbkVarM5497j;
        byte[] bArrMo11298m = null;
        int i2 = 0;
        switch (this.f45897a) {
            case 0:
                lo0 lo0Var = (lo0) ((hi8) this.f45901e).f42410b;
                mw5 mw5Var = (mw5) this.f45899c;
                ko0 ko0Var = (ko0) this.f45898b;
                if (ko0Var != null) {
                    lo0Var.f49895V = true;
                    ko0Var.f47594b.m13520c(false);
                    lo0Var.f49895V = false;
                }
                if (mw5Var.isEnabled() && mw5Var.hasSubMenu()) {
                    ((hw5) this.f45900d).m13534q(mw5Var, null, 4);
                    return;
                }
                return;
            case 1:
                h5b.m13064i((View) this.f45898b, (m5b) this.f45899c, (p33) this.f45900d);
                ((ValueAnimator) this.f45901e).start();
                return;
            case 2:
                eoc eocVar = (eoc) this.f45898b;
                String str3 = (String) this.f45899c;
                zzoo zzooVar = (zzoo) this.f45900d;
                oac oacVar = (oac) this.f45901e;
                C1045d c1045d = eocVar.f37647f;
                c1045d.m5902V();
                c1045d.mo5913d().mo12359D();
                c1045d.m5930l0();
                nnb nnbVar = c1045d.f12360c;
                C1045d.m5885T(nnbVar);
                List<aad> listM17518I = nnbVar.m17518I(str3, zzooVar, ((Integer) z8c.f71103B.m21901a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (aad aadVar : listM17518I) {
                    String str4 = aadVar.f433c;
                    long j = aadVar.f438h;
                    long j2 = aadVar.f431a;
                    if (c1045d.m5942s(str3, str4)) {
                        int i3 = aadVar.f439i;
                        if (i3 > 0) {
                            if (i3 <= ((Integer) z8c.f71213z.m21901a(null)).intValue()) {
                                long jMin = Math.min(((Long) z8c.f71209x.m21901a(null)).longValue() * (1 << (i3 - 1)), ((Long) z8c.f71211y.m21901a(null)).longValue());
                                c1045d.mo5911c().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : aadVar.f434d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    zzomVar = new zzom(aadVar.f431a, aadVar.f432b.m3725a(), aadVar.f433c, bundle, aadVar.f435e.zza(), aadVar.f437g, "");
                                    try {
                                        uicVar = (uic) dad.m10238o0(fjc.m11902z(), zzomVar.f12398b);
                                        for (i = 0; i < ((fjc) uicVar.f63950b).m11911t(); i++) {
                                            ljc ljcVar = (ljc) ((fjc) uicVar.f63950b).m11912u(i).m23966j();
                                            c1045d.mo5911c().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            ljcVar.m22739b();
                                            ((pjc) ljcVar.f63950b).m19304i0(jCurrentTimeMillis);
                                            uicVar.m22739b();
                                            ((fjc) uicVar.f63950b).m11903B(i, (pjc) ljcVar.m22741d());
                                        }
                                        zzomVar.f12398b = ((fjc) uicVar.m22741d()).m3725a();
                                        if (Log.isLoggable(c1045d.mo5909b().m24457N(), 2)) {
                                            dad dadVar = c1045d.f12367g;
                                            C1045d.m5885T(dadVar);
                                            zzomVar.f12403g = dadVar.m10250e0((fjc) uicVar.m22741d());
                                        }
                                        arrayList.add(zzomVar);
                                    } catch (zzaeh unused) {
                                        c1045d.mo5909b().f68083i.m17924b(str3, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            c1045d.mo5909b().f68076I.m17926d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str3, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            zzomVar = new zzom(aadVar.f431a, aadVar.f432b.m3725a(), aadVar.f433c, bundle, aadVar.f435e.zza(), aadVar.f437g, "");
                            uicVar = (uic) dad.m10238o0(fjc.m11902z(), zzomVar.f12398b);
                            while (i < ((fjc) uicVar.f63950b).m11911t()) {
                                ljc ljcVar2 = (ljc) ((fjc) uicVar.f63950b).m11912u(i).m23966j();
                                c1045d.mo5911c().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                ljcVar2.m22739b();
                                ((pjc) ljcVar2.f63950b).m19304i0(jCurrentTimeMillis2);
                                uicVar.m22739b();
                                ((fjc) uicVar.f63950b).m11903B(i, (pjc) ljcVar2.m22741d());
                            }
                            zzomVar.f12398b = ((fjc) uicVar.m22741d()).m3725a();
                            if (Log.isLoggable(c1045d.mo5909b().m24457N(), 2)) {
                                dad dadVar2 = c1045d.f12367g;
                                C1045d.m5885T(dadVar2);
                                zzomVar.f12403g = dadVar2.m10250e0((fjc) uicVar.m22741d());
                            }
                            arrayList.add(zzomVar);
                        }
                    } else {
                        c1045d.mo5909b().f68076I.m17926d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str3, Long.valueOf(j2), aadVar.f433c);
                    }
                }
                try {
                    oacVar.mo3174w(new zzoq(arrayList));
                    c1045d.mo5909b().f68076I.m17925c("[sgtm] Sending queued upload batches to client. appId, count", str3, Integer.valueOf(arrayList.size()));
                    return;
                } catch (RemoteException e) {
                    c1045d.mo5909b().f68080f.m17925c("[sgtm] Failed to return upload batches for app", str3, e);
                    return;
                }
            case 3:
                v4d v4dVarM15287o = ((AppMeasurementDynamiteService) this.f45901e).f12312f.m15287o();
                oub oubVar = (oub) this.f45898b;
                zzbh zzbhVar = (zzbh) this.f45899c;
                String str5 = (String) this.f45900d;
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                kjc kjcVar = (kjc) v4dVarM15287o.f60774a;
                rad radVar = kjcVar.f47441i;
                kjc.m15278j(radVar);
                if (po3.f56584b.m19432c(((kjc) radVar.f60774a).f47433a, 12451000) == 0) {
                    v4dVarM15287o.m23117R(new jo0(v4dVarM15287o, zzbhVar, str5, oubVar, 8));
                    return;
                }
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17923a("Not bundling data. Service unavailable or out of date");
                rad radVar2 = kjcVar.f47441i;
                kjc.m15278j(radVar2);
                radVar2.m20554s0(oubVar, new byte[0]);
                return;
            case 4:
                String str6 = (String) this.f45899c;
                String str7 = (String) this.f45900d;
                v4d v4dVarM15287o2 = ((kjc) ((C1043b) this.f45901e).f60774a).m15287o();
                AtomicReference atomicReference = (AtomicReference) this.f45898b;
                v4dVarM15287o2.mo12359D();
                v4dVarM15287o2.m13744E();
                v4dVarM15287o2.m23117R(new xmc(v4dVarM15287o2, atomicReference, str6, str7, v4dVarM15287o2.m23119T(false)));
                return;
            case 5:
                f09 f09Var = (f09) this.f45898b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f45899c;
                Context context = (Context) this.f45900d;
                dvc dvcVar = (dvc) this.f45901e;
                if ((f09Var.f13524a instanceof C3058h0) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(dvcVar);
                        return;
                    } catch (IllegalArgumentException e2) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
                        return;
                    }
                }
                return;
            case 6:
                v4d v4dVarM15287o3 = ((AppMeasurementDynamiteService) this.f45901e).f12312f.m15287o();
                oub oubVar2 = (oub) this.f45898b;
                String str8 = (String) this.f45899c;
                String str9 = (String) this.f45900d;
                v4dVarM15287o3.mo12359D();
                v4dVarM15287o3.m13744E();
                v4dVarM15287o3.m23117R(new xmc(v4dVarM15287o3, str8, str9, v4dVarM15287o3.m23119T(false), oubVar2));
                return;
            case 7:
                C0968a c0968a = (C0968a) this.f45898b;
                cdb cdbVar = (cdb) this.f45899c;
                zziv zzivVar = (zziv) this.f45900d;
                String str10 = (String) this.f45901e;
                mq7 mq7Var = (mq7) cdbVar.f9945b;
                mq7Var.f51734c = zzivVar;
                xvc xvcVar = (xvc) mq7Var.f51733b;
                if (xvcVar != null) {
                    str = xvcVar.f68863d;
                    int i4 = h0c.f41646a;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                p29 p29Var = new p29();
                p29Var.f55489a = c0968a.f11953a;
                p29Var.f55490b = c0968a.f11954b;
                synchronized (C0968a.class) {
                    try {
                        zzpVarM5461j = C0968a.f11951j;
                        if (zzpVarM5461j == null) {
                            yi5 yi5Var = new yi5(new zi5(Resources.getSystem().getConfiguration().getLocales()));
                            Object[] objArrCopyOf = new Object[4];
                            int i5 = 0;
                            while (i2 < yi5Var.m25156c()) {
                                Locale localeM25155b = yi5Var.m25155b(i2);
                                mp2 mp2Var = nb1.f52560a;
                                String languageTag = localeM25155b.toLanguageTag();
                                languageTag.getClass();
                                int i6 = i5 + 1;
                                int length = objArrCopyOf.length;
                                if (length < i6) {
                                    int i7 = length + (length >> 1) + 1;
                                    if (i7 < i6) {
                                        int iHighestOneBit = Integer.highestOneBit(i5);
                                        i7 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i7 < 0) {
                                        i7 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                                }
                                objArrCopyOf[i5] = languageTag;
                                i2++;
                                i5 = i6;
                            }
                            zzpVarM5461j = zzp.m5461j(objArrCopyOf, i5);
                            C0968a.f11951j = zzpVarM5461j;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                p29Var.f55493e = zzpVarM5461j;
                p29Var.f55496h = Boolean.TRUE;
                p29Var.f55492d = str;
                p29Var.f55491c = str10;
                p29Var.f55494f = c0968a.f11958f.mo5971m() ? (String) c0968a.f11958f.mo5967i() : c0968a.f11956d.m10856a();
                p29Var.f55498j = 10;
                p29Var.f55499k = Integer.valueOf(c0968a.f11960h);
                cdbVar.f9946c = p29Var;
                c0968a.f11955c.mo12306a(cdbVar);
                return;
            case 8:
                oub oubVar3 = (oub) this.f45900d;
                v4d v4dVar = (v4d) this.f45901e;
                try {
                    try {
                        q9c q9cVar = v4dVar.f64866d;
                        if (q9cVar != null) {
                            bArrMo11298m = q9cVar.mo11298m((zzbh) this.f45898b, (String) this.f45899c);
                            v4dVar.m23116Q();
                            rad radVar3 = ((kjc) v4dVar.f60774a).f47441i;
                            kjc.m15278j(radVar3);
                            radVar3.m20554s0(oubVar3, bArrMo11298m);
                            return;
                        }
                        kjc kjcVar2 = (kjc) v4dVar.f60774a;
                        xcc xccVar2 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17923a("Discarding data. Failed to send event to service to bundle");
                        rad radVar4 = kjcVar2.f47441i;
                        kjc.m15278j(radVar4);
                        radVar4.m20554s0(oubVar3, null);
                        return;
                    } catch (Throwable th2) {
                        rad radVar5 = ((kjc) v4dVar.f60774a).f47441i;
                        kjc.m15278j(radVar5);
                        radVar5.m20554s0(oubVar3, null);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    xcc xccVar3 = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68080f.m17924b(e3, "Failed to send event to the service to bundle");
                }
                break;
            case 9:
                v4d v4dVar2 = (v4d) this.f45898b;
                AtomicReference atomicReference2 = (AtomicReference) this.f45899c;
                zzr zzrVar = (zzr) this.f45900d;
                Bundle bundle2 = (Bundle) this.f45901e;
                synchronized (atomicReference2) {
                    try {
                        q9c q9cVar2 = v4dVar2.f64866d;
                        if (q9cVar2 != null) {
                            q9cVar2.mo11295j(zzrVar, bundle2, new w0d(v4dVar2, atomicReference2));
                            v4dVar2.m23116Q();
                            return;
                        } else {
                            xcc xccVar4 = ((kjc) v4dVar2.f60774a).f47438f;
                            kjc.m15280l(xccVar4);
                            xccVar4.f68080f.m17923a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e4) {
                        xcc xccVar5 = ((kjc) v4dVar2.f60774a).f47438f;
                        kjc.m15280l(xccVar5);
                        xccVar5.f68080f.m17924b(e4, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 10:
                v4d v4dVar3 = (v4d) this.f45898b;
                AtomicReference atomicReference3 = (AtomicReference) this.f45899c;
                zzr zzrVar2 = (zzr) this.f45900d;
                zzoo zzooVar2 = (zzoo) this.f45901e;
                synchronized (atomicReference3) {
                    try {
                        q9c q9cVar3 = v4dVar3.f64866d;
                        if (q9cVar3 != null) {
                            q9cVar3.mo11297l(zzrVar2, zzooVar2, new b1d(v4dVar3, atomicReference3));
                            v4dVar3.m23116Q();
                            return;
                        } else {
                            xcc xccVar6 = ((kjc) v4dVar3.f60774a).f47438f;
                            kjc.m15280l(xccVar6);
                            xccVar6.f68080f.m17923a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e5) {
                        xcc xccVar7 = ((kjc) v4dVar3.f60774a).f47438f;
                        kjc.m15280l(xccVar7);
                        xccVar7.f68080f.m17924b(e5, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            case 11:
                C1045d c1045d2 = ((g9d) this.f45901e).f40440a;
                rad radVarM5928k0 = c1045d2.m5928k0();
                c1045d2.mo5911c().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (c1045d2.m5916e0().m4869O(null, z8c.f71167e1)) {
                    c1045d2.mo5911c().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                long j3 = jElapsedRealtime;
                Bundle bundle3 = (Bundle) this.f45900d;
                String str11 = (String) this.f45899c;
                String str12 = (String) this.f45898b;
                zzbh zzbhVarM20546j0 = radVarM5928k0.m20546j0(str11, bundle3, "auto", jCurrentTimeMillis3, j3, false);
                lda.m16130p(zzbhVarM20546j0);
                c1045d2.m5921h(zzbhVarM20546j0, str12);
                return;
            case 12:
                m14566a();
                return;
            default:
                C0984o c0984o = (C0984o) this.f45898b;
                C3299li c3299li = (C3299li) this.f45899c;
                zzov zzovVar = (zzov) this.f45900d;
                String str13 = (String) this.f45901e;
                a34 a34Var = (a34) c3299li.f49691b;
                a34Var.f174b = zzovVar;
                iid iidVar = (iid) a34Var.f173a;
                if (iidVar != null) {
                    str2 = iidVar.f44164d;
                    if (cfd.m4634i(str2)) {
                        str2 = "NA";
                    } else {
                        lda.m16130p(str2);
                    }
                } else {
                    str2 = "NA";
                }
                p29 p29Var2 = new p29();
                p29Var2.f55489a = c0984o.f12060a;
                p29Var2.f55490b = c0984o.f12061b;
                synchronized (C0984o.class) {
                    try {
                        zzbkVarM5497j = C0984o.f12058k;
                        if (zzbkVarM5497j == null) {
                            yi5 yi5Var2 = new yi5(new zi5(Resources.getSystem().getConfiguration().getLocales()));
                            Object[] objArrCopyOf2 = new Object[4];
                            int i8 = 0;
                            while (i2 < yi5Var2.m25156c()) {
                                Locale localeM25155b2 = yi5Var2.m25155b(i2);
                                mp2 mp2Var2 = nb1.f52560a;
                                String languageTag2 = localeM25155b2.toLanguageTag();
                                languageTag2.getClass();
                                int i9 = i8 + 1;
                                int length2 = objArrCopyOf2.length;
                                if (length2 < i9) {
                                    int i10 = length2 + (length2 >> 1) + 1;
                                    if (i10 < i9) {
                                        int iHighestOneBit2 = Integer.highestOneBit(i8);
                                        i10 = iHighestOneBit2 + iHighestOneBit2;
                                    }
                                    if (i10 < 0) {
                                        i10 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i10);
                                }
                                objArrCopyOf2[i8] = languageTag2;
                                i2++;
                                i8 = i9;
                            }
                            zzbkVarM5497j = zzbk.m5497j(objArrCopyOf2, i8);
                            C0984o.f12058k = zzbkVarM5497j;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                p29Var2.f55493e = zzbkVarM5497j;
                p29Var2.f55496h = Boolean.TRUE;
                p29Var2.f55492d = str2;
                p29Var2.f55491c = str13;
                p29Var2.f55494f = c0984o.f12065f.mo5971m() ? (String) c0984o.f12065f.mo5967i() : c0984o.f12063d.m10856a();
                p29Var2.f55498j = 10;
                p29Var2.f55499k = Integer.valueOf(c0984o.f12067h);
                c3299li.f49692c = p29Var2;
                c0984o.f12062c.mo11928a(c3299li);
                return;
        }
    }

    public /* synthetic */ jo0(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f45897a = i;
        this.f45898b = obj;
        this.f45899c = obj2;
        this.f45900d = obj3;
        this.f45901e = obj4;
    }

    public /* synthetic */ jo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f45897a = i;
        this.f45901e = obj;
        this.f45898b = obj2;
        this.f45899c = obj3;
        this.f45900d = obj4;
    }
}
