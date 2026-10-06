package p000;

import android.content.pm.ResolveInfo;
import android.widget.LinearLayout;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gek implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24389b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24390c;

    public /* synthetic */ gek(OptionsMenuView optionsMenuView, gev gevVar, int i) {
        this.f24390c = i;
        this.f24389b = optionsMenuView;
        this.f24388a = gevVar;
    }

    public /* synthetic */ gek(gev gevVar, gfc gfcVar, int i) {
        this.f24390c = i;
        this.f24388a = gevVar;
        this.f24389b = gfcVar;
    }

    public /* synthetic */ gek(hha hhaVar, String str, int i) {
        this.f24390c = i;
        this.f24388a = hhaVar;
        this.f24389b = str;
    }

    public /* synthetic */ gek(Map map, Function function, int i) {
        this.f24390c = i;
        this.f24388a = map;
        this.f24389b = function;
    }

    public /* synthetic */ gek(jwn jwnVar, hmw hmwVar, int i) {
        this.f24390c = i;
        this.f24389b = jwnVar;
        this.f24388a = hmwVar;
    }

    public /* synthetic */ gek(jwn jwnVar, kme kmeVar, int i) {
        this.f24390c = i;
        this.f24388a = jwnVar;
        this.f24389b = kmeVar;
    }

    public /* synthetic */ gek(jww jwwVar, jww jwwVar2, int i) {
        this.f24390c = i;
        this.f24388a = jwwVar;
        this.f24389b = jwwVar2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f24390c) {
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
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f24390c) {
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
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m9099or(Predicate predicate) {
        switch (this.f24390c) {
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
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kme] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jww] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        kmg kmgVarMo13857d;
        mxk mxkVar;
        switch (this.f24390c) {
            case 0:
                Object obj2 = this.f24388a;
                Object obj3 = this.f24389b;
                gfb gfbVar = (gfb) obj;
                if (((gev) obj2).equals(gfbVar.mo5771g())) {
                    if (!((gfc) obj3).equals(gfbVar.mo5773i().mo3831be())) {
                        return true;
                    }
                }
                return false;
            case 1:
                ?? r0 = this.f24388a;
                ?? r1 = this.f24389b;
                String str = (String) r0.mo3831be();
                if (mro.m16832b(str) || (kmgVarMo13857d = r1.mo13857d(str)) == null) {
                    return false;
                }
                return r1.mo13854a(kmgVarMo13857d).mo14537F();
            case 2:
                Object obj4 = this.f24388a;
                Object obj5 = this.f24389b;
                gfb gfbVar2 = (gfb) obj;
                if (((gev) obj4).equals(gfbVar2.mo5771g())) {
                    if (!((gfc) obj5).equals(gfbVar2.mo5773i().mo3831be())) {
                        return true;
                    }
                }
                return false;
            case 3:
                ?? r2 = this.f24388a;
                ?? r3 = this.f24389b;
                gfa gfaVar = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                if (ikw.TIME_LAPSE.equals(gfaVar.mo9115b()) && ((Boolean) r2.mo3831be()).booleanValue()) {
                    return true;
                }
                return ikw.VIDEO.equals(gfaVar.mo9115b()) && ((Boolean) r3.mo3831be()).booleanValue();
            case 4:
                Object obj6 = this.f24389b;
                Object obj7 = this.f24388a;
                nbh nbhVar2 = gfy.f24631a;
                return (((Boolean) ((jwf) obj6).f34942d).booleanValue() || ((Boolean) ((hmw) obj7).m10476a().mo3831be()).booleanValue()) ? false : true;
            case 5:
                Object obj8 = this.f24389b;
                ggg gggVar = (ggg) obj;
                if (!gggVar.m9203a().equals(this.f24388a)) {
                    return false;
                }
                LinearLayout linearLayout = ((OptionsMenuView) obj8).f6847g;
                linearLayout.getClass();
                linearLayout.removeView(gggVar);
                gfc gfcVar = gggVar.f24659g;
                return true;
            case 6:
                Object obj9 = this.f24388a;
                Object obj10 = this.f24389b;
                ggg gggVar2 = (ggg) obj;
                if (((gev) obj9).equals(gggVar2.m9203a())) {
                    if (!((gfc) obj10).equals(gggVar2.f24659g)) {
                        return true;
                    }
                }
                return false;
            case 7:
                ?? r4 = this.f24388a;
                ?? r5 = this.f24389b;
                int i = hfx.f27636f;
                return p021j$.util.Map.EL.putIfAbsent(r4, r5.apply(obj), Boolean.TRUE) == null;
            case 8:
                return p021j$.util.Map.EL.putIfAbsent(this.f24388a, this.f24389b.apply(obj), Boolean.TRUE) == null;
            case 9:
                return p021j$.util.Map.EL.putIfAbsent(this.f24388a, this.f24389b.apply(obj), Boolean.TRUE) == null;
            case 10:
                ?? r6 = this.f24388a;
                ?? r7 = this.f24389b;
                nbh nbhVar3 = hha.f27782a;
                return p021j$.util.Map.EL.putIfAbsent(r6, r7.apply(obj), Boolean.TRUE) == null;
            default:
                Object obj11 = this.f24388a;
                Object obj12 = this.f24389b;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                hgt hgtVar = (hgt) ((hha) obj11).f27785d.get(resolveInfo.activityInfo.packageName);
                if (hgtVar == null) {
                    return false;
                }
                String str2 = resolveInfo.activityInfo.name;
                String str3 = (String) obj12;
                if (str3.equals("image/*") || krd.m14742a(str3).m14743b()) {
                    mxkVar = hgtVar.f27744a;
                } else {
                    mxkVar = (str3.equals(wUzNh.wbjkNFsraunLXCK) || krd.m14742a(str3).m14744c()) ? hgtVar.f27745b : mzx.f41874a;
                }
                naz nazVarListIterator = mxkVar.listIterator();
                while (nazVarListIterator.hasNext()) {
                    if (((String) nazVarListIterator.next()).equals(str2)) {
                        return true;
                    }
                }
                ((nbe) ((nbe) hha.f27782a.m17252c()).mo17276G(3608)).mo17301z("isListed: unknown activity. mimeType=%s className=%s", obj12, str2);
                return false;
        }
    }
}
