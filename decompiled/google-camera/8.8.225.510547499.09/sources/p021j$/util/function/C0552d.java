package p021j$.util.function;

import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.function.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0552d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f33251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f33252c;

    public /* synthetic */ C0552d(Function function, Function function2, int i) {
        this.f33250a = i;
        this.f33251b = function;
        this.f33252c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f33250a) {
            case 0:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f33250a;
        Function function = this.f33252c;
        Function function2 = this.f33251b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f33250a) {
            case 0:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
