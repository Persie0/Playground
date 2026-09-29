package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2527a implements InterfaceC2528b {
    @Override // com.google.android.exoplayer2.upstream.InterfaceC2528b
    /* JADX INFO: renamed from: a */
    public final long mo7472a(InterfaceC2528b.c cVar) {
        boolean z10;
        Throwable cause = cVar.f13733a;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i10 = DataSourceException.f13685b;
            while (true) {
                if (cause == null) {
                    z10 = false;
                    break;
                }
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f13686a == 2008) {
                    z10 = true;
                    break;
                }
                cause = cause.getCause();
            }
            if (!z10) {
                return Math.min((cVar.f13734b - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2528b
    /* JADX INFO: renamed from: b */
    public final InterfaceC2528b.b mo7473b(InterfaceC2528b.a aVar, InterfaceC2528b.c cVar) {
        int i10;
        IOException iOException = cVar.f13733a;
        if (!((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i10 = ((HttpDataSource$InvalidResponseCodeException) iOException).f13692d) == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503))) {
            return null;
        }
        if (aVar.f13729a - aVar.f13730b > 1) {
            return new InterfaceC2528b.b(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC2528b
    /* JADX INFO: renamed from: c */
    public final int mo7474c(int i10) {
        return i10 == 7 ? 6 : 3;
    }
}
