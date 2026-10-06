package p000;

import android.database.Cursor;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bec implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ azp f3025a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3026b;

    /* JADX INFO: renamed from: c */
    public final bev f3027c = bev.m2275g();

    public bec(azp azpVar, String str) {
        this.f3025a = azpVar;
        this.f3026b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bcw bcwVarMo1700B = this.f3025a.f2782d.mo1700B();
            String str = this.f3026b;
            apy apyVarM1841a = apy.m1841a("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            apyVarM1841a.mo1847g(1, str);
            ((bdk) bcwVarMo1700B).f2987a.m1824l();
            ((bdk) bcwVarMo1700B).f2987a.m1825m();
            try {
                Cursor cursorM409e = aey.m409e(((bdk) bcwVarMo1700B).f2987a, apyVarM1841a, true);
                try {
                    C1109wy c1109wy = new C1109wy();
                    C1109wy c1109wy2 = new C1109wy();
                    while (cursorM409e.moveToNext()) {
                        String string = cursorM409e.getString(0);
                        if (((ArrayList) c1109wy.get(string)) == null) {
                            c1109wy.put(string, new ArrayList());
                        }
                        String string2 = cursorM409e.getString(0);
                        if (((ArrayList) c1109wy2.get(string2)) == null) {
                            c1109wy2.put(string2, new ArrayList());
                        }
                    }
                    cursorM409e.moveToPosition(-1);
                    ((bdk) bcwVarMo1700B).m2244m(c1109wy);
                    ((bdk) bcwVarMo1700B).m2243l(c1109wy2);
                    ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                    while (cursorM409e.moveToNext()) {
                        byte[] blob = null;
                        String string3 = cursorM409e.isNull(0) ? null : cursorM409e.getString(0);
                        int iM7728s = C0166er.m7728s(cursorM409e.getInt(1));
                        if (!cursorM409e.isNull(2)) {
                            blob = cursorM409e.getBlob(2);
                        }
                        axt axtVarM2090a = axt.m2090a(blob);
                        int i = cursorM409e.getInt(3);
                        int i2 = cursorM409e.getInt(4);
                        ArrayList arrayList2 = (ArrayList) c1109wy.get(cursorM409e.getString(0));
                        ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                        ArrayList arrayList4 = (ArrayList) c1109wy2.get(cursorM409e.getString(0));
                        arrayList.add(new bcu(string3, iM7728s, axtVarM2090a, i, i2, arrayList3, arrayList4 == null ? new ArrayList() : arrayList4));
                    }
                    ((bdk) bcwVarMo1700B).f2987a.m1829q();
                    cursorM409e.close();
                    apyVarM1841a.m1850j();
                    ((bdk) bcwVarMo1700B).f2987a.m1827o();
                    this.f3027c.m2285h(bcv.m2227b(arrayList));
                } catch (Throwable th) {
                    cursorM409e.close();
                    apyVarM1841a.m1850j();
                    throw th;
                }
            } catch (Throwable th2) {
                ((bdk) bcwVarMo1700B).f2987a.m1827o();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f3027c.m2283e(th3);
        }
    }

    public bec() {
    }
}
