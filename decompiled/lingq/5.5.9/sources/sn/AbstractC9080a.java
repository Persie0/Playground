package sn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* JADX INFO: renamed from: sn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9080a implements Comparable<AbstractC9080a> {
    /* JADX INFO: renamed from: a */
    public abstract DeprecationLevelValue mo17282a();

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC9080a abstractC9080a) {
        AbstractC9080a abstractC9080a2 = abstractC9080a;
        C5207g.m11111f(abstractC9080a2, "other");
        int iCompareTo = mo17282a().compareTo(abstractC9080a2.mo17282a());
        if (iCompareTo == 0) {
            mo17283f();
        }
        return iCompareTo;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo17283f();
}
