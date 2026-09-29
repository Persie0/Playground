package cc;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2586a3;
import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2656f3;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: cc.u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1954u7 {

    /* JADX INFO: renamed from: a */
    public C2600b3 f10246a;

    /* JADX INFO: renamed from: b */
    public Long f10247b;

    /* JADX INFO: renamed from: c */
    public long f10248c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1775b f10249d;

    public /* synthetic */ C1954u7(C1775b c1775b) {
        this.f10249d = c1775b;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c8  */
    /* JADX INFO: renamed from: a */
    public final C2600b3 m5896a(C2600b3 c2600b3, String str) throws Throwable {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strM7674A = c2600b3.m7674A();
        List listM7675B = c2600b3.m7675B();
        C1775b c1775b = this.f10249d;
        c1775b.f10436b.m5644O();
        Long l10 = (Long) C1864k7.m5717m(c2600b3, "_eid");
        if (l10 != null) {
            boolean zEquals = strM7674A.equals("_ep");
            InterfaceC1781b5 interfaceC1781b5 = c1775b.f10430a;
            C1846i7 c1846i7 = c1775b.f10436b;
            if (zEquals) {
                c1846i7.m5644O();
                String str2 = (String) C1864k7.m5717m(c2600b3, "_en");
                Cursor cursor = null;
                if (TextUtils.isEmpty(str2)) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9943g.m5624b(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.f10246a == null || this.f10247b == null || l10.longValue() != this.f10247b.longValue()) {
                    C1847j c1847j = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j);
                    InterfaceC1781b5 interfaceC1781b6 = c1847j.f10430a;
                    c1847j.mo5748g();
                    c1847j.m5494h();
                    try {
                        try {
                            cursorRawQuery = c1847j.m5667A().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((C2600b3) ((C2586a3) C1864k7.m5726z(C2600b3.m7672x(), cursorRawQuery.getBlob(0))).m7897h(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b6).f10086i;
                                        C1897o4.m5776k(c1860k4);
                                        c1860k4.f9942f.m5626d("Failed to merge main event. appId, eventId", C1860k3.m5700q(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k5);
                                        c1860k5.f9943g.m5625c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                        return null;
                                    }
                                    this.f10246a = (C2600b3) obj;
                                    this.f10248c = ((Long) pairCreate.second).longValue();
                                    c1846i7.m5644O();
                                    this.f10247b = (Long) C1864k7.m5717m(this.f10246a, "_eid");
                                } else {
                                    C1860k3 c1860k6 = ((C1897o4) interfaceC1781b6).f10086i;
                                    C1897o4.m5776k(c1860k6);
                                    c1860k6.f9938I.m5623a("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                C1860k3 c1860k7 = ((C1897o4) interfaceC1781b6).f10086i;
                                C1897o4.m5776k(c1860k7);
                                c1860k7.f9942f.m5624b(e, "Error selecting main event");
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                                C1897o4.m5776k(c1860k8);
                                c1860k8.f9943g.m5625c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    C1860k3 c1860k9 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k9);
                    c1860k9.f9943g.m5625c(str2, l10, "Extra parameter without existing main event. eventName, eventId");
                    return null;
                }
                long j10 = this.f10248c - 1;
                this.f10248c = j10;
                if (j10 <= 0) {
                    C1847j c1847j2 = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j2);
                    c1847j2.mo5748g();
                    C1897o4 c1897o4 = (C1897o4) c1847j2.f10430a;
                    C1860k3 c1860k10 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k10);
                    c1860k10.f9938I.m5624b(str, "Clearing complex main event info. appId");
                    try {
                        c1847j2.m5667A().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        C1860k3 c1860k11 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k11);
                        c1860k11.f9942f.m5624b(e13, "Error clearing complex main event");
                    }
                } else {
                    C1847j c1847j3 = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j3);
                    c1847j3.m5689q(str, l10, this.f10248c, this.f10246a);
                }
                ArrayList arrayList = new ArrayList();
                for (C2656f3 c2656f3 : this.f10246a.m7675B()) {
                    c1846i7.m5644O();
                    if (C1864k7.m5716l(c2600b3, c2656f3.m7824z()) == null) {
                        arrayList.add(c2656f3);
                    }
                }
                if (arrayList.isEmpty()) {
                    C1860k3 c1860k12 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k12);
                    c1860k12.f9943g.m5624b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listM7675B);
                    listM7675B = arrayList;
                }
                strM7674A = str2;
            } else {
                this.f10247b = l10;
                this.f10246a = c2600b3;
                c1846i7.m5644O();
                Serializable serializableM5717m = C1864k7.m5717m(c2600b3, "_epc");
                long jLongValue = ((Long) (serializableM5717m != null ? serializableM5717m : 0L)).longValue();
                this.f10248c = jLongValue;
                if (jLongValue <= 0) {
                    C1860k3 c1860k13 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k13);
                    c1860k13.f9943g.m5624b(strM7674A, "Complex event with zero extra param count. eventName");
                } else {
                    C1847j c1847j4 = c1846i7.f9893c;
                    C1846i7.m5629H(c1847j4);
                    c1847j4.m5689q(str, l10, this.f10248c, c2600b3);
                }
            }
        }
        C2586a3 c2586a3 = (C2586a3) c2600b3.m8086j();
        c2586a3.m7899j();
        C2600b3.m7669H((C2600b3) c2586a3.f14271b, strM7674A);
        c2586a3.m7899j();
        C2600b3.m7667F((C2600b3) c2586a3.f14271b);
        c2586a3.m7899j();
        C2600b3.m7666E((C2600b3) c2586a3.f14271b, listM7675B);
        return (C2600b3) c2586a3.m7897h();
    }
}
