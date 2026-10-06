package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccy {

    /* JADX INFO: renamed from: a */
    public final mws f5230a;

    /* JADX INFO: renamed from: b */
    public final mws f5231b;

    /* JADX INFO: renamed from: c */
    public final int f5232c;

    /* JADX INFO: renamed from: d */
    public final int f5233d;

    public ccy() {
    }

    public ccy(mws mwsVar, mws mwsVar2, int i, int i2) {
        this.f5230a = mwsVar;
        this.f5231b = mwsVar2;
        this.f5232c = i;
        this.f5233d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ccy)) {
            return false;
        }
        ccy ccyVar = (ccy) obj;
        if (mkv.m16505M(this.f5230a, ccyVar.f5230a) && mkv.m16505M(this.f5231b, ccyVar.f5231b)) {
            int i = this.f5232c;
            int i2 = ccyVar.f5232c;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.f5233d;
                int i4 = ccyVar.f5233d;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f5230a.hashCode() ^ 1000003) * 1000003) ^ this.f5231b.hashCode();
        int i = this.f5232c;
        if (i == 0) {
            throw null;
        }
        int i2 = iHashCode * 1000003;
        int i3 = this.f5233d;
        if (i3 != 0) {
            return ((i2 ^ i) * 1000003) ^ i3;
        }
        throw null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5230a);
        String strValueOf2 = String.valueOf(this.f5231b);
        int i = this.f5232c;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.f5233d;
        return "Stats3AData{dataFieldsFloat=" + strValueOf + ", dataFieldsInteger=" + strValueOf2 + ", cameraPosition=" + string + xPAWq.EKipp + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + "}";
    }
}
