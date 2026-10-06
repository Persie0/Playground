package p000;

import java.util.function.BiFunction;
import java.util.function.Function;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ngo extends ngu {

    /* JADX INFO: renamed from: a */
    private final Stream f42225a;

    /* JADX INFO: renamed from: b */
    public final Function f42226b;

    /* JADX INFO: renamed from: c */
    public final Function f42227c;

    public ngo(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.f42225a = stream;
        function.getClass();
        this.f42226b = function;
        function2.getClass();
        this.f42227c = function2;
    }

    @Override // p000.ngu
    /* JADX INFO: renamed from: b */
    public final Stream mo17468b(BiFunction biFunction) {
        Stream stream = this.f42225a;
        biFunction.getClass();
        return stream.map(new gei(this, biFunction, 4));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f42225a.close();
    }
}
