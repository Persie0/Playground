package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import ga.C5727j;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: c */
    public final int f11790c;

    /* JADX INFO: renamed from: d */
    public final String f11791d;

    /* JADX INFO: renamed from: e */
    public final int f11792e;

    /* JADX INFO: renamed from: f */
    public final C2416m f11793f;

    /* JADX INFO: renamed from: g */
    public final int f11794g;

    /* JADX INFO: renamed from: h */
    public final C5727j f11795h;

    /* JADX INFO: renamed from: i */
    public final boolean f11796i;

    static {
        C10134c0.m19021F(1001);
        C10134c0.m19021F(1002);
        C10134c0.m19021F(1003);
        C10134c0.m19021F(1004);
        C10134c0.m19021F(1005);
        C10134c0.m19021F(1006);
    }

    public ExoPlaybackException(int i10, Throwable th2, int i11) {
        this(i10, th2, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i10, Throwable th2, int i11, String str, int i12, C2416m c2416m, int i13, boolean z10) {
        String str2;
        if (i10 == 0) {
            str2 = "Source error";
        } else if (i10 != 1) {
            str2 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str2 = str + " error, index=" + i12 + ", format=" + c2416m + ", format_supported=" + C10134c0.m19052s(i13);
        }
        this(TextUtils.isEmpty(null) ? str2 : C0166e.m765k(str2, ": null"), th2, i11, i10, str, i12, c2416m, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public ExoPlaybackException(String str, Throwable th2, int i10, int i11, String str2, int i12, C2416m c2416m, int i13, InterfaceC2492i.b bVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        C10129a.m18990b(!z10 || i11 == 1);
        C10129a.m18990b(th2 != null || i11 == 3);
        this.f11790c = i11;
        this.f11791d = str2;
        this.f11792e = i12;
        this.f11793f = c2416m;
        this.f11794g = i13;
        this.f11795h = bVar;
        this.f11796i = z10;
    }

    /* JADX INFO: renamed from: a */
    public final ExoPlaybackException m6767a(InterfaceC2492i.b bVar) {
        return new ExoPlaybackException(getMessage(), getCause(), this.f11819a, this.f11790c, this.f11791d, this.f11792e, this.f11793f, this.f11794g, bVar, this.f11820b, this.f11796i);
    }
}
