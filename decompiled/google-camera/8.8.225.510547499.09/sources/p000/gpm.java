package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25973a;

    /* JADX INFO: renamed from: b */
    private final oju f25974b;

    /* JADX INFO: renamed from: c */
    private final oju f25975c;

    /* JADX INFO: renamed from: d */
    private final oju f25976d;

    /* JADX INFO: renamed from: e */
    private final oju f25977e;

    /* JADX INFO: renamed from: f */
    private final oju f25978f;

    /* JADX INFO: renamed from: g */
    private final oju f25979g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f25980h;

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i) {
        this.f25980h = i;
        this.f25973a = ojuVar;
        this.f25974b = ojuVar2;
        this.f25975c = ojuVar3;
        this.f25976d = ojuVar4;
        this.f25977e = ojuVar5;
        this.f25978f = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[] bArr) {
        this.f25980h = i;
        this.f25978f = ojuVar;
        this.f25976d = ojuVar2;
        this.f25975c = ojuVar3;
        this.f25977e = ojuVar4;
        this.f25974b = ojuVar5;
        this.f25973a = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[] bArr, byte[] bArr2) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25975c = ojuVar2;
        this.f25978f = ojuVar3;
        this.f25979g = ojuVar4;
        this.f25977e = ojuVar5;
        this.f25973a = ojuVar6;
        this.f25974b = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[] cArr) {
        this.f25980h = i;
        this.f25978f = ojuVar;
        this.f25975c = ojuVar2;
        this.f25976d = ojuVar3;
        this.f25977e = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25974b = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[] fArr) {
        this.f25980h = i;
        this.f25977e = ojuVar;
        this.f25979g = ojuVar2;
        this.f25976d = ojuVar3;
        this.f25978f = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25974b = ojuVar6;
        this.f25975c = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[] iArr) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25978f = ojuVar2;
        this.f25977e = ojuVar3;
        this.f25975c = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25974b = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[] sArr) {
        this.f25980h = i;
        this.f25973a = ojuVar;
        this.f25976d = ojuVar2;
        this.f25977e = ojuVar3;
        this.f25978f = ojuVar4;
        this.f25975c = ojuVar5;
        this.f25979g = ojuVar6;
        this.f25974b = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[] zArr) {
        this.f25980h = i;
        this.f25973a = ojuVar;
        this.f25976d = ojuVar2;
        this.f25978f = ojuVar3;
        this.f25974b = ojuVar4;
        this.f25979g = ojuVar5;
        this.f25975c = ojuVar6;
        this.f25977e = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[][] bArr) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25975c = ojuVar2;
        this.f25979g = ojuVar3;
        this.f25978f = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25977e = ojuVar6;
        this.f25974b = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[][] cArr) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25974b = ojuVar2;
        this.f25977e = ojuVar3;
        this.f25979g = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25978f = ojuVar6;
        this.f25975c = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[][] fArr) {
        this.f25980h = i;
        this.f25977e = ojuVar;
        this.f25979g = ojuVar2;
        this.f25978f = ojuVar3;
        this.f25974b = ojuVar4;
        this.f25975c = ojuVar5;
        this.f25973a = ojuVar6;
        this.f25976d = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[][] iArr) {
        this.f25980h = i;
        this.f25974b = ojuVar;
        this.f25976d = ojuVar2;
        this.f25973a = ojuVar3;
        this.f25978f = ojuVar4;
        this.f25975c = ojuVar5;
        this.f25977e = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[][] sArr) {
        this.f25980h = i;
        this.f25979g = ojuVar;
        this.f25976d = ojuVar2;
        this.f25974b = ojuVar3;
        this.f25975c = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25978f = ojuVar6;
        this.f25977e = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[][] zArr) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25979g = ojuVar2;
        this.f25975c = ojuVar3;
        this.f25978f = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25977e = ojuVar6;
        this.f25974b = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[][][] bArr) {
        this.f25980h = i;
        this.f25976d = ojuVar;
        this.f25978f = ojuVar2;
        this.f25977e = ojuVar3;
        this.f25974b = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25975c = ojuVar6;
        this.f25979g = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[][][] cArr) {
        this.f25980h = i;
        this.f25977e = ojuVar;
        this.f25976d = ojuVar2;
        this.f25979g = ojuVar3;
        this.f25973a = ojuVar4;
        this.f25974b = ojuVar5;
        this.f25978f = ojuVar6;
        this.f25975c = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[][][] fArr) {
        this.f25980h = i;
        this.f25975c = ojuVar;
        this.f25976d = ojuVar2;
        this.f25979g = ojuVar3;
        this.f25974b = ojuVar4;
        this.f25977e = ojuVar5;
        this.f25973a = ojuVar6;
        this.f25978f = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[][][] iArr) {
        this.f25980h = i;
        this.f25975c = ojuVar;
        this.f25977e = ojuVar2;
        this.f25974b = ojuVar3;
        this.f25973a = ojuVar4;
        this.f25979g = ojuVar5;
        this.f25978f = ojuVar6;
        this.f25976d = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[][][] sArr) {
        this.f25980h = i;
        this.f25974b = ojuVar;
        this.f25973a = ojuVar2;
        this.f25977e = ojuVar3;
        this.f25979g = ojuVar4;
        this.f25976d = ojuVar5;
        this.f25975c = ojuVar6;
        this.f25978f = ojuVar7;
    }

    public gpm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[][][] zArr) {
        this.f25980h = i;
        this.f25975c = ojuVar;
        this.f25979g = ojuVar2;
        this.f25974b = ojuVar3;
        this.f25977e = ojuVar4;
        this.f25973a = ojuVar5;
        this.f25976d = ojuVar6;
        this.f25978f = ojuVar7;
    }

    /* JADX INFO: renamed from: a */
    public static gpm m9607a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new gpm(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static gpm m9608b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new gpm(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static gpm m9609c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new gpm(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static ljf m9610d(jww jwwVar, jww jwwVar2, jww jwwVar3, har harVar, djm djmVar, hah hahVar, hai haiVar) {
        return new ljf(jwwVar, jwwVar2, jwwVar3, harVar, djmVar, hahVar, haiVar, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        Object objM17136H2;
        Object objM17136H3;
        switch (this.f25980h) {
            case 0:
                gpx gpxVar = (gpx) this.f25973a.get();
                gpw gpwVar = (gpw) this.f25974b.get();
                fxs fxsVarM9589b = goy.m9589b();
                Executor executorM9588a = goy.m9588a();
                ((ehm) this.f25975c).get();
                return new gpl(gpxVar, gpwVar, fxsVarM9589b, executorM9588a, (dhv) this.f25976d.get(), (ebv) this.f25977e.get(), (gvw) this.f25978f.get(), this.f25979g);
            case 1:
                kbz kbzVar = (kbz) this.f25978f.get();
                Context contextM6830a = ((dws) this.f25976d).m6830a();
                dhv dhvVar = (dhv) this.f25975c.get();
                Executor executorM3838a = ((ckl) this.f25977e).m3838a();
                oju ojuVar = this.f25974b;
                jvd jvdVar = (jvd) this.f25973a.get();
                fao faoVar = ((fav) this.f25979g).get();
                gpo gpoVar = new gpo(kbzVar, contextM6830a, dhvVar, ojuVar, executorM3838a, dhvVar.mo6184l(dio.f11678t));
                fdh.m8264d(jvdVar, faoVar, gpoVar);
                return gpoVar;
            case 2:
                oju ojuVar2 = this.f25978f;
                oju ojuVar3 = this.f25975c;
                oju ojuVar4 = this.f25976d;
                mrm mrmVarM6617a = ((dra) this.f25977e).m6617a();
                gti gtiVar = (gti) this.f25973a.get();
                jvb jvbVar = (jvb) this.f25974b.get();
                if (((dms) this.f25979g).get().m6693h()) {
                    gtiVar.mo9760e();
                    objM17136H = mxk.m17136H(new hct(ojuVar2, new Object(), jzn.m13824l("frame-quality-scorer"), ojuVar4, ojuVar3, jvbVar, mrmVarM6617a, 1));
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 3:
                return new gwn((fcp) this.f25973a.get(), (BottomBarController) this.f25976d.get(), ohh.m18485a(this.f25977e), (ilo) this.f25978f.get(), (hmy) this.f25975c.get(), (jww) this.f25979g.get(), (hai) this.f25974b.get());
            case 4:
                oju ojuVar5 = this.f25976d;
                oju ojuVar6 = this.f25978f;
                oju ojuVar7 = this.f25977e;
                Object objM17136H4 = !((Boolean) this.f25979g.get()).booleanValue() ? mzx.f41874a : mxk.m17136H(new efc((jvb) this.f25974b.get(), this.f25975c, ojuVar5, ojuVar6, this.f25973a, ojuVar7, 4));
                objM17136H4.getClass();
                return objM17136H4;
            case 5:
                mrm mrmVarM10179a = ((hfb) this.f25973a).m10179a();
                cso csoVar = (cso) this.f25978f.get();
                kym kymVar = (kym) this.f25974b.get();
                cdu cduVar = ((err) this.f25979g).get();
                dhv dhvVar2 = (dhv) this.f25975c.get();
                ((hji) this.f25977e).get();
                return new hir(mrmVarM10179a, csoVar, kymVar, cduVar, dhvVar2, null, null);
            case 6:
                return m9610d((jww) this.f25977e.get(), (jww) this.f25979g.get(), (jww) this.f25976d.get(), (har) this.f25978f.get(), (djm) this.f25973a.get(), (hah) this.f25974b.get(), (hai) this.f25975c.get());
            case 7:
                return new hmw((dhv) this.f25976d.get(), (hai) this.f25975c.get(), (jww) this.f25979g.get(), ((hog) this.f25978f).m10532a(), (hnw) this.f25973a.get(), (chx) this.f25977e.get(), (jvd) this.f25974b.get());
            case 8:
                dhv dhvVar3 = (dhv) this.f25976d.get();
                hai haiVar = (hai) this.f25974b.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f25977e);
                final ohb ohbVarM18485a2 = ohh.m18485a(this.f25979g);
                ohb ohbVarM18485a3 = ohh.m18485a(this.f25973a);
                final jww jwwVar = (jww) this.f25978f.get();
                jww jwwVar2 = (jww) this.f25975c.get();
                if (dhvVar3.mo6184l(dib.f11351ce) && dhvVar3.mo6184l(dib.f11353cg)) {
                    geu geuVar = new geu(haiVar.mo10030b(gzy.f27028al), (Integer) gzy.f27028al.m10026c(dhvVar3), Integer.valueOf(hnp.OFF.f28521d), gfc.TAXI_OFF, Integer.valueOf(hnp.AUTO.f28521d), gfc.TAXI_AUTO, Integer.valueOf(hnp.ON.f28521d), gfc.TAXI_ON);
                    dhvVar3.mo6177e();
                    gfw gfwVar = new gfw(jwwVar2, 14);
                    final Float f = (Float) dhvVar3.mo6180h(dib.f11352cf).get();
                    Predicate predicate = new Predicate() { // from class: hnb
                        public final /* synthetic */ Predicate and(Predicate predicate2) {
                            return Predicate$CC.$default$and(this, predicate2);
                        }

                        public final /* synthetic */ Predicate negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public final /* synthetic */ Predicate m10484or(Predicate predicate2) {
                            return Predicate$CC.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            jww jwwVar3 = jwwVar;
                            return ((Float) jwwVar3.mo3831be()).floatValue() >= 1.0f && ((Float) jwwVar3.mo3831be()).floatValue() <= f.floatValue() && !((Boolean) ((jwf) ((dxh) ohbVarM18485a2.get()).mo4156n()).f34942d).booleanValue();
                        }
                    };
                    hnc hncVar = new hnc(jwwVar, ohbVarM18485a2, gfwVar, jwwVar2, 0);
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9178r(gev.TAXI);
                    gfjVarM9181o.m9168h(C0100R.string.taxi_menu_item_label);
                    gfjVarM9181o.m9163c(C0100R.string.taxi_menu_item_desc);
                    gfjVarM9181o.m9174n(gfc.TAXI_OFF, gfc.TAXI_AUTO, gfc.TAXI_ON);
                    gfjVarM9181o.m9170j(Integer.valueOf(C0100R.string.taxi_menu_item_off), Integer.valueOf(C0100R.string.taxi_menu_item_auto), Integer.valueOf(C0100R.string.taxi_menu_item_on));
                    gfjVarM9181o.m9165e(Integer.valueOf(C0100R.string.taxi_menu_item_off_desc), Integer.valueOf(C0100R.string.taxi_menu_item_auto_desc), Integer.valueOf(C0100R.string.taxi_menu_item_on_desc));
                    gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.ic_macro_focus_off), Integer.valueOf(C0100R.drawable.ic_macro_focus_auto), Integer.valueOf(C0100R.drawable.ic_macro_focus_on));
                    gfjVarM9181o.f24545a = geuVar;
                    gfjVarM9181o.m9179s(gfwVar);
                    gfjVarM9181o.m9175o(predicate);
                    gfjVarM9181o.m9172l(hncVar);
                    gfjVarM9181o.f24546b = new dqc(ohbVarM18485a, 5);
                    gfjVarM9181o.m9171k((gfd) ohbVarM18485a3.get());
                    objM17136H2 = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H2 = mzx.f41874a;
                }
                objM17136H2.getClass();
                return objM17136H2;
            case 9:
                return new hoj((cwd) this.f25979g.get(), (dbr) this.f25976d.get(), this.f25974b, (dhv) this.f25975c.get(), ((cwr) this.f25973a).get(), (drj) this.f25978f.get(), fzn.m8981e(), (jww) this.f25977e.get(), null, null, null, null);
            case 10:
                return new hto((Consumer) this.f25974b.get(), (chv) this.f25976d.get(), ((dww) this.f25973a).m6836a(), (hah) this.f25978f.get(), (jvd) this.f25975c.get(), (dhv) this.f25977e.get(), ((err) this.f25979g).get());
            case 11:
                return new iad(((ema) this.f25979g).get(), (jvd) this.f25975c.get(), (Executor) this.f25978f.get(), (dhv) this.f25977e.get(), (gvo) this.f25974b.get(), new dks((kbz) this.f25973a.get(), ((dws) this.f25976d).m6830a(), 4));
            case 12:
                return new iht((ggm) this.f25977e.get(), ((iig) this.f25979g).get(), (kbz) this.f25978f.get(), this.f25974b, (jwn) this.f25975c.get(), (imy) this.f25973a.get(), (dhv) this.f25976d.get());
            case 13:
                dhv dhvVar4 = (dhv) this.f25976d.get();
                final AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f25978f.get();
                final oju ojuVar8 = this.f25977e;
                final oju ojuVar9 = this.f25974b;
                final boolean zBooleanValue = ((cde) this.f25973a).m3490a().booleanValue();
                final boolean zBooleanValue2 = ((ino) this.f25975c).get().booleanValue();
                final oju ojuVar10 = this.f25979g;
                if (dhvVar4.mo6184l(dib.f11306bM)) {
                    final byte[] bArr = null;
                    final byte[] bArr2 = null;
                    final byte[] bArr3 = null;
                    final byte[] bArr4 = null;
                    objM17136H3 = mxk.m17136H(new hjk(ambientController, ojuVar9, zBooleanValue, zBooleanValue2, ojuVar10, bArr, bArr2, bArr3, bArr4) { // from class: imd

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ oju f31484b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ boolean f31485c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ boolean f31486d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ oju f31487e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ AmbientModeSupport.AmbientController f31488f;

                        @Override // java.lang.Runnable
                        public final void run() {
                            oju ojuVar11 = this.f31483a;
                            AmbientModeSupport.AmbientController ambientController2 = this.f31488f;
                            oju ojuVar12 = this.f31484b;
                            boolean z = this.f31485c;
                            boolean z2 = this.f31486d;
                            oju ojuVar13 = this.f31487e;
                            imf imfVar = (imf) ojuVar11.get();
                            lja ljaVarM10159a = het.m10159a();
                            ljaVarM10159a.f38344c = "InAppUpdate";
                            ljaVarM10159a.m15518h(mxk.m17138J(ikw.PHOTO, ikw.PORTRAIT, ikw.LONG_EXPOSURE));
                            ljaVarM10159a.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                            ljaVarM10159a.m15520j(false);
                            ljaVarM10159a.m15521k(false);
                            ljaVarM10159a.f38342a = 1;
                            ambientController2.m1661k(imfVar, ljaVarM10159a.m15516f());
                            imi imiVar = ((imj) ojuVar12).get();
                            long jLongValue = ((Long) imiVar.f31514c.mo10031c(gzy.f27021ae)).longValue();
                            long longVersionCode = imiVar.f31516e.getLongVersionCode();
                            if (jLongValue != 0) {
                                imiVar.f31515d.mo10032d(gzy.f27021ae);
                                imiVar.f31515d.mo10032d(gzy.f27024ah);
                                imiVar.f31515d.mo10032d(gzy.f27025ai);
                                imiVar.f31519h.mo8167al(5, longVersionCode, jLongValue, 0, 0);
                            }
                            if (longVersionCode != ((Long) imiVar.f31514c.mo10031c(gzy.f27022af)).longValue()) {
                                imiVar.f31515d.mo10033e(gzy.f27023ag, 0);
                                imiVar.f31515d.mo10033e(gzy.f27022af, Long.valueOf(longVersionCode));
                            }
                            ((imh) imiVar.f31512a.get()).mo11472e((img) imiVar.f31513b.get());
                            fdh.m8265e(imiVar.f31517f, imiVar.f31518g, imiVar);
                            if (z && z2) {
                                imc imcVar = (imc) ojuVar13.get();
                                fdh.m8265e(imcVar.f31475a, imcVar.f31476b, imcVar);
                            }
                        }
                    });
                } else {
                    objM17136H3 = mzx.f41874a;
                }
                objM17136H3.getClass();
                return objM17136H3;
            case 14:
                khg khgVar = (khg) this.f25977e.get();
                kfn kfnVar = ((khc) this.f25976d).get();
                kme kmeVar = ((kak) this.f25979g).get();
                kkz kkzVar = (kkz) this.f25973a.get();
                knx knxVar = (knx) this.f25974b.get();
                return new kgy(khgVar, kfnVar, kmeVar, kkzVar, knxVar);
            case 15:
                return new ljf(this.f25974b, this.f25973a, this.f25977e, this.f25979g, this.f25976d, this.f25975c, this.f25978f, (byte[]) null);
            case 16:
                return new ljf((kro) this.f25975c.get(), (lhz) this.f25977e.get(), (kqj) this.f25974b.get(), ((hlz) this.f25973a).get(), (Executor) this.f25979g.get(), (kbz) this.f25978f.get(), ((kbm) this.f25976d).get(), (byte[]) null, (byte[]) null, (byte[]) null);
            case 17:
                ljf ljfVar = ((ljg) this.f25975c).get();
                Context contextM6830a2 = ((dws) this.f25979g).m6830a();
                npv npvVar = (npv) this.f25974b.get();
                ohb ohbVarM18485a4 = ohh.m18485a(this.f25977e);
                oju ojuVar11 = this.f25973a;
                return new ljm(ljfVar, contextM6830a2, npvVar, ohbVarM18485a4, ojuVar11, this.f25978f);
            case 18:
                return new lmy(((ljg) this.f25975c).get(), ((dws) this.f25976d).m6830a(), (lhz) this.f25979g.get(), (Executor) this.f25974b.get(), ohh.m18485a(this.f25977e), ((lnn) this.f25973a).get(), this.f25978f, null, null, null);
            default:
                oqo oqoVar = (oqo) this.f25976d.get();
                lyz lyzVar = (lyz) this.f25975c.get();
                lzh lzhVar = (lzh) this.f25978f.get();
                ksi ksiVar = (ksi) this.f25979g.get();
                mav mavVar = (mav) this.f25977e.get();
                ((mbf) this.f25973a).get();
                return new lzd(oqoVar, lyzVar, lzhVar, ksiVar, mavVar, (mat) this.f25974b.get());
        }
    }
}
