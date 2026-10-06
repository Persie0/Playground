package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nre {

    /* JADX INFO: renamed from: a */
    public static final nre f44161a;

    /* JADX INFO: renamed from: b */
    public static final nre f44162b;

    /* JADX INFO: renamed from: c */
    public static final nre f44163c;

    /* JADX INFO: renamed from: d */
    public static final nre f44164d;

    /* JADX INFO: renamed from: e */
    public static final nre f44165e;

    /* JADX INFO: renamed from: f */
    public static final nre f44166f;

    /* JADX INFO: renamed from: g */
    public static final nre f44167g;

    /* JADX INFO: renamed from: h */
    public static final nre f44168h;

    /* JADX INFO: renamed from: i */
    public static final nre[] f44169i;

    /* JADX INFO: renamed from: k */
    private static int f44170k;

    /* JADX INFO: renamed from: j */
    public final int f44171j;

    /* JADX INFO: renamed from: l */
    private final String f44172l;

    static {
        nre nreVar = new nre("kUnknown", -1);
        f44161a = nreVar;
        nre nreVar2 = new nre(hiCTUJiAxf.xAwJFCiSfFNk, 0);
        f44162b = nreVar2;
        nre nreVar3 = new nre(hiCTUJiAxf.jGKfYfYzZCwkCsL);
        f44163c = nreVar3;
        nre nreVar4 = new nre("kDeprecatedLongExp");
        f44164d = nreVar4;
        nre nreVar5 = new nre("kBracketedExp");
        f44165e = nreVar5;
        nre nreVar6 = new nre("kPostShutterAf");
        f44166f = nreVar6;
        nre nreVar7 = new nre("kUltraShortExp");
        f44167g = nreVar7;
        nre nreVar8 = new nre("kInvalidBurstFrameType");
        f44168h = nreVar8;
        f44169i = new nre[]{nreVar, nreVar2, nreVar3, nreVar4, nreVar5, nreVar6, nreVar7, nreVar8};
        f44170k = 0;
    }

    private nre(String str) {
        this.f44172l = str;
        int i = f44170k;
        f44170k = i + 1;
        this.f44171j = i;
    }

    private nre(String str, int i) {
        this.f44172l = str;
        this.f44171j = i;
        f44170k = i + 1;
    }

    public final String toString() {
        return this.f44172l;
    }
}
