package p000;

import com.lingq.core.database.dao.C1317e;
import com.lingq.core.domain.model.cup.CupChampion;
import com.lingq.core.domain.model.cup.CupClaim;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupTeamEntry;
import com.lingq.core.domain.model.cup.CupToday;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C1317e f62838A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f62839z;

    public /* synthetic */ tt1(C1317e c1317e, int i) {
        this.f62839z = i;
        this.f62838A = c1317e;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        String strM10322b;
        String strM10322b2;
        String strM10322b3;
        int i = this.f62839z;
        String strM10322b4 = null;
        C1317e c1317e = this.f62838A;
        switch (i) {
            case 0:
                xt1 xt1Var = (xt1) obj;
                ik8Var.getClass();
                xt1Var.getClass();
                ik8Var.mo2878j(1, xt1Var.f68682a);
                ik8Var.mo2878j(2, xt1Var.f68683b ? 1L : 0L);
                ik8Var.mo2878j(3, xt1Var.f68684c ? 1L : 0L);
                String str = xt1Var.f68685d;
                if (str == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, str);
                }
                String str2 = xt1Var.f68686e;
                if (str2 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, str2);
                }
                ik8Var.mo2878j(6, xt1Var.f68687f ? 1L : 0L);
                CupChampion cupChampion = xt1Var.f68688g;
                qn3 qn3Var = c1317e.f17016c;
                if (cupChampion != null) {
                    yf4 yf4Var = (yf4) qn3Var.f57974a;
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(CupChampion.Companion.serializer(), cupChampion);
                } else {
                    qn3Var.getClass();
                    strM10322b = null;
                }
                if (strM10322b == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM10322b);
                }
                CupTeam cupTeam = xt1Var.f68689h;
                if (cupTeam != null) {
                    yf4 yf4Var2 = (yf4) qn3Var.f57974a;
                    yf4Var2.getClass();
                    strM10322b2 = yf4Var2.m10322b(CupTeam.Companion.serializer(), cupTeam);
                } else {
                    qn3Var.getClass();
                    strM10322b2 = null;
                }
                yf4 yf4Var3 = (yf4) qn3Var.f57974a;
                if (strM10322b2 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM10322b2);
                }
                CupMyStats cupMyStats = xt1Var.f68690i;
                if (cupMyStats != null) {
                    yf4Var3.getClass();
                    strM10322b3 = yf4Var3.m10322b(CupMyStats.Companion.serializer(), cupMyStats);
                } else {
                    strM10322b3 = null;
                }
                if (strM10322b3 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM10322b3);
                }
                CupToday cupToday = xt1Var.f68691j;
                if (cupToday != null) {
                    yf4Var3.getClass();
                    strM10322b4 = yf4Var3.m10322b(CupToday.Companion.serializer(), cupToday);
                }
                if (strM10322b4 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM10322b4);
                }
                List list = xt1Var.f68692k;
                list.getClass();
                yf4Var3.getClass();
                ik8Var.mo2874C(11, yf4Var3.m10322b(new C2978ev(CupTeamEntry.Companion.serializer()), list));
                break;
            default:
                iu1 iu1Var = (iu1) obj;
                ik8Var.getClass();
                iu1Var.getClass();
                ik8Var.mo2874C(1, iu1Var.m14147b());
                ik8Var.mo2874C(2, iu1Var.m14148c());
                ik8Var.mo2874C(3, iu1Var.m14150e());
                ik8Var.mo2878j(4, iu1Var.m14151f());
                ik8Var.mo2874C(5, iu1Var.m14149d());
                CupClaim cupClaimM14146a = iu1Var.m14146a();
                qn3 qn3Var2 = c1317e.f17016c;
                if (cupClaimM14146a != null) {
                    yf4 yf4Var4 = (yf4) qn3Var2.f57974a;
                    yf4Var4.getClass();
                    strM10322b4 = yf4Var4.m10322b(CupClaim.Companion.serializer(), cupClaimM14146a);
                } else {
                    qn3Var2.getClass();
                }
                if (strM10322b4 != null) {
                    ik8Var.mo2874C(6, strM10322b4);
                } else {
                    ik8Var.mo2880m(6);
                }
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f62839z) {
            case 0:
                return "INSERT INTO `CupEntity` (`id`,`active`,`ended`,`startsAt`,`endsAt`,`joined`,`champion`,`team`,`my`,`today`,`teams`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `CupPrizeEntity` (`date`,`kind`,`source`,`value`,`label`,`claim`) VALUES (?,?,?,?,?,?)";
        }
    }
}
