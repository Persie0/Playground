package p000;

import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p021j$.time.Instant;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dgt implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10973a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10974b;

    public /* synthetic */ dgt(dgu dguVar, int i) {
        this.f10974b = i;
        this.f10973a = dguVar;
    }

    public /* synthetic */ dgt(djr djrVar, int i) {
        this.f10974b = i;
        this.f10973a = djrVar;
    }

    public /* synthetic */ dgt(djs djsVar, int i) {
        this.f10974b = i;
        this.f10973a = djsVar;
    }

    public /* synthetic */ dgt(djv djvVar, int i) {
        this.f10974b = i;
        this.f10973a = djvVar;
    }

    public /* synthetic */ dgt(dlp dlpVar, int i) {
        this.f10974b = i;
        this.f10973a = dlpVar;
    }

    public /* synthetic */ dgt(dlx dlxVar, int i) {
        this.f10974b = i;
        this.f10973a = dlxVar;
    }

    public /* synthetic */ dgt(dnc dncVar, int i) {
        this.f10974b = i;
        this.f10973a = dncVar;
    }

    public /* synthetic */ dgt(dnf dnfVar, int i) {
        this.f10974b = i;
        this.f10973a = dnfVar;
    }

    public /* synthetic */ dgt(dnh dnhVar, int i) {
        this.f10974b = i;
        this.f10973a = dnhVar;
    }

    public /* synthetic */ dgt(dpc dpcVar, int i) {
        this.f10974b = i;
        this.f10973a = dpcVar;
    }

    public /* synthetic */ dgt(dpo dpoVar, int i) {
        this.f10974b = i;
        this.f10973a = dpoVar;
    }

    public /* synthetic */ dgt(dpz dpzVar, int i) {
        this.f10974b = i;
        this.f10973a = dpzVar;
    }

    public /* synthetic */ dgt(dqs dqsVar, int i) {
        this.f10974b = i;
        this.f10973a = dqsVar;
    }

    public /* synthetic */ dgt(drf drfVar, int i) {
        this.f10974b = i;
        this.f10973a = drfVar;
    }

    public /* synthetic */ dgt(drm drmVar, int i) {
        this.f10974b = i;
        this.f10973a = drmVar;
    }

    public /* synthetic */ dgt(ohb ohbVar, int i) {
        this.f10974b = i;
        this.f10973a = ohbVar;
    }

    public /* synthetic */ dgt(oju ojuVar, int i) {
        this.f10974b = i;
        this.f10973a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, ohb] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zM3826a;
        switch (this.f10974b) {
            case 0:
                ((dgu) this.f10973a).m6127g();
                return;
            case 1:
                ((dgu) this.f10973a).m6125e();
                return;
            case 2:
                Object obj = this.f10973a;
                djr djrVar = (djr) obj;
                djrVar.f11800f.mo13961e("CameraFilmstripDataAdapter#queryFilmStrip");
                Instant instantMo3748h = djrVar.f11801g ? djrVar.f11806l : Instant.EPOCH;
                chp chpVarM6295b = djrVar.m6256s().m6295b();
                Instant instantMo3747g = chpVarM6295b != null ? chpVarM6295b.mo3733b().mo3747g() : instantMo3748h;
                if (chpVarM6295b != null) {
                    instantMo3748h = chpVarM6295b.mo3733b().mo3748h();
                }
                djrVar.f11800f.mo13961e("CameraFilmstripDataAdapter#queryFilmStrip#querySince");
                try {
                    mwn mwnVarM17090e = mws.m17090e();
                    dkg dkgVar = ((djr) obj).f11799e;
                    dkc dkcVar = dkgVar.f11888f;
                    mwnVarM17090e.m17083h((List) Collection$EL.stream(dkcVar.m6289d(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, dkc.f11869c, instantMo3747g.toEpochMilli(), instantMo3748h.getEpochSecond(), 5, new cwp(dkcVar, 3))).map(new cwp(dkgVar, 5)).collect(Collectors.toList()));
                    cvy cvyVar = ((djr) obj).f11809o;
                    Object obj2 = cvyVar.f9844a;
                    byte[] bArr = null;
                    mwnVarM17090e.m17083h((List) Collection$EL.stream(((dkc) obj2).m6289d(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, dkc.f11869c, instantMo3747g.toEpochMilli(), instantMo3748h.getEpochSecond(), 5, new cwp((dkc) obj2, 4))).map(new cwp(cvyVar, 6, bArr, bArr)).collect(Collectors.toList()));
                    mws mwsVarM17081f = mwnVarM17090e.m17081f();
                    int i = ((mzr) mwsVarM17081f).f41859c;
                    ((djr) obj).f11800f.mo13963g("CameraFilmstripDataAdapter#queryFilmStrip#loadMetadata");
                    nba it = mwsVarM17081f.iterator();
                    while (it.hasNext()) {
                        ((djr) obj).f11810p.m2605A(((djr) obj).f11798d, (chp) it.next());
                    }
                    if (((djr) obj).f11802h.m6294a() == 0) {
                        ((djr) obj).f11802h.m6300g(mwsVarM17081f);
                    } else {
                        nba it2 = mwsVarM17081f.iterator();
                        while (it2.hasNext()) {
                            ((djr) obj).f11802h.m6304k((chp) it2.next());
                        }
                    }
                    return;
                } finally {
                    djrVar.f11800f.mo13962f();
                    djrVar.f11800f.mo13962f();
                }
            case 3:
                ((djr) this.f10973a).f11797c.mo3811b(null);
                return;
            case 4:
                djr djrVar2 = (djr) this.f10973a;
                if (((Boolean) djrVar2.f11805k.mo10031c(gzy.f27036at)).booleanValue()) {
                    djrVar2.f11800f.mo13961e("CameraFilmstripDataAdapter#removeMarsDeletedItems");
                    ArrayList arrayList = new ArrayList(djrVar2.f11803i.m6294a());
                    Iterator it3 = djrVar2.f11803i.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((chp) it3.next()).mo3733b().mo3743c());
                    }
                    Map mapM6273a = djrVar2.f11807m.m6273a(arrayList);
                    djrVar2.f11800f.mo13962f();
                    djrVar2.f11800f.mo13961e("RemoveDeletedMarsItems");
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Uri uri = (Uri) arrayList.get(i2);
                        if (!Boolean.TRUE.equals(mapM6273a.get(uri))) {
                            djrVar2.f11803i.m6302i(uri);
                        }
                    }
                    djrVar2.f11800f.mo13962f();
                }
                chp chpVarM6299f = djrVar2.f11802h.m6299f();
                if (chpVarM6299f == null) {
                    return;
                }
                djrVar2.f11800f.mo13961e("CameraFilmstripDataAdapter#removeDeletedItems");
                ArrayList arrayList2 = new ArrayList();
                Instant instantMo3747g2 = chpVarM6299f.mo3733b().mo3747g();
                Instant instantMo3748h2 = chpVarM6299f.mo3733b().mo3748h();
                HashSet hashSet = new HashSet();
                hashSet.addAll(djrVar2.f11799e.f11888f.m6290e(instantMo3747g2, instantMo3748h2, false));
                hashSet.addAll(((dkc) djrVar2.f11809o.f9844a).m6290e(instantMo3747g2, instantMo3748h2, true));
                Iterator it4 = djrVar2.f11802h.iterator();
                while (it4.hasNext()) {
                    chq chqVarMo3733b = ((chp) it4.next()).mo3733b();
                    if (!chqVarMo3733b.mo3750j() && !hashSet.contains(chqVarMo3733b.mo3743c())) {
                        arrayList2.add(chqVarMo3733b.mo3743c());
                    }
                }
                djrVar2.f11800f.mo13962f();
                cdu cduVar = djrVar2.f11808n;
                synchronized (cduVar.f5331a) {
                    zM3826a = cduVar.f5337g.m3826a();
                    break;
                }
                if (zM3826a) {
                    ((nbe) ((nbe) djr.f11795a.m17252c()).mo17276G((char) 922)).mo17290o("Activity is destroyed. Canceling load.");
                    return;
                }
                djrVar2.f11800f.mo13961e("RemoveDeleted");
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    djrVar2.f11802h.m6302i((Uri) arrayList2.get(i3));
                }
                djrVar2.f11800f.mo13962f();
                return;
            case 5:
                ((djv) this.f10973a).mo3727a();
                return;
            case 6:
                try {
                    gxq gxqVar = ((djs) this.f10973a).f11816b;
                    gxqVar.m9940b(false);
                    if (gxqVar.f26741b.mo6184l(dib.f11305bL)) {
                        gxqVar.m9940b(true);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    ((nbe) ((nbe) ((nbe) djs.f11815a.m17251b()).mo17283h(e)).mo17276G((char) 930)).mo17290o("Failed to restore JPEG files");
                    return;
                }
            case 7:
                ((dlp) this.f10973a).f11970d.mo13942d("showing \"Possible shot loss\" warning");
                return;
            case 8:
                dlx dlxVar = (dlx) this.f10973a;
                dlxVar.f11996d.mo13940b(HRLmc.nzXTVeIJa);
                Instant instantMinus = dlxVar.f11997e.instant().minus(dlx.f11995c);
                dlz dlzVar = dlxVar.f11999g;
                long epochMilli = instantMinus.toEpochMilli();
                dmf dmfVar = (dmf) dlzVar;
                dmfVar.f12013a.m1824l();
                arf arfVarM1853e = dmfVar.f12015c.m1853e();
                arfVarM1853e.mo1845e(1, epochMilli);
                dmfVar.f12013a.m1825m();
                try {
                    int iM1883a = arfVarM1853e.m1883a();
                    ((dmf) dlzVar).f12013a.m1829q();
                    dmfVar.f12013a.m1827o();
                    dmfVar.f12015c.m1855g(arfVarM1853e);
                    if (iM1883a > 0) {
                        dlxVar.f11996d.mo13940b("deleted " + iM1883a + " rows");
                    }
                    dlxVar.m6380m();
                    return;
                } catch (Throwable th) {
                    dmfVar.f12013a.m1827o();
                    dmfVar.f12015c.m1855g(arfVarM1853e);
                    throw th;
                }
            case 9:
                ((dnc) this.f10973a).m6426i();
                return;
            case 10:
                dnf dnfVar = (dnf) this.f10973a;
                dnfVar.m6429b();
                dnfVar.m6430c();
                return;
            case 11:
                ((dnh) this.f10973a).m6432a();
                return;
            case 12:
                ((DynamicDepthUtils) this.f10973a.get()).m4096a().run();
                return;
            case 13:
                ((glz) ((mrq) ((dpc) this.f10973a).f12179c).f41482a).mo9465i();
                return;
            case 14:
                dpo dpoVar = (dpo) this.f10973a;
                ((dpe) dpoVar.f12219b.get()).mo6544c(true);
                if (((dot) dpoVar.f12222e.mo3831be()).equals(dot.SINGLE) || !((Boolean) ((jwf) dpoVar.f12227j).f34942d).booleanValue()) {
                    return;
                }
                lku.m15613H(true);
                ((glz) ((mrq) dpoVar.f12226i).f41482a).mo9463g();
                return;
            case 15:
                FaceBeautificationNative.releaseHandle(((dpz) this.f10973a).f12274d);
                return;
            case 16:
                ((dqn) this.f10973a).get().run();
                return;
            case 17:
                this.f10973a.get();
                return;
            case 18:
                ((dqs) this.f10973a).m6602b();
                return;
            case 19:
                Object obj3 = this.f10973a;
                synchronized (((drf) obj3).f12385a) {
                    ((drf) obj3).f12386b = GpuRetoucherNative.createRetoucher(false, 1);
                    break;
                }
                return;
            default:
                ((drm) this.f10973a).m6642a();
                return;
        }
    }
}
