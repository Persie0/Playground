package p000;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.YearMonth;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class nab implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final nab f52546a = new nab();

    /* JADX INFO: renamed from: b */
    public static final gk7 f52547b = pb1.m19035e("kotlinx.datetime.YearMonth");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        hab habVar = YearMonth.Companion;
        String strMo4092s = decoder.mo4092s();
        cs4 cs4Var = lab.f49376b;
        AbstractC2947e0 abstractC2947e0 = (AbstractC2947e0) cs4Var.getValue();
        habVar.getClass();
        strMo4092s.getClass();
        abstractC2947e0.getClass();
        if (abstractC2947e0 != ((AbstractC2947e0) cs4Var.getValue())) {
            return (YearMonth) abstractC2947e0.m10763c(strMo4092s);
        }
        try {
            String string = strMo4092s.toString();
            string.getClass();
            return new YearMonth(java.time.YearMonth.parse(ead.m11006c(3, string)));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f52547b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        YearMonth yearMonth = (YearMonth) obj;
        yearMonth.getClass();
        encoder.mo15620p(yearMonth.toString());
    }
}
