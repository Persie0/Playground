package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zk1 implements yk1, al1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71673a = 0;

    /* JADX INFO: renamed from: b */
    public ClipData f71674b;

    /* JADX INFO: renamed from: c */
    public int f71675c;

    /* JADX INFO: renamed from: d */
    public int f71676d;

    /* JADX INFO: renamed from: e */
    public Uri f71677e;

    /* JADX INFO: renamed from: f */
    public Bundle f71678f;

    public zk1(zk1 zk1Var) {
        ClipData clipData = zk1Var.f71674b;
        clipData.getClass();
        this.f71674b = clipData;
        int i = zk1Var.f71675c;
        if (i < 0) {
            Locale locale = Locale.US;
            C3386nv.m17626m("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C3386nv.m17626m("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f71675c = i;
        int i2 = zk1Var.f71676d;
        if ((i2 & 1) != i2) {
            v63.m23136n("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.f71676d = i2;
        this.f71677e = zk1Var.f71677e;
        this.f71678f = zk1Var.f71678f;
    }

    @Override // p000.yk1
    public bl1 build() {
        return new bl1(new zk1(this));
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: c */
    public int mo534c() {
        return this.f71675c;
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: d */
    public ClipData mo535d() {
        return this.f71674b;
    }

    @Override // p000.yk1
    /* JADX INFO: renamed from: f */
    public void mo23877f(Uri uri) {
        this.f71677e = uri;
    }

    @Override // p000.yk1
    /* JADX INFO: renamed from: h */
    public void mo23878h(int i) {
        this.f71676d = i;
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: j */
    public int mo536j() {
        return this.f71676d;
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: m */
    public ContentInfo mo537m() {
        return null;
    }

    @Override // p000.yk1
    public void setExtras(Bundle bundle) {
        this.f71678f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f71673a) {
            case 1:
                Uri uri = this.f71677e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f71674b.getDescription());
                sb.append(", source=");
                int i = this.f71675c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f71676d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC3393o1.m17738m(sb, this.f71678f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zk1() {
    }
}
