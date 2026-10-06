package p000;

import android.os.Handler;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fop implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22960a;

    /* JADX INFO: renamed from: b */
    private final oju f22961b;

    /* JADX INFO: renamed from: c */
    private final oju f22962c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f22963d;

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f22963d = i;
        this.f22960a = ojuVar;
        this.f22961b = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f22963d = i;
        this.f22962c = ojuVar;
        this.f22960a = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f22963d = i;
        this.f22960a = ojuVar;
        this.f22962c = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f22963d = i;
        this.f22960a = ojuVar;
        this.f22962c = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f22963d = i;
        this.f22960a = ojuVar;
        this.f22962c = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f22963d = i;
        this.f22960a = ojuVar;
        this.f22962c = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][][] fArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22962c = ojuVar2;
        this.f22960a = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f22963d = i;
        this.f22962c = ojuVar;
        this.f22960a = ojuVar2;
        this.f22961b = ojuVar3;
    }

    public fop(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f22963d = i;
        this.f22961b = ojuVar;
        this.f22960a = ojuVar2;
        this.f22962c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static fop m8626a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static fop m8627b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static fop m8628c(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static fop m8629d(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 9, (short[][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static fop m8630e(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 10, (int[][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static fop m8631f(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 11);
    }

    /* JADX INFO: renamed from: g */
    public static fop m8632g(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 12, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static fop m8633h(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 13, (float[][]) null);
    }

    /* JADX INFO: renamed from: i */
    public static fop m8634i(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 14);
    }

    /* JADX INFO: renamed from: j */
    public static fop m8635j(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 15, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: k */
    public static fop m8636k(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 16, (char[][][]) null);
    }

    /* JADX INFO: renamed from: l */
    public static fop m8637l(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new fop(ojuVar, ojuVar2, ojuVar3, 17, (short[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        jwn jwnVarM13637g;
        gfj gfjVarM9188a;
        switch (this.f22963d) {
            case 0:
                oju ojuVar = this.f22960a;
                ((crv) this.f22961b).m5442a();
                kby kbyVar = new kby((kbz) this.f22962c.get(), "PanoramaModule#providePanoramaAgent");
                try {
                    mrm mrmVarM16829i = mrm.m16829i(new gtd(new gtd(ikw.IMAX), ojuVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar.close();
                    return mrmVarM16829i;
                } catch (Throwable th) {
                    try {
                        kbyVar.close();
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        } catch (Exception e) {
                            throw th;
                        }
                    }
                }
            case 1:
                gtd gtdVar = (gtd) this.f22961b.get();
                oju ojuVar2 = this.f22960a;
                kby kbyVar2 = new kby((kbz) this.f22962c.get(), "MoreModesModule#provideMoreModesAgent");
                try {
                    mrm mrmVarM16829i2 = mrm.m16829i(new gtd(gtdVar, ojuVar2, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar2.close();
                    return mrmVarM16829i2;
                } catch (Throwable th3) {
                    try {
                        kbyVar2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            throw th3;
                        } catch (Exception e2) {
                            throw th3;
                        }
                    }
                }
            case 2:
                gtd gtdVar2 = (gtd) this.f22961b.get();
                oju ojuVar3 = this.f22960a;
                kby kbyVar3 = new kby((kbz) this.f22962c.get(), "VideoModeModule#provideVideoAgent");
                try {
                    mrm mrmVarM16829i3 = mrm.m16829i(new gtd(gtdVar2, ojuVar3, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar3.close();
                    return mrmVarM16829i3;
                } catch (Throwable th5) {
                    try {
                        kbyVar3.close();
                        throw th5;
                    } catch (Throwable th6) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                            throw th5;
                        } catch (Exception e3) {
                            throw th5;
                        }
                    }
                }
            case 3:
                gtd gtdVar3 = (gtd) this.f22961b.get();
                oju ojuVar4 = this.f22960a;
                kby kbyVar4 = new kby((kbz) this.f22962c.get(), "VideoIntentModeModule#provideVideoIntentAgent");
                try {
                    mrm mrmVarM16829i4 = mrm.m16829i(new gtd(gtdVar3, ojuVar4, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar4.close();
                    return mrmVarM16829i4;
                } catch (Throwable th7) {
                    try {
                        kbyVar4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                            throw th7;
                        } catch (Exception e4) {
                            throw th7;
                        }
                    }
                }
            case 4:
                gtd gtdVar4 = (gtd) this.f22961b.get();
                oju ojuVar5 = this.f22960a;
                kby kbyVar5 = new kby((kbz) this.f22962c.get(), "VideoPortraitModeModule#provideModuleAgent");
                try {
                    mrm mrmVarM16829i5 = mrm.m16829i(new gtd(gtdVar4, ojuVar5, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    kbyVar5.close();
                    return mrmVarM16829i5;
                } catch (Throwable th9) {
                    try {
                        kbyVar5.close();
                        throw th9;
                    } catch (Throwable th10) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                            throw th9;
                        } catch (Exception e5) {
                            throw th9;
                        }
                    }
                }
            case 5:
                return new fst((kol) ((fpw) this.f22961b).get().f3651a, new fsw((fst) this.f22962c.get(), (Handler) this.f22960a.get()), 1);
            case 6:
                Object objM17137I = !((Boolean) this.f22961b.get()).booleanValue() ? mzx.f41874a : mxk.m17137I(new eam(this.f22962c, 2), new eam(this.f22960a, 3));
                objM17137I.getClass();
                return objM17137I;
            case 7:
                mrm mrmVar = (mrm) this.f22962c.get();
                mrm mrmVar2 = (mrm) this.f22960a.get();
                Executor executor = (Executor) this.f22961b.get();
                if (mrmVar.mo16813g() && ((Boolean) mrmVar.mo16809c()).booleanValue()) {
                    return !mrmVar2.mo16813g() ? kxk.m14965K(mqu.f41450a) : kxk.m14969O(new bdv(mrmVar2, 6), executor);
                }
                return kxk.m14965K(mqu.f41450a);
            case 8:
                ((eru) this.f22961b).get();
                ((fjp) this.f22960a).m8495b();
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 9:
                mrm mrmVarM10179a = ((hfb) this.f22960a).m10179a();
                jvb jvbVar = (jvb) this.f22962c.get();
                if (((dhv) this.f22961b.get()).mo6183k(dib.f11350cd) && mrmVarM10179a.mo16813g()) {
                    Float[] fArr = {Float.valueOf(-1.0f)};
                    jwf jwfVar = new jwf(fArr);
                    fwd fwdVar = new fwd(jwfVar, fArr);
                    ((hrx) mrmVarM10179a.mo16809c()).mo10659e(fwdVar);
                    jvbVar.m13537d(new eip(mrmVarM10179a, fwdVar, 15));
                    jwnVarM13637g = fxo.m8932f(fvv.f23720d, jwfVar);
                } else {
                    jwnVarM13637g = jwr.m13637g(fxo.m8931e());
                }
                jwnVarM13637g.getClass();
                return jwnVarM13637g;
            case 10:
                return new fwm(((fxj) this.f22961b).m8922a(), (gcx) this.f22960a.get(), ((emf) this.f22962c).m7519a());
            case 11:
                return new gae(this.f22960a, (jvz) this.f22961b.get(), Optional.empty(), (kbz) this.f22962c.get());
            case 12:
                return gaa.m8991c((jvb) this.f22960a.get(), (nps) this.f22962c.get(), (grz) this.f22961b.get());
            case 13:
                return new gbt(((dki) this.f22960a).get(), ((fxj) this.f22962c).m8922a(), (gcx) this.f22961b.get());
            case 14:
                dhv dhvVar = (dhv) this.f22960a.get();
                jwn jwnVarM13640j = (jwn) this.f22961b.get();
                eby ebyVar = (eby) this.f22962c.get();
                if (dhvVar.mo6184l(did.f11424ac)) {
                    jwnVarM13640j = jwr.m13640j(jwnVarM13640j, new etx(ebyVar, 9));
                }
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 15:
                return ((kfk) this.f22961b.get()).mo14134u((kgg) this.f22962c.get(), ((ohm) this.f22960a).get());
            case 16:
                return ((dhv) this.f22960a.get()).mo6184l(dib.f11334bo) ? ((git) this.f22961b).get().m10143b(1) : ((gkl) this.f22962c).get();
            case 17:
                oju ojuVar6 = this.f22962c;
                oju ojuVar7 = this.f22960a;
                kmd kmdVar = ((fxk) this.f22961b).get();
                jwn jwnVarM13637g2 = (ivx.f32447j == null || ivx.f32448k == null || !kmdVar.mo14544M() || !kmdVar.mo14535D()) ? jwr.m13637g(fxo.m8931e()) : jwr.m13640j((jwn) ojuVar7.get(), new etx(ojuVar6, 12));
                jwnVarM13637g2.getClass();
                return jwnVarM13637g2;
            case 18:
                dhv dhvVar2 = (dhv) this.f22961b.get();
                hai haiVar = (hai) this.f22962c.get();
                boolean zBooleanValue = ((Boolean) this.f22960a.get()).booleanValue();
                geu geuVar = new geu(haiVar.mo10030b(gzy.f27061t), (String) gzy.f27061t.m10026c(dhvVar2), "ns", gfc.PHOTO_FLASH_NS, "auto", gfc.PHOTO_FLASH_AUTO, "on", gfc.PHOTO_FLASH_ON, "off", gfc.PHOTO_FLASH_OFF);
                if (zBooleanValue && gfc.PHOTO_FLASH_AUTO.equals(geuVar.mo3831be())) {
                    geuVar.mo3415bf(gfc.PHOTO_FLASH_NS);
                } else if (!zBooleanValue && gfc.PHOTO_FLASH_NS.equals(geuVar.mo3831be())) {
                    geuVar.mo3415bf(gfc.PHOTO_FLASH_OFF);
                }
                if (dhvVar2.mo6183k(dim.f11640c)) {
                    gfjVarM9188a = gfy.m9188a(zBooleanValue);
                } else {
                    int i = zBooleanValue ? C0100R.string.more_light_desc : C0100R.string.illumination_desc;
                    int i2 = true != zBooleanValue ? C0100R.string.illumination_options_desc : C0100R.string.more_light_options_desc;
                    int i3 = true != zBooleanValue ? C0100R.drawable.ic_lightbulb_off : C0100R.drawable.quantum_gm_ic_do_not_disturb_white_24;
                    int i4 = true != zBooleanValue ? C0100R.string.illumination_off_option_desc : C0100R.string.cam_flash_off_alt;
                    int i5 = true != zBooleanValue ? C0100R.string.illumination_on_option_desc : C0100R.string.illumination_on_alt;
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9168h(i);
                    gfjVarM9181o.m9163c(i2);
                    gfjVarM9181o.m9162b(gfc.PHOTO_FLASH_OFF, i3, i4, C0100R.string.illumination_off_desc);
                    if (zBooleanValue) {
                        gfjVarM9181o.m9162b(gfc.PHOTO_FLASH_NS, C0100R.drawable.gs_night_sight_auto_vd_theme_24, C0100R.string.cam_flash_ns, C0100R.string.flash_ns_desc);
                    }
                    gfjVarM9181o.m9162b(gfc.PHOTO_FLASH_ON, C0100R.drawable.ic_lightbulb_on, i5, C0100R.string.illumination_on_desc);
                    gfjVarM9188a = gfjVarM9181o;
                }
                fjv fjvVar = fjv.f22313g;
                gfjVarM9188a.m9178r(gev.FRONT_PHOTO_FLASH);
                gfjVarM9188a.f24545a = geuVar;
                gfjVarM9188a.m9179s(fjvVar);
                return gfjVarM9188a.m9161a();
            case 19:
                dhv dhvVar3 = (dhv) this.f22961b.get();
                jww jwwVar = (jww) this.f22960a.get();
                gdc gdcVar = (gdc) this.f22962c.get();
                nbh nbhVar = gfy.f24631a;
                dhw dhwVar = dim.f11638a;
                dhvVar3.mo6175c();
                geu geuVar2 = new geu(gdcVar, gcv.f24243a, gdb.ON, gfc.HDR_ON, gdb.OFF, gfc.HDR_OFF, gdb.AUTO, gfc.HDR_AUTO);
                gfj gfjVarM9181o2 = gfk.m9181o();
                gfjVarM9181o2.f24545a = geuVar2;
                gfjVarM9181o2.m9178r(gev.HDR);
                gfjVarM9181o2.m9168h(C0100R.string.hdr_desc);
                gfjVarM9181o2.m9163c(C0100R.string.hdr_plus_options_desc);
                gfjVarM9181o2.m9174n(gfc.HDR_OFF, gfc.HDR_AUTO, gfc.HDR_ON);
                gfjVarM9181o2.m9170j(Integer.valueOf(C0100R.string.hdr_off), Integer.valueOf(C0100R.string.hdr_on), Integer.valueOf(C0100R.string.hdr_enhanced));
                gfjVarM9181o2.m9165e(Integer.valueOf(C0100R.string.hdr_off_desc), Integer.valueOf(C0100R.string.hdr_on_desc), Integer.valueOf(C0100R.string.hdr_enhanced_desc));
                gfjVarM9181o2.m9167g(Integer.valueOf(C0100R.drawable.ic_hdr_off_select_gm2_24px), Integer.valueOf(C0100R.drawable.ic_hdr_on_select_gm2_24px), Integer.valueOf(C0100R.drawable.ic_hdr_enhanced_select_gm2_24px));
                gfjVarM9181o2.m9179s(new gfw(jwwVar, 0));
                gfjVarM9181o2.m9172l(new fvi(jwwVar, 10));
                return gfjVarM9181o2.m9161a();
            default:
                return new kov(((dws) this.f22961b).m6830a(), (jvd) this.f22962c.get(), ((kbm) this.f22960a).get());
        }
    }
}
