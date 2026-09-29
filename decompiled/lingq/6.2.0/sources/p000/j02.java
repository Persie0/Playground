package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface j02 extends h02 {
    /* JADX INFO: renamed from: b */
    long mo10000b(k02 k02Var);

    void close();

    Uri getUri();

    /* JADX INFO: renamed from: h */
    default Map mo10001h() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: l */
    void mo10002l(u52 u52Var);
}
