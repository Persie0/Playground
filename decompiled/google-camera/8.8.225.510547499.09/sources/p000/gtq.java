package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtq {

    /* JADX INFO: renamed from: a */
    private static final nbh f26380a = nbh.m17259h("com/google/android/apps/camera/qualityscore/GlobalMotionSharpnessFrameQualityScorer");

    /* JADX INFO: renamed from: b */
    private gsr f26381b;

    /* JADX INFO: renamed from: c */
    private final fkp f26382c;

    public gtq(fkp fkpVar) {
        this.f26382c = fkpVar;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized boolean m9765b(long j) {
        gsr gsrVar = this.f26381b;
        if (gsrVar != null) {
            long j2 = gsrVar.f26243c;
            if (j2 < j && j2 >= j - 99999999) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m9766a(gsr gsrVar) {
        float fExp;
        if (m9765b(gsrVar.f26243c)) {
            fExp = (float) Math.exp((this.f26382c.m8525a(this.f26381b, gsrVar) / (gsrVar.f26243c - this.f26381b.f26243c)) * (-0.05f) * gsrVar.f26244d);
        } else {
            ((nbe) ((nbe) f26380a.m17252c()).mo17276G(3241)).mo17292q("Could not find previous metadata for frame at %d", gsrVar.f26243c);
            fExp = 1.0f;
        }
        this.f26381b = gsrVar;
        return fExp;
    }
}
