package androidx.media3.datasource;

import java.util.Map;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: c */
    public final int f6438c;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(ux5.m22988k(i, "Response code: "), dataSourceException, 2004);
        this.f6438c = i;
    }
}
