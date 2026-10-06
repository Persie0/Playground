package android.support.wearable.complications.rendering;

import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import p000.C0870ob;
import p000.C0878oj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ComplicationStyle$Builder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0870ob(4);

    /* JADX INFO: renamed from: a */
    public int f1331a;

    /* JADX INFO: renamed from: b */
    public Drawable f1332b;

    /* JADX INFO: renamed from: c */
    public int f1333c;

    /* JADX INFO: renamed from: d */
    public int f1334d;

    /* JADX INFO: renamed from: e */
    public Typeface f1335e;

    /* JADX INFO: renamed from: f */
    public Typeface f1336f;

    /* JADX INFO: renamed from: g */
    public int f1337g;

    /* JADX INFO: renamed from: h */
    public int f1338h;

    /* JADX INFO: renamed from: i */
    public ColorFilter f1339i;

    /* JADX INFO: renamed from: j */
    public int f1340j;

    /* JADX INFO: renamed from: k */
    public int f1341k;

    /* JADX INFO: renamed from: l */
    public int f1342l;

    /* JADX INFO: renamed from: m */
    public int f1343m;

    /* JADX INFO: renamed from: n */
    public int f1344n;

    /* JADX INFO: renamed from: o */
    public int f1345o;

    /* JADX INFO: renamed from: p */
    public int f1346p;

    /* JADX INFO: renamed from: q */
    public int f1347q;

    /* JADX INFO: renamed from: r */
    public int f1348r;

    /* JADX INFO: renamed from: s */
    public int f1349s;

    /* JADX INFO: renamed from: t */
    private int f1350t;

    public ComplicationStyle$Builder() {
        this.f1331a = -16777216;
        this.f1332b = null;
        this.f1333c = -1;
        this.f1334d = -3355444;
        this.f1335e = C0878oj.f46138a;
        this.f1336f = C0878oj.f46138a;
        this.f1337g = Integer.MAX_VALUE;
        this.f1338h = Integer.MAX_VALUE;
        this.f1339i = null;
        this.f1340j = -1;
        this.f1341k = -1;
        this.f1350t = 1;
        this.f1342l = 3;
        this.f1343m = 3;
        this.f1344n = Integer.MAX_VALUE;
        this.f1345o = 1;
        this.f1346p = 2;
        this.f1347q = -1;
        this.f1348r = -3355444;
        this.f1349s = -3355444;
    }

    /* JADX INFO: renamed from: a */
    public final C0878oj m1391a() {
        return new C0878oj(this.f1331a, this.f1332b, this.f1333c, this.f1334d, this.f1335e, this.f1336f, this.f1337g, this.f1338h, this.f1339i, this.f1340j, this.f1341k, this.f1350t, this.f1344n, this.f1345o, this.f1342l, this.f1343m, this.f1346p, this.f1347q, this.f1348r, this.f1349s);
    }

    /* JADX INFO: renamed from: b */
    public final void m1392b(int i) {
        if (i == 1) {
            this.f1350t = 1;
        } else if (i == 2) {
            this.f1350t = 2;
        } else {
            this.f1350t = 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("background_color", this.f1331a);
        bundle.putInt("text_color", this.f1333c);
        bundle.putInt("title_color", this.f1334d);
        bundle.putInt("text_style", this.f1335e.getStyle());
        bundle.putInt("title_style", this.f1336f.getStyle());
        bundle.putInt("text_size", this.f1337g);
        bundle.putInt("title_size", this.f1338h);
        bundle.putInt("icon_color", this.f1340j);
        bundle.putInt("border_color", this.f1341k);
        bundle.putInt("border_style", this.f1350t);
        bundle.putInt("border_dash_width", this.f1342l);
        bundle.putInt("border_dash_gap", this.f1343m);
        bundle.putInt("border_radius", this.f1344n);
        bundle.putInt("border_width", this.f1345o);
        bundle.putInt("ranged_value_ring_width", this.f1346p);
        bundle.putInt("ranged_value_primary_color", this.f1347q);
        bundle.putInt("ranged_value_secondary_color", this.f1348r);
        bundle.putInt("highlight_color", this.f1349s);
        parcel.writeBundle(bundle);
    }

    public ComplicationStyle$Builder(Parcel parcel) {
        this.f1331a = -16777216;
        this.f1332b = null;
        this.f1333c = -1;
        this.f1334d = -3355444;
        this.f1335e = C0878oj.f46138a;
        this.f1336f = C0878oj.f46138a;
        this.f1337g = Integer.MAX_VALUE;
        this.f1338h = Integer.MAX_VALUE;
        this.f1339i = null;
        this.f1340j = -1;
        this.f1341k = -1;
        this.f1350t = 1;
        this.f1342l = 3;
        this.f1343m = 3;
        this.f1344n = Integer.MAX_VALUE;
        this.f1345o = 1;
        this.f1346p = 2;
        this.f1347q = -1;
        this.f1348r = -3355444;
        this.f1349s = -3355444;
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f1331a = bundle.getInt("background_color");
        this.f1333c = bundle.getInt("text_color");
        this.f1334d = bundle.getInt("title_color");
        this.f1335e = Typeface.defaultFromStyle(bundle.getInt("text_style", 0));
        this.f1336f = Typeface.defaultFromStyle(bundle.getInt("title_style", 0));
        this.f1337g = bundle.getInt("text_size");
        this.f1338h = bundle.getInt("title_size");
        this.f1340j = bundle.getInt("icon_color");
        this.f1341k = bundle.getInt(pIeXJQLZLfgIN.vldvTl);
        this.f1350t = bundle.getInt("border_style");
        this.f1342l = bundle.getInt("border_dash_width");
        this.f1343m = bundle.getInt("border_dash_gap");
        this.f1344n = bundle.getInt("border_radius");
        this.f1345o = bundle.getInt("border_width");
        this.f1346p = bundle.getInt("ranged_value_ring_width");
        this.f1347q = bundle.getInt("ranged_value_primary_color");
        this.f1348r = bundle.getInt("ranged_value_secondary_color");
        this.f1349s = bundle.getInt("highlight_color");
    }

    public ComplicationStyle$Builder(ComplicationStyle$Builder complicationStyle$Builder) {
        this.f1331a = -16777216;
        this.f1332b = null;
        this.f1333c = -1;
        this.f1334d = -3355444;
        this.f1335e = C0878oj.f46138a;
        this.f1336f = C0878oj.f46138a;
        this.f1337g = Integer.MAX_VALUE;
        this.f1338h = Integer.MAX_VALUE;
        this.f1339i = null;
        this.f1340j = -1;
        this.f1341k = -1;
        this.f1350t = 1;
        this.f1342l = 3;
        this.f1343m = 3;
        this.f1344n = Integer.MAX_VALUE;
        this.f1345o = 1;
        this.f1346p = 2;
        this.f1347q = -1;
        this.f1348r = -3355444;
        this.f1349s = -3355444;
        this.f1331a = complicationStyle$Builder.f1331a;
        this.f1332b = complicationStyle$Builder.f1332b;
        this.f1333c = complicationStyle$Builder.f1333c;
        this.f1334d = complicationStyle$Builder.f1334d;
        this.f1335e = complicationStyle$Builder.f1335e;
        this.f1336f = complicationStyle$Builder.f1336f;
        this.f1337g = complicationStyle$Builder.f1337g;
        this.f1338h = complicationStyle$Builder.f1338h;
        this.f1339i = complicationStyle$Builder.f1339i;
        this.f1340j = complicationStyle$Builder.f1340j;
        this.f1341k = complicationStyle$Builder.f1341k;
        this.f1350t = complicationStyle$Builder.f1350t;
        this.f1342l = complicationStyle$Builder.f1342l;
        this.f1343m = complicationStyle$Builder.f1343m;
        this.f1344n = complicationStyle$Builder.f1344n;
        this.f1345o = complicationStyle$Builder.f1345o;
        this.f1346p = complicationStyle$Builder.f1346p;
        this.f1347q = complicationStyle$Builder.f1347q;
        this.f1348r = complicationStyle$Builder.f1348r;
        this.f1349s = complicationStyle$Builder.f1349s;
    }

    public ComplicationStyle$Builder(C0878oj c0878oj) {
        this.f1331a = -16777216;
        this.f1332b = null;
        this.f1333c = -1;
        this.f1334d = -3355444;
        this.f1335e = C0878oj.f46138a;
        this.f1336f = C0878oj.f46138a;
        this.f1337g = Integer.MAX_VALUE;
        this.f1338h = Integer.MAX_VALUE;
        this.f1339i = null;
        this.f1340j = -1;
        this.f1341k = -1;
        this.f1350t = 1;
        this.f1342l = 3;
        this.f1343m = 3;
        this.f1344n = Integer.MAX_VALUE;
        this.f1345o = 1;
        this.f1346p = 2;
        this.f1347q = -1;
        this.f1348r = -3355444;
        this.f1349s = -3355444;
        this.f1331a = c0878oj.f46139b;
        this.f1332b = c0878oj.f46140c;
        this.f1333c = c0878oj.f46141d;
        this.f1334d = c0878oj.f46142e;
        this.f1335e = c0878oj.f46143f;
        this.f1336f = c0878oj.f46144g;
        this.f1337g = c0878oj.f46145h;
        this.f1338h = c0878oj.f46146i;
        this.f1339i = c0878oj.f46147j;
        this.f1340j = c0878oj.f46148k;
        this.f1341k = c0878oj.f46149l;
        this.f1350t = c0878oj.f46150m;
        this.f1342l = c0878oj.f46151n;
        this.f1343m = c0878oj.f46152o;
        this.f1344n = c0878oj.f46153p;
        this.f1345o = c0878oj.f46154q;
        this.f1346p = c0878oj.f46155r;
        this.f1347q = c0878oj.f46156s;
        this.f1348r = c0878oj.f46157t;
        this.f1349s = c0878oj.f46158u;
    }
}
