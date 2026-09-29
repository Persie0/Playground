package p000;

import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class oma implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final oma f54593a = new oma();

    /* JADX INFO: renamed from: b */
    public static final gk7 f54594b = pb1.m19035e("kotlinx.datetime.UtcOffset");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        gma gmaVar = UtcOffset.Companion;
        String strMo4092s = decoder.mo4092s();
        cs4 cs4Var = jma.f45839a;
        ima imaVar = (ima) cs4Var.getValue();
        gmaVar.getClass();
        strMo4092s.getClass();
        imaVar.getClass();
        if (imaVar == ((ima) cs4Var.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) lma.f49839a.getValue();
            dateTimeFormatter.getClass();
            return lma.m16389b(strMo4092s, dateTimeFormatter);
        }
        if (imaVar == ((ima) jma.f45840b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) lma.f49840b.getValue();
            dateTimeFormatter2.getClass();
            return lma.m16389b(strMo4092s, dateTimeFormatter2);
        }
        if (imaVar != ((ima) jma.f45841c.getValue())) {
            return (UtcOffset) imaVar.m10763c(strMo4092s);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) lma.f49841c.getValue();
        dateTimeFormatter3.getClass();
        return lma.m16389b(strMo4092s, dateTimeFormatter3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f54594b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        UtcOffset utcOffset = (UtcOffset) obj;
        utcOffset.getClass();
        encoder.mo15620p(utcOffset.toString());
    }
}
