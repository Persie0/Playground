package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class xo2 implements bm0 {

    /* JADX INFO: renamed from: e */
    public static final long[] f68424e = new long[0];

    /* JADX INFO: renamed from: a */
    public long f68425a;

    /* JADX INFO: renamed from: b */
    public Object f68426b;

    /* JADX INFO: renamed from: c */
    public Object f68427c;

    /* JADX INFO: renamed from: d */
    public final Object f68428d;

    public xo2(SerialDescriptor serialDescriptor, zi3 zi3Var) {
        serialDescriptor.getClass();
        this.f68426b = serialDescriptor;
        this.f68427c = zi3Var;
        int iMo3697e = serialDescriptor.mo3697e();
        if (iMo3697e <= 64) {
            this.f68425a = iMo3697e != 64 ? (-1) << iMo3697e : 0L;
            this.f68428d = f68424e;
            return;
        }
        this.f68425a = 0L;
        int i = (iMo3697e - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo3697e & 63) != 0) {
            jArr[i - 1] = (-1) << iMo3697e;
        }
        this.f68428d = jArr;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0100 A[PHI: r6 r16 r17
      0x0100: PHI (r6v3 android.database.Cursor) = (r6v4 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r16v3 ohc) = (r16v5 ohc), (r16v9 ohc) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public ohc m24623a(String str, ohc ohcVar) throws Throwable {
        Cursor cursor;
        ohc ohcVar2;
        long j;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strM18026x = ohcVar.m18026x();
        List listM18023u = ohcVar.m18023u();
        mhb mhbVar = (mhb) this.f68428d;
        C1045d c1045d = mhbVar.f55716b;
        C1045d c1045d2 = mhbVar.f55716b;
        kjc kjcVar = (kjc) mhbVar.f60774a;
        c1045d.m5926j0();
        fic ficVarM10224N = dad.m10224N("_eid", ohcVar);
        Long l = (Long) (ficVarM10224N == null ? null : dad.m10230V(ficVarM10224N));
        if (l != null) {
            if (strM18026x.equals("_ep")) {
                c1045d.m5926j0();
                fic ficVarM10224N2 = dad.m10224N("_en", ohcVar);
                String str2 = (String) (ficVarM10224N2 == null ? null : dad.m10230V(ficVarM10224N2));
                if (TextUtils.isEmpty(str2)) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68081g.m17924b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((ohc) this.f68426b) == null || ((Long) this.f68427c) == null || l.longValue() != ((Long) this.f68427c).longValue()) {
                    nnb nnbVar = c1045d.f12360c;
                    C1045d.m5885T(nnbVar);
                    kjc kjcVar2 = (kjc) nnbVar.f60774a;
                    nnbVar.mo12359D();
                    nnbVar.m13144E();
                    try {
                        cursorRawQuery = nnbVar.m17559u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    ohcVar2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((ohc) ((khc) dad.m10238o0(ohc.m18002I(), cursorRawQuery.getBlob(0))).m22741d(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            xcc xccVar2 = kjcVar2.f47438f;
                                            kjc.m15280l(xccVar2);
                                            xccVar2.f68080f.m17924b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = ohcVar2;
                                        }
                                    } catch (IOException e2) {
                                        xcc xccVar3 = kjcVar2.f47438f;
                                        kjc.m15280l(xccVar3);
                                        j = 0;
                                        try {
                                            xccVar3.f68080f.m17926d("Failed to merge main event. appId, eventId", xcc.m24449L(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            xcc xccVar4 = kjcVar2.f47438f;
                                            kjc.m15280l(xccVar4);
                                            xccVar4.f68080f.m17924b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = ohcVar2;
                                            if (pair != 0) {
                                            }
                                            xcc xccVar5 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar5);
                                            xccVar5.f68081g.m17925c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                            return ohcVar2;
                                        }
                                        cursorRawQuery.close();
                                        pair = ohcVar2;
                                    }
                                } else {
                                    xcc xccVar6 = kjcVar2.f47438f;
                                    kjc.m15280l(xccVar6);
                                    xccVar6.f68076I.m17923a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    ohcVar2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                ohcVar2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        ohcVar2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        xcc xccVar7 = kjcVar.f47438f;
                        kjc.m15280l(xccVar7);
                        xccVar7.f68081g.m17925c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return ohcVar2;
                    }
                    this.f68426b = (ohc) obj;
                    this.f68425a = ((Long) pair.second).longValue();
                    c1045d2.m5926j0();
                    this.f68427c = (Long) dad.m10226P("_eid", (ohc) this.f68426b);
                } else {
                    j = 0;
                }
                long j2 = this.f68425a - 1;
                this.f68425a = j2;
                if (j2 <= j) {
                    nnb nnbVar2 = c1045d2.f12360c;
                    C1045d.m5885T(nnbVar2);
                    kjc kjcVar3 = (kjc) nnbVar2.f60774a;
                    nnbVar2.mo12359D();
                    xcc xccVar8 = kjcVar3.f47438f;
                    kjc.m15280l(xccVar8);
                    xccVar8.f68076I.m17924b(str, "Clearing complex main event info. appId");
                    try {
                        nnbVar2.m17559u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        xcc xccVar9 = kjcVar3.f47438f;
                        kjc.m15280l(xccVar9);
                        xccVar9.f68080f.m17924b(e6, "Error clearing complex main event");
                    }
                } else {
                    nnb nnbVar3 = c1045d2.f12360c;
                    C1045d.m5885T(nnbVar3);
                    nnbVar3.m17536V(str, l, this.f68425a, (ohc) this.f68426b);
                }
                ArrayList arrayList = new ArrayList();
                for (fic ficVar : ((ohc) this.f68426b).m18023u()) {
                    c1045d2.m5926j0();
                    if (dad.m10224N(ficVar.m11877t(), ohcVar) == null) {
                        arrayList.add(ficVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    xcc xccVar10 = kjcVar.f47438f;
                    kjc.m15280l(xccVar10);
                    xccVar10.f68081g.m17924b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listM18023u);
                    listM18023u = arrayList;
                }
                strM18026x = str2;
            } else {
                this.f68427c = l;
                this.f68426b = ohcVar;
                c1045d.m5926j0();
                fic ficVarM10224N3 = dad.m10224N("_epc", ohcVar);
                Serializable serializableM10230V = ficVarM10224N3 == null ? null : dad.m10230V(ficVarM10224N3);
                long jLongValue = ((Long) (serializableM10230V != null ? serializableM10230V : 0L)).longValue();
                this.f68425a = jLongValue;
                if (jLongValue <= 0) {
                    xcc xccVar11 = kjcVar.f47438f;
                    kjc.m15280l(xccVar11);
                    xccVar11.f68081g.m17924b(strM18026x, "Complex event with zero extra param count. eventName");
                } else {
                    nnb nnbVar4 = c1045d.f12360c;
                    C1045d.m5885T(nnbVar4);
                    nnbVar4.m17536V(str, l, this.f68425a, ohcVar);
                }
            }
        }
        khc khcVar = (khc) ohcVar.m23966j();
        khcVar.m15251o(strM18026x);
        khcVar.m22739b();
        ((ohc) khcVar.f63950b).m18014M();
        khcVar.m22739b();
        ((ohc) khcVar.f63950b).m18013L(listM18023u);
        return (ohc) khcVar.m22741d();
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: g */
    public void mo3851g(vl0 vl0Var, j88 j88Var) {
        FirebasePerfOkHttpClient.m6732a(j88Var, (lk6) this.f68427c, this.f68425a, ((Timer) this.f68428d).m6742a());
        ((bm0) this.f68426b).mo3851g(vl0Var, j88Var);
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: j */
    public void mo3854j(vl0 vl0Var, IOException iOException) {
        lk6 lk6Var = (lk6) this.f68427c;
        co7 co7Var = ((i18) vl0Var).f43343b;
        if (co7Var != null) {
            ex3 ex3Var = (ex3) co7Var.f10360c;
            if (ex3Var != null) {
                lk6Var.m16324j(ex3Var.m11384j().toString());
            }
            String str = (String) co7Var.f10359b;
            if (str != null) {
                lk6Var.m16317c(str);
            }
        }
        lk6Var.m16320f(this.f68425a);
        wq1.m24129y((Timer) this.f68428d, lk6Var, lk6Var);
        ((bm0) this.f68426b).mo3854j(vl0Var, iOException);
    }

    public /* synthetic */ xo2(mhb mhbVar) {
        this.f68428d = mhbVar;
    }

    public xo2(bm0 bm0Var, mba mbaVar, Timer timer, long j) {
        this.f68426b = bm0Var;
        this.f68427c = new lk6(mbaVar);
        this.f68425a = j;
        this.f68428d = timer;
    }
}
