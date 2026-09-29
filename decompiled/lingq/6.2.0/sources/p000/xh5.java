package p000;

import java.time.DateTimeException;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.datetime.DateTimeArithmeticException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xh5 {

    /* JADX INFO: renamed from: a */
    public static final long f68206a = LocalDate.MIN.toEpochDay();

    /* JADX INFO: renamed from: b */
    public static final long f68207b = LocalDate.MAX.toEpochDay();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f68208c = 0;

    /* JADX INFO: renamed from: a */
    public static final kotlinx.datetime.LocalDate m24517a(kotlinx.datetime.LocalDate localDate, long j, k22 k22Var) throws Exception {
        LocalDate localDatePlusMonths;
        LocalDate localDate2 = localDate.f48188a;
        k22Var.getClass();
        try {
            if (k22Var instanceof m22) {
                long jAddExact = Math.addExact(localDate2.toEpochDay(), Math.multiplyExact(j, ((m22) k22Var).f50447d));
                long j2 = f68206a;
                if (jAddExact > f68207b || j2 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jAddExact);
                localDatePlusMonths.getClass();
            } else {
                if (!(k22Var instanceof o22)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = localDate2.plusMonths(Math.multiplyExact(j, ((o22) k22Var).f53648d));
            }
            return new kotlinx.datetime.LocalDate(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new DateTimeArithmeticException("The result of adding " + j + " of " + k22Var + " to " + localDate + " is out of LocalDate range.", e);
        }
    }
}
