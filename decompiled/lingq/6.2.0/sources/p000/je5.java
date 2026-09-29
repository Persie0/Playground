package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class je5 extends AbstractC3815z {

    /* JADX INFO: renamed from: a */
    public final KSerializer f45468a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f45469b;

    /* JADX INFO: renamed from: c */
    public final ie5 f45470c;

    public je5(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        this.f45468a = kSerializer;
        this.f45469b = kSerializer2;
        this.f45470c = new ie5(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: a */
    public final Object mo11356a() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: b */
    public final int mo11357b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: c */
    public final Iterator mo14415c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        KSerializer kSerializer = this.f45468a;
        ie5 ie5Var = this.f45470c;
        Object objMo4073G = df1Var.mo4073G(ie5Var, i, kSerializer, null);
        int iMo10319A = df1Var.mo10319A(ie5Var);
        if (iMo10319A != i + 1) {
            C3386nv.m17624j(wq1.m24115k("Value must follow key in a map, index for key: ", i, iMo10319A, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo4073G);
        KSerializer kSerializer2 = this.f45469b;
        map.put(objMo4073G, (!zContainsKey || (kSerializer2.getDescriptor().getKind() instanceof ak7)) ? df1Var.mo4073G(ie5Var, iMo10319A, kSerializer2, null) : df1Var.mo4073G(ie5Var, iMo10319A, kSerializer2, AbstractC3194a.m15361N(objMo4073G, map)));
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f45470c;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: h */
    public final Object mo11359h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mo12404d(obj);
        ie5 ie5Var = this.f45470c;
        mk9 mk9VarM15618n = encoder.m15618n(ie5Var);
        Iterator itMo14415c = mo14415c(obj);
        int i = 0;
        while (itMo14415c.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo14415c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            mk9VarM15618n.m16881y(ie5Var, i, this.f45468a, key);
            i += 2;
            mk9VarM15618n.m16881y(ie5Var, i2, this.f45469b, value);
        }
        mk9VarM15618n.m16871A(ie5Var);
    }
}
