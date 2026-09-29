package om;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import mn.C7645b;
import mn.C7646c;
import tl.C9325m;

/* JADX INFO: renamed from: om.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8085b {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f43903a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(set, 10));
        for (PrimitiveType primitiveType : set) {
            C5207g.m11111f(primitiveType, "primitiveType");
            arrayList.add(C6797e.f38344j.m15215c(primitiveType.getTypeName()));
        }
        C7646c c7646cM15229h = C6797e.a.f38383f.m15229h();
        C5207g.m11110e(c7646cM15229h, "string.toSafe()");
        ArrayList arrayListM13439g0 = C6752c.m13439g0(c7646cM15229h, arrayList);
        C7646c c7646cM15229h2 = C6797e.a.f38385h.m15229h();
        C5207g.m11110e(c7646cM15229h2, "_boolean.toSafe()");
        ArrayList arrayListM13439g1 = C6752c.m13439g0(c7646cM15229h2, arrayListM13439g0);
        C7646c c7646cM15229h3 = C6797e.a.f38387j.m15229h();
        C5207g.m11110e(c7646cM15229h3, "_enum.toSafe()");
        ArrayList arrayListM13439g2 = C6752c.m13439g0(c7646cM15229h3, arrayListM13439g1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListM13439g2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C7645b.m15203l((C7646c) it.next()));
        }
        f43903a = linkedHashSet;
    }
}
