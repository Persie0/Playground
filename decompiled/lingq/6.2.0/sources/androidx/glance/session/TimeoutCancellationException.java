package androidx.glance.session;

import java.util.concurrent.CancellationException;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final String f6235a;

    /* JADX INFO: renamed from: b */
    public final int f6236b;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.f6235a = str;
        this.f6236b = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6235a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.f6235a);
        sb.append(", ");
        return wq1.m24122r(sb, this.f6236b, ')');
    }
}
