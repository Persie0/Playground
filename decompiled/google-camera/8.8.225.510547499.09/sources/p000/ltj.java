package p000;

import android.net.Uri;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltj {

    /* JADX INFO: renamed from: a */
    public final Uri f39165a;

    /* JADX INFO: renamed from: b */
    public final nyw f39166b;

    /* JADX INFO: renamed from: c */
    public final ltd f39167c;

    /* JADX INFO: renamed from: d */
    public final mws f39168d;

    /* JADX INFO: renamed from: e */
    public final boolean f39169e;

    /* JADX INFO: renamed from: f */
    public final lku f39170f;

    public ltj() {
    }

    public ltj(Uri uri, nyw nywVar, ltd ltdVar, mws mwsVar, lku lkuVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f39165a = uri;
        this.f39166b = nywVar;
        this.f39167c = ltdVar;
        this.f39168d = mwsVar;
        this.f39170f = lkuVar;
        this.f39169e = z;
    }

    /* JADX INFO: renamed from: a */
    public static lti m15971a() {
        lti ltiVar = new lti();
        ltiVar.f39160c = ltk.f39171b;
        ltiVar.m15968c(lts.f39197a);
        ltiVar.m15967b();
        ltiVar.f39158a = true;
        ltiVar.f39159b = (byte) (1 | ltiVar.f39159b);
        return ltiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltj) {
            ltj ltjVar = (ltj) obj;
            if (this.f39165a.equals(ltjVar.f39165a) && this.f39166b.equals(ltjVar.f39166b) && this.f39167c.equals(ltjVar.f39167c) && mkv.m16505M(this.f39168d, ltjVar.f39168d) && this.f39170f.equals(ltjVar.f39170f) && this.f39169e == ltjVar.f39169e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f39165a.hashCode() ^ 1000003) * 1000003) ^ this.f39166b.hashCode()) * 1000003) ^ this.f39167c.hashCode()) * 1000003) ^ this.f39168d.hashCode()) * 1000003) ^ this.f39170f.hashCode()) * 1000003) ^ (true != this.f39169e ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.f39165a) + ", schema=" + String.valueOf(this.f39166b) + ", handler=" + String.valueOf(this.f39167c) + yTyWiTtGtnBhy.mqENlTepbBx + String.valueOf(this.f39168d) + ", variantConfig=" + String.valueOf(this.f39170f) + ", useGeneratedExtensionRegistry=" + this.f39169e + TVkaNXnfP.ELkbocYTd;
    }
}
