package p000;

import com.google.googlex.gcam.ShotMetadata;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efa {

    /* JADX INFO: renamed from: a */
    public static final nbh f13787a = nbh.m17259h("com/google/android/apps/camera/hdrplus/burst/BurstUtils");

    /* JADX INFO: renamed from: b */
    public final fca f13788b;

    /* JADX INFO: renamed from: d */
    public final gvw f13790d;

    /* JADX INFO: renamed from: e */
    public final egc f13791e;

    /* JADX INFO: renamed from: f */
    public final dhv f13792f;

    /* JADX INFO: renamed from: g */
    public final fvu f13793g;

    /* JADX INFO: renamed from: h */
    public final jfs f13794h;

    /* JADX INFO: renamed from: i */
    public final bkn f13795i;

    /* JADX INFO: renamed from: j */
    private final fxs f13796j = new fxs(1);

    /* JADX INFO: renamed from: c */
    public final Executor f13789c = new jvi(jzn.m13824l("BurstEnc"));

    public efa(jfs jfsVar, fca fcaVar, fvu fvuVar, bkn bknVar, gvw gvwVar, egc egcVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13794h = jfsVar;
        this.f13788b = fcaVar;
        this.f13793g = fvuVar;
        this.f13795i = bknVar;
        this.f13791e = egcVar;
        this.f13792f = dhvVar;
        this.f13790d = gvwVar;
    }

    /* JADX INFO: renamed from: a */
    public final nps m7265a(long j, ihk ihkVar, gpv gpvVar, int i, int i2, boolean z, eez eezVar, gyh gyhVar, UUID uuid, ShotMetadata shotMetadata, mrm mrmVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        kxk.m14975U(this.f13796j.m8939a(new eew(this, ihkVar, i2, z, shotMetadata, i, gyhVar, null, null)), new eex(this, i, eezVar, gpvVar, gyhVar, uuid, mrmVar, nqfVarM17621g), not.INSTANCE);
        return nqfVarM17621g;
    }
}
