package p000;

import android.content.Context;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes2.dex */
public final class ukd implements fkd {

    /* JADX INFO: renamed from: a */
    public final ds4 f64037a;

    /* JADX INFO: renamed from: b */
    public final dkd f64038b;

    public ukd(Context context, dkd dkdVar) {
        this.f64038b = dkdVar;
        al0 al0Var = al0.f793e;
        nba.m17319b(context);
        gba gbaVarM17320c = nba.m17318a().m17320c(al0Var);
        if (al0.f792d.contains(new bs2("json"))) {
            new ds4(new x1d(gbaVarM17320c, 4));
        }
        this.f64037a = new ds4(new x1d(gbaVarM17320c, 5));
    }

    @Override // p000.fkd
    /* JADX INFO: renamed from: a */
    public final void mo11928a(C3299li c3299li) {
        this.f64038b.getClass();
        ((hba) this.f64037a.get()).m13185a(c3299li.f49690a != 0 ? new j40(c3299li.m16229h(), Priority.DEFAULT, null) : new j40(c3299li.m16229h(), Priority.VERY_LOW, null), new uk9(8));
    }
}
