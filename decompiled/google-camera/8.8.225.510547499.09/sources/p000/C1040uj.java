package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: uj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1040uj {

    /* JADX INFO: renamed from: a */
    public final int f47744a;

    /* JADX INFO: renamed from: b */
    public final C1031ua f47745b;

    /* JADX INFO: renamed from: c */
    public final List f47746c;

    /* JADX INFO: renamed from: d */
    public final Executor f47747d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1014tk f47748e;

    /* JADX INFO: renamed from: f */
    public final int f47749f;

    /* JADX INFO: renamed from: g */
    public final Map f47750g;

    public C1040uj(List list, Executor executor, InterfaceC1014tk interfaceC1014tk, Map map) {
        executor.getClass();
        this.f47744a = 0;
        this.f47745b = null;
        this.f47746c = list;
        this.f47747d = executor;
        this.f47748e = interfaceC1014tk;
        this.f47749f = 1;
        this.f47750g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1040uj)) {
            return false;
        }
        C1040uj c1040uj = (C1040uj) obj;
        int i = c1040uj.f47744a;
        C1031ua c1031ua = c1040uj.f47745b;
        if (!ooc.m18737c(null, null) || !ooc.m18737c(this.f47746c, c1040uj.f47746c) || !ooc.m18737c(this.f47747d, c1040uj.f47747d) || !ooc.m18737c(this.f47748e, c1040uj.f47748e)) {
            return false;
        }
        int i2 = c1040uj.f47749f;
        return ooc.m18737c(this.f47750g, c1040uj.f47750g);
    }

    public final int hashCode() {
        return ((((((this.f47746c.hashCode() * 31) + this.f47747d.hashCode()) * 31) + this.f47748e.hashCode()) * 31) + 1) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=0, inputConfiguration=" + ((Object) null) + ", outputConfigurations=" + this.f47746c + ", executor=" + this.f47747d + ", stateCallback=" + this.f47748e + ", sessionTemplateId=1, sessionParameters=" + this.f47750g + ')';
    }
}
