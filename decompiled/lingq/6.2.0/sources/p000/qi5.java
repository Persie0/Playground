package p000;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class qi5 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final qi5 f57818a = new qi5();

    /* JADX INFO: renamed from: b */
    public static final gk7 f57819b = pb1.m19035e("kotlinx.datetime.LocalTime");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        mi5 mi5Var = LocalTime.Companion;
        String strMo4092s = decoder.mo4092s();
        cs4 cs4Var = pi5.f56249a;
        oi5 oi5Var = (oi5) cs4Var.getValue();
        mi5Var.getClass();
        strMo4092s.getClass();
        oi5Var.getClass();
        if (oi5Var != ((oi5) cs4Var.getValue())) {
            return (LocalTime) oi5Var.m10763c(strMo4092s);
        }
        try {
            return new LocalTime(java.time.LocalTime.parse(strMo4092s));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f57819b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        localTime.getClass();
        encoder.mo15620p(localTime.toString());
    }
}
