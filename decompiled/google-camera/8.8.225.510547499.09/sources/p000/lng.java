package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lng {

    /* JADX INFO: renamed from: a */
    public float f38744a;

    /* JADX INFO: renamed from: b */
    public byte f38745b;

    /* JADX INFO: renamed from: c */
    public int f38746c;

    /* JADX INFO: renamed from: a */
    public final lnh m15765a() {
        int i;
        if (this.f38745b == 1 && (i = this.f38746c) != 0) {
            lnh lnhVar = new lnh(i, this.f38744a);
            float f = lnhVar.f38747a;
            lku.m15614I(f >= 0.0f && f <= 1.0f, "Probability shall be between 0 and 1.");
            return lnhVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38746c == 0) {
            sb.append(" enablement");
        }
        if (this.f38745b == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15766b(boolean z) {
        this.f38746c = true != z ? 2 : 3;
    }
}
