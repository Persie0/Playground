package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmm implements dmi {

    /* JADX INFO: renamed from: a */
    public final apt f12031a;

    /* JADX INFO: renamed from: b */
    private final apo f12032b;

    public dmm(apt aptVar) {
        this.f12031a = aptVar;
        this.f12032b = new dmj(aptVar);
        new dmk(aptVar);
        new dml(aptVar);
    }

    @Override // p000.dmi
    /* JADX INFO: renamed from: a */
    public final List mo6397a(long j) {
        apy apyVarM1841a = apy.m1841a("SELECT * FROM shot_log WHERE shot_id = ? ORDER BY sequence", 1);
        apyVarM1841a.mo1845e(1, j);
        this.f12031a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f12031a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "sequence");
            int iM379o2 = aeq.m379o(cursorM409e, "shot_id");
            int iM379o3 = aeq.m379o(cursorM409e, "time_millis");
            int iM379o4 = aeq.m379o(cursorM409e, "message");
            ArrayList arrayList = new ArrayList(cursorM409e.getCount());
            while (cursorM409e.moveToNext()) {
                dmn dmnVar = new dmn();
                dmnVar.f12033a = cursorM409e.getInt(iM379o);
                dmnVar.f12034b = cursorM409e.getLong(iM379o2);
                dmnVar.f12035c = cursorM409e.getLong(iM379o3);
                if (cursorM409e.isNull(iM379o4)) {
                    dmnVar.f12036d = null;
                } else {
                    dmnVar.f12036d = cursorM409e.getString(iM379o4);
                }
                arrayList.add(dmnVar);
            }
            return arrayList;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }

    @Override // p000.dmi
    /* JADX INFO: renamed from: b */
    public final void mo6398b(dmn dmnVar) {
        this.f12031a.m1824l();
        this.f12031a.m1825m();
        try {
            this.f12032b.m1806a(dmnVar);
            this.f12031a.m1829q();
        } finally {
            this.f12031a.m1827o();
        }
    }
}
