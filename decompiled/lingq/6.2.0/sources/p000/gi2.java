package p000;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ScaledDurationField;

/* JADX INFO: loaded from: classes.dex */
public final class gi2 extends q32 {

    /* JADX INFO: renamed from: c */
    public final int f40846c;

    /* JADX INFO: renamed from: d */
    public final ScaledDurationField f40847d;

    /* JADX INFO: renamed from: e */
    public final en2 f40848e;

    /* JADX INFO: renamed from: f */
    public final int f40849f;

    /* JADX INFO: renamed from: g */
    public final int f40850g;

    /* JADX WARN: Illegal instructions before constructor call */
    public gi2(f12 f12Var) {
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.f54818c;
        en2 en2VarMo3736q = f12Var.mo3736q();
        super(f12Var, dateTimeFieldType);
        en2 en2VarMo4682i = f12Var.mo4682i();
        if (en2VarMo4682i == null) {
            this.f40847d = null;
        } else {
            this.f40847d = new ScaledDurationField(en2VarMo4682i, dateTimeFieldType.mo18334a());
        }
        this.f40848e = en2VarMo3736q;
        this.f40846c = 100;
        int iMo4683o = f12Var.mo4683o();
        int i = iMo4683o >= 0 ? iMo4683o / 100 : ((iMo4683o + 1) / 100) - 1;
        int iMo3735l = f12Var.mo3735l();
        int i2 = iMo3735l >= 0 ? iMo3735l / 100 : ((iMo3735l + 1) / 100) - 1;
        this.f40849f = i;
        this.f40850g = i2;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        int i2;
        xwc.m24769h0(this, i, this.f40849f, this.f40850g);
        f12 f12Var = this.f57184b;
        int iMo3734b = f12Var.mo3734b(j);
        int i3 = this.f40846c;
        if (iMo3734b >= 0) {
            i2 = iMo3734b % i3;
        } else {
            i2 = ((iMo3734b + 1) % i3) + (i3 - 1);
        }
        return f12Var.mo3733B((i * i3) + i2, j);
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: a */
    public final long mo11031a(int i, long j) {
        return this.f57184b.mo11031a(i * this.f40846c, j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        int iMo3734b = this.f57184b.mo3734b(j);
        int i = this.f40846c;
        return iMo3734b >= 0 ? iMo3734b / i : ((iMo3734b + 1) / i) - 1;
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.f40847d;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f40850g;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public final int mo4683o() {
        return this.f40849f;
    }

    @Override // p000.q32, p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        en2 en2Var = this.f40848e;
        return en2Var != null ? en2Var : super.mo3736q();
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public final long mo4685v(long j) {
        return mo3733B(mo3734b(this.f57184b.mo4685v(j)), j);
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public final long mo4687x(long j) {
        int iMo3734b = mo3734b(j) * this.f40846c;
        f12 f12Var = this.f57184b;
        return f12Var.mo4687x(f12Var.mo3733B(iMo3734b, j));
    }
}
