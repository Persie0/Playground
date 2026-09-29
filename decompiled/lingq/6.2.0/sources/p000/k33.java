package p000;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.File;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class k33 implements a33 {

    /* JADX INFO: renamed from: a */
    public final File f46616a;

    public k33(File file) {
        this.f46616a = file;
    }

    @Override // p000.a33
    /* JADX INFO: renamed from: a */
    public final Object mo57a(Continuation continuation) {
        String str = d57.f35013b;
        File file = this.f46616a;
        return new ee9(new n33(gz8.m12977i(file), u33.f63345a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(v33.m23078T(file)), DataSource.DISK);
    }
}
