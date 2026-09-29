package p000;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gs1 {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f41257a;

    /* JADX INFO: renamed from: b */
    public final long f41258b;

    /* JADX INFO: renamed from: c */
    public final long f41259c;

    /* JADX INFO: renamed from: d */
    public final long f41260d;

    public gs1(long j, long j2, List list) {
        this.f41257a = ImmutableList.m6287r(list);
        this.f41258b = j;
        this.f41259c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f41260d = j3;
    }
}
