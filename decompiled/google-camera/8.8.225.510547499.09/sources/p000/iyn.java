package p000;

import android.content.res.TypedArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyn {

    /* JADX INFO: renamed from: a */
    public final int[] f32662a;

    /* JADX INFO: renamed from: c */
    public boolean f32664c = false;

    /* JADX INFO: renamed from: b */
    public final int[] f32663b = new int[12];

    public iyn(int[] iArr) {
        this.f32662a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m11907a(TypedArray typedArray, int i) {
        return typedArray.hasValue(i) && typedArray.getType(i) != 2;
    }
}
