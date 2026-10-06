package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ipa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31670a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31671b;

    public /* synthetic */ ipa(ipb ipbVar, int i) {
        this.f31671b = i;
        this.f31670a = ipbVar;
    }

    public /* synthetic */ ipa(irg irgVar, int i) {
        this.f31671b = i;
        this.f31670a = irgVar;
    }

    public /* synthetic */ ipa(irs irsVar, int i) {
        this.f31671b = i;
        this.f31670a = irsVar;
    }

    public /* synthetic */ ipa(isa isaVar, int i) {
        this.f31671b = i;
        this.f31670a = isaVar;
    }

    public /* synthetic */ ipa(ite iteVar, int i) {
        this.f31671b = i;
        this.f31670a = iteVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        float f;
        switch (this.f31671b) {
            case 0:
                ((ipb) this.f31670a).f31679h.setVisibility(0);
                return;
            case 1:
                ((ipb) this.f31670a).f31678g.setVisibility(0);
                return;
            case 2:
                irg irgVar = (irg) this.f31670a;
                iqu iquVar = irgVar.f31886j;
                nxl nxlVarM18137O = iqj.f31792b.m18137O();
                String strName = irgVar.f31893q.mo5895d().name();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                iqj iqjVar = (iqj) nxlVarM18137O.f44974b;
                strName.getClass();
                iqjVar.f31794a = strName;
                iquVar.m11615d("/camera_facing", ((iqj) nxlVarM18137O.mo18103l()).mo17760J());
                return;
            case 3:
                ((irg) this.f31670a).f31886j.m11615d("/mode_exit", null);
                return;
            case 4:
                ((irg) this.f31670a).f31886j.m11615d("/exit_astro_mode", null);
                return;
            case 5:
                Object obj = this.f31670a;
                irg irgVar2 = (irg) obj;
                synchronized (irgVar2.f31889m) {
                    str = ((irg) obj).f31900x;
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    irgVar2.f31886j.m11615d("/mode_exit", null);
                    return;
                } else {
                    irgVar2.f31886j.m11615d(yTyWiTtGtnBhy.PXsUFfjwdx, str.getBytes(StandardCharsets.UTF_8));
                    return;
                }
            case 6:
                ((irg) this.f31670a).f31886j.m11615d("/support_feature_version", iqz.m11621a());
                return;
            case 7:
                Object obj2 = this.f31670a;
                irg irgVar3 = (irg) obj2;
                if (!irgVar3.m11646s()) {
                    return;
                }
                if (!irgVar3.f31898v) {
                    iqu iquVar2 = irgVar3.f31886j;
                    nxl nxlVarM18137O2 = iqm.f31801c.m18137O();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    ((iqm) nxlVarM18137O2.f44974b).f31804b = jCurrentTimeMillis;
                    iquVar2.m11615d(HRLmc.KLKB, ((iqm) nxlVarM18137O2.mo18103l()).mo17760J());
                    irgVar3.m11640m(1000L);
                    return;
                }
                long j = irgVar3.f31879c;
                if (j >= 1000) {
                    f = 4.0f;
                } else if (j >= 500) {
                    f = 3.0f;
                } else if (j >= 300) {
                    f = 2.0f;
                } else {
                    f = j >= 150 ? 1.5f : 1.0f;
                }
                try {
                    try {
                        ((irg) obj2).f31888l.mo13961e("GetPreviewForWear");
                        int iM13893a = ((irg) obj2).f31902z.m14647a().m13893a();
                        final iht ihtVar = ((irg) obj2).f31894r;
                        int i = (int) (((irg) obj2).f31881e / f);
                        int i2 = (int) (((irg) obj2).f31882f / f);
                        ihtVar.f31005e.mo13961e(pIeXJQLZLfgIN.skk);
                        try {
                            synchronized (ihtVar.f31002b) {
                                try {
                                    ihm ihmVar = ihtVar.f31008h;
                                    ihmVar.getClass();
                                    final SurfaceView surfaceView = ihmVar.f30971b;
                                    float fMin = Math.min(surfaceView.getWidth(), surfaceView.getHeight());
                                    float fMax = Math.max(surfaceView.getHeight(), surfaceView.getWidth());
                                    float fMax2 = Math.max(fMin / i, fMax / i2);
                                    final int i3 = (int) (fMin / fMax2);
                                    final int i4 = (int) (fMax / fMax2);
                                    Bitmap bitmap = (Bitmap) ihtVar.f31009i.mo16808b(new mrf() { // from class: ihp
                                        @Override // p000.mrf
                                        public final Object apply(Object obj3) {
                                            iht ihtVar2 = ihtVar;
                                            int i5 = i3;
                                            int i6 = i4;
                                            return (Bitmap) ((ipp) obj3).mo11584d(i5, i6).mo16810d(new ihq(ihtVar2, surfaceView, i5, i6, 1));
                                        }
                                    }).mo16810d(new ihq(ihtVar, surfaceView, i3, i4, 0));
                                    ihtVar.f31005e.mo13962f();
                                    if (iM13893a != 0) {
                                        ihtVar.f31005e.mo13961e("getScreenshot#flipAndRotate");
                                        Bitmap bitmapM11361a = iht.m11361a(bitmap, iM13893a, false);
                                        ihtVar.f31005e.mo13962f();
                                        bitmap.recycle();
                                        bitmap = bitmapM11361a;
                                    }
                                    irgVar3.f31888l.mo13962f();
                                    if (bitmap != null) {
                                        irgVar3.m11642o(bitmap, true);
                                    }
                                    irgVar3.m11640m(1000L);
                                    irgVar3.f31879c = 1000L;
                                    irgVar3.f31898v = false;
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e) {
                        ((nbe) ((nbe) ((nbe) irg.f31862a.m17252c()).mo17283h(e)).mo17276G(4379)).mo17290o("Error when viewfinder.getScreenshot");
                        ((irg) obj2).m11640m(50L);
                        irgVar3.f31888l.mo13962f();
                        return;
                    }
                } catch (Throwable th3) {
                    irgVar3.f31888l.mo13962f();
                    throw th3;
                }
                break;
            case 8:
                irg irgVar4 = (irg) this.f31670a;
                if (irgVar4.f31897u) {
                    irgVar4.f31886j.m11615d("/cancel_notify_wear", null);
                    return;
                }
                return;
            case 9:
                irg irgVar5 = (irg) this.f31670a;
                if (!irgVar5.f31886j.m11614c()) {
                    ((nbe) ((nbe) irg.f31862a.m17252c()).mo17276G((char) 4376)).mo17290o("Wearable device doesn't exist.");
                    return;
                }
                ((nbe) ((nbe) irg.f31862a.m17252c()).mo17276G((char) 4377)).mo17290o("Wearable device exists.");
                if (irgVar5.f31886j.m11612a() == null || ((Boolean) irgVar5.f31887k.mo3831be()).booleanValue()) {
                    return;
                }
                irgVar5.f31886j.m11615d("/notify_wear", null);
                irgVar5.f31887k.mo3415bf(true);
                irgVar5.f31897u = true;
                return;
            case 10:
                ((irg) this.f31670a).f31886j.m11615d("/support_feature_version", iqz.m11621a());
                return;
            case 11:
                irg irgVar6 = (irg) this.f31670a;
                iqu iquVar3 = irgVar6.f31886j;
                nxl nxlVarM18137O3 = iqp.f31811d.m18137O();
                float fMo11753d = irgVar6.f31890n.mo11753d();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ((iqp) nxlVarM18137O3.f44974b).f31814b = fMo11753d;
                float fMo11754e = irgVar6.f31890n.mo11754e();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ((iqp) nxlVarM18137O3.f44974b).f31813a = fMo11754e;
                float fMo11756g = irgVar6.f31890n.mo11756g();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                ((iqp) nxlVarM18137O3.f44974b).f31815c = fMo11756g;
                iquVar3.m11615d("/zoom_limit", ((iqp) nxlVarM18137O3.mo18103l()).mo17760J());
                return;
            case 12:
                ((irg) this.f31670a).f31886j.m11615d("/stop_countdown", null);
                return;
            case 13:
                irg irgVar7 = (irg) this.f31670a;
                iqu iquVar4 = irgVar7.f31886j;
                nxl nxlVarM18137O4 = iqq.f31816b.m18137O();
                float fFloatValue = ((Float) irgVar7.f31891o.mo3831be()).floatValue();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                ((iqq) nxlVarM18137O4.f44974b).f31818a = fFloatValue;
                iquVar4.m11615d("/zoom_value", ((iqq) nxlVarM18137O4.mo18103l()).mo17760J());
                return;
            case 14:
                ((irs) this.f31670a).f31938e.setVisibility(0);
                return;
            case 15:
                ((irs) this.f31670a).f31938e.setVisibility(8);
                return;
            case 16:
                Object obj3 = this.f31670a;
                if (((isa) obj3).f31971l) {
                    return;
                }
                ((iru) obj3).mo11653ch(true);
                return;
            case 17:
                ((isa) this.f31670a).m11672m();
                return;
            case 18:
                ((ite) this.f31670a).f32087ak.m13090Z("wide_selfie_tooltip_display_count");
                return;
            case 19:
                ite iteVar = (ite) this.f31670a;
                iteVar.f32069T = false;
                iteVar.f32054E.mo11686p();
                iteVar.f32076a.set(0);
                if (iteVar.f32064O.m4550D()) {
                    return;
                }
                iteVar.m11732M();
                return;
            default:
                ((ite) this.f31670a).m11764o();
                return;
        }
    }
}
