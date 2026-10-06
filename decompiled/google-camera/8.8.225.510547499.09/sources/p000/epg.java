package p000;

import android.media.MediaFormat;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epg implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14970a;

    /* JADX INFO: renamed from: b */
    private final oju f14971b;

    /* JADX INFO: renamed from: c */
    private final oju f14972c;

    /* JADX INFO: renamed from: d */
    private final oju f14973d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f14974e;

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14971b = ojuVar2;
        this.f14972c = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f14974e = i;
        this.f14972c = ojuVar;
        this.f14971b = ojuVar2;
        this.f14970a = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr, byte[] bArr2) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14972c = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14971b = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14973d = ojuVar2;
        this.f14971b = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f14974e = i;
        this.f14971b = ojuVar;
        this.f14970a = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14971b = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f14974e = i;
        this.f14971b = ojuVar;
        this.f14972c = ojuVar2;
        this.f14970a = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f14974e = i;
        this.f14973d = ojuVar;
        this.f14971b = ojuVar2;
        this.f14970a = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14972c = ojuVar2;
        this.f14971b = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14972c = ojuVar2;
        this.f14971b = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14971b = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f14974e = i;
        this.f14972c = ojuVar;
        this.f14971b = ojuVar2;
        this.f14970a = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f14974e = i;
        this.f14973d = ojuVar;
        this.f14970a = ojuVar2;
        this.f14972c = ojuVar3;
        this.f14971b = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f14974e = i;
        this.f14973d = ojuVar;
        this.f14972c = ojuVar2;
        this.f14971b = ojuVar3;
        this.f14970a = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14971b = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14973d = ojuVar2;
        this.f14972c = ojuVar3;
        this.f14971b = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][][] fArr) {
        this.f14974e = i;
        this.f14972c = ojuVar;
        this.f14973d = ojuVar2;
        this.f14971b = ojuVar3;
        this.f14970a = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14971b = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14972c = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f14974e = i;
        this.f14971b = ojuVar;
        this.f14970a = ojuVar2;
        this.f14972c = ojuVar3;
        this.f14973d = ojuVar4;
    }

    public epg(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f14974e = i;
        this.f14970a = ojuVar;
        this.f14972c = ojuVar2;
        this.f14973d = ojuVar3;
        this.f14971b = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static epg m7619a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new epg(ojuVar, ojuVar2, ojuVar3, ojuVar4, 10, (short[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static epg m7620b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new epg(ojuVar, ojuVar2, ojuVar3, ojuVar4, 12, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static epg m7621c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new epg(ojuVar, ojuVar2, ojuVar3, ojuVar4, 13, (float[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static epg m7622d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new epg(ojuVar, ojuVar2, ojuVar3, ojuVar4, 14, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static epg m7623e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new epg(ojuVar, ojuVar2, ojuVar3, ojuVar4, 17, (int[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        Object objM17136H2;
        int i = 0;
        switch (this.f14974e) {
            case 0:
                Object objM17136H3 = ((dhv) this.f14972c.get()).mo6184l(dik.f11607e) ? mxk.m17136H(dez.m6036f(new bmj(((emf) this.f14971b).m7519a(), this.f14970a, (jvb) this.f14973d.get(), 20), "moblur")) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 1:
                return new enu(((emi) this.f14972c).get(), ((emp) this.f14971b).get(), (dhv) this.f14970a.get(), (lbn) this.f14973d.get(), null, null);
            case 2:
                return new epx((jww) this.f14970a.get(), new iau(), ((ohm) this.f14973d).get(), (iax) this.f14971b.get(), ((err) this.f14972c).get());
            case 3:
                gtd gtdVar = (gtd) this.f14970a.get();
                oju ojuVar = this.f14971b;
                boolean zBooleanValue = ((cde) this.f14972c).m3490a().booleanValue();
                kby kbyVar = new kby((kbz) this.f14973d.get(), "PortraitModeModule#providePortraitAgent");
                try {
                    Object objM16829i = zBooleanValue ? mrm.m16829i(new gtd(gtdVar, ojuVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mqu.f41450a;
                    kbyVar.close();
                    return objM16829i;
                } catch (Throwable th) {
                    try {
                        kbyVar.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            case 4:
                ((fjp) this.f14971b).m8495b();
                kby kbyVar2 = new kby((kbz) this.f14973d.get(), yTyWiTtGtnBhy.OzZ);
                try {
                    mqu mquVar = mqu.f41450a;
                    kbyVar2.close();
                    return mquVar;
                } catch (Throwable th3) {
                    try {
                        kbyVar2.close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            break;
                        } catch (Exception e2) {
                        }
                    }
                    throw th3;
                }
            case 5:
                return new glk(this.f14970a, this.f14971b, this.f14973d, ((ikv) this.f14972c).m11415a());
            case 6:
                ifa ifaVar = ((ifb) this.f14973d).get();
                jvd jvdVar = (jvd) this.f14971b.get();
                cdu cduVar = ((err) this.f14970a).get();
                fdh.m8265e(jvdVar, ((eru) this.f14972c).get(), ifaVar);
                cduVar.m3529i().m13537d(ifaVar);
                return ifaVar;
            case 7:
                return new fde(((dww) this.f14971b).m6836a(), (fly) this.f14970a.get(), (jfs) this.f14973d.get(), (ScheduledExecutorService) this.f14972c.get(), null, null, null);
            case 8:
                jww jwwVar = (jww) this.f14970a.get();
                jwn jwnVar = (jwn) this.f14972c.get();
                kme kmeVar = ((kak) this.f14971b).get();
                dhv dhvVar = (dhv) this.f14973d.get();
                if (dhvVar.mo6184l(dhu.f11203e)) {
                    gfj gfjVarM8261a = fdh.m8261a(jwnVar, kmeVar, jwv.m13645b(jwwVar, ddu.f10600q, ddu.f10601r), fjv.f22307a, gev.AF_BACK);
                    gfjVarM8261a.m9162b(gfc.AF_ON, C0100R.drawable.quantum_gm_ic_center_focus_strong_white_24, C0100R.string.af_on_option_desc, C0100R.string.af_on_acc_desc);
                    gfjVarM8261a.m9162b(gfc.AF_OFF_NEAR, C0100R.drawable.quantum_gm_ic_people_white_24, C0100R.string.af_off_near_desc, C0100R.string.af_off_near_acc_desc);
                    gfjVarM8261a.m9162b(gfc.AF_OFF_FAR, C0100R.drawable.quantum_gm_ic_landscape_white_24, C0100R.string.af_off_far_desc, C0100R.string.af_off_far_acc_desc);
                    if (dhvVar.mo6184l(dhu.f11204f)) {
                        gfjVarM8261a.m9162b(gfc.AF_OFF_INFINITY, C0100R.drawable.quantum_gm_ic_landscape_white_24, C0100R.string.af_off_infinity_desc, C0100R.string.af_off_infinity_acc_desc);
                    }
                    objM17136H = mxk.m17136H(gfjVarM8261a.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 9:
                jww jwwVar2 = (jww) this.f14970a.get();
                jwn jwnVar2 = (jwn) this.f14972c.get();
                kme kmeVar2 = ((kak) this.f14971b).get();
                if (((dhv) this.f14973d.get()).mo6184l(dhu.f11203e)) {
                    gfj gfjVarM8261a2 = fdh.m8261a(jwnVar2, kmeVar2, jwv.m13645b(jwwVar2, ddu.f10600q, ddu.f10601r), cdy.f5390s, gev.AF_FRONT);
                    gfjVarM8261a2.m9162b(gfc.AF_ON, C0100R.drawable.quantum_gm_ic_center_focus_strong_white_24, C0100R.string.af_on_option_desc, C0100R.string.af_on_acc_desc);
                    gfjVarM8261a2.m9162b(gfc.AF_OFF_NEAR, C0100R.drawable.quantum_gm_ic_mood_white_24, C0100R.string.af_off_near_desc, C0100R.string.af_off_near_acc_desc);
                    gfjVarM8261a2.m9162b(gfc.AF_OFF_FAR, C0100R.drawable.quantum_gm_ic_people_white_24, C0100R.string.af_off_far_desc, C0100R.string.af_off_far_acc_desc);
                    objM17136H2 = mxk.m17136H(gfjVarM8261a2.m9161a());
                } else {
                    objM17136H2 = mzx.f41874a;
                }
                objM17136H2.getClass();
                return objM17136H2;
            case 10:
                return new glk((fuc) this.f14973d.get(), ((fwx) this.f14970a).get(), ((fxj) this.f14972c).m8922a(), (jvd) this.f14971b.get());
            case 11:
                return new fgp(((dws) this.f14972c).m6830a(), ((hlz) this.f14971b).get(), (dhv) this.f14970a.get(), (fcp) this.f14973d.get());
            case 12:
                return (((Boolean) this.f14971b.get()).booleanValue() && ((Boolean) this.f14970a.get()).booleanValue() && ((fxb) this.f14973d).get().f38949a) ? ((etl) this.f14972c).m7866a() : mqu.f41450a;
            case 13:
                dhv dhvVar2 = (dhv) this.f14970a.get();
                String str = ((fkb) this.f14971b).get();
                gdz gdzVar = ((geb) this.f14973d).get();
                double dAbs = Math.abs(gdzVar.f24348b.m13907d().m13904a() - dye.f12884d.m13904a());
                boolean z = dhvVar2.mo6184l(dij.f11565O) && !dhvVar2.mo6184l(dij.f11566P);
                boolean z2 = dhvVar2.mo6184l(dij.f11569S) && !dhvVar2.mo6184l(dij.f11566P);
                boolean z3 = dAbs < 0.05d;
                boolean zMo6184l = dhvVar2.mo6184l(dib.f11267aa);
                boolean zMo6184l2 = dhvVar2.mo6184l(dij.f11570T);
                boolean zMo6184l3 = dhvVar2.mo6184l(dij.f11567Q);
                MediaFormat mediaFormatM8934h = fxo.m8934h(fxo.m8936j(z, z3, zMo6184l3), fxo.m8933g(z2, zMo6184l3), 3600.0f, str, zMo6184l, zMo6184l2);
                mediaFormatM8934h.getClass();
                return mediaFormatM8934h;
            case 14:
                dhv dhvVar3 = (dhv) this.f14970a.get();
                String str2 = ((fkb) this.f14971b).get();
                gdz gdzVar2 = ((geb) this.f14973d).get();
                kbc kbcVar = dye.f12881a;
                double dAbs2 = Math.abs(gdzVar2.f24348b.m13907d().m13904a() - dye.f12884d.m13904a());
                dhw dhwVar = dij.f11577a;
                dhvVar3.mo6177e();
                dhvVar3.mo6177e();
                MediaFormat mediaFormatM8934h2 = fxo.m8934h(fxo.m8936j(false, dAbs2 < 0.05d, false), fxo.m8933g(false, false), 3600.0f, str2, dhvVar3.mo6184l(dib.f11267aa), dhvVar3.mo6184l(dij.f11570T));
                mediaFormatM8934h2.getClass();
                return mediaFormatM8934h2;
            case 15:
                Object objM17136H4 = ((dhv) this.f14970a.get()).mo6184l(dii.f11544t) ? mxk.m17136H(new dft(this.f14971b, (gye) this.f14973d.get(), ((err) this.f14972c).get(), 8)) : mzx.f41874a;
                objM17136H4.getClass();
                return objM17136H4;
            case 16:
                Object obj = this.f14971b.get();
                ((dun) this.f14970a).m6758a();
                final dth dthVarM6758a = ((dun) this.f14972c).m6758a();
                duc ducVarM6756b = duh.m6756b((dvg) this.f14973d.get());
                ducVarM6756b.f12580c = new dth() { // from class: fkk
                    @Override // p000.dth
                    /* JADX INFO: renamed from: e */
                    public final boolean mo6726e() {
                        return ((dtl) dthVarM6758a).f12559a;
                    }
                };
                ducVarM6756b.m6751c((fkj) obj);
                return ducVarM6756b.m6749a();
            case 17:
                jvb jvbVar = (jvb) this.f14970a.get();
                kfk kfkVar = (kfk) this.f14971b.get();
                mrm mrmVar = (mrm) this.f14973d.get();
                ikw ikwVarM11415a = ((ikv) this.f14972c).m11415a();
                if (ikwVarM11415a == ikw.PHOTO || ikwVarM11415a == ikw.PORTRAIT) {
                    i = 45;
                } else if (ikwVarM11415a == ikw.LONG_EXPOSURE || ikwVarM11415a == ikw.MOTION_BLUR) {
                    i = 3;
                }
                return i == 0 ? mqu.f41450a : mrmVar.mo16808b(new gyl(jvbVar, kfkVar, i, 1));
            case 18:
                return new drj(((crv) this.f14970a).m5442a(), ((fks) this.f14972c).get(), (fgy) this.f14973d.get(), (bko) this.f14971b.get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 19:
                return new fls((hst) this.f14972c.get(), (jfs) this.f14973d.get(), (DisplayMetrics) this.f14971b.get(), ((dws) this.f14970a).m6830a(), null, null, null);
            default:
                return new dpx(((dws) this.f14970a).m6830a(), (View) ((iig) this.f14972c).get().f31080q.m13100f(C0100R.id.preview_overlay), (jwn) this.f14973d.get(), (jwn) this.f14971b.get());
        }
    }
}
