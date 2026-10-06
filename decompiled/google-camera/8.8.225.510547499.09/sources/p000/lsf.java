package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsf implements lsx {
    public lsf() {
        new ConcurrentHashMap();
    }

    public lsf(byte[] bArr) {
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: c */
    public final File mo15935c(Uri uri) {
        return lij.m15449s(uri);
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: d */
    public final InputStream mo15936d(Uri uri) throws lsj {
        File fileM15449s = lij.m15449s(uri);
        return new lsm(new FileInputStream(fileM15449s), fileM15449s);
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: e */
    public final String mo15937e() {
        return "file";
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: f */
    public final boolean mo15938f(Uri uri) {
        return lij.m15449s(uri).exists();
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: j */
    public final OutputStream mo15943j(Uri uri) throws IOException {
        File fileM15449s = lij.m15449s(uri);
        nea.m17393g(fileM15449s);
        return new lsn(new FileOutputStream(fileM15449s), fileM15449s);
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: k */
    public final void mo15944k(Uri uri) throws IOException {
        File fileM15449s = lij.m15449s(uri);
        if (fileM15449s.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileM15449s.delete()) {
            return;
        }
        if (!fileM15449s.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: l */
    public final void mo15945l(Uri uri, Uri uri2) throws IOException {
        File fileM15449s = lij.m15449s(uri);
        File fileM15449s2 = lij.m15449s(uri2);
        nea.m17393g(fileM15449s2);
        if (!fileM15449s.renameTo(fileM15449s2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
