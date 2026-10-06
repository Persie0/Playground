package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsx {

    /* JADX INFO: renamed from: a */
    public final aed f4391a;

    /* JADX INFO: renamed from: b */
    public final List f4392b;

    /* JADX INFO: renamed from: c */
    public final String f4393c;

    public bsx(Class cls, Class cls2, Class cls3, List list, aed aedVar) {
        this.f4391a = aedVar;
        bzq.m3276p(list);
        this.f4392b = list;
        this.f4393c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4392b.toArray()) + "}";
    }
}
