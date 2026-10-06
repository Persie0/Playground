package p000;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gtu implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f26399a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f26400b;

    public /* synthetic */ gtu(long j, int i) {
        this.f26400b = i;
        this.f26399a = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f26400b) {
            case 0:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f26400b) {
            case 0:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f26400b) {
            case 0:
                break;
        }
        return Long.valueOf(Math.min(this.f26399a, TimeUnit.DAYS.toMillis(((Integer) obj).intValue())));
    }
}
