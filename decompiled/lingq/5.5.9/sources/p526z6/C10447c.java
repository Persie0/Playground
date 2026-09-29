package p526z6;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: z6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10447c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52295a;

    /* JADX INFO: renamed from: b */
    public final boolean f52296b;

    /* JADX INFO: renamed from: c */
    public final boolean f52297c;

    public /* synthetic */ C10447c(int i10, boolean z10, boolean z11) {
        this.f52295a = i10;
        this.f52296b = z10;
        this.f52297c = z11;
    }

    public final String toString() {
        switch (this.f52295a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return "NotificationInfo{fromCleverTap=" + this.f52296b + ", shouldRender=" + this.f52297c + '}';
            default:
                return super.toString();
        }
    }
}
