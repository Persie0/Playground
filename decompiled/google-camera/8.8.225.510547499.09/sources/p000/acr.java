package p000;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acr {

    /* JADX INFO: renamed from: a */
    public static final acr f102a = new acr(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public final int f103b;

    /* JADX INFO: renamed from: c */
    public final int f104c;

    /* JADX INFO: renamed from: d */
    public final int f105d;

    /* JADX INFO: renamed from: e */
    public final int f106e;

    private acr(int i, int i2, int i3, int i4) {
        this.f103b = i;
        this.f104c = i2;
        this.f105d = i3;
        this.f106e = i4;
    }

    /* JADX INFO: renamed from: b */
    public static acr m219b(Rect rect) {
        return m220c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: c */
    public static acr m220c(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return f102a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new acr(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: d */
    public static acr m221d(Insets insets) {
        return m220c(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: a */
    public final Insets m222a() {
        return acq.m215a(this.f103b, this.f104c, this.f105d, this.f106e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acr acrVar = (acr) obj;
        return this.f106e == acrVar.f106e && this.f103b == acrVar.f103b && this.f105d == acrVar.f105d && this.f104c == acrVar.f104c;
    }

    public final int hashCode() {
        return (((((this.f103b * 31) + this.f104c) * 31) + this.f105d) * 31) + this.f106e;
    }

    public final String toString() {
        return "Insets{left=" + this.f103b + ", top=" + this.f104c + ", right=" + this.f105d + ", bottom=" + this.f106e + '}';
    }
}
