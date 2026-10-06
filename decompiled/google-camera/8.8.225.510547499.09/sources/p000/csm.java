package p000;

import android.content.res.Resources;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class csm implements kba {

    /* JADX INFO: renamed from: A */
    private csl f9297A;

    /* JADX INFO: renamed from: C */
    private final drj f9299C;

    /* JADX INFO: renamed from: D */
    private final cwd f9300D;

    /* JADX INFO: renamed from: E */
    private final drj f9301E;

    /* JADX INFO: renamed from: F */
    private final bkn f9302F;

    /* JADX INFO: renamed from: a */
    public final igb f9303a;

    /* JADX INFO: renamed from: b */
    public final idl f9304b;

    /* JADX INFO: renamed from: c */
    public final String f9305c;

    /* JADX INFO: renamed from: d */
    private final float f9306d;

    /* JADX INFO: renamed from: e */
    private final jwn f9307e;

    /* JADX INFO: renamed from: f */
    private final jwn f9308f;

    /* JADX INFO: renamed from: g */
    private final jwn f9309g;

    /* JADX INFO: renamed from: h */
    private final jwn f9310h;

    /* JADX INFO: renamed from: i */
    private final jww f9311i;

    /* JADX INFO: renamed from: j */
    private final fvd f9312j;

    /* JADX INFO: renamed from: k */
    private final cso f9313k;

    /* JADX INFO: renamed from: l */
    private final dbr f9314l;

    /* JADX INFO: renamed from: m */
    private final jvd f9315m;

    /* JADX INFO: renamed from: n */
    private final jww f9316n;

    /* JADX INFO: renamed from: o */
    private final gyz f9317o;

    /* JADX INFO: renamed from: p */
    private final jww f9318p;

    /* JADX INFO: renamed from: q */
    private final hah f9319q;

    /* JADX INFO: renamed from: r */
    private final dhv f9320r;

    /* JADX INFO: renamed from: s */
    private final kme f9321s;

    /* JADX INFO: renamed from: t */
    private final mrm f9322t;

    /* JADX INFO: renamed from: u */
    private final cry f9323u;

    /* JADX INFO: renamed from: v */
    private kmq f9324v;

    /* JADX INFO: renamed from: x */
    private final jww f9326x;

    /* JADX INFO: renamed from: y */
    private final jww f9327y;

    /* JADX INFO: renamed from: z */
    private final jwn f9328z;

    /* JADX INFO: renamed from: B */
    private final Object f9298B = new Object();

    /* JADX INFO: renamed from: w */
    private final jww f9325w = new jwf(csj.UNINITIALIZED);

    public csm(Resources resources, drj drjVar, bkn bknVar, fvd fvdVar, jwn jwnVar, jww jwwVar, jwn jwnVar2, jww jwwVar2, jww jwwVar3, jwn jwnVar3, cso csoVar, cwd cwdVar, dbr dbrVar, igb igbVar, idl idlVar, jvd jvdVar, hah hahVar, dhv dhvVar, kme kmeVar, float f, jww jwwVar4, gyz gyzVar, mrm mrmVar, drj drjVar2, cry cryVar, jwn jwnVar4, jwn jwnVar5, jww jwwVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f9301E = drjVar;
        this.f9302F = bknVar;
        this.f9312j = fvdVar;
        this.f9308f = jwnVar;
        this.f9311i = jwwVar;
        this.f9307e = jwnVar2;
        this.f9326x = jwwVar2;
        this.f9327y = jwwVar3;
        this.f9328z = jwnVar3;
        this.f9313k = csoVar;
        this.f9300D = cwdVar;
        this.f9314l = dbrVar;
        this.f9303a = igbVar;
        this.f9304b = idlVar;
        this.f9315m = jvdVar;
        this.f9305c = resources.getString(C0100R.string.pref_camera_video_flashmode_torch);
        this.f9316n = jwwVar4;
        this.f9317o = gyzVar;
        this.f9318p = jwwVar5;
        this.f9319q = hahVar;
        this.f9320r = dhvVar;
        this.f9321s = kmeVar;
        this.f9306d = f;
        this.f9322t = mrmVar;
        this.f9299C = drjVar2;
        this.f9323u = cryVar;
        this.f9310h = jwnVar4;
        this.f9309g = jwnVar5;
    }

    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: a */
    public final synchronized csl m5464a() {
        csl cslVar;
        synchronized (this.f9298B) {
            if (this.f9314l.mo5895d() == this.f9324v && (cslVar = this.f9297A) != null) {
                return cslVar;
            }
            this.f9300D.m5657d(cum.CAPTURE_SESSION).m13537d(this);
            this.f9324v = this.f9314l.mo5895d();
            fvu fvuVar = (fvu) this.f9314l.m5896e().mo16809c();
            geg gegVar = !this.f9320r.mo6184l(dib.f11273ag) ? new geg(this.f9306d, this.f9307e, fvuVar, this.f9320r, this.f9321s) : new geg(this.f9306d, this.f9307e, fvuVar, kan.m13873j(this.f9299C.m6621a(this.f9314l.mo5895d()).m13661b()), this.f9320r, this.f9321s);
            jwf jwfVar = new jwf(fvuVar.mo14555h());
            jwn jwnVarM13640j = jwr.m13640j(jwfVar, cgh.f5601q);
            MeteringRectangle[] meteringRectangleArr = fuv.f23610a;
            jwf jwfVar2 = new jwf(fuu.f23609a);
            jwf jwfVar3 = new jwf(fuu.f23609a);
            fui fuiVar = new fui(jwfVar2, jwnVarM13640j);
            ful fulVar = new ful(jwfVar3, jwnVarM13640j);
            jwf jwfVar4 = new jwf(false);
            jwn jwnVarM13640j2 = jwr.m13640j(this.f9319q.mo10029a(gzy.f27063v), new ceg(this, 10));
            jwn jwnVarM13640j3 = jwr.m13640j(this.f9319q.mo10029a(gzy.f27066y), cgh.f5602r);
            jvb jvbVarM5657d = this.f9300D.m5657d(cum.CAPTURE_SESSION);
            int i = 9;
            if (this.f9314l.m5900i()) {
                jvbVarM5657d.m13537d(jwr.m13634d(jwnVarM13640j3, jwnVarM13640j2).mo3830a(new ckv(jwfVar4, i), this.f9315m));
            } else if (this.f9314l.m5901j()) {
                jvbVarM5657d.m13537d(this.f9319q.mo10029a(gzy.f27064w).mo3830a(new cdb(this, jwfVar4, 7), this.f9315m));
            }
            this.f9311i.mo3415bf(true);
            jwf jwfVar5 = new jwf(false);
            jwf jwfVar6 = new jwf(false);
            jvbVarM5657d.m13537d(this.f9301E.f12397c.mo3830a(new cdb(jwfVar5, jwfVar6, 8), not.INSTANCE));
            jvbVarM5657d.m13537d(this.f9312j.f23623a.mo3830a(new ckv(jwfVar5, 10), not.INSTANCE));
            jvbVarM5657d.m13537d(jwfVar4.mo3830a(new cdb(jwfVar5, jwfVar6, 9), not.INSTANCE));
            jvbVarM5657d.m13537d(gegVar.mo3830a(new cdb(jwfVar5, jwfVar6, 10), not.INSTANCE));
            jvbVarM5657d.m13537d(this.f9325w.mo3830a(new ckv(this, 11), this.f9315m));
            cso csoVar = this.f9313k;
            csoVar.m5469e();
            jwf jwfVar7 = csoVar.f9363b;
            jwn jwnVarM5465a = this.f9313k.m5465a();
            jwn jwnVar = this.f9308f;
            if (jwnVar == null) {
                throw new NullPointerException("Null portraitIdle");
            }
            ?? r12 = this.f9301E.f12397c;
            jwn jwnVar2 = this.f9312j.f23623a;
            if (jwnVar2 == null) {
                throw new NullPointerException("Null awbSetting");
            }
            mrm mrmVar = this.f9322t;
            mrm mrmVarM16829i = mrmVar.mo16813g() ? mrm.m16829i(((gmh) mrmVar.mo16809c()).mo9504b()) : mqu.f41450a;
            jww jwwVar = this.f9326x;
            if (jwwVar == null) {
                throw new NullPointerException("Null macroFocusState");
            }
            geg gegVar2 = gegVar;
            jww jwwVar2 = this.f9327y;
            if (jwwVar2 == null) {
                throw new NullPointerException("Null macroFocusScene");
            }
            jwn jwnVar3 = this.f9328z;
            jwn jwnVar4 = this.f9307e;
            if (jwnVar4 == null) {
                throw new NullPointerException("Null zoomRatio");
            }
            ?? r11 = this.f9301E.f12398d;
            ?? r13 = this.f9302F.f3651a;
            jww jwwVar3 = this.f9311i;
            if (jwwVar3 == null) {
                throw new NullPointerException("Null caf");
            }
            jwf jwfVar8 = new jwf(csk.UNINITIALIZED);
            jww jwwVar4 = this.f9325w;
            jwn jwnVarMo10029a = this.f9319q.mo10029a(gzy.f27066y);
            jwf jwfVar9 = new jwf(true);
            jwf jwfVar10 = new jwf(false);
            jww jwwVar5 = this.f9316n;
            if (jwwVar5 == null) {
                throw new NullPointerException("Null stabilizationMode");
            }
            gyz gyzVar = this.f9317o;
            if (gyzVar == null) {
                throw new NullPointerException("Null audioDeviceStateManager");
            }
            cry cryVar = this.f9323u;
            jwn jwnVar5 = this.f9310h;
            if (jwnVar5 == null) {
                throw new NullPointerException("Null foldState");
            }
            jwn jwnVar6 = this.f9309g;
            if (jwnVar6 == null) {
                throw new NullPointerException("Null jupiterSessionActivated");
            }
            jww jwwVar6 = this.f9318p;
            if (jwwVar6 == null) {
                throw new NullPointerException("Null actionOnUserEdu");
            }
            csl cslVar2 = new csl(r12, jwnVar4, jwfVar2, jwfVar3, jwfVar, r11, r13, jwwVar3, jwfVar4, jwfVar8, jwwVar4, jwnVarMo10029a, jwfVar5, jwfVar6, jwfVar9, jwfVar10, jwwVar5, mrmVarM16829i, jwwVar, jwwVar2, jwnVar3, jwnVar2, jwnVar, jwfVar7, jwnVarM5465a, fuiVar, fulVar, cryVar, jwnVar5, jwnVar6, jwwVar6, gegVar2, gyzVar);
            this.f9297A = cslVar2;
            return cslVar2;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9298B) {
            this.f9297A = null;
        }
    }
}
