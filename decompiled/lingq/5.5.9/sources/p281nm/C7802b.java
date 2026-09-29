package p281nm;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import mn.C7645b;
import mn.C7646c;
import p385sf.C9000b;
import zm.C10534s;

/* JADX INFO: renamed from: nm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7802b {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f42880a;

    /* JADX INFO: renamed from: b */
    public static final C7645b f42881b;

    static {
        List listM17252r = C9000b.m17252r(C10534s.f52534a, C10534s.f52541h, C10534s.f52542i, C10534s.f52536c, C10534s.f52537d, C10534s.f52539f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM17252r.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C7645b.m15203l((C7646c) it.next()));
        }
        f42880a = linkedHashSet;
        f42881b = C7645b.m15203l(C10534s.f52540g);
    }
}
