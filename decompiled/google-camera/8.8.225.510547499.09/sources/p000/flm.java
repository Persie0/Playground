package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class flm implements flp {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f22507a;

    public flm(int i) {
        this.f22507a = i;
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: b */
    public final boolean mo8555b(gsr gsrVar, gsr gsrVar2) {
        switch (this.f22507a) {
            case 0:
                Rect rect = gsrVar.f26255o;
                Rect rect2 = gsrVar2.f26255o;
                if (rect == null || rect2 == null) {
                    return true;
                }
                return ((float) Math.hypot((double) (rect.width() - rect2.width()), (double) (rect.height() - rect2.height()))) > 1.0E-6f;
            case 1:
                return gsrVar.f26259s != gsrVar2.f26259s;
            default:
                return gsrVar.f26250j == 6;
        }
    }

    @Override // p000.flp
    /* JADX INFO: renamed from: a */
    public final fli mo8554a() {
        switch (this.f22507a) {
            case 0:
                return fli.CROP_REGION;
            case 1:
                return fli.ROTATION;
            default:
                return fli.OUT_OF_FOCUS;
        }
    }
}
