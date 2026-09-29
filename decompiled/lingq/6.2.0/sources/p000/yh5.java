package p000;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class yh5 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final yh5 f69848a = new yh5();

    /* JADX INFO: renamed from: b */
    public static final gk7 f69849b = pb1.m19035e("kotlinx.datetime.LocalDate");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        sh5 sh5Var = LocalDate.Companion;
        String strMo4092s = decoder.mo4092s();
        int i = th5.f62290a;
        cs4 cs4Var = wh5.f66827a;
        AbstractC2947e0 abstractC2947e0 = (AbstractC2947e0) cs4Var.getValue();
        sh5Var.getClass();
        strMo4092s.getClass();
        abstractC2947e0.getClass();
        if (abstractC2947e0 != ((AbstractC2947e0) cs4Var.getValue())) {
            return (LocalDate) abstractC2947e0.m10763c(strMo4092s);
        }
        try {
            String string = strMo4092s.toString();
            string.getClass();
            return new LocalDate(java.time.LocalDate.parse(ead.m11006c(6, string)));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f69849b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LocalDate localDate = (LocalDate) obj;
        localDate.getClass();
        encoder.mo15620p(localDate.toString());
    }
}
