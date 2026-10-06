package p000;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccc implements iqa, kba {

    /* JADX INFO: renamed from: B */
    private final Handler f5079B;

    /* JADX INFO: renamed from: C */
    private long f5080C;

    /* JADX INFO: renamed from: E */
    private mrm f5082E;

    /* JADX INFO: renamed from: a */
    public final hsk f5083a;

    /* JADX INFO: renamed from: b */
    public final hwx f5084b;

    /* JADX INFO: renamed from: c */
    public final kmq f5085c;

    /* JADX INFO: renamed from: d */
    public final ccd f5086d;

    /* JADX INFO: renamed from: e */
    public final dxh f5087e;

    /* JADX INFO: renamed from: f */
    public final elx f5088f;

    /* JADX INFO: renamed from: g */
    public final mrm f5089g;

    /* JADX INFO: renamed from: h */
    public final jvb f5090h;

    /* JADX INFO: renamed from: i */
    public final idb f5091i;

    /* JADX INFO: renamed from: j */
    public final jwn f5092j;

    /* JADX INFO: renamed from: k */
    public final hah f5093k;

    /* JADX INFO: renamed from: l */
    public final hai f5094l;

    /* JADX INFO: renamed from: m */
    public final mrm f5095m;

    /* JADX INFO: renamed from: n */
    public final jwn f5096n;

    /* JADX INFO: renamed from: q */
    public jvb f5099q;

    /* JADX INFO: renamed from: r */
    public kba f5100r;

    /* JADX INFO: renamed from: s */
    public kba f5101s;

    /* JADX INFO: renamed from: t */
    public PointF f5102t;

    /* JADX INFO: renamed from: u */
    public cdj f5103u;

    /* JADX INFO: renamed from: v */
    public mrm f5104v;

    /* JADX INFO: renamed from: w */
    public mrm f5105w;

    /* JADX INFO: renamed from: x */
    public mrm f5106x;

    /* JADX INFO: renamed from: y */
    public mrm f5107y;

    /* JADX INFO: renamed from: z */
    public final npk f5108z;

    /* JADX INFO: renamed from: o */
    public boolean f5097o = false;

    /* JADX INFO: renamed from: p */
    public boolean f5098p = false;

    /* JADX INFO: renamed from: D */
    private boolean f5081D = false;

    public ccc(Context context, hsk hskVar, hwx hwxVar, kmq kmqVar, ccd ccdVar, dxh dxhVar, npk npkVar, Handler handler, elx elxVar, mrm mrmVar, jvb jvbVar, hah hahVar, hai haiVar, mrm mrmVar2, jwn jwnVar, jwn jwnVar2, byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f5082E = mquVar;
        this.f5104v = mquVar;
        this.f5105w = mquVar;
        this.f5106x = mquVar;
        this.f5107y = mquVar;
        this.f5083a = hskVar;
        this.f5084b = hwxVar;
        this.f5085c = kmqVar;
        this.f5086d = ccdVar;
        this.f5108z = npkVar;
        this.f5087e = dxhVar;
        this.f5079B = handler;
        this.f5088f = elxVar;
        this.f5089g = mrmVar;
        this.f5090h = jvbVar;
        this.f5093k = hahVar;
        this.f5094l = haiVar;
        this.f5095m = mrmVar2;
        this.f5091i = jpd.m13426g(false, 3000, null, null, context.getResources().getString(C0100R.string.notification_lens_moved_to_modes), context, false, -1, 11);
        this.f5092j = jwnVar;
        this.f5096n = jwnVar2;
        jvbVar.m13537d(this);
    }

    @Override // p000.iqa
    /* JADX INFO: renamed from: a */
    public final void mo3421a(PointF pointF) {
        this.f5102t = new PointF(pointF.x - this.f5087e.mo4145c().x, pointF.y - this.f5087e.mo4145c().y);
        this.f5098p = false;
        this.f5081D = false;
        nnf nnfVar = nnf.INSTANCE;
        this.f5080C = Instant.now().toEpochMilli();
        mrm mrmVarM16829i = mrm.m16829i(new baa(this, 15));
        this.f5082E = mrmVarM16829i;
        this.f5079B.postDelayed((Runnable) mrmVarM16829i.mo16809c(), 600L);
    }

    @Override // p000.ipz
    /* JADX INFO: renamed from: b */
    public final void mo3422b() {
        nnf nnfVar = nnf.INSTANCE;
        if (!Instant.now().minusMillis(this.f5080C).isBefore(Instant.ofEpochMilli(600L)) || this.f5081D) {
            return;
        }
        m3425e();
        if (this.f5082E.mo16813g()) {
            this.f5079B.removeCallbacks((Runnable) this.f5082E.mo16809c());
        }
    }

    @Override // p000.ipz
    /* JADX INFO: renamed from: c */
    public final void mo3423c() {
        this.f5081D = true;
        if (this.f5082E.mo16813g()) {
            this.f5079B.removeCallbacks((Runnable) this.f5082E.mo16809c());
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5097o = true;
        kba kbaVar = this.f5100r;
        if (kbaVar != null) {
            kbaVar.close();
        }
        kba kbaVar2 = this.f5101s;
        if (kbaVar2 != null) {
            kbaVar2.close();
        }
        jvb jvbVar = this.f5099q;
        if (jvbVar != null) {
            jvbVar.close();
        }
        if (this.f5082E.mo16813g()) {
            this.f5079B.removeCallbacks((Runnable) this.f5082E.mo16809c());
            this.f5082E = mqu.f41450a;
        }
    }

    @Override // p000.iqa
    /* JADX INFO: renamed from: d */
    public final void mo3424d(PointF pointF) {
        this.f5098p = true;
        m3425e();
    }

    /* JADX INFO: renamed from: e */
    public final void m3425e() {
        if (((Boolean) ((jwf) this.f5087e.mo4156n()).f34942d).booleanValue()) {
            this.f5087e.mo4162t(false);
            cdj cdjVar = this.f5103u;
            if (cdjVar != null) {
                cdjVar.mo3444i();
            }
            mrm mrmVar = this.f5095m;
            if (mrmVar.mo16813g()) {
                ((hrx) mrmVar.mo16809c()).mo10671c(hrw.TOUCH_TO_FOCUS);
            }
            if (((Boolean) this.f5092j.mo3831be()).booleanValue()) {
                mrm mrmVarM16829i = mrm.m16829i(this.f5087e.mo4151i());
                this.f5107y = mrmVarM16829i;
                ((ilv) mrmVarM16829i.mo16809c()).mo11450b(new ccb(this, 2));
            } else {
                mrm mrmVarM16829i2 = mrm.m16829i(this.f5087e.mo4149g());
                this.f5105w = mrmVarM16829i2;
                ((ilv) mrmVarM16829i2.mo16809c()).mo11450b(new ccb(this, 3));
            }
        }
    }
}
