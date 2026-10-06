package p000;

import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;
import java.util.Set;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dam implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10283a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10284b;

    public /* synthetic */ dam(eqz eqzVar, int i) {
        this.f10284b = i;
        this.f10283a = eqzVar;
    }

    public /* synthetic */ dam(fmz fmzVar, int i) {
        this.f10284b = i;
        this.f10283a = fmzVar;
    }

    public /* synthetic */ dam(fvh fvhVar, int i) {
        this.f10284b = i;
        this.f10283a = fvhVar;
    }

    public /* synthetic */ dam(geo geoVar, int i) {
        this.f10284b = i;
        this.f10283a = geoVar;
    }

    public /* synthetic */ dam(gev gevVar, int i) {
        this.f10284b = i;
        this.f10283a = gevVar;
    }

    public /* synthetic */ dam(ikw ikwVar, int i) {
        this.f10284b = i;
        this.f10283a = ikwVar;
    }

    public /* synthetic */ dam(String str, int i) {
        this.f10284b = i;
        this.f10283a = str;
    }

    public /* synthetic */ dam(Set set, int i) {
        this.f10284b = i;
        this.f10283a = set;
    }

    public /* synthetic */ dam(jwn jwnVar, int i) {
        this.f10284b = i;
        this.f10283a = jwnVar;
    }

    public /* synthetic */ dam(jww jwwVar, int i) {
        this.f10284b = i;
        this.f10283a = jwwVar;
    }

    public /* synthetic */ dam(kmq kmqVar, int i) {
        this.f10284b = i;
        this.f10283a = kmqVar;
    }

    public /* synthetic */ dam(mxk mxkVar, int i) {
        this.f10284b = i;
        this.f10283a = mxkVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f10284b) {
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
        switch (this.f10284b) {
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
    public final /* synthetic */ Predicate m5835or(Predicate predicate) {
        switch (this.f10284b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v24, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, jww] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f10284b) {
            case 0:
                return !((Boolean) ((jwf) this.f10283a).f34942d).booleanValue();
            case 1:
                ?? r0 = this.f10283a;
                gfa gfaVar = (gfa) obj;
                ikw ikwVarMo9115b = gfaVar.mo9115b();
                boolean z = ikw.VIDEO.equals(ikwVarMo9115b) || ikw.VIDEO_INTENT.equals(ikwVarMo9115b) || ikw.AMBER.equals(ikwVarMo9115b) || ikw.SLOW_MOTION.equals(ikwVarMo9115b);
                return !gfaVar.mo9107F() && gfaVar.mo9106E() && !((Boolean) r0.mo3831be()).booleanValue() && z;
            case 2:
                return ((dbq) obj).f10413a == this.f10283a;
            case 3:
                return ((dbq) obj).f10413a == this.f10283a;
            case 4:
                return ((dbq) obj).f10413a == this.f10283a;
            case 5:
                return ((dbq) obj).f10413a == this.f10283a;
            case 6:
                dbq dbqVar = (dbq) obj;
                return dbqVar.f10414b && dbqVar.f10415c && dbqVar.f10413a == this.f10283a;
            case 7:
                return !((mxk) this.f10283a).contains(Integer.valueOf(((FaceToObfuscate) obj).mo4120b()));
            case 8:
                return ((epb) obj).f14945a.equals(this.f10283a);
            case 9:
                return !((String) obj).equals(this.f10283a);
            case 10:
                return Boolean.TRUE.equals(((fvh) this.f10283a).f23627a.get((String) obj));
            case 11:
                return ((gev) this.f10283a).equals(((gfb) obj).mo5771g());
            case 12:
                return ((gfb) obj).mo5778n(this.f10283a);
            case 13:
                return this.f10283a.contains(((gfb) obj).mo5771g());
            case 14:
                return ((mxk) this.f10283a).contains(((gfb) obj).mo5771g());
            case 15:
                return ((mxk) this.f10283a).contains(((gfb) obj).mo5771g());
            case 16:
                return ((gfb) obj).mo5778n(this.f10283a);
            case 17:
                return ((ikw) this.f10283a).equals(((gfa) obj).mo9115b());
            case 18:
                Object obj2 = this.f10283a;
                nbh nbhVar = gfy.f24631a;
                return !((fmz) obj2).m8598b();
            case 19:
                Object obj3 = this.f10283a;
                gfa gfaVar2 = (gfa) obj;
                nbh nbhVar2 = gfy.f24631a;
                if (!((Boolean) ((jwf) ((fmz) obj3).f22756c).f34942d).booleanValue()) {
                    return false;
                }
                ikw ikwVar = ikw.UNINITIALIZED;
                switch (gfaVar2.mo9115b().ordinal()) {
                    case 2:
                    case 5:
                    case 13:
                    case 19:
                        return true;
                    default:
                        return false;
                }
            default:
                ?? r1 = this.f10283a;
                gfa gfaVar3 = (gfa) obj;
                nbh nbhVar3 = gfy.f24631a;
                return (ikw.PHOTO.equals(gfaVar3.mo9115b()) || ikw.LONG_EXPOSURE.equals(gfaVar3.mo9115b())) && ((Boolean) r1.mo3831be()).booleanValue();
        }
    }
}
