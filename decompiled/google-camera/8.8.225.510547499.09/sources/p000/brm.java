package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class brm implements bra {

    /* JADX INFO: renamed from: a */
    private final Uri f4228a;

    /* JADX INFO: renamed from: b */
    private final ContentResolver f4229b;

    /* JADX INFO: renamed from: c */
    private Object f4230c;

    public brm(ContentResolver contentResolver, Uri uri) {
        this.f4229b = contentResolver;
        this.f4228a = uri;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo2935b(Uri uri, ContentResolver contentResolver);

    /* JADX INFO: renamed from: c */
    protected abstract void mo2936c(Object obj);

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        Object obj = this.f4230c;
        if (obj != null) {
            try {
                mo2936c(obj);
            } catch (IOException e) {
            }
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        try {
            Object objMo2935b = mo2935b(this.f4228a, this.f4229b);
            this.f4230c = objMo2935b;
            bqzVar.mo2945b(objMo2935b);
        } catch (FileNotFoundException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}
