package kotlin;

/* JADX INFO: renamed from: kotlin.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3193b {
    /* JADX INFO: renamed from: a */
    public static final Result.Failure m15358a(Throwable th) {
        th.getClass();
        return new Result.Failure(th);
    }

    /* JADX INFO: renamed from: b */
    public static final void m15359b(Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f47626a;
        }
    }
}
