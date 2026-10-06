package p000;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lno {

    /* JADX INFO: renamed from: a */
    public final float f38766a;

    /* JADX INFO: renamed from: b */
    public final Random f38767b;

    public lno(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        lku.m15670x(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.f38766a = f;
        this.f38767b = random;
    }
}
