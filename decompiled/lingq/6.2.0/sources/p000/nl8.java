package p000;

import java.util.LinkedHashMap;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class nl8 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f52923a;

    /* JADX INFO: renamed from: b */
    public final w41 f52924b;

    public nl8() {
        this.f52923a = new LinkedHashMap();
        this.f52924b = new w41(AbstractC3194a.m15360M());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17487a(String str) {
        w41 w41Var = this.f52924b;
        w41Var.getClass();
        return ((LinkedHashMap) w41Var.f66365a).containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public final Object m17488b(String str) {
        Object value;
        w41 w41Var = this.f52924b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) w41Var.f66365a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) w41Var.f66368d;
        try {
            u66 u66Var = (u66) linkedHashMap2.get(str);
            if (u66Var != null && (value = ((C3244l) u66Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) w41Var.f66367c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final c18 m17489c(Object obj, String str) {
        w41 w41Var = this.f52924b;
        boolean zContainsKey = ((LinkedHashMap) w41Var.f66368d).containsKey(str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) w41Var.f66365a;
        if (zContainsKey) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) w41Var.f66368d;
            Object objM17114d = linkedHashMap2.get(str);
            if (objM17114d == null) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, obj);
                }
                objM17114d = AbstractC3352my.m17114d(linkedHashMap.get(str));
                linkedHashMap2.put(str, objM17114d);
            }
            return AbstractC3224d.m15524c((u66) objM17114d);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) w41Var.f66367c;
        Object objM17114d2 = linkedHashMap3.get(str);
        if (objM17114d2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            objM17114d2 = AbstractC3352my.m17114d(linkedHashMap.get(str));
            linkedHashMap3.put(str, objM17114d2);
        }
        return AbstractC3224d.m15524c((u66) objM17114d2);
    }

    /* JADX INFO: renamed from: d */
    public final void m17490d(Object obj, String str) {
        if (!pl8.m19390a(obj)) {
            v63.m23135m("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        Object obj2 = this.f52923a.get(str);
        w56 w56Var = obj2 instanceof w56 ? (w56) obj2 : null;
        if (w56Var != null) {
            w56Var.m23765i(obj);
        }
        this.f52924b.m23713G(obj, str);
    }

    public nl8(MapBuilder mapBuilder) {
        this.f52923a = new LinkedHashMap();
        this.f52924b = new w41(mapBuilder);
    }
}
