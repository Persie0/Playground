package p192j6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: j6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6417f<Z> extends AbstractC6420i<ImageView, Z> {

    /* JADX INFO: renamed from: c */
    public Animatable f36889c;

    public AbstractC6417f(ImageView imageView) {
        super(imageView);
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
        Animatable animatable = this.f36889c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
        Animatable animatable = this.f36889c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo13035c(Z z10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: e */
    public final void mo6262e(Object obj) {
        mo13035c(obj);
        if (!(obj instanceof Animatable)) {
            this.f36889c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f36889c = animatable;
        animatable.start();
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: j */
    public final void mo6263j(Drawable drawable) {
        mo13035c(null);
        this.f36889c = null;
        ((ImageView) this.f36890a).setImageDrawable(drawable);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public void mo12737k(Drawable drawable) {
        mo13035c(null);
        this.f36889c = null;
        ((ImageView) this.f36890a).setImageDrawable(drawable);
    }

    @Override // p192j6.AbstractC6420i, p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: l */
    public final void mo11551l(Drawable drawable) {
        super.mo11551l(drawable);
        Animatable animatable = this.f36889c;
        if (animatable != null) {
            animatable.stop();
        }
        mo13035c(null);
        this.f36889c = null;
        ((ImageView) this.f36890a).setImageDrawable(drawable);
    }
}
