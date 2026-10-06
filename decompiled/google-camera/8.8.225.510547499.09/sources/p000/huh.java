package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.android.apps.camera.p014ui.hotshot.HotshotView;
import com.google.android.apps.camera.p014ui.mars.MarsSwitch;
import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class huh implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f29584a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29585b;

    public /* synthetic */ huh(LinearLayout linearLayout, int i) {
        this.f29585b = i;
        this.f29584a = linearLayout;
    }

    public /* synthetic */ huh(LongPressElapsedTimeView longPressElapsedTimeView, int i) {
        this.f29585b = i;
        this.f29584a = longPressElapsedTimeView;
    }

    public /* synthetic */ huh(cwd cwdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29585b = i;
        this.f29584a = cwdVar;
    }

    public /* synthetic */ huh(hsq hsqVar, int i, byte[] bArr) {
        this.f29585b = i;
        this.f29584a = hsqVar;
    }

    public /* synthetic */ huh(huu huuVar, int i) {
        this.f29585b = i;
        this.f29584a = huuVar;
    }

    public /* synthetic */ huh(hxy hxyVar, int i) {
        this.f29585b = i;
        this.f29584a = hxyVar;
    }

    public /* synthetic */ huh(hxz hxzVar, int i) {
        this.f29585b = i;
        this.f29584a = hxzVar;
    }

    public /* synthetic */ huh(hys hysVar, int i) {
        this.f29585b = i;
        this.f29584a = hysVar;
    }

    public /* synthetic */ huh(iad iadVar, int i) {
        this.f29585b = i;
        this.f29584a = iadVar;
    }

    public /* synthetic */ huh(iak iakVar, int i) {
        this.f29585b = i;
        this.f29584a = iakVar;
    }

    public /* synthetic */ huh(igb igbVar, int i) {
        this.f29585b = i;
        this.f29584a = igbVar;
    }

    public /* synthetic */ huh(ktz ktzVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29585b = i;
        this.f29584a = ktzVar;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [fcp, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        kba kbaVarMo11297a;
        int i = 16;
        final int i2 = 1;
        final int i3 = 0;
        switch (this.f29585b) {
            case 0:
                ((huu) this.f29584a).m10771s().setVisibility(0);
                break;
            case 1:
                ((cwd) this.f29584a).m5661h();
                break;
            case 2:
                ((hxy) this.f29584a).m10861l();
                break;
            case 3:
                ((hxy) this.f29584a).f29859a.setVisibility(0);
                break;
            case 4:
                hxy hxyVar = (hxy) this.f29584a;
                hxyVar.f29859a.setVisibility(8);
                hxyVar.m10860k();
                break;
            case 5:
                ((LinearLayout) this.f29584a).setVisibility(0);
                break;
            case 6:
                ((hxz) this.f29584a).f29879a.setVisibility(8);
                break;
            case 7:
                ((hxz) this.f29584a).f29879a.setVisibility(0);
                break;
            case 8:
                LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) this.f29584a;
                ImageView imageView = longPressElapsedTimeView.f7018c;
                if (imageView != null) {
                    if (imageView.getVisibility() == 0) {
                        longPressElapsedTimeView.f7018c.setVisibility(4);
                    } else {
                        longPressElapsedTimeView.f7018c.setVisibility(0);
                    }
                    longPressElapsedTimeView.postDelayed(longPressElapsedTimeView.f7019d, 500L);
                }
                break;
            case 9:
                hys hysVar = (hys) this.f29584a;
                hyz hyzVar = hysVar.f29959f;
                hyv hyvVar = hysVar.f29969p;
                mrm mrmVar = hyzVar.f30000b;
                if (mrmVar.mo16813g() && hyzVar.f30001c) {
                    HotshotView hotshotView = (HotshotView) mrmVar.mo16809c();
                    hotshotView.f7030d = hyvVar;
                    hotshotView.invalidate();
                    break;
                }
                break;
            case 10:
                hys hysVar2 = (hys) this.f29584a;
                hyq hyqVar = hysVar2.f29975v;
                Context context = hysVar2.f29957d;
                if (hyqVar.f29948c.m13088X("hotshot_first_time_edu") == 0) {
                    hyqVar.m10877a(context);
                    hyqVar.f29948c.m13090Z("hotshot_first_time_edu");
                    hyqVar.f29947b = true;
                }
                hyz hyzVar2 = hysVar2.f29959f;
                mrm mrmVar2 = hyzVar2.f30000b;
                if (!mrmVar2.mo16813g()) {
                    ((nbe) ((nbe) hyz.f29999a.m17251b()).mo17276G((char) 4043)).mo17290o("startHotshot, view is not present.");
                } else {
                    if (mrmVar2.mo16813g()) {
                        dhx dhxVar = dib.f11240a;
                        ((nbe) ((nbe) HotshotView.f7027a.m17252c()).mo17276G((char) 4037)).mo17293r("Set Hotshot Debug mode for ObjectDetection %b", false);
                        ((nbe) ((nbe) HotshotView.f7027a.m17252c()).mo17276G((char) 4036)).mo17293r("Set Hotshot Debug mode %b", false);
                    }
                    hyzVar2.m10888a(true);
                    hyzVar2.f30001c = true;
                }
                break;
            case 11:
                hys hysVar3 = (hys) this.f29584a;
                if (hysVar3.f29966m) {
                    hysVar3.f29961h.execute(new huh(hysVar3, 9));
                    hyv hyvVar2 = hysVar3.f29969p;
                    if (!hyvVar2.equals(hysVar3.f29970q)) {
                        switch (hyvVar2) {
                            case READY_TO_CAPTURE:
                                hysVar3.f29956c.mo10321g();
                                hysVar3.f29956c.mo10320f(C0100R.raw.hotshot_ready_to_capture, 2);
                                dpx dpxVar = hysVar3.f29958e;
                                dpxVar.f12250c.announceForAccessibility(dpxVar.f12249b.getString(C0100R.string.ready_for_selfie));
                                break;
                            case DISTANCE_1:
                                hysVar3.f29956c.mo10321g();
                                hysVar3.f29956c.mo10320f(C0100R.raw.hotshot_distance_1, 2);
                                break;
                            case DISTANCE_2:
                                hysVar3.f29956c.mo10321g();
                                hysVar3.f29956c.mo10320f(C0100R.raw.hotshot_distance_2, 2);
                                break;
                            case DISTANCE_OUTERMOST:
                                hysVar3.f29956c.mo10321g();
                                hysVar3.f29956c.mo10320f(C0100R.raw.hotshot_outermost, 2);
                                break;
                        }
                    }
                    hysVar3.f29970q = hysVar3.f29969p;
                    break;
                }
                break;
            case 12:
                this.f29584a.mo11230b().sendAccessibilityEvent(8);
                break;
            case 13:
                iad iadVar = (iad) this.f29584a;
                iadVar.m10979e().launchLensActivity(iadVar.f30124b, new LensApi.LensLaunchStatusCallback() { // from class: iaa
                    @Override // com.google.lens.sdk.LensApi.LensLaunchStatusCallback
                    public final void onLaunchStatusFetched(int i4) {
                        if (i4 == 0) {
                            System.currentTimeMillis();
                        }
                    }
                });
                break;
            case 14:
                break;
            case 15:
                Object obj = this.f29584a;
                System.currentTimeMillis();
                final iad iadVar2 = (iad) obj;
                iadVar2.m10979e().checkLensAvailability(new LensApi.LensAvailabilityCallback() { // from class: hzz
                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i4) {
                        switch (i2) {
                            case 0:
                                iad iadVar3 = iadVar2;
                                if (i4 != 0) {
                                    iadVar3.f30128f.mo14894e(hzw.m10973a().m10963a());
                                } else {
                                    hzv hzvVarM10973a = hzw.m10973a();
                                    hzvVarM10973a.m10964b(1 == (iadVar3.m10979e().m5166a().f32274a & 1));
                                    hzvVarM10973a.m10965c((iadVar3.m10979e().m5166a().f32274a & 4) != 0);
                                    hzvVarM10973a.m10966d(iadVar3.m10979e().m5170e());
                                    ivi iviVar = iadVar3.m10979e().m5166a().f32275b;
                                    if (iviVar == null) {
                                        iviVar = ivi.f32269b;
                                    }
                                    hzvVarM10973a.m10967e(mws.m17095j(iviVar.f32271a));
                                    iadVar3.f30128f.mo14894e(hzvVarM10973a.m10963a());
                                }
                                break;
                            default:
                                iad iadVar4 = iadVar2;
                                System.currentTimeMillis();
                                iadVar4.f30127e.mo14894e(Boolean.valueOf(i4 == 0));
                                break;
                        }
                    }
                });
                iadVar2.m10979e().checkPostCaptureAvailability(new LensApi.LensAvailabilityCallback() { // from class: hzz
                    @Override // com.google.lens.sdk.LensApi.LensAvailabilityCallback
                    public final void onAvailabilityStatusFetched(int i4) {
                        switch (i3) {
                            case 0:
                                iad iadVar3 = iadVar2;
                                if (i4 != 0) {
                                    iadVar3.f30128f.mo14894e(hzw.m10973a().m10963a());
                                } else {
                                    hzv hzvVarM10973a = hzw.m10973a();
                                    hzvVarM10973a.m10964b(1 == (iadVar3.m10979e().m5166a().f32274a & 1));
                                    hzvVarM10973a.m10965c((iadVar3.m10979e().m5166a().f32274a & 4) != 0);
                                    hzvVarM10973a.m10966d(iadVar3.m10979e().m5170e());
                                    ivi iviVar = iadVar3.m10979e().m5166a().f32275b;
                                    if (iviVar == null) {
                                        iviVar = ivi.f32269b;
                                    }
                                    hzvVarM10973a.m10967e(mws.m17095j(iviVar.f32271a));
                                    iadVar3.f30128f.mo14894e(hzvVarM10973a.m10963a());
                                }
                                break;
                            default:
                                iad iadVar4 = iadVar2;
                                System.currentTimeMillis();
                                iadVar4.f30127e.mo14894e(Boolean.valueOf(i4 == 0));
                                break;
                        }
                    }
                });
                kxk.m14959E(iadVar2.f30127e, iadVar2.f30128f).m17605a(new bpr(iadVar2, 2), iadVar2.f30125c);
                break;
            case 16:
                ((iak) this.f29584a).m10988e();
                break;
            case 17:
                iak iakVar = (iak) this.f29584a;
                elx elxVar = iakVar.f30154g;
                MarsSwitch marsSwitch = iakVar.f30158k;
                if (marsSwitch == null || marsSwitch.f7049b == null) {
                    kbaVarMo11297a = gog.f25855h;
                } else {
                    iakVar.m10988e();
                    iakVar.f30153f.mo10033e(gzy.f27038av, Integer.valueOf(((Integer) iakVar.f30152e.mo10031c(gzy.f27038av)).intValue() + 1));
                    igt igtVar = new igt(iakVar.f30149b.getResources().getString(C0100R.string.long_press_entry_hint));
                    MarsSwitch marsSwitch2 = iakVar.f30158k;
                    marsSwitch2.getClass();
                    View view = marsSwitch2.f7049b;
                    view.getClass();
                    igtVar.m11313q(view);
                    igtVar.mo11305i();
                    igtVar.mo11307k();
                    igtVar.f30869d = 5000;
                    igtVar.f30872g = true;
                    igtVar.mo11308l();
                    igtVar.mo11302f(new huh(iakVar, i), not.INSTANCE);
                    igtVar.f30874i = elxVar;
                    igtVar.f30878m = 4;
                    igtVar.f30871f = true;
                    kbaVarMo11297a = igtVar.mo11297a();
                }
                iakVar.f30161n = kbaVarMo11297a;
                iakVar.f30162o.m13537d(iakVar.f30161n);
                break;
            case 18:
                iak iakVar2 = (iak) this.f29584a;
                if (iakVar2.f30150c.mo6184l(dib.f11361co)) {
                    idu iduVar = iakVar2.f30160m;
                    if (iduVar != null) {
                        iduVar.m11139e(gyx.MEDIA_STORE);
                    }
                } else {
                    idq idqVar = iakVar2.f30163p;
                    if (idqVar != null) {
                        idqVar.m11127c(gyx.MEDIA_STORE);
                    }
                }
                hai haiVar = iakVar2.f30153f;
                haiVar.getClass();
                haiVar.mo10033e(gzy.f27036at, false);
                ((nbe) ((nbe) iak.f30148a.m17252c()).mo17276G((char) 4067)).mo17290o("Mars not set up");
                break;
            case 19:
                ktz ktzVar = (ktz) this.f29584a;
                ((hlc) ktzVar.f37201d).m10437h(hks.f28210a);
                ?? r6 = ktzVar.f37198a;
                nxl nxlVarM18137O = nko.f43250g.m18137O();
                int iM11411e = iku.m11411e((ikw) ktzVar.f37200c);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nko nkoVar = (nko) nxlVarM18137O.f44974b;
                nkoVar.f43253b = iM11411e - 1;
                nkoVar.f43252a = 1 | nkoVar.f43252a;
                int iM11411e2 = iku.m11411e((ikw) ktzVar.f37199b);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nko nkoVar2 = (nko) nxqVar;
                nkoVar2.f43254c = iM11411e2 - 1;
                nkoVar2.f43252a |= 2;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                nko nkoVar3 = (nko) nxqVar2;
                nkoVar3.f43257f = 2;
                nkoVar3.f43252a = 16 | nkoVar3.f43252a;
                long j = ((hlc) ktzVar.f37201d).f28241m;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nko nkoVar4 = (nko) nxlVarM18137O.f44974b;
                nkoVar4.f43252a = 4 | nkoVar4.f43252a;
                nkoVar4.f43255d = j;
                long jM10436g = ((hlc) ktzVar.f37201d).m10436g(hks.f28210a);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nko nkoVar5 = (nko) nxlVarM18137O.f44974b;
                nkoVar5.f43252a = 8 | nkoVar5.f43252a;
                nkoVar5.f43256e = jM10436g;
                r6.mo8205y((nko) nxlVarM18137O.mo18103l());
                break;
            default:
                ((icr) ((hsq) this.f29584a).f29435b).mo11008g(ikw.LENS);
                break;
        }
    }
}
