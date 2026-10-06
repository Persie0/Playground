package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgt {

    /* JADX INFO: renamed from: a */
    public final mxk f27744a;

    /* JADX INFO: renamed from: b */
    public final mxk f27745b;

    /* JADX INFO: renamed from: c */
    private final String f27746c;

    public hgt() {
    }

    public hgt(String str, mxk mxkVar, mxk mxkVar2) {
        this.f27746c = str;
        this.f27744a = mxkVar;
        this.f27745b = mxkVar2;
    }

    /* JADX INFO: renamed from: b */
    static String m10253b(String str) {
        return xPAWq.VckWiE.concat(String.valueOf(str.replace('.', '_')));
    }

    /* JADX INFO: renamed from: c */
    public static npa m10254c() {
        return new npa();
    }

    /* JADX INFO: renamed from: a */
    public final String m10255a() {
        String str = this.f27746c;
        str.getClass();
        return m10253b(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hgt) {
            hgt hgtVar = (hgt) obj;
            if (this.f27746c.equals(hgtVar.f27746c) && this.f27744a.equals(hgtVar.f27744a) && this.f27745b.equals(hgtVar.f27745b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27746c.hashCode() ^ 1000003) * 1000003) ^ this.f27744a.hashCode()) * 1000003) ^ this.f27745b.hashCode();
    }

    public final String toString() {
        return "SocialApp{packageName=" + this.f27746c + ", photoActivityNames=" + String.valueOf(this.f27744a) + ", videoActivityNames=" + String.valueOf(this.f27745b) + "}";
    }
}
