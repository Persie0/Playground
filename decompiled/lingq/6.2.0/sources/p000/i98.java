package p000;

import com.lingq.core.network.api.result.ResultTokenReadings;
import com.lingq.core.network.api.result.ResultWord;
import com.lingq.core.network.api.result.ResultWords;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class i98 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final i98 f43744a = new i98();

    /* JADX INFO: renamed from: b */
    public static final je5 f43745b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f43746c;

    static {
        je5 je5VarM22043b = thb.m22043b(l84.f49294a, ResultWord.Companion.serializer());
        f43745b = je5VarM22043b;
        f43746c = je5VarM22043b.f45470c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Map map = (Map) decoder.mo15604w(f43745b);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            ResultWord resultWord = (ResultWord) entry.getValue();
            String str = resultWord.f21725a;
            String str2 = resultWord.f21727c;
            int i = resultWord.f21728d;
            boolean z = resultWord.f21729e;
            List list = resultWord.f21730f;
            List list2 = resultWord.f21731g;
            int i2 = resultWord.f21732h;
            ResultTokenReadings resultTokenReadings = resultWord.f21733i;
            list.getClass();
            list2.getClass();
            arrayList.add(new ResultWord(str, iIntValue, str2, i, z, list, list2, i2, resultTokenReadings));
        }
        return new ResultWords(arrayList);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f43746c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ResultWords resultWords = (ResultWords) obj;
        resultWords.getClass();
        List list = resultWords.f21735a;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((ResultWord) obj2).f21726b), obj2);
        }
        encoder.mo15617m(f43745b, linkedHashMap);
    }
}
