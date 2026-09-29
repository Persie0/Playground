package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public class bi7 extends ci7 {

    /* JADX INFO: renamed from: d */
    public final int f8565d;

    /* JADX INFO: renamed from: e */
    public final en2 f8566e;

    public bi7(DateTimeFieldType dateTimeFieldType, en2 en2Var, en2 en2Var2) {
        super(dateTimeFieldType, en2Var);
        if (!en2Var2.mo11272e()) {
            C3386nv.m17626m("Range duration field must be precise");
            throw null;
        }
        int iMo11271d = (int) (en2Var2.mo11271d() / this.f10115b);
        this.f8565d = iMo11271d;
        if (iMo11271d >= 2) {
            this.f8566e = en2Var2;
        } else {
            C3386nv.m17626m("The effective range must be at least 2");
            throw null;
        }
    }

    @Override // p000.ci7, p000.f12
    /* JADX INFO: renamed from: B */
    public final long mo3733B(int i, long j) {
        xwc.m24769h0(this, i, 0, this.f8565d - 1);
        return (((long) (i - mo3734b(j))) * this.f10115b) + j;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: b */
    public final int mo3734b(long j) {
        int i = this.f8565d;
        long j2 = this.f10115b;
        return j >= 0 ? (int) ((j / j2) % ((long) i)) : (i - 1) + ((int) (((j + 1) / j2) % ((long) i)));
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: l */
    public final int mo3735l() {
        return this.f8565d - 1;
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: q */
    public final en2 mo3736q() {
        return this.f8566e;
    }
}
