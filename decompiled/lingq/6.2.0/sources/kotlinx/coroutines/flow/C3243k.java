package kotlinx.coroutines.flow;

import kotlin.collections.builders.ListBuilder;
import p000.C3386nv;
import p000.c83;
import p000.j59;
import p000.m83;
import p000.u91;
import p000.ux5;
import p000.vm9;
import p000.vz1;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3243k implements j59 {

    /* JADX INFO: renamed from: a */
    public final long f48152a;

    /* JADX INFO: renamed from: b */
    public final long f48153b;

    public C3243k(long j, long j2) {
        this.f48152a = j;
        this.f48153b = j2;
        if (j < 0) {
            C3386nv.m17628o("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        C3386nv.m17628o("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // p000.j59
    /* JADX INFO: renamed from: a */
    public final c83 mo14203a(vm9 vm9Var) {
        return AbstractC3224d.m15536o(new m83(AbstractC3224d.m15521C(vm9Var, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(2, null), 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3243k)) {
            return false;
        }
        C3243k c3243k = (C3243k) obj;
        return this.f48152a == c3243k.f48152a && this.f48153b == c3243k.f48153b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48153b) + (Long.hashCode(this.f48152a) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.f48152a;
        if (j > 0) {
            listBuilder.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.f48153b;
        if (j2 < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j2 + "ms");
        }
        return ux5.m22992o(new StringBuilder("SharingStarted.WhileSubscribed("), u91.m22596N0(vz1.m23635i(listBuilder), null, null, null, null, 63), ')');
    }
}
