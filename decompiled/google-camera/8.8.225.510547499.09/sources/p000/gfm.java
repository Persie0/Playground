package p000;

import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfm {

    /* JADX INFO: renamed from: a */
    public final gfc f24584a;

    /* JADX INFO: renamed from: b */
    public final Drawable f24585b;

    /* JADX INFO: renamed from: c */
    public final String f24586c;

    /* JADX INFO: renamed from: d */
    public final String f24587d;

    public gfm(gfc gfcVar, Drawable drawable, String str, String str2) {
        if (gfcVar == null) {
            throw new NullPointerException("Null menuOption");
        }
        this.f24584a = gfcVar;
        if (drawable == null) {
            throw new NullPointerException(TVkaNXnfP.uMHS);
        }
        this.f24585b = drawable;
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.f24586c = str;
        if (str2 == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.f24587d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfm) {
            gfm gfmVar = (gfm) obj;
            if (this.f24584a.equals(gfmVar.f24584a) && this.f24585b.equals(gfmVar.f24585b) && this.f24586c.equals(gfmVar.f24586c) && this.f24587d.equals(gfmVar.f24587d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f24584a.hashCode() ^ 1000003) * 1000003) ^ this.f24585b.hashCode()) * 1000003) ^ this.f24586c.hashCode()) * 1000003) ^ this.f24587d.hashCode();
    }

    public final String toString() {
        return "ImmutableOptionSpec{menuOption=" + this.f24584a.toString() + ", drawable=" + this.f24585b.toString() + wUzNh.uBZ + this.f24586c + ", contentDescription=" + this.f24587d + "}";
    }

    public gfm() {
    }
}
