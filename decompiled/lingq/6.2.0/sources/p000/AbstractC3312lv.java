package p000;

import kotlin.Result;

/* JADX INFO: renamed from: lv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3312lv {

    /* JADX INFO: renamed from: a */
    public static final int f50166a;

    static {
        Object failure;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            failure = property != null ? cl9.m4844a0(property) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
        f50166a = num != null ? num.intValue() : 2097152;
    }
}
