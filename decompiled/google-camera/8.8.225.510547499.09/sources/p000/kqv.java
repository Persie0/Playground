package p000;

import android.content.Context;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.text.DateFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqv {

    /* JADX INFO: renamed from: a */
    public final String f36956a;

    /* JADX INFO: renamed from: b */
    public final String f36957b;

    /* JADX INFO: renamed from: c */
    public final String f36958c;

    /* JADX INFO: renamed from: d */
    public final String f36959d;

    /* JADX INFO: renamed from: e */
    public final String f36960e;

    /* JADX INFO: renamed from: f */
    public final String f36961f;

    /* JADX INFO: renamed from: g */
    public final int f36962g;

    /* JADX INFO: renamed from: h */
    public final boolean f36963h;

    /* JADX INFO: renamed from: i */
    public final boolean f36964i;

    /* JADX INFO: renamed from: j */
    public final mxk f36965j;

    /* JADX INFO: renamed from: k */
    public final DateFormat f36966k;

    /* JADX INFO: renamed from: l */
    public final Context f36967l;

    /* JADX INFO: renamed from: m */
    public final String f36968m;

    /* JADX INFO: renamed from: n */
    public final String f36969n;

    /* JADX INFO: renamed from: o */
    public final String f36970o;

    /* JADX INFO: renamed from: p */
    public final krj f36971p;

    /* JADX INFO: renamed from: q */
    public final boolean f36972q;

    /* JADX INFO: renamed from: r */
    public final long f36973r;

    /* JADX INFO: renamed from: s */
    private final mwx f36974s;

    public kqv() {
    }

    public kqv(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, mxk mxkVar, DateFormat dateFormat, mwx mwxVar, Context context, String str7, String str8, String str9, krj krjVar, boolean z3, long j) {
        this.f36956a = str;
        this.f36957b = str2;
        this.f36958c = str3;
        this.f36959d = str4;
        this.f36960e = str5;
        this.f36961f = str6;
        this.f36962g = i;
        this.f36963h = z;
        this.f36964i = z2;
        this.f36965j = mxkVar;
        this.f36966k = dateFormat;
        this.f36974s = mwxVar;
        this.f36967l = context;
        this.f36968m = str7;
        this.f36969n = str8;
        this.f36970o = str9;
        this.f36971p = krjVar;
        this.f36972q = z3;
        this.f36973r = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqv) {
            kqv kqvVar = (kqv) obj;
            if (this.f36956a.equals(kqvVar.f36956a) && this.f36957b.equals(kqvVar.f36957b) && this.f36958c.equals(kqvVar.f36958c) && this.f36959d.equals(kqvVar.f36959d) && this.f36960e.equals(kqvVar.f36960e) && this.f36961f.equals(kqvVar.f36961f) && this.f36962g == kqvVar.f36962g && this.f36963h == kqvVar.f36963h && this.f36964i == kqvVar.f36964i && this.f36965j.equals(kqvVar.f36965j) && this.f36966k.equals(kqvVar.f36966k) && this.f36974s.equals(kqvVar.f36974s) && this.f36967l.equals(kqvVar.f36967l) && this.f36968m.equals(kqvVar.f36968m) && this.f36969n.equals(kqvVar.f36969n) && this.f36970o.equals(kqvVar.f36970o) && this.f36971p.equals(kqvVar.f36971p) && this.f36972q == kqvVar.f36972q && this.f36973r == kqvVar.f36973r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.f36956a.hashCode() ^ 1000003) * 1000003) ^ this.f36957b.hashCode()) * 1000003) ^ this.f36958c.hashCode()) * 1000003) ^ this.f36959d.hashCode()) * 1000003) ^ this.f36960e.hashCode()) * 1000003) ^ this.f36961f.hashCode()) * 1000003) ^ this.f36962g;
        return (((((((((((((((((((((((iHashCode * 1000003) ^ (true != this.f36963h ? 1237 : 1231)) * 1000003) ^ (true != this.f36964i ? 1237 : 1231)) * 1000003) ^ this.f36965j.hashCode()) * 1000003) ^ this.f36966k.hashCode()) * 1000003) ^ this.f36974s.hashCode()) * 1000003) ^ this.f36967l.hashCode()) * 1000003) ^ this.f36968m.hashCode()) * 1000003) ^ this.f36969n.hashCode()) * 1000003) ^ this.f36970o.hashCode()) * 1000003) ^ this.f36971p.hashCode()) * 1000003) ^ (true == this.f36972q ? 1231 : 1237)) * (-721379959)) ^ ((int) this.f36973r);
    }

    public final String toString() {
        return "Config{filenameDefaultPrefix=" + this.f36956a + ", filenameImagePrefix=" + this.f36957b + ", filenameVideoPrefix=" + this.f36958c + ", filenameTmpPrefix=" + this.f36959d + ", filenameBurstTagPrefix=" + this.f36960e + ", filenameBurstPrimaryTag=" + this.f36961f + ", filenameBurstDigitCount=" + this.f36962g + ", filenameBurstTagRequired=" + this.f36963h + ", filenameBurstUseGroupTag=" + this.f36964i + ", filenameBurstSequenceExtensionsSortedLast=" + String.valueOf(this.f36965j) + ", filenameGroupFormat=" + String.valueOf(this.f36966k) + ", filenameMimeTypeGroupPrefix=" + String.valueOf(this.f36974s) + ", storageContext=" + String.valueOf(this.f36967l) + ", storageCacheSubpath=" + this.f36968m + ", storageDataSubpath=" + this.f36969n + ", storageDcimSubpath=" + this.f36970o + ", defaultContentResolverApi=" + String.valueOf(this.f36971p) + ", notifyChangeOnPublish=" + this.f36972q + ", notifyChangeTimeoutMs=0, storageAutoPublishTimeoutMs=" + this.f36973r + BEeWZPor.pwhYzoRIwXyl;
    }
}
