package p000;

import android.database.Cursor;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3081a = 0;

    static {
        ayc.m2100b("DiagnosticsWrkr");
    }

    /* JADX INFO: renamed from: a */
    public static final void m2289a(bcl bclVar, bdl bdlVar, bce bceVar, List list) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcv bcvVar = (bcv) it.next();
            bcd bcdVarM2124b = azo.m2124b(bceVar, bbu.m2189b(bcvVar));
            Integer numValueOf = bcdVarM2124b != null ? Integer.valueOf(bcdVarM2124b.f2941c) : null;
            String str = bcvVar.f2964a;
            apy apyVarM1841a = apy.m1841a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            apyVarM1841a.mo1847g(1, str);
            bcn bcnVar = (bcn) bclVar;
            bcnVar.f2950a.m1824l();
            Cursor cursorM409e = aey.m409e(bcnVar.f2950a, apyVarM1841a, false);
            try {
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    arrayList.add(cursorM409e.isNull(0) ? null : cursorM409e.getString(0));
                }
                cursorM409e.close();
                apyVarM1841a.m1850j();
                String strM18680T = omn.m18680T(arrayList, KMNlNMe.lsaZYJWkMoUaKE, null, null, null, 62);
                String strM18680T2 = omn.m18680T(bdlVar.mo2245a(bcvVar.f2964a), ",", null, null, null, 62);
                StringBuilder sb = new StringBuilder();
                sb.append('\n');
                sb.append(bcvVar.f2964a);
                sb.append("\t ");
                sb.append(bcvVar.f2965b);
                sb.append("\t ");
                sb.append(numValueOf);
                sb.append("\t ");
                int i = bcvVar.f2981r;
                String strM7378e = C0158ej.m7378e(i);
                if (i == 0) {
                    throw null;
                }
                sb.append(strM7378e);
                sb.append("\t ");
                sb.append(strM18680T);
                sb.append("\t ");
                sb.append(strM18680T2);
                sb.append('\t');
            } catch (Throwable th) {
                cursorM409e.close();
                apyVarM1841a.m1850j();
                throw th;
            }
        }
    }
}
