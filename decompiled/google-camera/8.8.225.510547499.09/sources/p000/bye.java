package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bye implements bqt {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4737a;

    public bye(int i) {
        this.f4737a = i;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        switch (this.f4737a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        switch (this.f4737a) {
            case 0:
                return byc.m3182g((Drawable) obj);
            case 1:
                return new bxz((Bitmap) obj, 1);
            default:
                return new bwf((File) obj);
        }
    }
}
