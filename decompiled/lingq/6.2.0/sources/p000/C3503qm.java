package p000;

import com.lingq.core.domain.cup.GetCupBannerUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.core.domain.model.cup.CupChampion;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupTeamEntry;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: qm */
/* JADX INFO: loaded from: classes.dex */
public final class C3503qm implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57923a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57926d;

    public C3503qm(e83 e83Var, cm3 cm3Var, String str, LocalDate localDate) {
        this.f57924b = e83Var;
        this.f57925c = str;
        this.f57926d = localDate;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0183  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        GetCupBannerUseCase$invoke$$inlined$map$1$2$1 getCupBannerUseCase$invoke$$inlined$map$1$2$1;
        int i;
        ws1 ws1Var;
        String str;
        boolean z;
        Object failure;
        Integer num;
        boolean z2;
        Integer numM4855a;
        int i2 = this.f57923a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f57926d;
        Object obj3 = this.f57925c;
        Object obj4 = this.f57924b;
        switch (i2) {
            case 0:
                faa faaVar = (faa) obj3;
                ((jl7) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((zi3) ((t66) obj2).getValue()).invoke(faaVar.m11669c(), ((xc9) faaVar.f38738d).getValue())).booleanValue() : false));
                return xfaVar;
            default:
                if (continuation instanceof GetCupBannerUseCase$invoke$$inlined$map$1$2$1) {
                    getCupBannerUseCase$invoke$$inlined$map$1$2$1 = (GetCupBannerUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i3 = getCupBannerUseCase$invoke$$inlined$map$1$2$1.f18624b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        getCupBannerUseCase$invoke$$inlined$map$1$2$1.f18624b = i3 - Integer.MIN_VALUE;
                    } else {
                        getCupBannerUseCase$invoke$$inlined$map$1$2$1 = new GetCupBannerUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getCupBannerUseCase$invoke$$inlined$map$1$2$1 = new GetCupBannerUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj5 = getCupBannerUseCase$invoke$$inlined$map$1$2$1.f18623a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = getCupBannerUseCase$invoke$$inlined$map$1$2$1.f18624b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                e83 e83Var = (e83) obj4;
                ew1 ew1Var = (ew1) obj;
                if (ew1Var != null) {
                    String str2 = ew1Var.f37978d;
                    String str3 = ew1Var.f37977c;
                    String strM8021a = (String) obj3;
                    LocalDate localDate = (LocalDate) obj2;
                    boolean z3 = str3 == null && str2 == null;
                    boolean z4 = ew1Var.f37976b;
                    boolean z5 = ew1Var.f37975a;
                    List list = ew1Var.f37984j;
                    if (z3) {
                        ws1Var = null;
                    } else {
                        if (!z5 && !z4) {
                            List list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((CupTeamEntry) it.next()).f18998c) {
                                        }
                                    }
                                }
                            }
                            ws1Var = null;
                        }
                        Integer numValueOf = (!z5 || (numM4855a = cm3.m4855a(str3, localDate)) == null) ? null : Integer.valueOf(numM4855a.intValue() + 1);
                        if (ew1Var.f37980f) {
                            CupTeam cupTeam = ew1Var.f37981g;
                            if (cupTeam != null) {
                                strM8021a = cupTeam.m8021a();
                                str = strM8021a;
                            } else {
                                str = null;
                            }
                        } else {
                            List list3 = list;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (fa4.m11650l(((CupTeamEntry) it2.next()).f18996a, strM8021a)) {
                                            str = strM8021a;
                                        }
                                    }
                                }
                            }
                            str = null;
                        }
                        boolean z6 = ew1Var.f37975a;
                        boolean z7 = ew1Var.f37976b;
                        boolean z8 = ew1Var.f37980f;
                        CupMyStats cupMyStats = ew1Var.f37982h;
                        Integer numM8016a = cupMyStats != null ? cupMyStats.m8016a() : null;
                        CupChampion cupChampion = ew1Var.f37979e;
                        String str4 = cupChampion != null ? cupChampion.f18970a : null;
                        String str5 = ew1Var.f37977c;
                        String str6 = ew1Var.f37978d;
                        List list4 = list;
                        Iterator it3 = list4.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            i5 += ((CupTeamEntry) it3.next()).f18997b;
                        }
                        if ((list4 instanceof Collection) && list4.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it4 = list4.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z = false;
                                } else if (((CupTeamEntry) it4.next()).f18998c) {
                                    z = true;
                                }
                            }
                        }
                        if (z5) {
                            try {
                                int iBetween = (int) ChronoUnit.DAYS.between(localDate, LocalDate.parse(str2));
                                if (iBetween < 0) {
                                    iBetween = 0;
                                }
                                failure = Integer.valueOf(iBetween);
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            if (failure instanceof Result.Failure) {
                                failure = null;
                            }
                            num = (Integer) failure;
                        } else {
                            num = null;
                        }
                        if (z4) {
                            Integer numM4855a2 = cm3.m4855a(str2, localDate);
                            if ((numM4855a2 != null ? numM4855a2.intValue() : 0) > 7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        ws1Var = new ws1(numValueOf, z6, z7, z8, str, numM8016a, str4, str5, str6, i5, z, num, z2);
                    }
                    i = 1;
                    break;
                } else {
                    i = 1;
                    ws1Var = null;
                }
                getCupBannerUseCase$invoke$$inlined$map$1$2$1.f18624b = i;
                return e83Var.emit(ws1Var, getCupBannerUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    public C3503qm(jl7 jl7Var, faa faaVar, t66 t66Var) {
        this.f57924b = jl7Var;
        this.f57925c = faaVar;
        this.f57926d = t66Var;
    }
}
