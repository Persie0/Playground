package p000;

import java.util.Map;
import java.util.function.Predicate;
import p021j$.util.Optional;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cdy implements Predicate {

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f5392u;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ cdy f5391t = new cdy(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ cdy f5390s = new cdy(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cdy f5389r = new cdy(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ cdy f5388q = new cdy(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ cdy f5387p = new cdy(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ cdy f5386o = new cdy(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ cdy f5385n = new cdy(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ cdy f5384m = new cdy(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cdy f5383l = new cdy(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cdy f5382k = new cdy(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ cdy f5381j = new cdy(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cdy f5380i = new cdy(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ cdy f5379h = new cdy(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cdy f5378g = new cdy(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cdy f5377f = new cdy(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cdy f5376e = new cdy(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cdy f5375d = new cdy(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cdy f5374c = new cdy(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cdy f5373b = new cdy(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cdy f5372a = new cdy(0);

    public /* synthetic */ cdy(int i) {
        this.f5392u = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f5392u) {
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
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f5392u) {
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
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m3534or(Predicate predicate) {
        switch (this.f5392u) {
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
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f5392u) {
            case 0:
                return kcl.m13981d(kcl.m13980b((kmh) obj));
            case 1:
                return !kcl.m13981d((kcl) obj);
            case 2:
                kbc kbcVar = cpq.f8650a;
                return kan.m13873j(((jxp) obj).m13661b()).m13883m(kan.f35488c);
            case 3:
                kbc kbcVar2 = cpq.f8650a;
                return !kan.m13873j(((jxp) obj).m13661b()).m13883m(kan.f35488c);
            case 4:
                return ((mrm) obj).mo16813g();
            case 5:
                gfa gfaVar = (gfa) obj;
                ikw ikwVarMo9115b = gfaVar.mo9115b();
                boolean z = ikw.VIDEO.equals(ikwVarMo9115b) || ikw.VIDEO_INTENT.equals(ikwVarMo9115b);
                return gfaVar.mo9107F() && z;
            case 6:
                return ((dbq) obj).f10414b;
            case 7:
                return ((deb) obj).f10639i;
            case 8:
                return ((deb) obj).f10642l == 2;
            case 9:
                return ((Optional) obj).isPresent();
            case 10:
                hkz hkzVar = (hkz) obj;
                for (hky hkyVar : hky.values()) {
                    if (hkzVar.m10440k(hkyVar)) {
                        return true;
                    }
                }
                return false;
            case 11:
                return true;
            case 12:
                return ((hyx) obj).f29996b;
            case 13:
                gfa gfaVar2 = (gfa) obj;
                ikw ikwVarMo9115b2 = gfaVar2.mo9115b();
                if (ikwVarMo9115b2 != ikw.PORTRAIT) {
                    if (!gfaVar2.mo9107F()) {
                        return false;
                    }
                    if (ikwVarMo9115b2 != ikw.PHOTO && ikwVarMo9115b2 != ikw.LONG_EXPOSURE) {
                        return false;
                    }
                }
                return true;
            case 14:
                gfa gfaVar3 = (gfa) obj;
                ikw ikwVarMo9115b3 = gfaVar3.mo9115b();
                if (!ikw.PORTRAIT.equals(ikwVarMo9115b3)) {
                    if (!gfaVar3.mo9107F()) {
                        return false;
                    }
                    if (!ikw.PHOTO.equals(ikwVarMo9115b3) && !ikw.LONG_EXPOSURE.equals(ikwVarMo9115b3)) {
                        return false;
                    }
                }
                return true;
            case 15:
                return ((dyk) obj).f12919b > 0.8f;
            case 16:
                return ((dyu) obj).f12935c.mo16813g();
            case 17:
                return ((eqk) ((Map.Entry) obj).getValue()).m7693f();
            case 18:
                return "pref_category_contact_us".equals(((hbb) obj).m10060c());
            case 19:
                gfa gfaVar4 = (gfa) obj;
                return gfaVar4.mo9107F() && gfaVar4.mo9104C() && ikw.LONG_EXPOSURE.equals(gfaVar4.mo9115b());
            default:
                gfa gfaVar5 = (gfa) obj;
                return ikw.LONG_EXPOSURE.equals(gfaVar5.mo9115b()) && !gfaVar5.mo9107F();
        }
    }
}
