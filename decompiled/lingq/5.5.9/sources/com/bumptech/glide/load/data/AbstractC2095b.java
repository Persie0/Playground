package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2095b<T> implements InterfaceC2097d<T> {

    /* JADX INFO: renamed from: a */
    public final String f10605a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f10606b;

    /* JADX INFO: renamed from: c */
    public T f10607c;

    public AbstractC2095b(AssetManager assetManager, String str) {
        this.f10606b = assetManager;
        this.f10605a = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: b */
    public final void mo6272b() {
        T t10 = this.f10607c;
        if (t10 == null) {
            return;
        }
        try {
            mo6273c(t10);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo6273c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: d */
    public final DataSource mo6274d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: e */
    public final void mo6275e(Priority priority, InterfaceC2097d.a<? super T> aVar) {
        try {
            T tMo6276f = mo6276f(this.f10606b, this.f10605a);
            this.f10607c = tMo6276f;
            aVar.mo6278f(tMo6276f);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.mo6277c(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo6276f(AssetManager assetManager, String str) throws IOException;
}
