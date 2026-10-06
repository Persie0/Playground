package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btn implements bts {

    /* JADX INFO: renamed from: a */
    int f4435a;

    /* JADX INFO: renamed from: b */
    public Class f4436b;

    /* JADX INFO: renamed from: c */
    private final bto f4437c;

    public btn(bto btoVar) {
        this.f4437c = btoVar;
    }

    @Override // p000.bts
    /* JADX INFO: renamed from: a */
    public final void mo3054a() {
        this.f4437c.m3041c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btn) {
            btn btnVar = (btn) obj;
            if (this.f4435a == btnVar.f4435a && this.f4436b == btnVar.f4436b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4435a * 31;
        Class cls = this.f4436b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f4435a + "array=" + String.valueOf(this.f4436b) + "}";
    }
}
