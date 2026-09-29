package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p479xa.C10129a;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2528b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f13729a;

        /* JADX INFO: renamed from: b */
        public final int f13730b;

        public a(int i10, int i11) {
            this.f13729a = i10;
            this.f13730b = i11;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f13731a;

        /* JADX INFO: renamed from: b */
        public final long f13732b;

        public b(int i10, long j10) {
            C10129a.m18990b(j10 >= 0);
            this.f13731a = i10;
            this.f13732b = j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final IOException f13733a;

        /* JADX INFO: renamed from: b */
        public final int f13734b;

        public c(IOException iOException, int i10) {
            this.f13733a = iOException;
            this.f13734b = i10;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo7472a(c cVar);

    /* JADX INFO: renamed from: b */
    b mo7473b(a aVar, c cVar);

    /* JADX INFO: renamed from: c */
    int mo7474c(int i10);
}
