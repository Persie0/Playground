package p000;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import kotlin.Result;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class wg8 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final wg8 f66797a = new wg8();

    /* JADX INFO: renamed from: b */
    public static final gk7 f66798b = pb1.m19035e("Rfc3339Date");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object failure;
        String strMo4092s = decoder.mo4092s();
        try {
            failure = Instant.parse(strMo4092s);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.m15355a(failure) != null) {
            failure = OffsetDateTime.parse(strMo4092s, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant();
        }
        Date dateFrom = Date.from((Instant) failure);
        dateFrom.getClass();
        return dateFrom;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f66798b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Date date = (Date) obj;
        date.getClass();
        String str = DateTimeFormatter.ISO_INSTANT.format(date.toInstant());
        str.getClass();
        encoder.mo15620p(str);
    }
}
