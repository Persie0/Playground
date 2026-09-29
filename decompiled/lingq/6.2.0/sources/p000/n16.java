package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n16 {

    /* JADX INFO: renamed from: a */
    public final Object f52173a;

    /* JADX INFO: renamed from: b */
    public final Object f52174b;

    /* JADX INFO: renamed from: c */
    public Object f52175c;

    /* JADX INFO: renamed from: d */
    public Object f52176d;

    /* JADX INFO: renamed from: e */
    public Object f52177e;

    /* JADX INFO: renamed from: f */
    public Object f52178f;

    /* JADX INFO: renamed from: g */
    public Object f52179g;

    /* JADX INFO: renamed from: h */
    public Object f52180h;

    /* JADX INFO: renamed from: i */
    public Object f52181i;

    public n16(jw2 jw2Var, ew2 ew2Var, mp9 mp9Var, int i, int i2, int i3, int i4) {
        this.f52173a = jw2Var;
        this.f52174b = ew2Var;
        this.f52175c = mp9Var;
        this.f52176d = new x0a();
        this.f52177e = mp9Var.m16990a(jw2Var.f46301s, new rg5(this, 1));
        this.f52178f = new ml9(this, i);
        this.f52179g = new nl9(this, i2);
        this.f52180h = new ol9(this, i3);
        this.f52181i = new pl9(this, i4);
        jw2Var.f46295m.m23268a(new ll9(this));
    }

    /* JADX INFO: renamed from: a */
    public synchronized ef4 m17168a() {
        ef4 ef4VarM11088d;
        try {
            ef4VarM11088d = ef4.m11088d();
            k16 k16Var = (k16) this.f52174b;
            if (k16Var != null) {
                ef4VarM11088d.m11091c(k16Var.m14772b());
            }
            k16 k16Var2 = (k16) this.f52175c;
            if (k16Var2 != null) {
                ef4VarM11088d.m11091c(k16Var2.m14772b());
            }
            k16 k16Var3 = (k16) this.f52176d;
            if (k16Var3 != null) {
                ef4VarM11088d.m11091c(k16Var3.m14772b());
            }
            k16 k16Var4 = (k16) this.f52177e;
            if (k16Var4 != null) {
                ef4VarM11088d.m11091c(k16Var4.m14772b());
            }
            k16 k16Var5 = (k16) this.f52178f;
            if (k16Var5 != null) {
                ef4VarM11088d.m11091c(k16Var5.m14772b());
            }
            k16 k16Var6 = (k16) this.f52179g;
            if (k16Var6 != null) {
                ef4VarM11088d.m11091c(k16Var6.m14772b());
            }
            k16 k16Var7 = (k16) this.f52180h;
            if (k16Var7 != null) {
                ef4VarM11088d.m11091c(k16Var7.m14772b());
            }
            k16 k16Var8 = (k16) this.f52181i;
            if (k16Var8 != null) {
                ef4VarM11088d.m11091c(k16Var8.m14772b());
            }
        } catch (Throwable th) {
            throw th;
        }
        return ef4VarM11088d;
    }

    /* JADX INFO: renamed from: b */
    public void m17169b(final q50 q50Var, int i) {
        byte[] bArr;
        long j;
        eba ebaVar;
        s20 s20Var;
        String str;
        C3846zu c3846zuM19688i;
        String str2;
        Integer numValueOf;
        long j2;
        v40 v40Var;
        final n16 n16Var = this;
        final q50 q50Var2 = q50Var;
        byte[] bArr2 = q50Var2.f57280b;
        hk8 hk8Var = (hk8) n16Var.f52178f;
        eba ebaVarM12245a = ((fy5) n16Var.f52174b).m12245a(q50Var2.f57279a);
        if (BackendResponse$Status.OK == null) {
            C3386nv.m17635v("Null status");
            return;
        }
        eba ebaVar2 = ebaVarM12245a;
        long jMax = 0;
        while (((Boolean) hk8Var.m13317p(new gp9(n16Var) { // from class: gja

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ n16 f40883b;

            {
                this.f40883b = n16Var;
            }

            @Override // p000.gp9
            /* JADX INFO: renamed from: n */
            public final Object mo395n() {
                Boolean bool;
                int i2 = i;
                q50 q50Var3 = q50Var2;
                n16 n16Var2 = this.f40883b;
                switch (i2) {
                    case 0:
                        hk8 hk8Var2 = (hk8) n16Var2.f52175c;
                        SQLiteDatabase sQLiteDatabaseM13313a = hk8Var2.m13313a();
                        sQLiteDatabaseM13313a.beginTransaction();
                        try {
                            Long lM13310b = hk8.m13310b(sQLiteDatabaseM13313a, q50Var3);
                            if (lM13310b == null) {
                                bool = Boolean.FALSE;
                            } else {
                                Cursor cursorRawQuery = hk8Var2.m13313a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM13310b.toString()});
                                try {
                                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                    cursorRawQuery.close();
                                    bool = boolValueOf;
                                } catch (Throwable th) {
                                    cursorRawQuery.close();
                                    throw th;
                                }
                            }
                            sQLiteDatabaseM13313a.setTransactionSuccessful();
                            sQLiteDatabaseM13313a.endTransaction();
                            return bool;
                        } catch (Throwable th2) {
                            sQLiteDatabaseM13313a.endTransaction();
                            throw th2;
                        }
                    default:
                        hk8 hk8Var3 = (hk8) n16Var2.f52175c;
                        hk8Var3.getClass();
                        return (Iterable) hk8Var3.m13314c(new r41(9, hk8Var3, q50Var3));
                }
            }
        })).booleanValue()) {
            final int i2 = 1;
            final Iterable iterable = (Iterable) hk8Var.m13317p(new gp9(n16Var) { // from class: gja

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ n16 f40883b;

                {
                    this.f40883b = n16Var;
                }

                @Override // p000.gp9
                /* JADX INFO: renamed from: n */
                public final Object mo395n() {
                    Boolean bool;
                    int i3 = i2;
                    q50 q50Var3 = q50Var2;
                    n16 n16Var2 = this.f40883b;
                    switch (i3) {
                        case 0:
                            hk8 hk8Var2 = (hk8) n16Var2.f52175c;
                            SQLiteDatabase sQLiteDatabaseM13313a = hk8Var2.m13313a();
                            sQLiteDatabaseM13313a.beginTransaction();
                            try {
                                Long lM13310b = hk8.m13310b(sQLiteDatabaseM13313a, q50Var3);
                                if (lM13310b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hk8Var2.m13313a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM13310b.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM13313a.setTransactionSuccessful();
                                sQLiteDatabaseM13313a.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM13313a.endTransaction();
                                throw th2;
                            }
                        default:
                            hk8 hk8Var3 = (hk8) n16Var2.f52175c;
                            hk8Var3.getClass();
                            return (Iterable) hk8Var3.m13314c(new r41(9, hk8Var3, q50Var3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (ebaVar2 == null) {
                x74.m24357n("Uploader", "Unknown backend for %s, deleting event batch for it...", q50Var2);
                s20Var = new s20(BackendResponse$Status.FATAL_ERROR, -1L);
                bArr = bArr2;
                j = jMax;
                ebaVar = ebaVar2;
            } else {
                ArrayList<l40> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a50) it.next()).f249c);
                }
                String str3 = "proto";
                if (bArr2 != null) {
                    hk8 hk8Var2 = (hk8) n16Var.f52181i;
                    Objects.requireNonNull(hk8Var2);
                    r31 r31Var = (r31) hk8Var.m13317p(new C3487q7(hk8Var2, 21));
                    k40 k40Var = new k40();
                    k40Var.f46681i = new HashMap();
                    k40Var.f46679g = Long.valueOf(((a41) n16Var.f52179g).mo100g());
                    k40Var.f46680h = Long.valueOf(((a41) n16Var.f52180h).mo100g());
                    k40Var.f46674b = "GDT_CLIENT_METRICS";
                    bs2 bs2Var = new bs2("proto");
                    r31Var.getClass();
                    sq5 sq5Var = ao7.f7292a;
                    sq5Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        sq5Var.m21564e(r31Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    k40Var.f46678f = new vr2(bs2Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((mo0) ebaVar2).m16948a(k40Var.m14798c()));
                }
                mo0 mo0Var = (mo0) ebaVar2;
                HashMap map = new HashMap();
                for (l40 l40Var : arrayList) {
                    String str4 = l40Var.f49001a;
                    if (map.containsKey(str4)) {
                        ((List) map.get(str4)).add(l40Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(l40Var);
                        map.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    l40 l40Var2 = (l40) ((List) entry.getValue()).get(0);
                    QosTier qosTier = QosTier.DEFAULT;
                    long jMo100g = mo0Var.f51618f.mo100g();
                    long jMo100g2 = mo0Var.f51617e.mo100g();
                    C3156jq c3156jq = new C3156jq((char) 0);
                    c3156jq.m14596J(ClientInfo$ClientType.ANDROID_FIREBASE);
                    q20 q20Var = new q20();
                    byte[] bArr3 = bArr2;
                    q20Var.m19614m(Integer.valueOf(l40Var2.m15777b("sdk-version")));
                    q20Var.m19611j(l40Var2.m15776a("model"));
                    q20Var.m19607f(l40Var2.m15776a("hardware"));
                    q20Var.m19605d(l40Var2.m15776a("device"));
                    q20Var.m19613l(l40Var2.m15776a("product"));
                    q20Var.m19612k(l40Var2.m15776a("os-uild"));
                    q20Var.m19609h(l40Var2.m15776a("manufacturer"));
                    q20Var.m19606e(l40Var2.m15776a("fingerprint"));
                    q20Var.m19604c(l40Var2.m15776a("country"));
                    q20Var.m19608g(l40Var2.m15776a("locale"));
                    q20Var.m19610i(l40Var2.m15776a("mcc_mnc"));
                    q20Var.m19603b(l40Var2.m15776a("application_build"));
                    c3156jq.m14594H(q20Var.m19602a());
                    u20 u20VarM14609t = c3156jq.m14609t();
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        l40 l40Var3 = (l40) it2.next();
                        vr2 vr2Var = l40Var3.f49003c;
                        bs2 bs2Var2 = vr2Var.f65823a;
                        byte[] bArr4 = vr2Var.f65824b;
                        Iterator it3 = it2;
                        if (bs2Var2.equals(new bs2(str3))) {
                            v40Var = new v40();
                            v40Var.f64822e = bArr4;
                        } else {
                            if (bs2Var2.equals(new bs2("json"))) {
                                String str5 = new String(bArr4, Charset.forName("UTF-8"));
                                v40 v40Var2 = new v40();
                                v40Var2.f64823f = str5;
                                v40Var = v40Var2;
                            } else {
                                j2 = jMax;
                                str3 = str3;
                                ebaVar2 = ebaVar2;
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + bs2Var2 + ". Skipping...");
                                }
                            }
                            it2 = it3;
                            jMax = j2;
                            str3 = str3;
                            ebaVar2 = ebaVar2;
                        }
                        byte[] bArr5 = l40Var3.f49010j;
                        v40Var.f64818a = Long.valueOf(l40Var3.f49004d);
                        v40Var.f64821d = Long.valueOf(l40Var3.f49005e);
                        String str6 = (String) l40Var3.f49006f.get("tz-offset");
                        v40Var.f64824g = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        j2 = jMax;
                        v40Var.f64825h = new z40(NetworkConnectionInfo$NetworkType.forNumber(l40Var3.m15777b("net-type")), NetworkConnectionInfo$MobileSubtype.forNumber(l40Var3.m15777b("mobile-subtype")));
                        Integer num = l40Var3.f49002b;
                        if (num != null) {
                            v40Var.f64819b = num;
                        }
                        Integer num2 = l40Var3.f49007g;
                        if (num2 != null) {
                            C3156jq c3156jq2 = new C3156jq((char) 0);
                            vj6 vj6Var = new vj6(5);
                            hi8 hi8Var = new hi8(4, false);
                            hi8Var.m13289z(num2);
                            vj6Var.f65506b = hi8Var.m13281e();
                            c3156jq2.m14601O(new p40((o40) vj6Var.f65506b));
                            c3156jq2.m14603Q(ComplianceData$ProductIdOrigin.EVENT_OVERRIDE);
                            v40Var.f64820c = c3156jq2.m14610u();
                        }
                        byte[] bArr6 = l40Var3.f49009i;
                        if (bArr6 != null || bArr5 != null) {
                            C3156jq c3156jq3 = new C3156jq((char) 0);
                            if (bArr6 != null) {
                                c3156jq3.m14595I(bArr6);
                            }
                            if (bArr5 != null) {
                                c3156jq3.m14597K(bArr5);
                            }
                            v40Var.f64826i = c3156jq3.m14612w();
                        }
                        String strConcat2 = v40Var.f64818a == null ? " eventTimeMs" : "";
                        if (v40Var.f64821d == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (v40Var.f64824g == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            C3386nv.m17633t("Missing required properties:".concat(strConcat2));
                            return;
                        }
                        arrayList4.add(new w40(v40Var.f64818a.longValue(), v40Var.f64819b, v40Var.f64820c, v40Var.f64821d.longValue(), v40Var.f64822e, v40Var.f64823f, v40Var.f64824g.longValue(), v40Var.f64825h, v40Var.f64826i));
                        it2 = it3;
                        jMax = j2;
                        str3 = str3;
                        ebaVar2 = ebaVar2;
                    }
                    arrayList3.add(new x40(jMo100g, jMo100g2, u20VarM14609t, numValueOf, str2, arrayList4, qosTier));
                    bArr2 = bArr3;
                    ebaVar2 = ebaVar2;
                }
                bArr = bArr2;
                j = jMax;
                ebaVar = ebaVar2;
                t20 t20Var = new t20(arrayList3);
                URL urlM16947b = mo0Var.f51616d;
                if (bArr != null) {
                    try {
                        al0 al0VarM533a = al0.m533a(bArr);
                        str = al0VarM533a.f796b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = al0VarM533a.f795a;
                        if (str7 != null) {
                            urlM16947b = mo0.m16947b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        s20Var = new s20(BackendResponse$Status.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    int i3 = 15;
                    C3309ls c3309ls = new C3309ls(urlM16947b, t20Var, str, i3);
                    C3487q7 c3487q7 = new C3487q7(mo0Var, 4);
                    int i4 = 5;
                    do {
                        c3846zuM19688i = c3487q7.m19688i(c3309ls);
                        URL url = (URL) c3846zuM19688i.f72166c;
                        if (url != null) {
                            x74.m24357n("CctTransportBackend", "Following redirect to: %s", url);
                            c3309ls = new C3309ls(url, (t20) c3309ls.f50065c, (String) c3309ls.f50066d, i3);
                        } else {
                            c3309ls = null;
                        }
                        if (c3309ls == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = c3846zuM19688i.f72164a;
                    if (i5 == 200) {
                        s20Var = new s20(BackendResponse$Status.OK, c3846zuM19688i.f72165b);
                    } else if (i5 >= 500 || i5 == 404) {
                        s20Var = new s20(BackendResponse$Status.TRANSIENT_ERROR, -1L);
                    } else {
                        s20Var = i5 == 400 ? new s20(BackendResponse$Status.INVALID_PAYLOAD, -1L) : new s20(BackendResponse$Status.FATAL_ERROR, -1L);
                    }
                } catch (IOException e) {
                    x74.m24359p("CctTransportBackend", "Could not make request to the backend", e);
                    s20Var = new s20(BackendResponse$Status.TRANSIENT_ERROR, -1L);
                }
            }
            BackendResponse$Status backendResponse$Status = BackendResponse$Status.TRANSIENT_ERROR;
            BackendResponse$Status backendResponse$Status2 = s20Var.f60171a;
            if (backendResponse$Status2 == backendResponse$Status) {
                final long j3 = j;
                hk8Var.m13317p(new gp9() { // from class: hja
                    @Override // p000.gp9
                    /* JADX INFO: renamed from: n */
                    public final Object mo395n() {
                        n16 n16Var2 = this.f42503a;
                        hk8 hk8Var3 = (hk8) n16Var2.f52175c;
                        hk8Var3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String strConcat3 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(hk8.m13311q(iterable2));
                            SQLiteDatabase sQLiteDatabaseM13313a = hk8Var3.m13313a();
                            sQLiteDatabaseM13313a.beginTransaction();
                            try {
                                sQLiteDatabaseM13313a.compileStatement(strConcat3).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseM13313a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        hk8Var3.m13316n(cursorRawQuery.getInt(0), LogEventDropped$Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseM13313a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseM13313a.setTransactionSuccessful();
                                sQLiteDatabaseM13313a.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseM13313a.endTransaction();
                                throw th2;
                            }
                        }
                        hk8Var3.m13314c(new dk8(((a41) n16Var2.f52179g).mo100g() + j3, q50Var));
                        return null;
                    }
                });
                ((C3309ls) this.f52176d).m16493M(q50Var, i + 1, true);
                return;
            }
            n16Var = this;
            q50Var2 = q50Var;
            jMax = j;
            hk8Var.m13317p(new r41(11, n16Var, iterable));
            if (backendResponse$Status2 == BackendResponse$Status.OK) {
                jMax = Math.max(jMax, s20Var.f60172b);
                if (bArr != null) {
                    hk8Var.m13317p(new C3487q7(n16Var, 22));
                }
            } else if (backendResponse$Status2 == BackendResponse$Status.INVALID_PAYLOAD) {
                HashMap map2 = new HashMap();
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    String str8 = ((a50) it4.next()).f249c.f49001a;
                    if (map2.containsKey(str8)) {
                        map2.put(str8, Integer.valueOf(((Integer) map2.get(str8)).intValue() + 1));
                    } else {
                        map2.put(str8, 1);
                    }
                }
                hk8Var.m13317p(new r41(12, n16Var, map2));
            }
            bArr2 = bArr;
            ebaVar2 = ebaVar;
        }
        hk8Var.m13317p(new tg1(n16Var, q50Var2, jMax));
    }

    public n16(Context context, fy5 fy5Var, hk8 hk8Var, C3309ls c3309ls, Executor executor, hk8 hk8Var2, a41 a41Var, a41 a41Var2, hk8 hk8Var3) {
        this.f52173a = context;
        this.f52174b = fy5Var;
        this.f52175c = hk8Var;
        this.f52176d = c3309ls;
        this.f52177e = executor;
        this.f52178f = hk8Var2;
        this.f52179g = a41Var;
        this.f52180h = a41Var2;
        this.f52181i = hk8Var3;
    }

    public n16(Context context) {
        this.f52174b = null;
        this.f52175c = null;
        this.f52176d = null;
        this.f52177e = null;
        this.f52178f = null;
        this.f52179g = null;
        this.f52180h = null;
        this.f52181i = null;
        this.f52173a = context;
    }
}
