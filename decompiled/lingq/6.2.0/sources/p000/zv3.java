package p000;

import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class zv3 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final ex3 f72253a;

    /* JADX INFO: renamed from: b */
    public final yc3 f72254b;

    /* JADX INFO: renamed from: c */
    public boolean f72255c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fw3 f72256d;

    public zv3(fw3 fw3Var, ex3 ex3Var) {
        ex3Var.getClass();
        this.f72256d = fw3Var;
        this.f72253a = ex3Var;
        this.f72254b = new yc3(((e18) fw3Var.f39782c.f50065c).f36574a.mo484i());
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public long mo459F(aj0 aj0Var, long j) throws IOException {
        fw3 fw3Var = this.f72256d;
        aj0Var.getClass();
        try {
            return ((e18) fw3Var.f39782c.f50065c).mo459F(aj0Var, j);
        } catch (IOException e) {
            fw3Var.f39781b.mo11847e();
            m25809a(fw3.f39779f);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25809a(qr3 qr3Var) {
        dr6 dr6Var;
        u06 u06Var;
        qr3Var.getClass();
        fw3 fw3Var = this.f72256d;
        int i = fw3Var.f39783d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            hm2.m13331a(fw3Var.f39783d, "state: ");
            return;
        }
        fw3.m12220k(fw3Var, this.f72254b);
        fw3Var.f39783d = 6;
        if (qr3Var.size() <= 0 || (dr6Var = fw3Var.f39780a) == null || (u06Var = dr6Var.f36094j) == null) {
            return;
        }
        int i2 = xw3.f68902a;
        ex3 ex3Var = this.f72253a;
        ex3Var.getClass();
        if (u06Var == u06.f63174b) {
            return;
        }
        Pattern pattern = gm1.f40991k;
        f9d.m11622c(ex3Var, qr3Var).isEmpty();
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f72254b;
    }
}
