package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0874of implements Icon.OnDrawableLoadedListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0877oi f45823a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f45824b;

    public C0874of(C0877oi c0877oi, int i) {
        this.f45824b = i;
        this.f45823a = c0877oi;
    }

    @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
    public final void onDrawableLoaded(Drawable drawable) {
        switch (this.f45824b) {
            case 0:
                if (drawable != null) {
                    C0877oi c0877oi = this.f45823a;
                    c0877oi.f46060e = drawable;
                    c0877oi.f46060e.mutate();
                    this.f45823a.m18520c();
                    break;
                }
                break;
            case 1:
                if (drawable != null) {
                    C0877oi c0877oi2 = this.f45823a;
                    c0877oi2.f46059d = drawable;
                    c0877oi2.f46059d.mutate();
                    this.f45823a.m18520c();
                    break;
                }
                break;
            case 2:
                if (drawable != null) {
                    C0877oi c0877oi3 = this.f45823a;
                    c0877oi3.f46061f = drawable;
                    c0877oi3.m18520c();
                    break;
                }
                break;
            case 3:
                if (drawable != null) {
                    C0877oi c0877oi4 = this.f45823a;
                    c0877oi4.f46062g = drawable;
                    c0877oi4.m18520c();
                    break;
                }
                break;
            default:
                if (drawable != null) {
                    C0877oi c0877oi5 = this.f45823a;
                    c0877oi5.f46063h = drawable;
                    c0877oi5.m18520c();
                    break;
                }
                break;
        }
    }
}
