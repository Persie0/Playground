package p000;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmf implements dlz {

    /* JADX INFO: renamed from: a */
    public final apt f12013a;

    /* JADX INFO: renamed from: b */
    public final apo f12014b;

    /* JADX INFO: renamed from: c */
    public final aqa f12015c;

    /* JADX INFO: renamed from: d */
    private final apn f12016d;

    /* JADX INFO: renamed from: e */
    private final aqa f12017e;

    public dmf(apt aptVar) {
        this.f12013a = aptVar;
        this.f12014b = new dma(aptVar);
        new dmb(aptVar);
        this.f12016d = new dmc(aptVar);
        this.f12015c = new dmd(aptVar);
        this.f12017e = new dme(aptVar);
    }

    @Override // p000.dlz
    /* JADX INFO: renamed from: a */
    public final int mo6382a(long j, long j2) {
        this.f12013a.m1824l();
        arf arfVarM1853e = this.f12017e.m1853e();
        arfVarM1853e.mo1845e(1, j2);
        arfVarM1853e.mo1845e(2, j);
        this.f12013a.m1825m();
        try {
            int iM1883a = arfVarM1853e.m1883a();
            this.f12013a.m1829q();
            return iM1883a;
        } finally {
            this.f12013a.m1827o();
            this.f12017e.m1855g(arfVarM1853e);
        }
    }

    @Override // p000.dlz
    /* JADX INFO: renamed from: b */
    public final dmh mo6383b(long j) {
        dmh dmhVar;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM shots WHERE shot_id = ?", 1);
        apyVarM1841a.mo1845e(1, j);
        this.f12013a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f12013a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "shot_id");
            int iM379o2 = aeq.m379o(cursorM409e, "title");
            int iM379o3 = aeq.m379o(cursorM409e, "start_millis");
            int iM379o4 = aeq.m379o(cursorM409e, "persisted_millis");
            int iM379o5 = aeq.m379o(cursorM409e, "canceled_millis");
            int iM379o6 = aeq.m379o(cursorM409e, "deleted_millis");
            int iM379o7 = aeq.m379o(cursorM409e, "most_recent_event_millis");
            int iM379o8 = aeq.m379o(cursorM409e, "capture_session_type");
            int iM379o9 = aeq.m379o(cursorM409e, "capture_session_shot_id");
            int iM379o10 = aeq.m379o(cursorM409e, "pid");
            int iM379o11 = aeq.m379o(cursorM409e, "stuck");
            int iM379o12 = aeq.m379o(cursorM409e, "failed");
            if (cursorM409e.moveToFirst()) {
                dmhVar = new dmh();
                dmhVar.f12019a = cursorM409e.getLong(iM379o);
                if (cursorM409e.isNull(iM379o2)) {
                    dmhVar.f12020b = null;
                } else {
                    dmhVar.f12020b = cursorM409e.getString(iM379o2);
                }
                dmhVar.f12021c = cursorM409e.getLong(iM379o3);
                dmhVar.f12022d = cursorM409e.getLong(iM379o4);
                dmhVar.f12023e = cursorM409e.getLong(iM379o5);
                dmhVar.f12024f = cursorM409e.getLong(iM379o6);
                dmhVar.f12025g = cursorM409e.getLong(iM379o7);
                if (cursorM409e.isNull(iM379o8)) {
                    dmhVar.f12026h = null;
                } else {
                    dmhVar.f12026h = cursorM409e.getString(iM379o8);
                }
                if (cursorM409e.isNull(iM379o9)) {
                    dmhVar.f12027i = null;
                } else {
                    dmhVar.f12027i = cursorM409e.getString(iM379o9);
                }
                dmhVar.f12028j = cursorM409e.getLong(iM379o10);
                dmhVar.f12029k = cursorM409e.getInt(iM379o11) != 0;
                dmhVar.f12030l = cursorM409e.getInt(iM379o12) != 0;
            } else {
                dmhVar = null;
            }
            return dmhVar;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }

    @Override // p000.dlz
    /* JADX INFO: renamed from: c */
    public final void mo6384c(dmh dmhVar) {
        this.f12013a.m1824l();
        this.f12013a.m1825m();
        try {
            this.f12016d.m1804a(dmhVar);
            this.f12013a.m1829q();
        } finally {
            this.f12013a.m1827o();
        }
    }
}
