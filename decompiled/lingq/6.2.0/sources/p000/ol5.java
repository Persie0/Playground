package p000;

import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ol5 implements ul5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0868b f54534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f54535c;

    public /* synthetic */ ol5(C0868b c0868b, String str, int i) {
        this.f54533a = i;
        this.f54534b = c0868b;
        this.f54535c = str;
    }

    @Override // p000.ul5
    public final void run() {
        int i = this.f54533a;
        String str = this.f54535c;
        C0868b c0868b = this.f54534b;
        switch (i) {
            case 0:
                c0868b.m4989C(str);
                break;
            case 1:
                c0868b.m4988B(str);
                break;
            default:
                c0868b.m4991E(str);
                break;
        }
    }
}
