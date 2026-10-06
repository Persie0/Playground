package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class owb {

    /* JADX INFO: renamed from: a */
    private int f46701a;

    /* JADX INFO: renamed from: d */
    public owd[] f46702d;

    /* JADX INFO: renamed from: e */
    public int f46703e;

    /* JADX INFO: renamed from: e */
    protected abstract owd mo19100e();

    /* JADX INFO: renamed from: h */
    protected abstract owd[] mo19103h();

    /* JADX INFO: renamed from: j */
    protected final void m19112j(owd owdVar) {
        int i;
        ols[] olsVarArrMo19108b;
        owdVar.getClass();
        synchronized (this) {
            int i2 = this.f46703e - 1;
            this.f46703e = i2;
            if (i2 == 0) {
                this.f46701a = 0;
            }
            olsVarArrMo19108b = owdVar.mo19108b(this);
        }
        for (ols olsVar : olsVarArrMo19108b) {
            if (olsVar != null) {
                olsVar.mo18640e(oki.f46196a);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    protected final owd m19111i() {
        owd owdVarMo19100e;
        synchronized (this) {
            owd[] owdVarArrMo19103h = this.f46702d;
            if (owdVarArrMo19103h == null) {
                owdVarArrMo19103h = mo19103h();
                this.f46702d = owdVarArrMo19103h;
            } else {
                int i = this.f46703e;
                int length = owdVarArrMo19103h.length;
                if (i >= length) {
                    Object[] objArrCopyOf = Arrays.copyOf(owdVarArrMo19103h, length + length);
                    objArrCopyOf.getClass();
                    owdVarArrMo19103h = (owd[]) objArrCopyOf;
                    this.f46702d = owdVarArrMo19103h;
                }
            }
            int i2 = this.f46701a;
            do {
                owdVarMo19100e = owdVarArrMo19103h[i2];
                if (owdVarMo19100e == null) {
                    owdVarMo19100e = mo19100e();
                    owdVarArrMo19103h[i2] = owdVarMo19100e;
                }
                i2++;
                if (i2 >= owdVarArrMo19103h.length) {
                    i2 = 0;
                }
            } while (!owdVarMo19100e.mo19107a(this));
            this.f46701a = i2;
            this.f46703e++;
        }
        return owdVarMo19100e;
    }
}
