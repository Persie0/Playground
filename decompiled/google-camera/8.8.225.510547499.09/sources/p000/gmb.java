package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.smarts.SmartsChipView;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gmb implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25579b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f25580c;

    public /* synthetic */ gmb(AmbientDelegate ambientDelegate, jwf jwfVar, int i, byte[] bArr, byte[] bArr2) {
        this.f25580c = i;
        this.f25578a = ambientDelegate;
        this.f25579b = jwfVar;
    }

    public /* synthetic */ gmb(bkn bknVar, Map.Entry entry, int i, byte[] bArr, byte[] bArr2) {
        this.f25580c = i;
        this.f25579b = bknVar;
        this.f25578a = entry;
    }

    public /* synthetic */ gmb(SmartsChipView smartsChipView, heo heoVar, int i) {
        this.f25580c = i;
        this.f25579b = smartsChipView;
        this.f25578a = heoVar;
    }

    public /* synthetic */ gmb(glf glfVar, kfk kfkVar, int i) {
        this.f25580c = i;
        this.f25579b = glfVar;
        this.f25578a = kfkVar;
    }

    public /* synthetic */ gmb(hac hacVar, gzw gzwVar, int i) {
        this.f25580c = i;
        this.f25578a = hacVar;
        this.f25579b = gzwVar;
    }

    public /* synthetic */ gmb(hjd hjdVar, gfa gfaVar, int i) {
        this.f25580c = i;
        this.f25578a = hjdVar;
        this.f25579b = gfaVar;
    }

    public /* synthetic */ gmb(hjd hjdVar, gfc gfcVar, int i) {
        this.f25580c = i;
        this.f25578a = hjdVar;
        this.f25579b = gfcVar;
    }

    public /* synthetic */ gmb(hpg hpgVar, kfk kfkVar, int i) {
        this.f25580c = i;
        this.f25579b = hpgVar;
        this.f25578a = kfkVar;
    }

    public /* synthetic */ gmb(hto htoVar, chv chvVar, int i) {
        this.f25580c = i;
        this.f25578a = htoVar;
        this.f25579b = chvVar;
    }

    public /* synthetic */ gmb(icr icrVar, ikw ikwVar, int i) {
        this.f25580c = i;
        this.f25579b = icrVar;
        this.f25578a = ikwVar;
    }

    public /* synthetic */ gmb(idg idgVar, gzl gzlVar, int i) {
        this.f25580c = i;
        this.f25578a = idgVar;
        this.f25579b = gzlVar;
    }

    public /* synthetic */ gmb(iht ihtVar, ihx ihxVar, int i) {
        this.f25580c = i;
        this.f25579b = ihtVar;
        this.f25578a = ihxVar;
    }

    public /* synthetic */ gmb(Predicate predicate, gfa gfaVar, int i) {
        this.f25580c = i;
        this.f25578a = predicate;
        this.f25579b = gfaVar;
    }

    public /* synthetic */ gmb(jxb jxbVar, kbg kbgVar, int i) {
        this.f25580c = i;
        this.f25579b = jxbVar;
        this.f25578a = kbgVar;
    }

    public /* synthetic */ gmb(kce kceVar, bkn bknVar, int i, byte[] bArr, byte[] bArr2) {
        this.f25580c = i;
        this.f25578a = kceVar;
        this.f25579b = bknVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kce] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r1v13, types: [heo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v20, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r2v10, types: [chv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        ict ictVar;
        switch (this.f25580c) {
            case 0:
                ?? r0 = this.f25578a;
                Object obj2 = this.f25579b;
                Integer num = (Integer) obj;
                r0.mo13955c(num.intValue());
                ((ktz) ((bkn) obj2).f3651a).m14853e(num.intValue(), "top");
                return;
            case 1:
                Object obj3 = this.f25579b;
                ?? r1 = this.f25578a;
                Boolean bool = (Boolean) obj;
                synchronized (obj3) {
                    if (((glf) obj3).f25472e) {
                        return;
                    }
                    if (!bool.booleanValue()) {
                        ((glf) obj3).f25471d.mo9412l(((glf) obj3).f25473f);
                        gls.m9443e(r1, ((glf) obj3).f25471d);
                        ((glf) obj3).f25471d.close();
                        ((glf) obj3).f25471d = ((glf) obj3).f25469b;
                    } else if (((glf) obj3).f25471d.equals(((glf) obj3).f25469b)) {
                        ((glf) obj3).f25471d = ((glf) obj3).m9418r();
                    }
                    return;
                }
            case 2:
                ((ktz) ((bkn) this.f25579b).f3651a).m14853e(((Integer) obj).intValue(), (String) this.f25578a.getKey());
                return;
            case 3:
                Object obj4 = this.f25578a;
                Object obj5 = this.f25579b;
                if (obj == null) {
                    ((hac) obj4).mo10032d((gzw) obj5);
                    return;
                }
                gzw gzwVar = (gzw) obj5;
                hac hacVar = (hac) obj4;
                if (obj.equals(hacVar.mo10031c(gzwVar))) {
                    return;
                }
                hacVar.mo10033e(gzwVar, obj);
                return;
            case 4:
                Object obj6 = this.f25579b;
                hci hciVarM10111a = hcj.m10111a(this.f25578a);
                SmartsChipView smartsChipView = (SmartsChipView) obj6;
                hciVarM10111a.m10110f(smartsChipView.f6939m);
                hciVarM10111a.m10108d(smartsChipView.f6935i);
                hciVarM10111a.m10107c(smartsChipView.f6936j);
                hciVarM10111a.m10109e(smartsChipView.f6937k);
                smartsChipView.m4293e(hciVarM10111a.m10105a());
                return;
            case 5:
                Object obj7 = this.f25578a;
                ?? r2 = this.f25579b;
                hjd hjdVar = (hjd) obj7;
                if (hjdVar.mo5778n(r2)) {
                    r2.mo9129o(false, hjdVar.f28008a);
                    return;
                }
                return;
            case 6:
                Object obj8 = this.f25578a;
                ?? r3 = this.f25579b;
                hjd hjdVar2 = (hjd) obj8;
                if (hjdVar2.mo5778n(r3)) {
                    r3.mo9129o(false, hjdVar2.f28008a);
                    return;
                }
                return;
            case 7:
                this.f25579b.mo9129o(false, ((hjd) this.f25578a).f28008a);
                return;
            case 8:
                Object obj9 = this.f25578a;
                ?? r4 = this.f25579b;
                hjd hjdVar3 = (hjd) obj9;
                if (hjdVar3.mo5778n(r4)) {
                    r4.mo9129o(false, hjdVar3.f28008a);
                    return;
                }
                return;
            case 9:
                Object obj10 = this.f25578a;
                if (((gfc) obj).equals(this.f25579b)) {
                    return;
                }
                hjd hjdVar4 = (hjd) obj10;
                if (((Boolean) hjdVar4.f28010c.mo10031c(gzy.f26996H)).booleanValue()) {
                    return;
                }
                hjdVar4.f28009b.m10362a();
                return;
            case 10:
                ?? r5 = this.f25578a;
                ?? r6 = this.f25579b;
                if (r5.test(r6)) {
                    r6.mo9129o(false, gev.TAXI);
                    return;
                }
                return;
            case 11:
                Object obj11 = this.f25579b;
                ?? r7 = this.f25578a;
                r7.mo14122i(CaptureRequest.CONTROL_ZOOM_RATIO, (Float) obj);
                r7.mo14122i(CaptureRequest.SCALER_CROP_REGION, ((gef) ((hpg) obj11).f28783P.mo3831be()).f24364b);
                return;
            case 12:
                Object obj12 = this.f25578a;
                ?? r8 = this.f25579b;
                hto htoVar = (hto) obj12;
                if (!htoVar.f29540d) {
                    htoVar.f29540d = true;
                    return;
                } else {
                    r8.mo3764h();
                    htoVar.mo3727a();
                    return;
                }
            case 13:
                Object obj13 = this.f25579b;
                Object obj14 = this.f25578a;
                if (!((Boolean) obj).booleanValue() || (ictVar = (ict) ((icr) obj13).f30374c.get(obj14)) == null) {
                    return;
                }
                ictVar.mo4395i((ikw) obj14, false);
                return;
            case 14:
                Object obj15 = this.f25578a;
                if (((gzl) obj).f26939f != ((gzl) this.f25579b).f26939f) {
                    ((idg) obj15).m11113a();
                    return;
                }
                return;
            case 15:
                Object obj16 = this.f25579b;
                Object obj17 = this.f25578a;
                iht ihtVar = (iht) obj16;
                MainActivityLayout mainActivityLayout = ihtVar.f31004d;
                kbc kbcVar = ((ihx) obj17).f31019a;
                mainActivityLayout.m4466g(kbcVar.f35517a, kbcVar.f35518b, (Integer) ihtVar.f31006f.mo3831be());
                return;
            case 16:
                this.f25578a.mo3415bf(((jxb) this.f25579b).f34981b.m13648h(obj));
                return;
            default:
                Object obj18 = this.f25578a;
                Object obj19 = this.f25579b;
                AmbientDelegate ambientDelegate = (AmbientDelegate) obj18;
                Object obj20 = ambientDelegate.f1687c;
                long j = ((knv) obj20).f36654b;
                ((jwf) obj19).mo3415bf(Long.valueOf(Math.min(j, Math.max(0L, j - (((Long) ((knx) obj20).f36662f.f34942d).longValue() - ((Long) ((jwf) ambientDelegate.f1686b).f34942d).longValue())))));
                return;
        }
    }
}
