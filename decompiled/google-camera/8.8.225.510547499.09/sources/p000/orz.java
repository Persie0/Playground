package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class orz extends CancellationException implements oql {

    /* JADX INFO: renamed from: a */
    public final transient ory f46474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orz(String str, Throwable th, ory oryVar) {
        super(str);
        oryVar.getClass();
        this.f46474a = oryVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // p000.oql
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo18910a() {
        if (!oqu.f46432a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new orz(message, this, this.f46474a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof orz) {
            orz orzVar = (orz) obj;
            return ooc.m18737c(orzVar.getMessage(), getMessage()) && ooc.m18737c(orzVar.f46474a, this.f46474a) && ooc.m18737c(orzVar.getCause(), getCause());
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (oqu.f46432a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + this.f46474a.hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f46474a;
    }
}
