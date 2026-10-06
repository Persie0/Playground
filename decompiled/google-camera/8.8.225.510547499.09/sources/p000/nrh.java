package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nrh {

    /* JADX INFO: renamed from: a */
    public static final nrh f44188a;

    /* JADX INFO: renamed from: b */
    public static final nrh f44189b;

    /* JADX INFO: renamed from: c */
    public static final nrh f44190c;

    /* JADX INFO: renamed from: d */
    public static final nrh f44191d;

    /* JADX INFO: renamed from: e */
    public static final nrh f44192e;

    /* JADX INFO: renamed from: f */
    public static final nrh f44193f;

    /* JADX INFO: renamed from: g */
    public static final nrh f44194g;

    /* JADX INFO: renamed from: h */
    public static final nrh f44195h;

    /* JADX INFO: renamed from: i */
    public static final nrh f44196i;

    /* JADX INFO: renamed from: j */
    public static final nrh f44197j;

    /* JADX INFO: renamed from: k */
    public static final nrh f44198k;

    /* JADX INFO: renamed from: l */
    public static final nrh f44199l;

    /* JADX INFO: renamed from: m */
    public static final nrh f44200m;

    /* JADX INFO: renamed from: n */
    public static final nrh f44201n;

    /* JADX INFO: renamed from: o */
    public static final nrh f44202o;

    /* JADX INFO: renamed from: p */
    public static final nrh f44203p;

    /* JADX INFO: renamed from: q */
    public static final nrh f44204q;

    /* JADX INFO: renamed from: r */
    public static final nrh f44205r;

    /* JADX INFO: renamed from: s */
    public static final nrh f44206s;

    /* JADX INFO: renamed from: t */
    public static final nrh f44207t;

    /* JADX INFO: renamed from: u */
    public static final nrh f44208u;

    /* JADX INFO: renamed from: v */
    public static final nrh f44209v;

    /* JADX INFO: renamed from: x */
    private static final nrh[] f44210x;

    /* JADX INFO: renamed from: w */
    public final int f44211w;

    /* JADX INFO: renamed from: y */
    private final String f44212y;

    static {
        nrh nrhVar = new nrh("kUnknown", 0);
        f44188a = nrhVar;
        nrh nrhVar2 = new nrh("kDaylight", 1);
        f44189b = nrhVar2;
        nrh nrhVar3 = new nrh("kFluorescent", 2);
        f44190c = nrhVar3;
        nrh nrhVar4 = new nrh("kTungsten", 3);
        f44191d = nrhVar4;
        nrh nrhVar5 = new nrh("kFlash", 4);
        f44192e = nrhVar5;
        nrh nrhVar6 = new nrh("kFineWeather", 5);
        f44193f = nrhVar6;
        nrh nrhVar7 = new nrh("kCloudyWeather", 10);
        f44194g = nrhVar7;
        nrh nrhVar8 = new nrh("kShade", 11);
        f44195h = nrhVar8;
        nrh nrhVar9 = new nrh("kDaylightFluorescent", 12);
        f44196i = nrhVar9;
        nrh nrhVar10 = new nrh(JrxsYuVZZqnFC.SMidzrFjfsP, 13);
        f44197j = nrhVar10;
        nrh nrhVar11 = new nrh("kCoolWhiteFluorescent", 14);
        f44198k = nrhVar11;
        nrh nrhVar12 = new nrh("kWhiteFluorescent", 15);
        f44199l = nrhVar12;
        nrh nrhVar13 = new nrh("kWarmWhiteFluorescent", 16);
        f44200m = nrhVar13;
        nrh nrhVar14 = new nrh("kStandardLightA", 17);
        f44201n = nrhVar14;
        nrh nrhVar15 = new nrh("kStandardLightB", 18);
        f44202o = nrhVar15;
        nrh nrhVar16 = new nrh("kStandardLightC", 19);
        f44203p = nrhVar16;
        nrh nrhVar17 = new nrh(voNZjxiJou.dlnk, 20);
        f44204q = nrhVar17;
        nrh nrhVar18 = new nrh("kD65", 21);
        f44205r = nrhVar18;
        nrh nrhVar19 = new nrh("kD75", 22);
        f44206s = nrhVar19;
        nrh nrhVar20 = new nrh("kD50", 23);
        f44207t = nrhVar20;
        nrh nrhVar21 = new nrh("kISOStudioTungsten", 24);
        f44208u = nrhVar21;
        nrh nrhVar22 = new nrh("kOther", 255);
        f44209v = nrhVar22;
        f44210x = new nrh[]{nrhVar, nrhVar2, nrhVar3, nrhVar4, nrhVar5, nrhVar6, nrhVar7, nrhVar8, nrhVar9, nrhVar10, nrhVar11, nrhVar12, nrhVar13, nrhVar14, nrhVar15, nrhVar16, nrhVar17, nrhVar18, nrhVar19, nrhVar20, nrhVar21, nrhVar22};
    }

    private nrh(String str, int i) {
        this.f44212y = str;
        this.f44211w = i;
    }

    /* JADX INFO: renamed from: a */
    public static nrh m17631a(int i) {
        nrh[] nrhVarArr = f44210x;
        int i2 = 0;
        if (i < 22 && i >= 0) {
            nrh nrhVar = nrhVarArr[i];
            if (nrhVar.f44211w == i) {
                return nrhVar;
            }
        }
        while (true) {
            nrh[] nrhVarArr2 = f44210x;
            if (i2 >= 22) {
                throw new IllegalArgumentException("No enum " + nrh.class.toString() + " with value " + i);
            }
            nrh nrhVar2 = nrhVarArr2[i2];
            if (nrhVar2.f44211w == i) {
                return nrhVar2;
            }
            i2++;
        }
    }

    public final String toString() {
        return this.f44212y;
    }
}
