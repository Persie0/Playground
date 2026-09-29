package p000;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class wgd implements uid {
    @Override // p000.uid
    /* JADX INFO: renamed from: a */
    public final ohd mo14447a(Uri uri) throws zzsi {
        File fileM19856h = qba.m19856h(uri);
        return new ohd(new FileInputStream(fileM19856h), fileM19856h);
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: b */
    public final boolean mo14448b(Uri uri) {
        return qba.m19856h(uri).exists();
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: c */
    public final String mo14449c() {
        return "file";
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: d */
    public final File mo14450d(Uri uri) {
        return qba.m19856h(uri);
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: e */
    public final OutputStream mo14451e(Uri uri) throws zzsi {
        File fileM19856h = qba.m19856h(uri);
        kdd.m15141a(fileM19856h);
        return new rhd(new FileOutputStream(fileM19856h), fileM19856h);
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: f */
    public final void mo14452f(Uri uri) {
        File fileM19856h = qba.m19856h(uri);
        if (fileM19856h.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileM19856h.delete()) {
            return;
        }
        if (!fileM19856h.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: g */
    public final void mo14453g(Uri uri, Uri uri2) {
        File fileM19856h = qba.m19856h(uri);
        File fileM19856h2 = qba.m19856h(uri2);
        kdd.m15141a(fileM19856h2);
        if (!fileM19856h.renameTo(fileM19856h2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
