package p000;

import android.content.Intent;
import android.net.Uri;
import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvj implements kvn, kvl {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f37356a;

    /* JADX INFO: renamed from: b */
    private final Object f37357b;

    /* JADX INFO: renamed from: c */
    private final Object f37358c;

    public kvj(lpe lpeVar, String str, int i, byte[] bArr, byte[] bArr2) {
        this.f37356a = i;
        this.f37358c = lpeVar;
        this.f37357b = str;
    }

    public kvj(lpe lpeVar, String str, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37356a = i;
        this.f37357b = lpeVar;
        this.f37358c = Uri.parse("https://google.com/search").buildUpon().appendQueryParameter("q", str).appendQueryParameter("tbm", "shop").appendQueryParameter("source", "google-camera").build();
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        switch (this.f37356a) {
            case 0:
                ((lpe) this.f37358c).m15812k(mo14930a());
                break;
            case 1:
                ((lpe) this.f37358c).m15812k(mo14930a());
                break;
            case 2:
                ((lpe) this.f37358c).m15812k(mo14930a());
                break;
            case 3:
                ((lpe) this.f37358c).m15812k(mo14930a());
                break;
            default:
                ((lpe) this.f37357b).m15812k(mo14930a());
                break;
        }
    }

    @Override // p000.kvl
    /* JADX INFO: renamed from: a */
    public final Intent mo14930a() {
        switch (this.f37356a) {
            case 0:
                return new Intent("android.intent.action.VIEW", Uri.parse("mailto:".concat(String.valueOf(this.f37357b))));
            case 1:
                return new Intent("android.intent.action.VIEW", Uri.fromParts("tel", (String) this.f37357b, ""));
            case 2:
                return new Intent("android.intent.action.VIEW", Uri.parse((String) this.f37357b));
            case 3:
                Intent intent = new Intent("android.intent.action.WEB_SEARCH");
                intent.putExtra(hiCTUJiAxf.iAmwawLwB, (String) this.f37357b);
                return intent;
            default:
                return new Intent("android.intent.action.VIEW", (Uri) this.f37358c);
        }
    }
}
