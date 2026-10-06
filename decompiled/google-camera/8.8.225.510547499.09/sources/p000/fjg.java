package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import androidx.wear.ambient.AmbientModeSupport;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjg implements fiq, dxy {

    /* JADX INFO: renamed from: e */
    private static final nbh f22221e = nbh.m17259h("com/google/android/apps/camera/microvideo/gyro/MotionDataProcessorImpl");

    /* JADX INFO: renamed from: C */
    private final bkn f22224C;

    /* JADX INFO: renamed from: a */
    public final MediaFormat f22225a;

    /* JADX INFO: renamed from: b */
    public volatile kyt f22226b;

    /* JADX INFO: renamed from: d */
    public final C1058va f22228d;

    /* JADX INFO: renamed from: f */
    private final Executor f22229f;

    /* JADX INFO: renamed from: g */
    private final gtl f22230g;

    /* JADX INFO: renamed from: h */
    private final gtd f22231h;

    /* JADX INFO: renamed from: i */
    private final eat f22232i;

    /* JADX INFO: renamed from: j */
    private final mrm f22233j;

    /* JADX INFO: renamed from: k */
    private final mrm f22234k;

    /* JADX INFO: renamed from: l */
    private final dxx f22235l;

    /* JADX INFO: renamed from: m */
    private final kbc f22236m;

    /* JADX INFO: renamed from: n */
    private final fjb f22237n;

    /* JADX INFO: renamed from: o */
    private final AtomicLong f22238o = new AtomicLong(-1);

    /* JADX INFO: renamed from: p */
    private final AtomicLong f22239p = new AtomicLong(-1);

    /* JADX INFO: renamed from: q */
    private final AtomicLong f22240q = new AtomicLong(-1);

    /* JADX INFO: renamed from: r */
    private final AtomicLong f22241r = new AtomicLong(-1);

    /* JADX INFO: renamed from: s */
    private final AtomicLong f22242s = new AtomicLong(-1);

    /* JADX INFO: renamed from: t */
    private final AtomicLong f22243t = new AtomicLong(-1);

    /* JADX INFO: renamed from: u */
    private final AtomicLong f22244u = new AtomicLong(0);

    /* JADX INFO: renamed from: v */
    private final AtomicLong f22245v = new AtomicLong(0);

    /* JADX INFO: renamed from: w */
    private final AtomicLong f22246w = new AtomicLong(0);

    /* JADX INFO: renamed from: x */
    private final AtomicLong f22247x = new AtomicLong(0);

    /* JADX INFO: renamed from: y */
    private final AtomicLong f22248y = new AtomicLong(0);

    /* JADX INFO: renamed from: z */
    private final AtomicLong f22249z = new AtomicLong(0);

    /* JADX INFO: renamed from: A */
    private final AtomicLong f22222A = new AtomicLong(0);

    /* JADX INFO: renamed from: B */
    private final kon f22223B = new kon((byte[]) null, (byte[]) null);

    /* JADX INFO: renamed from: c */
    public AmbientModeSupport.AmbientController f22227c = null;

    public fjg(eat eatVar, C1058va c1058va, dxx dxxVar, mrm mrmVar, mrm mrmVar2, Executor executor, kbc kbcVar, gtl gtlVar, gtd gtdVar, fjb fjbVar, bkn bknVar, MediaFormat mediaFormat, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f22232i = eatVar;
        this.f22228d = c1058va;
        this.f22233j = mrmVar;
        this.f22234k = mrmVar2;
        this.f22229f = executor;
        this.f22230g = gtlVar;
        this.f22231h = gtdVar;
        this.f22235l = dxxVar;
        this.f22236m = kbcVar;
        this.f22237n = fjbVar;
        this.f22224C = bknVar;
        this.f22225a = mediaFormat;
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: g */
    private final void m8487g(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z || jCurrentTimeMillis - this.f22249z.get() > 1000) {
            this.f22240q.get();
            this.f22239p.get();
            this.f22244u.get();
            this.f22245v.get();
            this.f22238o.get();
            this.f22247x.get();
            this.f22241r.get();
            this.f22246w.get();
            this.f22222A.get();
            this.f22248y.get();
            this.f22242s.get();
            this.f22243t.get();
            this.f22223B.m14632h();
            this.f22249z.set(jCurrentTimeMillis);
        }
    }

    @Override // p000.fiq
    /* JADX INFO: renamed from: b */
    public final void mo8466b(MediaCodec.BufferInfo bufferInfo) {
        this.f22241r.set(bufferInfo.presentationTimeUs);
        this.f22246w.incrementAndGet();
        if (!this.f22223B.m14633i(bufferInfo.presentationTimeUs, new fjf(bufferInfo, 1))) {
            ((nbe) ((nbe) f22221e.m17251b()).mo17276G(2343)).mo17292q("onEncoded(%d) was received but we weren't expecting this timestamp", bufferInfo.presentationTimeUs);
        }
        this.f22229f.execute(new fit(this, 5));
    }

    @Override // p000.dxy
    /* JADX INFO: renamed from: bP */
    public final void mo6891bP(gsr gsrVar) {
        this.f22238o.set(gsrVar.f26243c);
        this.f22247x.incrementAndGet();
        m8487g(false);
        long jConvert = TimeUnit.MICROSECONDS.convert(gsrVar.f26243c, TimeUnit.NANOSECONDS);
        if (this.f22223B.m14632h() > 0) {
            this.f22223B.m14633i(jConvert, new fjf(gsrVar, 0));
        }
        long j = gsrVar.f26243c;
        Iterator it = ((ktz) this.f22223B.f36701a).m14860m().iterator();
        while (it.hasNext()) {
            fje fjeVar = ((fjd) it.next()).f22210a;
            if (j <= fjeVar.f22212b) {
                break;
            } else if (!fjeVar.f22217g) {
                fjeVar.f22217g = true;
            }
        }
        this.f22229f.execute(new fit(this, 5));
    }

    @Override // p000.fiq
    /* JADX INFO: renamed from: c */
    public final void mo8467c(long j) {
        this.f22239p.set(j);
        flu.m8559b();
        m8487g(false);
        if (this.f22232i.m7020e()) {
            this.f22245v.incrementAndGet();
            fjd fjdVarM8481d = fjd.m8481d(this.f22236m, j, 1);
            this.f22223B.m14634j(fjdVarM8481d);
            if (j < this.f22238o.get()) {
                fjdVarM8481d.f22210a.f22217g = true;
            }
            gsr gsrVarM6885a = this.f22235l.m6885a(j);
            if (gsrVarM6885a != null) {
                fjdVarM8481d.f22210a.f22213c.mo14894e(gsrVarM6885a);
            }
            this.f22229f.execute(new fit(this, 5));
        }
    }

    @Override // p000.fiq
    /* JADX INFO: renamed from: d */
    public final void mo8468d(long j, List list) {
        this.f22240q.set(j);
        flu.m8559b();
        fjd fjdVarM8481d = fjd.m8481d(this.f22236m, j, 2);
        fjdVarM8481d.f22210a.f22216f.mo14894e(list);
        this.f22223B.m14634j(fjdVarM8481d);
        this.f22244u.incrementAndGet();
        gsr gsrVarM6885a = this.f22235l.m6885a(j);
        if (gsrVarM6885a != null) {
            fjdVarM8481d.f22210a.f22213c.mo14894e(gsrVarM6885a);
        }
        this.f22229f.execute(new fit(this, 5));
    }

    @Override // p000.fiq
    /* JADX INFO: renamed from: e */
    public final void mo8469e() {
        m8487g(true);
        this.f22229f.execute(new fit(this, 4));
    }

    /* JADX INFO: renamed from: f */
    public final void m8488f() {
        fje fjeVar;
        while (this.f22223B.m14632h() > 0) {
            kon konVar = this.f22223B;
            synchronized (konVar.f36701a) {
                fjd fjdVar = (fjd) ((ktz) konVar.f36701a).m14858k();
                fjeVar = null;
                if (fjdVar != null && fjdVar.m8484c()) {
                    fjd fjdVar2 = (fjd) ((ktz) konVar.f36701a).m14859l();
                    if (fjdVar2 != null && fjdVar2.m8484c()) {
                        fjeVar = fjdVar2.f22210a;
                    }
                }
            }
            if (fjeVar == null) {
                return;
            }
            boolean z = fhc.f21954a;
            List<lbp> listM7017b = fjeVar.f22216f.isDone() ? (List) kxk.m14974T(fjeVar.f22216f) : this.f22232i.m7017b(fjeVar.f22212b, (gsr) kxk.m14974T(fjeVar.f22213c));
            exg.m7986p(this.f22233j, fjeVar.f22212b);
            exg.m7985o(this.f22234k, fjeVar.f22212b);
            gth gthVarMo9759d = this.f22230g.mo9759d(fjeVar.f22212b);
            if (gthVarMo9759d != null) {
                this.f22231h.m9738b(gthVarMo9759d.f26339a);
            }
            if (gthVarMo9759d != null) {
                this.f22231h.m9739c(gthVarMo9759d.f26339a);
            }
            fjb fjbVar = this.f22237n;
            boolean zMo9812h = fjbVar.f22203b.mo9812h(fjbVar.f22204c.mo14558k());
            kay kayVarM14647a = fjbVar.f22205d.m14647a();
            boolean z2 = kayVarM14647a == kay.CLOCKWISE_90 || kayVarM14647a == kay.CLOCKWISE_270;
            ArrayList arrayList = new ArrayList(listM7017b.size());
            for (lbp lbpVar : listM7017b) {
                if (zMo9812h) {
                    arrayList.add(lbpVar.m15147c(z2 ? lbp.f37886b : lbp.f37885a));
                } else {
                    arrayList.add(lbpVar);
                }
            }
            boolean z3 = fhc.f21954a;
            boolean z4 = fhc.f21954a;
            lku.m15613H(fjeVar.f22214d.isDone());
            lku.m15613H(fjeVar.f22213c.isDone());
            try {
                bkn bknVar = this.f22224C;
                nxl nxlVarM18137O = obg.f45260h.m18137O();
                float[] fArr = new float[arrayList.size() * 9];
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    float[] fArrM15148d = ((lbp) it.next()).m15148d();
                    int i2 = 0;
                    while (i2 < 9) {
                        fArr[i] = fArrM15148d[i2];
                        i2++;
                        i++;
                    }
                }
                List listM14989ag = kxk.m14989ag(fArr);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                obg obgVar = (obg) nxlVarM18137O.f44974b;
                nxv nxvVar = obgVar.f45263b;
                if (!nxvVar.mo17770c()) {
                    obgVar.f45263b = nxq.m18124R(nxvVar);
                }
                nwb.m17749e(listM14989ag, obgVar.f45263b);
                int i3 = fjeVar.f22211a.f35517a;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                obg obgVar2 = (obg) nxqVar;
                obgVar2.f45262a |= 1;
                obgVar2.f45264c = i3;
                int i4 = fjeVar.f22211a.f35518b;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                obg obgVar3 = (obg) nxlVarM18137O.f44974b;
                obgVar3.f45262a |= 2;
                obgVar3.f45265d = i4;
                long jConvert = TimeUnit.MICROSECONDS.convert(fjeVar.f22212b, TimeUnit.NANOSECONDS);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                obg obgVar4 = (obg) nxlVarM18137O.f44974b;
                obgVar4.f45262a |= 4;
                obgVar4.f45266e = jConvert;
                int i5 = 1 != (((MediaCodec.BufferInfo) kxk.m14974T(fjeVar.f22214d)).flags & 1) ? 2 : 3;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                obg obgVar5 = (obg) nxqVar2;
                obgVar5.f45267f = i5 - 1;
                obgVar5.f45262a |= 8;
                switch (fjeVar.f22218h - 1) {
                    case 1:
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        obg obgVar6 = (obg) nxlVarM18137O.f44974b;
                        obgVar6.f45268g = 2;
                        obgVar6.f45262a |= 64;
                        break;
                    default:
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        obg obgVar7 = (obg) nxlVarM18137O.f44974b;
                        obgVar7.f45268g = 1;
                        obgVar7.f45262a |= 64;
                        break;
                }
                ((dsx) bknVar.f3651a).m6696k();
                byte[] bArrMo17760J = ((obg) nxlVarM18137O.mo18103l()).mo17760J();
                long jConvert2 = TimeUnit.MICROSECONDS.convert(fjeVar.f22212b, TimeUnit.NANOSECONDS);
                int i6 = ((MediaCodec.BufferInfo) kxk.m14974T(fjeVar.f22214d)).flags;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(0, bArrMo17760J.length, jConvert2, i6);
                Pair pairCreate = Pair.create(ByteBuffer.wrap(bArrMo17760J), bufferInfo);
                if (this.f22226b != null) {
                    this.f22226b.mo8409b((ByteBuffer) pairCreate.first, (MediaCodec.BufferInfo) pairCreate.second);
                    this.f22222A.incrementAndGet();
                    this.f22242s.set(fjeVar.f22212b);
                } else {
                    this.f22248y.incrementAndGet();
                    this.f22243t.set(fjeVar.f22212b);
                }
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) f22221e.m17251b()).mo17283h(e)).mo17276G((char) 2345)).mo17290o("Cannot serialize gyro data.");
            }
        }
    }
}
