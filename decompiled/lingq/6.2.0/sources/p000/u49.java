package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class u49 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final Rect f63406a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShapeableImageView f63407b;

    public u49(ShapeableImageView shapeableImageView) {
        this.f63407b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f63407b;
        if (shapeableImageView.f13014l == null) {
            return;
        }
        if (shapeableImageView.f13013k == null) {
            shapeableImageView.f13013k = new fs5(shapeableImageView.f13014l);
        }
        RectF rectF = shapeableImageView.f13007e;
        Rect rect = this.f63406a;
        rectF.round(rect);
        shapeableImageView.f13013k.setBounds(rect);
        shapeableImageView.f13013k.getOutline(outline);
    }
}
