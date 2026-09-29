package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class cva extends gva {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f34616f;

    @Override // p000.gva
    /* JADX INFO: renamed from: c */
    public final void mo9912c(View view, float f) {
        switch (this.f34616f) {
            case 0:
                view.setAlpha(m12918a(f));
                break;
            case 1:
                view.setElevation(m12918a(f));
                break;
            case 2:
                view.setPivotX(m12918a(f));
                break;
            case 3:
                view.setPivotY(m12918a(f));
                break;
            case 4:
                view.setRotation(m12918a(f));
                break;
            case 5:
                view.setRotationX(m12918a(f));
                break;
            case 6:
                view.setRotationY(m12918a(f));
                break;
            case 7:
                view.setScaleX(m12918a(f));
                break;
            case 8:
                view.setScaleY(m12918a(f));
                break;
            case 9:
                view.setTranslationX(m12918a(f));
                break;
            case 10:
                view.setTranslationY(m12918a(f));
                break;
            default:
                view.setTranslationZ(m12918a(f));
                break;
        }
    }
}
