package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krj {

    /* JADX INFO: renamed from: a */
    public final Context f37051a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f37052b;

    /* JADX INFO: renamed from: c */
    public final Uri f37053c;

    /* JADX INFO: renamed from: d */
    public final Uri f37054d;

    /* JADX INFO: renamed from: e */
    public final String f37055e;

    /* JADX INFO: renamed from: f */
    public final String f37056f;

    /* JADX INFO: renamed from: g */
    public final String f37057g;

    /* JADX INFO: renamed from: h */
    public final int f37058h;

    /* JADX INFO: renamed from: i */
    public final String f37059i;

    /* JADX INFO: renamed from: j */
    public final String f37060j;

    /* JADX INFO: renamed from: k */
    public final int f37061k;

    /* JADX INFO: renamed from: l */
    public final int f37062l;

    public krj() {
    }

    public krj(Context context, ContentResolver contentResolver, Uri uri, Uri uri2, String str, String str2, String str3, int i, String str4, String str5, int i2, int i3) {
        this.f37051a = context;
        this.f37052b = contentResolver;
        this.f37053c = uri;
        this.f37054d = uri2;
        this.f37055e = str;
        this.f37056f = str2;
        this.f37057g = str3;
        this.f37058h = i;
        this.f37059i = str4;
        this.f37060j = str5;
        this.f37061k = i2;
        this.f37062l = i3;
    }

    /* JADX INFO: renamed from: a */
    public static kri m14759a(Context context) {
        kri kriVar = new kri();
        kriVar.f37038a = context;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            throw new NullPointerException("Null contentResolver");
        }
        kriVar.f37039b = contentResolver;
        byte b = kriVar.f37043f;
        kriVar.f37041d = 1;
        kriVar.f37043f = (byte) (b | 3);
        return kriVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krj) {
            krj krjVar = (krj) obj;
            if (this.f37051a.equals(krjVar.f37051a) && this.f37052b.equals(krjVar.f37052b) && this.f37053c.equals(krjVar.f37053c) && this.f37054d.equals(krjVar.f37054d) && this.f37055e.equals(krjVar.f37055e) && this.f37056f.equals(krjVar.f37056f) && this.f37057g.equals(krjVar.f37057g) && this.f37058h == krjVar.f37058h && this.f37059i.equals(krjVar.f37059i) && this.f37060j.equals(krjVar.f37060j) && this.f37061k == krjVar.f37061k && this.f37062l == krjVar.f37062l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.f37051a.hashCode() ^ 1000003) * 1000003) ^ this.f37052b.hashCode()) * 1000003) ^ this.f37053c.hashCode()) * 1000003) ^ this.f37054d.hashCode()) * 1000003) ^ this.f37055e.hashCode()) * 1000003) ^ this.f37056f.hashCode()) * 1000003) ^ this.f37057g.hashCode()) * 1000003) ^ this.f37058h) * (-721379959)) ^ this.f37059i.hashCode()) * 1000003) ^ this.f37060j.hashCode()) * 1000003) ^ this.f37061k) * 1000003) ^ this.f37062l;
    }

    public final String toString() {
        return "ContentResolverApi{context=" + String.valueOf(this.f37051a) + ", contentResolver=" + String.valueOf(this.f37052b) + ", photoInsertUri=" + String.valueOf(this.f37053c) + ", videoInsertUri=" + String.valueOf(this.f37054d) + ", displayNameColumnName=" + this.f37055e + ", mimeTypeColumnName=" + this.f37056f + VCYBIzY.ylbfsgrbvmGDiX + this.f37057g + ", isPendingTrue=" + this.f37058h + ", isPendingFalse=0, relativePathColumnName=" + this.f37059i + ", mediaTypeColumnName=" + this.f37060j + ", mediaTypeImage=" + this.f37061k + ", mediaTypeVideo=" + this.f37062l + "}";
    }
}
