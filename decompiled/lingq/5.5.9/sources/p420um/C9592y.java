package p420um;

import dm.C5207g;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;

/* JADX INFO: renamed from: um.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C9592y implements InterfaceC9591x {

    /* JADX INFO: renamed from: a */
    public final List<C6829c> f49249a;

    /* JADX INFO: renamed from: b */
    public final Set<C6829c> f49250b;

    /* JADX INFO: renamed from: c */
    public final List<C6829c> f49251c;

    /* JADX INFO: renamed from: d */
    public final Set<C6829c> f49252d;

    public C9592y(List list, EmptySet emptySet, EmptyList emptyList, EmptySet emptySet2) {
        C5207g.m11111f(emptyList, "directExpectedByDependencies");
        C5207g.m11111f(emptySet2, "allExpectedByDependencies");
        this.f49249a = list;
        this.f49250b = emptySet;
        this.f49251c = emptyList;
        this.f49252d = emptySet2;
    }

    @Override // p420um.InterfaceC9591x
    /* JADX INFO: renamed from: a */
    public final List<C6829c> mo18054a() {
        return this.f49249a;
    }

    @Override // p420um.InterfaceC9591x
    /* JADX INFO: renamed from: b */
    public final Set<C6829c> mo18055b() {
        return this.f49250b;
    }

    @Override // p420um.InterfaceC9591x
    /* JADX INFO: renamed from: c */
    public final List<C6829c> mo18056c() {
        return this.f49251c;
    }
}
