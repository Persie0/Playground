package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C0713b;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import p000.bna;
import p000.jv5;
import p000.uma;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: c */
    public final int f6439c;

    /* JADX INFO: renamed from: d */
    public final String f6440d;

    /* JADX INFO: renamed from: e */
    public final int f6441e;

    /* JADX INFO: renamed from: f */
    public final C0713b f6442f;

    /* JADX INFO: renamed from: g */
    public final int f6443g;

    /* JADX INFO: renamed from: h */
    public final jv5 f6444h;

    /* JADX INFO: renamed from: i */
    public final boolean f6445i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, C0713b c0713b, int i4, jv5 jv5Var, boolean z) {
        String str2;
        int i5;
        C0713b c0713b2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            c0713b2 = c0713b;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            c0713b2 = c0713b;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            c0713b2 = c0713b;
            sb.append(c0713b2);
            sb.append(", format_supported=");
            sb.append(uma.m22823r(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, c0713b2, i4, jv5Var, SystemClock.elapsedRealtime(), z);
    }

    /* JADX INFO: renamed from: c */
    public static ExoPlaybackException m2526c(Exception exc, String str, int i, C0713b c0713b, int i2, jv5 jv5Var, boolean z, int i3) {
        if (c0713b == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, exc, i3, str, i, c0713b, i2, jv5Var, z);
    }

    /* JADX INFO: renamed from: d */
    public static ExoPlaybackException m2527d(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    /* JADX INFO: renamed from: e */
    public static ExoPlaybackException m2528e(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    /* JADX INFO: renamed from: b */
    public final ExoPlaybackException m2529b(jv5 jv5Var) {
        String message = getMessage();
        String str = uma.f64080a;
        return new ExoPlaybackException(message, getCause(), this.f6373a, this.f6439c, this.f6440d, this.f6441e, this.f6442f, this.f6443g, jv5Var, this.f6374b, this.f6445i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, C0713b c0713b, int i4, jv5 jv5Var, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        bna.m3969q(!z || i2 == 1);
        bna.m3969q(th != null || i2 == 3);
        this.f6439c = i2;
        this.f6440d = str2;
        this.f6441e = i3;
        this.f6442f = c0713b;
        this.f6443g = i4;
        this.f6444h = jv5Var;
        this.f6445i = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
