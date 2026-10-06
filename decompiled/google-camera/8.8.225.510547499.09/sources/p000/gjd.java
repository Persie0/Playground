package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.vision.smartcapture.BurstCurator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gjd implements kao {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24954a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24955b;

    public /* synthetic */ gjd(CameraActivityTiming cameraActivityTiming, int i) {
        this.f24955b = i;
        this.f24954a = cameraActivityTiming;
    }

    public /* synthetic */ gjd(fzw fzwVar, int i) {
        this.f24955b = i;
        this.f24954a = fzwVar;
    }

    public /* synthetic */ gjd(gtw gtwVar, int i) {
        this.f24955b = i;
        this.f24954a = gtwVar;
    }

    public /* synthetic */ gjd(hgg hggVar, int i) {
        this.f24955b = i;
        this.f24954a = hggVar;
    }

    public /* synthetic */ gjd(hgh hghVar, int i) {
        this.f24955b = i;
        this.f24954a = hghVar;
    }

    public /* synthetic */ gjd(hgi hgiVar, int i) {
        this.f24955b = i;
        this.f24954a = hgiVar;
    }

    public /* synthetic */ gjd(hjh hjhVar, int i) {
        this.f24955b = i;
        this.f24954a = hjhVar;
    }

    public /* synthetic */ gjd(hpu hpuVar, int i) {
        this.f24955b = i;
        this.f24954a = hpuVar;
    }

    public /* synthetic */ gjd(hth hthVar, int i) {
        this.f24955b = i;
        this.f24954a = hthVar;
    }

    public /* synthetic */ gjd(ika ikaVar, int i) {
        this.f24955b = i;
        this.f24954a = ikaVar;
    }

    public /* synthetic */ gjd(ipi ipiVar, int i) {
        this.f24955b = i;
        this.f24954a = ipiVar;
    }

    public /* synthetic */ gjd(kfc kfcVar, int i) {
        this.f24955b = i;
        this.f24954a = kfcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kfc] */
    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final void mo3483a(Object obj) {
        int i = 4;
        switch (this.f24955b) {
            case 0:
                ?? r0 = this.f24954a;
                mrm mrmVar = (mrm) obj;
                lku.m15662p(mrmVar);
                if (mrmVar.mo16813g()) {
                    r0.mo9414n((kfa) mrmVar.mo16809c());
                    return;
                }
                return;
            case 1:
                ((fzw) this.f24954a).f24001d.mo14894e(ckb.f5966i);
                return;
            case 2:
                BurstCurator burstCurator = (BurstCurator) obj;
                synchronized (this.f24954a) {
                    if (burstCurator != null) {
                        burstCurator.close();
                    }
                    break;
                }
                return;
            case 3:
                Boolean bool = (Boolean) obj;
                hgg hggVar = (hgg) this.f24954a;
                if (hggVar.f27668b.f27686v) {
                    return;
                }
                bool.getClass();
                if (bool.booleanValue()) {
                    hggVar.f27668b.f27683s.mo10304g();
                    jvh.m13562j(hggVar.f27668b.f27683s.mo10299b(), new gjd(hggVar, i), jvh.m13554b());
                    return;
                }
                return;
            case 4:
                ((hgg) this.f24954a).m10242r();
                return;
            case 5:
                Boolean bool2 = (Boolean) obj;
                hgh hghVar = (hgh) this.f24954a;
                if (hghVar.f27669b.f27686v) {
                    return;
                }
                bool2.getClass();
                if (bool2.booleanValue()) {
                    hhi hhiVar = hghVar.f27669b.f27683s;
                    hhiVar.getClass();
                    hhiVar.mo10305h(new hfr(hhiVar, i));
                    return;
                }
                return;
            case 6:
                Boolean bool3 = (Boolean) obj;
                hgi hgiVar = (hgi) this.f24954a;
                if (hgiVar.f27670b.f27686v) {
                    return;
                }
                bool3.getClass();
                if (bool3.booleanValue()) {
                    hhi hhiVar2 = hgiVar.f27670b.f27683s;
                    hhiVar2.getClass();
                    hhiVar2.mo10305h(new hfr(hhiVar2, 5));
                    return;
                }
                return;
            case 7:
                Object obj2 = this.f24954a;
                mrm mrmVar2 = (mrm) obj;
                if (mrmVar2 == null || !mrmVar2.mo16813g()) {
                    return;
                }
                inf infVar = (inf) mrmVar2.mo16809c();
                int i2 = infVar.f31584a;
                if (i2 == 8) {
                    String str = infVar.f31586c;
                    str.getClass();
                    ((hjh) obj2).m10378f(str);
                    return;
                } else if (i2 == 16) {
                    hjh hjhVar = (hjh) obj2;
                    hjhVar.f28044f.m11342g(hjhVar.f28041c);
                    hjhVar.f28040b.mo4326j();
                    return;
                } else {
                    float f = infVar.f31585b;
                    if (f > 0.0f) {
                        ((hjh) obj2).f28040b.mo4322f(f);
                    }
                    hjh hjhVar2 = (hjh) obj2;
                    hjhVar2.m10376d();
                    hjhVar2.f28043e = hjhVar2.f28042d.schedule(new hfr(hjhVar2, 20), 150L, TimeUnit.MILLISECONDS);
                    return;
                }
            case 8:
                Object obj3 = this.f24954a;
                mrm mrmVar3 = (mrm) obj;
                if (mrmVar3 != null && mrmVar3.mo16813g()) {
                    inf infVar2 = (inf) mrmVar3.mo16809c();
                    int i3 = infVar2.f31584a;
                    if (i3 == 8) {
                        String str2 = infVar2.f31586c;
                        str2.getClass();
                        ((hjh) obj3).m10378f(str2);
                        return;
                    } else if (i3 != 16) {
                        hjh hjhVar3 = (hjh) obj3;
                        hjhVar3.f28040b.mo4328l();
                        hjhVar3.m10377e();
                        return;
                    }
                }
                hjh hjhVar4 = (hjh) obj3;
                hjhVar4.f28044f.m11342g(hjhVar4.f28041c);
                if (inr.m11534f(hjhVar4.f28039a) == 3) {
                    hjhVar4.f28044f.m11341f(hjhVar4.f28041c);
                    hjhVar4.f28040b.mo4328l();
                    hjhVar4.m10377e();
                    return;
                }
                return;
            case 9:
                ((hlc) this.f24954a).m10438i(hkp.ACTIVITY_STEADY, CameraActivityTiming.f6961a);
                return;
            case 10:
                Object obj4 = this.f24954a;
                hmq hmqVar = (hmq) obj;
                hmqVar.getClass();
                ((hpu) obj4).m10592a(hmqVar, true);
                return;
            case 11:
                htk htkVar = (htk) obj;
                hth hthVar = (hth) this.f24954a;
                if (hthVar.f29504e.decrementAndGet() <= 0 && !htkVar.m10746b()) {
                    if (htkVar.m10747c()) {
                        hthVar.mo10740h();
                        return;
                    }
                    lku.m15613H((htkVar.m10746b() || htkVar.m10747c()) ? false : true);
                    Bitmap bitmap = htkVar.f29529a;
                    lku.m15662p(bitmap);
                    hthVar.mo10743k(bitmap, htkVar.f29530b);
                    return;
                }
                return;
            case 12:
                ika ikaVar = (ika) this.f24954a;
                if (((Boolean) ikaVar.f31300w.mo3831be()).booleanValue()) {
                    return;
                }
                ikaVar.f31285h.mo9126l();
                return;
            default:
                ((ipi) this.f24954a).f31730b.m10438i(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED, CameraActivityTiming.f6961a);
                return;
        }
    }
}
