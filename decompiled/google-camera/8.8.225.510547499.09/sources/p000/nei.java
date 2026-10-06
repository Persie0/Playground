package p000;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nei {

    /* JADX INFO: renamed from: a */
    public static final Comparator f42106a = new ned(0);

    /* JADX INFO: renamed from: b */
    public static final nei f42107b = new nei(new neg(Collections.emptyList()));

    /* JADX INFO: renamed from: c */
    public final neg f42108c;

    public nei(neg negVar) {
        this.f42108c = negVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17416a() {
        return this.f42108c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nei) && ((nei) obj).f42108c.equals(this.f42108c);
    }

    public final int hashCode() {
        return this.f42108c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.f42108c.toString();
    }
}
