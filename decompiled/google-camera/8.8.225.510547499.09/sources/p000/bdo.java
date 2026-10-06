package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdo implements bdl {

    /* JADX INFO: renamed from: a */
    public final apt f2998a;

    /* JADX INFO: renamed from: b */
    public final apo f2999b;

    public bdo(apt aptVar) {
        this.f2998a = aptVar;
        this.f2999b = new bdm(aptVar);
        new bdn(aptVar);
    }

    @Override // p000.bdl
    /* JADX INFO: renamed from: a */
    public final List mo2245a(String str) {
        apy apyVarM1841a = apy.m1841a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        apyVarM1841a.mo1847g(1, str);
        this.f2998a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2998a, apyVarM1841a, false);
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
