package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2106m extends AbstractC2095b<InputStream> {
    public C2106m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: a */
    public final Class<InputStream> mo6269a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2095b
    /* JADX INFO: renamed from: c */
    public final void mo6273c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC2095b
    /* JADX INFO: renamed from: f */
    public final InputStream mo6276f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
