package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 {

    /* JADX INFO: renamed from: a */
    public final C3244l f49736a = AbstractC3352my.m17114d(AbstractC3194a.m15360M());

    /* JADX INFO: renamed from: a */
    public final void m16253a(int i) {
        C3244l c3244l;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            c3244l = this.f49736a;
            value = c3244l.getValue();
            Map map = (Map) value;
            Integer num = new Integer(i);
            map.getClass();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(num);
        } while (!c3244l.m15570h(value, AbstractC3194a.m15366S(linkedHashMap)));
    }

    /* JADX INFO: renamed from: b */
    public final void m16254b(InterfaceC3055gy interfaceC3055gy) {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f49736a;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U((Map) value, new Pair(new Integer(interfaceC3055gy.mo3115a()), interfaceC3055gy))));
    }
}
