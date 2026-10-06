package p000;

import java.util.Map;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ngl implements Function {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ngl f42222a = new ngl();

    private /* synthetic */ ngl() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
