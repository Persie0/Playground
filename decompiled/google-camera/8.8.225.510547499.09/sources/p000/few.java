package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class few {

    /* JADX INFO: renamed from: a */
    public final boolean f21586a;

    /* JADX INFO: renamed from: b */
    public final boolean f21587b;

    /* JADX INFO: renamed from: c */
    public final boolean f21588c;

    public few() {
        this.f21586a = false;
        this.f21587b = false;
        this.f21588c = false;
    }

    public few(fev fevVar) {
        float f = (fevVar.f21580c * 360.0f) / fevVar.f21582e;
        this.f21586a = fevVar.f21579b && !fevVar.f21584g && (f >= 70.0f || (((float) fevVar.f21581d) * 180.0f) / ((float) fevVar.f21583f) >= 70.0f);
        this.f21587b = !fevVar.f21584g && f == 360.0f;
        this.f21588c = fevVar.f21585h;
    }
}
