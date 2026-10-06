package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksy {

    /* JADX INFO: renamed from: a */
    public final int f37145a;

    /* JADX INFO: renamed from: b */
    public final int f37146b;

    /* JADX INFO: renamed from: c */
    public final boolean f37147c;

    /* JADX INFO: renamed from: d */
    public final int f37148d;

    /* JADX INFO: renamed from: e */
    public final Object f37149e;

    public ksy(int i, Integer num, int i2, boolean z, int i3) {
        this.f37145a = i;
        this.f37149e = num;
        this.f37146b = i2;
        this.f37147c = z;
        this.f37148d = i3;
    }

    public ksy(int i, boolean z, String str, int i2, int i3) {
        this.f37146b = i;
        this.f37147c = z;
        this.f37149e = str;
        this.f37145a = i2;
        this.f37148d = i3;
    }

    @Deprecated
    public ksy(Uri uri, int i, int i2, boolean z, int i3) {
        abf.m90c(uri);
        this.f37149e = uri;
        this.f37145a = i;
        this.f37146b = i2;
        this.f37147c = z;
        this.f37148d = i3;
    }
}
