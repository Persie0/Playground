package p000;

import android.view.View;
import com.google.android.apps.camera.optionsbar.view.LinearMinibarImpl;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fjv implements Predicate {

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f22327u;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ fjv f22326t = new fjv(20);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ fjv f22325s = new fjv(19);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ fjv f22324r = new fjv(18);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ fjv f22323q = new fjv(17);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ fjv f22322p = new fjv(16);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ fjv f22321o = new fjv(15);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ fjv f22320n = new fjv(14);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ fjv f22319m = new fjv(13);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ fjv f22318l = new fjv(12);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ fjv f22317k = new fjv(11);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ fjv f22316j = new fjv(10);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ fjv f22315i = new fjv(9);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ fjv f22314h = new fjv(8);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ fjv f22313g = new fjv(7);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ fjv f22312f = new fjv(6);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fjv f22311e = new fjv(5);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fjv f22310d = new fjv(4);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fjv f22309c = new fjv(3);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fjv f22308b = new fjv(2);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ fjv f22307a = new fjv(1);

    public /* synthetic */ fjv(int i) {
        this.f22327u = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f22327u) {
            case 0:
                ikw ikwVarMo9115b = ((gfa) obj).mo9115b();
                if (ikw.PHOTO.equals(ikwVarMo9115b)) {
                    return true;
                }
                ikw.PORTRAIT.equals(ikwVarMo9115b);
                return !ikw.LONG_EXPOSURE.equals(ikwVarMo9115b) ? false : false;
            case 1:
                gfa gfaVar = (gfa) obj;
                return !gfaVar.mo9107F() && gfaVar.mo9104C() && ikw.LONG_EXPOSURE.equals(gfaVar.mo9115b());
            case 2:
                return ((Integer) obj).intValue() == 240;
            case 3:
                return ((gfb) obj).mo5771g() == gev.AMETHYST;
            case 4:
                return ((Boolean) obj).booleanValue();
            case 5:
                return ((gfb) obj).mo5771g().equals(gev.TIMER);
            case 6:
                return true;
            case 7:
                gfa gfaVar2 = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                ikw ikwVarMo9115b2 = gfaVar2.mo9115b();
                return (ikw.PHOTO.equals(ikwVarMo9115b2) || ikw.PORTRAIT.equals(ikwVarMo9115b2) || ikw.IMAGE_INTENT.equals(ikwVarMo9115b2)) && gfaVar2.mo9107F();
            case 8:
                gfa gfaVar3 = (gfa) obj;
                nbh nbhVar2 = gfy.f24631a;
                return gfaVar3.mo9107F() && ikw.LONG_EXPOSURE.equals(gfaVar3.mo9115b());
            case 9:
                int i = LinearMinibarImpl.f6821a;
                return ((View) obj).getVisibility() == 0;
            case 10:
                return ((key) obj).mo7046g();
            case 11:
                return ((gyj) obj).f26833b;
            case 12:
                int i2 = hfx.f27636f;
                return !((hhs) obj).f27856b;
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((Boolean) obj).booleanValue();
            case 15:
                return ((String) obj).isEmpty();
            case 16:
                return hha.f27783b.matcher((String) obj).matches();
            case 17:
                nbh nbhVar3 = hha.f27782a;
                return !hgu.f27749c.contains((String) obj);
            case 18:
                return ((mrm) obj).mo16813g();
            case 19:
                return ((Boolean) obj).booleanValue();
            default:
                return ((hyx) obj).f29996b;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f22327u) {
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
        switch (this.f22327u) {
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
    public final /* synthetic */ Predicate m8499or(Predicate predicate) {
        switch (this.f22327u) {
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
}
