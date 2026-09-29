package p000;

import com.google.common.primitives.AbstractC1110a;

/* JADX INFO: loaded from: classes2.dex */
public final class x1b implements dy5 {

    /* JADX INFO: renamed from: a */
    public final String f67650a;

    /* JADX INFO: renamed from: b */
    public final String f67651b;

    public x1b(String str, String str2) {
        this.f67650a = AbstractC3584sr.m21627g0(str);
        this.f67651b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        String str = this.f67650a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.f67651b;
        switch (b) {
            case 0:
                Integer numM6367g = AbstractC1110a.m6367g(str2);
                if (numM6367g != null) {
                    su5Var.f61426i = numM6367g;
                }
                break;
            case 1:
                Integer numM6367g2 = AbstractC1110a.m6367g(str2);
                if (numM6367g2 != null) {
                    su5Var.f61439v = numM6367g2;
                }
                break;
            case 2:
                Integer numM6367g3 = AbstractC1110a.m6367g(str2);
                if (numM6367g3 != null) {
                    su5Var.f61425h = numM6367g3;
                }
                break;
            case 3:
                su5Var.f61420c = str2;
                break;
            case 4:
                su5Var.f61440w = str2;
                break;
            case 5:
                su5Var.f61418a = str2;
                break;
            case 6:
                su5Var.f61422e = str2;
                break;
            case 7:
                Integer numM6367g4 = AbstractC1110a.m6367g(str2);
                if (numM6367g4 != null) {
                    su5Var.f61438u = numM6367g4;
                }
                break;
            case 8:
                su5Var.f61421d = str2;
                break;
            case 9:
                su5Var.f61419b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1b.class == obj.getClass()) {
            x1b x1bVar = (x1b) obj;
            if (this.f67650a.equals(x1bVar.f67650a) && this.f67651b.equals(x1bVar.f67651b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f67651b.hashCode() + ux5.m22980c(527, this.f67650a, 31);
    }

    public final String toString() {
        return "VC: " + this.f67650a + "=" + this.f67651b;
    }
}
