package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpu {

    /* JADX INFO: renamed from: a */
    public final String f4103a;

    /* JADX INFO: renamed from: b */
    public final long[] f4104b;

    /* JADX INFO: renamed from: c */
    File[] f4105c;

    /* JADX INFO: renamed from: d */
    File[] f4106d;

    /* JADX INFO: renamed from: e */
    public boolean f4107e;

    /* JADX INFO: renamed from: f */
    public bpt f4108f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ bpv f4109g;

    public bpu(bpv bpvVar, String str) {
        this.f4109g = bpvVar;
        this.f4103a = str;
        int i = bpvVar.f4111b;
        this.f4104b = new long[i];
        this.f4105c = new File[i];
        this.f4106d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < bpvVar.f4111b; i2 = 1) {
            sb.append(0);
            this.f4105c[0] = new File(bpvVar.f4110a, sb.toString());
            sb.append(".tmp");
            this.f4106d[0] = new File(bpvVar.f4110a, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final IOException m2881e(String[] strArr) throws IOException {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(strArr))));
    }

    /* JADX INFO: renamed from: a */
    public final String m2882a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.f4104b;
        int length = jArr.length;
        for (int i = 0; i < length; i = 1) {
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public final File m2883c() {
        return this.f4105c[0];
    }

    /* JADX INFO: renamed from: d */
    public final File m2884d() {
        return this.f4106d[0];
    }
}
