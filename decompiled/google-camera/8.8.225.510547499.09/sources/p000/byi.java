package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byi implements bqu {
    @Override // p000.bqf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2915a(Object obj, File file, bqr bqrVar) throws Throwable {
        try {
            cav.m3365d(((byh) ((bsz) obj).mo3016c()).m3189b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // p000.bqu
    /* JADX INFO: renamed from: b */
    public final int mo2932b() {
        return 1;
    }
}
