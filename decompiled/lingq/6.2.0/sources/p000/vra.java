package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vra extends csa {

    /* JADX INFO: renamed from: a */
    public final int f65830a;

    /* JADX INFO: renamed from: b */
    public final int f65831b;

    /* JADX INFO: renamed from: c */
    public final boolean f65832c;

    public vra(int i, int i2, boolean z) {
        this.f65830a = i;
        this.f65831b = i2;
        this.f65832c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vra)) {
            return false;
        }
        vra vraVar = (vra) obj;
        return this.f65830a == vraVar.f65830a && this.f65831b == vraVar.f65831b && this.f65832c == vraVar.f65832c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65832c) + wq1.m24106b(this.f65831b, Integer.hashCode(this.f65830a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22994q(this.f65830a, this.f65831b, "LessonEdit(lessonId=", ", sentenceIndex=", ", hasAudio="), this.f65832c, ")");
    }
}
