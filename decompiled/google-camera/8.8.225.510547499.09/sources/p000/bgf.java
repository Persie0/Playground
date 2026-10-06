package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgf extends bgc {

    /* JADX INFO: renamed from: b */
    public int f3155b;

    /* JADX INFO: renamed from: c */
    public String f3156c;

    /* JADX INFO: renamed from: d */
    public String f3157d;

    public bgf() {
        this.f3155b = 2048;
        this.f3156c = "\n";
        this.f3157d = "  ";
    }

    @Override // p000.bgc
    /* JADX INFO: renamed from: a */
    protected final int mo2375a() {
        return 4976;
    }

    /* JADX INFO: renamed from: b */
    public final String m2406b() {
        if (m2407c()) {
            return "UTF-16BE";
        }
        return m2408d() ? "UTF-16LE" : pIeXJQLZLfgIN.WHgvngad;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2407c() {
        return (this.f3154a & 3) == 2;
    }

    public final Object clone() {
        try {
            bgf bgfVar = new bgf(this.f3154a);
            bgfVar.f3157d = this.f3157d;
            bgfVar.f3156c = this.f3156c;
            bgfVar.f3155b = this.f3155b;
            return bgfVar;
        } catch (bfc e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2408d() {
        return (this.f3154a & 3) == 3;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2409i() {
        return m2384h(512);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2410j() {
        return m2384h(256);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2411k() {
        return m2384h(16);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2412l() {
        return m2384h(32);
    }

    public bgf(int i) {
        super(i);
        this.f3155b = 2048;
        this.f3156c = "\n";
        this.f3157d = "  ";
    }
}
