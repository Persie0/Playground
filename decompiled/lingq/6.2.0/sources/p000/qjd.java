package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qjd {
    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof qjd);
    }

    public final int hashCode() {
        return -991236229;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(true).length() + 103 + String.valueOf(1).length() + 1);
        sb.append("MLKitLoggingOptions{libraryName=play-services-mlkit-document-scanner, enableFirelog=true, firelogEventType=1}");
        return sb.toString();
    }
}
