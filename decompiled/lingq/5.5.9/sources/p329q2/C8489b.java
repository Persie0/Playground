package p329q2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: q2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8489b extends AbstractC8490c {
    public C8489b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // p329q2.AbstractC8490c
    /* JADX INFO: renamed from: a */
    public final void mo16574a(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        m16576c();
        outline.setRoundRect(this.f45680h, this.f45679g);
    }
}
