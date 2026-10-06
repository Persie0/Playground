package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jip extends jdz implements jed {

    /* JADX INFO: renamed from: a */
    private static final jeu f34133a;

    /* JADX INFO: renamed from: b */
    private static final ihk f34134b;

    static {
        jio jioVar = new jio();
        f34133a = jioVar;
        f34134b = new ihk("ClientTelemetry.API", jioVar, (byte[]) null);
    }

    public jip(Context context, jii jiiVar) {
        super(context, f34134b, jiiVar, jdy.f33817a, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m13227a(jih jihVar) {
        jgg jggVarM13132a = jgh.m13132a();
        jggVarM13132a.f33957b = new jcw[]{jct.f33751a};
        jggVarM13132a.m13131b();
        jggVarM13132a.f33956a = new jin(jihVar, 0);
        m12964j(jggVarM13132a.m13130a());
    }
}
