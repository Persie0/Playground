package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import androidx.wear.ambient.AmbientMode;
import com.pairip.VMRunner;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crl implements crj {

    /* JADX INFO: renamed from: a */
    public final mrm f9126a;

    /* JADX INFO: renamed from: c */
    public int f9128c;

    /* JADX INFO: renamed from: d */
    private final dhv f9129d;

    /* JADX INFO: renamed from: e */
    private final crh f9130e;

    /* JADX INFO: renamed from: g */
    private final cry f9132g;

    /* JADX INFO: renamed from: h */
    private final mrm f9133h;

    /* JADX INFO: renamed from: i */
    private final mrm f9134i;

    /* JADX INFO: renamed from: j */
    private final mrm f9135j;

    /* JADX INFO: renamed from: k */
    private final hjj f9136k;

    /* JADX INFO: renamed from: l */
    private final czd f9137l;

    /* JADX INFO: renamed from: n */
    private boolean f9139n;

    /* JADX INFO: renamed from: o */
    private final jvb f9140o;

    /* JADX INFO: renamed from: f */
    private final Object f9131f = new Object();

    /* JADX INFO: renamed from: m */
    private crk f9138m = crk.UNINITIALIZED;

    /* JADX INFO: renamed from: b */
    public mrm f9127b = mqu.f41450a;

    public crl(cdu cduVar, dhv dhvVar, crh crhVar, cry cryVar, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, hjj hjjVar, cvy cvyVar, byte[] bArr) {
        jvb jvbVarM3529i = cduVar.m3529i();
        this.f9140o = jvbVarM3529i;
        this.f9129d = dhvVar;
        this.f9130e = crhVar;
        this.f9132g = cryVar;
        this.f9134i = mrmVar;
        this.f9126a = mrmVar2;
        this.f9135j = mrmVar3;
        this.f9133h = mrmVar4;
        this.f9136k = hjjVar;
        this.f9137l = cvyVar.m5625b(ikw.VIDEO);
        jvbVarM3529i.m13537d(cryVar.mo3830a(new ckv(this, 8), not.INSTANCE));
        if (mrmVar.mo16813g()) {
            jvbVarM3529i.m13537d(((hiw) mrmVar.mo16809c()).mo10345a(new hiq(this, 1)));
        }
        if (mrmVar2.mo16813g() && ((jfs) mrmVar2.mo16809c()).m13086V()) {
            AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
            hjjVar.f28048a.add(ambientController);
            jvbVarM3529i.m13537d(new gto(hjjVar, ambientController, 11, null, null));
        }
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m5421k(kmq kmqVar) {
        return kmqVar.equals(kmq.BACK);
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: a */
    public final mrm mo5412a() {
        long j;
        int i;
        int i2;
        int i3;
        float f;
        long j2;
        int i4;
        int i5;
        synchronized (this.f9131f) {
            if (!mo5419h()) {
                return mqu.f41450a;
            }
            int i6 = this.f9128c;
            boolean z = i6 == 1;
            if (i6 == 0) {
                throw null;
            }
            boolean z2 = !z;
            boolean z3 = i6 == 2;
            mrm mrmVar = this.f9133h;
            if (mrmVar.mo16813g()) {
                crn crnVar = (crn) mrmVar.mo16809c();
                synchronized (crnVar.f9149c) {
                    j2 = crnVar.f9152f;
                }
                synchronized (crnVar.f9149c) {
                    i4 = crnVar.f9151e;
                }
                synchronized (crnVar.f9149c) {
                    i5 = crnVar.f9150d;
                }
                i = 31;
                i3 = i5;
                j = j2;
                i2 = i4;
            } else {
                j = 0;
                i = 3;
                i2 = 0;
                i3 = 0;
            }
            if (this.f9127b.mo16813g()) {
                i |= 32;
                f = (float) ((hiu) this.f9127b.mo16809c()).f27958c;
            } else {
                f = 0.0f;
            }
            if (i == 63) {
                return mrm.m16829i(new crm(z2, z3, j, i2, i3, f));
            }
            StringBuilder sb = new StringBuilder();
            if ((i & 4) == 0) {
                sb.append(" audioFrameCount");
            }
            if ((i & 8) == 0) {
                sb.append(" audioFrameDropCount");
            }
            if ((i & 16) == 0) {
                sb.append(" audioMaxFrameDropCount");
            }
            if ((i & 32) == 0) {
                sb.append(" noiseFraction");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: b */
    public void mo5413b(csn csnVar) {
        VMRunner.invoke("skvblJ8yZ4HUs8HL", new Object[]{this, csnVar});
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [hjg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [hjg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [hjg, java.lang.Object] */
    @Override // p000.crj
    /* JADX INFO: renamed from: c */
    public final void mo5414c(kpw kpwVar, kpp kppVar) {
        if (this.f9137l.mo5731bp() == 1) {
            mrm mrmVar = this.f9126a;
            if (mrmVar.mo16813g() && ((jfs) mrmVar.mo16809c()).f33914a.mo10369i()) {
                hjj hjjVar = this.f9136k;
                if (kppVar != null && !hjjVar.f28048a.isEmpty()) {
                    int i = hjjVar.f28050c + 1;
                    hjjVar.f28050c = i;
                    if (i >= 30) {
                        hjjVar.f28050c = 0;
                        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
                        Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
                        rect.getClass();
                        if (faceArr != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= faceArr.length) {
                                    hjjVar.f28049b = 0;
                                    break;
                                }
                                Rect bounds = faceArr[i2].getBounds();
                                if (((bounds.width() * 1.6666666f) / rect.width()) * ((bounds.height() * 1.6666666f) / rect.height()) > 0.05f) {
                                    int iMin = Math.min(hjjVar.f28049b + 1, 3);
                                    hjjVar.f28049b = iMin;
                                    if (iMin != 3) {
                                        break;
                                    }
                                    Iterator it = hjjVar.f28048a.iterator();
                                    while (it.hasNext()) {
                                        jfs jfsVar = (jfs) ((crl) ((AmbientMode.AmbientController) it.next()).f1697a).f9126a.mo16809c();
                                        if (jfsVar.f33914a.mo10371k() == 2) {
                                            jfsVar.f33914a.mo10366f();
                                        }
                                    }
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            hjjVar.f28049b = 0;
                            break;
                        }
                    }
                }
            }
        }
        synchronized (this.f9131f) {
            if (mo5419h() && this.f9138m.equals(crk.STARTED) && this.f9127b.mo16813g()) {
                int i3 = ((hiu) this.f9127b.mo16809c()).f27959d;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == 1) {
                    mrm mrmVar2 = this.f9135j;
                    if (mrmVar2.mo16813g()) {
                        ((hix) mrmVar2.mo16809c()).mo10358c(kpwVar);
                    }
                }
            }
            kpwVar.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hjg, java.lang.Object] */
    @Override // p000.crj
    /* JADX INFO: renamed from: d */
    public final void mo5415d() {
        if (this.f9130e.mo5401g()) {
            mrm mrmVar = this.f9134i;
            if (mrmVar.mo16813g()) {
                ((hiw) mrmVar.mo16809c()).mo10350f();
            }
            mrm mrmVar2 = this.f9126a;
            if (mrmVar2.mo16813g()) {
                ((jfs) mrmVar2.mo16809c()).f33914a.mo10367g();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hjg, java.lang.Object] */
    @Override // p000.crj
    /* JADX INFO: renamed from: e */
    public final void mo5416e() {
        if (this.f9130e.mo5401g()) {
            mrm mrmVar = this.f9134i;
            if (mrmVar.mo16813g()) {
            }
            mrm mrmVar2 = this.f9126a;
            if (mrmVar2.mo16813g()) {
                ((jfs) mrmVar2.mo16809c()).f33914a.mo10368h();
            }
        }
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: f */
    public void mo5417f() {
        VMRunner.invoke("1yXlwfPuPSOmHvwa", new Object[]{this});
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: g */
    public final void mo5418g() {
        synchronized (this.f9131f) {
            if (this.f9138m.equals(crk.STARTED)) {
                mrm mrmVar = this.f9134i;
                if (mrmVar.mo16813g()) {
                    ((hiw) mrmVar.mo16809c()).mo10353i();
                }
                mrm mrmVar2 = this.f9126a;
                if (mrmVar2.mo16813g()) {
                }
                mrm mrmVar3 = this.f9135j;
                if (mrmVar3.mo16813g()) {
                    ((hix) mrmVar3.mo16809c()).mo10357b();
                }
                this.f9138m = crk.STOPPED;
            }
        }
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: h */
    public final boolean mo5419h() {
        return this.f9139n && ((gzo) this.f9132g.mo3831be()).equals(gzo.ON);
    }

    @Override // p000.crj
    /* JADX INFO: renamed from: i */
    public final boolean mo5420i(csn csnVar) {
        if (!m5421k(csnVar.f9359x)) {
            return true;
        }
        mrm mrmVar = this.f9126a;
        return mrmVar.mo16813g() && ((jfs) mrmVar.mo16809c()).m13086V();
    }

    /* JADX INFO: renamed from: j */
    public final void m5422j(hiu hiuVar) {
        if (mo5419h()) {
            mrm mrmVar = this.f9134i;
            if (mrmVar.mo16813g()) {
                ((hiw) mrmVar.mo16809c()).mo10349e(hiuVar);
            }
        }
    }
}
