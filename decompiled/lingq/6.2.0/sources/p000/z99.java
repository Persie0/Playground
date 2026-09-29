package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class z99 implements aa9 {

    /* JADX INFO: renamed from: b */
    public static p04 f71244b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71245a;

    @Override // p000.aa9
    /* JADX INFO: renamed from: a */
    public float mo215a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    @Override // p000.aa9
    /* JADX INFO: renamed from: b */
    public final float mo216b(View view, ViewGroup viewGroup) {
        switch (this.f71245a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
