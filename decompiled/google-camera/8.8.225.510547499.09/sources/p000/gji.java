package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gji {

    /* JADX INFO: renamed from: a */
    public static final nbh f24981a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckHdrPlusBurstTaker");

    /* JADX INFO: renamed from: b */
    public final ksc f24982b;

    /* JADX INFO: renamed from: c */
    public boolean f24983c = false;

    /* JADX INFO: renamed from: d */
    public final kfo f24984d;

    /* JADX INFO: renamed from: e */
    public nxl f24985e;

    /* JADX INFO: renamed from: f */
    private final kbz f24986f;

    /* JADX INFO: renamed from: g */
    private final ecq f24987g;

    /* JADX INFO: renamed from: h */
    private final eby f24988h;

    /* JADX INFO: renamed from: i */
    private final gjt f24989i;

    /* JADX INFO: renamed from: j */
    private final eci f24990j;

    /* JADX INFO: renamed from: k */
    private final gof f24991k;

    /* JADX INFO: renamed from: l */
    private final dhv f24992l;

    /* JADX INFO: renamed from: m */
    private final mrm f24993m;

    /* JADX INFO: renamed from: n */
    private final goj f24994n;

    /* JADX INFO: renamed from: o */
    private final gir f24995o;

    /* JADX INFO: renamed from: p */
    private final gva f24996p;

    /* JADX INFO: renamed from: q */
    private final glk f24997q;

    public gji(kbz kbzVar, ecq ecqVar, eby ebyVar, gjt gjtVar, eci eciVar, gva gvaVar, ksc kscVar, dhv dhvVar, mrm mrmVar, goj gojVar, gir girVar, kfo kfoVar, glk glkVar, gof gofVar, byte[] bArr, byte[] bArr2) {
        this.f24986f = kbzVar;
        this.f24987g = ecqVar;
        this.f24988h = ebyVar;
        this.f24989i = gjtVar;
        this.f24990j = eciVar;
        this.f24996p = gvaVar;
        this.f24982b = kscVar;
        this.f24992l = dhvVar;
        this.f24993m = mrmVar;
        this.f24994n = gojVar;
        this.f24984d = kfoVar;
        this.f24997q = glkVar;
        this.f24991k = gofVar;
        this.f24995o = girVar;
    }

    /* JADX INFO: renamed from: d */
    private final kpp m9326d(eem eemVar, int i, int i2, key keyVar, nre nreVar, kpp kppVar, gau gauVar) {
        return m9330a(eemVar, i, i2, keyVar, nreVar, true, mqu.f41450a, kppVar, gauVar);
    }

    /* JADX INFO: renamed from: e */
    private final void m9327e(eem eemVar, int i, int i2, kpp kppVar, long j) {
        ((nbe) ((nbe) f24981a.m17252c()).mo17276G(2741)).mo17273D("Marking frame %d of %d (frame %s) as invalid for shot %s (camera %s).", Integer.valueOf(i + 1), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(eemVar.m7218a()), eemVar.f13670q);
        this.f24987g.mo7128C(eemVar, eemVar.f13670q, i, kppVar, nre.f44161a, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    private final boolean m9328f(eem eemVar) {
        if (!this.f24983c) {
            return false;
        }
        eemVar.m7218a();
        this.f24997q.f25502c.mo9917w(new doq((byte[]) null));
        this.f24987g.mo7147n(eemVar);
        this.f24990j.mo7111d(eemVar.f13675v.f25502c.mo9902h());
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static final void m9329g(kfo kfoVar) {
        try {
            kfj kfjVarMo14154c = kfoVar.mo14154c();
            kfjVarMo14154c.mo14112d(CaptureRequest.CONTROL_AF_MODE, 4);
            kfjVarMo14154c.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            kfoVar.mo14157f(kfjVarMo14154c.mo14109a()).close();
        } catch (kec e) {
            ((nbe) ((nbe) ((nbe) f24981a.m17251b()).mo17283h(e)).mo17276G((char) 2742)).mo17290o("Failed to unlock lens.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final kpp m9330a(eem eemVar, int i, int i2, key keyVar, nre nreVar, boolean z, mrm mrmVar, kpp kppVar, gau gauVar) {
        String str;
        kmg kmgVarMo14193c;
        kpp kppVarMo7042c;
        Integer num;
        kbz kbzVar = this.f24986f;
        if (z) {
            str = "Frame";
        } else {
            str = "SecondaryFrame" + (i + 1) + "of" + i2;
        }
        kbzVar.mo13961e(str);
        try {
            gmc gmcVarM9784a = this.f24996p.m9784a(keyVar);
            kpp kppVarMo7042c2 = keyVar.mo7042c();
            if (z) {
                if (ivu.f32385m != null && (kppVarMo7042c = keyVar.mo7042c()) != null && (num = (Integer) kppVarMo7042c.mo9517d(ivu.f32385m)) != null && num.intValue() > 0) {
                    eemVar.m7218a();
                    if (kppVarMo7042c2 != null) {
                        kppVarMo7042c2.mo9517d(CaptureResult.CONTROL_AF_STATE);
                    }
                } else if (!this.f24983c) {
                    this.f24988h.m7098i(false);
                    gauVar.mo9003f(false);
                    this.f24990j.mo7112e(eemVar, keyVar);
                    kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                }
                return null;
            }
            if (gmcVarM9784a.m9493b() != null) {
                kgg kggVarM9493b = gmcVarM9784a.m9493b();
                kggVarM9493b.getClass();
                kmgVarMo14193c = kggVarM9493b.mo14193c();
            } else {
                kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
            }
            this.f24986f.mo13961e(z ? "RetrievingImage" : "RetrievingImageSecondary");
            kpw kpwVarM9496e = gmcVarM9784a.m9496e();
            this.f24986f.mo13962f();
            if (kpwVarM9496e == null || kppVarMo7042c2 == null) {
                if (kpwVarM9496e != null) {
                    kpwVarM9496e.close();
                }
                kpp kppVar2 = kppVarMo7042c2 != null ? kppVarMo7042c2 : kppVar;
                if (kppVar2 != null) {
                    kfd kfdVarMo7041b = keyVar.mo7041b();
                    m9327e(eemVar, i, i2, kppVar2, kfdVarMo7041b != null ? kfdVarMo7041b.f35812c : -1L);
                }
                kppVarMo7042c2 = kppVar2;
            } else {
                this.f24987g.mo7148o(eemVar, kmgVarMo14193c, i, kppVarMo7042c2, nreVar, kpwVarM9496e, gmcVarM9784a.m9495d(), mrmVar);
                eemVar.m7218a();
                kpwVarM9496e.mo7248d();
                kppVarMo7042c2.mo9515b();
            }
            return kppVarMo7042c2;
        } finally {
            keyVar.close();
            this.f24986f.mo13962f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0499 A[Catch: all -> 0x04e8, LOOP:3: B:163:0x0493->B:165:0x0499, LOOP_END, TryCatch #3 {all -> 0x04e8, blocks: (B:120:0x03b3, B:121:0x03c0, B:123:0x03c6, B:125:0x03d5, B:127:0x03d9, B:128:0x03de, B:130:0x0400, B:133:0x0408, B:135:0x0412, B:136:0x0415, B:146:0x0431, B:147:0x0454, B:149:0x045a, B:158:0x047c, B:162:0x048f, B:163:0x0493, B:165:0x0499, B:167:0x04a5, B:140:0x0426, B:160:0x0487), top: B:209:0x03b3 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x04a5 A[Catch: all -> 0x04e8, TRY_LEAVE, TryCatch #3 {all -> 0x04e8, blocks: (B:120:0x03b3, B:121:0x03c0, B:123:0x03c6, B:125:0x03d5, B:127:0x03d9, B:128:0x03de, B:130:0x0400, B:133:0x0408, B:135:0x0412, B:136:0x0415, B:146:0x0431, B:147:0x0454, B:149:0x045a, B:158:0x047c, B:162:0x048f, B:163:0x0493, B:165:0x0499, B:167:0x04a5, B:140:0x0426, B:160:0x0487), top: B:209:0x03b3 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:175:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:176:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:179:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:183:0x04db A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:23:0x0105, B:25:0x0118, B:31:0x0129, B:34:0x0138, B:36:0x0140, B:37:0x0149, B:39:0x0153, B:40:0x0156, B:43:0x016c, B:46:0x0175, B:48:0x0193, B:50:0x01b5, B:51:0x01c2, B:54:0x01e9, B:55:0x01ee, B:57:0x0229, B:58:0x0245, B:59:0x025e, B:61:0x0264, B:69:0x027c, B:71:0x0284, B:73:0x028c, B:152:0x0466, B:154:0x046f, B:156:0x0476, B:181:0x04d2, B:183:0x04db, B:185:0x04e2, B:189:0x04eb, B:191:0x04f4, B:193:0x04fb, B:194:0x04fe, B:76:0x0299, B:78:0x029d, B:95:0x031d, B:97:0x032c, B:98:0x0332, B:100:0x0338, B:102:0x035c, B:117:0x03a6, B:107:0x0372, B:109:0x037a, B:111:0x0386, B:112:0x0391, B:113:0x0395, B:115:0x039b, B:80:0x02ad, B:82:0x02e0, B:91:0x0311, B:83:0x02e5, B:84:0x02ef, B:86:0x02f5, B:88:0x0305, B:89:0x0309, B:90:0x030d, B:94:0x031b, B:52:0x01e1, B:196:0x0500), top: B:204:0x0105, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x04e2 A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:23:0x0105, B:25:0x0118, B:31:0x0129, B:34:0x0138, B:36:0x0140, B:37:0x0149, B:39:0x0153, B:40:0x0156, B:43:0x016c, B:46:0x0175, B:48:0x0193, B:50:0x01b5, B:51:0x01c2, B:54:0x01e9, B:55:0x01ee, B:57:0x0229, B:58:0x0245, B:59:0x025e, B:61:0x0264, B:69:0x027c, B:71:0x0284, B:73:0x028c, B:152:0x0466, B:154:0x046f, B:156:0x0476, B:181:0x04d2, B:183:0x04db, B:185:0x04e2, B:189:0x04eb, B:191:0x04f4, B:193:0x04fb, B:194:0x04fe, B:76:0x0299, B:78:0x029d, B:95:0x031d, B:97:0x032c, B:98:0x0332, B:100:0x0338, B:102:0x035c, B:117:0x03a6, B:107:0x0372, B:109:0x037a, B:111:0x0386, B:112:0x0391, B:113:0x0395, B:115:0x039b, B:80:0x02ad, B:82:0x02e0, B:91:0x0311, B:83:0x02e5, B:84:0x02ef, B:86:0x02f5, B:88:0x0305, B:89:0x0309, B:90:0x030d, B:94:0x031b, B:52:0x01e1, B:196:0x0500), top: B:204:0x0105, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x04b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final int m9331b(eem eemVar, BurstSpec burstSpec, mrm mrmVar, kpp kppVar, gau gauVar, kfj kfjVar, kho khoVar, kba kbaVar, hjy hjyVar, int i, int i2, int i3, boolean z, ebn ebnVar) {
        List list;
        int i4;
        int i5;
        mws mwsVarM17098m;
        boolean z2;
        List list2;
        List list3;
        int i6;
        int size;
        boolean z3;
        int i7;
        Iterator it;
        kpp kppVar2;
        List list4;
        int i8;
        mws mwsVarM17081f;
        key keyVarMo7040a;
        kpp kppVar3 = kppVar;
        if (m9328f(eemVar)) {
            return 2;
        }
        this.f24986f.mo13961e("HdrPlusPayload" + eemVar.m7218a());
        FrameRequestVector frameRequestVectorM4911b = burstSpec.m4911b();
        mrm mrmVarMo16808b = mrmVar.mo16808b(fod.f22910o);
        if (i <= 0) {
            return 3;
        }
        this.f24986f.mo13961e("buildPayloadRequests" + eemVar.m7218a());
        Integer numValueOf = Integer.valueOf(i);
        mxk mxkVar = khoVar.f36067c;
        khoVar.m14271a().mo3831be();
        gjt gjtVar = this.f24989i;
        long jM7218a = eemVar.m7218a();
        int iM4967a = (ivu.f32384l == null || !mrmVarMo16808b.mo16813g()) ? 0 : (int) ((FrameRequestVector) mrmVarMo16808b.mo16809c()).m4967a();
        gjtVar.m9347c(kfjVar, gauVar, khoVar, i, iM4967a);
        List listM9346b = gjtVar.m9346b(jM7218a, kfjVar, frameRequestVectorM4911b, kppVar, i);
        if (iM4967a > 0) {
            kfjVar.mo14112d(ivu.f32384l, Integer.valueOf(iM4967a));
            FrameRequestVector frameRequestVector = (FrameRequestVector) mrmVarMo16808b.mo16809c();
            list = listM9346b;
            list.addAll(0, gjtVar.m9346b(jM7218a, kfjVar, frameRequestVector, kppVar, iM4967a));
        } else {
            list = listM9346b;
        }
        if (list.size() != i + i3) {
            ((nbe) ((nbe) f24981a.m17251b()).mo17276G(2726)).mo17271B("Unexpected frameRequests length: %d != PSAF %d + payload %d", Integer.valueOf(list.size()), Integer.valueOf(i3), numValueOf);
        }
        this.f24986f.mo13962f();
        this.f24985e = nhd.f42290d.m18137O();
        try {
            this.f24987g.mo7151r(eemVar, burstSpec);
            this.f24990j.mo7113f(eemVar, burstSpec, kppVar3);
            boolean zM7101l = this.f24988h.m7101l();
            boolean z4 = zM7101l || this.f24992l.mo6184l(dih.f11521i);
            if (z4) {
                this.f24988h.m7098i(true);
                gauVar.mo9003f(true);
            }
            if (!zM7101l) {
                mrm mrmVar2 = this.f24993m;
                if (mrmVar2.mo16813g()) {
                    ((gnm) mrmVar2.mo16809c()).m9560k(eemVar);
                }
            }
            nxl nxlVar = this.f24985e;
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            nhd nhdVar = (nhd) nxlVar.f44974b;
            nhdVar.f42292a |= 1;
            nhdVar.f42293b = zM7101l;
            gauVar.mo9005h();
            if (this.f24984d == null) {
                i4 = 4;
            } else if (m9328f(eemVar)) {
                i4 = 2;
            } else {
                try {
                    eemVar.m7218a();
                    khoVar.m14271a().mo3831be();
                    mws mwsVar = (mws) Collection$EL.stream(list).map(egh.f13948n).collect(muc.f41626a);
                    if (z) {
                        kfj kfjVarMo14154c = this.f24984d.mo14154c();
                        kgw kgwVarM14226g = kgw.m14226g((kgw) kfjVarMo14154c);
                        i5 = 2;
                        kfjVarMo14154c.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                        if (((Float) kppVar3.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE)) != null) {
                            kfjVarMo14154c.mo14112d(CaptureRequest.LENS_FOCUS_DISTANCE, (Float) kppVar3.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE));
                        }
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AF_MODE, 4);
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        mwsVarM17098m = mws.m17098m(kfjVarMo14154c.mo14109a(), kgwVarM14226g.mo14109a());
                    } else {
                        i5 = 2;
                        int i9 = mws.f41739d;
                        mwsVarM17098m = mzr.f41857a;
                    }
                    if (z) {
                        int i10 = ((mzr) mwsVarM17098m).f41859c;
                    }
                    mwn mwnVarM17090e = mws.m17090e();
                    mwnVarM17090e.m17083h(mwsVarM17098m);
                    mwnVarM17090e.m17083h(mwsVar);
                    List listMo14156e = this.f24984d.mo14156e(mwnVarM17090e.m17081f());
                    kfo kfoVar = this.f24984d;
                    kfoVar.mo14158g(kfoVar.mo14153b().mo14109a());
                    this.f24995o.m9295a(this.f24984d, eemVar.f13675v.f25502c);
                    eemVar.f13675v.f25502c.mo9871C(false);
                    if (listMo14156e.isEmpty()) {
                        ((nbe) ((nbe) f24981a.m17251b()).mo17276G(2720)).mo17291p("Error submitting requests for shot %s", eemVar.m7218a());
                        i4 = 6;
                    } else {
                        List listSubList = listMo14156e.subList(((mzr) mwsVarM17098m).f41859c, listMo14156e.size());
                        Iterator it2 = listMo14156e.subList(0, ((mzr) mwsVarM17098m).f41859c).iterator();
                        while (it2.hasNext()) {
                            ((khl) it2.next()).close();
                        }
                        boolean z5 = z4 || z;
                        if (z5) {
                            z2 = false;
                        } else {
                            kbaVar.close();
                            z2 = true;
                        }
                        if (this.f24988h.m7101l() || !ebnVar.f13257l) {
                            list2 = listSubList;
                            list3 = listMo14156e;
                            i6 = 0;
                            size = 0;
                        } else {
                            if (this.f24991k == null) {
                                ((nbe) ((nbe) f24981a.m17251b()).mo17276G((char) 2736)).mo17290o("Ring buffer not provided.");
                                mwsVarM17081f = mzr.f41857a;
                            } else {
                                try {
                                    this.f24986f.mo13961e("HdrPlus#dumpRingBuffer");
                                    goe goeVarMo9303a = this.f24991k.mo9303a();
                                    List listMo9311i = this.f24991k.mo9311i();
                                    int i11 = ((mzr) listMo9311i).f41859c;
                                    goeVarMo9303a.mo9302a();
                                    this.f24986f.mo13962f();
                                    this.f24986f.mo13961e("HdrPlus#filterTbFrames");
                                    Set setM9579a = this.f24994n.m9579a(listMo9311i);
                                    if (setM9579a.isEmpty()) {
                                        mwsVarM17081f = mws.m17095j(listMo9311i);
                                    } else {
                                        mwn mwnVarM17090e2 = mws.m17090e();
                                        nba it3 = ((mws) listMo9311i).iterator();
                                        while (it3.hasNext()) {
                                            key keyVar = (key) it3.next();
                                            if (setM9579a.contains(keyVar.mo7041b())) {
                                                keyVar.close();
                                            } else {
                                                mwnVarM17090e2.m17082g(keyVar);
                                            }
                                        }
                                        mwsVarM17081f = mwnVarM17090e2.m17081f();
                                    }
                                    mwsVarM17081f.size();
                                    this.f24986f.mo13962f();
                                } catch (InterruptedException e) {
                                    mwsVarM17081f = mzr.f41857a;
                                }
                            }
                            size = mwsVarM17081f.size();
                            this.f24986f.mo13961e("HdrPlus_Frames#processZslFrames");
                            if (ebnVar.f13257l) {
                                Iterator it4 = mwsVarM17081f.iterator();
                                int i12 = 0;
                                while (it4.hasNext()) {
                                    List list5 = listSubList;
                                    List list6 = listMo14156e;
                                    if (m9326d(eemVar, i12, size + i2, (key) it4.next(), nre.f44163c, null, gauVar) != null) {
                                        i12++;
                                    }
                                    listSubList = list5;
                                    listMo14156e = list6;
                                }
                                list2 = listSubList;
                                list3 = listMo14156e;
                                i6 = i12;
                            } else {
                                list2 = listSubList;
                                list3 = listMo14156e;
                                if (size > 0 && this.f24993m.mo16813g() && (keyVarMo7040a = ((key) mwsVarM17081f.get(0)).mo7040a()) != null) {
                                    ((gnm) this.f24993m.mo16809c()).mo7112e(eemVar, keyVarMo7040a);
                                }
                                Iterator it5 = mwsVarM17081f.iterator();
                                while (it5.hasNext()) {
                                    ((key) it5.next()).close();
                                }
                                i6 = 0;
                            }
                            this.f24986f.mo13962f();
                        }
                        try {
                            this.f24986f.mo13961e("HdrPlus#payloadAwait");
                            list2.size();
                            int i13 = i6;
                            int i14 = 0;
                            while (i14 < list2.size()) {
                                List list7 = list2;
                                khl khlVar = (khl) list7.get(i14);
                                key keyVarM14267a = khlVar.m14267a(khoVar);
                                if (keyVarM14267a != null) {
                                    try {
                                        if (this.f24983c) {
                                            keyVarM14267a.close();
                                            break;
                                        }
                                        kfv.m14171t(keyVarM14267a);
                                        list4 = list7;
                                        try {
                                            kpp kppVarM9326d = m9326d(eemVar, i13, i2 + size, keyVarM14267a, ((FrameRequest) ((gtd) list.get(i14)).f26334a).m4965a(), kppVar3, gauVar);
                                            if (kppVarM9326d != null) {
                                                i13++;
                                                try {
                                                    Long l = (Long) kppVarM9326d.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                                    if (l != null) {
                                                        l.longValue();
                                                    }
                                                    kppVarM9326d.mo9517d(CaptureResult.CONTROL_AF_STATE);
                                                    kppVarM9326d.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                                                    kppVar3 = kppVarM9326d;
                                                } catch (InterruptedException e2) {
                                                    kppVar3 = kppVarM9326d;
                                                    i8 = i13;
                                                }
                                            }
                                            khlVar.close();
                                        } catch (InterruptedException e3) {
                                            i8 = i13;
                                        }
                                    } catch (InterruptedException e4) {
                                        list4 = list7;
                                    }
                                    i8 = i13;
                                    Thread.currentThread().interrupt();
                                    ((nbe) ((nbe) f24981a.m17252c()).mo17276G(2716)).mo17291p("Failed to awaitComplete on frame %s.", i8);
                                    keyVarM14267a.close();
                                    Iterator it6 = list4.iterator();
                                    while (it6.hasNext()) {
                                        ((khl) it6.next()).close();
                                    }
                                    if (i8 == 0) {
                                        this.f24986f.mo13962f();
                                        this.f24983c = false;
                                        if (z) {
                                            m9329g(this.f24984d);
                                        }
                                        if (!z2) {
                                            kbaVar.close();
                                        }
                                        i4 = 6;
                                    } else {
                                        this.f24997q.f25501b.mo9013f();
                                        i7 = i8;
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            ((khl) it.next()).close();
                                        }
                                        if (z) {
                                            m9329g(this.f24984d);
                                            z3 = false;
                                        } else {
                                            z3 = z;
                                        }
                                        if (z5) {
                                            try {
                                                kbaVar.close();
                                                z2 = true;
                                            } catch (Throwable th) {
                                                th = th;
                                                this.f24986f.mo13962f();
                                                this.f24983c = false;
                                                if (z3) {
                                                    m9329g(this.f24984d);
                                                }
                                                if (!z2) {
                                                    kbaVar.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        if (i7 == 0) {
                                            kppVar2 = null;
                                        } else {
                                            kppVar2 = kppVar3;
                                        }
                                        if (true != m9332c(eemVar, i7, i2, kppVar2, hjyVar, true)) {
                                            i5 = 7;
                                        }
                                        this.f24986f.mo13962f();
                                        this.f24983c = false;
                                        if (z3) {
                                            m9329g(this.f24984d);
                                        }
                                        if (!z2) {
                                            kbaVar.close();
                                        }
                                        i4 = i5;
                                    }
                                } else {
                                    list4 = list7;
                                }
                                i14++;
                                list2 = list4;
                            }
                            i7 = i13;
                            it = list3.iterator();
                            while (it.hasNext()) {
                                ((khl) it.next()).close();
                            }
                            if (z) {
                                m9329g(this.f24984d);
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if (z5) {
                                kbaVar.close();
                                z2 = true;
                            }
                            if (i7 == 0) {
                                kppVar2 = null;
                            } else {
                                kppVar2 = kppVar3;
                            }
                            if (true != m9332c(eemVar, i7, i2, kppVar2, hjyVar, true)) {
                                i5 = 7;
                            }
                            this.f24986f.mo13962f();
                            this.f24983c = false;
                            if (z3) {
                                m9329g(this.f24984d);
                            }
                            if (!z2) {
                                kbaVar.close();
                            }
                            i4 = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            z3 = z;
                        }
                    }
                } catch (kec e5) {
                    ((nbe) ((nbe) f24981a.m17251b()).mo17276G(2713)).mo17291p("Failed to submit frame requests for shot %d.", eemVar.m7218a());
                    i4 = 4;
                }
            }
            this.f24986f.mo13962f();
            return i4;
        } catch (Throwable th3) {
            this.f24986f.mo13962f();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [gav, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final boolean m9332c(eem eemVar, int i, int i2, kpp kppVar, hjy hjyVar, boolean z) {
        if (kppVar != null) {
            if (z) {
                hjyVar.mo10401c(kppVar, true);
            }
            while (i < i2) {
                m9327e(eemVar, i, i2, kppVar, -1L);
                i++;
            }
        }
        if (z) {
            eemVar.f13675v.f25501b.mo9011d().mo8999b();
            ((hjz) hjyVar).f28088n = (nhd) this.f24985e.mo18103l();
        }
        this.f24986f.mo13963g("HdrPlus#endPayload");
        if (!this.f24987g.mo7157x(eemVar)) {
            ((nbe) ((nbe) f24981a.m17251b()).mo17276G(2744)).mo17291p("EndPayloadFrames failed for shot %d.", eemVar.m7218a());
            return false;
        }
        if (z) {
            this.f24990j.mo7115h(eemVar);
            eemVar.f13675v.f25502c.mo9872D();
            eemVar.m7218a();
            if (this.f24983c && i == 0) {
                return m9328f(eemVar);
            }
        }
        if (this.f24987g.mo7158y(eemVar)) {
            eemVar.m7218a();
            return true;
        }
        ((nbe) ((nbe) f24981a.m17251b()).mo17276G(2745)).mo17291p("EndShotCapture failed for shot %d.", eemVar.m7218a());
        return false;
    }
}
