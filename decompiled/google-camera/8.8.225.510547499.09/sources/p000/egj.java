package p000;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.ShotMetadata;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egj {

    /* JADX INFO: renamed from: a */
    public final Optional f13963a;

    /* JADX INFO: renamed from: b */
    public final Optional f13964b;

    /* JADX INFO: renamed from: c */
    public final Optional f13965c;

    /* JADX INFO: renamed from: d */
    public final ShotMetadata f13966d;

    /* JADX INFO: renamed from: e */
    public final nrt f13967e;

    /* JADX INFO: renamed from: f */
    public final mws f13968f;

    public egj() {
    }

    public egj(Optional optional, Optional optional2, Optional optional3, ShotMetadata shotMetadata, nrt nrtVar, mws mwsVar) {
        this.f13963a = optional;
        this.f13964b = optional2;
        this.f13965c = optional3;
        this.f13966d = shotMetadata;
        this.f13967e = nrtVar;
        this.f13968f = mwsVar;
    }

    /* JADX INFO: renamed from: a */
    public static egi m7306a() {
        egi egiVar = new egi(null);
        egiVar.f13959c = new nrt();
        int i = mws.f41739d;
        egiVar.m7298b(mzr.f41857a);
        return egiVar;
    }

    /* JADX INFO: renamed from: b */
    public final long[] m7307b() {
        long[] jArr = new long[this.f13968f.size()];
        for (int i = 0; i < this.f13968f.size(); i++) {
            Integer num = (Integer) ((kpp) this.f13968f.get(i)).mo9517d(CaptureResult.CONTROL_AF_STATE);
            num.getClass();
            jArr[i] = num.intValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: c */
    public final long[] m7308c() {
        long[] jArr = new long[this.f13968f.size()];
        for (int i = 0; i < this.f13968f.size(); i++) {
            Long l = (Long) ((kpp) this.f13968f.get(i)).mo9517d(CaptureResult.SENSOR_TIMESTAMP);
            l.getClass();
            jArr[i] = l.longValue();
        }
        return jArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egj) {
            egj egjVar = (egj) obj;
            if (this.f13963a.equals(egjVar.f13963a) && this.f13964b.equals(egjVar.f13964b) && this.f13965c.equals(egjVar.f13965c) && this.f13966d.equals(egjVar.f13966d) && this.f13967e.equals(egjVar.f13967e) && mkv.m16505M(this.f13968f, egjVar.f13968f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f13963a.hashCode() ^ 1000003) * 1000003) ^ this.f13964b.hashCode()) * 1000003) ^ this.f13965c.hashCode()) * 1000003) ^ this.f13966d.hashCode()) * 1000003) ^ this.f13967e.hashCode()) * 1000003) ^ this.f13968f.hashCode();
    }

    public final String toString() {
        return "InputData{rawImage=" + String.valueOf(this.f13963a) + ", rgbImage=" + String.valueOf(this.f13964b) + ", lumaDenoisedImage=" + String.valueOf(this.f13965c) + ", shotMetadata=" + String.valueOf(this.f13966d) + ", makernoteMetadata=" + String.valueOf(this.f13967e) + ", payloadMetadata=" + String.valueOf(this.f13968f) + "}";
    }
}
