package me;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p241le.C7332f;
import p339qe.C8597b;

/* JADX INFO: renamed from: me.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7550h {

    /* JADX INFO: renamed from: a */
    public final C7547e f41648a;

    /* JADX INFO: renamed from: b */
    public final C7332f f41649b;

    /* JADX INFO: renamed from: c */
    public final String f41650c;

    /* JADX INFO: renamed from: d */
    public final a f41651d = new a(false);

    /* JADX INFO: renamed from: e */
    public final a f41652e = new a(true);

    /* JADX INFO: renamed from: f */
    public final AtomicMarkableReference<String> f41653f = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: renamed from: me.h$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final AtomicMarkableReference<C7544b> f41654a;

        public a(boolean z10) {
            new AtomicReference(null);
            this.f41654a = new AtomicMarkableReference<>(new C7544b(z10 ? 8192 : 1024), false);
        }
    }

    public C7550h(String str, C8597b c8597b, C7332f c7332f) {
        this.f41650c = str;
        this.f41648a = new C7547e(c8597b);
        this.f41649b = c7332f;
    }
}
