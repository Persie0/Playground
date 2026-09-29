package p000;

import java.time.DateTimeException;
import kotlin.time.Instant;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cgd {
    /* JADX INFO: renamed from: a */
    public static final LocalDateTime m4647a(Instant instant, UtcOffset utcOffset) {
        try {
            instant.getClass();
            try {
                java.time.Instant instantOfEpochSecond = java.time.Instant.ofEpochSecond(instant.f47733a, instant.f47734b);
                instantOfEpochSecond.getClass();
                return new LocalDateTime(java.time.LocalDateTime.ofInstant(instantOfEpochSecond, utcOffset.f48194a));
            } catch (DateTimeException e) {
                throw new DateTimeArithmeticException(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new DateTimeArithmeticException("Can not convert instant " + instant + " to LocalDateTime to perform computations", e2);
        }
    }
}
