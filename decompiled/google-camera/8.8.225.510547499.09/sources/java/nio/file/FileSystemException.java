package java.nio.file;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class FileSystemException extends IOException {

    /* JADX INFO: renamed from: a */
    private final String f33631a;

    /* JADX INFO: renamed from: b */
    private final String f33632b;

    public FileSystemException(String str) {
        super((String) null);
        this.f33631a = str;
        this.f33632b = null;
    }

    public String getFile() {
        return this.f33631a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f33631a == null && this.f33632b == null) {
            return getReason();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f33631a != null) {
            sb.append(this.f33631a);
        }
        if (this.f33632b != null) {
            sb.append(" -> ");
            sb.append(this.f33632b);
        }
        if (getReason() != null) {
            sb.append(": ");
            sb.append(getReason());
        }
        return sb.toString();
    }

    public String getOtherFile() {
        return this.f33632b;
    }

    public String getReason() {
        return super.getMessage();
    }

    public FileSystemException(String str, String str2, String str3) {
        super(str3);
        this.f33631a = str;
        this.f33632b = str2;
    }
}
