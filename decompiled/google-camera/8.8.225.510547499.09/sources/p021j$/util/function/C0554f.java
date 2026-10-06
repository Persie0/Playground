package p021j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0554f implements IntUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntUnaryOperator f33256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntUnaryOperator f33257c;

    public /* synthetic */ C0554f(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i) {
        this.f33255a = i;
        this.f33256b = intUnaryOperator;
        this.f33257c = intUnaryOperator2;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntUnaryOperator m12581a(IntUnaryOperator intUnaryOperator) {
        switch (this.f33255a) {
            case 0:
                break;
            default:
                break;
        }
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        int i2 = this.f33255a;
        IntUnaryOperator intUnaryOperator = this.f33256b;
        IntUnaryOperator intUnaryOperator2 = this.f33257c;
        switch (i2) {
            case 0:
                return intUnaryOperator.applyAsInt(intUnaryOperator2.applyAsInt(i));
            default:
                return intUnaryOperator2.applyAsInt(intUnaryOperator.applyAsInt(i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntUnaryOperator m12582c(IntUnaryOperator intUnaryOperator) {
        switch (this.f33255a) {
            case 0:
                break;
            default:
                break;
        }
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
