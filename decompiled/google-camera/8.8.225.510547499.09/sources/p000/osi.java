package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class osi extends oqo {
    /* JADX INFO: renamed from: c */
    protected final String m19018c() {
        osi osiVarMo19019g;
        oqo oqoVar = ord.f46446a;
        osi osiVar = oxs.f46794a;
        if (this == osiVar) {
            return "Dispatchers.Main";
        }
        try {
            osiVarMo19019g = osiVar.mo19019g();
        } catch (UnsupportedOperationException e) {
            osiVarMo19019g = null;
        }
        if (this == osiVarMo19019g) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract osi mo19019g();

    @Override // p000.oqo
    public String toString() {
        String strM19018c = m19018c();
        if (strM19018c != null) {
            return strM19018c;
        }
        return oqv.m18920a(this) + "@" + oqv.m18921b(this);
    }
}
