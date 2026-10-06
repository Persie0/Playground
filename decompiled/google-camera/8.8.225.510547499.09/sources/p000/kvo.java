package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Telephony;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvo implements kvn, kvl {

    /* JADX INFO: renamed from: a */
    private final Context f37365a;

    /* JADX INFO: renamed from: b */
    private final String f37366b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37367c;

    /* JADX INFO: renamed from: d */
    private final Object f37368d;

    /* JADX INFO: renamed from: e */
    private final lpe f37369e;

    public kvo(lpe lpeVar, Context context, String str, Locale locale, int i, byte[] bArr, byte[] bArr2) {
        this.f37367c = i;
        this.f37369e = lpeVar;
        this.f37365a = context;
        this.f37366b = str;
        this.f37368d = locale;
    }

    public kvo(lpe lpeVar, Context context, mrm mrmVar, int i, byte[] bArr, byte[] bArr2) {
        this.f37367c = i;
        this.f37369e = lpeVar;
        this.f37365a = context;
        this.f37366b = ((kxg) mrmVar.mo16811e(kxg.f37633c)).f37636b;
        this.f37368d = ((kxg) mrmVar.mo16811e(kxg.f37633c)).f37635a;
    }

    /* JADX INFO: renamed from: c */
    private final Intent m14934c() {
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.f37365a);
        Intent intent = new Intent();
        if (mro.m16832b(defaultSmsPackage)) {
            intent.setPackage("com.android.sms");
        } else {
            intent.setPackage(defaultSmsPackage);
        }
        intent.setAction("android.intent.action.SEND");
        if (!mro.m16832b((String) this.f37368d) && !mro.m16832b(this.f37366b)) {
            intent.putExtra("address", this.f37366b);
            intent.putExtra("sms_body", (String) this.f37368d);
        }
        intent.setType("text/plain");
        return intent;
    }

    @Override // p000.kvl
    /* JADX INFO: renamed from: a */
    public final Intent mo14930a() {
        String str = BcwGDRhrTsnlj.mPUHoHYTrl;
        switch (this.f37367c) {
            case 0:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                try {
                    this.f37365a.getPackageManager().getPackageInfo(str, 1);
                    intent.setPackage(str);
                } catch (PackageManager.NameNotFoundException e) {
                }
                intent.setData(new Uri.Builder().scheme("https").authority("translate.google.com").path("/m/translate").appendQueryParameter("q", this.f37366b).appendQueryParameter("tl", ((Locale) this.f37368d).getLanguage()).build());
                return intent;
            default:
                return m14934c();
        }
    }

    @Override // p000.kvn
    /* JADX INFO: renamed from: b */
    public final void mo14931b() {
        switch (this.f37367c) {
            case 0:
                this.f37369e.m15812k(mo14930a());
                break;
            default:
                this.f37369e.m15812k(m14934c());
                break;
        }
    }
}
