package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: renamed from: y */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1138y {

    /* JADX INFO: renamed from: a */
    public final int f48041a;

    /* JADX INFO: renamed from: b */
    public final char f48042b;

    /* JADX INFO: renamed from: c */
    public short f48043c;

    /* JADX INFO: renamed from: d */
    public int f48044d;

    /* JADX INFO: renamed from: e */
    public final int f48045e;

    public C1138y(int i, int i2, int i3, int i4) {
        this.f48045e = i;
        this.f48041a = i2;
        this.f48042b = (char) i3;
        this.f48043c = (short) i4;
    }

    /* JADX INFO: renamed from: a */
    public final int m19594a() {
        return this.f48041a + this.f48042b;
    }

    /* JADX INFO: renamed from: b */
    public final int m19595b() {
        int i = this.f48045e;
        if (i == 6 || i == 7) {
            return C1165z.f48317e[this.f48043c];
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1138y c1138y = (C1138y) obj;
            if (this.f48045e == c1138y.f48045e && this.f48041a == c1138y.f48041a && this.f48042b == c1138y.f48042b && this.f48043c == c1138y.f48043c && this.f48044d == c1138y.f48044d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f48045e * 37) + this.f48041a) * 37) + this.f48042b) * 37) + this.f48043c;
    }

    public final String toString() {
        String string;
        String str;
        int i = this.f48045e;
        if (i == 6 || i == 7) {
            int iM19595b = m19595b();
            String strM5779a = C0121d.m5779a(iM19595b);
            if (iM19595b == 0) {
                throw null;
            }
            string = strM5779a;
        } else {
            string = Integer.toString(this.f48043c);
        }
        switch (this.f48045e) {
            case 1:
                str = "MSG_START";
                break;
            case 2:
                str = PMZiHihxLGEy.rRDxkiAPAj;
                break;
            case 3:
                str = "SKIP_SYNTAX";
                break;
            case 4:
                str = "INSERT_CHAR";
                break;
            case 5:
                str = "REPLACE_NUMBER";
                break;
            case 6:
                str = "ARG_START";
                break;
            case 7:
                str = "ARG_LIMIT";
                break;
            case 8:
                str = "ARG_NUMBER";
                break;
            case 9:
                str = "ARG_NAME";
                break;
            case 10:
                str = "ARG_TYPE";
                break;
            case 11:
                str = "ARG_STYLE";
                break;
            case 12:
                str = "ARG_SELECTOR";
                break;
            case 13:
                str = "ARG_INT";
                break;
            default:
                str = "ARG_DOUBLE";
                break;
        }
        return str + "(" + string + ")@" + this.f48041a;
    }
}
