package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: a */
    public final int f6436a;

    public DataSourceException(int i) {
        this.f6436a = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.f6436a = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.f6436a = i;
    }
}
