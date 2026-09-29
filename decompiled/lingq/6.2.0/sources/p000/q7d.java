package p000;

import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;
import kotlin.time.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q7d {
    /* JADX INFO: renamed from: a */
    public static final Instant m19710a(LocalDateTime localDateTime, v0a v0aVar, UtcOffset utcOffset) {
        v0aVar.getClass();
        java.time.Instant instant = ZonedDateTime.ofLocal(localDateTime.f48189a, v0aVar.f64670a, utcOffset.f48194a).toInstant();
        instant.getClass();
        Instant instant2 = Instant.f47731c;
        return wfb.m23920o(instant.getEpochSecond(), instant.getNano());
    }

    /* JADX INFO: renamed from: b */
    public static final UtcOffset m19711b(Instant instant, v0a v0aVar) {
        instant.getClass();
        v0aVar.getClass();
        ZoneRules rules = v0aVar.f64670a.getRules();
        java.time.Instant instantOfEpochSecond = java.time.Instant.ofEpochSecond(instant.f47733a, instant.f47734b);
        instantOfEpochSecond.getClass();
        return new UtcOffset(rules.getOffset(instantOfEpochSecond));
    }

    /* JADX INFO: renamed from: c */
    public static C3309ls m19712c(vqb vqbVar) throws IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) vqbVar.f65802b;
        try {
            return C3309ls.m16481q(xj4.m24563C(byteArrayInputStream, ox2.m18561a()));
        } finally {
            byteArrayInputStream.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19713d(C3309ls c3309ls, fs6 fs6Var) {
        if (((SharedPreferences.Editor) fs6Var.f39590b).putString((String) fs6Var.f39591c, AbstractC3423or.m18272p(((xj4) c3309ls.f50064b).m6432d())).commit()) {
            return;
        }
        v63.m23133k("Failed to write to SharedPreferences");
    }
}
