package p000;

import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgo implements kew {

    /* JADX INFO: renamed from: a */
    static final Integer f35930a = -1;

    /* JADX INFO: renamed from: b */
    public static final MeteringRectangle[] f35931b = new MeteringRectangle[0];

    /* JADX INFO: renamed from: c */
    public Integer f35932c;

    /* JADX INFO: renamed from: d */
    public Integer f35933d;

    /* JADX INFO: renamed from: e */
    public Integer f35934e;

    /* JADX INFO: renamed from: f */
    public Integer f35935f;

    /* JADX INFO: renamed from: g */
    public Integer f35936g;

    /* JADX INFO: renamed from: h */
    public MeteringRectangle[] f35937h;

    /* JADX INFO: renamed from: i */
    public MeteringRectangle[] f35938i;

    /* JADX INFO: renamed from: j */
    public MeteringRectangle[] f35939j;

    private kgo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.f35932c = num;
        this.f35933d = num2;
        this.f35934e = num3;
        this.f35935f = num4;
        this.f35936g = num5;
        this.f35937h = meteringRectangleArr;
        this.f35938i = meteringRectangleArr2;
        this.f35939j = meteringRectangleArr3;
    }

    /* JADX INFO: renamed from: b */
    static kgo m14209b() {
        Integer num = f35930a;
        MeteringRectangle[] meteringRectangleArr = f35931b;
        return new kgo(num, num, num, num, num, meteringRectangleArr, meteringRectangleArr, meteringRectangleArr);
    }

    @Override // p000.kew
    /* JADX INFO: renamed from: a */
    public final kex mo14090a() {
        return new kgn(this);
    }
}
