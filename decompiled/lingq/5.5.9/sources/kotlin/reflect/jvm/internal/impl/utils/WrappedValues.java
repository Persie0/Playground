package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class WrappedValues {

    /* JADX INFO: renamed from: a */
    public static final C7069a f39952a = new C7069a();

    public static class WrappedProcessCanceledException extends RuntimeException {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public WrappedProcessCanceledException() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    public static class C7069a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    public static final class C7070b {

        /* JADX INFO: renamed from: a */
        public final Throwable f39953a;

        public C7070b(Throwable th2) {
            this.f39953a = th2;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14245a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public final String toString() {
            return this.f39953a.toString();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m14244a(Object obj) throws Throwable {
        if (obj instanceof C7070b) {
            Throwable th2 = ((C7070b) obj).f39953a;
            if (th2 != null) {
                throw th2;
            }
            C7070b.m14245a(1);
            throw null;
        }
    }
}
