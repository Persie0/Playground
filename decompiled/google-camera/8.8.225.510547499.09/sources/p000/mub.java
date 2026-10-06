package p000;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p021j$.util.function.BiFunction$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mub implements BinaryOperator {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f41625d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ mub f41624c = new mub(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mub f41623b = new mub(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mub f41622a = new mub(0);

    private /* synthetic */ mub(int i) {
        this.f41625d = i;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f41625d) {
            case 0:
                mwn mwnVar = (mwn) obj;
                mwn mwnVar2 = (mwn) obj2;
                mwnVar.m17070b(mwnVar2.f41724a, mwnVar2.f41725b);
                return mwnVar;
            case 1:
                lyz lyzVar = (lyz) obj;
                Iterator it = ((lyz) obj2).f39584a.iterator();
                while (it.hasNext()) {
                    lyzVar.m16214c((mzj) it.next());
                }
                return lyzVar;
            default:
                mxi mxiVar = (mxi) obj;
                mxiVar.m17130i((mxi) obj2);
                return mxiVar;
        }
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f41625d) {
            case 0:
                break;
            case 1:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }
}
