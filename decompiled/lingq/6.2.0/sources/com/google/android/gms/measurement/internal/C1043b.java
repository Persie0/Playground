package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.C1191l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC3184kh;
import p000.AbstractC3584sr;
import p000.C3600t6;
import p000.C3670v2;
import p000.blb;
import p000.bzc;
import p000.cdb;
import p000.cmb;
import p000.dkc;
import p000.dsc;
import p000.eh0;
import p000.eqc;
import p000.f1d;
import p000.gr7;
import p000.gsc;
import p000.gvb;
import p000.gw9;
import p000.hed;
import p000.htc;
import p000.i9c;
import p000.j0d;
import p000.jbc;
import p000.jwc;
import p000.k1d;
import p000.kj3;
import p000.kjc;
import p000.lda;
import p000.mob;
import p000.npc;
import p000.nr9;
import p000.occ;
import p000.osc;
import p000.pqc;
import p000.qfc;
import p000.rad;
import p000.rbc;
import p000.s46;
import p000.s6d;
import p000.swc;
import p000.t1d;
import p000.tic;
import p000.tk9;
import p000.tqc;
import p000.v4d;
import p000.v7a;
import p000.wob;
import p000.xcc;
import p000.xuc;
import p000.y3d;
import p000.yd7;
import p000.z8c;
import p000.zoa;
import p000.zq3;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1043b extends i9c {

    /* JADX INFO: renamed from: H */
    public PriorityQueue f12315H;

    /* JADX INFO: renamed from: I */
    public npc f12316I;

    /* JADX INFO: renamed from: J */
    public final AtomicLong f12317J;

    /* JADX INFO: renamed from: K */
    public long f12318K;

    /* JADX INFO: renamed from: L */
    public final gw9 f12319L;

    /* JADX INFO: renamed from: M */
    public boolean f12320M;

    /* JADX INFO: renamed from: N */
    public tqc f12321N;

    /* JADX INFO: renamed from: O */
    public swc f12322O;

    /* JADX INFO: renamed from: P */
    public dsc f12323P;

    /* JADX INFO: renamed from: Q */
    public final nr9 f12324Q;

    /* JADX INFO: renamed from: c */
    public C3600t6 f12325c;

    /* JADX INFO: renamed from: d */
    public cdb f12326d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet f12327e;

    /* JADX INFO: renamed from: f */
    public boolean f12328f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f12329g;

    /* JADX INFO: renamed from: h */
    public final Object f12330h;

    /* JADX INFO: renamed from: i */
    public boolean f12331i;

    /* JADX INFO: renamed from: j */
    public int f12332j;

    /* JADX INFO: renamed from: k */
    public tqc f12333k;

    /* JADX INFO: renamed from: l */
    public tqc f12334l;

    public C1043b(kjc kjcVar) {
        super(kjcVar);
        this.f12327e = new CopyOnWriteArraySet();
        this.f12330h = new Object();
        this.f12331i = false;
        this.f12332j = 1;
        this.f12320M = true;
        this.f12324Q = new nr9(this);
        this.f12329g = new AtomicReference();
        this.f12316I = npc.f53108c;
        this.f12318K = -1L;
        this.f12317J = new AtomicLong(0L);
        this.f12319L = new gw9(kjcVar, 17);
    }

    @Override // p000.i9c
    /* JADX INFO: renamed from: G */
    public final boolean mo5850G() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m5851H(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kjcVar.f47436d.m4869O(null, z8c.f71167e1)) {
            kjcVar.f47443k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m5852I(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5852I(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.f12326d == null || rad.m20510g0(str2);
            String str3 = str == null ? "app" : str;
            long j3 = true != ((kjc) this.f60774a).f47436d.m4869O(null, z8c.f71167e1) ? 0L : j2;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            tic ticVar = ((kjc) this.f60774a).f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new gsc(this, str3, str2, j, j3, bundle3, z2, z3, z));
            return;
        }
        kjc kjcVar = (kjc) this.f60774a;
        j0d j0dVar = kjcVar.f47444l;
        kjc.m15279k(j0dVar);
        long j4 = true != kjcVar.f47436d.m4869O(null, z8c.f71167e1) ? 0L : j2;
        synchronized (j0dVar.f44870l) {
            try {
                if (!j0dVar.f44869k) {
                    xcc xccVar = ((kjc) j0dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68085k.m17923a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((kjc) j0dVar.f60774a).f47436d.getClass();
                    }
                    xcc xccVar2 = ((kjc) j0dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68085k.m17924b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((kjc) j0dVar.f60774a).f47436d.getClass();
                    }
                    xcc xccVar3 = ((kjc) j0dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68085k.m17924b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    zzdd zzddVar = j0dVar.f44865g;
                    string2 = zzddVar != null ? j0dVar.m14238I(zzddVar.f11880b) : "Activity";
                }
                String str5 = string2;
                bzc bzcVar = j0dVar.f44861c;
                if (j0dVar.f44866h && bzcVar != null) {
                    j0dVar.f44866h = false;
                    boolean zEquals = Objects.equals(bzcVar.f9209b, str5);
                    boolean zEquals2 = Objects.equals(bzcVar.f9208a, string);
                    if (zEquals && zEquals2) {
                        xcc xccVar4 = ((kjc) j0dVar.f60774a).f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68085k.m17923a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                kjc kjcVar2 = (kjc) j0dVar.f60774a;
                xcc xccVar5 = kjcVar2.f47438f;
                kjc.m15280l(xccVar5);
                xccVar5.f68076I.m17925c("Logging screen view with name, class", string == null ? "null" : string, str5);
                bzc bzcVar2 = j0dVar.f44861c == null ? j0dVar.f44862d : j0dVar.f44861c;
                rad radVar = kjcVar2.f47441i;
                kjc.m15278j(radVar);
                bzc bzcVar3 = new bzc(string, str5, radVar.m20515A0(), true, j, j4);
                j0dVar.f44861c = bzcVar3;
                j0dVar.f44862d = bzcVar2;
                j0dVar.f44867i = bzcVar3;
                kjcVar2.f47443k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                tic ticVar2 = kjcVar2.f47439g;
                kjc.m15280l(ticVar2);
                ticVar2.m22076M(new v7a(j0dVar, bundle2, bzcVar3, bzcVar2, jElapsedRealtime));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: J */
    public final void m5853J() {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1043b.m5853J():void");
    }

    /* JADX INFO: renamed from: K */
    public final void m5854K(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kjcVar.f47436d.m4869O(null, z8c.f71167e1)) {
            kjcVar.f47443k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m5855L(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    /* JADX INFO: renamed from: L */
    public final void m5855L(long j, long j2, Bundle bundle, String str, String str2) {
        mo12359D();
        boolean z = true;
        if (this.f12326d != null && !rad.m20510g0(str2)) {
            z = false;
        }
        m5856M(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX INFO: renamed from: M */
    public final void m5856M(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        qfc qfcVar;
        nr9 nr9Var;
        boolean z4;
        j0d j0dVar;
        long j3;
        boolean zM22719a;
        int i;
        s6d s6dVar;
        long j4;
        int i2;
        long j5;
        s6d s6dVar2;
        boolean zM14378K;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int length;
        String str4 = str;
        lda.m16127m(str4);
        lda.m16130p(bundle);
        mo12359D();
        m13744E();
        kjc kjcVar = (kjc) this.f60774a;
        boolean zM15282f = kjcVar.m15282f();
        s6d s6dVar3 = kjcVar.f47440h;
        cmb cmbVar = kjcVar.f47436d;
        Context context = kjcVar.f47433a;
        rad radVar = kjcVar.f47441i;
        xcc xccVar = kjcVar.f47438f;
        if (!zM15282f) {
            kjc.m15280l(xccVar);
            xccVar.f68075H.m17923a("Event not sent since app measurement is disabled");
            return;
        }
        List list = kjcVar.m15289q().f62083k;
        if (list != null && !list.contains(str2)) {
            kjc.m15280l(xccVar);
            xccVar.f68075H.m17925c("Dropping non-safelisted event. event name, origin", str2, str4);
            return;
        }
        if (!this.f12328f) {
            this.f12328f = true;
            try {
                try {
                    (!kjcVar.f47434b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17924b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                kjc.m15280l(xccVar);
                xccVar.f68086l.m17923a("Tag Manager is not found and thus will not be used");
            }
        }
        rbc rbcVar = kjcVar.f47442j;
        qfc qfcVar2 = kjcVar.f47437e;
        gr7 gr7Var = kjcVar.f47443k;
        if (!cmbVar.m4869O(null, z8c.f71152Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            gr7Var.getClass();
            str3 = null;
            m5858O(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || rad.f59002j[0].equals(str2)) {
            qfcVar = qfcVar2;
        } else {
            kjc.m15278j(radVar);
            kjc.m15278j(qfcVar2);
            qfcVar = qfcVar2;
            radVar.m20535Q(bundle, qfcVar.f57724T.m17688P());
        }
        nr9 nr9Var2 = this.f12324Q;
        if (z3 || "_iap".equals(str2)) {
            nr9Var = nr9Var2;
        } else {
            kjc.m15278j(radVar);
            int i4 = 2;
            if (radVar.m20518F0("event", str2)) {
                nr9Var = nr9Var2;
                if (radVar.m20521H0("event", AbstractC3184kh.f47271m, ((kjc) radVar.f60774a).f47436d.m4869O(str3, z8c.f71170f1) ? AbstractC3184kh.f47273o : AbstractC3184kh.f47272n, str2)) {
                    i3 = 40;
                    if (radVar.m20523I0("event", 40, str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
                if (i4 != 0) {
                    kjc.m15280l(xccVar);
                    xccVar.f68082h.m17924b(rbcVar.m20572a(str2), "Invalid public event name. Event will not be logged (FE)");
                    kjc.m15278j(radVar);
                    String strM20501K = rad.m20501K(str2, i3, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    rad.m20503V(nr9Var, null, i4, "_ev", strM20501K, length);
                    return;
                }
            } else {
                nr9Var = nr9Var2;
            }
            i3 = 40;
            if (i4 != 0) {
                kjc.m15280l(xccVar);
                xccVar.f68082h.m17924b(rbcVar.m20572a(str2), "Invalid public event name. Event will not be logged (FE)");
                kjc.m15278j(radVar);
                String strM20501K2 = rad.m20501K(str2, i3, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                rad.m20503V(nr9Var, null, i4, "_ev", strM20501K2, length);
                return;
            }
        }
        j0d j0dVar2 = kjcVar.f47444l;
        kjc.m15279k(j0dVar2);
        bzc bzcVarM14237H = j0dVar2.m14237H(false);
        if (bzcVarM14237H != null && !bundle.containsKey("_sc")) {
            bzcVarM14237H.f9211d = true;
        }
        rad.m20514y0(bzcVarM14237H, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zM20510g0 = rad.m20510g0(str2);
        if (!z || this.f12326d == null || zM20510g0) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                kjc.m15280l(xccVar);
                xccVar.f68075H.m17925c("Passing event to registered event handler (FE)", rbcVar.m20572a(str2), rbcVar.m20576e(bundle));
                lda.m16130p(this.f12326d);
                this.f12326d.m4557d(j, bundle, str4, str2);
                return;
            }
            z4 = true;
        }
        if (kjcVar.m15284h()) {
            kjc.m15278j(radVar);
            kjc kjcVar2 = (kjc) radVar.f60774a;
            int iM20525J0 = radVar.m20525J0(str2);
            if (iM20525J0 != 0) {
                kjc.m15280l(xccVar);
                xccVar.f68082h.m17924b(rbcVar.m20572a(str2), "Invalid event name. Event will not be logged (FE)");
                String strM20501K3 = rad.m20501K(str2, 40, true);
                int length2 = str2 != null ? str2.length() : 0;
                kjc.m15278j(radVar);
                rad.m20503V(nr9Var, null, iM20525J0, "_ev", strM20501K3, length2);
                return;
            }
            Bundle bundleM20531N = radVar.m20531N(str2, bundle, eh0.m11106C("_o", "_sn", "_sc", "_si"), z3);
            lda.m16130p(bundleM20531N);
            kjc.m15279k(j0dVar2);
            String str5 = "_o";
            if (j0dVar2.m14237H(false) == null || !"_ae".equals(str2)) {
                j0dVar = j0dVar2;
                j3 = 0;
            } else {
                kjc.m15279k(s6dVar3);
                zoa zoaVar = s6dVar3.f60442f;
                ((kjc) ((s6d) zoaVar.f71911d).f60774a).f47443k.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                j0dVar = j0dVar2;
                long j6 = jElapsedRealtime - zoaVar.f71909b;
                zoaVar.f71909b = jElapsedRealtime;
                if (j6 > 0) {
                    radVar.m20550o0(bundleM20531N, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleM20531N.getString("_ffr");
                int i5 = tk9.f62458a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                qfc qfcVar3 = kjcVar2.f47437e;
                kjc.m15278j(qfcVar3);
                if (Objects.equals(string2, qfcVar3.f57721Q.m20980o())) {
                    xcc xccVar2 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68075H.m17923a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    qfc qfcVar4 = kjcVar2.f47437e;
                    kjc.m15278j(qfcVar4);
                    qfcVar4.f57721Q.m20981p(string2);
                }
            } else if ("_ae".equals(str2)) {
                qfc qfcVar5 = kjcVar2.f47437e;
                kjc.m15278j(qfcVar5);
                String strM20980o = qfcVar5.f57721Q.m20980o();
                if (!TextUtils.isEmpty(strM20980o)) {
                    bundleM20531N.putString("_ffr", strM20980o);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleM20531N);
            if (cmbVar.m4869O(null, z8c.f71138S0)) {
                kjc.m15279k(s6dVar3);
                s6dVar3.mo12359D();
                zM22719a = s6dVar3.f60440d;
            } else {
                kjc.m15278j(qfcVar);
                zM22719a = qfcVar.f57718N.m22719a();
            }
            kjc.m15278j(qfcVar);
            if (qfcVar.f57715K.m19952g() > j3) {
                s6dVar = s6dVar3;
                j5 = j;
                if (qfcVar.m19935M(j5) && zM22719a) {
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("Current session is expired, remove the session number, ID, and engagement time");
                    gr7Var.getClass();
                    i = 1;
                    i2 = 0;
                    m5858O(System.currentTimeMillis(), null, "auto", "_sid");
                    m5858O(System.currentTimeMillis(), null, "auto", "_sno");
                    m5858O(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    qfcVar.f57716L.m19953h(j4);
                } else {
                    i = 1;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                i = 1;
                s6dVar = s6dVar3;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (bundleM20531N.getLong("extend_session", j4) == 1) {
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17923a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                kjc.m15279k(s6dVar);
                s6dVar2 = s6dVar;
                s6dVar2.f60441e.m12938i(j5, j2);
            } else {
                s6dVar2 = s6dVar;
            }
            ArrayList arrayList3 = new ArrayList(bundleM20531N.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    kjc.m15278j(radVar);
                    Object obj = bundleM20531N.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM20531N.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundleM20545i0 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleM20545i0.putString(str8, str4);
                if (z2) {
                    bundleM20545i0 = radVar.m20545i0(bundleM20545i0);
                }
                Bundle bundle2 = bundleM20545i0;
                zzbh zzbhVar = new zzbh(str7, new zzbf(bundleM20545i0), str4, j5, j2);
                v4d v4dVarM15287o = kjcVar.m15287o();
                v4dVarM15287o.getClass();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23115P();
                jbc jbcVarM15286n = ((kjc) v4dVarM15287o.f60774a).m15286n();
                jbcVarM15286n.getClass();
                Parcel parcelObtain = Parcel.obtain();
                C3670v2.m23048a(zzbhVar, parcelObtain, i2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    xcc xccVar3 = ((kjc) jbcVarM15286n.f60774a).f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68081g.m17923a("Event is too long for local database. Sending event directly to service");
                    zM14378K = false;
                } else {
                    zM14378K = jbcVarM15286n.m14378K(0, bArrMarshall);
                }
                v4dVarM15287o.m23117R(new f1d(v4dVarM15287o, v4dVarM15287o.m23119T(true), zM14378K, zzbhVar, 1));
                if (!z4) {
                    Iterator it = this.f12327e.iterator();
                    while (it.hasNext()) {
                        ((eqc) it.next()).mo10094a(j, new Bundle(bundle2), str, str2);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            kjc.m15279k(j0dVar);
            if (j0dVar.m14237H(false) == null || !"_ae".equals(str2)) {
                return;
            }
            kjc.m15279k(s6dVar2);
            gr7Var.getClass();
            s6dVar2.f60442f.m25732e(SystemClock.elapsedRealtime(), true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: N */
    public final void m5857N(String str, String str2, Object obj, boolean z, long j) {
        int iM20528L0;
        int length;
        kjc kjcVar = (kjc) this.f60774a;
        if (z) {
            rad radVar = kjcVar.f47441i;
            kjc.m15278j(radVar);
            iM20528L0 = radVar.m20528L0(str2);
        } else {
            rad radVar2 = kjcVar.f47441i;
            kjc.m15278j(radVar2);
            if (!radVar2.m20518F0("user property", str2)) {
                iM20528L0 = 6;
            } else if (radVar2.m20521H0("user property", AbstractC3584sr.f61286m, null, str2)) {
                ((kjc) radVar2.f60774a).getClass();
                if (radVar2.m20523I0("user property", 24, str2)) {
                    iM20528L0 = 0;
                } else {
                    iM20528L0 = 6;
                }
            } else {
                iM20528L0 = 15;
            }
        }
        nr9 nr9Var = this.f12324Q;
        if (iM20528L0 != 0) {
            kjc.m15278j(kjcVar.f47441i);
            String strM20501K = rad.m20501K(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            kjc.m15278j(kjcVar.f47441i);
            rad.m20503V(nr9Var, null, iM20528L0, "_ev", strM20501K, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new dkc(this, str3, str2, null, j, 1));
            return;
        }
        rad radVar3 = kjcVar.f47441i;
        rad radVar4 = kjcVar.f47441i;
        kjc.m15278j(radVar3);
        int iM20537S = radVar3.m20537S(obj, str2);
        if (iM20537S != 0) {
            kjc.m15278j(radVar4);
            String strM20501K2 = rad.m20501K(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            kjc.m15278j(radVar4);
            rad.m20503V(nr9Var, null, iM20537S, "_ev", strM20501K2, length);
            return;
        }
        kjc.m15278j(radVar4);
        Object objM20538T = radVar4.m20538T(obj, str2);
        if (objM20538T != null) {
            tic ticVar2 = kjcVar.f47439g;
            kjc.m15280l(ticVar2);
            ticVar2.m22076M(new dkc(this, str3, str2, objM20538T, j, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: O */
    public final void m5858O(long j, Object obj, String str, String str2) {
        String str3;
        boolean zM14378K;
        Object objValueOf = obj;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        lda.m16127m(str2);
        mo12359D();
        m13744E();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    qfc qfcVar = kjcVar.f47437e;
                    kjc.m15278j(qfcVar);
                    qfcVar.f57712H.m20981p(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    qfc qfcVar2 = kjcVar.f47437e;
                    kjc.m15278j(qfcVar2);
                    qfcVar2.f57712H.m20981p("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                qfc qfcVar3 = kjcVar.f47437e;
                kjc.m15278j(qfcVar3);
                qfcVar3.f57712H.m20981p("unset");
            } else {
                str4 = str2;
            }
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17925c("Setting user property(FE)", "non_personalized_ads(_npa)", objValueOf);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!kjcVar.m15282f()) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68076I.m17923a("User property not set since app measurement is disabled");
            return;
        }
        if (kjcVar.m15284h()) {
            zzpl zzplVar = new zzpl(j, obj2, str3, str);
            v4d v4dVarM15287o = kjcVar.m15287o();
            v4dVarM15287o.mo12359D();
            v4dVarM15287o.m13744E();
            v4dVarM15287o.m23115P();
            jbc jbcVarM15286n = ((kjc) v4dVarM15287o.f60774a).m15286n();
            jbcVarM15286n.getClass();
            Parcel parcelObtain = Parcel.obtain();
            C3670v2.m23049b(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                xcc xccVar3 = ((kjc) jbcVarM15286n.f60774a).f47438f;
                kjc.m15280l(xccVar3);
                xccVar3.f68081g.m17923a("User property too long for local database. Sending directly to service");
                zM14378K = false;
            } else {
                zM14378K = jbcVarM15286n.m14378K(1, bArrMarshall);
            }
            v4dVarM15287o.m23117R(new f1d(v4dVarM15287o, v4dVarM15287o.m23119T(true), zM14378K, zzplVar, 0));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5859P() {
        mo12359D();
        m13744E();
        kjc kjcVar = (kjc) this.f60774a;
        if (kjcVar.m15284h()) {
            cmb cmbVar = kjcVar.f47436d;
            ((kjc) cmbVar.f60774a).getClass();
            Boolean boolM4871Q = cmbVar.m4871Q("google_analytics_deferred_deep_link_enabled");
            if (boolM4871Q != null && boolM4871Q.booleanValue()) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68075H.m17923a("Deferred Deep Link feature enabled.");
                tic ticVar = kjcVar.f47439g;
                kjc.m15280l(ticVar);
                ticVar.m22076M(new pqc(this, 2));
            }
            v4d v4dVarM15287o = kjcVar.m15287o();
            v4dVarM15287o.mo12359D();
            v4dVarM15287o.m13744E();
            zzr zzrVarM23119T = v4dVarM15287o.m23119T(true);
            v4dVarM15287o.m23115P();
            kjc kjcVar2 = (kjc) v4dVarM15287o.f60774a;
            kjcVar2.f47436d.m4869O(null, z8c.f71146W0);
            kjcVar2.m15286n().m14378K(3, new byte[0]);
            v4dVarM15287o.m23117R(new t1d(v4dVarM15287o, zzrVarM23119T, 0));
            this.f12320M = false;
            qfc qfcVar = kjcVar.f47437e;
            kjc.m15278j(qfcVar);
            qfcVar.mo12359D();
            String string = qfcVar.m19930H().getString("previous_os_version", null);
            ((kjc) qfcVar.f60774a).m15288p().m18192F();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = qfcVar.m19930H().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            kjcVar.m15288p().m18192F();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m5854K("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m5860Q(Bundle bundle, long j) {
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16130p(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17923a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        hed.m13215c(bundle2, "app_id", String.class, null);
        hed.m13215c(bundle2, "origin", String.class, null);
        hed.m13215c(bundle2, "name", String.class, null);
        hed.m13215c(bundle2, "value", Object.class, null);
        hed.m13215c(bundle2, "trigger_event_name", String.class, null);
        hed.m13215c(bundle2, "trigger_timeout", Long.class, 0L);
        hed.m13215c(bundle2, "timed_out_event_name", String.class, null);
        hed.m13215c(bundle2, "timed_out_event_params", Bundle.class, null);
        hed.m13215c(bundle2, "triggered_event_name", String.class, null);
        hed.m13215c(bundle2, "triggered_event_params", Bundle.class, null);
        hed.m13215c(bundle2, "time_to_live", Long.class, 0L);
        hed.m13215c(bundle2, "expired_event_name", String.class, null);
        hed.m13215c(bundle2, "expired_event_params", Bundle.class, null);
        lda.m16127m(bundle2.getString("name"));
        lda.m16127m(bundle2.getString("origin"));
        lda.m16130p(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        rad radVar = kjcVar.f47441i;
        rbc rbcVar = kjcVar.f47442j;
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15278j(radVar);
        if (radVar.m20528L0(string) != 0) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(rbcVar.m20574c(string), "Invalid conditional user property name");
            return;
        }
        kjc.m15278j(radVar);
        if (radVar.m20537S(obj, string) != 0) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Invalid conditional user property value", rbcVar.m20574c(string), obj);
            return;
        }
        Object objM20538T = radVar.m20538T(obj, string);
        if (objM20538T == null) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Unable to normalize conditional user property value", rbcVar.m20574c(string), obj);
            return;
        }
        hed.m13214b(bundle2, objM20538T);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Invalid conditional user property timeout", rbcVar.m20574c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Invalid conditional user property time to live", rbcVar.m20574c(string), Long.valueOf(j3));
        } else {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new gvb(this, bundle2, false, 18));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m5861R(String str, String str2, Bundle bundle) {
        kjc kjcVar = (kjc) this.f60774a;
        kjcVar.f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lda.m16127m(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new htc(this, bundle2, 0));
    }

    /* JADX INFO: renamed from: S */
    public final String m5862S() {
        kjc kjcVar = (kjc) this.f60774a;
        try {
            return C1191l.m6879d(kjcVar.f47433a, kjcVar.f47417K);
        } catch (IllegalStateException e) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m5863T(npc npcVar, long j, boolean z) {
        int i = npcVar.f53110b;
        mo12359D();
        m13744E();
        kjc kjcVar = (kjc) this.f60774a;
        qfc qfcVar = kjcVar.f47437e;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15278j(qfcVar);
        npc npcVarM19933K = qfcVar.m19933K();
        if (j <= this.f12318K && npc.m17587l(npcVarM19933K.f53110b, i)) {
            kjc.m15280l(xccVar);
            xccVar.f68086l.m17924b(npcVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        qfc qfcVar2 = kjcVar.f47437e;
        kjc.m15278j(qfcVar2);
        qfcVar2.mo12359D();
        if (!npc.m17587l(i, qfcVar2.m19930H().getInt("consent_source", 100))) {
            kjc.m15280l(xccVar);
            xccVar.f68086l.m17924b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = qfcVar2.m19930H().edit();
        editorEdit.putString("consent_settings", npcVar.m17589g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17924b(npcVar, "Setting storage consent(FE)");
        this.f12318K = j;
        if (kjcVar.m15287o().m23113N()) {
            v4d v4dVarM15287o = kjcVar.m15287o();
            v4dVarM15287o.mo12359D();
            v4dVarM15287o.m13744E();
            v4dVarM15287o.m23117R(new y3d(v4dVarM15287o, 2));
        } else {
            v4d v4dVarM15287o2 = kjcVar.m15287o();
            v4dVarM15287o2.mo12359D();
            v4dVarM15287o2.m13744E();
            if (v4dVarM15287o2.m23112M()) {
                v4dVarM15287o2.m23117R(new k1d(v4dVarM15287o2, v4dVarM15287o2.m23119T(false), 1));
            }
        }
        if (z) {
            kjcVar.m15287o().m23107H(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m5864U(Boolean bool, boolean z) {
        mo12359D();
        m13744E();
        kjc kjcVar = (kjc) this.f60774a;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68075H.m17924b(bool, "Setting app measurement enabled (FE)");
        qfc qfcVar = kjcVar.f47437e;
        kjc.m15278j(qfcVar);
        qfcVar.mo12359D();
        SharedPreferences.Editor editorEdit = qfcVar.m19930H().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            qfcVar.mo12359D();
            SharedPreferences.Editor editorEdit2 = qfcVar.m19930H().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        if (kjcVar.f47427U || !(bool == null || bool.booleanValue())) {
            m5865V();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m5865V() {
        mo12359D();
        kjc kjcVar = (kjc) this.f60774a;
        qfc qfcVar = kjcVar.f47437e;
        xcc xccVar = kjcVar.f47438f;
        gr7 gr7Var = kjcVar.f47443k;
        kjc.m15278j(qfcVar);
        String strM20980o = qfcVar.f57712H.m20980o();
        int i = 1;
        if (strM20980o != null) {
            if ("unset".equals(strM20980o)) {
                gr7Var.getClass();
                m5858O(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM20980o) ? 0L : 1L);
                gr7Var.getClass();
                m5858O(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!kjcVar.m15282f() || !this.f12320M) {
            kjc.m15280l(xccVar);
            xccVar.f68075H.m17923a("Updating Scion state (FE)");
            v4d v4dVarM15287o = kjcVar.m15287o();
            v4dVarM15287o.mo12359D();
            v4dVarM15287o.m13744E();
            v4dVarM15287o.m23117R(new gvb(v4dVarM15287o, v4dVarM15287o.m23119T(true), false, 23));
            return;
        }
        kjc.m15280l(xccVar);
        xccVar.f68075H.m17923a("Recording app launch after enabling measurement for the first time (FE)");
        m5859P();
        s6d s6dVar = kjcVar.f47440h;
        kjc.m15279k(s6dVar);
        s6dVar.f60441e.m12936e();
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new pqc(this, i));
    }

    /* JADX INFO: renamed from: W */
    public final void m5866W() {
        kjc kjcVar = (kjc) this.f60774a;
        if (!(kjcVar.f47433a.getApplicationContext() instanceof Application) || this.f12325c == null) {
            return;
        }
        ((Application) kjcVar.f47433a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f12325c);
    }

    /* JADX INFO: renamed from: X */
    public final void m5867X(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        kjc kjcVar = (kjc) this.f60774a;
        m13744E();
        npc npcVar = npc.f53108c;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68085k.m17924b(obj, "Ignoring invalid consent setting");
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68085k.m17923a("Valid consent values are 'granted', 'denied'");
        }
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        boolean zM22073J = ticVar.m22073J();
        npc npcVarM17582b = npc.m17582b(i, bundle);
        Iterator it = npcVarM17582b.f53109a.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                m5869Z(npcVarM17582b, zM22073J);
                break;
            }
        }
        mob mobVarM16961c = mob.m16961c(i, bundle);
        Iterator it2 = mobVarM16961c.f51671e.values().iterator();
        while (it2.hasNext()) {
            if (((zzji) it2.next()) != zzji.UNINITIALIZED) {
                m5868Y(mobVarM16961c, zM22073J);
                break;
            }
        }
        Boolean boolM16962d = mob.m16962d(bundle);
        if (boolM16962d != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM22073J) {
                m5858O(j, boolM16962d.toString(), str2, "allow_personalized_ads");
            } else {
                m5857N(str2, "allow_personalized_ads", boolM16962d.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m5868Y(mob mobVar, boolean z) {
        gvb gvbVar = new gvb(this, mobVar, false, 20);
        if (z) {
            mo12359D();
            gvbVar.run();
        } else {
            tic ticVar = ((kjc) this.f60774a).f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(gvbVar);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m5869Z(npc npcVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        npc npcVar2;
        m13744E();
        int i = npcVar.f53110b;
        if (i != -10) {
            zzji zzjiVar = (zzji) npcVar.f53109a.get(zzjk.AD_STORAGE);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            zzji zzjiVar2 = zzji.UNINITIALIZED;
            if (zzjiVar == zzjiVar2) {
                zzji zzjiVar3 = (zzji) npcVar.f53109a.get(zzjk.ANALYTICS_STORAGE);
                if (zzjiVar3 == null) {
                    zzjiVar3 = zzjiVar2;
                }
                if (zzjiVar3 == zzjiVar2) {
                    xcc xccVar = ((kjc) this.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68085k.m17923a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f12330h) {
            try {
                z2 = false;
                if (npc.m17587l(i, this.f12316I.f53110b)) {
                    npc npcVar3 = this.f12316I;
                    EnumMap enumMap = npcVar.f53109a;
                    zzjk[] zzjkVarArr = (zzjk[]) enumMap.keySet().toArray(new zzjk[0]);
                    int length = zzjkVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        zzjk zzjkVar = zzjkVarArr[i2];
                        zzji zzjiVar4 = (zzji) enumMap.get(zzjkVar);
                        zzji zzjiVar5 = (zzji) npcVar3.f53109a.get(zzjkVar);
                        zzji zzjiVar6 = zzji.DENIED;
                        if (zzjiVar4 == zzjiVar6 && zzjiVar5 != zzjiVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    zzjk zzjkVar2 = zzjk.ANALYTICS_STORAGE;
                    if (npcVar.m17590i(zzjkVar2) && !this.f12316I.m17590i(zzjkVar2)) {
                        z2 = true;
                    }
                    npcVar = npcVar.m17592k(this.f12316I);
                    this.f12316I = npcVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                npcVar2 = npcVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            xcc xccVar2 = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68086l.m17924b(npcVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f12317J.getAndIncrement();
        if (z3) {
            this.f12329g.set(null);
            xuc xucVar = new xuc(this, npcVar2, andIncrement, z4, 0);
            if (z) {
                mo12359D();
                xucVar.run();
                return;
            } else {
                tic ticVar = ((kjc) this.f60774a).f47439g;
                kjc.m15280l(ticVar);
                ticVar.m22078O(xucVar);
                return;
            }
        }
        xuc xucVar2 = new xuc(this, npcVar2, andIncrement, z4, 1);
        if (z) {
            mo12359D();
            xucVar2.run();
        } else if (i == 30 || i == -10) {
            tic ticVar2 = ((kjc) this.f60774a).f47439g;
            kjc.m15280l(ticVar2);
            ticVar2.m22078O(xucVar2);
        } else {
            tic ticVar3 = ((kjc) this.f60774a).f47439g;
            kjc.m15280l(ticVar3);
            ticVar3.m22076M(xucVar2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5870a0() {
        blb.m3870a();
        kjc kjcVar = (kjc) this.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        tic ticVar = kjcVar.f47439g;
        xcc xccVar = kjcVar.f47438f;
        if (cmbVar.m4869O(null, z8c.f71132P0)) {
            kjc.m15280l(ticVar);
            if (ticVar.m22073J()) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17923a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (s46.m21077y()) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17923a("Cannot get trigger URIs from main thread");
                return;
            }
            m13744E();
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17923a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            kjc.m15280l(ticVar);
            ticVar.m22077N(atomicReference, 10000L, "get trigger URIs", new osc(this, atomicReference, 3));
            List list = (List) atomicReference.get();
            if (list == null) {
                kjc.m15280l(xccVar);
                xccVar.f68082h.m17923a("Timed out waiting for get trigger URIs");
            } else {
                kjc.m15280l(ticVar);
                ticVar.m22076M(new gvb(22, this, list));
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final PriorityQueue m5871b0() {
        if (this.f12315H == null) {
            this.f12315H = new PriorityQueue(Comparator.comparing(jwc.f46329a, yd7.f69697d));
        }
        return this.f12315H;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m5872c0() {
        zzoh zzohVar;
        mo12359D();
        if (m5871b0().isEmpty() || this.f12331i || (zzohVar = (zzoh) m5871b0().poll()) == null) {
            return;
        }
        kjc kjcVar = (kjc) this.f60774a;
        rad radVar = kjcVar.f47441i;
        kjc.m15278j(radVar);
        if (radVar.f59006f == null) {
            radVar.f59006f = wob.m24095a(((kjc) radVar.f60774a).f47433a);
        }
        MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl = radVar.f59006f;
        if (measurementManagerFutures$Api33Ext5JavaImpl != null) {
            this.f12331i = true;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            occ occVar = xccVar.f68076I;
            String str = zzohVar.f12394a;
            occVar.m17924b(str, "Registering trigger URI");
            ListenableFuture listenableFutureM2579f = measurementManagerFutures$Api33Ext5JavaImpl.m2579f(Uri.parse(str));
            int i = 0;
            if (listenableFutureM2579f != null) {
                listenableFutureM2579f.mo52a(new kj3(i, listenableFutureM2579f, new cdb(13, this, zzohVar)), new zq3(this));
            } else {
                this.f12331i = false;
                m5871b0().add(zzohVar);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m5873d0(npc npcVar) {
        mo12359D();
        boolean z = (npcVar.m17590i(zzjk.ANALYTICS_STORAGE) && npcVar.m17590i(zzjk.AD_STORAGE)) || ((kjc) this.f60774a).m15287o().m23112M();
        kjc kjcVar = (kjc) this.f60774a;
        tic ticVar = kjcVar.f47439g;
        kjc.m15280l(ticVar);
        ticVar.mo12359D();
        if (z != kjcVar.f47427U) {
            tic ticVar2 = kjcVar.f47439g;
            kjc.m15280l(ticVar2);
            ticVar2.mo12359D();
            kjcVar.f47427U = z;
            qfc qfcVar = ((kjc) this.f60774a).f47437e;
            kjc.m15278j(qfcVar);
            qfcVar.mo12359D();
            Boolean boolValueOf = qfcVar.m19930H().contains("measurement_enabled_from_api") ? Boolean.valueOf(qfcVar.m19930H().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m5864U(Boolean.valueOf(z), false);
            }
        }
    }
}
