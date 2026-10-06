package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import p021j$.util.Collection$EL;
import p021j$.util.function.Predicate$CC;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbg {

    /* JADX INFO: renamed from: a */
    private static final nbh f27123a = nbh.m17259h("com/google/android/apps/camera/settings/resolution/ResolutionSetting");

    /* JADX INFO: renamed from: b */
    private final fve f27124b;

    /* JADX INFO: renamed from: c */
    private final had f27125c;

    /* JADX INFO: renamed from: d */
    private final dhv f27126d;

    /* JADX INFO: renamed from: e */
    private final String f27127e;

    /* JADX INFO: renamed from: f */
    private final String f27128f;

    /* JADX INFO: renamed from: g */
    private final jww f27129g;

    /* JADX INFO: renamed from: h */
    private final jww f27130h;

    /* JADX INFO: renamed from: i */
    private final jww f27131i;

    /* JADX INFO: renamed from: j */
    private final jwn f27132j;

    /* JADX INFO: renamed from: k */
    private final fmz f27133k;

    /* JADX INFO: renamed from: l */
    private final jwn f27134l;

    /* JADX INFO: renamed from: m */
    private final khy f27135m;

    /* JADX INFO: renamed from: n */
    private final jvb f27136n;

    /* JADX INFO: renamed from: o */
    private final kms f27137o;

    public hbg(fve fveVar, had hadVar, kms kmsVar, khy khyVar, hai haiVar, jww jwwVar, cdu cduVar, dhv dhvVar, jwn jwnVar, fmz fmzVar, jwn jwnVar2) {
        this.f27124b = fveVar;
        this.f27125c = hadVar;
        this.f27137o = kmsVar;
        this.f27135m = khyVar;
        this.f27126d = dhvVar;
        jww jwwVarMo10030b = haiVar.mo10030b(gzy.f27046e);
        this.f27129g = jwwVarMo10030b;
        jww jwwVarMo10030b2 = haiVar.mo10030b(gzy.f27048g);
        this.f27130h = jwwVarMo10030b2;
        this.f27131i = jwwVar;
        jvb jvbVarM3529i = cduVar.m3529i();
        this.f27136n = jvbVarM3529i;
        this.f27132j = jwnVar;
        this.f27133k = fmzVar;
        this.f27134l = jwnVar2;
        String strMo6182j = dhvVar.mo6182j(dib.f11269ac);
        strMo6182j.getClass();
        this.f27127e = strMo6182j;
        String strMo6182j2 = dhvVar.mo6182j(dib.f11270ad);
        strMo6182j2.getClass();
        this.f27128f = strMo6182j2;
        jvbVarM3529i.m13537d(jwwVar.mo3830a(new gmd(this, 14), not.INSTANCE));
        jvbVarM3529i.m13537d(jwwVarMo10030b.mo3830a(new gmd(this, 12), not.INSTANCE));
        if (dhvVar.mo6184l(dib.f11311bR)) {
            jvbVarM3529i.m13537d(jwwVarMo10030b2.mo3830a(new gmd(this, 13), not.INSTANCE));
        }
        if (dhvVar.mo6184l(dib.f11311bR)) {
            jvbVarM3529i.m13537d(jwnVar.mo3830a(new gmd(this, 11), not.INSTANCE));
            jvbVarM3529i.m13537d(jwnVar2.mo3830a(new gmd(this, 10), not.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m10081d(final int i, kmq kmqVar, String str) {
        kbc kbcVar;
        kmg kmgVarMo13858e = this.f27135m.f36117a.mo13858e(kmqVar);
        if (kmgVarMo13858e == null) {
            ((nbe) ((nbe) f27123a.m17251b()).mo17276G((char) 3411)).mo17293r("Unable to fetch camera ID for facing value: %s", kmqVar);
            return;
        }
        fvu fvuVarM9446h = gls.m9446h(kmgVarMo13858e, this.f27135m.f36117a, this.f27124b, this.f27126d);
        String strM10088b = hbk.m10088b(kmqVar);
        if (strM10088b == null) {
            ((nbe) ((nbe) f27123a.m17251b()).mo17276G((char) 3410)).mo17293r("Undefined picture size setting key for facing %s.", kmqVar);
            return;
        }
        List list = (List) Collection$EL.stream(fvuVarM9446h.mo14571x(256)).filter(new Predicate() { // from class: hbf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public final /* synthetic */ Predicate m10080or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return kan.m13873j((kbc) obj).m13883m(inr.m11542n(i));
            }
        }).collect(Collectors.toList());
        String strMo6182j = this.f27126d.mo6182j(dib.f11330bk);
        if (kmqVar == kmq.f36557a && inr.m11542n(i).m13883m(kan.f35486a) && strMo6182j != null && !strMo6182j.isEmpty()) {
            kbc kbcVarM13913b = kbd.m13913b(strMo6182j);
            kbcVarM13913b.getClass();
            list.add(kbcVarM13913b);
        }
        List<kbc> list2 = (List) Collection$EL.stream(list).sorted(Collections.reverseOrder(C1143ye.f48118b)).collect(Collectors.toList());
        lku.m15613H(!list2.isEmpty());
        if (str.equals("full")) {
            kbcVar = (kbc) list2.get(0);
        } else if (str.equals("medium")) {
            if (list2.size() > 1) {
                list2.remove(0);
            }
            for (kbc kbcVar2 : list2) {
                if (kbcVar2.m13905b() < 5242880) {
                    kbcVar = kbcVar2;
                }
            }
            ((nbe) ((nbe) f27123a.m17252c()).mo17276G((char) 3407)).mo17290o("Invalid resolution setting, using default.");
            kbcVar = (kbc) list2.get(0);
        } else {
            ((nbe) ((nbe) f27123a.m17252c()).mo17276G((char) 3407)).mo17290o("Invalid resolution setting, using default.");
            kbcVar = (kbc) list2.get(0);
        }
        this.f27125c.mo10044k(strM10088b, kbd.m13915d(kbcVar));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX INFO: renamed from: a */
    public final kbc m10082a(kmg kmgVar, kmq kmqVar) {
        String str;
        kbc kbcVarM13914c;
        boolean z;
        kmq kmqVar2 = kmq.f36557a;
        if (kmqVar == kmq.BACK) {
            str = this.f27127e;
        } else {
            str = kmqVar == kmq.f36557a ? this.f27128f : "";
        }
        had hadVar = this.f27125c;
        String str2 = kmqVar == kmqVar2 ? "pref_camera_picturesize_front_key" : "pref_camera_picturesize_back_key";
        boolean zMo10047n = hadVar.mo10047n(str2);
        if (zMo10047n) {
            kbcVarM13914c = kbd.m13913b(this.f27125c.mo10038e(str2));
            if (kbcVarM13914c != null) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length != 0 && jib.m13221z(kbcVarM13914c, new HashSet(mkv.m16501I(strArrSplit)))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        } else {
            kbcVarM13914c = null;
            z = false;
        }
        List listMo14571x = gls.m9446h(kmgVar, this.f27137o, this.f27124b, this.f27126d).mo14571x(256);
        boolean z2 = kbcVarM13914c != null && kbcVarM13914c.f35517a > 0 && kbcVarM13914c.f35518b > 0 && listMo14571x.contains(kbcVarM13914c);
        if (!zMo10047n || z || !z2) {
            kbcVarM13914c = kbd.m13914c(jib.m13220y(listMo14571x, str));
            this.f27125c.mo10044k(str2, kbd.m13915d(kbcVarM13914c));
            ((nbe) ((nbe) f27123a.m17252c()).mo17276G((char) 3406)).mo17293r("Picture size setting is not set. Selecting fallback: %s", kbcVarM13914c);
        }
        kbcVarM13914c.getClass();
        return kbcVarM13914c;
    }

    /* JADX INFO: renamed from: b */
    public final void m10083b(kmq kmqVar) {
        String strM10088b = hbk.m10088b(kmqVar);
        if (strM10088b == null || this.f27125c.mo10047n(strM10088b)) {
            return;
        }
        kmg kmgVarMo13858e = this.f27137o.mo13858e(kmqVar);
        if (kmgVarMo13858e == null) {
            ((nbe) ((nbe) f27123a.m17252c()).mo17276G((char) 3409)).mo17293r("Failed to retrieve a camera id for facing: %s", kmqVar);
        } else {
            this.f27125c.mo10044k(strM10088b, kbd.m13915d(kbd.m13914c(jib.m13220y(gls.m9446h(kmgVarMo13858e, this.f27137o, this.f27124b, this.f27126d).mo14571x(256), kmqVar == kmq.BACK ? this.f27127e : this.f27128f))));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10084c() {
        String str = (String) this.f27131i.mo3831be();
        if (str == null) {
            return;
        }
        m10081d(this.f27133k.m8600d(kmq.BACK), kmq.BACK, str);
        m10081d(this.f27133k.m8600d(kmq.f36557a), kmq.f36557a, str);
    }
}
