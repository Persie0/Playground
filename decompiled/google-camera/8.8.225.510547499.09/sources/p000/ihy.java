package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihy {

    /* JADX INFO: renamed from: a */
    public final Bitmap f31023a;

    /* JADX INFO: renamed from: b */
    public final int f31024b;

    /* JADX INFO: renamed from: c */
    public final mrm f31025c;

    /* JADX INFO: renamed from: d */
    public final boolean f31026d;

    public ihy(Bitmap bitmap, int i, mrm mrmVar, boolean z) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.f31023a = bitmap;
        this.f31024b = i;
        this.f31025c = mrmVar;
        this.f31026d = z;
    }

    /* JADX INFO: renamed from: b */
    public static ihy m11371b(Bitmap bitmap, int i) {
        return new ihy(bitmap, i, mrm.m16828h(null), true);
    }

    /* JADX INFO: renamed from: a */
    public final Rect m11372a() {
        return new Rect(0, 0, this.f31023a.getWidth(), this.f31023a.getHeight());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihy) {
            ihy ihyVar = (ihy) obj;
            if (this.f31023a.equals(ihyVar.f31023a) && this.f31024b == ihyVar.f31024b && this.f31025c.equals(ihyVar.f31025c) && this.f31026d == ihyVar.f31026d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f31023a.hashCode() ^ 1000003) * 1000003) ^ this.f31024b) * 1000003) ^ this.f31025c.hashCode()) * 1000003) ^ (true != this.f31026d ? 1237 : 1231);
    }

    public final String toString() {
        return "ViewfinderScreenshot{bitmap=" + this.f31023a.toString() + ", downscaleRatio=" + this.f31024b + ", bitmapSourceRect=" + this.f31025c.toString() + ", allowed=" + this.f31026d + "}";
    }

    public ihy() {
    }
}
