package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p000.fa4;
import p000.wl6;

/* JADX INFO: loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient C3213d f47751a;

    public JobCancellationException(String str, Throwable th, C3213d c3213d) {
        super(str);
        this.f47751a = c3213d;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!fa4.m11650l(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.f47751a;
        if (obj2 == null) {
            obj2 = wl6.f67013b;
        }
        Object obj3 = this.f47751a;
        if (obj3 == null) {
            obj3 = wl6.f67013b;
        }
        return fa4.m11650l(obj2, obj3) && fa4.m11650l(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f47751a;
        if (obj == null) {
            obj = wl6.f67013b;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f47751a;
        if (obj == null) {
            obj = wl6.f67013b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
