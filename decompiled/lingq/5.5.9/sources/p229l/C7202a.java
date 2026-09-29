package p229l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7202a<K, V> extends C7203b<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, C7203b.c<K, V>> f40530e = new HashMap<>();

    @Override // p229l.C7203b
    /* JADX INFO: renamed from: a */
    public final C7203b.c<K, V> mo14515a(K k10) {
        return this.f40530e.get(k10);
    }

    @Override // p229l.C7203b
    /* JADX INFO: renamed from: f */
    public final V mo14516f(K k10, V v10) {
        C7203b.c<K, V> cVarMo14515a = mo14515a(k10);
        if (cVarMo14515a != null) {
            return cVarMo14515a.f40536b;
        }
        HashMap<K, C7203b.c<K, V>> map = this.f40530e;
        C7203b.c<K, V> cVar = new C7203b.c<>(k10, v10);
        this.f40534d++;
        C7203b.c<K, V> cVar2 = this.f40532b;
        if (cVar2 == null) {
            this.f40531a = cVar;
            this.f40532b = cVar;
        } else {
            cVar2.f40537c = cVar;
            cVar.f40538d = cVar2;
            this.f40532b = cVar;
        }
        map.put(k10, cVar);
        return null;
    }

    @Override // p229l.C7203b
    /* JADX INFO: renamed from: g */
    public final V mo14517g(K k10) {
        V v10 = (V) super.mo14517g(k10);
        this.f40530e.remove(k10);
        return v10;
    }
}
