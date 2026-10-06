package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.ViewfinderResults;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface ecq {

    /* JADX INFO: renamed from: a */
    public static final imv f13394a = new imv(100.0f);

    /* JADX INFO: renamed from: A */
    boolean mo7126A(kmg kmgVar, kpp kppVar, kpw kpwVar, kpw kpwVar2, kmg kmgVar2, kpp kppVar2, kpw kpwVar3);

    /* JADX INFO: renamed from: B */
    BurstSpec mo7127B(eem eemVar, kpw kpwVar, kpp kppVar, boolean z, Boolean bool, ebn ebnVar, Optional optional);

    /* JADX INFO: renamed from: C */
    void mo7128C(eem eemVar, kmg kmgVar, int i, kpp kppVar, nre nreVar, kpw kpwVar);

    /* JADX INFO: renamed from: D */
    Bitmap mo7129D(kmg kmgVar, kpw kpwVar, kpp kppVar, gcy gcyVar, boolean z, mrm mrmVar, mrm mrmVar2, mrm mrmVar3);

    /* JADX INFO: renamed from: E */
    eem mo7130E(kmg kmgVar, gyu gyuVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar);

    /* JADX INFO: renamed from: F */
    eem mo7131F(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, egm egmVar);

    /* JADX INFO: renamed from: G */
    eem mo7132G(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, int i, boolean z, int i2, mrm mrmVar, egm egmVar);

    /* JADX INFO: renamed from: H */
    eem mo7133H(kmg kmgVar, glk glkVar, PostviewParams postviewParams, gcy gcyVar, kpp kppVar, int i, int i2, boolean z, egm egmVar);

    /* JADX INFO: renamed from: a */
    int mo7134a(kmg kmgVar);

    /* JADX INFO: renamed from: b */
    int mo7135b(nse nseVar);

    /* JADX INFO: renamed from: c */
    int mo7136c(kpp kppVar, kmg kmgVar);

    /* JADX INFO: renamed from: d */
    ebv mo7137d();

    /* JADX INFO: renamed from: e */
    edl mo7138e(kpw kpwVar, kpp kppVar, boolean z, kbc kbcVar);

    /* JADX INFO: renamed from: f */
    AeResults mo7139f(edl edlVar);

    /* JADX INFO: renamed from: g */
    BurstSpec mo7140g(eem eemVar, kpw kpwVar, kpp kppVar, mrm mrmVar);

    /* JADX INFO: renamed from: h */
    FrameMetadata mo7141h(kpp kppVar, GyroSampleVector gyroSampleVector, kmg kmgVar);

    /* JADX INFO: renamed from: i */
    GyroSampleVector mo7142i(kpp kppVar);

    /* JADX INFO: renamed from: j */
    PhysicalStabilityParams mo7143j(int i);

    /* JADX INFO: renamed from: k */
    PostShutterAfParams mo7144k(int i);

    /* JADX INFO: renamed from: l */
    nse mo7145l(kpp kppVar, kmg kmgVar);

    /* JADX INFO: renamed from: m */
    ViewfinderResults mo7146m(int i);

    /* JADX INFO: renamed from: n */
    void mo7147n(eem eemVar);

    /* JADX INFO: renamed from: o */
    void mo7148o(eem eemVar, kmg kmgVar, int i, kpp kppVar, nre nreVar, kpw kpwVar, kpw kpwVar2, mrm mrmVar);

    /* JADX INFO: renamed from: p */
    void mo7149p(kmg kmgVar, kpw kpwVar, kpp kppVar);

    /* JADX INFO: renamed from: q */
    void mo7150q(eem eemVar);

    /* JADX INFO: renamed from: r */
    void mo7151r(eem eemVar, BurstSpec burstSpec);

    /* JADX INFO: renamed from: s */
    void mo7152s(eem eemVar);

    /* JADX INFO: renamed from: t */
    void mo7153t(int i);

    /* JADX INFO: renamed from: u */
    void mo7154u(kmg kmgVar);

    /* JADX INFO: renamed from: v */
    void mo7155v(int i);

    /* JADX INFO: renamed from: w */
    boolean mo7156w(kpp kppVar, kmg kmgVar);

    /* JADX INFO: renamed from: x */
    boolean mo7157x(eem eemVar);

    /* JADX INFO: renamed from: y */
    boolean mo7158y(eem eemVar);

    /* JADX INFO: renamed from: z */
    boolean mo7159z(kpp kppVar, kmg kmgVar);
}
