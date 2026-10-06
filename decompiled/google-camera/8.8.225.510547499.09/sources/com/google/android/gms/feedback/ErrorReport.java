package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p000.jie;
import p000.jij;
import p000.jiy;
import p000.jjx;
import p000.jjz;
import p000.jka;
import p000.jkb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ErrorReport extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jie(4);

    /* JADX INFO: renamed from: A */
    public String f7636A;

    /* JADX INFO: renamed from: B */
    public String f7637B;

    /* JADX INFO: renamed from: C */
    public String f7638C;

    /* JADX INFO: renamed from: D */
    public Bundle f7639D;

    /* JADX INFO: renamed from: E */
    public boolean f7640E;

    /* JADX INFO: renamed from: F */
    public int f7641F;

    /* JADX INFO: renamed from: G */
    public int f7642G;

    /* JADX INFO: renamed from: H */
    public boolean f7643H;

    /* JADX INFO: renamed from: I */
    public String f7644I;

    /* JADX INFO: renamed from: J */
    public String f7645J;

    /* JADX INFO: renamed from: K */
    public int f7646K;

    /* JADX INFO: renamed from: L */
    public String f7647L;

    /* JADX INFO: renamed from: M */
    public String f7648M;

    /* JADX INFO: renamed from: N */
    public String f7649N;

    /* JADX INFO: renamed from: O */
    public String f7650O;

    /* JADX INFO: renamed from: P */
    public String f7651P;

    /* JADX INFO: renamed from: Q */
    @Deprecated
    public String f7652Q;

    /* JADX INFO: renamed from: R */
    public String f7653R;

    /* JADX INFO: renamed from: S */
    public BitmapTeleporter f7654S;

    /* JADX INFO: renamed from: T */
    public String f7655T;

    /* JADX INFO: renamed from: U */
    public jjz[] f7656U;

    /* JADX INFO: renamed from: V */
    public String[] f7657V;

    /* JADX INFO: renamed from: W */
    public boolean f7658W;

    /* JADX INFO: renamed from: X */
    public String f7659X;

    /* JADX INFO: renamed from: Y */
    public jkb f7660Y;

    /* JADX INFO: renamed from: Z */
    public jka f7661Z;

    /* JADX INFO: renamed from: a */
    public ApplicationErrorReport f7662a;

    /* JADX INFO: renamed from: aa */
    @Deprecated
    public String f7663aa;

    /* JADX INFO: renamed from: ab */
    public boolean f7664ab;

    /* JADX INFO: renamed from: ac */
    public Bundle f7665ac;

    /* JADX INFO: renamed from: ad */
    public List f7666ad;

    /* JADX INFO: renamed from: ae */
    public boolean f7667ae;

    /* JADX INFO: renamed from: af */
    public Bitmap f7668af;

    /* JADX INFO: renamed from: ag */
    public String f7669ag;

    /* JADX INFO: renamed from: ah */
    public List f7670ah;

    /* JADX INFO: renamed from: ai */
    public int f7671ai;

    /* JADX INFO: renamed from: aj */
    public int f7672aj;

    /* JADX INFO: renamed from: ak */
    public String[] f7673ak;

    /* JADX INFO: renamed from: al */
    public String[] f7674al;

    /* JADX INFO: renamed from: am */
    public String[] f7675am;

    /* JADX INFO: renamed from: an */
    public boolean f7676an;

    /* JADX INFO: renamed from: ao */
    public boolean f7677ao;

    /* JADX INFO: renamed from: b */
    public String f7678b;

    /* JADX INFO: renamed from: c */
    public int f7679c;

    /* JADX INFO: renamed from: d */
    public String f7680d;

    /* JADX INFO: renamed from: e */
    public String f7681e;

    /* JADX INFO: renamed from: f */
    public String f7682f;

    /* JADX INFO: renamed from: g */
    public String f7683g;

    /* JADX INFO: renamed from: h */
    public String f7684h;

    /* JADX INFO: renamed from: i */
    public String f7685i;

    /* JADX INFO: renamed from: j */
    public String f7686j;

    /* JADX INFO: renamed from: k */
    public int f7687k;

    /* JADX INFO: renamed from: l */
    public String f7688l;

    /* JADX INFO: renamed from: m */
    public String f7689m;

    /* JADX INFO: renamed from: n */
    public String f7690n;

    /* JADX INFO: renamed from: o */
    public String f7691o;

    /* JADX INFO: renamed from: p */
    public String f7692p;

    /* JADX INFO: renamed from: q */
    public String[] f7693q;

    /* JADX INFO: renamed from: r */
    public String[] f7694r;

    /* JADX INFO: renamed from: s */
    public String[] f7695s;

    /* JADX INFO: renamed from: t */
    public String f7696t;

    /* JADX INFO: renamed from: u */
    public String f7697u;

    /* JADX INFO: renamed from: v */
    public byte[] f7698v;

    /* JADX INFO: renamed from: w */
    public int f7699w;

    /* JADX INFO: renamed from: x */
    public int f7700x;

    /* JADX INFO: renamed from: y */
    public int f7701y;

    /* JADX INFO: renamed from: z */
    public int f7702z;

    public ErrorReport() {
        this.f7662a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 2, this.f7662a, i);
        jiy.m13296w(parcel, 3, this.f7678b);
        jiy.m13287n(parcel, 4, this.f7679c);
        jiy.m13296w(parcel, 5, this.f7680d);
        jiy.m13296w(parcel, 6, this.f7681e);
        jiy.m13296w(parcel, 7, this.f7682f);
        jiy.m13296w(parcel, 8, this.f7683g);
        jiy.m13296w(parcel, 9, this.f7684h);
        jiy.m13296w(parcel, 10, this.f7685i);
        jiy.m13296w(parcel, 11, this.f7686j);
        jiy.m13287n(parcel, 12, this.f7687k);
        jiy.m13296w(parcel, 13, this.f7688l);
        jiy.m13296w(parcel, 14, this.f7689m);
        jiy.m13296w(parcel, 15, this.f7690n);
        jiy.m13296w(parcel, 16, this.f7691o);
        jiy.m13296w(parcel, 17, this.f7692p);
        jiy.m13297x(parcel, 18, this.f7693q);
        jiy.m13297x(parcel, 19, this.f7694r);
        jiy.m13297x(parcel, 20, this.f7695s);
        jiy.m13296w(parcel, 21, this.f7696t);
        jiy.m13296w(parcel, 22, this.f7697u);
        jiy.m13290q(parcel, 23, this.f7698v);
        jiy.m13287n(parcel, 24, this.f7699w);
        jiy.m13287n(parcel, 25, this.f7700x);
        jiy.m13287n(parcel, 26, this.f7701y);
        jiy.m13287n(parcel, 27, this.f7702z);
        jiy.m13296w(parcel, 28, this.f7636A);
        jiy.m13296w(parcel, 29, this.f7637B);
        jiy.m13296w(parcel, 30, this.f7638C);
        jiy.m13289p(parcel, 31, this.f7639D);
        jiy.m13284k(parcel, 32, this.f7640E);
        jiy.m13287n(parcel, 33, this.f7641F);
        jiy.m13287n(parcel, 34, this.f7642G);
        jiy.m13284k(parcel, 35, this.f7643H);
        jiy.m13296w(parcel, 36, this.f7644I);
        jiy.m13296w(parcel, 37, this.f7645J);
        jiy.m13287n(parcel, 38, this.f7646K);
        jiy.m13296w(parcel, 39, this.f7647L);
        jiy.m13296w(parcel, 40, this.f7648M);
        jiy.m13296w(parcel, 41, this.f7649N);
        jiy.m13296w(parcel, 42, this.f7650O);
        jiy.m13296w(parcel, 43, this.f7651P);
        jiy.m13296w(parcel, 44, this.f7652Q);
        jiy.m13296w(parcel, 45, this.f7653R);
        jiy.m13295v(parcel, 46, this.f7654S, i);
        jiy.m13296w(parcel, 47, this.f7655T);
        jiy.m13299z(parcel, 48, this.f7656U, i);
        jiy.m13297x(parcel, 49, this.f7657V);
        jiy.m13284k(parcel, 50, this.f7658W);
        jiy.m13296w(parcel, 51, this.f7659X);
        jiy.m13295v(parcel, 52, this.f7660Y, i);
        jiy.m13295v(parcel, 53, this.f7661Z, i);
        jiy.m13296w(parcel, 54, this.f7663aa);
        jiy.m13284k(parcel, 55, this.f7664ab);
        jiy.m13289p(parcel, 56, this.f7665ac);
        jiy.m13239A(parcel, 57, this.f7666ad);
        jiy.m13284k(parcel, 58, this.f7667ae);
        jiy.m13295v(parcel, 59, this.f7668af, i);
        jiy.m13296w(parcel, 60, this.f7669ag);
        jiy.m13298y(parcel, 61, this.f7670ah);
        jiy.m13287n(parcel, 62, this.f7671ai);
        jiy.m13287n(parcel, 63, this.f7672aj);
        jiy.m13297x(parcel, 64, this.f7673ak);
        jiy.m13297x(parcel, 65, this.f7674al);
        jiy.m13297x(parcel, 66, this.f7675am);
        jiy.m13284k(parcel, 67, this.f7676an);
        jiy.m13284k(parcel, 68, this.f7677ao);
        jiy.m13283j(parcel, iM13281h);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, jjz[] jjzVarArr, String[] strArr4, boolean z3, String str29, jkb jkbVar, jka jkaVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7) {
        new ApplicationErrorReport();
        this.f7662a = applicationErrorReport;
        this.f7678b = str;
        this.f7679c = i;
        this.f7680d = str2;
        this.f7681e = str3;
        this.f7682f = str4;
        this.f7683g = str5;
        this.f7684h = str6;
        this.f7685i = str7;
        this.f7686j = str8;
        this.f7687k = i2;
        this.f7688l = str9;
        this.f7689m = str10;
        this.f7690n = str11;
        this.f7691o = str12;
        this.f7692p = str13;
        this.f7693q = strArr;
        this.f7694r = strArr2;
        this.f7695s = strArr3;
        this.f7696t = str14;
        this.f7697u = str15;
        this.f7698v = bArr;
        this.f7699w = i3;
        this.f7700x = i4;
        this.f7701y = i5;
        this.f7702z = i6;
        this.f7636A = str16;
        this.f7637B = str17;
        this.f7638C = str18;
        this.f7639D = bundle;
        this.f7640E = z;
        this.f7641F = i7;
        this.f7642G = i8;
        this.f7643H = z2;
        this.f7644I = str19;
        this.f7645J = str20;
        this.f7646K = i9;
        this.f7647L = str21;
        this.f7648M = str22;
        this.f7649N = str23;
        this.f7650O = str24;
        this.f7651P = str25;
        this.f7652Q = str26;
        this.f7653R = str27;
        this.f7654S = bitmapTeleporter;
        this.f7655T = str28;
        this.f7656U = jjzVarArr;
        this.f7657V = strArr4;
        this.f7658W = z3;
        this.f7659X = str29;
        this.f7660Y = jkbVar;
        this.f7661Z = jkaVar;
        this.f7663aa = str30;
        this.f7664ab = z4;
        this.f7665ac = bundle2;
        this.f7666ad = list;
        this.f7667ae = z5;
        this.f7668af = bitmap;
        this.f7669ag = str31;
        this.f7670ah = list2;
        this.f7671ai = i10;
        this.f7672aj = i11;
        this.f7673ak = strArr5;
        this.f7674al = strArr6;
        this.f7675am = strArr7;
        this.f7676an = z6;
        this.f7677ao = z7;
    }

    public ErrorReport(jjx jjxVar, File file) {
        this.f7662a = new ApplicationErrorReport();
        Bundle bundle = jjxVar.f34198b;
        if (bundle != null && !bundle.isEmpty()) {
            this.f7639D = jjxVar.f34198b;
        }
        if (!TextUtils.isEmpty(jjxVar.f34197a)) {
            this.f7637B = jjxVar.f34197a;
        }
        if (!TextUtils.isEmpty(jjxVar.f34199c)) {
            this.f7678b = jjxVar.f34199c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = jjxVar.f34200d.crashInfo;
        if (crashInfo != null) {
            this.f7648M = crashInfo.throwMethodName;
            this.f7646K = crashInfo.throwLineNumber;
            this.f7647L = crashInfo.throwClassName;
            this.f7649N = crashInfo.stackTrace;
            this.f7644I = crashInfo.exceptionClassName;
            this.f7650O = crashInfo.exceptionMessage;
            this.f7645J = crashInfo.throwFileName;
        }
        jkb jkbVar = jjxVar.f34206j;
        if (jkbVar != null) {
            this.f7660Y = jkbVar;
        }
        if (!TextUtils.isEmpty(jjxVar.f34201e)) {
            this.f7651P = jjxVar.f34201e;
        }
        String str = jjxVar.f34203g;
        if (!TextUtils.isEmpty(str)) {
            this.f7662a.packageName = str;
        }
        if (!TextUtils.isEmpty(jjxVar.f34210n)) {
            this.f7669ag = jjxVar.f34210n;
        }
        Bitmap bitmap = jjxVar.f34209m;
        if (bitmap != null) {
            this.f7668af = bitmap;
        }
        if (file != null) {
            this.f7654S = jjxVar.f34202f;
            List list = jjxVar.f34204h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((jjz) it.next()).f34217d = file;
                }
                this.f7656U = (jjz[]) list.toArray(new jjz[0]);
            }
        }
        jka jkaVar = jjxVar.f34207k;
        if (jkaVar != null) {
            this.f7661Z = jkaVar;
        }
        this.f7658W = jjxVar.f34205i;
        this.f7667ae = jjxVar.f34208l;
        this.f7640E = jjxVar.f34211o;
        this.f7676an = jjxVar.f34213q;
    }
}
