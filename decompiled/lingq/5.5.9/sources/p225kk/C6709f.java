package p225kk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import cm.InterfaceC2052l;
import com.google.android.material.imageview.ShapeableImageView;
import p192j6.C6413b;
import sl.C9072e;

/* JADX INFO: renamed from: kk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6709f extends C6413b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f37927d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2052l<Bitmap, C9072e> f37928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6709f(ShapeableImageView shapeableImageView, InterfaceC2052l interfaceC2052l) {
        super(shapeableImageView);
        this.f37927d = shapeableImageView;
        this.f37928e = interfaceC2052l;
    }

    @Override // p192j6.C6413b, p192j6.AbstractC6417f
    /* JADX INFO: renamed from: d */
    public final void mo13035c(Bitmap bitmap) {
        if (bitmap != null) {
            this.f37927d.setImageBitmap(bitmap);
            this.f37928e.mo528n(bitmap);
        }
    }

    @Override // p192j6.AbstractC6417f, p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public final void mo12737k(Drawable drawable) {
        super.mo12737k(drawable);
        this.f37927d.setImageBitmap(null);
    }
}
