package p000;

import com.lingq.core.network.api.result.ResultCard;
import com.lingq.core.network.api.result.ResultCards;
import com.lingq.core.network.api.result.ResultLessonTransliteration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class t88 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final t88 f61987a = new t88();

    /* JADX INFO: renamed from: b */
    public static final je5 f61988b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f61989c;

    static {
        je5 je5VarM22043b = thb.m22043b(l84.f49294a, ResultCard.Companion.serializer());
        f61988b = je5VarM22043b;
        f61989c = je5VarM22043b.f45470c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Map map = (Map) decoder.mo15604w(f61988b);
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            ResultCard resultCard = (ResultCard) entry.getValue();
            String str = resultCard.f20620a;
            String str2 = resultCard.f20622c;
            String str3 = resultCard.f20623d;
            int i = resultCard.f20624e;
            Integer num = resultCard.f20625f;
            String str4 = resultCard.f20626g;
            String str5 = resultCard.f20627h;
            String str6 = resultCard.f20628i;
            String str7 = resultCard.f20629j;
            int i2 = resultCard.f20630k;
            List list = resultCard.f20631l;
            List list2 = resultCard.f20632m;
            Iterator it2 = it;
            List list3 = resultCard.f20633n;
            List list4 = resultCard.f20634o;
            ResultLessonTransliteration resultLessonTransliteration = resultCard.f20635p;
            str.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            arrayList.add(new ResultCard(str, iIntValue, str2, str3, i, num, str4, str5, str6, str7, i2, list, list2, list3, list4, resultLessonTransliteration));
            it = it2;
        }
        return new ResultCards(arrayList);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f61989c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ResultCards resultCards = (ResultCards) obj;
        resultCards.getClass();
        List list = resultCards.f20655a;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((ResultCard) obj2).f20621b), obj2);
        }
        encoder.mo15617m(f61988b, linkedHashMap);
    }
}
