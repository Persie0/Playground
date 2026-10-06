package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsd {

    /* JADX INFO: renamed from: b */
    private final String f39123b;

    /* JADX INFO: renamed from: a */
    public String f39122a = "files";

    /* JADX INFO: renamed from: c */
    private String f39124c = "common";

    /* JADX INFO: renamed from: d */
    private final Account f39125d = lse.f39129b;

    /* JADX INFO: renamed from: e */
    private String f39126e = "";

    /* JADX INFO: renamed from: f */
    private final mwn f39127f = mws.m17090e();

    public lsd(Context context) {
        lij.m15448r(context != null, "Context cannot be null", new Object[0]);
        this.f39123b = context.getPackageName();
    }

    /* JADX INFO: renamed from: a */
    public final Uri m15939a() {
        String str;
        String str2 = this.f39122a;
        String str3 = this.f39124c;
        Account account = this.f39125d;
        Account account2 = lsb.f39117a;
        lij.m15448r(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        lij.m15448r(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        lij.m15448r(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (lsb.m15929a(account)) {
            str = "shared";
        } else {
            str = account.type + ":" + account.name;
        }
        return new Uri.Builder().scheme("android").authority(this.f39123b).path("/" + str2 + "/" + str3 + "/" + str + "/" + this.f39126e).encodedFragment(lsq.m15949a(this.f39127f.m17081f())).build();
    }

    /* JADX INFO: renamed from: b */
    public final void m15940b(String str) {
        lij.m15448r(lse.f39128a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        lij.m15448r(!lse.f39130c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f39124c = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m15941c(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = lse.f39128a;
        this.f39126e = str;
    }
}
