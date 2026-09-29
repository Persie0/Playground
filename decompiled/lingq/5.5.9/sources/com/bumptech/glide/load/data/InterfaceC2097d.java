package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2097d<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.d$a */
    public interface a<T> {
        /* JADX INFO: renamed from: c */
        void mo6277c(Exception exc);

        /* JADX INFO: renamed from: f */
        void mo6278f(T t10);
    }

    /* JADX INFO: renamed from: a */
    Class<T> mo6269a();

    /* JADX INFO: renamed from: b */
    void mo6272b();

    void cancel();

    /* JADX INFO: renamed from: d */
    DataSource mo6274d();

    /* JADX INFO: renamed from: e */
    void mo6275e(Priority priority, a<? super T> aVar);
}
