package p000;

import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyl extends hyk {

    /* JADX INFO: renamed from: j */
    private final float[] f29936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyl(float[] fArr, boolean z, boolean z2) {
        super(false, z, z2);
        boolean z3 = false;
        this.f29936j = fArr;
        if ((!z && fArr.length == 2) || fArr.length == 3) {
            z3 = true;
        }
        lku.m15613H(z3);
    }

    @Override // p000.hyk
    /* JADX INFO: renamed from: a */
    public final void mo10868a(RectF rectF) {
        if (!this.f29934h) {
            this.f29927a = Math.round(rectF.width() * this.f29936j[0]);
            this.f29928b = Math.round(rectF.width() * this.f29936j[1]);
            this.f29929c = Math.round(rectF.height() * this.f29936j[0]);
            this.f29930d = Math.round(rectF.height() * this.f29936j[1]);
            return;
        }
        this.f29927a = Math.round(rectF.width() * this.f29936j[0]);
        this.f29931e = Math.round(rectF.width() * this.f29936j[1]);
        this.f29928b = Math.round(rectF.width() * this.f29936j[2]);
        this.f29929c = Math.round(rectF.height() * this.f29936j[0]);
        this.f29932f = Math.round(rectF.height() * this.f29936j[1]);
        this.f29930d = Math.round(rectF.height() * this.f29936j[2]);
    }
}
