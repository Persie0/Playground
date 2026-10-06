package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqp {

    /* JADX INFO: renamed from: a */
    public final kqc f36906a;

    /* JADX INFO: renamed from: b */
    public final Set f36907b;

    /* JADX INFO: renamed from: c */
    public final Set f36908c;

    /* JADX INFO: renamed from: d */
    public final Set f36909d;

    /* JADX INFO: renamed from: e */
    public final kql f36910e;

    /* JADX INFO: renamed from: f */
    public final mws f36911f;

    public kqp() {
    }

    public kqp(kqc kqcVar, Set set, Set set2, Set set3, kql kqlVar, mws mwsVar) {
        this.f36906a = kqcVar;
        this.f36907b = set;
        this.f36908c = set2;
        this.f36909d = set3;
        this.f36910e = kqlVar;
        this.f36911f = mwsVar;
    }

    /* JADX INFO: renamed from: a */
    public static kqo m14714a() {
        return new kqo();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kqp)) {
            return false;
        }
        kqp kqpVar = (kqp) obj;
        kqc kqcVar = this.f36906a;
        if (kqcVar != null ? kqcVar.equals(kqpVar.f36906a) : kqpVar.f36906a == null) {
            if (this.f36907b.equals(kqpVar.f36907b) && this.f36908c.equals(kqpVar.f36908c) && this.f36909d.equals(kqpVar.f36909d) && this.f36910e.equals(kqpVar.f36910e) && mkv.m16505M(this.f36911f, kqpVar.f36911f)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "PublishInfo{primaryMediaFile=" + String.valueOf(this.f36906a) + ", publicMediaFiles=" + String.valueOf(this.f36907b) + ", privateMediaFiles=" + String.valueOf(this.f36908c) + ", cachedMediaFiles=" + String.valueOf(this.f36909d) + ", mediaGroupInfoBuilder=" + String.valueOf(this.f36910e) + ", listeners=" + String.valueOf(this.f36911f) + "}";
    }

    public final int hashCode() {
        kqc kqcVar = this.f36906a;
        return (((((((((((kqcVar == null ? 0 : kqcVar.hashCode()) ^ 1000003) * 1000003) ^ this.f36907b.hashCode()) * 1000003) ^ this.f36908c.hashCode()) * 1000003) ^ this.f36909d.hashCode()) * 1000003) ^ this.f36910e.hashCode()) * 1000003) ^ this.f36911f.hashCode();
    }
}
