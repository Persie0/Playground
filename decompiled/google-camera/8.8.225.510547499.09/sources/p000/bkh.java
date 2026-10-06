package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkh extends bkc {

    /* JADX INFO: renamed from: h */
    private final bhj f3619h;

    public bkh(bgv bgvVar, bkf bkfVar) {
        super(bgvVar, bkfVar);
        bhj bhjVar = new bhj(bgvVar, this, new bjx("__container", bkfVar.f3597a, false));
        this.f3619h = bhjVar;
        bhjVar.mo2467e(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p000.bkc, p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        super.mo2464b(rectF, matrix, z);
        this.f3619h.mo2464b(rectF, this.f3566a, z);
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: i */
    public final void mo2535i(Canvas canvas, Matrix matrix, int i) {
        this.f3619h.mo2463a(canvas, matrix, i);
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: k */
    public final void mo2537k(biw biwVar, int i, List list, biw biwVar2) {
        this.f3619h.mo2466d(biwVar, i, list, biwVar2);
    }
}
