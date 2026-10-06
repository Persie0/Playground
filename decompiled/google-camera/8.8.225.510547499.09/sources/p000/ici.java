package p000;

import android.animation.Animator;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.p014ui.views.GradientBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ici implements ila {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f30333a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30334b;

    public ici(GradientBar gradientBar, int i) {
        this.f30334b = i;
        this.f30333a = gradientBar;
    }

    public ici(ick ickVar, int i) {
        this.f30334b = i;
        this.f30333a = ickVar;
    }

    @Override // p000.ila
    public final void setColor(int i) {
        switch (this.f30334b) {
            case 0:
                Animator animator = ((ick) this.f30333a).f30352m;
                if (animator != null) {
                    animator.end();
                }
                ick ickVar = (ick) this.f30333a;
                ickVar.f30347h = i;
                TextView textView = ickVar.f30346g;
                if (textView != null) {
                    textView.setTextColor(i);
                    return;
                }
                return;
            case 1:
                ick ickVar2 = (ick) this.f30333a;
                ickVar2.f30349j = i;
                ickVar2.f30351l.setTint(i);
                ((ick) this.f30333a).invalidate();
                return;
            case 2:
                Animator animator2 = ((ick) this.f30333a).f30352m;
                if (animator2 != null) {
                    animator2.end();
                }
                ick ickVar3 = (ick) this.f30333a;
                ickVar3.f30348i = i;
                for (TextView textView2 : ickVar3.f30341b.values()) {
                    if (textView2.equals(((ick) this.f30333a).f30346g)) {
                        textView2.setTextColor(((ick) this.f30333a).f30347h);
                    } else {
                        textView2.setTextColor(((ick) this.f30333a).f30348i);
                    }
                }
                return;
            default:
                throw null;
        }
    }
}
