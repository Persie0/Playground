package androidx.media3.common;

import java.io.IOException;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f6371a;

    /* JADX INFO: renamed from: b */
    public final int f6372b;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f6371a = z;
        this.f6372b = i;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m2516a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m2517b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f6371a);
        sb.append(", dataType=");
        return wq1.m24123s(sb, this.f6372b, "}");
    }
}
