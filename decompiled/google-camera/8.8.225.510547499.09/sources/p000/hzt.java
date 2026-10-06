package p000;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzt {

    /* JADX INFO: renamed from: a */
    public final Size f30088a;

    /* JADX INFO: renamed from: b */
    public final Rect f30089b;

    /* JADX INFO: renamed from: c */
    public final Rect f30090c;

    /* JADX INFO: renamed from: d */
    private final int f30091d;

    public hzt() {
    }

    public hzt(Size size, Rect rect, Rect rect2, int i) {
        this.f30088a = size;
        this.f30089b = rect;
        this.f30090c = rect2;
        this.f30091d = i;
    }

    /* JADX INFO: renamed from: a */
    public static hzt m10959a(Size size, Rect rect, Rect rect2, int i) {
        return new hzt(size, rect, rect2, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzt) {
            hzt hztVar = (hzt) obj;
            if (this.f30088a.equals(hztVar.f30088a) && this.f30089b.equals(hztVar.f30089b) && this.f30090c.equals(hztVar.f30090c) && this.f30091d == hztVar.f30091d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.f30088a.hashCode() ^ 1000003) * 1000003) ^ this.f30089b.hashCode()) * 1000003) ^ this.f30090c.hashCode()) * 1000003) ^ this.f30091d) * 1000003;
    }

    public final String toString() {
        return "ViewfinderLayoutSpec{size=" + this.f30088a.toString() + ", padding=" + this.f30089b.toString() + ", margins=" + this.f30090c.toString() + ", gravity=" + this.f30091d + ", layoutDirection=0}";
    }
}
