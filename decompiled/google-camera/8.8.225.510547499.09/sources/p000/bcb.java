package p000;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcb implements bbz {

    /* JADX INFO: renamed from: a */
    private final apt f2937a;

    /* JADX INFO: renamed from: b */
    private final apo f2938b;

    public bcb(apt aptVar) {
        this.f2937a = aptVar;
        this.f2938b = new bca(aptVar);
    }

    @Override // p000.bbz
    /* JADX INFO: renamed from: a */
    public final Long mo2191a(String str) {
        apy apyVarM1841a = apy.m1841a("SELECT long_value FROM Preference where `key`=?", 1);
        apyVarM1841a.mo1847g(1, str);
        this.f2937a.m1824l();
        Cursor cursorM409e = aey.m409e(this.f2937a, apyVarM1841a, false);
        try {
            Long lValueOf = null;
            if (cursorM409e.moveToFirst() && !cursorM409e.isNull(0)) {
                lValueOf = Long.valueOf(cursorM409e.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM409e.close();
            apyVarM1841a.m1850j();
        }
    }

    @Override // p000.bbz
    /* JADX INFO: renamed from: b */
    public final void mo2192b(bby bbyVar) {
        this.f2937a.m1824l();
        this.f2937a.m1825m();
        try {
            this.f2938b.m1806a(bbyVar);
            this.f2937a.m1829q();
        } finally {
            this.f2937a.m1827o();
        }
    }
}
