package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;
import p000.jij;
import p000.jiy;
import p000.jkb;
import p000.jkf;
import p000.jkr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GoogleHelp extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jkf();

    /* JADX INFO: renamed from: A */
    boolean f7711A;

    /* JADX INFO: renamed from: B */
    boolean f7712B;

    /* JADX INFO: renamed from: C */
    int f7713C;

    /* JADX INFO: renamed from: D */
    String f7714D;

    /* JADX INFO: renamed from: E */
    boolean f7715E;

    /* JADX INFO: renamed from: F */
    String f7716F;

    /* JADX INFO: renamed from: G */
    boolean f7717G;

    /* JADX INFO: renamed from: H */
    ND4CSettings f7718H;

    /* JADX INFO: renamed from: I */
    boolean f7719I;

    /* JADX INFO: renamed from: J */
    List f7720J;

    /* JADX INFO: renamed from: K */
    String f7721K;

    /* JADX INFO: renamed from: a */
    final int f7722a;

    /* JADX INFO: renamed from: b */
    String f7723b;

    /* JADX INFO: renamed from: c */
    Account f7724c;

    /* JADX INFO: renamed from: d */
    Bundle f7725d;

    /* JADX INFO: renamed from: e */
    String f7726e;

    /* JADX INFO: renamed from: f */
    String f7727f;

    /* JADX INFO: renamed from: g */
    Bitmap f7728g;

    /* JADX INFO: renamed from: h */
    boolean f7729h;

    /* JADX INFO: renamed from: i */
    boolean f7730i;

    /* JADX INFO: renamed from: j */
    List f7731j;

    /* JADX INFO: renamed from: k */
    @Deprecated
    Bundle f7732k;

    /* JADX INFO: renamed from: l */
    @Deprecated
    Bitmap f7733l;

    /* JADX INFO: renamed from: m */
    @Deprecated
    byte[] f7734m;

    /* JADX INFO: renamed from: n */
    @Deprecated
    int f7735n;

    /* JADX INFO: renamed from: o */
    @Deprecated
    int f7736o;

    /* JADX INFO: renamed from: p */
    String f7737p;

    /* JADX INFO: renamed from: q */
    public Uri f7738q;

    /* JADX INFO: renamed from: r */
    List f7739r;

    /* JADX INFO: renamed from: s */
    jkb f7740s;

    /* JADX INFO: renamed from: t */
    List f7741t;

    /* JADX INFO: renamed from: u */
    boolean f7742u;

    /* JADX INFO: renamed from: v */
    ErrorReport f7743v;

    /* JADX INFO: renamed from: w */
    public TogglingData f7744w;

    /* JADX INFO: renamed from: x */
    int f7745x;

    /* JADX INFO: renamed from: y */
    PendingIntent f7746y;

    /* JADX INFO: renamed from: z */
    public int f7747z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, jkb jkbVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7) {
        this.f7743v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.f7722a = i;
        this.f7747z = i6;
        this.f7711A = z4;
        this.f7712B = z5;
        this.f7713C = i7;
        this.f7714D = str5;
        this.f7723b = str;
        this.f7724c = account;
        this.f7725d = bundle;
        this.f7726e = str2;
        this.f7727f = str3;
        this.f7728g = bitmap;
        this.f7729h = z;
        this.f7730i = z2;
        this.f7715E = z6;
        this.f7731j = list;
        this.f7746y = pendingIntent;
        this.f7732k = bundle2;
        this.f7733l = bitmap2;
        this.f7734m = bArr;
        this.f7735n = i2;
        this.f7736o = i3;
        this.f7737p = str4;
        this.f7738q = uri;
        this.f7739r = list2;
        if (i < 4) {
            jkb jkbVar2 = new jkb();
            jkbVar2.f34227a = i4;
            this.f7740s = jkbVar2;
        } else {
            this.f7740s = jkbVar == null ? new jkb() : jkbVar;
        }
        this.f7741t = list3;
        this.f7742u = z3;
        this.f7743v = errorReport;
        if (errorReport != null) {
            errorReport.f7659X = "GoogleHelp";
        }
        this.f7744w = togglingData;
        this.f7745x = i5;
        this.f7716F = str6;
        this.f7717G = z7;
        this.f7718H = nD4CSettings;
        this.f7719I = z8;
        this.f7720J = list4;
        this.f7721K = str7;
    }

    /* JADX INFO: renamed from: a */
    public final void m4664a(int i, String str, Intent intent) {
        this.f7739r.add(new jkr(i, str, intent));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7722a);
        jiy.m13296w(parcel, 2, this.f7723b);
        jiy.m13295v(parcel, 3, this.f7724c, i);
        jiy.m13289p(parcel, 4, this.f7725d);
        jiy.m13284k(parcel, 5, this.f7729h);
        jiy.m13284k(parcel, 6, this.f7730i);
        jiy.m13298y(parcel, 7, this.f7731j);
        jiy.m13289p(parcel, 10, this.f7732k);
        jiy.m13295v(parcel, 11, this.f7733l, i);
        jiy.m13296w(parcel, 14, this.f7737p);
        jiy.m13295v(parcel, 15, this.f7738q, i);
        jiy.m13239A(parcel, 16, this.f7739r);
        jiy.m13287n(parcel, 17, 0);
        jiy.m13239A(parcel, 18, this.f7741t);
        jiy.m13290q(parcel, 19, this.f7734m);
        jiy.m13287n(parcel, 20, this.f7735n);
        jiy.m13287n(parcel, 21, this.f7736o);
        jiy.m13284k(parcel, 22, this.f7742u);
        jiy.m13295v(parcel, 23, this.f7743v, i);
        jiy.m13295v(parcel, 25, this.f7740s, i);
        jiy.m13296w(parcel, 28, this.f7726e);
        jiy.m13295v(parcel, 31, this.f7744w, i);
        jiy.m13287n(parcel, 32, this.f7745x);
        jiy.m13295v(parcel, 33, this.f7746y, i);
        jiy.m13296w(parcel, 34, this.f7727f);
        jiy.m13295v(parcel, 35, this.f7728g, i);
        jiy.m13287n(parcel, 36, this.f7747z);
        jiy.m13284k(parcel, 37, this.f7711A);
        jiy.m13284k(parcel, 38, this.f7712B);
        jiy.m13287n(parcel, 39, this.f7713C);
        jiy.m13296w(parcel, 40, this.f7714D);
        jiy.m13284k(parcel, 41, this.f7715E);
        jiy.m13296w(parcel, 42, this.f7716F);
        jiy.m13284k(parcel, 43, this.f7717G);
        jiy.m13295v(parcel, 44, this.f7718H, i);
        jiy.m13284k(parcel, 45, this.f7719I);
        jiy.m13239A(parcel, 46, this.f7720J);
        jiy.m13296w(parcel, 47, this.f7721K);
        jiy.m13283j(parcel, iM13281h);
    }
}
