package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjx extends jij {
    public static final Parcelable.Creator CREATOR = new jjy();

    /* JADX INFO: renamed from: a */
    public String f34197a;

    /* JADX INFO: renamed from: b */
    public Bundle f34198b;

    /* JADX INFO: renamed from: c */
    public String f34199c;

    /* JADX INFO: renamed from: d */
    public final ApplicationErrorReport f34200d;

    /* JADX INFO: renamed from: e */
    public String f34201e;

    /* JADX INFO: renamed from: f */
    public BitmapTeleporter f34202f;

    /* JADX INFO: renamed from: g */
    public String f34203g;

    /* JADX INFO: renamed from: h */
    public List f34204h;

    /* JADX INFO: renamed from: i */
    public boolean f34205i;

    /* JADX INFO: renamed from: j */
    public jkb f34206j;

    /* JADX INFO: renamed from: k */
    public jka f34207k;

    /* JADX INFO: renamed from: l */
    public boolean f34208l;

    /* JADX INFO: renamed from: m */
    public Bitmap f34209m;

    /* JADX INFO: renamed from: n */
    public String f34210n;

    /* JADX INFO: renamed from: o */
    public boolean f34211o;

    /* JADX INFO: renamed from: p */
    long f34212p;

    /* JADX INFO: renamed from: q */
    public boolean f34213q;

    public jjx(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, jkb jkbVar, jka jkaVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4) {
        this.f34197a = str;
        this.f34198b = bundle == null ? new Bundle() : bundle;
        this.f34199c = str2;
        this.f34200d = applicationErrorReport == null ? new ApplicationErrorReport() : applicationErrorReport;
        this.f34201e = str3;
        this.f34202f = bitmapTeleporter;
        this.f34203g = str4;
        this.f34204h = list == null ? new ArrayList() : list;
        this.f34205i = z;
        this.f34206j = jkbVar;
        this.f34207k = jkaVar;
        this.f34208l = z2;
        this.f34209m = bitmap;
        this.f34210n = str5;
        this.f34211o = z3;
        this.f34212p = j;
        this.f34213q = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jjy.m13322a(this, parcel, i);
    }
}
