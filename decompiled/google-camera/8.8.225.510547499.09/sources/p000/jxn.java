package p000;

import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxn {
    FPS_AUTO(30, 30, 60),
    f35050b(24, 24, 24),
    FPS_30(30, 30, 30),
    FPS_60(60, 60, 60),
    FPS_60C_24E(60, 24, 60),
    f35054f(60, 30, 60),
    FPS_120_HFR_4X(120, 30, 120),
    FPS_240_HFR_8X(240, 30, 240);


    /* JADX INFO: renamed from: i */
    public final int f35058i;

    /* JADX INFO: renamed from: j */
    public final int f35059j;

    /* JADX INFO: renamed from: k */
    public final int f35060k;

    jxn(int i, int i2, int i3) {
        this.f35058i = i;
        this.f35059j = i2;
        this.f35060k = i3;
    }

    /* JADX INFO: renamed from: c */
    public static Collection m13654c() {
        LinkedList linkedList = new LinkedList();
        for (jxn jxnVar : values()) {
            if (jxnVar.m13657e()) {
                linkedList.add(jxnVar);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: a */
    public final int m13655a() {
        return this.f35058i / this.f35059j;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13656d() {
        return this == FPS_60C_24E || this == f35054f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13657e() {
        return this.f35058i > 60;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13658f() {
        return this.f35058i <= 60;
    }
}
