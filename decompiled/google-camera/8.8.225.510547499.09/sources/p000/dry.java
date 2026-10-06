package p000;

import java.util.List;
import p021j$.time.Instant;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dry implements dsr {

    /* JADX INFO: renamed from: a */
    private static final nbh f12461a = nbh.m17259h("com/google/android/apps/camera/faceobfuscation/FaceRegionOfInterestSelectorFrequentFacesImpl");

    /* JADX INFO: renamed from: b */
    private final mrm f12462b;

    public dry(mrm mrmVar) {
        this.f12462b = mrmVar;
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Collection] */
    @Override // p000.dsr
    /* JADX INFO: renamed from: a */
    public final List mo6645a(List list, mrm mrmVar) {
        jzk jzkVarMo6935b;
        mrm mrmVar2 = this.f12462b;
        if (mrmVar2.mo16813g()) {
            dyl dylVar = (dyl) mrmVar2.mo16809c();
            Instant instant = (Instant) ((mrq) mrmVar).f41482a;
            int i = nne.f43936a;
            jzkVarMo6935b = dylVar.mo6935b(instant.getEpochSecond() < -9223372036L ? kxk.m14994al(kxk.m14995am(instant.getEpochSecond() + 1, 1000000000L), instant.getNano() - 1000000000) : kxk.m14994al(kxk.m14995am(instant.getEpochSecond(), 1000000000L), instant.getNano()));
        } else {
            ((nbe) ((nbe) f12461a.m17252c()).mo17276G((char) 1117)).mo17290o("Frequent faces buffer isn't present.");
            jzkVarMo6935b = null;
        }
        if (jzkVarMo6935b == null) {
            return mws.m17095j(list);
        }
        return (List) Collection$EL.stream(list).filter(new dam((mxk) Collection$EL.stream(jzkVarMo6935b.f35297b).filter(new cdy(15)).map(cqk.f8929p).collect(muc.f41627b), 7)).collect(muc.f41626a);
    }
}
