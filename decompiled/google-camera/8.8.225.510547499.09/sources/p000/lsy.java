package p000;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lsy implements lsx {
    /* JADX INFO: renamed from: a */
    protected Uri mo15933a(Uri uri) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    protected abstract lsx mo15934b();

    @Override // p000.lsx
    /* JADX INFO: renamed from: c */
    public /* synthetic */ File mo15935c(Uri uri) {
        throw null;
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: d */
    public InputStream mo15936d(Uri uri) {
        throw null;
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: f */
    public boolean mo15938f(Uri uri) {
        throw null;
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: j */
    public final OutputStream mo15943j(Uri uri) {
        return mo15934b().mo15943j(mo15933a(uri));
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: k */
    public final void mo15944k(Uri uri) {
        mo15934b().mo15944k(mo15933a(uri));
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: l */
    public final void mo15945l(Uri uri, Uri uri2) {
        mo15934b().mo15945l(mo15933a(uri), mo15933a(uri2));
    }
}
