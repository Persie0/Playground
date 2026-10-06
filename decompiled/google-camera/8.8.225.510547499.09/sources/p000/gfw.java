package p000;

import android.content.pm.ResolveInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gfw implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24623a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24624b;

    public /* synthetic */ gfw(gev gevVar, int i) {
        this.f24624b = i;
        this.f24623a = gevVar;
    }

    public /* synthetic */ gfw(gns gnsVar, int i) {
        this.f24624b = i;
        this.f24623a = gnsVar;
    }

    public /* synthetic */ gfw(had hadVar, int i) {
        this.f24624b = i;
        this.f24623a = hadVar;
    }

    public /* synthetic */ gfw(hfx hfxVar, int i) {
        this.f24624b = i;
        this.f24623a = hfxVar;
    }

    public /* synthetic */ gfw(idk idkVar, int i) {
        this.f24624b = i;
        this.f24623a = idkVar;
    }

    public /* synthetic */ gfw(List list, int i) {
        this.f24624b = i;
        this.f24623a = list;
    }

    public /* synthetic */ gfw(Set set, int i) {
        this.f24624b = i;
        this.f24623a = set;
    }

    public /* synthetic */ gfw(BiPredicate biPredicate, int i) {
        this.f24624b = i;
        this.f24623a = biPredicate;
    }

    public /* synthetic */ gfw(jwn jwnVar, int i) {
        this.f24624b = i;
        this.f24623a = jwnVar;
    }

    public /* synthetic */ gfw(jww jwwVar, int i) {
        this.f24624b = i;
        this.f24623a = jwwVar;
    }

    public /* synthetic */ gfw(mwx mwxVar, int i) {
        this.f24624b = i;
        this.f24623a = mwxVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f24624b) {
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
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f24624b) {
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
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m9187or(Predicate predicate) {
        switch (this.f24624b) {
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
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.function.BiPredicate] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f24624b) {
            case 0:
                ?? r0 = this.f24623a;
                nbh nbhVar = gfy.f24631a;
                return ikw.PHOTO.equals(((gfa) obj).mo9115b()) && ((Boolean) r0.mo3831be()).booleanValue();
            case 1:
                ?? r1 = this.f24623a;
                gfa gfaVar = (gfa) obj;
                nbh nbhVar2 = gfy.f24631a;
                ikw ikwVarMo9115b = gfaVar.mo9115b();
                boolean z = ikw.PHOTO.equals(ikwVarMo9115b) || ikw.IMAGE_INTENT.equals(ikwVarMo9115b) || ikw.PORTRAIT.equals(ikwVarMo9115b);
                return gfaVar.mo9106E() && !gfaVar.mo9107F() && z && !((Boolean) r1.mo3831be()).booleanValue();
            case 2:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 3:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 4:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 5:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 6:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 7:
                return ((gev) this.f24623a).equals(((ggg) obj).m9203a());
            case 8:
                kpw kpwVarM9497f = ((gns) this.f24623a).f25781d.m9784a((key) obj).m9497f();
                if (kpwVarM9497f == null) {
                    return false;
                }
                kpwVarM9497f.close();
                return true;
            case 9:
                return ((hfx) this.f24623a).m10222e((ResolveInfo) obj);
            case 10:
                nbh nbhVar3 = hha.f27782a;
                return !this.f24623a.contains((String) obj);
            case 11:
                return ((had) this.f24623a).mo10046m((String) obj);
            case 12:
                return this.f24623a.contains((String) obj);
            case 13:
                return ((mwx) this.f24623a).containsKey((String) obj);
            case 14:
                ?? r2 = this.f24623a;
                gfa gfaVar2 = (gfa) obj;
                ikw ikwVarMo9115b2 = gfaVar2.mo9115b();
                if (gfaVar2.mo9107F()) {
                    return false;
                }
                return ikwVarMo9115b2.equals(ikw.PHOTO) || ikwVarMo9115b2.equals(ikw.MOTION_BLUR) || ikwVarMo9115b2.equals(ikw.LONG_EXPOSURE);
            case 15:
                return ((idk) ((Map.Entry) obj).getKey()).ordinal() < ((idk) this.f24623a).ordinal();
            default:
                Map.Entry entry = (Map.Entry) obj;
                return this.f24623a.test(entry.getKey(), entry.getValue());
        }
    }
}
