package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public abstract class q32 extends w80 {

    /* JADX INFO: renamed from: b */
    public final f12 f57184b;

    public q32(f12 f12Var, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (f12Var == null) {
            C3386nv.m17626m("The field must not be null");
            throw null;
        }
        if (f12Var.mo11492u()) {
            this.f57184b = f12Var;
        } else {
            C3386nv.m17626m("The field must be supported");
            throw null;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public en2 mo4682i() {
        return this.f57184b.mo4682i();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public en2 mo3736q() {
        return this.f57184b.mo3736q();
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return this.f57184b.mo4684t();
    }
}
