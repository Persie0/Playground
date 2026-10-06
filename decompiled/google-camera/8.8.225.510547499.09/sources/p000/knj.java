package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knj {

    /* JADX INFO: renamed from: a */
    public int f36603a;

    /* JADX INFO: renamed from: b */
    public int f36604b;

    /* JADX INFO: renamed from: c */
    public int f36605c;

    /* JADX INFO: renamed from: d */
    public long f36606d;

    /* JADX INFO: renamed from: e */
    public long f36607e;

    /* JADX INFO: renamed from: f */
    public float f36608f;

    /* JADX INFO: renamed from: g */
    public float f36609g;

    /* JADX INFO: renamed from: h */
    public float f36610h;

    public knj() {
        this(0, 0, 0, 0L, 0L, 0.0f, 0.0f, 0.0f);
    }

    public knj(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.f36603a = i;
        this.f36604b = i2;
        this.f36605c = i3;
        this.f36606d = j;
        this.f36607e = j2;
        this.f36608f = f;
        this.f36609g = f2;
        this.f36610h = f3;
    }

    /* JADX INFO: renamed from: a */
    public final void m14598a(knj knjVar) {
        this.f36603a = knjVar.f36603a;
        this.f36604b = knjVar.f36604b;
        this.f36605c = knjVar.f36605c;
        this.f36606d = knjVar.f36606d;
        this.f36607e = knjVar.f36607e;
        this.f36608f = knjVar.f36608f;
        this.f36609g = knjVar.f36609g;
        this.f36610h = knjVar.f36610h;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new knj(this.f36603a, this.f36604b, this.f36605c, this.f36606d, this.f36607e, this.f36608f, this.f36609g, this.f36610h);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof knj)) {
            return false;
        }
        knj knjVar = (knj) obj;
        return this.f36603a == knjVar.f36603a && this.f36604b == knjVar.f36604b && this.f36605c == knjVar.f36605c && this.f36606d == knjVar.f36606d && this.f36607e == knjVar.f36607e && this.f36608f == knjVar.f36608f && this.f36609g == knjVar.f36609g && this.f36610h == knjVar.f36610h;
    }
}
