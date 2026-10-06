package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24214a;

    /* JADX INFO: renamed from: b */
    private final oju f24215b;

    /* JADX INFO: renamed from: c */
    private final oju f24216c;

    /* JADX INFO: renamed from: d */
    private final oju f24217d;

    /* JADX INFO: renamed from: e */
    private final oju f24218e;

    /* JADX INFO: renamed from: f */
    private final oju f24219f;

    /* JADX INFO: renamed from: g */
    private final oju f24220g;

    /* JADX INFO: renamed from: h */
    private final oju f24221h;

    /* JADX INFO: renamed from: i */
    private final oju f24222i;

    /* JADX INFO: renamed from: j */
    private final oju f24223j;

    /* JADX INFO: renamed from: k */
    private final /* synthetic */ int f24224k;

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i) {
        this.f24224k = i;
        this.f24214a = ojuVar;
        this.f24215b = ojuVar2;
        this.f24216c = ojuVar3;
        this.f24217d = ojuVar4;
        this.f24218e = ojuVar5;
        this.f24219f = ojuVar6;
        this.f24220g = ojuVar7;
        this.f24221h = ojuVar8;
        this.f24222i = ojuVar9;
        this.f24223j = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, byte[] bArr) {
        this.f24224k = i;
        this.f24215b = ojuVar;
        this.f24216c = ojuVar2;
        this.f24214a = ojuVar3;
        this.f24222i = ojuVar4;
        this.f24219f = ojuVar5;
        this.f24223j = ojuVar6;
        this.f24220g = ojuVar7;
        this.f24221h = ojuVar8;
        this.f24217d = ojuVar9;
        this.f24218e = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, char[] cArr) {
        this.f24224k = i;
        this.f24221h = ojuVar;
        this.f24217d = ojuVar2;
        this.f24218e = ojuVar3;
        this.f24216c = ojuVar4;
        this.f24219f = ojuVar5;
        this.f24220g = ojuVar6;
        this.f24223j = ojuVar7;
        this.f24215b = ojuVar8;
        this.f24214a = ojuVar9;
        this.f24222i = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, float[] fArr) {
        this.f24224k = i;
        this.f24223j = ojuVar;
        this.f24218e = ojuVar2;
        this.f24222i = ojuVar3;
        this.f24215b = ojuVar4;
        this.f24216c = ojuVar5;
        this.f24214a = ojuVar6;
        this.f24219f = ojuVar7;
        this.f24220g = ojuVar8;
        this.f24221h = ojuVar9;
        this.f24217d = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, int[] iArr) {
        this.f24224k = i;
        this.f24223j = ojuVar;
        this.f24221h = ojuVar2;
        this.f24217d = ojuVar3;
        this.f24222i = ojuVar4;
        this.f24216c = ojuVar5;
        this.f24219f = ojuVar6;
        this.f24220g = ojuVar7;
        this.f24218e = ojuVar8;
        this.f24214a = ojuVar9;
        this.f24215b = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, short[] sArr) {
        this.f24224k = i;
        this.f24221h = ojuVar;
        this.f24218e = ojuVar2;
        this.f24220g = ojuVar3;
        this.f24214a = ojuVar4;
        this.f24216c = ojuVar5;
        this.f24223j = ojuVar6;
        this.f24219f = ojuVar7;
        this.f24222i = ojuVar8;
        this.f24217d = ojuVar9;
        this.f24215b = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, boolean[] zArr) {
        this.f24224k = i;
        this.f24215b = ojuVar;
        this.f24219f = ojuVar2;
        this.f24217d = ojuVar3;
        this.f24216c = ojuVar4;
        this.f24218e = ojuVar5;
        this.f24214a = ojuVar6;
        this.f24221h = ojuVar7;
        this.f24223j = ojuVar8;
        this.f24220g = ojuVar9;
        this.f24222i = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, byte[][] bArr) {
        this.f24224k = i;
        this.f24217d = ojuVar;
        this.f24218e = ojuVar2;
        this.f24214a = ojuVar3;
        this.f24221h = ojuVar4;
        this.f24223j = ojuVar5;
        this.f24219f = ojuVar6;
        this.f24216c = ojuVar7;
        this.f24215b = ojuVar8;
        this.f24220g = ojuVar9;
        this.f24222i = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, char[][] cArr) {
        this.f24224k = i;
        this.f24214a = ojuVar;
        this.f24221h = ojuVar2;
        this.f24222i = ojuVar3;
        this.f24223j = ojuVar4;
        this.f24216c = ojuVar5;
        this.f24218e = ojuVar6;
        this.f24215b = ojuVar7;
        this.f24217d = ojuVar8;
        this.f24220g = ojuVar9;
        this.f24219f = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, int[][] iArr) {
        this.f24224k = i;
        this.f24215b = ojuVar;
        this.f24218e = ojuVar2;
        this.f24219f = ojuVar3;
        this.f24221h = ojuVar4;
        this.f24216c = ojuVar5;
        this.f24223j = ojuVar6;
        this.f24217d = ojuVar7;
        this.f24220g = ojuVar8;
        this.f24222i = ojuVar9;
        this.f24214a = ojuVar10;
    }

    public gcr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, int i, short[][] sArr) {
        this.f24224k = i;
        this.f24215b = ojuVar;
        this.f24221h = ojuVar2;
        this.f24216c = ojuVar3;
        this.f24220g = ojuVar4;
        this.f24222i = ojuVar5;
        this.f24219f = ojuVar6;
        this.f24218e = ojuVar7;
        this.f24223j = ojuVar8;
        this.f24217d = ojuVar9;
        this.f24214a = ojuVar10;
    }

    /* JADX INFO: renamed from: a */
    public static gcr m9059a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        return new gcr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, 0);
    }

    /* JADX INFO: renamed from: b */
    public static gcr m9060b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        return new gcr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static gcr m9061c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        return new gcr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static gcr m9062d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        return new gcr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static gcr m9063e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10) {
        return new gcr(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, 4, (int[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        mrm mrmVar;
        switch (this.f24224k) {
            case 0:
                kbn kbnVar = ((dki) this.f24214a).get();
                jwn jwnVar = (jwn) this.f24215b.get();
                C1058va c1058vaM9374b = ((gkr) this.f24216c).get();
                gjq gjqVar = ((gjr) this.f24217d).get();
                mrm mrmVar2 = (mrm) this.f24218e.get();
                gbi gbiVar = (gbi) this.f24219f.get();
                gib gibVar = (gib) this.f24220g.get();
                ggx ggxVar = (ggx) this.f24221h.get();
                goo gooVar = (goo) this.f24222i.get();
                dhv dhvVar = (dhv) this.f24223j.get();
                mxk mxkVarM9300a = giy.m9300a(dhvVar.mo6184l(dib.f11252aL));
                gbe gbeVar = new gbe(gbiVar, 5, false);
                gbe gbeVar2 = new gbe(gjqVar.m9341a(ggxVar, gibVar, gooVar), 6, true);
                gbe gbeVar3 = new gbe(c1058vaM9374b.m19485m(mxkVarM9300a, gbeVar), 7, false);
                gbe gbeVar4 = mrmVar2.mo16813g() ? new gbe(((gjw) mrmVar2.mo16809c()).m9348a(gjqVar.m9341a(ggxVar, new gie(dhvVar), gooVar)), 5, false) : null;
                return new gka(kbnVar, new gaz(jwnVar, gbeVar3, gbeVar2, gbeVar3, gbeVar2, gbeVar3, gbeVar4 == null ? gbeVar2 : gbeVar4), 1);
            case 1:
                return new hee(((fxj) this.f24215b).m8922a(), ohh.m18485a(this.f24216c), ohh.m18485a(this.f24214a), ohh.m18485a(this.f24222i), (Executor) this.f24219f.get(), ((dki) this.f24223j).get(), (kbz) this.f24220g.get(), (inm) this.f24221h.get(), (dhv) this.f24217d.get(), (jwn) this.f24218e.get());
            case 2:
                kfc kfcVar = (kfc) this.f24221h.get();
                jvb jvbVar = (jvb) this.f24217d.get();
                gdh gdhVar = new gdh(kfcVar, ((gdk) this.f24218e).get(), (gde) this.f24216c.get(), (fwo) this.f24219f.get(), (gdw) this.f24220g.get(), (gva) this.f24223j.get(), (Executor) this.f24215b.get(), ((ohm) this.f24214a).get(), (kbz) this.f24222i.get(), null);
                synchronized (gdhVar.f24294b) {
                    if (!gdhVar.f24300h) {
                        gdhVar.f24302j = true;
                        gdhVar.m9075b();
                    }
                }
                jvbVar.m13537d(gdhVar);
                return gdhVar;
            case 3:
                kmd kmdVar = ((fxk) this.f24221h).get();
                Set set = ((ohm) this.f24218e).get();
                Set set2 = ((ohm) this.f24220g).get();
                ggs ggsVar = (ggs) this.f24214a.get();
                kgb kgbVar = (kgb) this.f24216c.get();
                kgb kgbVar2 = (kgb) this.f24223j.get();
                dni dniVar = (dni) this.f24219f.get();
                mxk mxkVar = (mxk) this.f24222i.get();
                dhv dhvVar2 = (dhv) this.f24217d.get();
                kfm kfmVarM14151a = kfn.m14151a();
                kfmVarM14151a.m14145f(kmdVar.mo14556i());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    kfmVarM14151a.m14143d((kgi) it.next());
                }
                if (!set2.isEmpty()) {
                    kfmVarM14151a.m14142c(set2);
                }
                kfmVarM14151a.m14150k(ggsVar);
                kfmVarM14151a.m14144e(dniVar);
                kfmVarM14151a.m14149j(kgbVar);
                kfmVarM14151a.m14148i(kgbVar2);
                kfmVarM14151a.m14147h(mxkVar);
                dhx dhxVar = dib.f11240a;
                dhvVar2.mo6177e();
                return kfmVarM14151a.m14140a();
            case 4:
                djm djmVar = (djm) this.f24223j.get();
                fvu fvuVarM8922a = ((fxj) this.f24221h).m8922a();
                kfk kfkVar = (kfk) this.f24217d.get();
                mrm mrmVar3 = (mrm) this.f24222i.get();
                mrm mrmVar4 = (mrm) this.f24216c.get();
                mrm mrmVar5 = (mrm) this.f24219f.get();
                mrm mrmVar6 = (mrm) this.f24220g.get();
                oju ojuVar = this.f24218e;
                dhv dhvVar3 = (dhv) this.f24214a.get();
                ikw ikwVarM11415a = ((ikv) this.f24215b).m11415a();
                if (dhvVar3.mo6184l(did.f11436ao) || ((fvuVarM8922a.mo14558k() != kmq.f36557a || djmVar.m6221B()) && (fvuVarM8922a.mo14558k() != kmq.BACK || djmVar.m6222C()))) {
                    mrmVar = mrmVar6;
                } else {
                    gmz.m9537e(ikwVarM11415a, dhvVar3);
                    mrmVar = mqu.f41450a;
                }
                if (mrmVar3.mo16813g()) {
                    return gmz.m9536d(kfkVar, mxk.m17136H((kgg) mrmVar3.mo16809c()), mrmVar, mrmVar4, mrmVar5, ((ohm) ojuVar).get());
                }
                return mqu.f41450a;
            case 5:
                return new gni((dsx) this.f24215b.get(), (DynamicDepthUtils) this.f24219f.get(), (gva) this.f24217d.get(), ((ebo) this.f24216c).get(), ((cen) this.f24218e).get(), ((geb) this.f24214a).get(), (djm) this.f24221h.get(), (Executor) this.f24223j.get(), (kbz) this.f24220g.get(), (bko) this.f24222i.get(), null, null, null, null);
            case 6:
                return new guz(((dws) this.f24223j).m6830a(), ((hzr) this.f24218e).get(), (djm) this.f24222i.get(), (BottomBarController) this.f24215b.get(), (icf) this.f24216c.get(), (gva) this.f24214a.get(), ((iig) this.f24219f).get(), ((emc) this.f24220g).get(), (hht) this.f24221h.get(), (npk) this.f24217d.get(), null, null, null, null);
            case 7:
                return new hdk((htb) this.f24217d.get(), (hec) this.f24218e.get(), (hdt) this.f24214a.get(), (jvd) this.f24221h.get(), gtd.m9735q(), (gye) this.f24223j.get(), this.f24219f, (jww) this.f24216c.get(), (jww) this.f24215b.get(), ((efm) this.f24220g).m7271b(), (kbz) this.f24222i.get(), null);
            case 8:
                return new hvz((jww) this.f24214a.get(), (BottomBarController) this.f24221h.get(), (igb) this.f24222i.get(), (hxp) this.f24223j.get(), (icf) this.f24216c.get(), (gfa) this.f24218e.get(), (bkn) this.f24215b.get(), (jww) this.f24217d.get(), ((ity) this.f24220g).get(), (hsk) this.f24219f.get(), null, null, null);
            case 9:
                return new hwd((jww) this.f24215b.get(), (BottomBarController) this.f24221h.get(), (igb) this.f24216c.get(), ((ity) this.f24220g).get(), ((emb) this.f24222i).get(), (hxp) this.f24219f.get(), (cwd) this.f24218e.get(), (gfa) this.f24223j.get(), (icf) this.f24217d.get(), (huy) this.f24214a.get(), null, null, null);
            default:
                return new ihm(((dws) this.f24215b).m6830a(), ((dki) this.f24218e).get(), ((iig) this.f24219f).get(), (CameraActivityTiming) this.f24221h.get(), (hkx) this.f24216c.get(), (ihx) this.f24223j.get(), (dhv) this.f24217d.get(), (kbz) this.f24220g.get(), (mrm) this.f24222i.get(), ((iho) this.f24214a).get());
        }
    }
}
