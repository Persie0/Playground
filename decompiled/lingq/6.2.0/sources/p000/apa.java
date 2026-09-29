package p000;

/* JADX INFO: loaded from: classes.dex */
public final class apa {

    /* JADX INFO: renamed from: a */
    public final AbstractC3081hn f7338a;

    /* JADX INFO: renamed from: b */
    public final go2 f7339b;

    public apa(AbstractC3081hn abstractC3081hn, go2 go2Var) {
        this.f7338a = abstractC3081hn;
        this.f7339b = go2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apa)) {
            return false;
        }
        apa apaVar = (apa) obj;
        return fa4.m11650l(this.f7338a, apaVar.f7338a) && fa4.m11650l(this.f7339b, apaVar.f7339b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f7339b.hashCode() + (this.f7338a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f7338a + ", easing=" + this.f7339b + ", arcMode=ArcMode(value=0))";
    }
}
