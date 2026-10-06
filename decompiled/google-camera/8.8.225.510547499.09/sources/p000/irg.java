package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Vibrator;
import android.text.TextUtils;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class irg implements ezx, iqi, jqw, fbp, fbd, fbn, fbo, fbg {

    /* JADX INFO: renamed from: B */
    private String f31864B;

    /* JADX INFO: renamed from: C */
    private Intent f31865C;

    /* JADX INFO: renamed from: D */
    private final HandlerThread f31866D;

    /* JADX INFO: renamed from: E */
    private final Activity f31867E;

    /* JADX INFO: renamed from: F */
    private final hht f31868F;

    /* JADX INFO: renamed from: G */
    private final fcp f31869G;

    /* JADX INFO: renamed from: H */
    private final iri f31870H;

    /* JADX INFO: renamed from: I */
    private final Context f31871I;

    /* JADX INFO: renamed from: J */
    private final igb f31872J;

    /* JADX INFO: renamed from: K */
    private final BottomBarController f31873K;

    /* JADX INFO: renamed from: L */
    private final hwx f31874L;

    /* JADX INFO: renamed from: M */
    private final jww f31875M;

    /* JADX INFO: renamed from: N */
    private final iqz f31876N;

    /* JADX INFO: renamed from: g */
    Runnable f31883g;

    /* JADX INFO: renamed from: h */
    Runnable f31884h;

    /* JADX INFO: renamed from: i */
    public final Handler f31885i;

    /* JADX INFO: renamed from: j */
    public final iqu f31886j;

    /* JADX INFO: renamed from: k */
    public final jww f31887k;

    /* JADX INFO: renamed from: l */
    public final kbz f31888l;

    /* JADX INFO: renamed from: n */
    public final iuj f31890n;

    /* JADX INFO: renamed from: o */
    public final jww f31891o;

    /* JADX INFO: renamed from: q */
    public final dbr f31893q;

    /* JADX INFO: renamed from: r */
    public final iht f31894r;

    /* JADX INFO: renamed from: s */
    public final mrm f31895s;

    /* JADX INFO: renamed from: t */
    public boolean f31896t;

    /* JADX INFO: renamed from: u */
    public boolean f31897u;

    /* JADX INFO: renamed from: v */
    public boolean f31898v;

    /* JADX INFO: renamed from: x */
    public String f31900x;

    /* JADX INFO: renamed from: y */
    public String f31901y;

    /* JADX INFO: renamed from: z */
    public final kov f31902z;

    /* JADX INFO: renamed from: a */
    public static final nbh f31862a = nbh.m17259h(YmzeHXaMYOLk.QGAgENQcqg);

    /* JADX INFO: renamed from: A */
    private static final long[] f31861A = {0, 400};

    /* JADX INFO: renamed from: b */
    public static boolean f31863b = false;

    /* JADX INFO: renamed from: c */
    public long f31879c = 0;

    /* JADX INFO: renamed from: d */
    boolean f31880d = false;

    /* JADX INFO: renamed from: e */
    public int f31881e = 480;

    /* JADX INFO: renamed from: f */
    public int f31882f = 480;

    /* JADX INFO: renamed from: m */
    public final Object f31889m = new Object();

    /* JADX INFO: renamed from: O */
    private int f31877O = 0;

    /* JADX INFO: renamed from: P */
    private long f31878P = -1;

    /* JADX INFO: renamed from: w */
    final hgp f31899w = new irf(this);

    /* JADX INFO: renamed from: p */
    public final jvb f31892p = new jvb();

    public irg(Activity activity, Context context, kov kovVar, iqu iquVar, jww jwwVar, final irb irbVar, iuj iujVar, jww jwwVar2, hht hhtVar, fcp fcpVar, iri iriVar, dbr dbrVar, iht ihtVar, igb igbVar, BottomBarController bottomBarController, hwx hwxVar, jww jwwVar3, mrm mrmVar, iqz iqzVar, kbz kbzVar) {
        jfm jfmVar;
        this.f31867E = activity;
        this.f31902z = kovVar;
        this.f31886j = iquVar;
        this.f31887k = jwwVar;
        this.f31890n = iujVar;
        this.f31868F = hhtVar;
        this.f31869G = fcpVar;
        this.f31870H = iriVar;
        this.f31888l = kbzVar;
        this.f31871I = context;
        this.f31891o = jwwVar2;
        this.f31893q = dbrVar;
        this.f31894r = ihtVar;
        this.f31872J = igbVar;
        this.f31873K = bottomBarController;
        this.f31874L = hwxVar;
        this.f31875M = jwwVar3;
        this.f31895s = mrmVar;
        this.f31876N = iqzVar;
        HandlerThread handlerThread = new HandlerThread("WRSListenerV2 bkg");
        this.f31866D = handlerThread;
        handlerThread.start();
        this.f31885i = jvh.m13557e(handlerThread.getLooper());
        jcy jcyVar = jcy.f33766a;
        jdz jdzVarM13477a = jqz.m13477a(context);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(jdzVarM13477a);
        arrayList.addAll(Arrays.asList(new jdz[0]));
        synchronized (jfm.f33892c) {
            jib.m13206k(jfm.f33893d, "Must guarantee manager is non-null before using getInstance");
            jfmVar = jfm.f33893d;
        }
        jew jewVar = new jew(arrayList);
        Handler handler = jfmVar.f33903n;
        handler.sendMessage(handler.obtainMessage(2, jewVar));
        Object obj = ((khb) jewVar.f33849d).f36008a;
        Executor executor = jps.f34561a;
        jpt jptVar = new jpt();
        jpt jptVar2 = (jpt) obj;
        jptVar2.f34568f.m16721d(new jpn(executor, jptVar));
        jptVar2.m13461m();
        jptVar.mo13459l(new jpl() { // from class: ird
            @Override // p000.jpl
            /* JADX INFO: renamed from: d */
            public final void mo4011d(Object obj2) {
                irg irgVar = this.f31856a;
                irb irbVar2 = irbVar;
                ((nbe) ((nbe) irg.f31862a.m17252c()).mo17276G((char) 4381)).mo17290o("Wearable api is available");
                irgVar.f31896t = true;
                fdh.m8265e(irbVar2.f31850b, irbVar2.f31849a, irbVar2);
                irgVar.f31898v = true;
                iqu iquVar2 = irgVar.f31886j;
                iquVar2.f31829b = iquVar2.f31829b.mo6314a("GcaMessageUtil");
                irgVar.f31896t = true;
                int i = 7;
                irgVar.f31883g = new ipa(irgVar, i);
                irgVar.f31884h = new ipa(irgVar, 8);
                jdz jdzVar = irgVar.f31886j.f31830c;
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
                intentFilter.addDataScheme("wear");
                intentFilter.addDataAuthority("*", null);
                int i2 = 0;
                IntentFilter[] intentFilterArr = {intentFilter};
                jfx jfxVarM13213r = jib.m13213r(irgVar, jdzVar.f33824g, "MessageListener");
                jgb jgbVarM6219x = djm.m6219x();
                jgbVarM6219x.f33940c = jfxVarM13213r;
                jgbVarM6219x.f33938a = new jtj(irgVar, jfxVarM13213r, intentFilterArr, i2);
                jgbVarM6219x.f33939b = new jin(irgVar, 4);
                jgbVarM6219x.f33942e = 24016;
                jdzVar.m12965k(jgbVarM6219x.m13127a());
                irgVar.f31885i.post(new ipa(irgVar, 9));
                irgVar.f31886j.m11613b("/check_status", null);
                irgVar.f31885i.post(new ipa(irgVar, 10));
                irgVar.m11640m(0L);
                irgVar.f31890n.mo11760k(new ire(irgVar, i2));
                irgVar.f31892p.m13537d(irgVar.f31891o.mo3830a(new ijp(irgVar, 6), not.INSTANCE));
                irgVar.f31892p.m13537d(irgVar.f31893q.f10419b.mo3830a(new ijp(irgVar, i), not.INSTANCE));
                if (irgVar.f31895s.mo16813g()) {
                    ((hgo) irgVar.f31895s.mo16809c()).mo10210a(irgVar.f31899w);
                }
                irgVar.m11645r();
            }
        });
        jptVar.mo13456i(new iml(this, 2));
    }

    /* JADX INFO: renamed from: t */
    private final void m11633t() {
        if (m11646s()) {
            this.f31870H.f31909c.m11648b();
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m11634u() {
        this.f31864B = null;
        this.f31878P = -1L;
    }

    /* JADX INFO: renamed from: v */
    private final void m11635v() {
        this.f31885i.post(new ipa(this, 5));
    }

    /* JADX INFO: renamed from: w */
    private final void m11636w(String str, long j) {
        this.f31885i.post(new dcr(this, str, j, 13));
    }

    /* JADX INFO: renamed from: x */
    private final void m11637x() {
        this.f31885i.post(new ipe(this, true != f31863b ? "onPause" : "onResume", 2));
    }

    /* JADX INFO: renamed from: y */
    private final void m11638y(int i) {
        if (m11639z(true)) {
            if (i <= 0 && this.f31874L.m10792e()) {
                this.f31872J.mo11248t();
                return;
            }
            this.f31875M.mo3415bf(gzp.m10019a(i));
            this.f31869G.mo8170ao(2);
            this.f31872J.mo11227ai(gzp.m10019a(i));
            this.f31872J.mo11249u();
            this.f31872J.mo11254z(false);
            this.f31872J.mo11248t();
        }
    }

    /* JADX INFO: renamed from: z */
    private final boolean m11639z(boolean z) {
        boolean z2;
        synchronized (this.f31889m) {
            z2 = false;
            if (!TextUtils.isEmpty(this.f31900x) && f31863b && (z || this.f31880d)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    @Override // p000.jqv
    /* JADX INFO: renamed from: a */
    public final void mo4518a(jtk jtkVar) {
        byte b;
        Long lValueOf;
        int i;
        if (!"/sending_time".equals(jtkVar.f34778b)) {
            int i2 = jtkVar.f34777a;
            String str = jtkVar.f34778b;
        }
        String str2 = jtkVar.f34778b;
        int i3 = 6;
        byte b2 = 2;
        int i4 = 0;
        switch (str2.hashCode()) {
            case -1806199438:
                if (!str2.equals("/wear_size")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1591117040:
                if (!str2.equals("/support_feature_version")) {
                    b = -1;
                } else {
                    b = 14;
                }
                break;
            case -1340212393:
                if (!str2.equals("onPause")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1000270761:
                if (!str2.equals("/count_down_from_phone")) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case -814358344:
                if (!str2.equals("/check_status")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -354612671:
                if (!str2.equals("/sending_time")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -269907385:
                if (!str2.equals("/count_down_setting_from_wear")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -84327103:
                if (!str2.equals("/leave_ambient")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 47150210:
                if (!str2.equals("/zoom")) {
                    b = -1;
                } else {
                    b = 13;
                }
                break;
            case 141093123:
                if (!str2.equals("/launch_from_notification")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 372591714:
                if (!str2.equals("/enter_ambient")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 768574312:
                if (!str2.equals("/play_sound_from_wear")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 990591823:
                if (!str2.equals("/log_lost_connection")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1142652788:
                if (!str2.equals("/zoom_value")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 1233860339:
                if (!str2.equals(YmzeHXaMYOLk.bUesEFG)) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1463983852:
                if (!str2.equals("onResume")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1580677032:
                if (!str2.equals("/flip_camera")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                m11637x();
                m11635v();
                this.f31885i.post(new ipa(this, i3));
                if (TextUtils.isEmpty(this.f31864B)) {
                    return;
                }
                m11636w(this.f31864B, this.f31878P);
                return;
            case 1:
                try {
                    byte[] bArr = jtkVar.f34779c;
                    nxq nxqVarM18123Q = nxq.m18123Q(iqm.f31801c, bArr, 0, bArr.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q);
                    lValueOf = Long.valueOf(((iqm) nxqVarM18123Q).f31804b);
                    break;
                } catch (nyb e) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e)).mo17276G((char) 4401)).mo17290o("Error when get WearImageBundle");
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    this.f31879c = System.currentTimeMillis() - lValueOf.longValue();
                    this.f31898v = true;
                    m11640m(0L);
                    iri iriVar = this.f31870H;
                    iriVar.f31912f += this.f31879c;
                    iriVar.f31913g++;
                    return;
                }
                return;
            case 2:
                this.f31880d = true;
                m11637x();
                m11641n();
                m11635v();
                m11643p();
                m11640m(0L);
                m11633t();
                return;
            case 3:
                this.f31880d = false;
                this.f31867E.finish();
                return;
            case 4:
                this.f31870H.f31910d.m11648b();
                return;
            case 5:
                irh irhVar = this.f31870H.f31910d;
                if (!irhVar.f31905c) {
                    irhVar.f31906d.mo13947i("onSessionStop failed because session is not started!");
                    return;
                }
                irhVar.f31905c = false;
                long jCurrentTimeMillis = irhVar.f31904b + (System.currentTimeMillis() - irhVar.f31903a);
                irhVar.f31904b = jCurrentTimeMillis;
                irhVar.f31906d.mo13944f("onSessionStop, elapseTimeMs = " + jCurrentTimeMillis);
                return;
            case 6:
                this.f31870H.f31911e++;
                return;
            case 7:
                m11638y(0);
                return;
            case 8:
                if (m11646s()) {
                    this.f31873K.switchCamera();
                    return;
                }
                return;
            case 9:
                String str3 = new String(jtkVar.f34779c);
                switch (str3.hashCode()) {
                    case -1085729529:
                        if (!str3.equals("TIMER_FINAL_SECOND_SOUND")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 569397989:
                        if (!str3.equals("TIMER_INCREMENT_SOUND")) {
                            b2 = -1;
                        }
                        break;
                    case 1327375512:
                        if (!str3.equals("TIMER_START_SOUND")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        i = C0100R.raw.timer_start;
                        break;
                    case 1:
                        i = C0100R.raw.timer_final;
                        break;
                    case 2:
                        i = C0100R.raw.timer_increment;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                this.f31868F.mo10316b(i);
                return;
            case 10:
                nxl nxlVar = this.f31870H.f31914h;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nml nmlVar = (nml) nxlVar.f44974b;
                nml nmlVar2 = nml.f43842g;
                nmlVar.f43849f = 1;
                nmlVar.f43844a |= 128;
                return;
            case 11:
                String[] strArrSplit = new String(jtkVar.f34779c).split("x", -1);
                if (strArrSplit.length == 2) {
                    this.f31881e = Integer.parseInt(strArrSplit[0]);
                    this.f31882f = Integer.parseInt(strArrSplit[1]);
                    return;
                }
                return;
            case 12:
                try {
                    byte[] bArr2 = jtkVar.f34779c;
                    nxq nxqVarM18123Q2 = nxq.m18123Q(iqq.f31816b, bArr2, 0, bArr2.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q2);
                    float f = ((iqq) nxqVarM18123Q2).f31818a;
                    if (m11646s()) {
                        this.f31890n.mo11771v();
                        this.f31877O++;
                        this.f31891o.mo3415bf(Float.valueOf(f));
                        this.f31890n.mo11772w();
                        return;
                    }
                    return;
                } catch (nyb e2) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e2)).mo17276G((char) 4395)).mo17290o("Error when get zoom value");
                    return;
                }
            case 13:
                try {
                    byte[] bArr3 = jtkVar.f34779c;
                    nxq nxqVarM18123Q3 = nxq.m18123Q(iqo.f31808b, bArr3, 0, bArr3.length, nxf.f44904a);
                    nxq.m18132ae(nxqVarM18123Q3);
                    float f2 = ((iqo) nxqVarM18123Q3).f31810a;
                    if (m11646s()) {
                        this.f31890n.mo11771v();
                        this.f31890n.mo11770u(f2 > 0.0f ? 1.01f : 0.99f);
                        this.f31890n.mo11772w();
                        return;
                    }
                    return;
                } catch (nyb e3) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e3)).mo17276G((char) 4396)).mo17290o("Error when get zoom delta");
                    return;
                }
            case 14:
                try {
                    iqz iqzVar = this.f31876N;
                    byte[] bArr4 = jtkVar.f34779c;
                    if (bArr4 != null) {
                        nxq nxqVarM18123Q4 = nxq.m18123Q(iqn.f31805b, bArr4, 0, bArr4.length, nxf.m18011a());
                        nxq.m18132ae(nxqVarM18123Q4);
                        iqzVar.f31844b = ((iqn) nxqVarM18123Q4).f31807a;
                    }
                    int i5 = this.f31876N.f31844b;
                    return;
                } catch (nyb e4) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e4)).mo17276G((char) 4398)).mo17290o("Fail to parse version!");
                    return;
                }
            case 15:
                try {
                    byte[] bArr5 = jtkVar.f34779c;
                    nxq nxqVarM18123Q5 = nxq.m18123Q(iqk.f31795b, bArr5, 0, bArr5.length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q5);
                    m11638y(((iqk) nxqVarM18123Q5).f31797a);
                    return;
                } catch (nyb e5) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e5)).mo17276G((char) 4399)).mo17290o("Error when parsing count down time");
                    return;
                }
            case 16:
                try {
                    byte[] bArr6 = jtkVar.f34779c;
                    nxq nxqVarM18123Q6 = nxq.m18123Q(iqk.f31795b, bArr6, 0, bArr6.length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q6);
                    i4 = ((iqk) nxqVarM18123Q6).f31797a;
                    break;
                } catch (nyb e6) {
                    ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e6)).mo17276G((char) 4402)).mo17290o("Error when parsing count down time");
                }
                if (((gzp) this.f31875M.mo3831be()).f26960g != i4) {
                    this.f31875M.mo3415bf(gzp.m10019a(i4));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: b */
    public final void mo11604b() {
        if (m11639z(true)) {
            this.f31885i.post(new ipa(this, 12));
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        String str;
        iri iriVar = this.f31870H;
        if (iriVar.f31909c.m11647a() <= 0) {
            iriVar.f31908b.mo13944f("Session is not started. No need to send usage log.");
        } else {
            nxl nxlVar = iriVar.f31914h;
            long jM11647a = iriVar.f31909c.m11647a();
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nml nmlVar = (nml) nxlVar.f44974b;
            nml nmlVar2 = nml.f43842g;
            nmlVar.f43844a |= 1;
            nmlVar.f43845b = jM11647a;
            long jM11647a2 = iriVar.f31910d.m11647a();
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nxq nxqVar = nxlVar.f44974b;
            nml nmlVar3 = (nml) nxqVar;
            nmlVar3.f43844a |= 2;
            nmlVar3.f43846c = jM11647a2;
            int i = iriVar.f31911e;
            if (!nxqVar.m18142ac()) {
                nxlVar.mo18106p();
            }
            nml nmlVar4 = (nml) nxlVar.f44974b;
            nmlVar4.f43844a |= 4;
            nmlVar4.f43847d = i;
            long j = iriVar.f31913g;
            if (j > 0) {
                nxl nxlVar2 = iriVar.f31914h;
                long j2 = iriVar.f31912f / j;
                if (!nxlVar2.f44974b.m18142ac()) {
                    nxlVar2.mo18106p();
                }
                nml nmlVar5 = (nml) nxlVar2.f44974b;
                nmlVar5.f43844a |= 64;
                nmlVar5.f43848e = (int) j2;
            }
            nml nmlVar6 = (nml) iriVar.f31914h.mo18103l();
            iriVar.f31907a.mo8140O(nmlVar6);
            kbo kboVar = iriVar.f31908b;
            long j3 = nmlVar6.f43845b;
            long j4 = nmlVar6.f43846c;
            int iM15003au = kxk.m15003au(nmlVar6.f43849f);
            String string = Integer.toString((iM15003au != 0 ? iM15003au : 1) - 1);
            int i2 = nmlVar6.f43847d;
            if (iriVar.f31913g > 0) {
                str = ", LatencyAveragePreviewMs=" + nmlVar6.f43848e;
            } else {
                str = "";
            }
            kboVar.mo13944f("sendUsageLog done, SessionDurationMs=" + j3 + ", SessionAmbientDurationMs=" + j4 + ", LaunchType=" + string + ", FailureLostConnectionTimes=" + i2 + str);
        }
        Runnable runnable = this.f31884h;
        if (runnable != null) {
            iqu iquVar = this.f31886j;
            lku.m15662p(runnable);
            iquVar.m11613b("onDestroy", runnable);
        }
        jdz jdzVar = this.f31886j.f31830c;
        jfv jfvVar = jib.m13213r(this, jdzVar.f33824g, "MessageListener").f33922b;
        abf.m91d(jfvVar, "Key must not be null");
        jdzVar.m12961f(jfvVar, 24007);
        this.f31866D.quitSafely();
        this.f31892p.close();
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        if (this.f31896t) {
            m11645r();
        }
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: c */
    public final void mo11605c() {
        if (m11639z(true)) {
            this.f31885i.post(new ipa(this, 4));
        }
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        synchronized (this.f31889m) {
            this.f31901y = this.f31900x;
        }
        mo11606f();
        f31863b = false;
        m11637x();
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: f */
    public final void mo11606f() {
        boolean zM11646s = m11646s();
        synchronized (this.f31889m) {
            this.f31900x = null;
        }
        m11634u();
        if (zM11646s) {
            this.f31885i.post(new ipa(this, 3));
        }
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: g */
    public final void mo11607g(String str) {
        synchronized (this.f31889m) {
            this.f31900x = str;
        }
        if (m11646s()) {
            m11635v();
            m11640m(0L);
        }
        m11633t();
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: i */
    public final void mo11608i(Bitmap bitmap, int i) {
        if (m11646s()) {
            this.f31885i.post(new RunnableC0904pi(this, bitmap, i, 14));
        }
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: k */
    public final void mo11609k(boolean z) {
        if (m11639z(true)) {
            this.f31885i.post(new bnp(this, z, 19));
        }
    }

    @Override // p000.iqi
    /* JADX INFO: renamed from: l */
    public final void mo11610l(String str, long j) {
        if (m11646s()) {
            m11636w(str, j);
        }
        if (!"/video_state_paused".equals(str) || !"/video_state_recording".equals(this.f31864B)) {
            this.f31878P = j;
        }
        this.f31864B = str;
        if ("/video_state_stopped".equals(str)) {
            m11634u();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11640m(long j) {
        Runnable runnable;
        if (!m11646s() || (runnable = this.f31883g) == null) {
            return;
        }
        this.f31885i.removeCallbacks(runnable);
        if (j <= 0) {
            this.f31885i.post(this.f31883g);
        } else {
            this.f31885i.postDelayed(this.f31883g, j);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11641n() {
        this.f31885i.post(new ipa(this, 2));
    }

    /* JADX INFO: renamed from: o */
    public final void m11642o(Bitmap bitmap, boolean z) {
        byte[] byteArray;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, true != z ? 65 : 30, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (z) {
                    bitmap.recycle();
                }
                if (byteArray == null) {
                    ((nbe) ((nbe) f31862a.m17251b()).mo17276G((char) 4412)).mo17290o("Compress bitmap failed!");
                    return;
                }
                nxl nxlVarM18137O = iqm.f31801c.m18137O();
                nwr nwrVarM17799u = nwr.m17799u(byteArray);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((iqm) nxlVarM18137O.f44974b).f31803a = nwrVarM17799u;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                ((iqm) nxlVarM18137O.f44974b).f31804b = jCurrentTimeMillis;
                iqm iqmVar = (iqm) nxlVarM18137O.mo18103l();
                String str = true != z ? rgoX.AuDfgDUyIj : KMNlNMe.YhhDtNWDYdIagJ;
                if (m11639z(!z)) {
                    this.f31886j.m11615d(str, iqmVar.mo17760J());
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            ((nbe) ((nbe) ((nbe) f31862a.m17252c()).mo17283h(e2)).mo17276G((char) 4413)).mo17290o("Error when compressBitmap");
            byteArray = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11643p() {
        this.f31885i.post(new ipa(this, 11));
        m11644q();
    }

    /* JADX INFO: renamed from: q */
    public final void m11644q() {
        int i = this.f31877O;
        if (i > 0) {
            this.f31877O = i - 1;
        } else {
            this.f31885i.post(new ipa(this, 13));
        }
    }

    /* JADX INFO: renamed from: r */
    final void m11645r() {
        ((nbe) ((nbe) f31862a.m17252c()).mo17276G((char) 4415)).mo17290o("updateStatus");
        f31863b = true;
        m11637x();
        if (TextUtils.isEmpty(this.f31901y)) {
            m11635v();
        } else {
            mo11607g(this.f31901y);
        }
        m11640m(0L);
        m11633t();
        this.f31877O = 0;
        Intent intent = this.f31867E.getIntent();
        if (intent == null || !intent.equals(this.f31865C)) {
            this.f31865C = intent;
            if (intent.getBooleanExtra("extra_launch_fom_wear", false)) {
                nxl nxlVar = this.f31870H.f31914h;
                if (!nxlVar.f44974b.m18142ac()) {
                    nxlVar.mo18106p();
                }
                nml nmlVar = (nml) nxlVar.f44974b;
                nml nmlVar2 = nml.f43842g;
                nmlVar.f43849f = 2;
                nmlVar.f43844a |= 128;
                Vibrator vibrator = (Vibrator) this.f31871I.getSystemService("vibrator");
                if (vibrator == null || !vibrator.hasVibrator()) {
                    return;
                }
                vibrator.vibrate(f31861A, -1);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11646s() {
        return m11639z(false);
    }
}
