package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbx implements bbv {

    /* JADX INFO: renamed from: a */
    public final apt f2929a;

    /* JADX INFO: renamed from: b */
    public final apo f2930b;

    public bbx(apt aptVar) {
        this.f2929a = aptVar;
        this.f2930b = new bbw(aptVar);
    }

    @Override // p000.bbv
    /* JADX INFO: renamed from: a */
    public final List mo2190a(String str) {
        apy apyVarM1841a = apy.m1841a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            apyVarM1841a.mo1847g(1, str);
        }
        this.f2929a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2929a, apyVarM1841a, false);
        try {
            ArrayList arrayList = new ArrayList(cursorM409e.getCount());
            while (cursorM409e.moveToNext()) {
                arrayList.add(cursorM409e.isNull(0) ? null : cursorM409e.getString(0));
            }
            return arrayList;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }
}
