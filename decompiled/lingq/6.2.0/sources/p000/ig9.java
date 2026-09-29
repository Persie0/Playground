package p000;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f44092a = 0;

    static {
        Object failure;
        Object failure2;
        Exception exc = new Exception();
        String simpleName = fcb.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            failure = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.m15355a(failure) != null) {
            failure = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            failure2 = ig9.class.getCanonicalName();
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (Result.m15355a(failure2) != null) {
            failure2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
