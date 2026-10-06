package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwr {

    /* JADX INFO: renamed from: a */
    public static final kba f34964a = new gog(14);

    /* JADX INFO: renamed from: a */
    public static jwn m13631a(Collection collection) {
        return new jwm(collection);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: b */
    public static jwn m13632b(jwn... jwnVarArr) {
        ArrayList arrayList = new ArrayList();
        for (jwn jwnVar : jwnVarArr) {
            arrayList.add(jwnVar);
        }
        return m13631a(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static jwn m13633c(Collection collection) {
        return m13640j(m13631a(collection), hnk.f28495h);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: d */
    public static jwn m13634d(jwn... jwnVarArr) {
        return m13633c(Arrays.asList(jwnVarArr));
    }

    /* JADX INFO: renamed from: e */
    public static jwn m13635e(jwn jwnVar, Comparable comparable) {
        return m13640j(jwnVar, new hgv(comparable, 8));
    }

    /* JADX INFO: renamed from: f */
    public static jwn m13636f(Collection collection) {
        lku.m15669w(!collection.isEmpty());
        return m13640j(m13631a(collection), hnk.f28497j);
    }

    /* JADX INFO: renamed from: g */
    public static jwn m13637g(Object obj) {
        return new jwp(obj);
    }

    /* JADX INFO: renamed from: h */
    public static jwn m13638h(Collection collection) {
        lku.m15669w(!collection.isEmpty());
        return m13640j(m13631a(collection), hnk.f28496i);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: i */
    public static jwn m13639i(jwn... jwnVarArr) {
        return m13638h(Arrays.asList(jwnVarArr));
    }

    /* JADX INFO: renamed from: j */
    public static jwn m13640j(jwn jwnVar, mrf mrfVar) {
        return jwj.m13624c(new jwo(jwnVar, mrfVar, jwnVar));
    }

    /* JADX INFO: renamed from: k */
    public static kba m13641k(jwn jwnVar, Runnable runnable, Executor executor) {
        jwnVar.getClass();
        runnable.getClass();
        executor.getClass();
        return jwnVar.mo3830a(new ijp(runnable, 14), executor);
    }

    /* JADX INFO: renamed from: l */
    public static kba m13642l(jwn jwnVar, kbg kbgVar) {
        return jwnVar.mo3830a(kbgVar, kxk.m15033z());
    }
}
