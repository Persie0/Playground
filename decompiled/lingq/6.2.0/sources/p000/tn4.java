package p000;

import com.lingq.core.database.dao.C1319g;
import com.lingq.core.domain.model.language.StatsCalendar;
import com.lingq.core.domain.model.language.StatsCalendarDay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tn4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f62567c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f62568d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bq1 f62569e;

    public /* synthetic */ tn4(String str, int i, int i2, bq1 bq1Var, int i3) {
        this.f62565a = i3;
        this.f62566b = str;
        this.f62567c = i;
        this.f62568d = i2;
        this.f62569e = bq1Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f62565a;
        StatsCalendar statsCalendar = null;
        bq1 bq1Var = this.f62569e;
        int i2 = this.f62568d;
        int i3 = this.f62567c;
        String str = this.f62566b;
        switch (i) {
            case 0:
                C1319g c1319g = (C1319g) bq1Var;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `dailyGoal`, `stats` FROM (SELECT * FROM StatsCalendarEntity WHERE language = ? AND month = ? AND year = ?)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2878j(2, i3);
                    ik8VarMo2873e0.mo2878j(3, i2);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        int i4 = (int) ik8VarMo2873e0.getLong(0);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(1);
                        qn3 qn3Var = c1319g.f17028M;
                        qn3Var.getClass();
                        strMo2875L.getClass();
                        yf4 yf4Var = (yf4) qn3Var.f57974a;
                        yf4Var.getClass();
                        statsCalendar = new StatsCalendar(i4, (List) yf4Var.m10321a(strMo2875L, new C2978ev(StatsCalendarDay.Companion.serializer())));
                        break;
                    }
                    return statsCalendar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                rxa rxaVar = (rxa) bq1Var;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `term`, `termWithLanguage`, `id`, `status`, `extendedStatus`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM CardEntity WHERE termWithLanguage LIKE ? || '\\_%' ESCAPE '\\' AND status BETWEEN ? AND ?)");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    ik8VarMo2873e1.mo2878j(2, i3);
                    ik8VarMo2873e1.mo2878j(3, i2);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(0);
                        String strMo2875L3 = ik8VarMo2873e1.mo2875L(1);
                        int i5 = (int) ik8VarMo2873e1.getLong(2);
                        int i6 = (int) ik8VarMo2873e1.getLong(3);
                        int i7 = (int) ik8VarMo2873e1.getLong(4);
                        String strMo2875L4 = ik8VarMo2873e1.mo2875L(5);
                        qn3 qn3Var2 = rxaVar.f60014L;
                        List listM20059N = qn3Var2.m20059N(strMo2875L4);
                        List listM20058M = qn3Var2.m20058M(ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M2 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        arrayList.add(new mxa(i5, strMo2875L2, i6, i7, ((int) ik8VarMo2873e1.getLong(8)) != 0, listM20059N, listM20058M, listM20058M2, strMo2875L3));
                    }
                    ik8VarMo2873e1.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
        }
    }
}
