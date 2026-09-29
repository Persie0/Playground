package com.google.android.exoplayer2.audio;

import androidx.activity.result.C0204c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f11835a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(C2354a c2354a) {
            super("Unhandled format: " + c2354a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioProcessor$a */
    public static final class C2354a {

        /* JADX INFO: renamed from: e */
        public static final C2354a f11836e = new C2354a(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f11837a;

        /* JADX INFO: renamed from: b */
        public final int f11838b;

        /* JADX INFO: renamed from: c */
        public final int f11839c;

        /* JADX INFO: renamed from: d */
        public final int f11840d;

        public C2354a(int i10, int i11, int i12) {
            this.f11837a = i10;
            this.f11838b = i11;
            this.f11839c = i12;
            this.f11840d = C10134c0.m19022G(i12) ? C10134c0.m19055v(i12, i11) : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2354a)) {
                return false;
            }
            C2354a c2354a = (C2354a) obj;
            return this.f11837a == c2354a.f11837a && this.f11838b == c2354a.f11838b && this.f11839c == c2354a.f11839c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11837a), Integer.valueOf(this.f11838b), Integer.valueOf(this.f11839c)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f11837a);
            sb2.append(", channelCount=");
            sb2.append(this.f11838b);
            sb2.append(", encoding=");
            return C0204c.m853l(sb2, this.f11839c, ']');
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo6787b();

    /* JADX INFO: renamed from: c */
    void mo6788c();

    /* JADX INFO: renamed from: d */
    boolean mo6789d();

    /* JADX INFO: renamed from: e */
    ByteBuffer mo6790e();

    /* JADX INFO: renamed from: f */
    void mo6791f(ByteBuffer byteBuffer);

    void flush();

    /* JADX INFO: renamed from: g */
    C2354a mo6792g(C2354a c2354a) throws UnhandledAudioFormatException;

    /* JADX INFO: renamed from: h */
    void mo6793h();
}
