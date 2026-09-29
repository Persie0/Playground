package p000;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.C3261a;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a37 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final a37 f180a = new a37();

    /* JADX INFO: renamed from: b */
    public static final zx8 f181b = pb1.m19042l("PairAsStringIntList", hl9.f42586z, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String string;
        AbstractC3262b abstractC3262bMo15628l = ((pf4) decoder).mo15628l();
        abstractC3262bMo15628l.getClass();
        C3261a c3261a = (C3261a) abstractC3262bMo15628l;
        int i = 0;
        Integer numM21338e = null;
        if (c3261a.get(0) instanceof JsonNull) {
            string = null;
        } else {
            String string2 = c3261a.get(0).toString();
            char[] cArr = {'\"'};
            string2.getClass();
            int length = string2.length() - 1;
            boolean z = false;
            while (i <= length) {
                boolean zM20821O = AbstractC3550rv.m20821O(cArr, string2.charAt(!z ? i : length));
                if (z) {
                    if (!zM20821O) {
                        break;
                    }
                    length--;
                } else if (zM20821O) {
                    i++;
                } else {
                    z = true;
                }
            }
            string = string2.subSequence(i, length + 1).toString();
        }
        if (!(c3261a.get(1) instanceof JsonNull)) {
            AbstractC3262b abstractC3262b = c3261a.get(1);
            abstractC3262b.getClass();
            numM21338e = sf4.m21338e((AbstractC3264d) abstractC3262b);
        }
        return new Pair(string, numM21338e);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f181b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3264d abstractC3264dM21335b;
        Pair pair = (Pair) obj;
        pair.getClass();
        String str = (String) pair.f47623a;
        if (str == null || (abstractC3264dM21335b = sf4.m21335b(str)) == null) {
            abstractC3264dM21335b = JsonNull.INSTANCE;
        }
        Integer num = (Integer) pair.f47624b;
        encoder.mo15617m(C3261a.Companion.serializer(), new C3261a(vz1.m23605K(abstractC3264dM21335b, num != null ? sf4.m21334a(Integer.valueOf(num.intValue())) : JsonNull.INSTANCE)));
    }
}
