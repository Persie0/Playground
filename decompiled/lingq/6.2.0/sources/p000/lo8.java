package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class lo8 extends AbstractC3168k1 {

    /* JADX INFO: renamed from: a */
    public final z21 f49940a;

    /* JADX INFO: renamed from: b */
    public final List f49941b;

    /* JADX INFO: renamed from: c */
    public final cs4 f49942c;

    /* JADX INFO: renamed from: d */
    public final Map f49943d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f49944e;

    public lo8(String str, z21 z21Var, z21[] z21VarArr, KSerializer[] kSerializerArr) {
        this.f49940a = z21Var;
        this.f49941b = EmptyList.f47638a;
        this.f49942c = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new a45(19, str, this));
        if (z21VarArr.length != kSerializerArr.length) {
            v63.m23144v("All subclasses of sealed class ", z21Var.m25414c(), " should be marked @Serializable");
            throw null;
        }
        int iMin = Math.min(z21VarArr.length, kSerializerArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(z21VarArr[i], kSerializerArr[i]));
        }
        Map mapM15370W = AbstractC3194a.m15370W(arrayList);
        this.f49943d = mapM15370W;
        Set<Map.Entry> setEntrySet = mapM15370W.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strMo3694a = ((KSerializer) entry.getValue()).getDescriptor().mo3694a();
            Object obj = linkedHashMap.get(strMo3694a);
            if (obj == null) {
                linkedHashMap.containsKey(strMo3694a);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.f49940a);
                sb.append("' have the same serial name '");
                sb.append(strMo3694a);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strMo3694a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC3194a.m15363P(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f49944e = linkedHashMap2;
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: a */
    public final KSerializer mo14763a(df1 df1Var, String str) {
        KSerializer kSerializer = (KSerializer) this.f49944e.get(str);
        return kSerializer != null ? kSerializer : super.mo14763a(df1Var, str);
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: b */
    public final KSerializer mo14764b(Encoder encoder, Object obj) {
        obj.getClass();
        KSerializer kSerializer = (KSerializer) this.f49943d.get(y38.m24933a(obj.getClass()));
        KSerializer kSerializerMo14764b = kSerializer != null ? kSerializer : super.mo14764b(encoder, obj);
        if (kSerializerMo14764b != null) {
            return kSerializerMo14764b;
        }
        return null;
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: c */
    public final z21 mo14765c() {
        return this.f49940a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f49942c.getValue();
    }

    public lo8(String str, z21 z21Var, z21[] z21VarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, z21Var, z21VarArr, kSerializerArr);
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f49941b = listAsList;
    }
}
