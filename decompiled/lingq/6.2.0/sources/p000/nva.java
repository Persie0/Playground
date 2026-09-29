package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nva extends rva {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f53303k;

    public /* synthetic */ nva(int i) {
        this.f53303k = i;
    }

    @Override // p000.rva
    /* JADX INFO: renamed from: d */
    public final boolean mo17649d(float f, long j, View view, web webVar) {
        switch (this.f53303k) {
            case 0:
                view.setAlpha(m20868b(f, j, view, webVar));
                break;
            case 1:
                view.setElevation(m20868b(f, j, view, webVar));
                break;
            case 2:
                view.setRotation(m20868b(f, j, view, webVar));
                break;
            case 3:
                view.setRotationX(m20868b(f, j, view, webVar));
                break;
            case 4:
                view.setRotationY(m20868b(f, j, view, webVar));
                break;
            case 5:
                view.setScaleX(m20868b(f, j, view, webVar));
                break;
            case 6:
                view.setScaleY(m20868b(f, j, view, webVar));
                break;
            case 7:
                view.setTranslationX(m20868b(f, j, view, webVar));
                break;
            case 8:
                view.setTranslationY(m20868b(f, j, view, webVar));
                break;
            default:
                view.setTranslationZ(m20868b(f, j, view, webVar));
                break;
        }
        return this.f59891h;
    }
}
