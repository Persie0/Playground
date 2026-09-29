package p000;

/* JADX INFO: renamed from: di */
/* JADX INFO: loaded from: classes.dex */
public final class C2929di {

    /* JADX INFO: renamed from: a */
    public final float f35666a;

    /* JADX INFO: renamed from: b */
    public final float f35667b;

    public C2929di(float f, float f2) {
        this.f35666a = f;
        this.f35667b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2929di)) {
            return false;
        }
        C2929di c2929di = (C2929di) obj;
        return Float.compare(this.f35666a, c2929di.f35666a) == 0 && Float.compare(this.f35667b, c2929di.f35667b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35667b) + (Float.hashCode(this.f35666a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f35666a);
        sb.append(", velocityCoefficient=");
        return AbstractC3393o1.m17737l(sb, this.f35667b, ')');
    }
}
