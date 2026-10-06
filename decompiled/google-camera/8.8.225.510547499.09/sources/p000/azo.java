package p000;

import android.content.Context;
import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azo {
    /* JADX INFO: renamed from: a */
    static boolean m2123a(Context context) {
        return context.isDeviceProtectedStorage();
    }

    /* JADX INFO: renamed from: b */
    public static bcd m2124b(bce bceVar, bcj bcjVar) {
        String str = bcjVar.f2946a;
        int i = bcjVar.f2947b;
        apy apyVarM1841a = apy.m1841a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        apyVarM1841a.mo1847g(1, str);
        apyVarM1841a.mo1845e(2, i);
        bci bciVar = (bci) bceVar;
        bciVar.f2942a.m1824l();
        Cursor cursorM409e = aey.m409e(bciVar.f2942a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "work_spec_id");
            int iM379o2 = aeq.m379o(cursorM409e, "generation");
            int iM379o3 = aeq.m379o(cursorM409e, "system_id");
            bcd bcdVar = null;
            String string = null;
            if (cursorM409e.moveToFirst()) {
                if (!cursorM409e.isNull(iM379o)) {
                    string = cursorM409e.getString(iM379o);
                }
                bcdVar = new bcd(string, cursorM409e.getInt(iM379o2), cursorM409e.getInt(iM379o3));
            }
            return bcdVar;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }
}
