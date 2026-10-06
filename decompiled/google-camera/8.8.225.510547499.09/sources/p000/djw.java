package p000;

import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djw {

    /* JADX INFO: renamed from: a */
    public final ImageView f11825a;

    /* JADX INFO: renamed from: b */
    public final ImageView f11826b;

    /* JADX INFO: renamed from: c */
    public final ImageView f11827c;

    public djw(ImageView imageView, ImageView imageView2, ImageView imageView3) {
        if (imageView == null) {
            throw new NullPointerException("Null contentView");
        }
        this.f11825a = imageView;
        if (imageView2 == null) {
            throw new NullPointerException("Null playButton");
        }
        this.f11826b = imageView2;
        if (imageView3 == null) {
            throw new NullPointerException("Null photoSphereBadge");
        }
        this.f11827c = imageView3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djw) {
            djw djwVar = (djw) obj;
            if (this.f11825a.equals(djwVar.f11825a) && this.f11826b.equals(djwVar.f11826b) && this.f11827c.equals(djwVar.f11827c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11825a.hashCode() ^ 1000003) * 1000003) ^ this.f11826b.hashCode()) * 1000003) ^ this.f11827c.hashCode();
    }

    public final String toString() {
        return "ContentViewHolder{contentView=" + this.f11825a.toString() + ", playButton=" + this.f11826b.toString() + ", photoSphereBadge=" + this.f11827c.toString() + "}";
    }

    public djw() {
    }
}
