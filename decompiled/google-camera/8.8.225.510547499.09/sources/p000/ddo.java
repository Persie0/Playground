package p000;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddo extends ddk {

    /* JADX INFO: renamed from: a */
    public final apt f10566a;

    /* JADX INFO: renamed from: b */
    public final aqa f10567b;

    /* JADX INFO: renamed from: c */
    public final dez f10568c = new dez();

    /* JADX INFO: renamed from: d */
    private final apo f10569d;

    /* JADX INFO: renamed from: e */
    private final apo f10570e;

    public ddo(apt aptVar) {
        this.f10566a = aptVar;
        this.f10569d = new ddl(aptVar);
        this.f10570e = new ddm(aptVar);
        this.f10567b = new ddn(aptVar);
    }

    @Override // p000.ddk
    /* JADX INFO: renamed from: a */
    public final ddj mo5939a(ddp ddpVar) {
        ddj ddjVar;
        this.f10566a.m1825m();
        try {
            ddj ddjVar2 = new ddj(ddpVar);
            this.f10566a.m1824l();
            this.f10566a.m1825m();
            try {
                this.f10569d.m1808c(ddjVar2);
                this.f10566a.m1829q();
                this.f10566a.m1827o();
                apy apyVarM1841a = apy.m1841a("SELECT * FROM HardwareHelpDialogCounts WHERE reason = ?", 1);
                apyVarM1841a.mo1845e(1, ddpVar.ordinal());
                this.f10566a.m1824l();
                Cursor cursorM409e = aey.m409e(this.f10566a, apyVarM1841a, false);
                try {
                    int iM379o = aeq.m379o(cursorM409e, "reason");
                    int iM379o2 = aeq.m379o(cursorM409e, "impressionsBeforeReboot");
                    int iM379o3 = aeq.m379o(cursorM409e, "impressionsAfterReboot");
                    int iM379o4 = aeq.m379o(cursorM409e, "rebootCount");
                    if (cursorM409e.moveToFirst()) {
                        ddjVar = new ddj(ddp.values()[cursorM409e.getInt(iM379o)]);
                        ddjVar.f10563b = cursorM409e.getInt(iM379o2);
                        ddjVar.f10564c = cursorM409e.getInt(iM379o3);
                        ddjVar.f10565d = cursorM409e.getInt(iM379o4);
                    } else {
                        ddjVar = null;
                    }
                    cursorM409e.close();
                    apyVarM1841a.m1850j();
                    this.f10566a.m1829q();
                    this.f10566a.m1827o();
                    return ddjVar;
                } catch (Throwable th) {
                    cursorM409e.close();
                    apyVarM1841a.m1850j();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f10566a.m1827o();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f10566a.m1827o();
            throw th3;
        }
    }

    @Override // p000.ddk
    /* JADX INFO: renamed from: b */
    public final void mo5940b(ddj ddjVar) {
        this.f10566a.m1824l();
        this.f10566a.m1825m();
        try {
            this.f10570e.m1806a(ddjVar);
            this.f10566a.m1829q();
        } finally {
            this.f10566a.m1827o();
        }
    }
}
