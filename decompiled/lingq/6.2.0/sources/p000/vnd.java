package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vnd {

    /* JADX INFO: renamed from: e */
    public static final tnd f65677e;

    /* JADX INFO: renamed from: f */
    public static final und f65678f;

    /* JADX INFO: renamed from: a */
    public final HashMap f65679a;

    /* JADX INFO: renamed from: b */
    public final HashMap f65680b;

    /* JADX INFO: renamed from: c */
    public final tnd f65681c;

    /* JADX INFO: renamed from: d */
    public und f65682d;

    static {
        int i = 0;
        f65677e = new tnd(i);
        f65678f = new und(i);
    }

    public vnd(vnd vndVar) {
        HashMap map = new HashMap();
        this.f65679a = map;
        HashMap map2 = new HashMap();
        this.f65680b = map2;
        map.putAll(vndVar.f65679a);
        map2.putAll(vndVar.f65680b);
        this.f65681c = vndVar.f65681c;
        this.f65682d = vndVar.f65682d;
    }

    /* JADX INFO: renamed from: a */
    public void m23451a(end endVar, Object obj, qnd qndVar) {
        tnd tndVar = (tnd) this.f65679a.get(endVar);
        if (tndVar != null) {
            tndVar.m22250a(endVar, obj, qndVar);
        } else {
            this.f65681c.m22250a(endVar, obj, qndVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23452b(end endVar, Iterator it, qnd qndVar) {
        und undVar = (und) this.f65680b.get(endVar);
        if (undVar != null) {
            undVar.m22842a(endVar, it, qndVar);
            return;
        }
        und undVar2 = this.f65682d;
        if (undVar2 != null && !this.f65679a.containsKey(endVar)) {
            undVar2.m22842a(endVar, it, qndVar);
        } else {
            while (it.hasNext()) {
                m23451a(endVar, it.next(), qndVar);
            }
        }
    }

    public /* synthetic */ vnd() {
        tnd tndVar = AbstractC3489q9.f57426u;
        this.f65679a = new HashMap();
        this.f65680b = new HashMap();
        this.f65682d = null;
        this.f65681c = tndVar;
    }
}
