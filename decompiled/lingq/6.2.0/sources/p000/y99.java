package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class y99 implements aa9 {

    /* JADX INFO: renamed from: b */
    public static p04 f69514b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69515a;

    @Override // p000.aa9
    /* JADX INFO: renamed from: a */
    public final float mo215a(View view, ViewGroup viewGroup) {
        switch (this.f69515a) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    @Override // p000.aa9
    /* JADX INFO: renamed from: b */
    public float mo216b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
