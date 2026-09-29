package cc;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p003a2.C0009a;

/* JADX INFO: renamed from: cc.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1883n extends AbstractC1772a5 {

    /* JADX INFO: renamed from: c */
    public long f10018c;

    /* JADX INFO: renamed from: d */
    public String f10019d;

    /* JADX INFO: renamed from: e */
    public AccountManager f10020e;

    /* JADX INFO: renamed from: f */
    public Boolean f10021f;

    /* JADX INFO: renamed from: g */
    public long f10022g;

    public C1883n(C1897o4 c1897o4) {
        super(c1897o4);
    }

    @Override // cc.AbstractC1772a5
    /* JADX INFO: renamed from: h */
    public final boolean mo5491h() {
        Calendar calendar = Calendar.getInstance();
        this.f10018c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f10019d = C0009a.m21i(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final long m5770l() {
        mo5748g();
        return this.f10022g;
    }

    /* JADX INFO: renamed from: m */
    public final long m5771m() {
        m5492j();
        return this.f10018c;
    }

    /* JADX INFO: renamed from: n */
    public final String m5772n() {
        m5492j();
        return this.f10019d;
    }
}
