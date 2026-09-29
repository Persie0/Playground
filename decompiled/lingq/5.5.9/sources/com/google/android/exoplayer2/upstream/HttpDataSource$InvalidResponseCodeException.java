package com.google.android.exoplayer2.upstream;

import android.support.v4.media.session.C0166e;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d */
    public final int f13692d;

    /* JADX INFO: renamed from: e */
    public final Map<String, List<String>> f13693e;

    public HttpDataSource$InvalidResponseCodeException(int i10, DataSourceException dataSourceException, Map map) {
        super(C0166e.m761g("Response code: ", i10), dataSourceException, 2004);
        this.f13692d = i10;
        this.f13693e = map;
    }
}
