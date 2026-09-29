package p000;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class zh5 {
    /* JADX INFO: renamed from: a */
    public static LocalDateTime m25656a(zh5 zh5Var, String str) {
        ci5 ci5Var = ai5.f693a;
        zh5Var.getClass();
        str.getClass();
        ci5Var.getClass();
        try {
            String string = str.toString();
            string.getClass();
            return new LocalDateTime(java.time.LocalDateTime.parse(ead.m11006c(12, string)));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    public final KSerializer serializer() {
        return ei5.f37285a;
    }
}
