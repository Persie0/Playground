package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czs {

    /* JADX INFO: renamed from: a */
    public static final nbh f10140a = nbh.m17259h("com/google/android/apps/camera/camcorder/topshot/selection/BestFramesSelector");

    /* JADX INFO: renamed from: c */
    public final gta f10142c;

    /* JADX INFO: renamed from: f */
    private final gtl f10145f;

    /* JADX INFO: renamed from: b */
    public final List f10141b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List f10143d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List f10144e = new ArrayList();

    /* JADX INFO: renamed from: g */
    private long f10146g = 0;

    public czs(gtl gtlVar, gta gtaVar) {
        this.f10145f = gtlVar;
        this.f10142c = gtaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5747a() {
        m5748b();
        this.f10141b.clear();
        this.f10143d.clear();
        this.f10144e.clear();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5748b() {
        dtu dtuVarMo6744a = this.f10145f.f26369a.mo6744a(this.f10146g);
        gth gthVar = null;
        while (dtuVarMo6744a.mo6746b()) {
            gth gthVarMo9758c = this.f10145f.mo9758c(((dvm) dtuVarMo6744a).f12666a);
            if (gthVarMo9758c != null && (gthVar == null || gthVar.f26340b < gthVarMo9758c.f26340b)) {
                gthVar = gthVarMo9758c;
            }
            this.f10146g = ((dvm) dtuVarMo6744a).f12666a;
        }
        if (gthVar != null) {
            this.f10141b.add(gthVar);
        }
        this.f10141b.size();
    }
}
