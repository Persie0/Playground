package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2105l<T> implements InterfaceC2097d<T> {

    /* JADX INFO: renamed from: a */
    public final Uri f10626a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f10627b;

    /* JADX INFO: renamed from: c */
    public T f10628c;

    public AbstractC2105l(ContentResolver contentResolver, Uri uri) {
        this.f10627b = contentResolver;
        this.f10626a = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: b */
    public final void mo6272b() {
        T t10 = this.f10628c;
        if (t10 != null) {
            try {
                mo6270c(t10);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo6270c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: d */
    public final DataSource mo6274d() {
        return DataSource.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: e */
    public final void mo6275e(Priority priority, InterfaceC2097d.a<? super T> aVar) {
        try {
            ?? r10 = (T) mo6271f(this.f10627b, this.f10626a);
            this.f10628c = r10;
            aVar.mo6278f(r10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.mo6277c(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo6271f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;
}
