package p000;

import android.content.Context;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cnj extends jla {

    /* JADX INFO: renamed from: a */
    private static final nbh f6346a = nbh.m17259h("com/google/android/apps/camera/brella/examplestore/lib/CamExampleStoreService");

    /* JADX INFO: renamed from: a */
    protected abstract cnh mo3986a(Context context, cny cnyVar, cnw cnwVar);

    @Override // p000.jla, p000.jlb
    /* JADX INFO: renamed from: c */
    public final void mo3987c(String str, byte[] bArr, byte[] bArr2, jkz jkzVar, nur nurVar) throws nyb {
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(nwg.f44822c, bArr, 0, bArr.length, nxf.m18011a());
            nxq.m18132ae(nxqVarM18123Q);
            nwg nwgVar = (nwg) nxqVarM18123Q;
            try {
                if (!nwgVar.f44824a.isEmpty() && !"type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria".equals(nwgVar.f44824a)) {
                    throw new nyb(String.format("Incorrect type url: %s, expected: %s", nwgVar.f44824a, "type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria"));
                }
                nwr nwrVar = nwgVar.f44825b;
                nxf nxfVarM18011a = nxf.m18011a();
                cny cnyVar = cny.f6400j;
                nww nwwVarMo17791l = nwrVar.mo17791l();
                nxq nxqVarM18138P = cnyVar.m18138P();
                try {
                    try {
                        try {
                            try {
                                nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                                nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarMo17791l), nxfVarM18011a);
                                nzmVarM18260b.mo18250f(nxqVarM18138P);
                                try {
                                    nwwVarMo17791l.mo17839z(0);
                                    nxq.m18132ae(nxqVarM18138P);
                                    cny cnyVar2 = (cny) nxqVarM18138P;
                                    nzw nzwVar = cnyVar2.f6406e;
                                    if (nzwVar == null) {
                                        nzwVar = nzw.f45101c;
                                    }
                                    if (nzwVar.f45103a < 0) {
                                        throw new nyb(HEePJw.RLhuWHnnteumqr);
                                    }
                                    nzw nzwVar2 = cnyVar2.f6406e;
                                    if ((nzwVar2 == null ? nzw.f45101c : nzwVar2).f45104b >= 0) {
                                        if ((nzwVar2 == null ? nzw.f45101c : nzwVar2).f45104b <= 999999999) {
                                            nzw nzwVar3 = cnyVar2.f6407f;
                                            if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45103a < 0) {
                                                throw new nyb("End date less than zero");
                                            }
                                            if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b >= 0) {
                                                if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b <= 999999999) {
                                                    if (nzwVar3 == null) {
                                                        nzwVar3 = nzw.f45101c;
                                                    }
                                                    long j = nzwVar3.f45103a;
                                                    if (nzwVar2 == null) {
                                                        nzwVar2 = nzw.f45101c;
                                                    }
                                                    if (j < nzwVar2.f45103a) {
                                                        throw new nyb("End date before start date");
                                                    }
                                                    if (cnyVar2.f6409h.isEmpty()) {
                                                        throw new nyb("No table specified to select examples.");
                                                    }
                                                    try {
                                                        nxq nxqVarM18123Q2 = nxq.m18123Q(cnw.f6395c, bArr2, 0, bArr2.length, nxf.m18011a());
                                                        nxq.m18132ae(nxqVarM18123Q2);
                                                        jkzVar.mo13328b(mo3986a(getApplicationContext(), cnyVar2, (cnw) nxqVarM18123Q2));
                                                        return;
                                                    } catch (nyb e) {
                                                        ((nbe) ((nbe) ((nbe) f6346a.m17252c()).mo17283h(e)).mo17276G((char) 313)).mo17290o("Error parsing ResumptionPoint proto: ");
                                                        jkzVar.mo13327a(10, e.getMessage());
                                                        return;
                                                    }
                                                }
                                            }
                                            throw new nyb("Invalid end date nanos");
                                        }
                                    }
                                    throw new nyb("Invalid start date nanos");
                                } catch (nyb e2) {
                                    throw e2;
                                }
                            } catch (nyb e3) {
                                if (!e3.f44994a) {
                                    throw e3;
                                }
                                throw new nyb(e3);
                            }
                        } catch (nzx e4) {
                            throw e4.m18328a();
                        }
                    } catch (RuntimeException e5) {
                        if (!(e5.getCause() instanceof nyb)) {
                            throw e5;
                        }
                        throw ((nyb) e5.getCause());
                    }
                } catch (IOException e6) {
                    if (!(e6.getCause() instanceof nyb)) {
                        throw new nyb(e6);
                    }
                    throw ((nyb) e6.getCause());
                }
            } catch (nyb e7) {
                ((nbe) ((nbe) ((nbe) f6346a.m17252c()).mo17283h(e7)).mo17276G((char) 314)).mo17290o("Error parsing SelectionCriteria proto: ");
                jkzVar.mo13327a(10, "Error parsing SelectionCriteria proto: ".concat(String.valueOf(e7.getMessage())));
            }
        } catch (nyb e8) {
            ((nbe) ((nbe) f6346a.m17252c()).mo17276G((char) 315)).mo17290o("Error parsing Any proto from criteria");
            jkzVar.mo13327a(10, "Error parsing Any proto from criteria");
        }
    }
}
