package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1144c<T> {

    /* JADX INFO: renamed from: a */
    public final Executor f7221a;

    /* JADX INFO: renamed from: b */
    public final C1162m.e<T> f7222b;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: b */
        public static final Object f7223b = new Object();

        /* JADX INFO: renamed from: c */
        public static ExecutorService f7224c;

        /* JADX INFO: renamed from: a */
        public Executor f7225a;

        public a(C1162m.e<T> eVar) {
        }
    }

    public C1144c(Executor executor, C1162m.e eVar) {
        this.f7221a = executor;
        this.f7222b = eVar;
    }
}
