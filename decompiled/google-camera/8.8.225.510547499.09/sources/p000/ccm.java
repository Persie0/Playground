package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccm implements ccl, kbg {

    /* JADX INFO: renamed from: a */
    public final dxh f5142a;

    /* JADX INFO: renamed from: b */
    public ilv f5143b;

    /* JADX INFO: renamed from: c */
    public ilv f5144c;

    /* JADX INFO: renamed from: d */
    final cdk f5145d;

    /* JADX INFO: renamed from: e */
    public nqf f5146e;

    /* JADX INFO: renamed from: f */
    public boolean f5147f;

    /* JADX INFO: renamed from: g */
    public boolean f5148g;

    /* JADX INFO: renamed from: h */
    public final imw f5149h;

    /* JADX INFO: renamed from: i */
    public final oyo f5150i;

    /* JADX INFO: renamed from: j */
    private final jvd f5151j;

    /* JADX INFO: renamed from: k */
    private final jvb f5152k;

    /* JADX INFO: renamed from: l */
    private final dbr f5153l;

    /* JADX INFO: renamed from: m */
    private final fuz f5154m;

    /* JADX INFO: renamed from: n */
    private final dhv f5155n;

    /* JADX INFO: renamed from: o */
    private final mrm f5156o;

    /* JADX INFO: renamed from: p */
    private final jwn f5157p;

    /* JADX INFO: renamed from: q */
    private final jwn f5158q;

    /* JADX INFO: renamed from: r */
    private kba f5159r;

    /* JADX INFO: renamed from: s */
    private int f5160s;

    /* JADX INFO: renamed from: t */
    private final jwn f5161t;

    /* JADX INFO: renamed from: u */
    private final juw f5162u;

    /* JADX INFO: renamed from: v */
    private int f5163v;

    public ccm(jvd jvdVar, dxh dxhVar, dbr dbrVar, dhv dhvVar, fuz fuzVar, mrm mrmVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, jwn jwnVar4, kmd kmdVar) {
        jvb jvbVar = new jvb();
        this.f5152k = jvbVar;
        this.f5143b = null;
        this.f5144c = null;
        this.f5145d = new cdk();
        this.f5147f = true;
        this.f5162u = new cct(this, 1);
        this.f5151j = jvdVar;
        this.f5142a = dxhVar;
        this.f5153l = dbrVar;
        this.f5155n = dhvVar;
        this.f5156o = mrmVar;
        this.f5157p = jwnVar;
        this.f5161t = jwnVar2;
        this.f5150i = new oyo(kmdVar.mo14553f());
        this.f5149h = new imw(2);
        this.f5159r = new gog(14);
        this.f5148g = false;
        this.f5154m = fuzVar;
        jvbVar.m13537d(jwnVar4.mo3830a(this, jvdVar));
        this.f5160s = 0;
        this.f5163v = 2;
        this.f5158q = jwnVar3;
    }

    /* JADX INFO: renamed from: f */
    private final void m3446f() {
        ilv ilvVar = this.f5143b;
        if (ilvVar != null) {
            ilvVar.mo11451c();
        }
        if (this.f5144c == null) {
            ilv ilvVarMo4152j = this.f5142a.mo4152j();
            this.f5144c = ilvVarMo4152j;
            ilvVarMo4152j.mo11450b(new ccb(this, 4));
        }
    }

    /* JADX INFO: renamed from: g */
    private final synchronized boolean m3447g(gst gstVar) {
        if (gstVar.m9712b()) {
            int i = this.f5160s + 1;
            this.f5160s = i;
            if (i > 17) {
                return true;
            }
        } else {
            this.f5160s = 0;
        }
        return false;
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3448b() {
        this.f5147f = true;
        this.f5154m.m8820b(true);
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: c */
    public final synchronized void mo3449c(hrw hrwVar) {
        this.f5147f = false;
        this.f5154m.m8820b(false);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f5147f = false;
            this.f5159r.close();
        }
        this.f5152k.close();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3450d(mrm mrmVar, int i) {
        if (this.f5144c != null) {
            return false;
        }
        this.f5142a.mo4165w(mrmVar, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0161 A[Catch: all -> 0x02e8, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:10:0x0016, B:14:0x002a, B:18:0x003a, B:20:0x0046, B:22:0x005c, B:24:0x006e, B:26:0x0078, B:28:0x0082, B:30:0x008c, B:32:0x0090, B:34:0x0094, B:35:0x0097, B:37:0x009b, B:39:0x00a0, B:41:0x00cd, B:43:0x00dc, B:40:0x00c3, B:45:0x00f3, B:48:0x00f9, B:51:0x0117, B:53:0x011b, B:58:0x0126, B:60:0x0130, B:62:0x013d, B:65:0x0149, B:69:0x0166, B:74:0x018b, B:78:0x0198, B:83:0x01aa, B:84:0x01bf, B:87:0x01c5, B:88:0x01ca, B:90:0x01d7, B:91:0x01d8, B:93:0x01dc, B:100:0x01e6, B:101:0x01e7, B:103:0x01ef, B:110:0x01fb, B:111:0x01fc, B:114:0x0202, B:116:0x020e, B:119:0x0219, B:122:0x021f, B:124:0x022f, B:125:0x024f, B:132:0x0267, B:133:0x0268, B:137:0x0270, B:139:0x027c, B:144:0x0285, B:145:0x0295, B:147:0x0297, B:149:0x0299, B:151:0x029b, B:72:0x0183, B:152:0x029c, B:178:0x02de, B:67:0x0160, B:68:0x0161, B:179:0x02df, B:126:0x0250, B:127:0x0262, B:153:0x029d, B:155:0x02a1, B:158:0x02a4, B:170:0x02cb, B:171:0x02d7, B:175:0x02db), top: B:189:0x0001, inners: #0, #3 }] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void mo3415bf(gtd gtdVar) {
        int iFloatValue;
        boolean z;
        if (this.f5147f && !((Boolean) this.f5161t.mo3831be()).booleanValue()) {
            if (((Boolean) ((jwf) this.f5142a.mo4156n()).f34942d).booleanValue()) {
                return;
            }
            if (((Boolean) this.f5158q.mo3831be()).booleanValue()) {
                return;
            }
            Object obj = gtdVar.f26334a;
            if (!this.f5156o.mo16813g()) {
                boolean zM3494b = this.f5145d.m3494b(((fuo) obj).f23596b);
                mrm mrmVar = ((fuo) gtdVar.f26334a).f23598d;
                if (mrmVar.mo16813g()) {
                    PointF pointF = ((fun) mrmVar.mo16809c()).f23592a;
                    if (this.f5153l.mo5895d() == kmq.f36557a) {
                        dhv dhvVar = this.f5155n;
                        dhw dhwVar = dhu.f11199a;
                        dhvVar.mo6177e();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((fuo) gtdVar.f26335b).f23596b != gst.PASSIVE_SCAN && ((fuo) gtdVar.f26334a).f23596b == gst.PASSIVE_SCAN && this.f5146e == null) {
                        ilv ilvVar = this.f5143b;
                        if (ilvVar != null) {
                            ilvVar.mo11451c();
                        }
                        ilv ilvVar2 = this.f5144c;
                        if (ilvVar2 != null) {
                            ilvVar2.mo11451c();
                        }
                        if (z) {
                            this.f5143b = this.f5142a.mo4153k(mqu.f41450a, 0);
                        } else {
                            this.f5143b = this.f5142a.mo4153k(mrm.m16829i(pointF), (int) (((fuo) gtdVar.f26334a).f23599e * ((Float) this.f5157p.mo3831be()).floatValue()));
                        }
                        this.f5143b.mo11450b(new ccb(this, 5));
                        if (this.f5143b != null) {
                            this.f5146e = nqf.m17621g();
                            jvh.m13563k(this.f5143b.mo11449a(), this.f5146e, this.f5162u, this.f5151j);
                        }
                    }
                    if (zM3494b) {
                        nqf nqfVar = this.f5146e;
                        if (nqfVar != null) {
                            nqfVar.mo14894e(true);
                            return;
                        }
                    } else if (this.f5146e != null && !z) {
                        this.f5142a.mo4167y(pointF, (int) (((fuo) gtdVar.f26334a).f23599e * ((Float) this.f5157p.mo3831be()).floatValue()));
                        return;
                    }
                }
                return;
            }
            if (this.f5153l.mo5895d() == kmq.f36557a) {
                dhv dhvVar2 = this.f5155n;
                dhw dhwVar2 = dhu.f11199a;
                dhvVar2.mo6177e();
                return;
            }
            mrm mrmVar2 = ((fuo) obj).f23598d;
            int i = 4;
            if (mrmVar2.mo16813g()) {
                int i2 = ((fun) mrmVar2.mo16809c()).f23594c;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 4) {
                    iFloatValue = (int) (((fuo) obj).f23599e * ((Float) this.f5157p.mo3831be()).floatValue());
                } else {
                    iFloatValue = ((fuo) obj).f23599e;
                }
            } else {
                iFloatValue = ((fuo) obj).f23599e;
            }
            float f = iFloatValue;
            this.f5149h.m11498a(f);
            boolean zM3447g = m3447g(((fuo) obj).f23596b);
            if ((!((fuo) obj).f23598d.mo16813g() || zM3447g) && this.f5156o.mo16813g()) {
                synchronized (this) {
                    if (this.f5148g) {
                        this.f5159r.close();
                        ((hrx) this.f5156o.mo16809c()).mo10673j(hrw.FACE_TRACKING);
                        if (this.f5148g) {
                            int i3 = this.f5163v;
                            if (i3 == 0) {
                                throw null;
                            }
                            if (i3 == 2 || i3 == 4 || i3 == 6) {
                                m3446f();
                            }
                        }
                        this.f5142a.mo4158p();
                        this.f5148g = false;
                        this.f5149h.m11499b();
                        return;
                    }
                    return;
                }
            }
            mrm mrmVar3 = ((fuo) obj).f23598d;
            if (mrmVar3.mo16813g()) {
                fun funVar = (fun) mrmVar3.mo16809c();
                int i4 = funVar.f23594c;
                int i5 = this.f5163v;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 != i4) {
                    if (i5 == 4) {
                        this.f5159r.close();
                        ((hrx) this.f5156o.mo16809c()).mo10673j(hrw.FACE_TRACKING);
                        m3446f();
                    }
                    int i6 = this.f5163v;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i6 == 8) {
                        this.f5142a.mo4158p();
                    }
                    this.f5148g = false;
                    this.f5149h.m11499b();
                    this.f5163v = funVar.f23594c;
                }
                if (this.f5148g) {
                    int i7 = funVar.f23594c;
                    if (i7 == 0) {
                        throw null;
                    }
                    if (i7 != 4) {
                    }
                    return;
                }
                if (((fuo) obj).f23596b != gst.PASSIVE_SCAN) {
                    int i8 = funVar.f23594c;
                    if (i8 == 0) {
                        throw null;
                    }
                    if (i8 == 4 || i8 == 8 || i8 == 6) {
                    }
                    return;
                }
                int i9 = funVar.f23594c;
                if (i9 == 0) {
                    throw null;
                }
                if (i9 == 8 || m3450d(mrm.m16829i(funVar.f23592a), iFloatValue)) {
                    this.f5148g = true;
                    if (this.f5156o.mo16813g()) {
                        int i10 = funVar.f23594c;
                        if (i10 == 0) {
                            throw null;
                        }
                        if (i10 == 4 && ((hrx) this.f5156o.mo16809c()).mo10674k(hrw.FACE_TRACKING)) {
                            this.f5149h.m11499b();
                            this.f5149h.m11498a(f);
                            jwn jwnVarMo10669a = ((hrx) this.f5156o.mo16809c()).mo10669a(this.f5150i.m19203g(funVar.f23592a), hrw.FACE_TRACKING);
                            synchronized (this) {
                                this.f5159r.close();
                                this.f5159r = jwnVarMo10669a.mo3830a(new cbx(this, i), jvd.f34877a);
                            }
                            return;
                        }
                        int i11 = funVar.f23594c;
                        if (i11 == 0) {
                            throw null;
                        }
                        if (i11 == 6) {
                            m3450d(mrm.m16829i(funVar.f23592a), (int) this.f5149h.f31556a);
                        } else if (i11 == 8) {
                            mrm mrmVarM16829i = mrm.m16829i(funVar.f23592a);
                            RectF rectF = funVar.f23593b;
                            if (this.f5144c == null) {
                                this.f5142a.mo4164v(mrmVarM16829i, rectF);
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
            throw th;
        }
    }
}
