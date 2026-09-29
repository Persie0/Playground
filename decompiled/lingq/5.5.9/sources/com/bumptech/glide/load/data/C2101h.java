package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2101h extends AbstractC2095b<AssetFileDescriptor> {
    public C2101h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: a */
    public final Class<AssetFileDescriptor> mo6269a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2095b
    /* JADX INFO: renamed from: c */
    public final void mo6273c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC2095b
    /* JADX INFO: renamed from: f */
    public final AssetFileDescriptor mo6276f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
