package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f14 {

    /* JADX INFO: renamed from: a */
    public final Object f38236a;

    /* JADX INFO: renamed from: b */
    public final Object f38237b;

    /* JADX INFO: renamed from: c */
    public final Object f38238c;

    public f14(Object obj, Object obj2, Object obj3) {
        this.f38236a = obj;
        this.f38237b = obj2;
        this.f38238c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m11495a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f38236a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f38237b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f38238c);
        return new IllegalArgumentException(sb.toString());
    }
}
