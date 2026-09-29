package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class c66 {

    /* JADX INFO: renamed from: b */
    public static final c66 f9634b = new c66();

    /* JADX INFO: renamed from: c */
    public static final b66 f9635c = new b66();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9636a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public static c66 m4342b() {
        return f9634b;
    }

    /* JADX INFO: renamed from: a */
    public final b66 m4343a() {
        b66 b66Var = (b66) this.f9636a.get();
        return b66Var == null ? f9635c : b66Var;
    }
}
