package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class hua extends lua {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f42961g;

    @Override // p000.lua
    /* JADX INFO: renamed from: d */
    public final void mo13481d(View view, float f) {
        switch (this.f42961g) {
            case 0:
                view.setAlpha(m16547a(f));
                break;
            case 1:
                view.setElevation(m16547a(f));
                break;
            case 2:
                view.setRotation(m16547a(f));
                break;
            case 3:
                view.setRotationX(m16547a(f));
                break;
            case 4:
                view.setRotationY(m16547a(f));
                break;
            case 5:
                view.setScaleX(m16547a(f));
                break;
            case 6:
                view.setScaleY(m16547a(f));
                break;
            case 7:
                view.setTranslationX(m16547a(f));
                break;
            case 8:
                view.setTranslationY(m16547a(f));
                break;
            default:
                view.setTranslationZ(m16547a(f));
                break;
        }
    }
}
