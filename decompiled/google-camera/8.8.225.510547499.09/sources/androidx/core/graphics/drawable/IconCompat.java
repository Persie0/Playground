package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p000.acz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f1474a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public int f1475b;

    /* JADX INFO: renamed from: c */
    public Object f1476c;

    /* JADX INFO: renamed from: d */
    public byte[] f1477d;

    /* JADX INFO: renamed from: e */
    public Parcelable f1478e;

    /* JADX INFO: renamed from: f */
    public int f1479f;

    /* JADX INFO: renamed from: g */
    public int f1480g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f1481h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f1482i;

    /* JADX INFO: renamed from: j */
    public String f1483j;

    /* JADX INFO: renamed from: k */
    public String f1484k;

    public IconCompat() {
        this.f1475b = -1;
        this.f1477d = null;
        this.f1478e = null;
        this.f1479f = 0;
        this.f1480g = 0;
        this.f1481h = null;
        this.f1482i = f1474a;
        this.f1483j = null;
    }

    public IconCompat(byte[] bArr) {
        this.f1477d = null;
        this.f1478e = null;
        this.f1479f = 0;
        this.f1480g = 0;
        this.f1481h = null;
        this.f1482i = f1474a;
        this.f1483j = null;
        this.f1475b = 2;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m1430b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(null);
        iconCompat.f1479f = i;
        iconCompat.f1476c = "";
        iconCompat.f1484k = "";
        return iconCompat;
    }

    /* JADX INFO: renamed from: a */
    public final int m1431a() {
        int i = this.f1475b;
        if (i == -1) {
            return acz.m254a(this.f1476c);
        }
        if (i == 2) {
            return this.f1479f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final String toString() {
        String str;
        if (this.f1475b == -1) {
            return String.valueOf(this.f1476c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1475b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1475b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1476c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1476c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1484k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1431a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1479f);
                if (this.f1480g != 0) {
                    sb.append(" off=");
                    sb.append(this.f1480g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1476c);
                break;
        }
        if (this.f1481h != null) {
            sb.append(" tint=");
            sb.append(this.f1481h);
        }
        if (this.f1482i != f1474a) {
            sb.append(" mode=");
            sb.append(this.f1482i);
        }
        sb.append(")");
        return sb.toString();
    }
}
