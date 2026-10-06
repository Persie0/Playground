package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqf {

    /* JADX INFO: renamed from: a */
    public final Object f46416a;

    /* JADX INFO: renamed from: b */
    public final opv f46417b;

    /* JADX INFO: renamed from: c */
    public final oni f46418c;

    /* JADX INFO: renamed from: d */
    public final Object f46419d;

    /* JADX INFO: renamed from: e */
    public final Throwable f46420e;

    public oqf(Object obj, opv opvVar, oni oniVar, Throwable th) {
        this.f46416a = obj;
        this.f46417b = opvVar;
        this.f46418c = oniVar;
        this.f46419d = null;
        this.f46420e = th;
    }

    public /* synthetic */ oqf(Object obj, opv opvVar, oni oniVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : opvVar, (i & 4) != 0 ? null : oniVar, (i & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ oqf m18905b(oqf oqfVar, opv opvVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? oqfVar.f46416a : null;
        if ((i & 2) != 0) {
            opvVar = oqfVar.f46417b;
        }
        oni oniVar = (i & 4) != 0 ? oqfVar.f46418c : null;
        if ((i & 8) != 0) {
            Object obj2 = oqfVar.f46419d;
        }
        if ((i & 16) != 0) {
            th = oqfVar.f46420e;
        }
        return new oqf(obj, opvVar, oniVar, th);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18906a() {
        return this.f46420e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf)) {
            return false;
        }
        oqf oqfVar = (oqf) obj;
        if (!ooc.m18737c(this.f46416a, oqfVar.f46416a) || !ooc.m18737c(this.f46417b, oqfVar.f46417b) || !ooc.m18737c(this.f46418c, oqfVar.f46418c)) {
            return false;
        }
        Object obj2 = oqfVar.f46419d;
        return ooc.m18737c(null, null) && ooc.m18737c(this.f46420e, oqfVar.f46420e);
    }

    public final int hashCode() {
        Object obj = this.f46416a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        opv opvVar = this.f46417b;
        int iHashCode2 = opvVar == null ? 0 : opvVar.hashCode();
        int i = iHashCode * 31;
        oni oniVar = this.f46418c;
        int iHashCode3 = oniVar == null ? 0 : oniVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.f46420e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f46416a + ", cancelHandler=" + this.f46417b + ", onCancellation=" + this.f46418c + ", idempotentResume=" + ((Object) null) + ", cancelCause=" + this.f46420e + ")";
    }
}
