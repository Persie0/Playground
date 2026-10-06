package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkf {

    /* JADX INFO: renamed from: a */
    public final List f3597a;

    /* JADX INFO: renamed from: b */
    public final bgm f3598b;

    /* JADX INFO: renamed from: c */
    public final String f3599c;

    /* JADX INFO: renamed from: d */
    public final long f3600d;

    /* JADX INFO: renamed from: e */
    public final long f3601e;

    /* JADX INFO: renamed from: f */
    public final String f3602f;

    /* JADX INFO: renamed from: g */
    public final List f3603g;

    /* JADX INFO: renamed from: h */
    public final bjk f3604h;

    /* JADX INFO: renamed from: i */
    public final int f3605i;

    /* JADX INFO: renamed from: j */
    public final int f3606j;

    /* JADX INFO: renamed from: k */
    public final int f3607k;

    /* JADX INFO: renamed from: l */
    public final float f3608l;

    /* JADX INFO: renamed from: m */
    public final float f3609m;

    /* JADX INFO: renamed from: n */
    public final int f3610n;

    /* JADX INFO: renamed from: o */
    public final int f3611o;

    /* JADX INFO: renamed from: p */
    public final bjj f3612p;

    /* JADX INFO: renamed from: q */
    public final bjb f3613q;

    /* JADX INFO: renamed from: r */
    public final List f3614r;

    /* JADX INFO: renamed from: s */
    public final boolean f3615s;

    /* JADX INFO: renamed from: t */
    public final int f3616t;

    /* JADX INFO: renamed from: u */
    public final int f3617u;

    /* JADX INFO: renamed from: v */
    public final cvy f3618v;

    public bkf(List list, bgm bgmVar, String str, long j, int i, long j2, String str2, List list2, bjk bjkVar, int i2, int i3, int i4, float f, float f2, int i5, int i6, bjj bjjVar, cvy cvyVar, List list3, int i7, bjb bjbVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.f3597a = list;
        this.f3598b = bgmVar;
        this.f3599c = str;
        this.f3600d = j;
        this.f3616t = i;
        this.f3601e = j2;
        this.f3602f = str2;
        this.f3603g = list2;
        this.f3604h = bjkVar;
        this.f3605i = i2;
        this.f3606j = i3;
        this.f3607k = i4;
        this.f3608l = f;
        this.f3609m = f2;
        this.f3610n = i5;
        this.f3611o = i6;
        this.f3612p = bjjVar;
        this.f3618v = cvyVar;
        this.f3614r = list3;
        this.f3617u = i7;
        this.f3613q = bjbVar;
        this.f3615s = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m2543a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f3599c);
        sb.append("\n");
        bkf bkfVarM2417c = this.f3598b.m2417c(this.f3601e);
        if (bkfVarM2417c != null) {
            sb.append("\t\tParents: ");
            sb.append(bkfVarM2417c.f3599c);
            bkf bkfVarM2417c2 = this.f3598b.m2417c(bkfVarM2417c.f3601e);
            while (bkfVarM2417c2 != null) {
                sb.append(WIxTIdUIdfb.GuhbP);
                sb.append(bkfVarM2417c2.f3599c);
                bkfVarM2417c2 = this.f3598b.m2417c(bkfVarM2417c2.f3601e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f3603g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f3603g.size());
            sb.append("\n");
        }
        if (this.f3605i != 0 && this.f3606j != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f3605i), Integer.valueOf(this.f3606j), Integer.valueOf(this.f3607k)));
        }
        if (!this.f3597a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f3597a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m2543a("");
    }
}
