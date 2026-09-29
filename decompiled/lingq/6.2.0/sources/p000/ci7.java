package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public abstract class ci7 extends w80 {

    /* JADX INFO: renamed from: b */
    public final long f10115b;

    /* JADX INFO: renamed from: c */
    public final en2 f10116c;

    public ci7(DateTimeFieldType dateTimeFieldType, en2 en2Var) {
        super(dateTimeFieldType);
        if (!en2Var.mo11272e()) {
            C3386nv.m17626m("Unit duration field must be precise");
            throw null;
        }
        long jMo11271d = en2Var.mo11271d();
        this.f10115b = jMo11271d;
        if (jMo11271d >= 1) {
            this.f10116c = en2Var;
        } else {
            C3386nv.m17626m("The unit milliseconds must be at least 1");
            throw null;
        }
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: B */
    public long mo3733B(int i, long j) {
        xwc.m24769h0(this, i, mo4683o(), mo11489n(j, i));
        return (((long) (i - mo3734b(j))) * this.f10115b) + j;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: i */
    public final en2 mo4682i() {
        return this.f10116c;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: o */
    public int mo4683o() {
        return 0;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: t */
    public final boolean mo4684t() {
        return false;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: v */
    public long mo4685v(long j) {
        long j2 = this.f10115b;
        return j >= 0 ? j % j2 : (((j + 1) % j2) + j2) - 1;
    }

    @Override // p000.w80, p000.f12
    /* JADX INFO: renamed from: w */
    public long mo4686w(long j) {
        long j2 = this.f10115b;
        if (j <= 0) {
            return j - (j % j2);
        }
        long j3 = j - 1;
        return (j3 - (j3 % j2)) + j2;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: x */
    public long mo4687x(long j) {
        long j2 = this.f10115b;
        if (j >= 0) {
            return j - (j % j2);
        }
        long j3 = j + 1;
        return (j3 - (j3 % j2)) - j2;
    }
}
