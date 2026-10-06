package p000;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bdr extends bds {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ azp f3003a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3004b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f3005c;

    public bdr(azp azpVar, String str, boolean z) {
        this.f3003a = azpVar;
        this.f3004b = str;
        this.f3005c = z;
    }

    @Override // p000.bds
    /* JADX INFO: renamed from: a */
    public final void mo2247a() {
        WorkDatabase workDatabase = this.f3003a.f2782d;
        workDatabase.m1825m();
        try {
            bcw bcwVarMo1700B = workDatabase.mo1700B();
            String str = this.f3004b;
            apy apyVarM1841a = apy.m1841a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                apyVarM1841a.mo1846f(1);
            } else {
                apyVarM1841a.mo1847g(1, str);
            }
            ((bdk) bcwVarMo1700B).f2987a.m1824l();
            Cursor cursorM409e = aey.m409e(((bdk) bcwVarMo1700B).f2987a, apyVarM1841a, false);
            try {
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    arrayList.add(cursorM409e.isNull(0) ? null : cursorM409e.getString(0));
                }
                cursorM409e.close();
                apyVarM1841a.m1850j();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m2249c(this.f3003a, (String) it.next());
                }
                workDatabase.m1829q();
                workDatabase.m1827o();
                if (this.f3005c) {
                    m2250d(this.f3003a);
                }
            } catch (Throwable th) {
                cursorM409e.close();
                apyVarM1841a.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.m1827o();
            throw th2;
        }
    }
}
