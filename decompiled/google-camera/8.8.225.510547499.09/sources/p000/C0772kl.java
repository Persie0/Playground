package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: kl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0772kl extends C0195ft {

    /* JADX INFO: renamed from: a */
    public boolean f36451a;

    public C0772kl(Drawable drawable) {
        super(drawable);
        this.f36451a = true;
    }

    @Override // p000.C0195ft, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f36451a) {
            super.draw(canvas);
        }
    }

    @Override // p000.C0195ft, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f36451a) {
            super.setHotspot(f, f2);
        }
    }

    @Override // p000.C0195ft, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f36451a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // p000.C0195ft, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f36451a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // p000.C0195ft, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f36451a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
