package p000;

import com.lingq.core.data.repository.C1291g;
import com.lingq.core.database.dao.C1317e;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class cm3 {
    private static final am3 Companion = new am3();

    /* JADX INFO: renamed from: a */
    public final mu1 f10266a;

    public cm3(mu1 mu1Var) {
        mu1Var.getClass();
        this.f10266a = mu1Var;
    }

    /* JADX INFO: renamed from: a */
    public static Integer m4855a(String str, LocalDate localDate) {
        Object failure;
        try {
            int iBetween = (int) ChronoUnit.DAYS.between(LocalDate.parse(str), localDate);
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
        return (Integer) failure;
    }

    /* JADX INFO: renamed from: b */
    public static bm3 m4856b(cm3 cm3Var, String str) {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        str.getClass();
        C1317e c1317e = ((C1291g) cm3Var.f10266a).f16481b;
        return new bm3(new yo1(AbstractC3584sr.m21590A(c1317e.f17014a, false, new String[]{"CupEntity"}, new C0011a9(c1317e, 7)), 1), cm3Var, str, localDateNow);
    }
}
