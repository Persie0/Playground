package p000;

import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.apps.camera.p014ui.hotshot.HotshotView;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fax implements Consumer {

    /* JADX INFO: renamed from: t */
    private final /* synthetic */ int f21167t;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ fax f21166s = new fax(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ fax f21165r = new fax(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ fax f21164q = new fax(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ fax f21163p = new fax(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ fax f21162o = new fax(15);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ fax f21161n = new fax(14);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ fax f21160m = new fax(13);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ fax f21159l = new fax(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ fax f21158k = new fax(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ fax f21157j = new fax(10);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ fax f21156i = new fax(9);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ fax f21155h = new fax(8);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ fax f21154g = new fax(7);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fax f21153f = new fax(6);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fax f21152e = new fax(5);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fax f21151d = new fax(4);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fax f21150c = new fax(3);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fax f21149b = new fax(2);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ fax f21148a = new fax(1);

    public /* synthetic */ fax(int i) {
        this.f21167t = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z = false;
        switch (this.f21167t) {
            case 0:
                fbp fbpVar = (fbp) obj;
                int i = fba.f21187l;
                if (fbpVar instanceof fbe) {
                    ((fbe) fbpVar).m8100a();
                    return;
                }
                return;
            case 1:
                fbp fbpVar2 = (fbp) obj;
                int i2 = fba.f21187l;
                if (fbpVar2 instanceof fbg) {
                    ((fbg) fbpVar2).mo3521bC();
                    return;
                }
                return;
            case 2:
                fbp fbpVar3 = (fbp) obj;
                int i3 = fba.f21187l;
                if (fbpVar3 instanceof fbh) {
                    ((fbh) fbpVar3).m8102a();
                    return;
                }
                return;
            case 3:
                fbp fbpVar4 = (fbp) obj;
                int i4 = fba.f21187l;
                if (fbpVar4 instanceof fbo) {
                    ((fbo) fbpVar4).mo3525e();
                    return;
                }
                return;
            case 4:
                fbp fbpVar5 = (fbp) obj;
                int i5 = fba.f21187l;
                if (fbpVar5 instanceof fbj) {
                    ((fbj) fbpVar5).mo3522bE();
                    return;
                }
                return;
            case 5:
                ((nbe) ((nbe) geo.f24397a.m17252c()).mo17276G(2602)).mo17293r("%s", (gfb) obj);
                return;
            case 6:
                return;
            case 7:
                ((gfg) obj).mo5760b();
                return;
            case 8:
                ((gfg) obj).mo5759a();
                return;
            case 9:
                ((gfg) obj).mo5762d();
                return;
            case 10:
                ((gfg) obj).mo5761c();
                return;
            case 11:
                ggg gggVar = (ggg) obj;
                gggVar.m9206d();
                gggVar.setEnabled(true);
                return;
            case 12:
                hhe hheVar = (hhe) obj;
                hheVar.setVisibility(8);
                hheVar.setScaleX(0.0f);
                hheVar.setScaleY(0.0f);
                hheVar.setAlpha(0.0f);
                return;
            case 13:
                hhe hheVar2 = (hhe) obj;
                hheVar2.setEnabled(false);
                hheVar2.setColorFilter(hhe.f27795a);
                return;
            case 14:
                hyy hyyVar = (hyy) obj;
                nbh nbhVar = HotshotView.f7027a;
                Paint paint = hyyVar.f29998b;
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(6.0f);
                paint.setColor(Color.parseColor(hyyVar.f29997a.f29994l));
                return;
            case 15:
                ((imo) obj).mo11462g();
                return;
            case 16:
                ((imo) obj).mo11461f();
                return;
            case 17:
                ((mpx) obj).m16789b();
                return;
            case 18:
                ((inr) obj).mo10342b();
                return;
            case 19:
                mpx mpxVar = (mpx) obj;
                synchronized (mpxVar.f41306a) {
                    int i6 = mpxVar.f41307b;
                    if (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                        z = true;
                    }
                    Object obj2 = mpxVar.f41308c;
                    String strM16762a = mpw.m16762a(i6);
                    if (i6 == 0) {
                        throw null;
                    }
                    lku.m15617L(z, "Can't shut down: state of the audio stream parser '%s' is '%s'.", obj2, strM16762a);
                    if (mpxVar.f41307b != 5) {
                        mpxVar.f41307b = 4;
                    }
                }
                return;
            default:
                nbh nbhVar2 = mpr.f41274a;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21167t) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
