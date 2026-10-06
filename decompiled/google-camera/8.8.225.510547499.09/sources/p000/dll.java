package p000;

import java.util.Map;
import java.util.function.Predicate;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dll implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f11947a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f11948b;

    public /* synthetic */ dll(long j, int i) {
        this.f11948b = i;
        this.f11947a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f11948b) {
            case 0:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f11948b) {
            case 0:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ Predicate m6341or(Predicate predicate) {
        switch (this.f11948b) {
            case 0:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f11948b) {
            case 0:
                long j = this.f11947a;
                int i = dlp.f11968j;
                return ((Long) obj).longValue() < j;
            default:
                return this.f11947a - ((Long) ((Map.Entry) obj).getValue()).longValue() > 3000;
        }
    }
}
