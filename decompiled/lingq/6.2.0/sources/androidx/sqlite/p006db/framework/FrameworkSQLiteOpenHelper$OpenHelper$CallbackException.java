package androidx.sqlite.p006db.framework;

/* JADX INFO: loaded from: classes.dex */
final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName f7059a;

    /* JADX INFO: renamed from: b */
    public final Throwable f7060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName, Throwable th) {
        super(th);
        frameworkSQLiteOpenHelper$OpenHelper$CallbackName.getClass();
        this.f7059a = frameworkSQLiteOpenHelper$OpenHelper$CallbackName;
        this.f7060b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f7060b;
    }
}
