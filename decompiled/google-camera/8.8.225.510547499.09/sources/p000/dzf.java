package p000;

import android.content.UriMatcher;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12964a;

    public dzf(oju ojuVar) {
        this.f12964a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UriMatcher get() {
        String strM6251a = ((djn) this.f12964a).m6251a();
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(strM6251a, "type/*", 1);
        uriMatcher.addURI(strM6251a, "data/*", 2);
        uriMatcher.addURI(strM6251a, "icon/#/badge", 3);
        uriMatcher.addURI(strM6251a, "icon/#/interact", 4);
        uriMatcher.addURI(strM6251a, "icon/#/dialog", 5);
        uriMatcher.addURI(strM6251a, JrxsYuVZZqnFC.XsStWKJiZ, 6);
        uriMatcher.addURI(strM6251a, "processing", 7);
        uriMatcher.addURI(strM6251a, "processing/#", 8);
        return uriMatcher;
    }
}
