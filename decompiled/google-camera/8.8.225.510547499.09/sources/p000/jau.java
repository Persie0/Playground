package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jau extends izs {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f33624a;

    /* JADX INFO: renamed from: c */
    public long f33625c;

    /* JADX INFO: renamed from: d */
    public final gmc f33626d;

    /* JADX INFO: renamed from: e */
    private long f33627e;

    protected jau(izv izvVar) {
        super(izvVar);
        this.f33627e = -1L;
        this.f33626d = new gmc(this, ((Long) jam.f33576A.m11334D()).longValue());
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        this.f33624a = m11924d().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* JADX INFO: renamed from: b */
    public final long m12807b() {
        izo.m11916a();
        m11946z();
        long j = this.f33627e;
        if (j != -1) {
            return j;
        }
        long j2 = this.f33624a.getLong("last_dispatch", 0L);
        this.f33627e = j2;
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public final void m12808c() {
        izo.m11916a();
        m11946z();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f33624a.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.f33627e = jCurrentTimeMillis;
    }
}
