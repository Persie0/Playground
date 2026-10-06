package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqo {

    /* JADX INFO: renamed from: a */
    public kqc f36900a;

    /* JADX INFO: renamed from: b */
    public Set f36901b;

    /* JADX INFO: renamed from: c */
    public Set f36902c;

    /* JADX INFO: renamed from: d */
    public Set f36903d;

    /* JADX INFO: renamed from: e */
    public kql f36904e;

    /* JADX INFO: renamed from: f */
    private mws f36905f;

    /* JADX INFO: renamed from: a */
    public final kqp m14712a() {
        Set set;
        Set set2;
        kql kqlVar;
        mws mwsVar;
        Set set3 = this.f36901b;
        if (set3 != null && (set = this.f36902c) != null && (set2 = this.f36903d) != null && (kqlVar = this.f36904e) != null && (mwsVar = this.f36905f) != null) {
            return new kqp(this.f36900a, set3, set, set2, kqlVar, mwsVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36901b == null) {
            sb.append(" publicMediaFiles");
        }
        if (this.f36902c == null) {
            sb.append(" privateMediaFiles");
        }
        if (this.f36903d == null) {
            sb.append(" cachedMediaFiles");
        }
        if (this.f36904e == null) {
            sb.append(" mediaGroupInfoBuilder");
        }
        if (this.f36905f == null) {
            sb.append(" listeners");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m14713b(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException(EArqVBjecl.BabarucONMJJkiu);
        }
        this.f36905f = mwsVar;
    }
}
