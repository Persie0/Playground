package p021j$.util.function;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0556h implements LongUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongUnaryOperator f33261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LongUnaryOperator f33262c;

    public /* synthetic */ C0556h(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int i) {
        this.f33260a = i;
        this.f33261b = longUnaryOperator;
        this.f33262c = longUnaryOperator2;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongUnaryOperator m12583a(LongUnaryOperator longUnaryOperator) {
        switch (this.f33260a) {
            case 0:
                break;
            default:
                break;
        }
        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        int i = this.f33260a;
        LongUnaryOperator longUnaryOperator = this.f33262c;
        LongUnaryOperator longUnaryOperator2 = this.f33261b;
        switch (i) {
            case 0:
                return longUnaryOperator.applyAsLong(longUnaryOperator2.applyAsLong(j));
            default:
                return longUnaryOperator2.applyAsLong(longUnaryOperator.applyAsLong(j));
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LongUnaryOperator m12584c(LongUnaryOperator longUnaryOperator) {
        switch (this.f33260a) {
            case 0:
                break;
            default:
                break;
        }
        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }
}
