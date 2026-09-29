package p000;

import com.lingq.core.network.api.result.ResultCardChat;
import com.lingq.core.network.api.result.ResultCardsChat;
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
public final class s88 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final s88 f60514a = new s88();

    /* JADX INFO: renamed from: b */
    public static final je5 f60515b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f60516c;

    static {
        je5 je5VarM22043b = thb.m22043b(l84.f49294a, ResultCardChat.Companion.serializer());
        f60515b = je5VarM22043b;
        f60516c = je5VarM22043b.f45470c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Map map = (Map) decoder.mo15604w(f60515b);
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            ResultCardChat resultCardChat = (ResultCardChat) entry.getValue();
            String str = resultCardChat.f20637a;
            String str2 = resultCardChat.f20639c;
            String str3 = resultCardChat.f20640d;
            int i = resultCardChat.f20641e;
            Integer num = resultCardChat.f20642f;
            String str4 = resultCardChat.f20643g;
            String str5 = resultCardChat.f20644h;
            String str6 = resultCardChat.f20645i;
            String str7 = resultCardChat.f20646j;
            int i2 = resultCardChat.f20647k;
            List list = resultCardChat.f20648l;
            List list2 = resultCardChat.f20649m;
            Iterator it2 = it;
            List list3 = resultCardChat.f20650n;
            List list4 = resultCardChat.f20651o;
            str.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            arrayList.add(new ResultCardChat(str, iIntValue, str2, str3, i, num, str4, str5, str6, str7, i2, list, list2, list3, list4));
            it = it2;
        }
        return new ResultCardsChat(arrayList);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f60516c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ResultCardsChat resultCardsChat = (ResultCardsChat) obj;
        resultCardsChat.getClass();
        List list = resultCardsChat.f20657a;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((ResultCardChat) obj2).f20638b), obj2);
        }
        encoder.mo15617m(f60515b, linkedHashMap);
    }
}
