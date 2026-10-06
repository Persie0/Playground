package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class het {

    /* JADX INFO: renamed from: a */
    public final String f27483a;

    /* JADX INFO: renamed from: b */
    public final mxk f27484b;

    /* JADX INFO: renamed from: c */
    public final mxk f27485c;

    /* JADX INFO: renamed from: d */
    public final boolean f27486d;

    /* JADX INFO: renamed from: e */
    public final boolean f27487e;

    /* JADX INFO: renamed from: f */
    public final jwn f27488f;

    /* JADX INFO: renamed from: g */
    public final mrm f27489g;

    /* JADX INFO: renamed from: h */
    public final mrm f27490h;

    /* JADX INFO: renamed from: i */
    public final int f27491i;

    public het() {
    }

    public het(String str, mxk mxkVar, mxk mxkVar2, boolean z, boolean z2, jwn jwnVar, int i, mrm mrmVar, mrm mrmVar2) {
        this.f27483a = str;
        this.f27484b = mxkVar;
        this.f27485c = mxkVar2;
        this.f27486d = z;
        this.f27487e = z2;
        this.f27488f = jwnVar;
        this.f27491i = i;
        this.f27489g = mrmVar;
        this.f27490h = mrmVar2;
    }

    /* JADX INFO: renamed from: a */
    public static lja m10159a() {
        lja ljaVar = new lja(null);
        ljaVar.f38344c = "UnknownSmartsProcessor";
        ljaVar.m15520j(true);
        ljaVar.m15521k(true);
        ljaVar.m15519i(jwv.m13644a(true));
        ljaVar.f38342a = 4;
        mqu mquVar = mqu.f41450a;
        ljaVar.f38346e = mquVar;
        ljaVar.f38347f = mquVar;
        return ljaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof het)) {
            return false;
        }
        het hetVar = (het) obj;
        if (this.f27483a.equals(hetVar.f27483a) && this.f27484b.equals(hetVar.f27484b) && this.f27485c.equals(hetVar.f27485c) && this.f27486d == hetVar.f27486d && this.f27487e == hetVar.f27487e && this.f27488f.equals(hetVar.f27488f)) {
            int i = this.f27491i;
            int i2 = hetVar.f27491i;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.f27489g.equals(hetVar.f27489g) && this.f27490h.equals(hetVar.f27490h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f27483a.hashCode() ^ 1000003) * 1000003) ^ this.f27484b.hashCode()) * 1000003) ^ this.f27485c.hashCode();
        int iHashCode2 = (((((iHashCode * 1000003) ^ (true != this.f27486d ? 1237 : 1231)) * 1000003) ^ (true == this.f27487e ? 1231 : 1237)) * 1000003) ^ this.f27488f.hashCode();
        int i = this.f27491i;
        if (i != 0) {
            return (((((iHashCode2 * 1000003) ^ i) * 1000003) ^ this.f27489g.hashCode()) * 1000003) ^ this.f27490h.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2 = this.f27483a;
        String strValueOf = String.valueOf(this.f27484b);
        String strValueOf2 = String.valueOf(this.f27485c);
        boolean z = this.f27486d;
        boolean z2 = this.f27487e;
        String strValueOf3 = String.valueOf(this.f27488f);
        switch (this.f27491i) {
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "STATUS_UPDATE_STICKY";
                break;
            case 3:
                str = "FRAMING_HINT";
                break;
            case 4:
                str = "SUGGESTION";
                break;
            case 5:
                str = "LENS_SUGGESTION";
                break;
            default:
                str = "null";
                break;
        }
        return "SmartsProcessorOptions{name=" + str2 + ", activeModes=" + strValueOf + ", activeCameraFacing=" + strValueOf2 + ", shouldPauseDuringCapture=" + z + ", shouldPauseWhenTimerActive=" + z2 + ", externalToggle=" + strValueOf3 + ", notificationPriority=" + str + ", smartsCaptureListener=" + String.valueOf(this.f27489g) + ", registrationThread=" + String.valueOf(this.f27490h) + "}";
    }
}
