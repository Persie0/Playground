package p021j$.time.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p021j$.desugar.sun.nio.p023fs.AbstractC0293g;
import p021j$.time.C0461i;
import p021j$.time.C0468p;
import p021j$.time.Duration;

/* JADX INFO: renamed from: j$.time.zone.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0491a implements Comparable, Serializable {

    /* JADX INFO: renamed from: a */
    private final long f33089a;

    /* JADX INFO: renamed from: b */
    private final C0461i f33090b;

    /* JADX INFO: renamed from: c */
    private final C0468p f33091c;

    /* JADX INFO: renamed from: d */
    private final C0468p f33092d;

    C0491a(long j, C0468p c0468p, C0468p c0468p2) {
        this.f33089a = j;
        this.f33090b = C0461i.m12348G(j, 0, c0468p);
        this.f33091c = c0468p;
        this.f33092d = c0468p2;
    }

    /* JADX INFO: renamed from: a */
    public final C0461i m12476a() {
        return this.f33090b.m12357I(this.f33092d.m12402z() - this.f33091c.m12402z());
    }

    /* JADX INFO: renamed from: c */
    public final C0461i m12477c() {
        return this.f33090b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (this.f33089a > ((C0491a) obj).f33089a ? 1 : (this.f33089a == ((C0491a) obj).f33089a ? 0 : -1));
    }

    /* JADX INFO: renamed from: e */
    public final Duration m12478e() {
        return Duration.ofSeconds(this.f33092d.m12402z() - this.f33091c.m12402z());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0491a)) {
            return false;
        }
        C0491a c0491a = (C0491a) obj;
        return this.f33089a == c0491a.f33089a && this.f33091c.equals(c0491a.f33091c) && this.f33092d.equals(c0491a.f33092d);
    }

    /* JADX INFO: renamed from: f */
    public final C0468p m12479f() {
        return this.f33092d;
    }

    /* JADX INFO: renamed from: h */
    public final C0468p m12480h() {
        return this.f33091c;
    }

    public final int hashCode() {
        return (this.f33090b.hashCode() ^ this.f33091c.hashCode()) ^ Integer.rotateLeft(this.f33092d.hashCode(), 16);
    }

    /* JADX INFO: renamed from: i */
    final List m12481i() {
        return m12482j() ? Collections.emptyList() : AbstractC0293g.m11979b(new Object[]{this.f33091c, this.f33092d});
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12482j() {
        return this.f33092d.m12402z() > this.f33091c.m12402z();
    }

    /* JADX INFO: renamed from: k */
    public final long m12483k() {
        return this.f33089a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m12482j() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f33090b);
        sb.append(this.f33091c);
        sb.append(" to ");
        sb.append(this.f33092d);
        sb.append(']');
        return sb.toString();
    }

    C0491a(C0461i c0461i, C0468p c0468p, C0468p c0468p2) {
        this.f33089a = c0461i.m12358K(c0468p);
        this.f33090b = c0461i;
        this.f33091c = c0468p;
        this.f33092d = c0468p2;
    }
}
