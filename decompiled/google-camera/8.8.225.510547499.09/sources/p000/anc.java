package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class anc {

    /* JADX INFO: renamed from: i */
    public float f848i;

    /* JADX INFO: renamed from: a */
    public float f840a = -1.0f;

    /* JADX INFO: renamed from: b */
    public float f841b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f842c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f843d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f844e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f845f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f846g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f847h = -1.0f;

    /* JADX INFO: renamed from: j */
    public final and f849j = new and();

    /* JADX INFO: renamed from: a */
    public final void m1014a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        this.f849j.width = layoutParams.width;
        this.f849j.height = layoutParams.height;
        and andVar = this.f849j;
        boolean z = false;
        boolean z2 = (andVar.f851b || andVar.width == 0) && this.f840a < 0.0f;
        and andVar2 = this.f849j;
        if ((andVar2.f850a || andVar2.height == 0) && this.f841b < 0.0f) {
            z = true;
        }
        float f = this.f840a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(i * f);
        }
        float f2 = this.f841b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(i2 * f2);
        }
        if (this.f848i >= 0.0f) {
            if (z2) {
                layoutParams.width = Math.round(layoutParams.height * this.f848i);
                this.f849j.f851b = true;
            }
            if (z) {
                layoutParams.height = Math.round(layoutParams.width / this.f848i);
                this.f849j.f850a = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1015b(ViewGroup.LayoutParams layoutParams) {
        and andVar = this.f849j;
        if (!andVar.f851b) {
            layoutParams.width = andVar.width;
        }
        and andVar2 = this.f849j;
        if (!andVar2.f850a) {
            layoutParams.height = andVar2.height;
        }
        and andVar3 = this.f849j;
        andVar3.f851b = false;
        andVar3.f850a = false;
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.f840a), Float.valueOf(this.f841b), Float.valueOf(this.f842c), Float.valueOf(this.f843d), Float.valueOf(this.f844e), Float.valueOf(this.f845f), Float.valueOf(this.f846g), Float.valueOf(this.f847h));
    }
}
