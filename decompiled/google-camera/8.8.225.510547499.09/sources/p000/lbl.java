package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lbl {

    /* JADX INFO: renamed from: a */
    public final kzh f37877a;

    /* JADX INFO: renamed from: b */
    public final lax[] f37878b;

    /* JADX INFO: renamed from: c */
    public final lay f37879c;

    /* JADX INFO: renamed from: d */
    private final int f37880d;

    protected lbl(lay layVar, kzh kzhVar, int i) {
        lku.m15670x(i >= kzhVar.m15089b() * 32, PMZiHihxLGEy.Lil);
        this.f37879c = layVar;
        this.f37877a = kzhVar;
        this.f37880d = i;
        int[] iArr = {32, i};
        this.f37878b = new lax[4];
        for (int i2 = 0; i2 < 4; i2++) {
            this.f37878b[i2] = new lax(this.f37879c, i2 * 8, iArr);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lbl mo15142b(kzi kziVar) {
        return new lbl(this.f37879c, kziVar.m15090c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl)) {
            return false;
        }
        lbl lblVar = (lbl) obj;
        lax[] laxVarArr = lblVar.f37878b;
        return this.f37880d == lblVar.f37880d && this.f37877a.equals(lblVar.f37877a) && this.f37879c.equals(lblVar.f37879c);
    }

    public final int hashCode() {
        return (((((this.f37877a.hashCode() * 31) + 4) * 31) + this.f37880d) * 31) + this.f37879c.hashCode();
    }

    public String toString() {
        return "RGBANorm8";
    }

    public lbl(lay layVar, kzh kzhVar) {
        this(layVar, kzhVar, kzhVar.m15089b() * 32);
    }
}
